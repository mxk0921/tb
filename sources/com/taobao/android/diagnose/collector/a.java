package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.NetworkObserver;
import com.taobao.tao.log.TLog;
import tb.cwj;
import tb.fjo;
import tb.idh;
import tb.qk7;
import tb.t2o;
import tb.ynb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends ynb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public NetworkObserver.NetworkStatusListener d;
    public boolean e;
    public fjo f;

    static {
        t2o.a(615514123);
    }

    public a(Application application, qk7 qk7Var) {
        super(application, qk7Var);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/APMCollector");
    }

    @Override // tb.ynb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            fjo fjoVar = new fjo(this.f32215a, this.b);
            this.f = fjoVar;
            fjoVar.a();
            c();
            d();
        } catch (Exception e) {
            TLog.loge("Diagnose", "APMCollector", "init failed: ", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6440b1", new Object[]{this});
            return;
        }
        fjo fjoVar = this.f;
        if (fjoVar != null) {
            fjoVar.d(4);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f3f934", new Object[]{this});
        } else if (!this.b.c().isLowDevice()) {
            idh.a("APMCollector", "initAppLifeCycleListener");
            this.f32215a.registerActivityLifecycleCallbacks(new AppLifecycleObserver(this.b, this.c, this.f));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cd5159", new Object[]{this});
            return;
        }
        idh.a("APMCollector", "initNetworkListener");
        if (!this.e) {
            try {
                NetworkObserver.b(cwj.a(this.f32215a));
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f32215a.getSystemService("connectivity");
                if (connectivityManager == null || Build.VERSION.SDK_INT < 26) {
                    this.d = new NetworkObserver.NetworkStatusListener();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    this.f32215a.registerReceiver(this.d, intentFilter);
                } else {
                    connectivityManager.registerDefaultNetworkCallback(new NetworkObserver.a(this.f32215a));
                }
                this.e = true;
            } catch (Exception e) {
                idh.c("APMCollector", "initNetworkListener", e);
            }
        }
    }

    public void e(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a13f7", new Object[]{this, aVar});
            return;
        }
        fjo fjoVar = this.f;
        if (fjoVar != null) {
            fjoVar.i(aVar);
        }
    }
}
