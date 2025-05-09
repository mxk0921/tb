package com.taobao.infoflow.taobao.subservice.framework.greyfilterservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IGreyFilterService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.cfc;
import tb.t2o;
import tb.zja;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GreyFilterServiceImpl implements IGreyFilterService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private zja mGreyFilter;
    private IMainFeedsViewService<?> mMainFeedsViewService;

    static {
        t2o.a(491782806);
        t2o.a(488636648);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IGreyFilterService
    public boolean isNeedGreyCard(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4590ae2", new Object[]{this, baseSectionModel})).booleanValue();
        }
        zja zjaVar = this.mGreyFilter;
        if (zjaVar != null) {
            return zjaVar.e(baseSectionModel);
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mGreyFilter = new zja();
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.getLifeCycleRegister().y(this.mGreyFilter);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.getLifeCycleRegister().q(this.mGreyFilter);
        }
    }
}
