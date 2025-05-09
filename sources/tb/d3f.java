package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.util.OLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d3f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(613417075);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        OLog.i("InitOrangeFetch", "orange fetch start", new Object[0]);
        OConstant.ENV env = OConstant.ENV.ONLINE;
        int envMode = env.getEnvMode();
        String str = "21646297";
        String str2 = "*";
        if (hashMap != null) {
            try {
                if (hashMap.size() > 0) {
                    String str3 = (String) hashMap.get("appVersion");
                    try {
                        envMode = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
                        if (envMode == env.getEnvMode()) {
                            str = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
                        } else if (envMode == OConstant.ENV.PREPARE.getEnvMode()) {
                            str = (String) hashMap.get(OConstant.LAUNCH_PREAPPKEY);
                        } else {
                            if (envMode == OConstant.ENV.TEST.getEnvMode()) {
                                str = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
                            }
                            str2 = str3;
                        }
                        str2 = str3;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str3;
                        OLog.e("InitOrangeFetch", "init", th, new Object[0]);
                        OrangeConfig.getInstance().fetchCriticalConfigs(application, str, str2, envMode);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        OrangeConfig.getInstance().fetchCriticalConfigs(application, str, str2, envMode);
    }
}
