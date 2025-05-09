package com.mobile.auth.gatewayauth.model.psc_certify_id;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.JsonerTag;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GetCertifyIdTopResponse implements pxf {
    @JsonerTag(keyName = "request_id")
    private String requestId;
    @JsonerTag(keyName = "result")
    private GetCertifyIdResult result;

    public String getRequestId() {
        try {
            return this.requestId;
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

    public GetCertifyIdResult getResult() {
        try {
            return this.result;
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

    public void setRequestId(String str) {
        try {
            this.requestId = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResult(GetCertifyIdResult getCertifyIdResult) {
        try {
            this.result = getCertifyIdResult;
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
            JSONObject jSONObject2 = new JSONObject();
            try {
                GetCertifyIdResult getCertifyIdResult = this.result;
                if (getCertifyIdResult == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = getCertifyIdResult.toJson();
                }
                jSONObject2.put("result", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject2;
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

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            wrf.a(jSONObject, this, null);
            if (jSONObject != null) {
                setResult((GetCertifyIdResult) wrf.b(jSONObject.optJSONObject("result"), new swf<GetCertifyIdResult>() { // from class: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdTopResponse.1
                }, null));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
