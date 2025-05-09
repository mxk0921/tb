package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.os.Build;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.extra.uc.UCSetupServiceUtil;
import android.taobao.windvane.extra.uc.init.WVDexOptimizer;
import android.taobao.windvane.startup.UCInitializerInfo;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OConstant;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import tb.b0s;
import tb.dpw;
import tb.lex;
import tb.lpw;
import tb.mdd;
import tb.mpw;
import tb.mrt;
import tb.oba;
import tb.og8;
import tb.r9u;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.vxm;
import tb.wpw;
import tb.x7j;
import tb.yaa;
import tb.yru;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindVaneWelComeTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVaneWelComeTask";

    static {
        t2o.a(989855986);
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return isXiaomiOrRedmi();
    }

    public static /* synthetic */ void access$100(WindVaneWelComeTask windVaneWelComeTask, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991f8abc", new Object[]{windVaneWelComeTask, application});
        } else {
            windVaneWelComeTask.preloadDexAsync(application);
        }
    }

    private void initNecessaryAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30366082", new Object[]{this});
            return;
        }
        dpw.a();
        x7j.a();
    }

    public static /* synthetic */ Object ipc$super(WindVaneWelComeTask windVaneWelComeTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/launch/WindVaneWelComeTask");
    }

    private static boolean isXiaomiOrRedmi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("376d9990", new Object[0])).booleanValue();
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        String lowerCase2 = Build.BRAND.toLowerCase();
        return lowerCase.contains("xiaomi") || lowerCase2.contains("xiaomi") || lowerCase2.contains(TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE) || Build.MODEL.toLowerCase().contains(TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE);
    }

    private void preloadDexAsync(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babc652a", new Object[]{this, application});
        } else {
            mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WindVaneWelComeTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    r9u.b("preloadDexSync");
                    WVDexOptimizer.preloadDexSafe(application);
                    r9u.d();
                }
            });
        }
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask, android.taobao.windvane.extra.launch.ILaunchInitTask
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return TAG;
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
            return;
        }
        r9u.b("TBWindVaneInitializer.init");
        b0s.a();
        r9u.d();
        r9u.b("initUCParams");
        initUCParams(application, hashMap);
        r9u.d();
        r9u.b("initNecessaryAPI");
        initNecessaryAPI();
        r9u.d();
        mrt.a().submit(new Runnable() { // from class: android.taobao.windvane.extra.launch.WindVaneWelComeTask.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                UCSetupServiceUtil.preloadUCNecessaryConfigSync();
                try {
                    wpw wpwVar = vpw.commonConfig;
                    if (wpwVar.k3 && (Build.VERSION.SDK_INT != 35 || !WindVaneWelComeTask.access$000() || wpwVar.l3)) {
                        WindVaneWelComeTask.access$100(WindVaneWelComeTask.this, application);
                    }
                } catch (Throwable th) {
                    v7t.d(WindVaneWelComeTask.TAG, "preloadDexAsync failed: " + th.getMessage());
                }
                UCSetupServiceUtil.configUCSettingsBeforeInit();
            }
        });
        mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WindVaneWelComeTask.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    mdd e = vxm.b.e();
                    if (e != null) {
                        for (Map.Entry<String, String> entry : oba.a().entrySet()) {
                            if (entry != null) {
                                e.a(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    private void initUCParams(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3174993f", new Object[]{this, application, hashMap});
            return;
        }
        UCInitializerInfo.a().c(14);
        yaa.n = application;
        if (!mpw.a().b()) {
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
            try {
                og8.f(((Boolean) hashMap.get("isDebuggable")).booleanValue());
            } catch (Exception unused) {
            }
        }
        UCInitializerInfo.a().c(15);
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
            mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.launch.WindVaneWelComeTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        WindVaneSDK.setEnvMode(EnvEnum.ONLINE);
                    } catch (Throwable th) {
                        v7t.d(WindVaneWelComeTask.TAG, "setEnvMode failed: " + th.getMessage());
                    }
                }
            });
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
        r9u.b("getUtdid");
        lpwVar.b = UTDevice.getUtdid(application);
        r9u.d();
        return lpwVar;
    }
}
