package com.xiaomi.push;

import android.content.Context;
import android.os.IBinder;
import com.xiaomi.push.ay;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IBinder f14771a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ay.b f761a;

    public ba(ay.b bVar, IBinder iBinder) {
        this.f761a = bVar;
        this.f14771a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Context context;
        String b;
        Object obj5;
        Object obj6;
        try {
            context = ay.this.f754a;
            String packageName = context.getPackageName();
            b = ay.this.b();
            ay.a aVar = new ay.a();
            aVar.b = ay.c.a(this.f14771a, packageName, b, "OUID");
            ay.this.f756a = aVar;
            ay.this.m489b();
            ay.this.f753a = 2;
            obj5 = ay.this.f757a;
            synchronized (obj5) {
                try {
                    obj6 = ay.this.f757a;
                    obj6.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ay.this.m489b();
            ay.this.f753a = 2;
            obj = ay.this.f757a;
            synchronized (obj) {
                try {
                    obj2 = ay.this.f757a;
                    obj2.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            ay.this.m489b();
            ay.this.f753a = 2;
            obj3 = ay.this.f757a;
            synchronized (obj3) {
                try {
                    obj4 = ay.this.f757a;
                    obj4.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
