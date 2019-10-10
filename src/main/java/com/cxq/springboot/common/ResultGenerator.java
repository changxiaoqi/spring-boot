package com.cxq.springboot.common;

/**
 * Created by 李恒名 on 2017/6/13.
 * 响应结果生成工具
 */
public class ResultGenerator {

    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    /**
     * 请求成功，返回成功标记
     *
     * @return
     */
    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 请求成功，返回业务数据
     *
     * @param data 业务数据
     * @return
     */
    public static Result genSuccessResult(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    /**
     * 请求失败，返回异常信息
     *
     * @param message 异常信息
     * @return
     */
    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }

    /**
     * 用户自定义请求，返回带文本信息的结果
     *
     * @param resultCode
     * @param message
     * @return
     */
    public static Result genCustomResult(ResultCode resultCode, String message) {
        return new Result()
                .setCode(resultCode.code)
                .setMessage(message);
    }

    /**
     * 用户自定义请求，返回指定信息
     *
     * @param resultCode
     * @param message
     * @param data
     * @return
     */
    public static Result genCustomResult(int resultCode, String message, Object data) {
        return new Result()
                .setCode(resultCode)
                .setMessage(message)
                .setData(data);
    }

}
