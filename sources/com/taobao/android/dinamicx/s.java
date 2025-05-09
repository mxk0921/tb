package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ad5;
import tb.av;
import tb.bv;
import tb.bv7;
import tb.evb;
import tb.f65;
import tb.fl6;
import tb.ic5;
import tb.iwb;
import tb.iy5;
import tb.kn7;
import tb.mvb;
import tb.q65;
import tb.qub;
import tb.sn7;
import tb.t2o;
import tb.tfw;
import tb.tl7;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final DinamicXEngine c;
    public final DTemplateManager d = DTemplateManager.t(this.f15675a);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements kn7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(bv7 bv7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f21c97", new Object[]{this, bv7Var});
            } else if (bv7Var != null) {
                s sVar = s.this;
                sVar.c.n.g(sVar.A(bv7Var.f16658a), s.this.A(bv7Var.b));
            }
        }
    }

    static {
        t2o.a(444596599);
    }

    public s(DXEngineConfig dXEngineConfig) {
        super(dXEngineConfig);
        DinamicXEngine dinamicXEngine = new DinamicXEngine(dXEngineConfig);
        this.c = dinamicXEngine;
        this.b = dinamicXEngine.b;
    }

    public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DinamicXEngineRouter");
    }

    public static Context j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[0]);
        }
        return DinamicXEngine.x();
    }

    public static void l(Context context, iy5 iy5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60f9cd0", new Object[]{context, iy5Var, new Boolean(z)});
            return;
        }
        try {
            DinamicXEngine.i0(context, iy5Var);
            tl7.e(context, z);
        } catch (Throwable unused) {
        }
    }

    public List<DXTemplateItem> A(List<DinamicTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7063488a", new Object[]{this, list});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (list != null && list.size() > 0) {
                for (DinamicTemplate dinamicTemplate : list) {
                    DXTemplateItem z = z(dinamicTemplate);
                    if (z != null) {
                        arrayList.add(z);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
            x("Router_Transform_Template", null, f.DXERROR_ROUTER_TRASFORM_TEMPLATE_TOV3_EXCEPTION, "transformTemplateToV3 error:" + xv5.a(th), null);
            return null;
        }
    }

    public void B(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6a32a6", new Object[]{this, iwbVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.o1(iwbVar);
        }
    }

    public void C(String str, bv bvVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da55161", new Object[]{this, str, bvVar});
        } else {
            f65.n().g(str, bvVar);
        }
    }

    public void D(String str, av avVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4ee760", new Object[]{this, str, avVar});
        } else {
            f65.n().f(str, avVar);
        }
    }

    public void E(String str, sn7 sn7Var) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2711c875", new Object[]{this, str, sn7Var});
        } else {
            f65.n().m(str, sn7Var);
        }
    }

    public void h(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233f6469", new Object[]{this, list});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                DXTemplateItem dXTemplateItem = list.get(i);
                if (m(dXTemplateItem)) {
                    arrayList.add(dXTemplateItem);
                } else if (!TextUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.c.endsWith(".xml")) {
                    arrayList2.add(y(dXTemplateItem));
                }
            }
            if (this.d != null && arrayList2.size() > 0) {
                this.d.d(arrayList2, new a());
            }
            if (this.c != null && arrayList.size() > 0) {
                this.c.p(arrayList);
            }
        } catch (Throwable th) {
            x("Router_Download", null, 20008, xv5.a(th), null);
        }
    }

    public DXTemplateItem i(DXTemplateItem dXTemplateItem) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12c999fb", new Object[]{this, dXTemplateItem});
        }
        try {
            if (!n(dXTemplateItem)) {
                return null;
            }
            if (!m(dXTemplateItem) || (dinamicXEngine = this.c) == null) {
                DXTemplateItem z = z(this.d.f(y(dXTemplateItem)));
                if (z != null) {
                    z.l(20000);
                }
                return z;
            }
            DXTemplateItem u = dinamicXEngine.u(dXTemplateItem);
            if (u != null) {
                u.l(30000);
            }
            return u;
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
            x("Router_Fetch", dXTemplateItem, 20007, xv5.a(th), null);
            return null;
        }
    }

    public DinamicXEngine k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b092b8e8", new Object[]{this});
        }
        return this.c;
    }

    public boolean m(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28eaf495", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null) {
            return false;
        }
        if (dXTemplateItem.c() == 30000) {
            return true;
        }
        if (dXTemplateItem.c() == 20000) {
            return false;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) && (dXTemplateItem.c.endsWith(".zip") || dXTemplateItem.c.endsWith("._dxv4") || dXTemplateItem.c.contains("._dxv4") || dXTemplateItem.c.contains(".zip"))) {
            return true;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) || dXTemplateItem.b < 0) {
            return false;
        }
        return true;
    }

    public final boolean n(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f63efd", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem != null) {
            return true;
        }
        return false;
    }

    public DXResult<DXRootView> o(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("a6c25ddb", new Object[]{this, context, dXTemplateItem});
        }
        if (!n(dXTemplateItem)) {
            return new DXResult<>(x("Router_Create_view", dXTemplateItem, f.DXERROR_ROUTER_CREATE_VIEW_EXCEPTION_TEMPLATE_NULL, "preCreateView template is null ", null));
        }
        if (m(dXTemplateItem)) {
            return this.c.z0(context, dXTemplateItem);
        }
        return this.c.o(context, dXTemplateItem);
    }

    public void p(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d2b56", new Object[]{this, context, dXTemplateItem, jSONObject, new Integer(i), dXRenderOptions});
        } else if (m(dXTemplateItem)) {
            this.c.B0(context, dXTemplateItem, jSONObject, i, dXRenderOptions);
        }
    }

    public void q(Context context, JSONObject jSONObject, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248ea969", new Object[]{this, context, jSONObject, dXTemplateItem});
        } else if (!n(dXTemplateItem)) {
            x("Router_Create_view", dXTemplateItem, f.DXERROR_ROUTER_CREATE_VIEW_EXCEPTION_TEMPLATE_NULL, "prefetchTemplate template is null ", null);
        } else if (m(dXTemplateItem)) {
            this.c.D0(context, jSONObject, dXTemplateItem, -1);
        }
    }

    public boolean r(long j, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2c3e9a", new Object[]{this, new Long(j), evbVar})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            return dinamicXEngine.V0(j, evbVar);
        }
        return false;
    }

    public boolean s(long j, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12f93081", new Object[]{this, new Long(j), mvbVar})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            return dinamicXEngine.W0(j, mvbVar);
        }
        return false;
    }

    public void t(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fbd62d", new Object[]{this, iwbVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.a1(iwbVar);
        }
    }

    public boolean u(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31e964d3", new Object[]{this, new Long(j), qubVar})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            return dinamicXEngine.e1(j, qubVar);
        }
        return false;
    }

    public DXResult<DXRootView> w(Context context, JSONObject jSONObject, DXRootView dXRootView, int i, DXRenderOptions dXRenderOptions) {
        Throwable th;
        DXTemplateItem dXTemplateItem;
        DXTemplateItem dXTemplateItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("3b5c1ca4", new Object[]{this, context, jSONObject, dXRootView, new Integer(i), dXRenderOptions});
        }
        fl6 fl6Var = null;
        try {
            dXTemplateItem2 = dXRootView.dxTemplateItem;
        } catch (Throwable th2) {
            th = th2;
            dXTemplateItem = null;
        }
        try {
            if (!n(dXTemplateItem2)) {
                return new DXResult<>(x("Router_Render", dXTemplateItem2, 20006, "template is null ", null));
            }
            if (m(dXTemplateItem2)) {
                return this.c.i1(context, dXRootView, dXTemplateItem2, jSONObject, i, dXRenderOptions);
            }
            q65 q = q65.q(this.f15675a);
            if (dXRenderOptions != null) {
                fl6Var = dXRenderOptions.h();
            }
            tfw e = q.e(dXRootView, jSONObject, fl6Var);
            if (e == null) {
                return new DXResult<>(x("Router_Render", dXTemplateItem2, 20006, "2.0 render 失败", null));
            }
            if (!e.e()) {
                return new DXResult<>((DXRootView) e.d(), x("Router_Render", dXTemplateItem2, 20006, "2.0 render 失败", e.b().c()));
            }
            return new DXResult<>((DXRootView) e.d());
        } catch (Throwable th3) {
            th = th3;
            dXTemplateItem = dXTemplateItem2;
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
            return new DXResult<>(x("Router_Render", dXTemplateItem, f.DXERROR_ROUTER_RENDER_VIEW_EXCEPTION_CATCH, xv5.a(th), null));
        }
    }

    public final f x(String str, DXTemplateItem dXTemplateItem, int i, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("9e475532", new Object[]{this, str, dXTemplateItem, new Integer(i), str2, map});
        }
        f fVar = new f(this.f15675a);
        fVar.b = dXTemplateItem;
        f.a aVar = new f.a("Router", str, i);
        aVar.e = str2;
        aVar.f = map;
        fVar.c.add(aVar);
        ic5.p(fVar);
        return fVar;
    }

    public DinamicTemplate y(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("9d8b4cd3", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        try {
            DinamicTemplate dinamicTemplate = new DinamicTemplate();
            dinamicTemplate.name = dXTemplateItem.f7343a;
            if (dXTemplateItem.b >= 0) {
                dinamicTemplate.version = dXTemplateItem.b + "";
            }
            dinamicTemplate.templateUrl = dXTemplateItem.c;
            return dinamicTemplate;
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
            x("Router_Transform_Template", null, f.DXERROR_ROUTER_TRASFORM_TEMPLATE_TOV2_EXCEPTION, "transformTemplateToV3 error:" + xv5.a(th), null);
            return null;
        }
    }

    public DXTemplateItem z(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("62779590", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        try {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = dinamicTemplate.name;
            if (!TextUtils.isEmpty(dinamicTemplate.version)) {
                dXTemplateItem.b = Long.parseLong(dinamicTemplate.version);
            } else {
                dXTemplateItem.b = -1L;
            }
            dXTemplateItem.c = dinamicTemplate.templateUrl;
            return dXTemplateItem;
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public DXResult<DXRootView> g(Context context, ViewGroup viewGroup, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("a8ada39", new Object[]{this, context, viewGroup, dXTemplateItem});
        }
        try {
            if (!n(dXTemplateItem)) {
                return new DXResult<>(x("Router_Create_view", dXTemplateItem, f.DXERROR_ROUTER_CREATE_VIEW_EXCEPTION_TEMPLATE_NULL, "template is null ", null));
            }
            if (m(dXTemplateItem)) {
                return this.c.o(context, dXTemplateItem);
            }
            tfw k = q65.q(this.f15675a).k(context, null, y(dXTemplateItem));
            DXRootView dXRootView = new DXRootView(context);
            DXResult<DXRootView> dXResult = new DXResult<>(dXRootView);
            if (k == null) {
                dXResult.e(x("Router_Create_view", dXTemplateItem, f.DXERROR_ROUTER_CREATE_VIEW_EXCEPTION_V2_FAIL, "2.0 createView 失败 viewResult == null", null));
                dXResult.i(null);
                return dXResult;
            }
            if (!k.f()) {
                dXResult.e(x("Router_Create_view", dXTemplateItem, f.DXERROR_ROUTER_CREATE_VIEW_EXCEPTION_V2_FAIL, "2.0 createView 失败", k.b().c()));
                if (k.d() == null) {
                    dXResult.i(null);
                    return dXResult;
                }
            }
            ViewGroup.LayoutParams layoutParams = k.d().getLayoutParams();
            if (layoutParams != null) {
                dXRootView.setLayoutParams(layoutParams);
            } else {
                dXRootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            dXRootView.setV2(true);
            dXRootView.dxTemplateItem = dXTemplateItem;
            dXRootView.addView(k.d());
            k.i(dXRootView);
            return dXResult;
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
            return new DXResult<>(x("Router_Create_view", dXTemplateItem, 20005, xv5.a(th), null));
        }
    }

    public DXResult<DXRootView> v(Context context, JSONObject jSONObject, DXRootView dXRootView, int i, int i2, Object obj) {
        DXTemplateItem dXTemplateItem;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("4819f085", new Object[]{this, context, jSONObject, dXRootView, new Integer(i), new Integer(i2), obj});
        }
        try {
            dXTemplateItem = dXRootView.dxTemplateItem;
            try {
                if (!n(dXTemplateItem)) {
                    return new DXResult<>(x("Router_Render", dXTemplateItem, 20006, "template is null ", null));
                }
                if (m(dXTemplateItem)) {
                    return this.c.h1(context, jSONObject, dXRootView, i, i2, obj);
                }
                tfw e = q65.q(this.f15675a).e(dXRootView, jSONObject, obj);
                if (e == null) {
                    return new DXResult<>(x("Router_Render", dXTemplateItem, 20006, "2.0 render 失败", null));
                }
                if (!e.e()) {
                    return new DXResult<>((DXRootView) e.d(), x("Router_Render", dXTemplateItem, 20006, "2.0 render 失败", e.b().c()));
                }
                return new DXResult<>((DXRootView) e.d());
            } catch (Throwable th2) {
                th = th2;
                xv5.b(th);
                return new DXResult<>(x("Router_Render", dXTemplateItem, f.DXERROR_ROUTER_RENDER_VIEW_EXCEPTION_CATCH, xv5.a(th), null));
            }
        } catch (Throwable th3) {
            th = th3;
            dXTemplateItem = null;
        }
    }
}
