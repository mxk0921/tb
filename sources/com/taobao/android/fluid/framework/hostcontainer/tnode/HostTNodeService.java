package com.taobao.android.fluid.framework.hostcontainer.tnode;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.monitor.procedure.IPage;
import tb.h3e;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HostTNodeService implements IHostTNodeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HostTNodeService";
    private final FluidContext mFluidContext;
    private h3e mTab2ServiceDelegate;

    static {
        t2o.a(468714398);
        t2o.a(468714399);
    }

    public HostTNodeService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public IPage getApmPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("4c47d5b3", new Object[]{this});
        }
        h3e h3eVar = this.mTab2ServiceDelegate;
        if (h3eVar != null) {
            return h3eVar.o(this.mFluidContext.getInstanceConfig().getTabId());
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public h3e getTab2ServiceDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3e) ipChange.ipc$dispatch("ca8c6d62", new Object[]{this});
        }
        return this.mTab2ServiceDelegate;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public boolean isNativeHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca19b34", new Object[]{this})).booleanValue();
        }
        if (this.mTab2ServiceDelegate != null) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public void setTab2ServiceDelegate(h3e h3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc0049c", new Object[]{this, h3eVar});
        } else {
            this.mTab2ServiceDelegate = h3eVar;
        }
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public void showOrHideTab2TopBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95121870", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(TAG, "showOrHideTab2TopBar,show=" + z);
        h3e h3eVar = this.mTab2ServiceDelegate;
        if (h3eVar == null) {
            return;
        }
        if (z) {
            h3eVar.b();
        } else {
            h3eVar.z();
        }
    }
}
