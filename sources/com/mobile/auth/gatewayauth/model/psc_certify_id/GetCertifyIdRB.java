package com.mobile.auth.gatewayauth.model.psc_certify_id;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.nirvana.tools.jsoner.JsonerTag;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GetCertifyIdRB implements pxf {
    private static final String KEY_RESPONSE = "alibaba_aliqin_ta_pns_living_create_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    @JsonerTag(keyName = KEY_TOP_ERROR_RESPONSE)
    private TopErrorResponse errorResponse;
    @JsonerTag(keyName = KEY_RESPONSE)
    private GetCertifyIdTopResponse response;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                setResponse((GetCertifyIdTopResponse) wrf.b(jSONObject.optJSONObject(KEY_RESPONSE), new swf<GetCertifyIdTopResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdRB.1
                }, null));
                setErrorResponse((TopErrorResponse) wrf.b(jSONObject.optJSONObject(KEY_TOP_ERROR_RESPONSE), new swf<TopErrorResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdRB.2
                }, null));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public TopErrorResponse getErrorResponse() {
        try {
            return this.errorResponse;
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

    public GetCertifyIdTopResponse getResponse() {
        try {
            return this.response;
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

    public void setErrorResponse(TopErrorResponse topErrorResponse) {
        try {
            this.errorResponse = topErrorResponse;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResponse(GetCertifyIdTopResponse getCertifyIdTopResponse) {
        try {
            this.response = getCertifyIdTopResponse;
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
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                GetCertifyIdTopResponse getCertifyIdTopResponse = this.response;
                if (getCertifyIdTopResponse == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = getCertifyIdTopResponse.toJson();
                }
                jSONObject3.put(KEY_RESPONSE, jSONObject);
                TopErrorResponse topErrorResponse = this.errorResponse;
                if (topErrorResponse == null) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = topErrorResponse.toJson();
                }
                jSONObject3.put(KEY_TOP_ERROR_RESPONSE, jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject3;
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
