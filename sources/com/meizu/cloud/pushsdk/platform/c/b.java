package com.meizu.cloud.pushsdk.platform.c;

import android.content.Context;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.platform.d.a;
import com.meizu.cloud.pushsdk.platform.d.d;
import com.meizu.cloud.pushsdk.platform.d.e;
import com.meizu.cloud.pushsdk.platform.d.f;
import com.meizu.cloud.pushsdk.platform.d.g;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f5920a;
    private ScheduledExecutorService b;
    private final Context c;
    private final a d;
    private final com.meizu.cloud.pushsdk.platform.d.b e;
    private final g f;
    private final f g;
    private final e h;
    private final d i;
    private final boolean j;

    public b(Context context, boolean z) {
        this(context, z, true);
    }

    public c<String> a(String str, String str2, String str3, String str4, File file) {
        return this.d.a(str, str2, str3, str4, file);
    }

    public boolean b(String str, String str2, String str3) {
        this.f.a(str);
        this.f.b(str2);
        this.f.c(str3);
        return this.f.f();
    }

    public boolean c(String str, String str2, String str3, String str4) {
        this.h.a(str);
        this.h.b(str2);
        this.h.c(str3);
        this.h.d(str4);
        this.h.b(3);
        return this.h.f();
    }

    public boolean d(String str, String str2, String str3, String str4) {
        this.h.a(str);
        this.h.b(str2);
        this.h.c(str3);
        this.h.d(str4);
        this.h.b(2);
        return this.h.f();
    }

    public b(Context context, boolean z, boolean z2) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        a aVar = new a(applicationContext);
        this.d = aVar;
        if (z) {
            this.b = (ScheduledExecutorService) com.meizu.cloud.pushsdk.f.c.h.b.a();
        }
        this.j = z2;
        this.e = new com.meizu.cloud.pushsdk.platform.d.b(applicationContext, aVar, this.b, z2);
        this.f = new g(applicationContext, aVar, this.b, z2);
        this.g = new f(applicationContext, aVar, this.b, z2);
        this.h = new e(applicationContext, aVar, this.b, z2);
        this.i = new d(applicationContext, aVar, this.b, z2);
    }

    public static b a(Context context) {
        if (f5920a == null) {
            synchronized (b.class) {
                try {
                    if (f5920a == null) {
                        f5920a = new b(context, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5920a;
    }

    public boolean b(String str, String str2, String str3, String str4) {
        this.i.a(str);
        this.i.b(str2);
        this.i.c(str3);
        this.i.e(str4);
        this.i.b(2);
        return this.i.f();
    }

    public boolean c(String str, String str2, String str3, String str4, String str5) {
        this.i.a(str);
        this.i.b(str2);
        this.i.c(str3);
        this.i.e(str4);
        this.i.b(1);
        this.i.d(str5);
        return this.i.f();
    }

    public boolean d(String str, String str2, String str3, String str4, String str5) {
        this.h.a(str);
        this.h.b(str2);
        this.h.c(str3);
        this.h.d(str4);
        this.h.b(1);
        this.h.e(str5);
        return this.h.f();
    }

    public void a(boolean z) {
        this.e.a(z);
        this.f.a(z);
        this.g.a(z);
        this.i.a(z);
        this.h.a(z);
    }

    public boolean b(String str, String str2, String str3, String str4, String str5) {
        this.h.a(str);
        this.h.b(str2);
        this.h.c(str3);
        this.h.d(str4);
        this.h.b(0);
        this.h.e(str5);
        return this.h.f();
    }

    public boolean a(String str) {
        a aVar = new a(this.c, this.b, this.j);
        aVar.b(0);
        aVar.c(str);
        return aVar.f();
    }

    public boolean a(String str, String str2) {
        a aVar = new a(this.c, this.b, this.j);
        aVar.b(2);
        aVar.d(str2);
        aVar.c(str);
        return aVar.f();
    }

    public boolean a(String str, String str2, String str3) {
        this.e.a(str);
        this.e.b(str2);
        this.e.c(str3);
        return this.e.f();
    }

    public boolean a(String str, String str2, String str3, String str4) {
        this.g.a(str);
        this.g.b(str2);
        this.g.c(str3);
        this.g.d(str4);
        this.g.b(2);
        return this.g.f();
    }

    public boolean a(String str, String str2, String str3, String str4, int i, boolean z) {
        this.g.a(str);
        this.g.b(str2);
        this.g.c(str3);
        this.g.d(str4);
        this.g.b(i);
        this.g.c(z);
        return this.g.f();
    }

    public boolean a(String str, String str2, String str3, String str4, String str5) {
        this.i.a(str);
        this.i.b(str2);
        this.i.c(str3);
        this.i.e(str4);
        this.i.b(0);
        this.i.d(str5);
        return this.i.f();
    }

    public boolean a(String str, String str2, String str3, String str4, boolean z) {
        this.g.a(str);
        this.g.b(str2);
        this.g.c(str3);
        this.g.d(str4);
        this.g.b(3);
        this.g.c(z);
        return this.g.f();
    }

    public boolean a(String str, int... iArr) {
        a aVar = new a(this.c, this.b, this.j);
        aVar.a(iArr);
        aVar.c(str);
        aVar.b(1);
        return aVar.f();
    }
}
