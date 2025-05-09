package com.taobao.login4android.qrcode.result;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Result implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_API_LIMIT = -103;
    public static final int ERROR_CANCEL = -105;
    public static final int ERROR_NO_NETWORK = -102;
    public static final int ERROR_PARAM_INVALID = -104;
    public static final int ERROR_UNKNOWN = -101;
    public static final String MSG_ERROR_API_LIMIT = "被挤爆了，请稍候再试";
    public static final String MSG_ERROR_PARAM_INVALID = "参数错误";
    public static final String MSG_ERROR_UNKNOWN = "系统开小差，请重试";
    public static final String MSG_NO_NETWORK = "网络开小差，请稍后再试";
    public static final String MSG_SCAN_SUCCESS = "SCAN_Success";
    public static final String MSG_SUCCESS = "Success";
    public static final int SCANED = 14031;
    public static final int SUCCESS = 3000;
    private String mActionType;
    private LoginReturnData mLoginData;
    public SparseArray<String> mMsgMap;
    private int mResultCode = -101;
    private String mResultMsg;
    private String mUrl;

    static {
        t2o.a(70254977);
    }

    public Result() {
        SparseArray<String> sparseArray = new SparseArray<>();
        this.mMsgMap = sparseArray;
        sparseArray.put(3000, MSG_SUCCESS);
        this.mMsgMap.put(SCANED, MSG_SCAN_SUCCESS);
        this.mMsgMap.put(-102, MSG_NO_NETWORK);
        this.mMsgMap.put(-101, MSG_ERROR_UNKNOWN);
        this.mMsgMap.put(-103, MSG_ERROR_API_LIMIT);
        this.mMsgMap.put(-104, "参数错误");
    }

    public String getActionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65717033", new Object[]{this});
        }
        return this.mActionType;
    }

    public LoginReturnData getLoginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginReturnData) ipChange.ipc$dispatch("5458dd10", new Object[]{this});
        }
        return this.mLoginData;
    }

    public int getResultCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue();
        }
        return this.mResultCode;
    }

    public String getResultMsg() {
        SparseArray<String> sparseArray;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f82b84b", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mResultMsg)) {
            return this.mResultMsg;
        }
        if (this.mMsgMap.get(this.mResultCode) != null) {
            sparseArray = this.mMsgMap;
            i = this.mResultCode;
        } else {
            sparseArray = this.mMsgMap;
            i = -101;
        }
        return sparseArray.get(i);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.mUrl;
    }

    public void setActionType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa61da3", new Object[]{this, str});
        } else {
            this.mActionType = str;
        }
    }

    public void setLoginData(LoginReturnData loginReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a19a4e4", new Object[]{this, loginReturnData});
        } else {
            this.mLoginData = loginReturnData;
        }
    }

    public void setResultCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ad1130", new Object[]{this, new Integer(i)});
        } else {
            this.mResultCode = i;
        }
    }

    public void setResultMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13120cf3", new Object[]{this, str});
        } else {
            this.mResultMsg = str;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.mUrl = str;
        }
    }
}
