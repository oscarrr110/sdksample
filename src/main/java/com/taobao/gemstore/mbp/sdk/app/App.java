package com.taobao.gemstore.mbp.sdk.app;

import com.taobao.gemstore.mbp.sdk.app.AppResult;
import java.util.Map;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: tuhu
 * Date: 13-6-29
 * Time: ����3:35
 * To change this template use File | Settings | File Templates.
 */
public interface App {

    /**
     * ����SDKģ��
     *
     * @param props ����Ӧ�õĳ��������б�
     * @return
     */
    AppResult createApp(Map<String,String> props);

    /**
     * ����ָ��APP����ʾ������Ϣ
     *
     * @param appName Ӧ������
     * @return
     */
    AppResult showApp(String appName);

    /**
     *  ����ָ���û���app�б�
     *
     * @return ����ָ���û���app�б�
     */
    AppResult ListApps();

    /**
     *  �ϴ�Ӧ�ó����ļ�
     *
     * @param
     * @return
     */
    AppResult upload(String appName, File f);


     /**
     *  ɾ��ָ����Ӧ�ó���
     * @param appName Ӧ�ó�������
     * @return
     */
    AppResult delApp(String appName);
}
