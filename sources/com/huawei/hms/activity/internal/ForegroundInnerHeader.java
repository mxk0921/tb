package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ForegroundInnerHeader {

    /* renamed from: a  reason: collision with root package name */
    private int f5243a;
    private String b;
    private String c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5243a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.b = JsonUtil.getStringValue(jSONObject, "action");
            this.c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e) {
            HMSLog.e("ForegroundInnerHeader", "fromJson failed: " + e.getMessage());
        }
    }

    public String getAction() {
        return this.b;
    }

    public int getApkVersion() {
        return this.f5243a;
    }

    public String getResponseCallbackKey() {
        return this.c;
    }

    public void setAction(String str) {
        this.b = str;
    }

    public void setApkVersion(int i) {
        this.f5243a = i;
    }

    public void setResponseCallbackKey(String str) {
        this.c = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f5243a);
            jSONObject.put("action", this.b);
            jSONObject.put("responseCallbackKey", this.c);
        } catch (JSONException e) {
            HMSLog.e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f5243a + ", action:" + this.b + ", responseCallbackKey:" + this.c;
    }
}
