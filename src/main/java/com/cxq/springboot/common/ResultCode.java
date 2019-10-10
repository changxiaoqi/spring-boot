package com.cxq.springboot.common;

/**
 * 响应码枚举，参考HTTP状态码的语义
 * <p/>
 * 说明：参数、返回使用6起始段，业务相关使用7起始段
 *
 * @author 李恒名
 * @updator 李国勇
 */
public enum ResultCode {
    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    SERVER_ERROR(500),//服务器内部错误
    DATA_BLANK(606),// 空数据
    PARAM_ERROR(609);//参数错误

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
