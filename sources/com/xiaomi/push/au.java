package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class au {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f14763a;

    private static void a(Class<?> cls, Context context) {
        if (!f14763a) {
            try {
                f14763a = true;
                cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
            } catch (Throwable th) {
                b.m410a("mdid:load lib error " + th);
            }
        }
    }

    public static boolean a(Context context) {
        try {
            Class<?> a2 = r.a(context, "com.bun.miitmdid.core.JLibrary");
            if (a2 == null) {
                return false;
            }
            a(a2, context);
            return true;
        } catch (Throwable th) {
            b.m410a("mdid:check error " + th);
            return false;
        }
    }
}
