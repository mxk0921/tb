package com.taobao.android.fluid.framework.performance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import tb.b93;
import tb.h3e;
import tb.ir9;
import tb.nwv;
import tb.oxl;
import tb.t2o;
import tb.uq9;
import tb.ylb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PerformanceService implements IPerformanceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IPerformanceService";
    private Runnable firstFrameCallback;
    private final FluidContext mFluidContext;
    private final String TAG = "PerformanceService";
    private boolean isInteractLayerFirstFrameReady = false;
    private boolean isInteractLayerResultReady = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ylb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(PerformanceService performanceService) {
        }

        public final void a(uq9 uq9Var, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84c29b9", new Object[]{this, uq9Var, new Integer(i), new Integer(i2)});
            } else if (i2 >= 0 && uq9Var.f0().c0() != null) {
                uq9Var.f0().c0().t0(i2, i);
            }
        }

        @Override // tb.ylb
        public void onCardRenderFailed(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4eefa3a", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.ylb
        public void onCardRenderSuccess(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7a83ad6", new Object[]{this, uq9Var});
            } else {
                a(uq9Var, 1002, uq9Var.M());
            }
        }
    }

    static {
        t2o.a(468714595);
        t2o.a(468714594);
    }

    public PerformanceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.performance.IPerformanceService
    public boolean isInteractLayerFirstFrameReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed254920", new Object[]{this})).booleanValue();
        }
        return this.isInteractLayerFirstFrameReady;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        new oxl(this.mFluidContext);
        ((IContainerService) this.mFluidContext.getService(IContainerService.class)).addCardRenderListener(new a(this));
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.performance.IPerformanceService
    public void onInteractLayerFirstFrameReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ad35d1", new Object[]{this});
        } else if (!this.isInteractLayerFirstFrameReady) {
            this.isInteractLayerFirstFrameReady = true;
            h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
            if (tab2ServiceDelegate != null) {
                long currentTimeMillis = System.currentTimeMillis();
                tab2ServiceDelegate.a("first_frame", true, currentTimeMillis, "interact");
                tab2ServiceDelegate.m(true, IPerformanceService.MTS_VALUE_INTERACT_SUCCESS, currentTimeMillis, "interact");
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.performance.IPerformanceService
    public void onVideoFirstFrameReady(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9569f10f", new Object[]{this, runnable});
            return;
        }
        boolean isPreloadWeexInstanceEnabled = ((IPreloadWeexService) this.mFluidContext.getService(IPreloadWeexService.class)).isPreloadWeexInstanceEnabled();
        ir9.b("PerformanceService", "onVideoFirstFrameReady, isPreloadWeexInstanceEnabled:" + isPreloadWeexInstanceEnabled + ", isInteractLayerResultReady:" + this.isInteractLayerResultReady);
        if (isPreloadWeexInstanceEnabled && !this.isInteractLayerResultReady && b93.h()) {
            this.firstFrameCallback = runnable;
        } else if (runnable != null) {
            nwv.y0(runnable);
        }
    }

    @Override // com.taobao.android.fluid.framework.performance.IPerformanceService
    public void onInteractLayerResultReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2fb451", new Object[]{this});
            return;
        }
        ir9.b("PerformanceService", "onInteractLayerResultReady");
        this.isInteractLayerResultReady = true;
        Runnable runnable = this.firstFrameCallback;
        if (runnable != null) {
            nwv.y0(runnable);
            this.firstFrameCallback = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.android.fluid.framework.performance.IPerformanceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInteractAPMTrace(java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.performance.PerformanceService.onInteractAPMTrace(java.util.Map):void");
    }
}
