package com.lywu.sxij.filter;

import com.lywu.sxij.utils.StringUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: WuYL
 * @Description: 用于认证的过滤器
 * @Date: Create in 2018/2/4 21:19
 * @Modified By:
 */
public class AuthenPreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String method = request.getMethod();
        System.out.println(method);
        if ("options".equalsIgnoreCase(method)){
            return false;
        }
        String token = request.getHeader("W-Token");
        if (StringUtil.isEmpty(token)){
            return true;
        }
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
