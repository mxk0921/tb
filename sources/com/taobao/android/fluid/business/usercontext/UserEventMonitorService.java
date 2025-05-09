package com.taobao.android.fluid.business.usercontext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.irv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserEventMonitorService implements IUserEventMonitorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FluidContext mFluidContext;

    static {
        t2o.a(468713562);
        t2o.a(468713556);
    }

    public UserEventMonitorService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        } else {
            new irv(this.mFluidContext).h();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }
}
