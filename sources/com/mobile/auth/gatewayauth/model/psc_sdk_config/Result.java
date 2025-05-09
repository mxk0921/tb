package com.mobile.auth.gatewayauth.model.psc_sdk_config;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Result implements pxf {
    private String code;
    private ConfigRule model;
    private String msg;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            wrf.a(jSONObject, this, null);
            if (jSONObject != null) {
                setModel(ConfigRule.fromJson(jSONObject.optJSONObject("model")));
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

    public ConfigRule getModel() {
        try {
            return this.model;
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

    public String getMsg() {
        try {
            return this.msg;
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

    public void setModel(ConfigRule configRule) {
        try {
            this.model = configRule;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setMsg(String str) {
        try {
            this.msg = str;
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
        Object obj;
        try {
            JSONObject n = wrf.n(this, null);
            try {
                ConfigRule configRule = this.model;
                if (configRule == null) {
                    obj = new JSONObject();
                } else {
                    obj = configRule.toJsonString();
                }
                n.put("model", obj);
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
                ConfigRule configRule = this.model;
                if (configRule == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = configRule.toJson();
                }
                n.put("model", jSONObject);
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
