package com.mobile.auth.gatewayauth.model.psc_info_upload;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AllRBInfo implements pxf {
    private static final String KEY_RESPONSE = "alibaba_aliqin_pns_vendor_querylist_response";
    private static final String KEY_TOP_ERROR_RESPONSE = "error_response";
    private TopErrorResponse errorResponse;
    private PnsVendorQueryResponse response;

    public static AllRBInfo fromJson(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return (AllRBInfo) wrf.b(new JSONObject(str), new swf<AllRBInfo>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo.1
                    }, null);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
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

    public PnsVendorQueryResponse getResponse() {
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

    public void setResponse(PnsVendorQueryResponse pnsVendorQueryResponse) {
        try {
            this.response = pnsVendorQueryResponse;
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
                PnsVendorQueryResponse pnsVendorQueryResponse = this.response;
                if (pnsVendorQueryResponse == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = pnsVendorQueryResponse.toJson();
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

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                setResponse((PnsVendorQueryResponse) wrf.b(jSONObject.optJSONObject(KEY_RESPONSE), new swf<PnsVendorQueryResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo.2
                }, null));
                setErrorResponse((TopErrorResponse) wrf.b(jSONObject.optJSONObject(KEY_TOP_ERROR_RESPONSE), new swf<TopErrorResponse>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo.3
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
}
