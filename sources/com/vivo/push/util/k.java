package com.vivo.push.util;

import android.os.Looper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class k {
    public static void a(String str) {
        if (u.b() && Looper.myLooper() == Looper.getMainLooper()) {
            StringBuilder sb = new StringBuilder("Operation: ");
            sb.append(str);
            sb.append(" in main thread!");
            new Throwable();
        }
    }
}
