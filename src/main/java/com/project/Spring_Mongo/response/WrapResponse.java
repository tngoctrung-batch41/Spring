package com.project.Spring_Mongo.response;

import com.project.Spring_Mongo.common.WrapResponseStatus;
import lombok.Data;

@Data
public class WrapResponse<T> {
    private Integer code;
    private String messageError;
    private T data;

    public static <T> WrapResponse ok(T data){
        WrapResponse res = new WrapResponse();
        res.setCode(WrapResponseStatus.SUCCESS);
        res.setData(data);
        res.setMessageError("");
    return res;
    }

    public static <T> WrapResponse error(Integer code, String messageError){
        WrapResponse res = new WrapResponse();
        res.setCode(code);
        res.setMessageError(messageError);
        res.setData(null);
        return res;
    }
}
