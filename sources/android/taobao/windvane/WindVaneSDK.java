package android.taobao.windvane;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.io.File;
import java.io.IOException;
import tb.btw;
import tb.eqw;
import tb.hrw;
import tb.irw;
import tb.iuv;
import tb.lpw;
import tb.mpw;
import tb.opw;
import tb.ssw;
import tb.t2o;
import tb.v7t;
import tb.vc9;
import tb.vpw;
import tb.x74;
import tb.xg4;
import tb.xsw;
import tb.yaa;
import tb.ypw;
import tb.zpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindVaneSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SPNAME_ENV = "wv_evn";
    private static final String TAG = "WindVaneSDK";
    private static final String VALUE_NAME = "evn_value";
    private static final String WV_MULT = "wv_multi_";
    private static boolean initialized = false;
    private static boolean settedDataDirSuffix = false;

    static {
        t2o.a(989855749);
    }

    public static void init(Context context, lpw lpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65be601", new Object[]{context, lpwVar});
        } else {
            init(context, null, 0, lpwVar);
        }
    }

    private static void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            return;
        }
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
    }

    public static void initURLCache(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5293ba3b", new Object[]{context, str, new Integer(i)});
        } else {
            opw.e().g(context, str, i);
        }
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        return initialized;
    }

    public static boolean isTrustedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{str})).booleanValue();
        }
        return ssw.j(str);
    }

    public static void setEnvMode(EnvEnum envEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73c191f", new Object[]{envEnum});
        } else if (envEnum != null) {
            try {
                v7t.i(SPNAME_ENV, "setEnvMode : " + envEnum.getValue());
                yaa.j = envEnum;
                if (xg4.g(SPNAME_ENV, VALUE_NAME) != envEnum.getKey()) {
                    WVConfigManager.a().c();
                    xg4.l(SPNAME_ENV, VALUE_NAME, envEnum.getKey());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void webviewTarget28Support(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ff4e82", new Object[]{context});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String h = x74.h(context);
                if (!TextUtils.isEmpty(h)) {
                    WebView.setDataDirectorySuffix(h);
                    settedDataDirSuffix = true;
                }
            }
        } catch (Throwable unused) {
            if (!settedDataDirSuffix) {
                v7t.d(TAG, "WebView Android P Support Error");
            }
        }
    }

    @Deprecated
    public static void init(Context context, String str, int i, lpw lpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c2ca38", new Object[]{context, str, new Integer(i), lpwVar});
        } else {
            init(context, str, lpwVar);
        }
    }

    public static void init(Context context, String str, lpw lpwVar) {
        if (initialized) {
            v7t.i(TAG, "WindVaneSDK has already initialized");
            return;
        }
        v7t.i(TAG, "WindVaneSDK init");
        if (context != null) {
            webviewTarget28Support(context);
            Application application = (Application) (context instanceof Application ? context : context.getApplicationContext());
            yaa.n = application;
            if (application != null) {
                if (TextUtils.isEmpty(str)) {
                    str = VideoControllerManager.ARRAY_KEY_CACHES;
                }
                opw.e().g(context, str, 0);
                try {
                    zpw.b(context);
                } catch (Throwable unused) {
                }
                AssetManager assets = yaa.n.getResources().getAssets();
                try {
                    File e = vc9.e(yaa.n, "windvane/ucsdk");
                    File[] listFiles = e.listFiles();
                    if (listFiles != null && listFiles.length == 0) {
                        vc9.h(AssetsDelegate.proxy_open(assets, "uclibs.zip"), e.getAbsolutePath());
                    }
                    lpwVar.h = e.getAbsolutePath();
                    v7t.i(TAG, "UC init by uclibs");
                } catch (IOException unused2) {
                }
                if (!ABGlobal.isFeatureOpened(context, "OptInitWindVane")) {
                    yaa.f().k(lpwVar);
                } else if (!mpw.a().b()) {
                    yaa.f().k(lpwVar);
                }
                xg4.k();
                iuv.init();
                initConfig();
                irw.d(new hrw());
                try {
                    v7t.i(TAG, "trying to init uc core ");
                    IpChange ipChange = WVUCWebView.$ipChange;
                    WVUCWebView.class.getDeclaredMethod("staticInitializeOnce", new Class[0]).invoke(null, new Object[0]);
                    v7t.i(TAG, "init windvane called");
                } catch (Throwable th) {
                    v7t.o(TAG, "failed to load WVUCWebView", th, new Object[0]);
                }
                initialized = true;
                return;
            }
            throw new IllegalArgumentException("init error, context should be Application or its subclass");
        }
        throw new NullPointerException("init error, context is null");
    }
}
