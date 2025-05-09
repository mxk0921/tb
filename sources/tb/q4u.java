package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q4u implements o1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITopViewService f26508a;

    static {
        t2o.a(486539593);
        t2o.a(488636453);
    }

    public q4u(cfc cfcVar) {
        this.f26508a = (ITopViewService) cfcVar.a(ITopViewService.class);
    }

    @Override // tb.o1e
    public boolean expendTopViewRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e64c398", new Object[]{this})).booleanValue();
        }
        ITopViewService iTopViewService = this.f26508a;
        if (iTopViewService != null) {
            return iTopViewService.expendTopViewRecord();
        }
        return false;
    }
}
