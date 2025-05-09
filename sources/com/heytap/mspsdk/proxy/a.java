package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.heytap.msp.a;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import tb.b9j;
import tb.c3j;
import tb.rwx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5212a;

    static {
        t2o.a(253755433);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Handler handler) {
        super(handler);
        this.f5212a = bVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        c3j.f(b9j.TAG, "MspResultReceiver onReceiveResult " + i + ", thread name " + Thread.currentThread().getName());
        if (i == 1000) {
            synchronized (this.f5212a.b) {
                try {
                    com.heytap.msp.a a2 = a.AbstractBinderC0261a.a(bundle.getBinder("msp_core_binder"));
                    if (a2 != null) {
                        c3j.f(b9j.TAG, "MspResultReceiver onReceiveResult takes core binder");
                        rwx.f().b(a2);
                    }
                    Collection<CountDownLatch> values = this.f5212a.f5213a.values();
                    c3j.f(b9j.TAG, "MspResultReceiver onReceiveResult latches size " + values.size());
                    if (!values.isEmpty() && values.size() > 0) {
                        for (CountDownLatch countDownLatch : values) {
                            countDownLatch.countDown();
                            c3j.f(b9j.TAG, "MspResultReceiver onReceiveResult latches countDown()");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
