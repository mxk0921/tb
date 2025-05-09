package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hfq implements xrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xrd
    public String b(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9becdb8", new Object[]{this, efqVar});
        }
        try {
            i7j i7jVar = efqVar.d;
            i7jVar.B = i7jVar.d();
            zu2 a2 = efqVar.j.getMtopConfig().callFactory.a(efqVar.e);
            a2.a(new ufq(efqVar));
            afq afqVar = efqVar.i;
            if (afqVar == null) {
                return "CONTINUE";
            }
            afqVar.b(a2);
            return "CONTINUE";
        } catch (Exception e) {
            TBSdkLog.e("ssr.SsrExecuteCallBeforeFilter", efqVar.b, "invoke call.enqueue of mtopInstance error,apiKey=" + efqVar.g.f16375a, e);
            return FilterManager.STOP;
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrExecuteCallBeforeFilter";
    }
}
