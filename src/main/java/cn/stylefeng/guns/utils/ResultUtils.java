package cn.stylefeng.guns.utils;

import cn.stylefeng.guns.modular.system.model.Result;

/**
 * @author : kylin
 * @version V1.0
 * @Package cn.stylefeng.guns.utils
 * @Description:
 * @date Date : 2019年02月14日 16:56
 */

public class ResultUtils {

    public static Result success(Object obj){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("success:200");
        result.setData(obj);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
