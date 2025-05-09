package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gb7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f19861a;

    static {
        t2o.a(491782451);
    }

    public gb7(cfc cfcVar) {
        this.f19861a = cfcVar;
    }

    public final void a(BaseSectionModel<?> baseSectionModel, List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b1963d", new Object[]{this, baseSectionModel, list});
        } else if (list != null) {
            try {
                list.remove(baseSectionModel);
            } catch (Exception e) {
                fve.e("DeleteHostCardHelper", "删除商品卡出现异常: " + e);
            }
        }
    }

    public void b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8931af2", new Object[]{this, baseSectionModel});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.f19861a.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            List<BaseSectionModel> e = e(iContainerDataService);
            List<BaseSectionModel> c = c(iContainerDataService);
            List<BaseSectionModel> d = d(iContainerDataService);
            if (e != null && c != null) {
                a(baseSectionModel, e);
                a(baseSectionModel, c);
                a(baseSectionModel, d);
                f(iContainerDataService);
            }
        }
    }

    public final List<BaseSectionModel> c(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc903e55", new Object[]{this, iContainerDataService});
        }
        IContainerInnerDataModel base = iContainerDataService.getContainerData().getBase();
        if (base == null) {
            return null;
        }
        return base.getSections();
    }

    public final List<BaseSectionModel> d(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f09cec90", new Object[]{this, iContainerDataService});
        }
        IContainerInnerDataModel delta = iContainerDataService.getContainerData().getDelta();
        if (delta == null) {
            return null;
        }
        return delta.getSections();
    }

    public final List<BaseSectionModel> e(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8792ccc4", new Object[]{this, iContainerDataService});
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            return null;
        }
        return containerData.getTotalData();
    }

    public final void f(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9301ac34", new Object[]{this, iContainerDataService});
            return;
        }
        IContainerService iContainerService = (IContainerService) this.f19861a.a(IContainerService.class);
        if (iContainerService != null) {
            iContainerService.uiRefresh(iContainerDataService.getContainerData(), new ugl(this.f19861a));
        }
    }
}
