package com.tmall.android.dai.internal.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.walle.bridge.CppApiBridge;
import tb.ajj;
import tb.c9l;
import tb.d42;
import tb.kgh;
import tb.kzo;
import tb.t2o;
import tb.t45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ConfigServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944626);
    }

    public static /* synthetic */ void a(ConfigServiceImpl configServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e022e62a", new Object[]{configServiceImpl});
        } else {
            configServiceImpl.b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415e0fa0", new Object[]{this});
            return;
        }
        c9l.a().c();
        if (d42.h().a()) {
            d42.h().g();
        }
        ajj.b().c();
        CppApiBridge.b().a("onMrtAvaliable", null);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6b275", new Object[]{this});
        } else if (MRT.i()) {
            kgh.j("ConfigServiceImpl", "DAI.MRT is availabel!!!, get config from orange!");
            b();
        } else {
            LocalBroadcastManager.getInstance(kzo.c().b()).registerReceiver(new BroadcastReceiver() { // from class: com.tmall.android.dai.internal.config.ConfigServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.tmall.android.dai.internal.config.ConfigServiceImpl$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public a() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (MRT.i()) {
                            ConfigServiceImpl.a(ConfigServiceImpl.this);
                        }
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/config/ConfigServiceImpl$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    kgh.j("ConfigServiceImpl", "DAI.MRT broadcast coming!!!, get config from orange!");
                    t45.c().d().execute(new a());
                }
            }, new IntentFilter(MRT.ACTION_MRT_STATE));
        }
    }
}
