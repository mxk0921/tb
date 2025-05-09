package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final arb f20692a;
    public final IContainerDataService<?> b;
    public final IDxItemRenderService c;
    public final IContainerService<?> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                hjv.a(hjv.this, "download");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UiRefreshActionModel f20694a;

        public b(UiRefreshActionModel uiRefreshActionModel) {
            this.f20694a = uiRefreshActionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hjv.c(hjv.this).uiRefresh(hjv.b(hjv.this).getContainerData(), this.f20694a);
            }
        }
    }

    static {
        t2o.a(491782662);
    }

    public hjv(cfc cfcVar) {
        this.f20692a = cfcVar.getContainerType();
        this.b = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.c = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        this.d = (IContainerService) cfcVar.a(IContainerService.class);
    }

    public static /* synthetic */ void a(hjv hjvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f199aa47", new Object[]{hjvVar, str});
        } else {
            hjvVar.e(str);
        }
    }

    public static /* synthetic */ IContainerDataService b(hjv hjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("6c369510", new Object[]{hjvVar});
        }
        return hjvVar.b;
    }

    public static /* synthetic */ IContainerService c(hjv hjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService) ipChange.ipc$dispatch("bffda547", new Object[]{hjvVar});
        }
        return hjvVar.d;
    }

    public final void d(IContainerDataModel<BaseSectionModel> iContainerDataModel, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628ca062", new Object[]{this, iContainerDataModel, baseSectionModel});
        } else if (!h(iContainerDataModel)) {
            ArrayList arrayList = new ArrayList(iContainerDataModel.getDelta().getSections());
            int a2 = e83.a(baseSectionModel, arrayList);
            if (a2 == -1) {
                fve.e("UpdateDataHandler", "clearDeltaSection 未查找到卡片： " + baseSectionModel.getSectionBizCode());
                return;
            }
            arrayList.remove(a2);
            iContainerDataModel.updateDeltaSections(arrayList);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ae5654", new Object[]{this, str});
        } else if (this.d == null) {
            fve.e("UpdateDataHandler", "deltaRefresh mContainerService is null");
        } else {
            UiRefreshActionModel uiRefreshActionModel = new UiRefreshActionModel();
            uiRefreshActionModel.containerId = this.f20692a.getContainerId();
            uiRefreshActionModel.containerModel = this.b.getContainerData();
            uiRefreshActionModel.dataChangeType = "delta";
            uiRefreshActionModel.dataSourceType = str;
            get.a().h(new b(uiRefreshActionModel));
        }
    }

    public final void f(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64c571", new Object[]{this, baseSectionModel});
        } else if (this.c == null) {
            fve.e("UpdateDataHandler", "mDxItemRenderService is null");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(baseSectionModel);
            this.c.downloadTemplate(arrayList, new a());
        }
    }

    public final boolean g(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92dcd477", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getSections() == null || iContainerDataModel.getBase().getSections().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean h(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53e9483c", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getDelta() == null || iContainerDataModel.getDelta().getSections() == null || iContainerDataModel.getDelta().getSections().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean i(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76bd5b66", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (this.b == null) {
            fve.e("UpdateDataHandler", "updateData mContainerDataService is null");
            return false;
        }
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        if (TextUtils.isEmpty(sectionBizCode)) {
            fve.e("UpdateDataHandler", "updateData sectionBizCode is empty");
            return false;
        }
        IContainerDataModel<?> containerData = this.b.getContainerData();
        if (g(containerData)) {
            fve.e("UpdateDataHandler", "updateData containerData base is null");
            return false;
        }
        ArrayList arrayList = new ArrayList(containerData.getBase().getSections());
        int a2 = e83.a(baseSectionModel, arrayList);
        if (a2 == -1) {
            fve.e("UpdateDataHandler", "updateData 未查找到卡片： " + sectionBizCode);
            return false;
        }
        f(baseSectionModel);
        d(containerData, baseSectionModel);
        arrayList.set(a2, baseSectionModel);
        containerData.updateBaseSections(arrayList);
        e("remote");
        return true;
    }
}
