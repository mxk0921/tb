package com.mobile.auth.gatewayauth.model.ctcctoken;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CTCCTokenRet implements pxf {
    private Data data;
    private String msg;
    private String reqId;
    private int result;

    public static CTCCTokenRet fromJson(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    CTCCTokenRet cTCCTokenRet = (CTCCTokenRet) wrf.b(jSONObject, new swf<CTCCTokenRet>() { // from class: com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet.1
                    }, null);
                    cTCCTokenRet.setData((Data) wrf.b(jSONObject.optJSONObject("data"), new swf<Data>() { // from class: com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet.2
                    }, null));
                    return cTCCTokenRet;
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

    public Data getData() {
        try {
            return this.data;
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

    public String getReqId() {
        try {
            return this.reqId;
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

    public int getResult() {
        try {
            return this.result;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public void setData(Data data) {
        try {
            this.data = data;
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

    public void setReqId(String str) {
        try {
            this.reqId = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResult(int i) {
        try {
            this.result = i;
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
                Data data = this.data;
                if (data == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = data.toJson();
                }
                n.put("data", jSONObject);
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

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            wrf.a(jSONObject, this, null);
            if (jSONObject != null) {
                setData((Data) wrf.b(jSONObject.optJSONObject("data"), new swf<Data>() { // from class: com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet.3
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
