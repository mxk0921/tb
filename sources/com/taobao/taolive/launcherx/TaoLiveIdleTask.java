package com.taobao.taolive.launcherx;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import java.io.Serializable;
import java.util.HashMap;
import tb.o3s;
import tb.t2o;
import tb.yvs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoLiveIdleTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaoLiveIdleTask";
    public static volatile long sLiveInitTime = -1;

    static {
        t2o.a(806355560);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.loge("TBLive", TAG, "init");
        sLiveInitTime = System.currentTimeMillis();
        o3s.b(TAG, "init");
        FlexaLiveX.o().z(FlexaLiveX.TAOLIVE_HOMEPAGE, false, application);
        FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, application);
        FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, application);
        yvs.c();
        yvs.b(application);
        yvs.g(application);
        TLog.loge("TBLive", TAG, "dx preload success");
        TaoLiveLaunchInitializer.init();
        TLog.loge("TBLive", TAG, "live init success");
    }
}
