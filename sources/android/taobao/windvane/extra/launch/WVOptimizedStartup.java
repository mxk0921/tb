package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.os.SystemClock;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.extra.config.TBConfigManager;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.jsbridge.JSAPIManager;
import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.btw;
import tb.eqw;
import tb.gqw;
import tb.gvm;
import tb.jpw;
import tb.l8e;
import tb.lcn;
import tb.mrt;
import tb.r9u;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.xg4;
import tb.xsw;
import tb.ypw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVOptimizedStartup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVane/PreStartUp";
    private static final AtomicBoolean sInitialized = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Params {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Application application;

        static {
            t2o.a(989855977);
        }

        public Params(Application application) {
            this.application = application;
        }

        public static /* synthetic */ Application access$100(Params params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("40fe6a5a", new Object[]{params});
            }
            return params.application;
        }
    }

    static {
        t2o.a(989855973);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            disableVerifyClass();
        }
    }

    public static /* synthetic */ void access$200(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ec9306", new Object[]{application});
        } else {
            initConfig(application);
        }
    }

    public static /* synthetic */ void access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            initJSAPIAndEmbed();
        }
    }

    private static void disableVerifyClass() {
        l8e l8eVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e358297e", new Object[0]);
            return;
        }
        boolean z2 = vpw.commonConfig.B2;
        if (z2 && (l8eVar = (l8e) jpw.c().a(l8e.class)) != null) {
            z = l8eVar.a();
        }
        v7t.d(TAG, "disableVerifySwitchEnabled: " + z2 + ", verifyDisabled: " + z);
    }

    private static void initConfig(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce180d06", new Object[]{application});
            return;
        }
        TBConfigManager.getInstance().initEarly(application);
        xg4.k();
        vpw.b().d();
        btw.c().e();
        eqw.c().e();
        ypw.b().d();
        xsw.b().d();
        WVConfigManager.a().b("windvane_common", vpw.b());
        WVConfigManager.a().b("windvane_domain", eqw.c());
        WVConfigManager.a().b("WindVane_URL_config", btw.c());
        WVConfigManager.a().b(WVConfigManager.CONFIGNAME_COOKIE, ypw.b());
        WVConfigManager.a().b("windvane_uc_core", xsw.b());
        TBConfigManager.getInstance().initConfig();
    }

    private static void initJSAPIAndEmbed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7f2a6a", new Object[0]);
            return;
        }
        JSAPIManager.getInstance().register();
        gqw.a();
    }

    private static boolean isParamsValid(Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab4a61ea", new Object[]{params})).booleanValue();
        }
        if (params == null || Params.access$100(params) == null) {
            return false;
        }
        return true;
    }

    public static void startup(final Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dff557", new Object[]{params});
            return;
        }
        AtomicBoolean atomicBoolean = sInitialized;
        if (!atomicBoolean.get()) {
            if (!isParamsValid(params)) {
                lcn.f(RVLLevel.Error, TAG, "params is invalid");
            } else if (atomicBoolean.compareAndSet(false, true)) {
                boolean isUCStartInit = WVCore.getInstance().isUCStartInit();
                lcn.a(RVLLevel.Info, TAG).j("startup").a("isInitStart", Boolean.valueOf(isUCStartInit)).f();
                if (!isUCStartInit) {
                    mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WVOptimizedStartup.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            r9u.b("disableVerifyClass");
                            WVOptimizedStartup.access$000();
                            r9u.d();
                        }
                    });
                    mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WVOptimizedStartup.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                r9u.b("initCore");
                                WVUCWebView.initUCCore();
                                r9u.d();
                                lcn.a(RVLLevel.Info, WVOptimizedStartup.TAG).j("startup").a("initUCCoreCost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).f();
                            } catch (Exception e) {
                                RVLLevel rVLLevel = RVLLevel.Error;
                                lcn.f(rVLLevel, WVOptimizedStartup.TAG, "startup error" + e.getMessage());
                            }
                        }
                    });
                    mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WVOptimizedStartup.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long uptimeMillis = SystemClock.uptimeMillis();
                            try {
                                r9u.b("initConfig");
                                WVOptimizedStartup.access$200(Params.access$100(Params.this));
                                r9u.d();
                            } catch (Exception e) {
                                RVLLevel rVLLevel = RVLLevel.Error;
                                lcn.f(rVLLevel, WVOptimizedStartup.TAG, "initConfig error" + e.getMessage());
                            }
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            r9u.b("initJSAPIAndEmbed");
                            WVOptimizedStartup.access$300();
                            r9u.d();
                            lcn.a(RVLLevel.Info, WVOptimizedStartup.TAG).j("startup").a("configInitCost", Long.valueOf(uptimeMillis2 - uptimeMillis)).a("jsapiInitCost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2)).f();
                        }
                    });
                    gvm.a(Params.access$100(params));
                }
            }
        }
    }
}
