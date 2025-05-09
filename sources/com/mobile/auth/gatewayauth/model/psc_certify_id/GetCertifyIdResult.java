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
public class GetCertifyIdResult implements pxf {
    @JsonerTag(keyName = "code")
    private String code;
    @JsonerTag(keyName = "message")
    private String message;
    @JsonerTag(keyName = "module")
    private GetCertifyIdTopData module;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            wrf.a(jSONObject, this, null);
            if (jSONObject != null) {
                setData((GetCertifyIdTopData) wrf.b(jSONObject.optJSONObject("module"), new swf<GetCertifyIdTopData>() { // from class: com.mobile.auth.gatewayauth.model.psc_certify_id.GetCertifyIdResult.1
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

    public String getCode() {
        try {
            return this.code;
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

    public GetCertifyIdTopData getData() {
        try {
            return this.module;
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

    public String getMessage() {
        try {
            return this.message;
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

    public void setCode(String str) {
        try {
            this.code = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setData(GetCertifyIdTopData getCertifyIdTopData) {
        try {
            this.module = getCertifyIdTopData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setMessage(String str) {
        try {
            this.message = str;
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
                GetCertifyIdTopData getCertifyIdTopData = this.module;
                if (getCertifyIdTopData == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = getCertifyIdTopData.toJson();
                }
                n.put("module", jSONObject);
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
