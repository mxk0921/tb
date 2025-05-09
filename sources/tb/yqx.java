package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.d4u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f32290a;
    public final IDxItemRenderService b;
    public final IContainerService<?> c;
    public final arb d;
    public final d e;
    public final IContainerDataService.c f;

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
                yqx.a(yqx.this, "download");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UiRefreshActionModel f32292a;

        public b(UiRefreshActionModel uiRefreshActionModel) {
            this.f32292a = uiRefreshActionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("ZoomInReplaceCard", "模版下载通知刷新");
            yqx.c(yqx.this).uiRefresh(yqx.b(yqx.this).getContainerData(), this.f32292a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else {
                yqx.d(yqx.this, w1eVar, iContainerDataModel);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
                return;
            }
            fve.e("ZoomInReplaceCard", "splashZoomIn 请求失败，errorCode：" + str + "， errorMsg：" + str2);
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
    }

    static {
        t2o.a(491782714);
    }

    public yqx(cfc cfcVar, d dVar) {
        c cVar = new c();
        this.f = cVar;
        this.d = cfcVar.getContainerType();
        this.e = dVar;
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.f32290a = iContainerDataService;
        this.b = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        this.c = (IContainerService) cfcVar.a(IContainerService.class);
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(cVar);
        }
    }

    public static /* synthetic */ void a(yqx yqxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2373f7", new Object[]{yqxVar, str});
        } else {
            yqxVar.e(str);
        }
    }

    public static /* synthetic */ IContainerDataService b(yqx yqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("9257315e", new Object[]{yqxVar});
        }
        return yqxVar.f32290a;
    }

    public static /* synthetic */ IContainerService c(yqx yqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService) ipChange.ipc$dispatch("f6c18e33", new Object[]{yqxVar});
        }
        return yqxVar.c;
    }

    public static /* synthetic */ void d(yqx yqxVar, w1e w1eVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8406ad05", new Object[]{yqxVar, w1eVar, iContainerDataModel});
        } else {
            yqxVar.l(w1eVar, iContainerDataModel);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ae5654", new Object[]{this, str});
        } else if (this.c == null) {
            fve.e("ZoomInReplaceCard", "deltaRefresh mContainerService is null");
        } else {
            UiRefreshActionModel uiRefreshActionModel = new UiRefreshActionModel();
            uiRefreshActionModel.containerId = this.d.getContainerId();
            uiRefreshActionModel.containerModel = this.f32290a.getContainerData();
            uiRefreshActionModel.dataChangeType = "delta";
            uiRefreshActionModel.dataSourceType = str;
            get.a().h(new b(uiRefreshActionModel));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f32290a;
        if (iContainerDataService != null) {
            iContainerDataService.removeRequestListener(this.f);
        }
    }

    public final void g(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64c571", new Object[]{this, baseSectionModel});
        } else if (this.b == null) {
            fve.e("ZoomInReplaceCard", "mDxItemRenderService is null");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(baseSectionModel);
            this.b.downloadTemplate(arrayList, new a());
        }
    }

    public final String h(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c2f59ad", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return null;
        }
        return ext.getString("splashZoomInRequestParams");
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return "ZoomInReplaceCard_splashZoomIn";
    }

    public final BaseSectionModel<?> j(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("96bb9e08", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<?> delta = iContainerDataModel.getDelta();
        if (delta == null) {
            fve.e("ZoomInReplaceCard", "delta is null");
            return null;
        }
        List<?> sections = delta.getSections();
        if (sections != null && sections.size() == 1) {
            return (BaseSectionModel) sections.get(0);
        }
        fve.e("ZoomInReplaceCard", "delta 中数据异常");
        return null;
    }

    public void k(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f736c6", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel == null) {
            fve.e("ZoomInReplaceCard", "feedsCard is null");
        } else if (this.f32290a == null) {
            fve.e("ZoomInReplaceCard", "mIContainerDataService is null");
        } else {
            String h = h(baseSectionModel);
            if (TextUtils.isEmpty(h)) {
                fve.e("ZoomInReplaceCard", "zoomInRequestParams is null");
                return;
            }
            m(h);
            fve.e("ZoomInReplaceCard", "发起 splashZoomIn 请求，zoomInRequestParams：" + h);
        }
    }

    public final void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f280cd", new Object[]{this, w1eVar, iContainerDataModel});
        } else if (w1eVar != null && TextUtils.equals(w1eVar.b(), i()) && iContainerDataModel != null) {
            BaseSectionModel<?> j = j(iContainerDataModel);
            if (j == null) {
                fve.e("ZoomInReplaceCard", "请求成功，但未获取到 ZoomIn 卡片");
                return;
            }
            g(j);
            if (this.e != null) {
                fve.e("ZoomInReplaceCard", "通知替换卡片");
                ((d4u.b) this.e).a(j);
            }
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ac7538", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        hashMap.put("splashZoomInRequestParams", str);
        jSONObject.put("bizParam", (Object) hashMap);
        jSONObject.put("requestType", (Object) "splashZoomIn");
        this.f32290a.triggerEvent("OnlyRequest", jSONObject, new sve(i()));
    }
}
