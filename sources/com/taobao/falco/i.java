package com.taobao.falco;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoNativePageLifecycleCallbacks;
import java.util.HashMap;
import tb.c21;
import tb.crt;
import tb.hz8;
import tb.mdd;
import tb.v11;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i implements v11, FalcoNativePageLifecycleCallbacks.a, FalcoNativePageLifecycleCallbacks.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FalcoEnvironmentImpl f10465a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10466a;
        public final /* synthetic */ mdd b;

        public a(boolean z, mdd mddVar) {
            this.f10466a = z;
            this.b = mddVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap(45);
            hashMap.put("envFalcoId", i.j(i.this).c());
            o b = i.j(i.this).b();
            hashMap.put("memTotal", Long.valueOf(b.f10474a));
            hashMap.put("memFree", Long.valueOf(b.b));
            hashMap.put("appMemUsage", Long.valueOf(b.e));
            d e = i.j(i.this).e();
            hashMap.put("cpuCores", Integer.valueOf(e.f10461a));
            hashMap.put("deviceCpuUsage", Float.valueOf(e.b));
            hashMap.put("appCpuUsage", Float.valueOf(e.c));
            r h = i.j(i.this).h();
            hashMap.put("diskTotal", Long.valueOf(h.f10477a));
            hashMap.put("diskFree", Long.valueOf(h.b));
            p g = i.j(i.this).g();
            hashMap.put("netType", g.f10475a);
            hashMap.put("apn", g.b);
            hashMap.put("wifiSsid", g.c);
            hashMap.put(DispatchConstants.CARRIER, g.d);
            hashMap.put("isAirplaneMode", Integer.valueOf(g.e));
            hashMap.put("isWifiEnabled", Integer.valueOf(g.f));
            hashMap.put("isWifiRestricted", Integer.valueOf(g.g));
            hashMap.put("isCellularRestricted", Integer.valueOf(g.h));
            hashMap.put("proxyType", Integer.valueOf(g.i));
            hashMap.put("ipStack", Integer.valueOf(g.j));
            hz8 q = i.j(i.this).q();
            hashMap.put("srttAvgCDN", Double.valueOf(q.f20981a));
            hashMap.put("srttMaxCDN", Double.valueOf(q.b));
            hashMap.put("srttMinCDN", Double.valueOf(q.c));
            hashMap.put("srttAvgIDC", Double.valueOf(q.d));
            hashMap.put("srttMaxIDC", Double.valueOf(q.e));
            hashMap.put("srttMinIDC", Double.valueOf(q.f));
            hashMap.put("frttAvgCDN", Double.valueOf(q.g));
            hashMap.put("frttMaxCDN", Double.valueOf(q.h));
            hashMap.put("frttMinCDN", Double.valueOf(q.i));
            hashMap.put("frttAvgIDC", Double.valueOf(q.j));
            hashMap.put("frttMaxIDC", Double.valueOf(q.k));
            hashMap.put("frttMinIDC", Double.valueOf(q.l));
            hashMap.put("lossratioAvgCDN", Double.valueOf(q.m));
            hashMap.put("lossratioMaxCDN", Double.valueOf(q.n));
            hashMap.put("lossratioAvgIDC", Double.valueOf(q.o));
            hashMap.put("lossratioMaxIDC", Double.valueOf(q.p));
            hashMap.put("recentWinCount", Long.valueOf(q.q));
            hashMap.put("recentWinFail", Long.valueOf(q.r));
            hashMap.put("recentWinBWE", Long.valueOf(q.s));
            hashMap.put("mtuCDN", Long.valueOf(q.t));
            hashMap.put("mtuIDC", Long.valueOf(q.u));
            hashMap.put("signalDBM", Integer.valueOf(q.v));
            hashMap.put("signalRSSI", Integer.valueOf(q.w));
            hashMap.put("signalSINR", Integer.valueOf(q.x));
            hashMap.put("score", Integer.valueOf(q.y));
            if (!this.f10466a) {
                hashMap.put("temperature", Integer.valueOf(i.j(i.this).d().d));
            }
            ALog.e("falco.env.injector", "[injectEnvToApm] spend time: " + (System.currentTimeMillis() - currentTimeMillis), null, new Object[0]);
            this.b.a("additional_env", hashMap);
        }
    }

    public i(FalcoEnvironmentImpl falcoEnvironmentImpl) {
        this.f10465a = falcoEnvironmentImpl;
    }

    public static /* synthetic */ FalcoEnvironmentImpl j(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoEnvironmentImpl) ipChange.ipc$dispatch("d5e44191", new Object[]{iVar});
        }
        return iVar.f10465a;
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void b(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void c(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void d(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void e(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void f(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void g(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void h(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
        } else {
            l(vxm.b.j(fragment), true);
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
    public void i(FragmentManager fragmentManager, Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        c21.d(this);
        FalcoNativePageLifecycleCallbacks.a().c(this);
        FalcoNativePageLifecycleCallbacks.a().e(this);
        vxm vxmVar = vxm.b;
        l(vxmVar.c(), true);
        l(vxmVar.l(), true);
    }

    public final void l(mdd mddVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e648bcaf", new Object[]{this, mddVar, new Boolean(z)});
        } else if (mddVar == null) {
            ALog.e("falco.env.injector", "[injectEnvToApm] procedure is null", null, new Object[0]);
        } else {
            crt.d(new a(z, mddVar));
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            l(vxm.b.a(activity), true);
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            l(vxm.b.e(), false);
        }
    }
}
