package com.taobao.android.fluid.business.publishinsert;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.t2o;
import tb.uq9;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PublishInsertService implements IPublishInsertService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ICardService mCardService;
    private final FluidContext mFluidContext;
    private ILifecycleService mLifecycleService;
    private boolean mPublishIInsertEnable;
    private PublishInsertHelper mPublishInsertHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 728745324) {
                super.onAppear((uq9) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/publishinsert/PublishInsertService$1");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
                return;
            }
            super.onAppear(uq9Var);
            PublishInsertHelper.o(PublishInsertService.access$000(PublishInsertService.this), uq9Var.Z());
        }
    }

    static {
        t2o.a(468713534);
        t2o.a(468713533);
    }

    public PublishInsertService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ FluidContext access$000(PublishInsertService publishInsertService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("c5f7654d", new Object[]{publishInsertService});
        }
        return publishInsertService.mFluidContext;
    }

    @Override // com.taobao.android.fluid.business.publishinsert.IPublishInsertService
    public boolean isPublishIInsertEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28dd24ab", new Object[]{this})).booleanValue();
        }
        return this.mPublishIInsertEnable;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        PublishInsertHelper publishInsertHelper = new PublishInsertHelper(this.mFluidContext);
        this.mPublishInsertHelper = publishInsertHelper;
        this.mLifecycleService.addPageLifecycleListener(publishInsertHelper);
        this.mCardService.addCardLifecycleListener((wlb.a) new a());
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mLifecycleService.removePageLifecycleListener(this.mPublishInsertHelper);
        }
    }

    @Override // com.taobao.android.fluid.business.publishinsert.IPublishInsertService
    public void setPublishIInsertEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4382d5", new Object[]{this, new Boolean(z)});
        } else {
            this.mPublishIInsertEnable = z;
        }
    }
}
