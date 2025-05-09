package com.mobile.auth.gatewayauth.model;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DowngradeInfoList implements pxf, Serializable {
    private List<DowngradeConfig> downgradeInfo;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("down_grade_info");
                if (optJSONArray != null) {
                    setDowngradeInfo(wrf.l(optJSONArray, new swf<DowngradeConfig>() { // from class: com.mobile.auth.gatewayauth.model.DowngradeInfoList.1
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
    }

    public List<DowngradeConfig> getDowngradeInfo() {
        try {
            return this.downgradeInfo;
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

    public void setDowngradeInfo(List<DowngradeConfig> list) {
        try {
            this.downgradeInfo = list;
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
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("down_grade_info", wrf.j(this.downgradeInfo));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
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
