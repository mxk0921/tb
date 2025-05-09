package com.alipay.mobile.verifyidentity.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyIdentityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "1003";
    public static final String CANCEL_SUB_BY_ENGINE = "101";
    public static final String CANCEL_SUB_BY_USER_ON_BUTTON = "102";
    public static final String CANCEL_SUB_GET_PWD = "103";
    public static final String CANCEL_SUB_GET_PWD_ON_MSP = "105";
    public static final String CANCEL_SUB_VI_PAGE_CLOSE = "106";
    public static final String EXPIRED = "1004";
    public static final String FACE_SDK_ERR = "1006";
    public static final String FAIL = "1001";
    public static final String MODULE_EXCEPTION = "2002";
    public static final String OTHERS = "1002";
    public static final String RPC_EXCEPTION = "2003";
    public static final String SRC_CODE_KEY = "srcCode";
    public static final String SUB_CODE_KEY = "subCode";
    public static final String SUCCESS_SUB_ON_SILENT_CERT = "104";
    public static final String SUCESS = "1000";
    public static final String TASK_CANT_GO_ON = "2006";
    public static final String TASK_DUPLICATE = "2004";
    public static final String TASK_OVERLIMIT = "2005";
    public static final String TASK_TIMEOUT = "2001";
    public static final String TOKEN_EMPTY = "2000";

    /* renamed from: a  reason: collision with root package name */
    public String f4286a;
    public String b;
    public String c;
    public HashMap<String, Object> d;

    public VerifyIdentityResult(String str) {
        this.f4286a = str;
    }

    public String getBizResponseData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f517b5f1", new Object[]{this});
        }
        return this.c;
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.f4286a;
    }

    public HashMap<String, Object> getExtInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e0498ba3", new Object[]{this});
        }
        return this.d;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.b;
    }

    public void setBizResponseData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6806dd0d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.f4286a = str;
        }
    }

    public void setExtInfo(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6361d37f", new Object[]{this, hashMap});
        } else {
            this.d = hashMap;
        }
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public VerifyIdentityResult(String str, String str2) {
        this.f4286a = str;
        this.b = str2;
    }

    public VerifyIdentityResult(String str, String str2, HashMap<String, Object> hashMap) {
        this.f4286a = str;
        this.b = str2;
        this.d = hashMap;
    }
}
