package com.mobile.auth.gatewayauth.model.psc_sdk_config;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PscQueryConfigResponse implements pxf {
    private String request_id;
    private Result result;

    public String getRequest_id() {
        try {
            return this.request_id;
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

    public Result getResult() {
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

    public void setRequest_id(String str) {
        try {
            this.request_id = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResult(Result result) {
        try {
            this.result = result;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            wrf.a(jSONObject, this, null);
            if (jSONObject != null) {
                setResult((Result) wrf.b(jSONObject.optJSONObject("result"), new swf<Result>() { // from class: com.mobile.auth.gatewayauth.model.psc_sdk_config.PscQueryConfigResponse.1
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

    @Override // tb.pxf
    public JSONObject toJson() {
        JSONObject jSONObject;
        try {
            JSONObject n = wrf.n(this, null);
            try {
                Result result = this.result;
                if (result == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = result.toJson();
                }
                n.put("result", jSONObject);
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

    public JSONObject toJsonControlPop() {
        JSONObject jSONObject;
        try {
            JSONObject n = wrf.n(this, null);
            try {
                Result result = this.result;
                if (result == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = result.toJsonControlPop();
                }
                n.put("result", jSONObject);
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
