package com.taobao.gemstore.mbp.sdk.app;

import com.taobao.gemstore.mbp.sdk.result.SDKResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tuhu
 * Date: 13-6-29
 * Time: ����4:24
 * To change this template use File | Settings | File Templates.
 */
public class AppResult extends SDKResult {

    /**
     *  Ӧ�ó����б�
     */
    private List<String> apps;

    /**
     *  �������ִ�еĽ�������ظ�skd client
     */
    private String exeLog;

    public String getExeLog() {
        return exeLog;
    }

    public void setExeLog(String exeLog) {
        this.exeLog = exeLog;
    }

    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }
}
