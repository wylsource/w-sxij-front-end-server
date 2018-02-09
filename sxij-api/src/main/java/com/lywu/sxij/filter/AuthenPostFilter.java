package com.lywu.sxij.filter;

import com.lywu.sxij.result.ObjectResult;
import com.lywu.sxij.utils.GsonUtil;
import com.lywu.sxij.utils.StringUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * @Author: WuYL
 * @Description: 请求处理之后调用
 * @Date: Create in 2018/2/4 21:59
 * @Modified By:
 */
public class AuthenPostFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 2;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        HttpServletResponse response = currentContext.getResponse();
        String method = request.getMethod();
        try {
            if ("options".equalsIgnoreCase(method)){

//                Access-Control-Allow-Credentials:true
//                Access-Control-Allow-Headers:content-type
//                Access-Control-Allow-Methods:POST
//                Access-Control-Allow-Origin:http://localhost:6868
//                Allow:GET, HEAD, POST, PUT, DELETE, OPTIONS, PATCH
//                Content-Length:0
//                Date:Fri, 09 Feb 2018 03:50:22 GMT
//                Vary:Origin
//                X-Application-Context:sxij-web:dev:7900

//                response.setHeader("Access-Control-Allow-Credentials","true");
//                response.setHeader("Access-Control-Allow-Methods", "POST");
                response.setHeader("Access-Control-Allow-Headers", "content-type");
//                response.setHeader("Content-Length", "0");
//                response.setHeader("Vary", "Origin");
                response.addHeader("Access-Control-Allow-Origin", "*");
                response.setStatus(HttpStatus.OK.value());
                currentContext.setResponse(response);
                return false;
            } else {
                InputStream dataStream = currentContext.getResponseDataStream();
                String bodyData = StreamUtils.copyToString(dataStream, Charset.forName("UTF-8"));
                if (StringUtil.isNotEmpty(bodyData)){
                    ObjectResult result = GsonUtil.fromJson(bodyData, ObjectResult.class);
                    if (result.getCode() == 20000){
                        response.addHeader("Access-Control-Allow-Origin", "*");
                        currentContext.setResponse(response);
                    }
                }
            }
        } catch (Exception e) {

        } finally {

        }

        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
