package tb;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x5y {
    public static String a(String str) {
        return "SecurityComp10200303: " + str;
    }

    public static void b(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void c(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void d(String str, String str2) {
        a(str);
    }

    public static void e(String str, String str2) {
        a(str);
    }
}
