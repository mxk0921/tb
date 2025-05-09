package com.loc;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    e f5688a;
    Context b;
    Messenger c = null;

    public f(Context context) {
        this.f5688a = null;
        this.b = null;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f5688a = new e(applicationContext);
    }

    public final IBinder a(Intent intent) {
        this.f5688a.b(intent);
        this.f5688a.a(intent);
        Messenger messenger = new Messenger(this.f5688a.b());
        this.c = messenger;
        return messenger.getBinder();
    }

    public final void b() {
        try {
            e eVar = this.f5688a;
            if (eVar != null) {
                eVar.b().sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "onDestroy");
        }
    }

    public final void a() {
        try {
            e.d();
            this.f5688a.j = fy.b();
            this.f5688a.k = fy.a();
            this.f5688a.a();
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "onCreate");
        }
    }
}
