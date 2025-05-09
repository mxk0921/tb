package com.uc.webview.export.multiprocess.helper;

import android.os.Process;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14333a;
    private static boolean b;
    private static final Object c = new Object();

    public static boolean a() {
        if (!b) {
            synchronized (c) {
                try {
                    if (!b) {
                        f14333a = b();
                        b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14333a;
    }

    private static boolean b() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable unused) {
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }
}
