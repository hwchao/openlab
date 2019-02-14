package cn.stylefeng.guns.hander;

import cn.stylefeng.guns.exception.customException;
import cn.stylefeng.guns.modular.system.model.Result;
import cn.stylefeng.guns.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.beans.Customizer;


/**
 * @author : kylin
 * @version V1.0
 * @Package cn.stylefeng.guns.hander
 * @Description:
 * @date Date : 2019年02月14日 17:01
 */

@ControllerAdvice
public class exceptionHander {

    private static final Logger logger = LoggerFactory.getLogger(exceptionHander.class);

    public Result handle(Exception e){
        if (e instanceof customException){
            customException ex = (customException) e;
            return ResultUtils.error(ex.getCode(),ex.getMessage());
        }else{
            logger.error("[系统异常{}]",e);
            return ResultUtils.error(-1,"未知错误");
        }
    }
}
