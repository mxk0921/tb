package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {
    private static e b;
    private static Map<String, Long> c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private Context f5375a;

    public static e a() {
        return b();
    }

    private static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (b == null) {
                    b = new e();
                }
                eVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    private void b(Context context) {
        String str;
        String d = o.d(context);
        q0.a(d);
        if (q1.b().a()) {
            String a2 = d.a(context, "global_v2", "app_ver", "");
            d.b(context, "global_v2", "app_ver", d);
            q0.b(a2);
            if (TextUtils.isEmpty(a2)) {
                str = "app ver is first save!";
            } else if (!a2.equals(d)) {
                v.c("hmsSdk", "the appVers are different!");
                a().a("", "alltype", a2);
                return;
            } else {
                return;
            }
        } else {
            str = "userManager.isUserUnlocked() == false";
        }
        v.c("hmsSdk", str);
    }

    public void a(Context context) {
        this.f5375a = context;
        b(context);
        s.c().b().h(o.a());
    }

    public void a(String str, int i) {
        if (this.f5375a == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        v.c("hmsSdk", "onReport: Before calling runtaskhandler()");
        a(str, n1.a(i), q0.g());
    }

    public void a(String str, int i, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            currentTimeMillis = n1.a("yyyy-MM-dd", currentTimeMillis);
        }
        b0.c().a(new a0(str2, jSONObject, str, n1.a(i), currentTimeMillis));
    }

    public void a(String str, int i, String str2, JSONObject jSONObject, long j) {
        new i1(str, n1.a(i), str2, jSONObject.toString(), j).a();
    }

    public void a(String str, String str2) {
        if (a1.a(str, str2)) {
            long j = a1.j(str, str2);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j > 30000) {
                v.a("hmsSdk", "begin to call onReport!");
                a1.a(str, str2, currentTimeMillis);
                a(str, str2, q0.g());
                return;
            }
            v.f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        v.c("hmsSdk", "auto report is closed tag:" + str);
    }

    public void a(String str, String str2, String str3) {
        Context context = this.f5375a;
        if (context == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String b2 = r0.b(context);
        if (a1.e(str, str2) && !"WIFI".equals(b2)) {
            v.c("hmsSdk", "strNetworkType is :" + b2);
        } else if ("unknown".equals(b2) || "none".equals(b2) || "2G".equals(b2)) {
            v.e("hmsSdk", "The network is bad.");
        } else {
            b0.c().a(new v0(str, str2, str3));
        }
    }
}
