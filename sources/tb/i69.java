package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f21122a;

    static {
        t2o.a(486539615);
    }

    public i69(cfc cfcVar) {
        this.f21122a = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    public final e6c a(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e6c) ipChange.ipc$dispatch("8f8300b1", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        }
        return new h69(c(iContainerDataModel, iUiRefreshActionModel), f(iContainerDataModel), e(iUiRefreshActionModel));
    }

    public final boolean c(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IPageDataModel pageParams;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa097908", new Object[]{this, iContainerDataModel, iUiRefreshActionModel})).booleanValue();
        }
        boolean equals = TextUtils.equals(iUiRefreshActionModel.getDataChangeType(), "base");
        if (!equals || (pageParams = iContainerDataModel.getBase().getPageParams()) == null) {
            return equals;
        }
        if (pageParams.getPageNum() != 0 || iUiRefreshActionModel.isSecondReturn()) {
            z = false;
        }
        return z;
    }

    public final boolean d(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f7fb412", new Object[]{this, iUiRefreshActionModel})).booleanValue();
        }
        return TextUtils.equals(iUiRefreshActionModel.getDataSourceType(), "local");
    }

    public final boolean e(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cd862bb", new Object[]{this, iUiRefreshActionModel})).booleanValue();
        }
        return TextUtils.equals(iUiRefreshActionModel.getDataSourceType(), "download");
    }

    public final boolean f(IContainerDataModel iContainerDataModel) {
        IContainerInnerDataModel base;
        IPageDataModel pageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291a88e9", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (pageParams = base.getPageParams()) == null) {
            return true;
        }
        return pageParams.isLastPage();
    }

    public void g(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19df0ab", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f21122a;
        if (iMainFeedsViewService != null) {
            h(iContainerDataModel, iUiRefreshActionModel, iMainFeedsViewService);
        }
    }

    public final void h(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel, IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee51a0ad", new Object[]{this, iContainerDataModel, iUiRefreshActionModel, iMainFeedsViewService});
        } else if (TextUtils.isEmpty(iUiRefreshActionModel.getDataChangeType())) {
            iMainFeedsViewService.resetErrorView();
        } else if (b(iUiRefreshActionModel, iContainerDataModel, iMainFeedsViewService)) {
            iMainFeedsViewService.uiRefresh(iContainerDataModel.getTotalData(), a(iContainerDataModel, iUiRefreshActionModel));
        }
    }

    public final boolean b(IUiRefreshActionModel iUiRefreshActionModel, IContainerDataModel<?> iContainerDataModel, IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("113d6a36", new Object[]{this, iUiRefreshActionModel, iContainerDataModel, iMainFeedsViewService})).booleanValue();
        }
        if (iContainerDataModel == null) {
            fve.e("FeedsRefresher", "containerData is null");
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null || base.getSections() == null || base.getPageParams() == null) {
            fve.e("FeedsRefresher", "isAllowRefresh data exception");
            return false;
        } else if (!d(iUiRefreshActionModel) || iMainFeedsViewService.getItemCount() <= 1) {
            return true;
        } else {
            fve.e("FeedsRefresher", "避免缓存数据无效刷新，原始老逻辑");
            return false;
        }
    }
}
