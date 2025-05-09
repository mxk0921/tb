package com.taobao.android.fluid.business.undermode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.undermode.helper.UnderageTimelimitHelper;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.dzb;
import tb.ir9;
import tb.kgv;
import tb.lgv;
import tb.mgv;
import tb.o6d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UnderageModeService implements IUnderageModeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UnderageModeService";
    private final FluidContext mFluidContext;
    private final lgv mUnderageModeServiceConfig = new lgv();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1512649357) {
                super.onResume();
                return null;
            } else if (hashCode == -1504501726) {
                super.onDestroy();
                return null;
            } else if (hashCode == 797441118) {
                super.onPause();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/undermode/UnderageModeService$1");
            }
        }

        @Override // tb.o6d.a, tb.o6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            super.onDestroy();
            mgv.INSTANCE.d();
        }

        @Override // tb.o6d.a, tb.o6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            super.onPause();
            UnderageTimelimitHelper.INSTANCE.c(UnderageModeService.access$000(UnderageModeService.this));
        }

        @Override // tb.o6d.a, tb.o6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            super.onResume();
            if (kgv.INSTANCE.e(UnderageModeService.access$000(UnderageModeService.this))) {
                ir9.b(UnderageModeService.TAG, "[dataRequest]UnderageModeHelper 当前数据对应的青少年模式发生变化，需要刷新");
                ((IContainerService) UnderageModeService.access$000(UnderageModeService.this).getService(IContainerService.class)).refresh();
            }
            UnderageTimelimitHelper.INSTANCE.a(UnderageModeService.access$000(UnderageModeService.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements dzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.dzb
        public void onDetailRequestSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cae82b", new Object[]{this});
            } else {
                UnderageModeService.access$100(UnderageModeService.this).c(kgv.INSTANCE.h(UnderageModeService.access$000(UnderageModeService.this).getContext()));
            }
        }
    }

    static {
        t2o.a(468713541);
        t2o.a(468713540);
    }

    public UnderageModeService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ FluidContext access$000(UnderageModeService underageModeService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("7a91fb3e", new Object[]{underageModeService});
        }
        return underageModeService.mFluidContext;
    }

    public static /* synthetic */ lgv access$100(UnderageModeService underageModeService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgv) ipChange.ipc$dispatch("2993f071", new Object[]{underageModeService});
        }
        return underageModeService.mUnderageModeServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.undermode.IUnderageModeService
    public lgv getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgv) ipChange.ipc$dispatch("93b39b1b", new Object[]{this});
        }
        return this.mUnderageModeServiceConfig;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new a());
        ((IDataService) this.mFluidContext.getService(IDataService.class)).addDetailRequestSuccessListener(new b());
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }
}
