package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import com.xiaomi.push.service.az;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ee {
    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] a2 = bj.m516a(str);
        try {
            a(a2);
            return h.b(a2, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Context context, String str, long j) {
        if (az.a(context).a(ih.DCJobMutualSwitch.a(), false)) {
            return (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !af.a(context, str, j);
        }
        return false;
    }

    public static byte[] a(String str, byte[] bArr) {
        byte[] a2 = bj.m516a(str);
        try {
            a(a2);
            return h.a(a2, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
