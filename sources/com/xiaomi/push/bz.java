package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.cg;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private String f14792a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference<Context> f783a;

    public bz(String str, WeakReference<Context> weakReference) {
        this.f14792a = str;
        this.f783a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f783a;
        if (weakReference != null && (context = weakReference.get()) != null) {
            if (cm.a(this.f14792a) > by.f781a) {
                cc a2 = cc.a(this.f14792a);
                cb a3 = cb.a(this.f14792a);
                a2.a(a3);
                a3.a(ca.a(context, this.f14792a, 1000));
                cg.a(context).a((cg.a) a2);
                return;
            }
            b.b("=====> do not need clean db");
        }
    }
}
