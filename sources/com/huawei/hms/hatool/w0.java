package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mg0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w0 {
    private static void a(String str, String str2) {
        b0.a().a(new j1(str, str2));
    }

    public static void b(String str, String str2) {
        n0 n0Var;
        String str3;
        String replace = "{url}/getPublicKey?keytype=4".replace("{url}", a1.f(str, str2));
        String f = q0.f();
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", f);
        try {
            n0Var = w.a(replace, new byte[0], hashMap);
        } catch (Exception e) {
            v.e("GetPublicKey", "get pubKey response Exception :" + e.getMessage());
            n0Var = null;
        }
        if (n0Var == null) {
            str3 = "get pubKey response is null";
        } else if (n0Var.b() != 200) {
            str3 = "get pubKey fail HttpCode :" + n0Var.b();
        } else if (!TextUtils.isEmpty(n0Var.a())) {
            d(n0Var.a(), str2);
            return;
        } else {
            return;
        }
        v.e("GetPublicKey", str3);
    }

    public static String c(String str, String str2) {
        String str3;
        String c = q0.c();
        if (TextUtils.isEmpty(c)) {
            c = d.a(q0.i(), "Privacy_MY", "public_key_version", "");
            q0.g(c);
        }
        if (!"2.0".equals(c)) {
            a(str, str2);
            return null;
        }
        if ("maint".equals(str2)) {
            str3 = q0.n();
            if (TextUtils.isEmpty(str3)) {
                str3 = mg0.d("HiAnalytics_Sdk_Public_Sp_Key", d.a(q0.i(), "Privacy_MY", "public_key_maint", ""));
                q0.d(str3);
            }
        } else {
            str3 = q0.o();
            if (TextUtils.isEmpty(str3)) {
                str3 = mg0.d("HiAnalytics_Sdk_Public_Sp_Key", d.a(q0.i(), "Privacy_MY", "public_key_oper", ""));
                q0.e(str3);
            }
        }
        if (!TextUtils.isEmpty(str3) && !a()) {
            return str3;
        }
        a(str, str2);
        return null;
    }

    private static void d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("publicKey");
            String optString2 = jSONObject.optString("publicKeyOM");
            String optString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String optString4 = jSONObject.optString("timeInterval");
            d.b(q0.i(), "Privacy_MY", "public_key_oper", mg0.g("HiAnalytics_Sdk_Public_Sp_Key", optString));
            d.b(q0.i(), "Privacy_MY", "public_key_maint", mg0.g("HiAnalytics_Sdk_Public_Sp_Key", optString2));
            d.b(q0.i(), "Privacy_MY", "public_key_time_interval", optString4);
            d.b(q0.i(), "Privacy_MY", "public_key_version", optString3);
            d.b(q0.i(), "Privacy_MY", "public_key_time_last", str3);
            q0.e(optString);
            q0.d(optString2);
            q0.g(optString3);
            q0.c(str3);
            q0.f(optString4);
        } catch (JSONException e) {
            v.e("GetPublicKey", "get pubKey parse json JSONException :" + e.getMessage());
        }
    }

    public static boolean a() {
        String a2 = q0.a();
        if (TextUtils.isEmpty(a2)) {
            a2 = d.a(q0.i(), "Privacy_MY", "public_key_time_interval", "");
            q0.f(a2);
        }
        String m = q0.m();
        if (TextUtils.isEmpty(m)) {
            m = d.a(q0.i(), "Privacy_MY", "public_key_time_last", "");
            q0.c(m);
        }
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(m)) {
            try {
                return System.currentTimeMillis() - Long.parseLong(m) > ((long) Integer.parseInt(a2));
            } catch (NumberFormatException e) {
                v.e("GetPublicKey", "checkCachePubKey NumberFormatException :" + e.getMessage());
            }
        }
        return true;
    }
}
