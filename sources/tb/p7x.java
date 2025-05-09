package tb;

import android.app.Application;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_plugin.component.VideoPlatformView;
import com.taobao.android.weex_plugin.component.WebViewPlatformView;
import com.taobao.android.weex_uikit.UIKitEngine;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.weex2.AppWeexEngineAutoInit;
import com.taobao.taobao.weex2.modules.AliMUSLoginModule;
import io.unicorn.adapter.UnicornAdapterJNI;
import java.util.Map;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            try {
                MUSEngine.registerPlatformView("order-amap", cls);
            } catch (Exception unused) {
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            Map<String, Object> map = vvh.e() != null ? vvh.e().get("system") : null;
            if (map != null) {
                map.put(LoggingSPCache.STORAGE_LANGUAGE, language.getTag());
                com.taobao.android.weex.b.d().f(LoggingSPCache.STORAGE_LANGUAGE);
            }
        }
    }

    public static String a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41418815", new Object[]{application});
        }
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (Exception e) {
            dwh.i(e);
            return sd2._VERSION;
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf67e0e6", new Object[]{application});
            return;
        }
        u8x.i("WeexPluginInit.initUIKit");
        UIKitEngine.init();
        k8j.a(application);
        u8x.j();
    }

    public static void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970ecf8b", new Object[]{application});
            return;
        }
        u8x.i("WeexPluginInit.initWeexFramework");
        MUSEngine.registerModule("user", AliMUSLoginModule.class);
        e();
        u8x.j();
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d59288", new Object[0]);
        } else {
            Localization.a(new b());
        }
    }

    public static void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7315eeb1", new Object[]{application});
            return;
        }
        u8x.i("WeexPluginInit.setupUIKitConfig");
        f5x.u = g8j.class;
        u8x.j();
    }

    public static void g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313b2db", new Object[]{application});
            return;
        }
        u8x.i("WeexPluginInit.setupUnicornConfig");
        f5x.p = x9x.class;
        f5x.q = a4x.class;
        Map<String, String> map = f5x.builtinFontMaps;
        map.put("WeexTBIconFont", "uik_iconfont.ttf");
        map.put("WeexTBAlibabaSans102Bd", "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        map.put("WeexTBAlibabaSans102Md", k7z.ALIBABA_FONT_MIDDLE);
        map.put("WeexTBAlibabaSans102Rg", "iconfonts/AlibabaSans102_v1_TaoBao-Rg.ttf");
        u8x.j();
    }

    public static void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e75d096", new Object[]{application});
            return;
        }
        u8x.i("WeexPluginInit.setupWeexFrameworkConfig");
        f5x.h = r27.class;
        n3x.f24492a = qxh.class;
        Map<String, Object> map = f5x.wxEnvironment;
        map.put("appName", RVEnvironmentService.PLATFORM_TB);
        map.put("ttid", TaoHelper.getTTID());
        String str = " AliApp(TB/" + a(application) + f7l.BRACKET_END_STR;
        f5x.e = str;
        f5x.f = str;
        Map<String, Object> map2 = f5x.systemEnvironment;
        map2.put("processStartUpTimestamp", Long.valueOf(AppWeexEngineAutoInit.getProcessStartTime()));
        map2.put("launchStartUpTimestamp", Long.valueOf(TaobaoApplication.sStartTime));
        map2.put(LoggingSPCache.STORAGE_LANGUAGE, Localization.h().getTag());
        u8x.j();
    }

    public static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5463d0", new Object[]{application});
            return;
        }
        u8x.i("WeexPluginInit.initUnicorn");
        if (!UnicornAdapterJNI.instance().libraryLoaded()) {
            UnicornAdapterJNI.instance().init2(Globals.getApplication());
        } else {
            Log.e(dwh.TAG, "AppWeexEngineAutoInit.initUnicornEngine already loaded so");
        }
        if (ts8.c().a() == null) {
            ts8.c().b(new bs0());
        }
        MUSEngine.registerPlatformView("video", VideoPlatformView.class);
        MUSEngine.registerPlatformView("web", WebViewPlatformView.class);
        MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
        if (!w4x.s("amap_remove_enable", true, true)) {
            try {
                zk9.b("com.taobao.android.order.bundle.weex2.view.AMapPlatformView", new a());
            } catch (Exception unused) {
            }
        }
        w9x.a().c(new haw());
        u8x.j();
    }
}
