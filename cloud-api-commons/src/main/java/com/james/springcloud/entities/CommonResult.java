package com.james.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 13 16:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    /**
     * 部分参数构造方法
     * @param code
     * @param message
     */
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
