package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.u;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f14580a;
    private d b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f14580a == null) {
                    f14580a = new b();
                }
                bVar = f14580a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final d a(Context context) {
        d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        try {
            Method method = ClientConfigManagerImpl.class.getMethod("getInstance", Context.class);
            u.d("ConfigManagerFactory", "createConfig success is ".concat("com.vivo.push.cache.ClientConfigManagerImpl"));
            d dVar2 = (d) method.invoke(null, context);
            this.b = dVar2;
            return dVar2;
        } catch (Exception e) {
            e.printStackTrace();
            u.b("ConfigManagerFactory", "createConfig error", e);
            return null;
        }
    }
}
