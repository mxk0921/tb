package com.taobao.linkmanager.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Launcher_InitLinkLifeCycle implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489108);
    }

    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            AfcLifeCycleCenter.instance().startMonitorSmartBanner(application, hashMap);
        }
    }
}
