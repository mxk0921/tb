package com.mobile.auth.gatewayauth.network;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.JsonerTag;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VendorRespone implements pxf {
    @JsonerTag(keyName = "Code")
    private String Code;
    @JsonerTag(keyName = "Data")
    private List<VendorListRespone> Data;
    @JsonerTag(keyName = "Message")
    private String Message;
    @JsonerTag(keyName = "RequestId")
    private String RequestId;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            wrf.a(jSONObject, this, null);
            if (jSONObject != null) {
                if (jSONObject.optJSONObject("Data") != null) {
                    jSONArray = jSONObject.optJSONObject("Data").optJSONArray("List");
                }
                setData(wrf.l(jSONArray, new swf<VendorListRespone>() { // from class: com.mobile.auth.gatewayauth.network.VendorRespone.1
                }));
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
            return this.Code;
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

    public List<VendorListRespone> getData() {
        try {
            return this.Data;
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
            return this.Message;
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

    public String getRequestId() {
        try {
            return this.RequestId;
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
            this.Code = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setData(List<VendorListRespone> list) {
        try {
            this.Data = list;
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
            this.Message = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setRequestId(String str) {
        try {
            this.RequestId = str;
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
            return wrf.n(this, null);
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
