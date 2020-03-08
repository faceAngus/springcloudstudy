package com.angus.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author angus
 * @create 2020-03-07 15:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String message;
	private T date;
	public CommonResult(Integer code, String message){
		this(code, message, null);
	}
}
