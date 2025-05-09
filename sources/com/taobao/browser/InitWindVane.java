package com.taobao.browser;

import android.app.Application;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.config.EnvEnum;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.speed.TBSpeed;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.orange.OConstant;
import com.ut.device.UTDevice;
import java.io.Serializable;
import java.util.HashMap;
import tb.azr;
import tb.lex;
import tb.lpw;
import tb.mpw;
import tb.t1m;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class InitWindVane implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitWindVane";

    static {
        t2o.a(619708468);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        lpw lpwVar = new lpw();
        if (!ABGlobal.isFeatureOpened(application, "OptInitWindVane")) {
            initParam(application, hashMap, lpwVar);
        } else if (!mpw.a().b()) {
            initParam(application, hashMap, lpwVar);
        }
        try {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new azr());
        } catch (Throwable unused) {
        }
        lex.b(application, "taobao", 0, lpwVar, hashMap);
    }

    private void initParam(Application application, HashMap<String, Object> hashMap, lpw lpwVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79c3348", new Object[]{this, application, hashMap, lpwVar});
            return;
        }
        try {
            t1m.b(application);
            lpwVar.getClass();
            t1m.c(application);
        } catch (Throwable unused) {
            y7t.a(TAG, "failed to get imei & imsi");
        }
        try {
            lpwVar.f23505a = (String) hashMap.get("ttid");
        } catch (Throwable unused2) {
            y7t.a(TAG, "failed to get ttid");
        }
        try {
            i = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
        } catch (Throwable unused3) {
            y7t.a(TAG, "failed to get envIndex");
        }
        if (i == 0) {
            try {
                lpwVar.c = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused4) {
                y7t.a(TAG, "failed to get onlineAppKey");
                lpwVar.c = "21646297";
            }
            if (TextUtils.isEmpty(lpwVar.c)) {
                lpwVar.c = "21646297";
            }
            WindVaneSDK.setEnvMode(EnvEnum.ONLINE);
        } else if (i == 1) {
            try {
                lpwVar.c = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused5) {
                lpwVar.c = "21646297";
                y7t.a(TAG, "failed to get onlineAppKey");
            }
            if (TextUtils.isEmpty(lpwVar.c)) {
                lpwVar.c = "21646297";
            }
            WindVaneSDK.setEnvMode(EnvEnum.PRE);
        } else {
            try {
                lpwVar.c = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
            } catch (Throwable unused6) {
                lpwVar.c = "4272";
                y7t.a(TAG, "failed to get dailyAppkey");
            }
            if (TextUtils.isEmpty(lpwVar.c)) {
                lpwVar.c = "4272";
            }
            WindVaneSDK.setEnvMode(EnvEnum.DAILY);
        }
        try {
            lpwVar.i = TBSpeed.isSpeedEdition(application, "windvane");
        } catch (Throwable unused7) {
        }
        lpwVar.getClass();
        lpwVar.d = RVEnvironmentService.PLATFORM_TB;
        try {
            lpwVar.e = (String) hashMap.get("appVersion");
        } catch (Throwable unused8) {
            y7t.a(TAG, "failed to get appVersion");
        }
        if (ABGlobal.isFeatureOpened(application, "OptInitWindVane")) {
            lpwVar.b = (String) hashMap.get("deviceId");
        } else {
            lpwVar.b = UTDevice.getUtdid(application);
        }
    }
}
