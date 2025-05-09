package com.taobao.linkmanager.afc.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.pg0;
import tb.t2o;
import tb.vp9;
import tb.z2b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomePageReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public boolean f10911a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final HomePageReceiver f10912a = new HomePageReceiver();

        static {
            t2o.a(744489023);
        }
    }

    static {
        t2o.a(744489022);
    }

    public static /* synthetic */ Object ipc$super(HomePageReceiver homePageReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/remote/HomePageReceiver");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a34e93", new Object[]{this, new Boolean(z)});
        } else {
            this.f10911a = z;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        vp9.a("linkx", "HomePageReceiver === onReceive: context：" + context + ", action: " + intent.getAction() + ", reductEnable: " + this.f10911a);
        if (!Boolean.parseBoolean(pg0.i().c("useHomePageBroadcastOnce", "true"))) {
            z2b.c(context, this.f10911a);
        } else if (b.compareAndSet(false, true)) {
            z2b.c(context, this.f10911a);
        }
    }
}
