package com.mobile.auth;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.cmic.sso.sdk.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00O0Oo0 {
    public static JSONObject O000000o(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", "103000");
            jSONObject.put("desc", "true");
            jSONObject.put("securityphone", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject O00000Oo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put("desc", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject O000000o(String str, a aVar, JSONObject jSONObject) {
        String[] strArr = {"未知", "移动", "联通", "电信"};
        try {
            String b = aVar.b("operatorTypeName");
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("operatorType", b);
            } else {
                String b2 = aVar.b("operatortype", "0");
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject.put("operatorType", strArr[Integer.parseInt(b2)]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject O000000o(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put("desc", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject O000000o(String str, String str2, a aVar, JSONObject jSONObject) {
        String str3;
        String str4 = "0";
        JSONObject jSONObject2 = new JSONObject();
        try {
            int parseInt = Integer.parseInt(aVar.b(MspGlobalDefine.AUTH_TYPE, str4));
            int c = aVar.c("networktype");
            if (parseInt != 3) {
                str3 = "其他";
            } else if (c == 3) {
                str3 = "WIFI下网关鉴权";
                str4 = "1";
            } else {
                str3 = "网关鉴权";
                str4 = "2";
            }
            jSONObject2.put("resultCode", str);
            jSONObject2.put(MspGlobalDefine.AUTH_TYPE, str4);
            jSONObject2.put("authTypeDes", str3);
            if ("103000".equals(str)) {
                if (1 == aVar.c("logintype")) {
                    jSONObject2.put("openId", aVar.b("openId"));
                    jSONObject2.put("securityphone", aVar.b("securityphone"));
                }
                jSONObject2.put("token", jSONObject.optString("token"));
                jSONObject2.put("tokenExpiresIn", jSONObject.optString("tokenExpiresIn"));
            } else {
                jSONObject2.put("desc", str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        O0O0O.O00000Oo("AuthnResult", "返回参数:" + jSONObject2.toString());
        return jSONObject2;
    }
}
