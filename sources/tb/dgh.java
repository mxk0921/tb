package tb;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dgh {
    public static final String TAG = "mcssdk---";

    /* renamed from: a  reason: collision with root package name */
    public static final String f17795a = "MCS";
    public static boolean b = true;
    public static boolean c = true;
    public static final String d = "-->";
    public static boolean e = true;

    static {
        t2o.a(612368426);
    }

    public static void a(String str) {
        if (b && e) {
            StringBuilder sb = new StringBuilder();
            sb.append(f17795a);
            sb.append(d);
            sb.append(str);
        }
    }

    public static void b(String str) {
        if (c && e) {
            Log.e(TAG, f17795a + d + str);
        }
    }

    public static void c(String str, String str2) {
        if (c && e) {
            Log.e(str, f17795a + d + str2);
        }
    }

    public static void d(boolean z) {
        e = z;
        if (z) {
            b = true;
            c = true;
            return;
        }
        b = false;
        c = false;
    }
}
