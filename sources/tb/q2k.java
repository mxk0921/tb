package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q2k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_INDEX = "index";

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f26465a;
    public volatile int b = -1;

    static {
        t2o.a(486539620);
    }

    public q2k(cfc cfcVar) {
        this.f26465a = (IContainerDataService) cfcVar.a(IContainerDataService.class);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9602f757", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.f26465a;
        if (iContainerDataService == null || !e(iContainerDataService.getContainerData(), i)) {
            return false;
        }
        this.b = i;
        return true;
    }

    public final IPageDataModel b(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageDataModel) ipChange.ipc$dispatch("ff52ab34", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null) {
            return null;
        }
        return base.getPageParams();
    }

    public final boolean f(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        List<BaseSectionModel<?>> sections;
        BaseSectionModel<?> baseSectionModel;
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("874ec1b0", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        IContainerInnerDataModel<BaseSectionModel<?>> base = iContainerDataModel.getBase();
        if (base == null || (sections = base.getSections()) == null || sections.size() <= 1 || (baseSectionModel = sections.get(0)) == null || (args = baseSectionModel.getArgs()) == null) {
            return false;
        }
        return TextUtils.equals(args.getString(jtv.S_ARGS_IS_CLIENT_CACHE), "1");
    }

    public final boolean g(IPageDataModel iPageDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8577af21", new Object[]{this, iPageDataModel})).booleanValue();
        }
        if (iPageDataModel == null) {
            return true;
        }
        return iPageDataModel.isLastPage();
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4975679e", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(i));
        jSONObject.put("isScrollNextPage", (Object) "true");
        this.f26465a.triggerEvent("ViewAppear", jSONObject);
    }

    public final int c(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8a5eb3e", new Object[]{this, iContainerDataModel})).intValue();
        }
        IPageDataModel b = b(iContainerDataModel);
        if (b == null) {
            fve.e("NextPageTrigger", "pageDataModel == null");
            return 10;
        }
        int requestInAdvance = b.getRequestInAdvance();
        if (requestInAdvance == 999) {
            return requestInAdvance;
        }
        if (f(iContainerDataModel)) {
            if (requestInAdvance > 25) {
                return 10;
            }
            return requestInAdvance;
        } else if (requestInAdvance < 2 || requestInAdvance > 25) {
            return 10;
        } else {
            return requestInAdvance;
        }
    }

    public final boolean e(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel, int i) {
        IPageDataModel b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34874c83", new Object[]{this, iContainerDataModel, new Integer(i)})).booleanValue();
        }
        if (iContainerDataModel == null || (b = b(iContainerDataModel)) == null || g(b)) {
            return false;
        }
        if (!mve.a("openFirstRequestOptimize", false) || b.getPageNum() != 0 || iContainerDataModel.getTotalData().size() >= 10) {
            return d(iContainerDataModel, i);
        }
        return false;
    }

    public final boolean d(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11792d3e", new Object[]{this, iContainerDataModel, new Integer(i)})).booleanValue();
        }
        List<BaseSectionModel<?>> totalData = iContainerDataModel.getTotalData();
        if (totalData.isEmpty()) {
            fve.e("NextPageTrigger", "total is empty");
            return false;
        }
        int c = c(iContainerDataModel);
        if (c == 999) {
            return false;
        }
        return c > totalData.size() || i == totalData.size() - c;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96eaaddd", new Object[]{this})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.f26465a;
        if (iContainerDataService == null) {
            return false;
        }
        IContainerDataModel<BaseSectionModel<?>> containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("NextPageTrigger", "onLoadingAppear containerData == null");
            return false;
        }
        int c = c(containerData);
        List<BaseSectionModel<?>> totalData = containerData.getTotalData();
        if (this.b == totalData.size() - c) {
            fve.e("NextPageTrigger", "已经正常发过请求不补偿");
            return false;
        }
        fve.e("NextPageTrigger", "达到loading出现补偿请求条件, lastAllowRequestPosition ： " + this.b + ", offset : " + c + ", total.size() : " + totalData.size());
        return true;
    }
}
