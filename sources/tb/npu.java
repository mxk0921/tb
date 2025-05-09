package tb;

import android.app.Application;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class npu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(768606212);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        hi2.b();
        if (t.a(application, "turbotBootEarly")) {
            hi2.c(application, hashMap, LogStrategyManager.ACTION_TYPE_BOOT);
        }
    }
}
