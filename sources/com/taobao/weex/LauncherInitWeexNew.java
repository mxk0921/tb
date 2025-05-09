package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.bridge.WXInitDelayTask;
import com.taobao.weex.common.WXConfig;
import com.taobao.weex.utils.TBWXConfigManger;
import java.io.Serializable;
import java.util.HashMap;
import tb.czr;
import tb.t2o;
import tb.wv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LauncherInitWeexNew implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849106);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        TLog.loge("Weex", "Weex", "enter LauncherInitWeex");
        long currentTimeMillis = System.currentTimeMillis();
        if (hashMap != null) {
            Object obj = hashMap.get("isDebuggable");
            if (obj instanceof Boolean) {
                WXEnvironment.addCustomOptions(WXConfig.debugMode, String.valueOf(obj));
            }
        }
        if (!czr.c() && !TBWXConfigManger.getInstance().offSingleProcessTask()) {
            WXSDKManager.getInstance().setUseSingleProcess(true);
        }
        WXInitDelayTask.getInstance().setEnableInitDelay(Boolean.TRUE);
        wv1.c(application, false, true, false, null);
        TLog.loge("weex", "init weex cost " + (System.currentTimeMillis() - currentTimeMillis));
        WXEnvironment.sSDKInitTaskTime = System.currentTimeMillis() - currentTimeMillis;
    }
}
