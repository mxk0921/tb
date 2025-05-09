package tb;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sq4 {

    /* renamed from: a  reason: collision with root package name */
    public static Context f28216a;

    public static Context a() {
        return f28216a;
    }

    public static void b(Context context) {
        if (context != null && f28216a == null) {
            f28216a = context.getApplicationContext();
        }
    }
}
