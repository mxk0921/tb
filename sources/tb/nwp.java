package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class nwp implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299820);
        t2o.a(589299812);
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        if (!ErrorConstant.isIllegelSign(w4jVar.c.getRetCode())) {
            return "CONTINUE";
        }
        MtopStatistics mtopStatistics = w4jVar.g;
        if (!mtopStatistics.isSignDegraded) {
            return "CONTINUE";
        }
        mtopStatistics.isSignDegradedRetry = true;
        hi9 hi9Var = w4jVar.f30449a.getMtopConfig().filterManager;
        if (hi9Var == null) {
            return "CONTINUE";
        }
        ((f10) hi9Var).d(new r1n(null).getName(), w4jVar);
        return FilterManager.STOP;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.SignDegradedErrorAfterFilter";
    }
}
