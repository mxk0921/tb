package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.ao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class aq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IBinder f14760a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ao.a f737a;

    public aq(ao.a aVar, IBinder iBinder) {
        this.f737a = aVar;
        this.f14760a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        try {
            ao.this.f735a = ao.b.a(this.f14760a);
            ao.this.f736b = ao.b.m485a(this.f14760a);
            ao.this.b();
            ao.this.f731a = 2;
            obj5 = ao.this.f734a;
            synchronized (obj5) {
                try {
                    obj6 = ao.this.f734a;
                    obj6.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ao.this.b();
            ao.this.f731a = 2;
            obj = ao.this.f734a;
            synchronized (obj) {
                try {
                    obj2 = ao.this.f734a;
                    obj2.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            ao.this.b();
            ao.this.f731a = 2;
            obj3 = ao.this.f734a;
            synchronized (obj3) {
                try {
                    obj4 = ao.this.f734a;
                    obj4.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
