package tb;

import android.content.Context;
import tb.iyx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s3l {
    static {
        t2o.a(147849248);
    }

    public static String a(Context context) {
        if (sux.f28290a) {
            return iyx.b.f21655a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void b(Context context) {
        sux.b = iyx.b.f21655a.b(context.getApplicationContext());
        sux.f28290a = true;
    }

    public static boolean c() {
        if (sux.f28290a) {
            return sux.b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
