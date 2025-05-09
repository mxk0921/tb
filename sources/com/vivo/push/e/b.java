package com.vivo.push.e;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {
    private static volatile b c;

    /* renamed from: a  reason: collision with root package name */
    private a f14592a;
    private Context b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (c == null) {
                    c = new b();
                }
                bVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final synchronized a a(Context context) {
        try {
            a aVar = this.f14592a;
            if (aVar != null) {
                return aVar;
            }
            if (context == null) {
                return null;
            }
            if (aVar == null) {
                Context context2 = ContextDelegate.getContext(context.getApplicationContext());
                this.b = context2;
                this.f14592a = new c(context2);
            }
            return this.f14592a;
        } catch (Throwable th) {
            throw th;
        }
    }
}
