package edu.whpu.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseData<T> {

    private T data;

    private String message;

    private Integer code;

    public ResponseData(T data, String message, Integer code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public void success(T data) {
        this.data = data;
        this.code = 200;
        this.message = "success";
    }
}
