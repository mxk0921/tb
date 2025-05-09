package com.taobao.uikit.extend.component.error;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.Map;
import tb.jk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Error {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apiName;
    public String errorCode;
    public String errorMsg;
    public Map<String, String> extras;
    public String mappingCode;
    public String reqFalcoId;
    public int responseCode;
    public String url;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Factory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(932184105);
        }

        public static Error fromMtopResponse(int i, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("ba2e8d9e", new Object[]{new Integer(i), str, str2, str3}) : new Error(i, str, str2, str3);
        }

        public static Error newError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Error) ipChange.ipc$dispatch("e23f159a", new Object[]{str, str2});
            }
            return new Error(str, str2);
        }

        public static Error fromMtopResponse(String str, int i, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("67dd2494", new Object[]{str, new Integer(i), str2, str3, str4}) : new Error(str, i, str2, str3, str4);
        }

        public static Error fromMtopResponse(String str, int i, String str2, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Error) ipChange.ipc$dispatch("6755cf9e", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            Error fromMtopResponse = fromMtopResponse(str, i, str2, str3, str4);
            fromMtopResponse.reqFalcoId = str5;
            return fromMtopResponse;
        }
    }

    static {
        t2o.a(932184103);
    }

    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.extras;
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) this.extras.get(str));
            }
        }
        jSONObject.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, (Object) Integer.valueOf(this.responseCode));
        String str2 = this.mappingCode;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        jSONObject.put(jk.KEY_MAPPING_CODE, (Object) str2);
        String str4 = this.errorCode;
        if (str4 == null) {
            str4 = str3;
        }
        jSONObject.put("errorCode", (Object) str4);
        String str5 = this.errorMsg;
        if (str5 == null) {
            str5 = str3;
        }
        jSONObject.put("errorMsg", (Object) str5);
        String str6 = this.url;
        if (str6 == null) {
            str6 = str3;
        }
        jSONObject.put("url", (Object) str6);
        String str7 = this.apiName;
        if (str7 == null) {
            str7 = str3;
        }
        jSONObject.put("apiName", (Object) str7);
        String str8 = this.reqFalcoId;
        if (str8 != null) {
            str3 = str8;
        }
        jSONObject.put("reqFalcoId", (Object) str3);
        return jSONObject.toJSONString();
    }

    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.extras;
        if (map != null) {
            for (String str : map.keySet()) {
                hashMap.put(str, this.extras.get(str));
            }
        }
        hashMap.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, Integer.valueOf(this.responseCode));
        String str2 = this.mappingCode;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        hashMap.put(jk.KEY_MAPPING_CODE, str2);
        String str4 = this.errorCode;
        if (str4 == null) {
            str4 = str3;
        }
        hashMap.put("errorCode", str4);
        String str5 = this.errorMsg;
        if (str5 == null) {
            str5 = str3;
        }
        hashMap.put("errorMsg", str5);
        String str6 = this.url;
        if (str6 == null) {
            str6 = str3;
        }
        hashMap.put("url", str6);
        String str7 = this.apiName;
        if (str7 == null) {
            str7 = str3;
        }
        hashMap.put("apiName", str7);
        String str8 = this.reqFalcoId;
        if (str8 != null) {
            str3 = str8;
        }
        hashMap.put("reqFalcoId", str3);
        return hashMap;
    }

    private Error(String str, String str2) {
        this(0, "", str, str2);
    }

    private Error(int i, String str, String str2, String str3) {
        this.responseCode = i;
        this.mappingCode = TextUtils.isEmpty(str) ? "" : str;
        this.errorCode = TextUtils.isEmpty(str2) ? "" : str2;
        this.errorMsg = TextUtils.isEmpty(str3) ? "" : str3;
    }

    private Error(String str, int i, String str2, String str3, String str4) {
        this(i, str2, str3, str4);
        this.apiName = str;
    }
}
