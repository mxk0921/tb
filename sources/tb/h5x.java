package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.config.WeexDarkMode;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import tb.d5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h5x implements d5x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DARK_MODE_ACTION = "com.taobao.android.weex.darkmode.action";
    public static final String KEY_DARK_MODE_EXTRA = "key_dark_mode_extra";

    /* renamed from: a  reason: collision with root package name */
    public volatile WeexDarkMode f20429a = WeexDarkMode.DARK;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final d5x f20430a = new h5x();

        static {
            t2o.a(982515737);
        }

        public static /* synthetic */ d5x a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d5x) ipChange.ipc$dispatch("50d23810", new Object[0]);
            }
            return f20430a;
        }
    }

    static {
        t2o.a(982515736);
        t2o.a(982515733);
    }

    public static Application l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("707577cd", new Object[0]);
        }
        return f5x.a();
    }

    public static d5x m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d5x) ipChange.ipc$dispatch("329d6895", new Object[0]);
        }
        return a.a();
    }

    public static boolean n(WeexInstanceMode weexInstanceMode, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a823bae", new Object[]{weexInstanceMode, application})).booleanValue();
        }
        if (w6x.r(weexInstanceMode)) {
            return false;
        }
        w6x.m(weexInstanceMode, application);
        return true;
    }

    public static void o(WeexInstanceMode weexInstanceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59b32f0", new Object[]{weexInstanceMode});
            return;
        }
        Application l = l();
        if (l != null) {
            n(weexInstanceMode, l);
        }
    }

    @Override // tb.d5x
    public void a(WeexInstanceMode weexInstanceMode, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364d94a2", new Object[]{this, weexInstanceMode, application});
        } else {
            w6x.m(weexInstanceMode, application);
        }
    }

    @Override // tb.d5x
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e7ef95", new Object[]{this, str})).booleanValue();
        }
        return jxh.d(str);
    }

    @Override // tb.d5x
    public void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136fbd3d", new Object[]{this, application});
        } else {
            w6x.m(null, application);
        }
    }

    @Override // tb.d5x
    public void d(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28675c4c", new Object[]{this, application, str});
        } else {
            t7x.d(application, str);
        }
    }

    @Override // tb.d5x
    public WeexDarkMode e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexDarkMode) ipChange.ipc$dispatch("11fffe7b", new Object[]{this});
        }
        return this.f20429a;
    }

    @Override // tb.d5x
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e31a4e3", new Object[]{this, str});
        } else {
            WeexPlatformCommonBridge.updateGlobalSystemEnv(str);
        }
    }

    @Override // tb.d5x
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7765f44c", new Object[]{this});
        } else {
            MUSCommonNativeBridge.d();
        }
    }

    @Override // tb.d5x
    public String getHttpAcceptHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eef4b06", new Object[]{this});
        }
        return c4x.a();
    }

    @Override // tb.d5x
    public String getUserAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[]{this});
        }
        o(WeexInstanceMode.SCRIPT);
        return vvh.g("userAgent");
    }

    @Override // tb.d5x
    public void h(String str, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544f071", new Object[]{this, str, cls});
        } else {
            ivu.e(str, new exp(cls));
        }
    }

    @Override // tb.d5x
    public void i(Application application, d5x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c2842c", new Object[]{this, application, aVar});
        } else {
            w6x.n(null, application, aVar);
        }
    }

    @Override // tb.d5x
    public void j(WeexInstanceMode weexInstanceMode, Application application, d5x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fc0f51", new Object[]{this, weexInstanceMode, application, aVar});
        } else {
            w6x.n(weexInstanceMode, application, aVar);
        }
    }

    @Override // tb.d5x
    public boolean k(WeexInstanceMode weexInstanceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315a9242", new Object[]{this, weexInstanceMode})).booleanValue();
        }
        return w6x.r(weexInstanceMode);
    }

    @Override // tb.d5x
    public void registerModule(String str, Class<? extends WeexModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e316fd", new Object[]{this, str, cls});
        } else {
            f7x.b(str, cls);
        }
    }
}
