package com.lywu.sxij.utils;


import com.lywu.sxij.enums.ResultState;
import com.lywu.sxij.result.ListResult;
import com.lywu.sxij.result.ObjectResult;
import com.lywu.sxij.result.Result;

import java.util.List;

/**
 * @Author: WuYL
 * @Description: 结果集封装工具类
 * @Date: Create in 2017/11/5 21:58
 * @Modified By:
 */
public class ResultUtil {

    public static ListResult success(List objects) {
        ListResult result = new ListResult();
        result.setCode(ResultState.RESULT_SUCCESS.getCode());
        result.setMsg(ResultState.RESULT_SUCCESS.getMessage());
        result.setResult(objects);
        result.setCount(objects.size());
        return result;
    }

    public static Result error(Integer code, String msg) {
        ObjectResult result = new ObjectResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setResult(null);
        return result;
    }

    public static Result error() {
        return error(ResultState.RESULT_ERROR.getCode(), ResultState.RESULT_ERROR.getMessage());
    }

    public static ObjectResult success(Object object) {
        ObjectResult result = new ObjectResult();
        result.setCode(ResultState.RESULT_SUCCESS.getCode());
        result.setMsg(ResultState.RESULT_SUCCESS.getMessage());
        result.setResult(object);
        return result;
    }

    public static ObjectResult success(){
        return success(new Object());
    }
}
