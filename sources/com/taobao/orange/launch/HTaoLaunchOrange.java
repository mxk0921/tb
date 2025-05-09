package com.taobao.orange.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConfig;
import com.taobao.orange.OConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HTaoLaunchOrange implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HTaoLaunchOrange";

    static {
        t2o.a(613417074);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        String str;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        OLog.d(TAG, "init start", new Object[0]);
        String str2 = "*";
        OConstant.ENV env = OConstant.ENV.ONLINE;
        int envMode = env.getEnvMode();
        try {
            str2 = (String) hashMap.get("appVersion");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            envMode = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
            if (envMode == env.getEnvMode()) {
                str = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } else if (envMode == OConstant.ENV.PREPARE.getEnvMode()) {
                str = (String) hashMap.get(OConstant.LAUNCH_PREAPPKEY);
            } else {
                str = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = str2;
            OLog.e(TAG, "init", th, new Object[0]);
            str = "23070080";
            OrangeConfig.getInstance().init(application, new OConfig.Builder().setAppKey(str).setAppVersion(str2).setEnv(envMode).setServerType(OConstant.SERVER.TAOBAO.ordinal()).setIndexUpdateMode(OConstant.UPDMODE.O_XMD.ordinal()).setReportAck(false).build());
        }
        OrangeConfig.getInstance().init(application, new OConfig.Builder().setAppKey(str).setAppVersion(str2).setEnv(envMode).setServerType(OConstant.SERVER.TAOBAO.ordinal()).setIndexUpdateMode(OConstant.UPDMODE.O_XMD.ordinal()).setReportAck(false).build());
    }
}
