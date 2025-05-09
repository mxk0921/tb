package com.mobile.auth.gatewayauth.sdktools.upload.pns.model;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UploadMonitorDTO extends BaseUploadDTO {
    private static final long serialVersionUID = -7916879376930002080L;
    private String action;
    private String apiLevel;
    private Map<String, String> c;

    @Override // com.mobile.auth.gatewayauth.sdktools.upload.pns.model.BaseUploadDTO, tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            super.fromJson(jSONObject);
            setC(wrf.h(jSONObject.optJSONObject("c")));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String getAction() {
        try {
            return this.action;
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

    public String getApiLevel() {
        try {
            return this.apiLevel;
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

    public Map<String, String> getC() {
        try {
            return this.c;
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

    public UploadMonitorDTO setAction(String str) {
        try {
            this.action = str;
            return this;
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

    public UploadMonitorDTO setApiLevel(String str) {
        try {
            this.apiLevel = str;
            return this;
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

    public UploadMonitorDTO setC(Map<String, String> map) {
        try {
            this.c = map;
            return this;
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

    @Override // com.mobile.auth.gatewayauth.sdktools.upload.pns.model.BaseUploadDTO, tb.pxf
    public JSONObject toJson() {
        try {
            JSONObject json = super.toJson();
            try {
                json.put("c", new JSONObject(this.c));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return json;
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

    @Override // com.mobile.auth.gatewayauth.sdktools.upload.pns.model.BaseUploadDTO
    public String toString() {
        try {
            return super.toString() + "UploadMonitorDTO{action='" + this.action + "', apiLevel='" + this.apiLevel + "', c=" + this.c + '}';
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
