package tb;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceInfo;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.api.TBAutoSizeDeviceBridge;
import com.taobao.android.autosize.api.TBAutoSizeGuideBridge;
import com.taobao.android.autosize.orientation.ConfigChangeProvider;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z5f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f32551a;

        public a(z5f z5fVar, Application application) {
            this.f32551a = application;
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            Log.e("TBAutoSize.Init", "ScreenConfigChangedCallback onConfigurationChanged, enter, listeners=null");
            if (configuration.screenWidthDp > configuration.screenHeightDp) {
                Log.e("TBAutoSize.Init", "ScreenConfigChangedCallback onConfigurationChanged return, width > height, this is illegal, new .dpi = " + configuration.densityDpi + ", new .width = " + configuration.screenWidthDp + ", new .height = " + configuration.screenHeightDp);
                return;
            }
            int u = TBAutoSizeConfig.x().u();
            int w = TBAutoSizeConfig.x().w();
            int v = TBAutoSizeConfig.x().v();
            if (configuration.densityDpi == u && configuration.screenWidthDp == w && configuration.screenHeightDp == v) {
                Log.e("TBAutoSize.Init", "ScreenConfigChangedCallback onConfigurationChanged return, dpi and widthDp not changed, new .dpi = " + configuration.densityDpi + ", old .dpi = " + u + ", new .width = " + configuration.screenWidthDp + ", old widthDP = " + w + ", new .height = " + configuration.screenHeightDp + ", old heightDP = " + v);
                return;
            }
            TBAutoSizeConfig.x().f0(this.f32551a, configuration);
            Activity y = TBAutoSizeConfig.x().y();
            if (y != null && !y.isDestroyed() && !y.isFinishing()) {
                Log.e("TBAutoSize.Init", "initOldFlow, onScreenConfigChanged, trigger TBAutoSize.autoSize() = " + y.getLocalClassName());
                d7r.b(y, TBAutoSizeConfig.x().s(), true);
            }
        }
    }

    public final void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab23f65", new Object[]{this, application});
            return;
        }
        try {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(k7m.KEY_DEVICE_TYPE, TBDeviceInfo.b(TBDeviceInfo.a(application)));
        } catch (Exception e) {
            TLog.loge("TBAutoSize.Init", "addCrashHeader:", e);
        }
    }

    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        fsw.h("TBAutoSizeDevice", TBAutoSizeDeviceBridge.class);
        fsw.h("TBAutoSizeGuideBridge", TBAutoSizeGuideBridge.class);
        a(application);
        ig4.m().q(application);
        ig4.m().r();
        if (ig4.m().u()) {
            boolean p = TBDeviceUtils.p(application);
            boolean P = TBDeviceUtils.P(application);
            if (p || P) {
                ldq.d().g(application);
                ldq.d().h(application);
                application.registerActivityLifecycleCallbacks(tam.b());
                com.taobao.tao.navigation.a.h(new frs(tam.b()));
                lqo.f(application);
                ConfigChangeProvider.i().j(application);
                String b = TBDeviceInfo.b(TBDeviceInfo.a(application));
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(k7m.KEY_DEVICE_TYPE, b);
                TLog.loge("TBAutoSize.Init", "init deviceType=" + b);
            }
            if (p) {
                xxa.g().i(application);
                ws9.d(application);
            }
            if (c(application)) {
                Log.e("TBAutoSize.Init", "initNewFlow, initSucc");
            } else {
                d(application);
            }
        }
    }

    public final boolean c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c80e793e", new Object[]{this, application})).booleanValue();
        }
        if (ig4.m().L() || ig4.m().l().contains(Build.MODEL)) {
            boolean p = TBDeviceUtils.p(application);
            boolean P = TBDeviceUtils.P(application);
            boolean k = TBDeviceUtils.k(application);
            Log.e("TBAutoSize.Init", "initForceRecreate,  foldDevice=" + p + ", tablet=" + P + ", easyGoSupported=" + k);
            if (!p && !P && !k) {
                return false;
            }
            TBAutoSizeConfig.x().P(application);
            if (TBDeviceUtils.t(application) || TBDeviceUtils.G(application)) {
                d7r.b(application, TBAutoSizeConfig.x().s(), true);
            }
            return true;
        }
        Log.e("TBAutoSize.Init", "initForceRecreate,  return");
        return false;
    }

    public final void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82df6193", new Object[]{this, application});
            return;
        }
        Log.e("TBAutoSize.Init", "initOldFlow, enter");
        if (TBDeviceUtils.P(application)) {
            TBAutoSizeConfig.x().P(application);
        }
        if (TBDeviceUtils.p(application)) {
            TBAutoSizeConfig.x().P(application);
            if (TBDeviceUtils.t(application) || TBDeviceUtils.G(application)) {
                d7r.b(application, TBAutoSizeConfig.x().s(), true);
            }
            TBAutoSizeConfig.x().c0(new a(this, application));
        }
    }
}
