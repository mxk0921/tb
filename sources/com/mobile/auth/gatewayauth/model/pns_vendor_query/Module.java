package com.mobile.auth.gatewayauth.model.pns_vendor_query;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Module implements pxf {
    private LimitedInfo limited_info;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            wrf.a(jSONObject, this, null);
            LimitedInfo limitedInfo = new LimitedInfo();
            if (jSONObject != null) {
                limitedInfo.fromJson(jSONObject.optJSONObject("limited_info"));
            }
            setLimited_info(limitedInfo);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public LimitedInfo getLimited_info() {
        try {
            return this.limited_info;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void setLimited_info(LimitedInfo limitedInfo) {
        try {
            this.limited_info = limitedInfo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // tb.pxf
    public JSONObject toJson() {
        JSONObject jSONObject;
        try {
            JSONObject n = wrf.n(this, null);
            try {
                LimitedInfo limitedInfo = this.limited_info;
                if (limitedInfo == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = limitedInfo.toJson();
                }
                n.put("limited_info", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return n;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
