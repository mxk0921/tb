package com.mobile.auth.gatewayauth.model.pns_vendor_query;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UploadRB implements pxf {
    private PscInfoUploadResponse alibaba_aliqin_psc_info_upload_response;

    public static UploadRB fromJson(String str) {
        try {
            UploadRB uploadRB = new UploadRB();
            try {
                if (!TextUtils.isEmpty(str)) {
                    uploadRB.fromJson(new JSONObject(str));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return uploadRB;
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

    public PscInfoUploadResponse getAlibaba_aliqin_psc_info_upload_response() {
        try {
            return this.alibaba_aliqin_psc_info_upload_response;
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

    public void setAlibaba_aliqin_psc_info_upload_response(PscInfoUploadResponse pscInfoUploadResponse) {
        try {
            this.alibaba_aliqin_psc_info_upload_response = pscInfoUploadResponse;
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
                PscInfoUploadResponse pscInfoUploadResponse = this.alibaba_aliqin_psc_info_upload_response;
                if (pscInfoUploadResponse == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = pscInfoUploadResponse.toJson();
                }
                jSONObject2.putOpt("alibaba_aliqin_psc_info_upload_response", jSONObject);
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
            PscInfoUploadResponse pscInfoUploadResponse = new PscInfoUploadResponse();
            if (jSONObject != null) {
                pscInfoUploadResponse.fromJson(jSONObject.optJSONObject("alibaba_aliqin_psc_info_upload_response"));
            }
            setAlibaba_aliqin_psc_info_upload_response(pscInfoUploadResponse);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
