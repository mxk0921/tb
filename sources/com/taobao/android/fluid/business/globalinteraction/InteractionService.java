package com.taobao.android.fluid.business.globalinteraction;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.dgf;
import tb.ngf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractionService implements IInteractionService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InteractionService";
    private final FluidContext mFluidContext;
    private final dgf mGlobalInteractManager;
    private final ngf mInteractionServiceConfig = new ngf();
    private ILifecycleService mLifecycleService;

    static {
        t2o.a(468713497);
        t2o.a(468713496);
    }

    public InteractionService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mGlobalInteractManager = new dgf(fluidContext);
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public ngf getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngf) ipChange.ipc$dispatch("3a218ff5", new Object[]{this});
        }
        return this.mInteractionServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void initCollectionPoplayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cf8d15", new Object[]{this});
        } else {
            this.mGlobalInteractManager.b();
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void initGlobalH5MessageHandler(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d19c45", new Object[]{this, aVar});
        } else {
            this.mGlobalInteractManager.j(aVar);
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void initGlobalInteractHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e588ae8", new Object[]{this});
        } else {
            this.mGlobalInteractManager.k();
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public boolean isEnableGlobalWeexDSLV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3518ab3", new Object[]{this})).booleanValue();
        }
        return this.mGlobalInteractManager.l();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ILifecycleService iLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mLifecycleService = iLifecycleService;
        if (iLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
        } else {
            iLifecycleService.addPageLifecycleListener(this.mGlobalInteractManager);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void setGlobalLayerVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead7b80f", new Object[]{this, new Boolean(z)});
        } else {
            this.mGlobalInteractManager.m(z);
        }
    }
}
