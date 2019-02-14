package cn.stylefeng.guns.exception;

import cn.stylefeng.guns.enums.ResultEnum;

public class customException extends RuntimeException {

    private Integer code;

    public customException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
