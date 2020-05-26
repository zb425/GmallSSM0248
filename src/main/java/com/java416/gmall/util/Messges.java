package com.java416.gmall.util;

public class Messges<T> {
    private String message;
    private int status;
    private T data;
    private Messges(T data) {
        this.status = 200;
        this.message = "成功";
        this.data = data;
    }

    private Messges(String str){
        this.status=100;
        this.message=str;
    }
    /**
     * 成功时候的调用
     * @return
     */
    public static <T> Messges<T> success(T data){
        return new Messges<T>(data);
    }
    /**
     * 成功，不需要传入参数
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> Messges<T> success(){
        return (Messges<T>) success("");
    }
    /**
     * 失败时候的调用
     * @return
     */
    public static <T> Messges<T> error(){
        return new Messges<T>("error");
    }

    public T getData() {
        return data;
    }
    public String getMessage() {
        return message;
    }
    public int getStatus() {
        return status;
    }

}
