package com.taobao.gemstore.mbp.sdk.execution;

/**
 * Created with IntelliJ IDEA.
 * User: tuhu
 * Date: 13-6-29
 * Time: ����5:54
 * To change this template use File | Settings | File Templates.
 */
public interface Execution {

    /**
     * ���������ڵ���֮ǰִ��
     *
     * @param appName
     * @return
     */
    ExecutionResult pack(String appName);

    /**
     * ָ��appName,��������
     *
     * @param appName Ӧ�ó�����
     * @return
     */
    ExecutionResult debug(String appName);
}
