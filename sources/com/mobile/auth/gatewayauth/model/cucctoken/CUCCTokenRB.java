package com.mobile.auth.gatewayauth.model.cucctoken;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CUCCTokenRB implements pxf {
    public static final int CUCC_RB_SUCCESS = 0;
    private int resultCode;
    private ResultData resultData;
    private String resultMsg;
    private String traceId;

    public static CUCCTokenRB fromJson(String str) {
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    CUCCTokenRB cUCCTokenRB = (CUCCTokenRB) wrf.b(jSONObject, new swf<CUCCTokenRB>() { // from class: com.mobile.auth.gatewayauth.model.cucctoken.CUCCTokenRB.1
                    }, null);
                    cUCCTokenRB.setResultData((ResultData) wrf.b(jSONObject.optJSONObject("resultData"), new swf<ResultData>() { // from class: com.mobile.auth.gatewayauth.model.cucctoken.CUCCTokenRB.2
                    }, null));
                    return cUCCTokenRB;
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

    public int getResultCode() {
        try {
            return this.resultCode;
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

    public ResultData getResultData() {
        try {
            return this.resultData;
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

    public String getResultMsg() {
        try {
            return this.resultMsg;
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

    public String getTraceId() {
        try {
            return this.traceId;
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

    public void setResultCode(int i) {
        try {
            this.resultCode = i;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResultData(ResultData resultData) {
        try {
            this.resultData = resultData;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setResultMsg(String str) {
        try {
            this.resultMsg = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setTraceId(String str) {
        try {
            this.traceId = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String toString() {
        try {
            return "CUCCTokenRB{resultCode=" + this.resultCode + ", resultMsg='" + this.resultMsg + "', resultData=" + this.resultData + '}';
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
                setResultData((ResultData) wrf.b(jSONObject.optJSONObject("resultData"), new swf<ResultData>() { // from class: com.mobile.auth.gatewayauth.model.cucctoken.CUCCTokenRB.3
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
                ResultData resultData = this.resultData;
                if (resultData == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = resultData.toJson();
                }
                n.put("resultData", jSONObject);
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
