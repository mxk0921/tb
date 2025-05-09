package com.huawei.hms.common.internal;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ResponseWrap {

    /* renamed from: a  reason: collision with root package name */
    private String f5323a;
    private ResponseHeader b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.b.setPkgName(JsonUtil.getStringValue(jSONObject, "pkg_name"));
            this.b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.b.setTransactionId(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID));
            this.b.setResolution(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.HAS_RESOLUTION));
            this.f5323a = JsonUtil.getStringValue(jSONObject, AgooConstants.MESSAGE_BODY);
            return true;
        } catch (JSONException e) {
            HMSLog.e("ResponseWrap", "fromJson failed: " + e.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f5323a)) {
            this.f5323a = new JSONObject().toString();
        }
        return this.f5323a;
    }

    public ResponseHeader getResponseHeader() {
        return this.b;
    }

    public void setBody(String str) {
        this.f5323a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.b = responseHeader;
    }

    public String toJson() {
        if (this.b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.b.getStatusCode());
            jSONObject.put("error_code", this.b.getErrorCode());
            jSONObject.put("error_reason", this.b.getErrorReason());
            jSONObject.put("srv_name", this.b.getSrvName());
            jSONObject.put("api_name", this.b.getApiName());
            jSONObject.put("app_id", this.b.getAppID());
            jSONObject.put("pkg_name", this.b.getPkgName());
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.b.getTransactionId());
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, this.b.getResolution());
            String sessionId = this.b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f5323a)) {
                jSONObject.put(AgooConstants.MESSAGE_BODY, this.f5323a);
            }
        } catch (JSONException e) {
            HMSLog.e("ResponseWrap", "toJson failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f5323a + "', responseHeader=" + this.b + '}';
    }
}
