package cn.stylefeng.guns.modular.system.model;

/**
 * http请求返回时最外层的对象
 * @param <T>
 */
public class Result<T> {

//    返回信息
    private String message;

    //返回码
    private Integer code;

    //返回数据
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
