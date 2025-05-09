package com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OutLinkWithReqModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OutLinkWithReqModel";
    private JSONObject bizParams;

    static {
        t2o.a(486539560);
    }

    private HashMap<String, String> parseBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1bea2a6", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>(4);
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    hashMap.put(entry.getKey(), (String) value);
                } else if (value instanceof JSON) {
                    hashMap.put(entry.getKey(), ((JSON) value).toJSONString());
                } else if (value != null) {
                    hashMap.put(entry.getKey(), value.toString());
                }
            }
        } catch (Exception unused) {
            fve.e(TAG, "解析bizParams出错 ");
        }
        return hashMap;
    }

    public Map<String, String> getBizParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this});
        }
        return parseBizParams(this.bizParams);
    }

    public void setBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e4f72", new Object[]{this, jSONObject});
        } else {
            this.bizParams = jSONObject;
        }
    }
}
