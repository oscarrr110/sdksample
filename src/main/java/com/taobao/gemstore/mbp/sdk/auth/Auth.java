package com.taobao.gemstore.mbp.sdk.auth;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13-6-29
 * Time: ����5:26
 * To change this template use File | Settings | File Templates.
 */
public interface Auth {

    /**
     *
     * �û���¼
     *
     * @param name �Ա��û���
     * @param password ����
     */
    AuthResult login(String name, String password);


}
