package com.taobao.gemstore.mbp.sdk.app;

import java.io.File;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: tuhu
 * Date: 13-6-29
 * Time: 下午3:29
 * To change this template use File | Settings | File Templates.
 */
public class SDKAppDummy implements  App {

    @Override
    public AppResult createApp(Map<String,String> props) {
        return null;
    }
    @Override
    public AppResult showApp(String appName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public AppResult ListApps() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public AppResult upload(String appName,File f) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public AppResult delApp(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    /**
     * 校验上传应用，返回校验结果
     *
     * @param dir 上传应用路径
     * @return
     */
    private String validate(String dir) {
        return null;
    }

    /**
     * 版本控制，上传到tfs
     *
     * @param dir 上传的应用路径
     * @return
     */
    private  AppResult versionControl(String dir) {
        return null;
    }
}
