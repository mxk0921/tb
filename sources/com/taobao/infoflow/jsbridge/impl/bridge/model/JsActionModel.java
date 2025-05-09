package com.taobao.infoflow.jsbridge.impl.bridge.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class JsActionModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JsActionModel";
    private String mAction;
    private String mBusinessId;
    private String mMethod;
    private JSONObject mParam;

    static {
        t2o.a(490733589);
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
        }
        return this.mAction;
    }

    public String getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        return this.mBusinessId;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.mMethod;
    }

    public JSONObject getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed69b2fe", new Object[]{this});
        }
        return this.mParam;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mBusinessId)) {
            fve.e(TAG, "businessId 为空，不符合协议约定");
            return false;
        } else if (!TextUtils.isEmpty(this.mAction)) {
            return true;
        } else {
            fve.e(TAG, "action 为空，不符合协议约定");
            return false;
        }
    }

    public void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.mAction = str;
        }
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
        } else {
            this.mBusinessId = str;
        }
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.mMethod = str;
        }
    }

    public void setParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d4cde", new Object[]{this, jSONObject});
        } else {
            this.mParam = jSONObject;
        }
    }
}
