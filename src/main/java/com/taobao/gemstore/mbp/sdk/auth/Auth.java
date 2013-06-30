package com.taobao.gemstore.mbp.sdk.auth;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13-6-29
 * Time: 下午5:26
 * To change this template use File | Settings | File Templates.
 */
public interface Auth {

    /**
     *
     * 用户登录
     *
     * @param name 淘宝用户名
     * @param password 密码
     */
    AuthResult login(String name, String password);


}
