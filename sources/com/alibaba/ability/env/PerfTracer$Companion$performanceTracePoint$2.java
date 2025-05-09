package com.alibaba.ability.env;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import tb.cjf;
import tb.d1a;
import tb.jfp;
import tb.kfp;
import tb.ovc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PerfTracer$Companion$performanceTracePoint$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PerfTracer$Companion$performanceTracePoint$2 INSTANCE = new PerfTracer$Companion$performanceTracePoint$2();

    public PerfTracer$Companion$performanceTracePoint$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(PerfTracer$Companion$performanceTracePoint$2 perfTracer$Companion$performanceTracePoint$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/env/PerfTracer$Companion$performanceTracePoint$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        Set<String> c = jfp.c("duration");
        Set<String> h = kfp.h("namespace", "callType", MUSMonitor.MODULE_DIM_ABILITY, "api", "isFullTrace", "deviceLevel", "tags", "stages");
        ovc h2 = cjf.INSTANCE.h();
        if (h2 != null) {
            h2.a("Megability", "PerformanceTrace", c, h, true);
        }
        return "PerformanceTrace";
    }
}
