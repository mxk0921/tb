package tb;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceStatus;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.bridge.WeexPlatformThreadBridge;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.util.WeexInstanceChecker;
import com.taobao.android.weex.west.WestPageModule;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.android.weex_framework.module.builtin.WXAppMonitorModule;
import com.taobao.android.weex_framework.module.builtin.WXAudioModule;
import com.taobao.android.weex_framework.module.builtin.WXDevModule;
import com.taobao.android.weex_framework.module.builtin.WXDomModule;
import com.taobao.android.weex_framework.module.builtin.WXLocalStorageModule;
import com.taobao.android.weex_framework.module.builtin.WXNativeApiModule;
import com.taobao.android.weex_framework.module.builtin.WXNavigatorModule;
import com.taobao.android.weex_framework.module.builtin.WXSessionStorageModule;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.android.weex_framework.module.builtin.WXWindowModule;
import com.taobao.android.weex_framework.module.builtin.stream.WXStreamModule;
import com.taobao.android.weex_framework.performance.WMInstanceApm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f21111a = false;
    public static volatile int b = 0;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexEngineInit$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            u8x.i("WeexPreInitAsync");
            oxh.d().e();
            WeexDOMInstance.preloadClass();
            awh.i();
            tvh.k();
            jkj.c();
            rvh.b();
            MUSInstanceConfig.n();
            MUSInstanceConfig.MUSRenderType.preloadClass();
            MUSInstanceConfig.RenderMode.preloadClass();
            b9x.e();
            g6x.a();
            e7x.g();
            WeexInstanceStatus.preloadClass();
            nxh.h();
            fxh.l();
            WeexValueImpl.preloadClass();
            WeexPlatformInstanceBridge.preloadClass();
            WeexPlatformThreadBridge.preloadClass();
            p9x.q();
            iq2.e();
            v3x.f();
            x8x.Y();
            WMInstanceApm.j();
            o6a.b();
            u8x.j();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexEngineInit$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            u8x.i("WeexPostInitAsync");
            u8x.j();
        }
    }

    static {
        t2o.a(982515738);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf67e0e6", new Object[]{application});
        } else if (!e) {
            e = true;
            h(application);
        }
    }

    public static synchronized void b(Application application) {
        synchronized (i5x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e5463d0", new Object[]{application});
            } else if (!d) {
                d = true;
                u8x.i("WeexEngineInit.initUnicorn");
                u8x.j();
            }
        }
    }

    public static synchronized void c(Application application) {
        synchronized (i5x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("970ecf8b", new Object[]{application});
            } else if (!c) {
                c = true;
                u8x.i("WeexEngineInit.initWeexFramework");
                boolean m = vvh.m();
                dwh.t(m);
                u8x.i("WeexRVLogInit");
                lcn.n(application);
                u8x.j();
                u8x.i("WeexLoadSo");
                MUSCommonNativeBridge.d();
                u8x.j();
                u8x.i("SOInitAfterSDKLoad");
                WeexPlatformCommonBridge.initAfterSDKLoad();
                u8x.j();
                u8x.i("WeexRegisterModule");
                f();
                u8x.j();
                if (m) {
                    WeexInstanceChecker.h();
                }
                d();
                u8x.j();
            }
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d3480a", new Object[0]);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b());
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b00c9f", new Object[0]);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5cdac6", new Object[0]);
            return;
        }
        f7x.a(pg1.ATOM_EXT_window, WXWindowModule.class);
        f7x.a("stream", WXStreamModule.class);
        f7x.a("@mus-module/stream", WXStreamModule.class);
        f7x.a("dom", WXDomModule.class);
        f7x.a(WXDevModule.NAME, WXDevModule.class);
        f7x.a("sessionStorage", WXSessionStorageModule.class);
        f7x.a(WXLocalStorageModule.NAME, WXLocalStorageModule.class);
        f7x.a(WXStorageModule.NAME, WXStorageModule.class);
        f7x.a("MUSAppMonitor", WXAppMonitorModule.class);
        f7x.a("navigator", WXNavigatorModule.class);
        f7x.a(yuw.LOG_TAG, WXNativeApiModule.class);
        f7x.a("audio", WXAudioModule.class);
        com.taobao.android.weex.b.d().registerModule(WestPageModule.NAME, WestPageModule.class);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546b19b2", new Object[0]);
        } else if (!f21111a) {
            int i = b;
            b = i + 1;
            if (i > 5) {
                f21111a = true;
                return;
            }
            try {
                long f = yox.f();
                if (f != 0) {
                    WeexPlatformCommonBridge.registerZCacheAPI(f);
                    f21111a = true;
                }
            } catch (Throwable th) {
                if ((th instanceof NoClassDefFoundError) || (th instanceof NoSuchMethodError)) {
                    f21111a = true;
                    dwh.f("WeexZCacheInit", "register getAccessAPI error");
                    return;
                }
                dwh.g("WeexZCacheInit", "register getAccessAPI error", th);
            }
        }
    }

    public static void h(Application application) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c856801", new Object[]{application});
        } else if (Build.VERSION.SDK_INT >= 29) {
            ApplicationInfo applicationInfo = application.getApplicationInfo();
            if (applicationInfo != null && applicationInfo.targetSdkVersion >= 30) {
                z = true;
            }
            vvh.h = z;
        }
    }
}
