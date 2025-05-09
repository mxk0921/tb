package com.meizu.cloud.pushsdk.d;

import android.content.Context;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g extends h<f> implements f {
    private static g c;
    private boolean d = false;

    private g(f fVar) {
        super(fVar);
    }

    public static g c() {
        if (c == null) {
            synchronized (g.class) {
                try {
                    if (c == null) {
                        c = new g(new b());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(Context context) {
        a(context, (String) null);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void b(String str, String str2) {
        b().b(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void d(String str, String str2) {
        b().d(str, str2);
    }

    public void a(Context context, String str) {
        if (!this.d) {
            boolean z = true;
            this.d = true;
            if ((context.getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            a(z);
            if (str == null) {
                str = MzSystemUtils.getDocumentsPath(context) + "/pushSdk/" + context.getPackageName();
            }
            a(str);
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void b(boolean z) {
        b().b(z);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void c(String str, String str2) {
        b().c(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str) {
        b().a(str);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str, String str2) {
        b().a(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str, String str2, Throwable th) {
        b().a(str, str2, th);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(boolean z) {
        b().a(z);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public boolean a() {
        return b().a();
    }
}
