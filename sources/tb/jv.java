package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class jv implements g8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f22233a;

    static {
        t2o.a(491782540);
        t2o.a(491782563);
    }

    public jv(cfc cfcVar) {
        this.f22233a = cfcVar;
    }

    public h6c<?> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c) ipChange.ipc$dispatch("5bf9139d", new Object[]{this});
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f22233a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return null;
        }
        return iMainFeedsViewService.getLifeCycleRegister();
    }

    public cfc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("b1bd3794", new Object[]{this});
        }
        return this.f22233a;
    }
}
