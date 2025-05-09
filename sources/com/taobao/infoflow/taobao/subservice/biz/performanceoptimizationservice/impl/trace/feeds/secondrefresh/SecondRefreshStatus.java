package com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.impl.trace.feeds.secondrefresh;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SecondRefreshStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean isSecondRefreshEnd = false;

    static {
        t2o.a(491782562);
    }

    public static boolean isSecondRefreshEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9c8e69", new Object[0])).booleanValue();
        }
        return isSecondRefreshEnd;
    }

    public static void setSecondRefreshEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6874d7", new Object[]{new Boolean(z)});
        } else {
            isSecondRefreshEnd = z;
        }
    }
}
