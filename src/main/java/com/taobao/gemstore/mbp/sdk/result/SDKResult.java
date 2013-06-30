package com.taobao.gemstore.mbp.sdk.result;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13-6-29
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */
public class SDKResult implements Serializable {


    private static final long serialVersionUID = -4018984677071085223L;

    private boolean success = true; //是否执行成功

    private Integer resultCode;

    private String resultMsg;

    public SDKResult() {
    }

    public SDKResult(boolean result) {
        this.success = result;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer r) {
        this.resultCode = r;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
