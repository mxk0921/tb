package com.tmall.android.dai.internal.init;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamListener;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamSource;
import com.tmall.android.dai.internal.streamprocessing.WalleUtTrackerListener;
import com.tmall.android.dai.internal.util.DeviceInfos;
import com.tmall.android.dai.internal.util.LogUtil;
import com.tmall.android.dai.internal.windvane.WVDaiApiPlugin;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.cuv;
import tb.fsw;
import tb.gtf;
import tb.i2v;
import tb.iph;
import tb.iwt;
import tb.kzo;
import tb.ld0;
import tb.lu0;
import tb.mdt;
import tb.oqh;
import tb.pow;
import tb.ptf;
import tb.ral;
import tb.t2o;
import tb.vxa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WalleInitBridgeJava {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WalleInitBridgeJava f14209a = new WalleInitBridgeJava();

        static {
            t2o.a(1034944645);
        }

        public static /* synthetic */ WalleInitBridgeJava a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WalleInitBridgeJava) ipChange.ipc$dispatch("a27d9c57", new Object[0]);
            }
            return f14209a;
        }
    }

    static {
        t2o.a(1034944644);
    }

    public static WalleInitBridgeJava a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WalleInitBridgeJava) ipChange.ipc$dispatch("540a60f2", new Object[0]);
        }
        return a.a();
    }

    public static void q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19f790c", new Object[]{new Integer(i), str});
            return;
        }
        lu0.a("Business", "initialize", String.valueOf(i), str);
        kzo.c().s(true);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e195c72", new Object[]{this})).booleanValue();
        }
        TaskManager.getInstance().onNativeInit();
        return true;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6946a0e8", new Object[]{this})).booleanValue();
        }
        DAIUserAdapter c = ld0.c();
        if (c != null) {
            vxa.i(kzo.c().b(), c.getTtid());
            return true;
        }
        LogUtil.w("WalleInitBridgeJava", "highway client not init!");
        lu0.d("DAI", 19999, "init_error", "highway client", null, null);
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e74b60", new Object[]{this})).booleanValue();
        }
        gtf.i().l(kzo.c().b().getApplicationContext());
        return true;
    }

    public final boolean g() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a57eda", new Object[]{this})).booleanValue();
        }
        try {
            z = iph.a();
            if (!z) {
                LogUtil.e("WalleInitBridgeJava", "MNNBridge load fail");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return z;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e4558f0", new Object[]{this})).booleanValue();
        }
        MRT.h(kzo.c().b());
        oqh.d().c(ral.e().c(), ral.e().d(), "ODCP");
        return true;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a5d8e4", new Object[]{this})).booleanValue();
        }
        ptf.b().e();
        return true;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51585eee", new Object[]{this})).booleanValue();
        }
        DeviceInfos.b();
        WalleStreamListener.getInstance().registerCallbackToStreamConstructor();
        WalleStreamSource.getInstance();
        return true;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a08a54", new Object[]{this})).booleanValue();
        }
        try {
            pow.d(kzo.c().b());
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "WADataCollector初始化失败.", th);
            return false;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78eb955", new Object[]{this})).booleanValue();
        }
        kzo.c().a().c();
        return r();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a48bc1b7", new Object[]{this})).booleanValue();
        }
        p();
        return g();
    }

    public native void nativeInitWalle();

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b374818d", new Object[]{this})).booleanValue();
        }
        WalleUtTrackerListener.a().c();
        return true;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5aa1fb", new Object[]{this})).booleanValue();
        }
        try {
            fsw.h("WVDAIHandler", WVDaiApiPlugin.class);
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "WV插件注册失败。", th);
            return false;
        }
    }

    public boolean r() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb97d565", new Object[]{this})).booleanValue();
        }
        boolean n = n();
        if (!k() || !n) {
            z = false;
        } else {
            z = true;
        }
        if (f() && z) {
            z2 = true;
        }
        iwt.e().k();
        return z2;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdd68c4", new Object[]{this})).booleanValue();
        }
        if (kzo.c().o()) {
            return true;
        }
        try {
            LogUtil.d("WalleInitBridgeJava", "initBridge start");
            mdt.e().f();
            LogUtil.d("WalleInitBridgeJava", "initBridge addTaskInner success");
            kzo.c().v(true);
            LogUtil.d("WalleInitBridgeJava", "initBridge success");
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "initBridge error!!!", th);
            q(181, th.getMessage());
            lu0.d("DAI", 19999, "init_error", "java-c bridge", null, null);
            return false;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9693fda2", new Object[]{this})).booleanValue();
        }
        if (kzo.c().n()) {
            return true;
        }
        try {
            DbManager.getInstance().initIfNeeded();
            kzo.c().u(true);
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "初始化数据层失败.", th);
            q(181, th.getMessage());
            lu0.d("DAI", 19999, "init_error", "java-c-data bridge", null, null);
            return false;
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2613a88", new Object[]{this})).booleanValue();
        }
        try {
            i2v.getInstance().registerPlugin(new cuv());
            return true;
        } catch (Throwable th) {
            q(97, th.getMessage());
            lu0.d("DAI", 19999, "init_error", "ut plugin", null, null);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r6.equals("WalleConfigUpdateListener") == false) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean initWalleJavaModule(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tmall.android.dai.internal.init.WalleInitBridgeJava.initWalleJavaModule(java.lang.String):boolean");
    }
}
