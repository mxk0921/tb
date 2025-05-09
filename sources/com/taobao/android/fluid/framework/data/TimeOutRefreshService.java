package com.taobao.android.fluid.framework.data;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.HashMap;
import tb.ckf;
import tb.hn4;
import tb.ir9;
import tb.o6d;
import tb.t2o;
import tb.uyr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TimeOutRefreshService extends o6d.a implements ITimeOutRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "TimeOutRefreshService";
    private final int TIMEOUT_THRESHOLD = 1800000;
    private boolean enableTimeOutRefresh;
    private final FluidContext fluidContext;
    private long lastLeaveTs;
    private boolean pendingToTimeOutRefresh;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hn4 config;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (TimeOutRefreshService.access$getPendingToTimeOutRefresh$p(TimeOutRefreshService.this) && TimeOutRefreshService.access$checkTimeOut(TimeOutRefreshService.this)) {
                IContainerService iContainerService = (IContainerService) TimeOutRefreshService.access$getFluidContext$p(TimeOutRefreshService.this).getService(IContainerService.class);
                if (!(iContainerService == null || (config = iContainerService.getConfig()) == null)) {
                    config.r("timeout");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("isRefresh", "true");
                ir9.b(TimeOutRefreshService.access$getTAG$p(TimeOutRefreshService.this), "[dataRequest]超时刷新...");
                if (iContainerService != null) {
                    iContainerService.refresh(hashMap, false);
                }
            }
            TimeOutRefreshService.access$setPendingToTimeOutRefresh$p(TimeOutRefreshService.this, false);
        }
    }

    static {
        t2o.a(468714180);
        t2o.a(468714179);
    }

    public TimeOutRefreshService(FluidContext fluidContext) {
        ckf.g(fluidContext, "fluidContext");
        this.fluidContext = fluidContext;
    }

    public static final /* synthetic */ boolean access$checkTimeOut(TimeOutRefreshService timeOutRefreshService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f19dce26", new Object[]{timeOutRefreshService})).booleanValue();
        }
        return timeOutRefreshService.checkTimeOut();
    }

    public static final /* synthetic */ FluidContext access$getFluidContext$p(TimeOutRefreshService timeOutRefreshService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("36b751d4", new Object[]{timeOutRefreshService});
        }
        return timeOutRefreshService.fluidContext;
    }

    public static final /* synthetic */ boolean access$getPendingToTimeOutRefresh$p(TimeOutRefreshService timeOutRefreshService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3b4481d", new Object[]{timeOutRefreshService})).booleanValue();
        }
        return timeOutRefreshService.pendingToTimeOutRefresh;
    }

    public static final /* synthetic */ String access$getTAG$p(TimeOutRefreshService timeOutRefreshService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75ec7e55", new Object[]{timeOutRefreshService});
        }
        return timeOutRefreshService.TAG;
    }

    public static final /* synthetic */ void access$setPendingToTimeOutRefresh$p(TimeOutRefreshService timeOutRefreshService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28eacc4f", new Object[]{timeOutRefreshService, new Boolean(z)});
        } else {
            timeOutRefreshService.pendingToTimeOutRefresh = z;
        }
    }

    private final boolean checkTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98479f24", new Object[]{this})).booleanValue();
        }
        if (this.lastLeaveTs <= 0 || SystemClock.elapsedRealtime() - this.lastLeaveTs <= this.TIMEOUT_THRESHOLD) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(TimeOutRefreshService timeOutRefreshService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 188604040) {
            super.onStop();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/data/TimeOutRefreshService");
        }
    }

    @Override // com.taobao.android.fluid.framework.data.ITimeOutRefreshService
    public void initEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f20c5a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z || this.enableTimeOutRefresh) {
            ILifecycleService iLifecycleService = (ILifecycleService) this.fluidContext.getService(ILifecycleService.class);
            if (iLifecycleService != null) {
                iLifecycleService.removePageLifecycleListener((o6d.a) this);
            }
        } else {
            ILifecycleService iLifecycleService2 = (ILifecycleService) this.fluidContext.getService(ILifecycleService.class);
            if (iLifecycleService2 != null) {
                iLifecycleService2.addPageLifecycleListener((o6d.a) this);
            }
        }
        this.enableTimeOutRefresh = z;
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

    @Override // tb.o6d.a, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.pendingToTimeOutRefresh = true;
        uyr.mMainHander.post(new a());
    }

    @Override // tb.o6d.a, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.lastLeaveTs = SystemClock.elapsedRealtime();
    }

    @Override // com.taobao.android.fluid.framework.data.ITimeOutRefreshService
    public void setNotPendingRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763b38bc", new Object[]{this});
        } else {
            this.pendingToTimeOutRefresh = false;
        }
    }
}
