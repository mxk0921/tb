package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ajp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f15778a;
    public final IContainerDataService.a b;
    public final hjv c;
    public final yi9 d;
    public Map<String, BaseSectionModel<?>> e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
                return;
            }
            ajp.a(ajp.this);
            ajp.b(ajp.this, true);
        }
    }

    static {
        t2o.a(491782659);
    }

    public ajp(cfc cfcVar) {
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.f15778a = iContainerDataService;
        if (iContainerDataService == null) {
            fve.e("ShareDataSource", "ShareDataSource mContainerDataService is null");
            return;
        }
        this.c = new hjv(cfcVar);
        this.d = new yi9(iContainerDataService);
        IContainerDataService.a c = c();
        this.b = c;
        iContainerDataService.addDataProcessListener(c);
    }

    public static /* synthetic */ void a(ajp ajpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08c3fcb", new Object[]{ajpVar});
        } else {
            ajpVar.k();
        }
    }

    public static /* synthetic */ boolean b(ajp ajpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7e7c50a", new Object[]{ajpVar, new Boolean(z)})).booleanValue();
        }
        ajpVar.f = z;
        return z;
    }

    public final IContainerDataService.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("443b5741", new Object[]{this});
        }
        return new a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f15778a;
        if (iContainerDataService != null) {
            iContainerDataService.removeDataProcessListener(this.b);
        }
    }

    public JSONObject e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("59ca369c", new Object[]{this, str, str2, str3});
        }
        if (this.d == null) {
            fve.e("ShareDataSource", "findSmartContentInfo mFindSmartContentInfoHandler is null");
            return null;
        }
        BaseSectionModel<?> g = g(str);
        if (g != null) {
            return this.d.b(g, str2, str3);
        }
        fve.e("ShareDataSource", "isMiniAppExist sectionModel is null");
        return null;
    }

    public IContainerDataService<?> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("7192139", new Object[]{this});
        }
        return this.f15778a;
    }

    public BaseSectionModel<?> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("2d3a6c8d", new Object[]{this, str});
        }
        if (this.f15778a == null) {
            fve.e("ShareDataSource", "getData mContainerDataService is null");
            return null;
        }
        Map<String, BaseSectionModel<?>> map = this.e;
        if (map != null) {
            return (BaseSectionModel) ((HashMap) map).get(str);
        }
        fve.e("ShareDataSource", "getData baseSectionModelMap is null");
        return null;
    }

    public JSONObject h() {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1231214", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.f15778a;
        if (iContainerDataService == null) {
            fve.e("ShareDataSource", "getPassParams mContainerDataService is null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null || (base = containerData.getBase()) == null) {
            return null;
        }
        return base.getPassParams();
    }

    public Collection<BaseSectionModel<?>> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("b6457c8d", new Object[]{this});
        }
        Map<String, BaseSectionModel<?>> map = this.e;
        if (map != null && !((HashMap) map).isEmpty()) {
            return ((HashMap) this.e).values();
        }
        fve.e("ShareDataSource", "getShareData, baseSectionModelMap is null");
        return null;
    }

    public final List<BaseSectionModel<?>> j(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c12ac82", new Object[]{this, iContainerDataService});
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null) {
            return containerData.getTotalData();
        }
        fve.e("ShareDataSource", "containerDataModel == null");
        return null;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7109efe4", new Object[]{this});
            return;
        }
        List<BaseSectionModel<?>> j = j(this.f15778a);
        if (j == null || j.isEmpty()) {
            this.e = null;
            fve.e("ShareDataSource", "createSectionModelMap containerDataModel is null");
            return;
        }
        HashMap hashMap = new HashMap(2);
        for (BaseSectionModel<?> baseSectionModel : j) {
            if (baseSectionModel.getExt().getBooleanValue("isHSharedData")) {
                hashMap.put(baseSectionModel.getSectionBizCode(), baseSectionModel);
            }
        }
        this.e = hashMap;
    }

    public boolean l(JSONObject jSONObject) {
        Map<String, BaseSectionModel<?>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57d0331a", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!this.f) {
            fve.e("ShareDataSource", "baseSectionModelMap not build");
            return true;
        }
        BaseSectionModel<?> createBaseSectionModel = this.f15778a.createBaseSectionModel(jSONObject);
        String sectionBizCode = createBaseSectionModel.getSectionBizCode();
        if (this.c == null || (map = this.e) == null || !((HashMap) map).containsKey(sectionBizCode)) {
            return false;
        }
        ((HashMap) this.e).put(sectionBizCode, createBaseSectionModel);
        return this.c.i(createBaseSectionModel);
    }
}
