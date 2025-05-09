package com.taobao.keepalive;

import android.app.Application;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.Constants;
import java.util.HashMap;
import tb.hkq;
import tb.o41;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Launcher_InitKeepAlive {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(499122183);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            o41.c(application);
            AnalyticsMgr.P(application);
            String str = (String) hashMap.get("process");
            hkq.b("keepalive", Constants.POINT_FULL_VERIFY, "Launcher_InitKeepAlive-" + str, vu3.b.GEO_NOT_SUPPORT);
        } catch (Exception unused) {
        }
    }
}
