package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyStayTimeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jlq implements ssd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f22059a;

    static {
        t2o.a(486539592);
        t2o.a(488636452);
    }

    public jlq(cfc cfcVar) {
        this.f22059a = cfcVar;
    }

    @Override // tb.ssd
    public void updateContainerType(arb arbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cd8fbf", new Object[]{this, arbVar});
            return;
        }
        IAfterBuyStayTimeService iAfterBuyStayTimeService = (IAfterBuyStayTimeService) this.f22059a.a(IAfterBuyStayTimeService.class);
        if (iAfterBuyStayTimeService != null) {
            iAfterBuyStayTimeService.updateContainerType(arbVar);
        }
    }
}
