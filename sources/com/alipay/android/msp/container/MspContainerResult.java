package com.alipay.android.msp.container;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspContainerResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_FAIL = "100";
    public static final String BIZ_TYPE_EMPTY = "101";
    public static final String CONTEXT_NULL = "104";
    public static final String DUP_CONTAINER = "400";
    public static final String OP_TYPE_FETCH_FAIL = "102";
    public static final String PAGE_DATA_EMPTY = "103";
    public static final String REND_SUCCESS = "0";

    /* renamed from: a  reason: collision with root package name */
    public String f3538a = "100";
    public String b = "";

    public String getBizResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("562582df", new Object[]{this});
        }
        return this.b;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.f3538a;
    }

    public void setBizResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c894df", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.f3538a = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", (Object) this.f3538a);
        jSONObject.put("result", (Object) this.b);
        return jSONObject.toString();
    }
}
