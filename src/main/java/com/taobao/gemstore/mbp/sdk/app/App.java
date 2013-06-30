package com.taobao.gemstore.mbp.sdk.app;

import com.taobao.gemstore.mbp.sdk.app.AppResult;
import java.util.Map;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: tuhu
 * Date: 13-6-29
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 */
public interface App {

    /**
     * 创建SDK模板
     *
     * @param props 创建应用的程序配置列表
     * @return
     */
    AppResult createApp(Map<String,String> props);

    /**
     * 根据指定APP，显示基本信息
     *
     * @param appName 应用名称
     * @return
     */
    AppResult showApp(String appName);

    /**
     *  返回指定用户的app列表
     *
     * @return 返回指定用户的app列表
     */
    AppResult ListApps();

    /**
     *  上传应用程序文件
     *
     * @param
     * @return
     */
    AppResult upload(String appName, File f);


     /**
     *  删除指定的应用程序
     * @param appName 应用程序名称
     * @return
     */
    AppResult delApp(String appName);
}
