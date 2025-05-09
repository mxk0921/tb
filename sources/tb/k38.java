package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k38 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_FIRST_SCREEN_CARD = 8;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f22377a;

    static {
        t2o.a(486539334);
    }

    public k38(DinamicXEngine dinamicXEngine) {
        this.f22377a = dinamicXEngine;
    }

    public static int e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string;
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e69d3fd", new Object[]{jSONObject})).intValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null || (string = jSONObject2.getString("index")) == null) {
            return -1;
        }
        try {
            parseInt = Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            fve.e("DxTemplateClassifier", "NumberFormatException，无法转换坑位");
        }
        if (parseInt < 0 || parseInt >= 8) {
            return -1;
        }
        return parseInt;
    }

    public void a(cfc cfcVar, List<BaseSectionModel> list, List<DXTemplateItem> list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f063fd", new Object[]{this, cfcVar, list, list2, new Boolean(z)});
            return;
        }
        for (BaseSectionModel baseSectionModel : list) {
            f94 d = d(baseSectionModel);
            if (d != null) {
                if (!d.i()) {
                    fve.e("DxTemplateClassifier", "dx2模版：" + d.d());
                } else {
                    DXTemplateItem c = d.c();
                    if (!c(c, list2)) {
                        list2.add(c);
                    }
                    if (z) {
                        f(c, baseSectionModel, cfcVar);
                    }
                }
            }
        }
    }

    public final boolean c(DXTemplateItem dXTemplateItem, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4929c1c", new Object[]{this, dXTemplateItem, list})).booleanValue();
        }
        for (DXTemplateItem dXTemplateItem2 : list) {
            if (dXTemplateItem2.equals(dXTemplateItem)) {
                return true;
            }
        }
        return false;
    }

    public final f94 d(BaseSectionModel<?> baseSectionModel) {
        BaseTemplateModel template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f94) ipChange.ipc$dispatch("cbf693e5", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || (template = baseSectionModel.getTemplate()) == null) {
            return null;
        }
        return uit.a(template);
    }

    public final void f(DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, cfc cfcVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b438d117", new Object[]{this, dXTemplateItem, baseSectionModel, cfcVar});
            return;
        }
        DXRenderOptions q = new DXRenderOptions.b().E(new InfoFlowDxUserContext(cfcVar, baseSectionModel)).q();
        DXTemplateItem u = this.f22377a.u(dXTemplateItem);
        if (u == null) {
            if (baseSectionModel != null && baseSectionModel.getIndex() < 6) {
                StringBuilder sb = new StringBuilder("templateName: ");
                if (dXTemplateItem == null) {
                    str = "";
                } else {
                    str = dXTemplateItem.f7343a;
                }
                sb.append(str);
                tve.b("presetTemplate", "homepage", "1.0", null, null, null, "templateNotPreset", sb.toString());
            }
            fve.e("DinamicX3Render", "prefetchTemplate availableTemplate == null");
        } else if (u.b == dXTemplateItem.b) {
            fve.e("DinamicX3Render", "prefetchTemplate name：" + u.f7343a + " version: " + u.b);
            this.f22377a.E0(DinamicXEngine.x(), baseSectionModel, u, -1, q);
        }
    }
}
