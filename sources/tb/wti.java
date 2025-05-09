package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements c8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30913a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        public a(Context context, String str, boolean z, int i) {
            this.f30913a = context;
            this.b = str;
            this.c = z;
            this.d = i;
        }

        @Override // tb.c8d
        public void a(SectionModel sectionModel, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4e392ea", new Object[]{this, sectionModel, dXTemplateItem});
            } else if (wti.a(sectionModel)) {
                fve.e("MicroservicesInfoFlowPerformance", "isBannerCard : 首焦不做预渲染");
            } else if (wti.b(sectionModel)) {
                fve.e("MicroservicesInfoFlowPerformance", "isVideoCard : 视频卡不做预渲染");
            } else {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (sectionBizCode == null) {
                    bqa.d("MicroservicesInfoFlowPerformance", "sectionBizCode == null");
                } else if (sectionBizCode.contains("icon_and_miniapp") && vxl.b().f()) {
                    bqa.d("MicroservicesInfoFlowPerformance", "关闭icon预渲染");
                } else if (sectionBizCode.contains("recommend_gongge") && vxl.b().e()) {
                    bqa.d("MicroservicesInfoFlowPerformance", "关闭宫格预渲染");
                } else if (sectionBizCode.contains("icon_and_miniapp") || sectionBizCode.contains("recommend_gongge") || sectionBizCode.contains("recommend_banner") || !wti.c(wti.this)) {
                    int index = sectionModel.getIndex();
                    if (vxl.b().D() && index >= 8) {
                        bqa.d("MicroservicesInfoFlowPerformance", "index超过预渲染个数8");
                    } else if (vxl.b().F() && index >= 6) {
                        bqa.d("MicroservicesInfoFlowPerformance", "index超过预渲染个数6");
                    } else if (!vxl.b().F() || index < 4) {
                        mxl.a(Integer.valueOf(System.identityHashCode(sectionModel)));
                        phg.k("dxPreRender_" + dXTemplateItem.e());
                        bqa.d("MicroservicesInfoFlowPerformance", "preRenderCards dxPreRender_" + dXTemplateItem.e());
                        if (vxl.b().M()) {
                            wti.d(wti.this, this.f30913a, this.b, dXTemplateItem, sectionModel);
                        } else {
                            wti.e(wti.this, this.f30913a, this.b, sectionModel, this.c, this.d);
                        }
                        phg.j("dxPreRender_" + dXTemplateItem.e());
                        f0b.i().f(f0b.HOME_SUB_PRERENDER);
                        f0b.i().c(f0b.HOME_SUB_PRERENDER);
                    } else {
                        bqa.d("MicroservicesInfoFlowPerformance", "index超过预渲染个数4");
                    }
                } else {
                    bqa.d("MicroservicesInfoFlowPerformance", "关闭信息流预渲染");
                }
            }
        }
    }

    static {
        t2o.a(729810121);
    }

    public static /* synthetic */ boolean a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ea82e1a", new Object[]{sectionModel})).booleanValue();
        }
        return g(sectionModel);
    }

    public static /* synthetic */ boolean b(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15d77a39", new Object[]{sectionModel})).booleanValue();
        }
        return h(sectionModel);
    }

    public static /* synthetic */ boolean c(wti wtiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90cee077", new Object[]{wtiVar})).booleanValue();
        }
        return wtiVar.f();
    }

    public static /* synthetic */ void d(wti wtiVar, Context context, String str, DXTemplateItem dXTemplateItem, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ceeb80f", new Object[]{wtiVar, context, str, dXTemplateItem, baseSectionModel});
        } else {
            wtiVar.n(context, str, dXTemplateItem, baseSectionModel);
        }
    }

    public static /* synthetic */ void e(wti wtiVar, Context context, String str, SectionModel sectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbfa37f", new Object[]{wtiVar, context, str, sectionModel, new Boolean(z), new Integer(i)});
        } else {
            wtiVar.m(context, str, sectionModel, z, i);
        }
    }

    public static boolean g(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219b9d24", new Object[]{sectionModel})).booleanValue();
        }
        JSONObject ext = sectionModel.getExt();
        if (ext == null) {
            return false;
        }
        return ext.getBooleanValue("isBannerCard");
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d48e80", new Object[]{this})).booleanValue();
        }
        if (!vxl.b().g() || vxl.b().E() || vxl.b().F() || vxl.b().D()) {
            return false;
        }
        return true;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daef37b1", new Object[]{this, str});
            return;
        }
        HomeInfoFlowDataService a2 = rue.a(str);
        if (a2 == null) {
            fve.e("MicroservicesInfoFlowPerformance", "preLoadTheme dataService is null");
        } else {
            a2.preLoadTheme();
        }
    }

    public void j(String str, List<SectionModel> list, Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663d922b", new Object[]{this, str, list, context, new Boolean(z), new Integer(i)});
            return;
        }
        f0b.i().s(f0b.HOME_SUB_PRERENDER);
        f0b.i().p(f0b.HOME_SUB_PRERENDER, 2);
        mxl.b(str, list, new a(context, str, z, i));
    }

    public void k(String str, IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38013e9e", new Object[]{this, str, iContainerInnerDataModel});
            return;
        }
        HomeInfoFlowDataService a2 = rue.a(str);
        if (a2 == null) {
            fve.e("MicroservicesInfoFlowPerformance", "preloadCards dataService is null");
        } else {
            a2.registerFirstPageUrls(iContainerInnerDataModel);
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318788b5", new Object[]{this, new Integer(i)});
        } else {
            DTemplateManager.t(j18.HOMEPAGE_DX_MODULE).s(i);
        }
    }

    public final void m(Context context, String str, SectionModel sectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e484ca", new Object[]{this, context, str, sectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        HomeInfoFlowDataService a2 = rue.a(str);
        if (a2 == null) {
            fve.e("MicroservicesInfoFlowPerformance", "preloadCards dataService is null");
            return;
        }
        try {
            a2.preRenderItem(context, sectionModel, z, i);
        } catch (Exception e) {
            Log.e("MicroservicesInfoFlowPerformance", "subPreRender preRenderItem error", e);
        }
    }

    public final void n(Context context, String str, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c31b962", new Object[]{this, context, str, dXTemplateItem, baseSectionModel});
            return;
        }
        fve.e("MicroservicesInfoFlowPerformance", "preRender...name:" + baseSectionModel.getSectionBizCode());
        DinamicXEngine f = f18.f(j18.HOMEPAGE_DX_MODULE);
        if (f != null) {
            DXRenderOptions q = new DXRenderOptions.b().E(new InfoFlowDxUserContext(new nc8(), baseSectionModel)).q();
            if (bve.m()) {
                f.C0(context, dXTemplateItem, baseSectionModel, baseSectionModel.getIndex(), q);
            } else {
                f.B0(context, dXTemplateItem, baseSectionModel, baseSectionModel.getIndex(), q);
            }
        }
    }

    public static boolean h(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f3bac9", new Object[]{sectionModel})).booleanValue();
        }
        try {
            JSONObject ext = sectionModel.getExt();
            if (ext == null) {
                return false;
            }
            return ext.getBooleanValue("isVideoCard");
        } catch (Throwable th) {
            bqa.b("MicroservicesInfoFlowPerformance", "parse isVideoCard error ", th);
            return false;
        }
    }
}
