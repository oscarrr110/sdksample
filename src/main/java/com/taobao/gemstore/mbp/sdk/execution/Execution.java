package com.taobao.gemstore.mbp.sdk.execution;

/**
 * Created with IntelliJ IDEA.
 * User: tuhu
 * Date: 13-6-29
 * Time: 下午5:54
 * To change this template use File | Settings | File Templates.
 */
public interface Execution {

    /**
     * 程序打包，在调试之前执行
     *
     * @param appName
     * @return
     */
    ExecutionResult pack(String appName);

    /**
     * 指定appName,调试任务
     *
     * @param appName 应用程序名
     * @return
     */
    ExecutionResult debug(String appName);
}
