package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.extra.config.TBConfigManager;
import android.taobao.windvane.extra.launch.WVOptimizedStartup;
import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.btw;
import tb.eqw;
import tb.gvm;
import tb.lqw;
import tb.nrw;
import tb.psw;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.xg4;
import tb.xrw;
import tb.xsw;
import tb.ypw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindVaneHomeVisibleTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855978);
    }

    private void initUCAndPreStartup(Application application, HashMap<String, Object> hashMap) {
        gvm.a(application);
        try {
            v7t.i("WindVaneSDK", "trying to init uc core ");
            IpChange ipChange = WVUCWebView.$ipChange;
            WVUCWebView.class.getDeclaredMethod("staticInitializeOnce", new Class[0]).invoke(null, new Object[0]);
            v7t.i("WindVaneSDK", "init windvane called");
        } catch (Throwable th) {
            v7t.o("WindVaneSDK", "failed to load WVUCWebView", th, new Object[0]);
        }
    }

    private void initWindVaneConfig(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4772e957", new Object[]{this, application, hashMap});
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

    public static /* synthetic */ Object ipc$super(WindVaneHomeVisibleTask windVaneHomeVisibleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/launch/WindVaneHomeVisibleTask");
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask, android.taobao.windvane.extra.launch.ILaunchInitTask
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "WindVaneHomeVisibleTask";
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
            return;
        }
        WVOptimizedStartup.startup(new WVOptimizedStartup.Params(application));
        lqw.d().c(xrw.getInstance(), lqw.e);
        nrw.init();
        psw.b(new WVSchemeProcessor());
    }
}
