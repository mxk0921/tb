package com.loc;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static ah f5558a;
    private final Context b;
    private final String c = ao.a(x.c("RYW1hcF9kZXZpY2VfYWRpdQ"));

    private ah(Context context) {
        this.b = context.getApplicationContext();
    }

    public static ah a(Context context) {
        if (f5558a == null) {
            synchronized (ah.class) {
                try {
                    if (f5558a == null) {
                        f5558a = new ah(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5558a;
    }

    public final synchronized void a() {
        try {
            if (o.c() == null) {
                o.a(al.a());
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        ai.a(this.b).a(this.c);
        ai.a(this.b).b(str);
    }
}
