package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class i0 {
    public static String a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(z.a(str, str2))) {
            return z.a(str, str2);
        }
        v.c("hmsSdk", "getAndroidId(): to getConfigByType()");
        return c(context, str, str2);
    }

    public static String b(Context context, String str, String str2) {
        if (str2.equals("oper")) {
            return d(context, str, str2);
        }
        if (str2.equals("maint")) {
            return d(context, str, str2);
        }
        if (str2.equals("diffprivacy")) {
            return d(context, str, str2);
        }
        if (str2.equals("preins")) {
            return d(context, str, str2);
        }
        v.f("hmsSdk", "getChannel(): Invalid type: ".concat(str2));
        return "";
    }

    private static String c(Context context, String str, String str2) {
        if (!z.b(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(q0.d())) {
            s.c().b().b(o.a(context));
        }
        return q0.d();
    }

    private static String d(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(a1.d(str, str2))) {
            return a1.d(str, str2);
        }
        g1 b = s.c().b();
        if (TextUtils.isEmpty(b.h())) {
            String b2 = o.b(context);
            if (!e1.a("channel", b2, 256)) {
                b2 = "";
            }
            b.f(b2);
        }
        return b.h();
    }
}
