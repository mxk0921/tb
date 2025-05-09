package com.taobao.analysis.v3;

import com.android.alibaba.ip.runtime.IpChange;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FalcoGlobalTracer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static tz8 sTracer;

    private FalcoGlobalTracer() {
    }

    public static tz8 get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tz8) ipChange.ipc$dispatch("7e3d9cd0", new Object[0]);
        }
        return sTracer;
    }

    public static void setTracerDelegate(tz8 tz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a285f2", new Object[]{tz8Var});
        } else {
            sTracer = tz8Var;
        }
    }
}
