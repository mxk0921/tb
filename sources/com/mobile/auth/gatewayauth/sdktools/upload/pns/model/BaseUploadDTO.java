package com.mobile.auth.gatewayauth.sdktools.upload.pns.model;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BaseUploadDTO implements pxf, Serializable {
    private static final long serialVersionUID = -6155958494956658630L;
    private String osType = TimeCalculator.PLATFORM_ANDROID;
    private String s;
    private Map<String, String> u;

    public String getOsType() {
        try {
            return this.osType;
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

    public String getS() {
        try {
            return this.s;
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

    public Map<String, String> getU() {
        try {
            return this.u;
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

    public BaseUploadDTO setOsType(String str) {
        try {
            this.osType = str;
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

    public BaseUploadDTO setS(String str) {
        try {
            this.s = str;
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

    public BaseUploadDTO setU(Map<String, String> map) {
        try {
            this.u = map;
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

    public String toString() {
        try {
            return "BaseUploadDTO{u=" + this.u + ", s='" + this.s + "', osType='" + this.osType + "'}";
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
            setU(wrf.h(jSONObject.optJSONObject("u")));
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
        try {
            JSONObject n = wrf.n(this, null);
            try {
                n.put("u", new JSONObject(this.u));
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
