package com.taobao.android.fluid.framework.hostcontainer.pageinterface;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import tb.anl;
import tb.pep;
import tb.t2o;
import tb.wfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HostPageInterfaceService implements IHostPageInterfaceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IHostPageInterfaceService";
    private final FluidContext mFluidContext;
    private anl mPageInterface;
    private ISceneConfigService mSceneConfigService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements wfc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.wfc
        public void b(FluidInstanceConfig fluidInstanceConfig, pep pepVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a84556", new Object[]{this, fluidInstanceConfig, pepVar});
            } else {
                HostPageInterfaceService.access$002(HostPageInterfaceService.this, fluidInstanceConfig.getHostPageInterface());
            }
        }
    }

    static {
        t2o.a(468714390);
        t2o.a(468714392);
    }

    public HostPageInterfaceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ anl access$002(HostPageInterfaceService hostPageInterfaceService, anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("8bf8fe05", new Object[]{hostPageInterfaceService, anlVar});
        }
        hostPageInterfaceService.mPageInterface = anlVar;
        return anlVar;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService
    public anl getPageInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("b992737", new Object[]{this});
        }
        return this.mPageInterface;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mSceneConfigService = (ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class);
        this.mPageInterface = this.mFluidContext.getInstanceConfig().getHostPageInterface();
        this.mSceneConfigService.addInstanceConfigChangedListener(new a());
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }
}
