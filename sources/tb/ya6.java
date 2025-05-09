package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.mmad.render.dx.widget.a;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.weex.common.WXConfig;
import java.util.ArrayList;
import java.util.HashMap;
import tb.s44;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ya6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE = "MMAdBiz";

    /* renamed from: a  reason: collision with root package name */
    public final nwi f31931a;
    public DinamicXEngine b;
    public DXRootView c;
    public t36 d;
    public DXTemplateItem e;
    public j46 f;

    static {
        t2o.a(573571180);
    }

    public ya6(nwi nwiVar) {
        this.f31931a = nwiVar;
    }

    public static DXTemplateItem a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("ae69de48", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("template");
        if (jSONObject2 == null) {
            jgh.a("checkDXInfoValid", "template do not exist in splash data.");
            return null;
        } else if (TextUtils.isEmpty(jSONObject2.getString("name")) || TextUtils.isEmpty(jSONObject2.getString("url")) || jSONObject2.getLongValue("version") <= 0) {
            jgh.a("checkDXInfoValid", "skip DX download, not valid DX template, template=" + jSONObject2);
            return null;
        } else {
            DXTemplateItem b = b(jSONObject2);
            if (b != null) {
                return b;
            }
            jgh.a("checkDXInfoValid", "downloadTemplate error, templateItem convert fail");
            return null;
        }
    }

    public static DXTemplateItem b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("db8d2f23", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            jgh.a("DXRenderService", "convertTemplate error, template is null");
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.b = jSONObject.getLongValue("version");
        dXTemplateItem.f7343a = jSONObject.getString("name");
        dXTemplateItem.c = jSONObject.getString("url");
        if (dXTemplateItem.b <= 0 || TextUtils.isEmpty(dXTemplateItem.f7343a) || TextUtils.isEmpty(dXTemplateItem.c)) {
            jgh.a("DXRenderService", "convertTemplate error, template=" + jSONObject);
            return null;
        }
        jgh.a("DXRenderService", "convertTemplate success, dxTemplateItem=" + dXTemplateItem);
        return dXTemplateItem;
    }

    public final DXRenderOptions c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions) ipChange.ipc$dispatch("7aca710f", new Object[]{this});
        }
        return new DXRenderOptions.b().E(this.d).q();
    }

    public View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        if (!lf4.e()) {
            DXTemplateItem b = b(this.f31931a.d().m().getJSONObject("template"));
            jgh.a("DXRenderService", "render: DXTemplateItem=" + b);
            DXTemplateItem g = g(b);
            this.e = g;
            if (g == null) {
                jgh.a("DXRenderService", "render: after fetch dxTemplateItem is null");
                return null;
            }
        } else if (this.e == null) {
            DXTemplateItem b2 = b(this.f31931a.d().m().getJSONObject("template"));
            jgh.a("DXRenderService", "render: DXTemplateItem=" + b2);
            DXTemplateItem g2 = g(b2);
            this.e = g2;
            if (g2 == null) {
                jgh.a("DXRenderService", "render: after fetch dxTemplateItem is null");
                return null;
            }
        } else {
            jgh.a("DXRenderService", "render: use mFetchedTemplate=" + this.e);
        }
        this.f31931a.d().g().put("topshowScreenHeight", (Object) Float.valueOf(kr7.c(this.f31931a)));
        this.f31931a.d().g().put(WXConfig.fullScreenHeight, (Object) Float.valueOf(kr7.b(this.f31931a)));
        JSONObject g3 = this.f31931a.d().g();
        Boolean bool = Boolean.FALSE;
        g3.put("disableInteract", (Object) bool);
        this.f31931a.d().g().put("disableAnimation", (Object) bool);
        this.f31931a.a().f(this.e.f7343a);
        DXRootView dXRootView = this.b.o(context, this.e).f7291a;
        this.c = dXRootView;
        if (dXRootView == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("template", this.e.f7343a);
            i4v.l(i4v.ARG1_DX_CREATE_VIEW_NULL, this.f31931a, hashMap);
        }
        return this.c;
    }

    public void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a821f67", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
            if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null) {
                DXTemplateItem a2 = a(jSONObject2);
                if (a2 == null) {
                    jgh.a("DXRenderService", "downloadTemplate dx info error");
                    return;
                }
                arrayList.add(a2);
                jgh.a("DXRenderService", "downloadTemplate start template=" + a2);
                this.b.p(arrayList);
            }
        }
    }

    public void f(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda96292", new Object[]{this, dXTemplateItem});
        } else if (dXTemplateItem != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            jgh.a("DXRenderService", "downloadTemplate start template=" + dXTemplateItem);
            this.b.p(arrayList);
        }
    }

    public DXTemplateItem g(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("5c92991d", new Object[]{this, dXTemplateItem});
        }
        DXTemplateItem u = this.b.u(dXTemplateItem);
        if (u == null) {
            jgh.a("DXRenderService", "render DXTemplateItem after fetch is null");
            i4v.l(i4v.ARG1_DX_DOWNLOAD_ERROR, this.f31931a, null);
            return null;
        } else if (u.b == dXTemplateItem.b) {
            return u;
        } else {
            jgh.a("DXRenderService", "render after fetch version not match, fetchTemplate=" + u + ", dxTemplateItem=" + dXTemplateItem);
            i4v.l(i4v.ARG1_DX_TEMPLATE_VERSION_ERROR, this.f31931a, null);
            return null;
        }
    }

    public View h(String str) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("44aba92e", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (dXRootView = this.c) != null) {
            return i(dXRootView, str);
        }
        jgh.a("DXRenderService", "findViewByUserId error, userId=" + str + ", renderView=" + this.c);
        return null;
    }

    public final View i(ViewGroup viewGroup, String str) {
        View i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2344ca0a", new Object[]{this, viewGroup, str});
        }
        if (!TextUtils.isEmpty(str) && viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                Object tag = childAt.getTag(DXWidgetNode.TAG_WIDGET_NODE);
                if ((tag instanceof DXWidgetNode) && str.equals(((DXWidgetNode) tag).getUserId())) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (i = i((ViewGroup) childAt, str)) != null) {
                    return i;
                }
            }
        }
        return null;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.u0(this.c);
        }
        DXRootView dXRootView = this.c;
        if (dXRootView != null) {
            dXRootView.setVisibility(4);
        }
        this.e = null;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba2f75f", new Object[]{this});
        } else if (this.b == null) {
            this.b = new DinamicXEngine(new DXEngineConfig.b(BIZ_TYPE).F());
            this.d = new t36(this.f31931a);
            this.f = new j46(this.f31931a);
            m(this.b);
        }
    }

    public void l(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d88eb8", new Object[]{this, str, obj});
        } else if (this.b == null || this.c == null) {
            jgh.a("DXRenderService", "refreshWithData null, dinamicXEngine=" + this.b + ", renderView=" + this.c);
        } else {
            JSONObject jSONObject = new JSONObject(this.f31931a.d().g());
            jSONObject.put(str, obj);
            this.b.i1(this.c.getContext(), this.c, this.e, jSONObject, 0, c());
        }
    }

    public final void m(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1729cec0", new Object[]{this, dinamicXEngine});
            return;
        }
        dinamicXEngine.e1(a.DXMMSWIPEINTERACTIONVIEW_MMSWIPEINTERACTIONVIEW, new a.C0622a());
        dinamicXEngine.V0(go5.DX_PARSER_MMGETLOCALURL, new go5());
        dinamicXEngine.V0(ho5.DX_PARSER_MM_ORANGE, new ho5());
        dinamicXEngine.V0(hq5.DX_PARSER_SPLITJSONARRAY, new hq5());
        dinamicXEngine.V0(io5.DX_PARSER_MM_REMOVE_URL_QUERY, new io5());
        dinamicXEngine.W0(18615516725124L, this.f);
        dinamicXEngine.J0(s44.COMMITINTERACTEND, new s44.a());
        dinamicXEngine.Z0("MMMegaAbility", this.f);
        dinamicXEngine.Z0("advertisement", new hg0(this.f31931a));
    }

    public void n(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a0855e", new Object[]{this, iwbVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null && iwbVar != null) {
            dinamicXEngine.a1(iwbVar);
        }
    }

    public void p(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd81f63b", new Object[]{this, dXTemplateItem});
        } else {
            this.e = dXTemplateItem;
        }
    }

    public boolean o(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d8c49aa", new Object[]{this, context})).booleanValue();
        }
        DXResult<DXRootView> i1 = this.b.i1(context, this.c, this.e, this.f31931a.d().g(), 0, c());
        jgh.a("DXRenderService", "render: result view DxError =" + i1.a());
        if (this.c == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("template", this.e.f7343a);
            i4v.l(i4v.ARG1_DX_RENDER_VIEW_NULL, this.f31931a, hashMap);
            z = false;
        }
        this.b.t0(this.c);
        return z;
    }
}
