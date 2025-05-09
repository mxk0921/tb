package android.taobao.windvane.extra;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.extra.launch.WindVaneLaunchTask;
import android.taobao.windvane.extra.uc.UCSetupServiceUtil;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.ut.device.UTDevice;
import java.io.Serializable;
import java.util.HashMap;
import tb.b0s;
import tb.btw;
import tb.eqw;
import tb.gvm;
import tb.h8s;
import tb.lex;
import tb.lpw;
import tb.mpw;
import tb.og8;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.yaa;
import tb.yru;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitWVParamsTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InitWVParamsTask";

    static {
        t2o.a(989855923);
    }

    public static boolean isInitWVParamOpenV2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("393b098b", new Object[]{context})).booleanValue();
        }
        return !ABGlobal.isFeatureOpened(context, "OptInitWvParamV2");
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        b0s.a();
        if (h8s.a(application.getApplicationContext())) {
            TMSLogger.b("TMSEarlyInitializer", "skip InitWVParamsTask, but still run initAtWelcome");
            WindVaneLaunchTask.initAtWelcome(application, hashMap);
            return;
        }
        yaa.n = application;
        if (ABGlobal.isFeatureOpened(application, "OptInitWvParam") || isInitWVParamOpenV2(application)) {
            if (!mpw.a().b()) {
                initParams(application, hashMap);
            }
            og8.f(((Boolean) hashMap.get("isDebuggable")).booleanValue());
        } else {
            initParams(application, hashMap);
            vpw.b().d();
            btw.c().e();
            eqw.c().e();
            try {
                if (vpw.commonConfig.O) {
                    long currentTimeMillis = System.currentTimeMillis();
                    gvm.a(application);
                    v7t.d(TAG, "opt useTime PreStartup " + (System.currentTimeMillis() - currentTimeMillis));
                }
                AppMonitor.Alarm.commitFail("WindVane", "InitWVParamOld", "", "");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        UCSetupServiceUtil.configUCSettingsBeforeInit();
    }

    private void initParams(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb2c931", new Object[]{this, application, hashMap});
            return;
        }
        lpw obtainWVParams = obtainWVParams(application, hashMap);
        mpw.a().c(obtainWVParams);
        yru yruVar = new yru();
        yruVar.f32310a = "windvane";
        yruVar.b = "vKFaqtcEUEHI15lIOzsI6jIQldPpaCZ3";
        yruVar.e = 1;
        yruVar.d = 1;
        yruVar.c = og8.b();
        obtainWVParams.g = yruVar;
        yaa.f().k(obtainWVParams);
    }

    private lpw obtainWVParams(Application application, HashMap<String, Object> hashMap) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpw) ipChange.ipc$dispatch("f3c8a781", new Object[]{this, application, hashMap});
        }
        lpw lpwVar = new lpw();
        try {
            lpwVar.f23505a = (String) hashMap.get("ttid");
        } catch (Throwable unused) {
            v7t.d("InitWindVane", "failed to get ttid");
        }
        try {
            i = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
        } catch (Throwable unused2) {
            v7t.d("InitWindVane", "failed to get envIndex");
        }
        if (i == 0) {
            try {
                lpwVar.c = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused3) {
                v7t.d("InitWindVane", "failed to get onlineAppKey");
                lpwVar.c = "21646297";
            }
            WindVaneSDK.setEnvMode(EnvEnum.ONLINE);
        } else if (i == 1) {
            try {
                lpwVar.c = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused4) {
                lpwVar.c = "21646297";
                v7t.d("InitWind   Vane", "failed to get onlineAppKey");
            }
            WindVaneSDK.setEnvMode(EnvEnum.PRE);
        } else {
            try {
                lpwVar.c = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
            } catch (Throwable unused5) {
                lpwVar.c = "4272";
                v7t.d("InitWindVane", "failed to get dailyAppkey");
            }
            WindVaneSDK.setEnvMode(EnvEnum.DAILY);
        }
        lpwVar.d = RVEnvironmentService.PLATFORM_TB;
        lpwVar.f = lex.TB_UC_SDK_APP_KEY_SEC;
        lpwVar.e = "0.0.0";
        try {
            lpwVar.e = (String) hashMap.get("appVersion");
        } catch (Throwable unused6) {
            v7t.d("InitWindVane", "failed to get appVersion");
        }
        lpwVar.b = UTDevice.getUtdid(application);
        return lpwVar;
    }
}
