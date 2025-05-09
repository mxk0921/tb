package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cy {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f14815a;

    public static void a(String str) {
        a("Push-ConnectionQualityStatsHelper", str);
    }

    public static void a(String str, String str2) {
    }

    public static boolean a(Context context) {
        Boolean bool;
        if (f14815a == null) {
            if (!j.m869a(context)) {
                f14815a = Boolean.FALSE;
            }
            String a2 = v.m1098a(context);
            if (TextUtils.isEmpty(a2) || a2.length() < 3) {
                bool = Boolean.FALSE;
            } else {
                String substring = a2.substring(a2.length() - 3);
                a("shouldSampling uuid suffix = " + substring);
                bool = Boolean.valueOf(TextUtils.equals(substring, "001"));
            }
            f14815a = bool;
            a("shouldSampling = " + f14815a);
        }
        return f14815a.booleanValue();
    }
}
