package com.taobao.falco;

import android.content.Context;
import android.net.wifi.WifiManager;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.Inet64Util;
import anetwork.channel.monitor.NetworkMetricsHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoEnvironmentImpl;
import java.util.concurrent.TimeUnit;
import tb.crt;
import tb.hz8;
import tb.uz8;
import tb.yy8;
import tb.z61;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w implements NetworkStatusHelper.INetworkStatusChangeListener, NetworkStatusHelper.IVpnProxyStatusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FalcoEnvironmentImpl f10487a;
    public volatile boolean c;
    public volatile boolean d;
    public int e = -1;
    public long f = 1000;
    public volatile e b = new e(new p());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                w.a(w.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetworkStatusHelper.NetworkStatus f10489a;

        public b(NetworkStatusHelper.NetworkStatus networkStatus) {
            this.f10489a = networkStatus;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                w.b(w.this, this.f10489a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10490a;
        public final /* synthetic */ boolean b;

        public c(boolean z, boolean z2) {
            this.f10490a = z;
            this.b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                w.c(w.this, this.f10490a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final w f10491a;

        public d(w wVar) {
            this.f10491a = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int rUMNetworkQualityLevel = NetworkQualityMonitor.getRUMNetworkQualityLevel();
            if (rUMNetworkQualityLevel != w.d(this.f10491a)) {
                w.e(this.f10491a, rUMNetworkQualityLevel);
            }
            crt.e(this, w.f(this.f10491a), TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f10492a = uz8.a();
        public final p b;

        public e(p pVar) {
            this.b = pVar;
        }
    }

    public w(FalcoEnvironmentImpl falcoEnvironmentImpl) {
        this.f10487a = falcoEnvironmentImpl;
    }

    public static /* synthetic */ void a(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec9415e", new Object[]{wVar});
        } else {
            wVar.q();
        }
    }

    public static /* synthetic */ void b(w wVar, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e426b16", new Object[]{wVar, networkStatus});
        } else {
            wVar.g(networkStatus);
        }
    }

    public static /* synthetic */ void c(w wVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8908e0", new Object[]{wVar, new Boolean(z), new Boolean(z2)});
        } else {
            wVar.i(z, z2);
        }
    }

    public static /* synthetic */ int d(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4eab88d4", new Object[]{wVar})).intValue();
        }
        return wVar.e;
    }

    public static /* synthetic */ void e(w wVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403d93e1", new Object[]{wVar, new Integer(i)});
        } else {
            wVar.h(i);
        }
    }

    public static /* synthetic */ long f(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83ed0dd7", new Object[]{wVar})).longValue();
        }
        return wVar.k();
    }

    public static int j(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df95bcc", new Object[]{new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 2;
        }
        if (z2) {
            return 1;
        }
        return 0;
    }

    public static int m() {
        WifiManager wifiManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d632225c", new Object[0])).intValue();
        }
        Context a2 = yy8.a();
        if (a2 == null || (wifiManager = (WifiManager) a2.getApplicationContext().getSystemService("wifi")) == null) {
            return -1;
        }
        return wifiManager.isWifiEnabled() ? 1 : 0;
    }

    public final void g(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fc2646", new Object[]{this, networkStatus});
            return;
        }
        p p = p(networkStatus);
        e eVar = new e(p);
        r(eVar, "NetworkInfo Update|falcoId=" + eVar.f10492a + ", " + p);
        this.f10487a.r(p);
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72091e3", new Object[]{this, new Integer(i)});
            return;
        }
        p pVar = this.b.b;
        p pVar2 = new p();
        pVar2.f10475a = pVar.f10475a;
        pVar2.b = pVar.b;
        pVar2.c = pVar.c;
        pVar2.d = pVar.d;
        pVar2.e = pVar.e;
        pVar2.f = pVar.f;
        int i2 = pVar.h;
        pVar2.g = i2;
        pVar2.h = i2;
        pVar2.i = pVar.i;
        pVar2.j = pVar.j;
        this.e = i;
        pVar2.k = i;
        e eVar = new e(pVar2);
        r(eVar, "NetworkInfo Update|falcoId=" + eVar.f10492a + ", netQualityLevel=" + pVar2.k);
        this.f10487a.r(pVar2);
    }

    public final void i(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda06eb5", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        p pVar = this.b.b;
        p pVar2 = new p();
        pVar2.f10475a = pVar.f10475a;
        pVar2.b = pVar.b;
        pVar2.c = pVar.c;
        pVar2.d = pVar.d;
        pVar2.e = pVar.e;
        pVar2.f = pVar.f;
        int i = pVar.h;
        pVar2.g = i;
        pVar2.h = i;
        pVar2.i = j(z, z2);
        pVar2.j = pVar.j;
        int rUMNetworkQualityLevel = NetworkQualityMonitor.getRUMNetworkQualityLevel();
        this.e = rUMNetworkQualityLevel;
        pVar2.k = rUMNetworkQualityLevel;
        e eVar = new e(pVar2);
        r(eVar, "NetworkInfo Update|falcoId=" + eVar.f10492a + ", proxyType=" + pVar2.i);
        this.f10487a.r(pVar2);
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1884d441", new Object[]{this})).longValue();
        }
        long j = this.f;
        long j2 = 10000;
        if (j >= 10000) {
            return j;
        }
        long j3 = j << 1;
        if (j3 <= 10000) {
            j2 = j3;
        }
        this.f = j2;
        return j;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        crt.d(new a());
        NetworkStatusHelper.addStatusChangeListener(this);
        NetworkStatusHelper.registerVpnProxyStatusListener(this);
    }

    public p n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("5e3d09d0", new Object[]{this});
        }
        return this.b.b;
    }

    public hz8 o() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hz8) ipChange.ipc$dispatch("30a64ddc", new Object[]{this});
        }
        double srttAvgCDN = NetworkMetricsHelper.getSrttAvgCDN();
        double srttMaxCDN = NetworkMetricsHelper.getSrttMaxCDN();
        double srttMinCDN = NetworkMetricsHelper.getSrttMinCDN();
        double srttAvgIDC = NetworkMetricsHelper.getSrttAvgIDC();
        double srttMaxIDC = NetworkMetricsHelper.getSrttMaxIDC();
        double srttMinIDC = NetworkMetricsHelper.getSrttMinIDC();
        double frttAvgCDN = NetworkMetricsHelper.getFrttAvgCDN();
        double frttMaxCDN = NetworkMetricsHelper.getFrttMaxCDN();
        double frttMinCDN = NetworkMetricsHelper.getFrttMinCDN();
        double frttAvgIDC = NetworkMetricsHelper.getFrttAvgIDC();
        double frttMaxIDC = NetworkMetricsHelper.getFrttMaxIDC();
        double frttMinIDC = NetworkMetricsHelper.getFrttMinIDC();
        double lossratioAvgCDN = NetworkMetricsHelper.getLossratioAvgCDN();
        double lossratioMaxCDN = NetworkMetricsHelper.getLossratioMaxCDN();
        double lossratioAvgIDC = NetworkMetricsHelper.getLossratioAvgIDC();
        double lossratioMaxIDC = NetworkMetricsHelper.getLossratioMaxIDC();
        hz8 hz8Var = new hz8();
        if (Double.isNaN(srttAvgCDN)) {
            srttAvgCDN = -1.0d;
        }
        hz8Var.f20981a = srttAvgCDN;
        if (Double.isNaN(srttMaxCDN)) {
            srttMaxCDN = -1.0d;
        }
        hz8Var.b = srttMaxCDN;
        if (Double.isNaN(srttMinCDN)) {
            srttMinCDN = -1.0d;
        }
        hz8Var.c = srttMinCDN;
        if (Double.isNaN(srttAvgIDC)) {
            srttAvgIDC = -1.0d;
        }
        hz8Var.d = srttAvgIDC;
        if (Double.isNaN(srttMaxIDC)) {
            srttMaxIDC = -1.0d;
        }
        hz8Var.e = srttMaxIDC;
        if (Double.isNaN(srttMinIDC)) {
            srttMinIDC = -1.0d;
        }
        hz8Var.f = srttMinIDC;
        if (Double.isNaN(frttAvgCDN)) {
            frttAvgCDN = -1.0d;
        }
        hz8Var.g = frttAvgCDN;
        if (Double.isNaN(frttMaxCDN)) {
            d2 = -1.0d;
        } else {
            d2 = frttMaxCDN;
        }
        hz8Var.h = d2;
        if (Double.isNaN(frttMinCDN)) {
            d3 = -1.0d;
        } else {
            d3 = frttMinCDN;
        }
        hz8Var.i = d3;
        if (Double.isNaN(frttAvgIDC)) {
            d4 = -1.0d;
        } else {
            d4 = frttAvgIDC;
        }
        hz8Var.j = d4;
        if (Double.isNaN(frttMaxIDC)) {
            d5 = -1.0d;
        } else {
            d5 = frttMaxIDC;
        }
        hz8Var.k = d5;
        if (Double.isNaN(frttMinIDC)) {
            d6 = -1.0d;
        } else {
            d6 = frttMinIDC;
        }
        hz8Var.l = d6;
        if (Double.isNaN(lossratioAvgCDN)) {
            d7 = -1.0d;
        } else {
            d7 = lossratioAvgCDN;
        }
        hz8Var.m = d7;
        if (Double.isNaN(lossratioMaxCDN)) {
            d8 = -1.0d;
        } else {
            d8 = lossratioMaxCDN;
        }
        hz8Var.n = d8;
        if (Double.isNaN(lossratioAvgIDC)) {
            d9 = -1.0d;
        } else {
            d9 = lossratioAvgIDC;
        }
        hz8Var.o = d9;
        if (Double.isNaN(lossratioMaxIDC)) {
            d10 = -1.0d;
        } else {
            d10 = lossratioMaxIDC;
        }
        hz8Var.p = d10;
        hz8Var.q = NetworkMetricsHelper.getRecentWinCount();
        hz8Var.r = NetworkMetricsHelper.getRecentWinFail();
        hz8Var.s = NetworkMetricsHelper.getRecentWinBWE();
        hz8Var.t = NetworkMetricsHelper.getMtuCDN();
        hz8Var.u = NetworkMetricsHelper.getMtuIDC();
        hz8Var.v = NetworkMetricsHelper.getSignalDBM();
        hz8Var.w = NetworkMetricsHelper.getSignalRSSI();
        hz8Var.x = NetworkMetricsHelper.getSignalSINR();
        hz8Var.y = NetworkMetricsHelper.getSore();
        int i = this.b.b.k;
        return hz8Var;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
        } else {
            crt.d(new b(networkStatus));
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
    public void onVpnProxyStatusChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            crt.d(new c(z, z2));
        }
    }

    public final p p(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("9776a344", new Object[]{this, networkStatus});
        }
        String type = networkStatus.getType();
        p pVar = new p();
        if ("NONE".equals(type) || "NO".equals(type)) {
            type = "NoNetwork";
        }
        pVar.f10475a = type;
        pVar.b = NetworkStatusHelper.getApn();
        pVar.c = NetworkStatusHelper.getWifiSSID();
        pVar.d = NetworkStatusHelper.getCarrier();
        pVar.e = NetworkStatusHelper.isAirplaneMode();
        pVar.f = m();
        pVar.g = NetworkStatusHelper.isWifiRestricted();
        pVar.h = NetworkStatusHelper.isCellularRestricted();
        pVar.i = j(NetworkStatusHelper.isVpn(), NetworkStatusHelper.isProxy());
        pVar.j = Inet64Util.getStackType();
        int rUMNetworkQualityLevel = NetworkQualityMonitor.getRUMNetworkQualityLevel();
        this.e = rUMNetworkQualityLevel;
        pVar.k = rUMNetworkQualityLevel;
        return pVar;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cb61d3", new Object[]{this});
            return;
        }
        p p = p(NetworkStatusHelper.getStatus());
        e eVar = new e(p);
        r(eVar, "NetworkInfo Init|falcoId=" + eVar.f10492a + ", " + p);
        this.f10487a.r(p);
        crt.e(new d(this), k(), TimeUnit.MILLISECONDS);
    }

    public final void r(e eVar, String str) {
        String str2;
        e eVar2 = eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad3a27d", new Object[]{this, eVar2, str});
            return;
        }
        this.b = eVar2;
        if (this.d) {
            if (!this.c) {
                this.c = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("isAirplaneMode");
                create.addMeasure("isWifiEnabled");
                create.addMeasure("isWifiRestricted");
                create.addMeasure("isCellularRestricted");
                create.addMeasure("proxyType");
                create.addMeasure("ipStack");
                create.addMeasure("netQualityLevel");
                str2 = "isAirplaneMode";
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("falcoId");
                create2.addDimension("netType");
                create2.addDimension("apn");
                create2.addDimension("wifiSsid");
                create2.addDimension(DispatchConstants.CARRIER);
                z61.i(FalcoEnvironmentImpl.MONITOR_MODULE, "falco_network", create, create2, true);
            } else {
                str2 = "isAirplaneMode";
            }
            MeasureValueSet create3 = MeasureValueSet.create();
            eVar2 = eVar;
            create3.setValue(str2, eVar2.b.e);
            create3.setValue("isWifiEnabled", eVar2.b.f);
            create3.setValue("isWifiRestricted", eVar2.b.g);
            create3.setValue("isCellularRestricted", eVar2.b.h);
            create3.setValue("proxyType", eVar2.b.i);
            create3.setValue("ipStack", eVar2.b.j);
            create3.setValue("netQualityLevel", eVar2.b.k);
            DimensionValueSet create4 = DimensionValueSet.create();
            create4.setValue("falcoId", eVar2.f10492a);
            create4.setValue("netType", eVar2.b.f10475a);
            create4.setValue("apn", eVar2.b.b);
            create4.setValue("wifiSsid", eVar2.b.c);
            create4.setValue(DispatchConstants.CARRIER, eVar2.b.d);
            z61.f(FalcoEnvironmentImpl.MONITOR_MODULE, "falco_network", create4, create3);
        }
        this.f10487a.p(str);
        this.f10487a.u(FalcoEnvironmentImpl.Category.NETWORK, eVar2.f10492a);
    }
}
