package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e69 extends jv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<sgc.b> b;
    public WeakReference<IContainerDataService.c> c;
    public WeakReference<IContainerDataService.d> d;
    public WeakReference<IContainerService.a> e;
    public boolean f;
    public final IContainerService k;
    public final IContainerDataService l;
    public final JSONObject h = new JSONObject(8);
    public final String g = c().getContainerType().getContainerId();
    public final v6h i = new v6h();
    public final w6h j = new w6h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.d
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcf761e", new Object[]{this, str, jSONObject});
            } else if (TextUtils.equals(str, "ViewAppear")) {
                e69.e(e69.this, jSONObject.getIntValue("index"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            e69.f(e69.this).f(iUiRefreshActionModel);
            e69.g(e69.this).f(iUiRefreshActionModel);
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
            } else if (TextUtils.equals(str, "scrollNextPage")) {
                e69.g(e69.this).l();
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            } else if (TextUtils.equals(str3, "scrollNextPage")) {
                e69.g(e69.this).l();
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            } else if (TextUtils.equals(str, "scrollNextPage")) {
                e69.g(e69.this).k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements sgc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.sgc.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }

        @Override // tb.sgc.b
        public void h(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            } else {
                e69.i(e69.this, view, baseSectionModel);
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            }
        }

        @Override // tb.sgc.b
        public void o(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
            } else {
                e69.h(e69.this, i, view, baseSectionModel);
            }
        }
    }

    static {
        t2o.a(491782543);
    }

    public e69(cfc cfcVar) {
        super(cfcVar);
        this.k = (IContainerService) cfcVar.a(IContainerService.class);
        this.l = (IContainerDataService) cfcVar.a(IContainerDataService.class);
    }

    public static /* synthetic */ void e(e69 e69Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794e697f", new Object[]{e69Var, new Integer(i)});
        } else {
            e69Var.d(i);
        }
    }

    public static /* synthetic */ v6h f(e69 e69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v6h) ipChange.ipc$dispatch("3f4933d6", new Object[]{e69Var});
        }
        return e69Var.i;
    }

    public static /* synthetic */ w6h g(e69 e69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6h) ipChange.ipc$dispatch("1d339319", new Object[]{e69Var});
        }
        return e69Var.j;
    }

    public static /* synthetic */ void h(e69 e69Var, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8570a0be", new Object[]{e69Var, new Integer(i), view, baseSectionModel});
        } else {
            e69Var.s(i, view, baseSectionModel);
        }
    }

    public static /* synthetic */ void i(e69 e69Var, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796b9612", new Object[]{e69Var, view, baseSectionModel});
        } else {
            e69Var.t(view, baseSectionModel);
        }
    }

    public static /* synthetic */ Object ipc$super(e69 e69Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/performanceoptimizationservice/impl/trace/feeds/loadmore/FeedsLoadMorePerformanceTrace");
    }

    @Override // tb.g8d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
        } else {
            w();
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc2e182", new Object[]{this, new Integer(i)});
        } else if (this.j != null) {
            this.j.m(this.g, l(), o(), i, n());
        }
    }

    public final sgc.b j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.b) ipChange.ipc$dispatch("2df3f22b", new Object[]{this});
        }
        return new d();
    }

    public final IContainerDataService.c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("7d4f9901", new Object[]{this});
        }
        return new c();
    }

    public final int l() {
        IContainerInnerDataModel base;
        IPageDataModel pageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) c().a(IContainerDataService.class);
        if (iContainerDataService == null || iContainerDataService.getContainerData() == null || (base = iContainerDataService.getContainerData().getBase()) == null || (pageParams = base.getPageParams()) == null) {
            return 0;
        }
        return pageParams.getPageNum();
    }

    public final IPageDataModel m(IContainerDataModel<?> iContainerDataModel) {
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

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cecebe3", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = this.l;
        if (iContainerDataService == null || iContainerDataService.getContainerData() == null) {
            return 10;
        }
        IPageDataModel m = m(this.l.getContainerData());
        if (m != null) {
            return m.getRequestInAdvance();
        }
        fve.e("Smart_Loading", "pageDataModel == null");
        return 10;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab1d792", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = this.l;
        if (iContainerDataService == null || iContainerDataService.getContainerData() == null) {
            return -1;
        }
        return this.l.getContainerData().getTotalData().size();
    }

    public final boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13aaa2a", new Object[]{this, str})).booleanValue();
        }
        return "loading".equals(str);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fb657f", new Object[]{this});
            return;
        }
        rca.a(this.g, "homeLoadingStay", d0b.a());
        if (this.h.containsKey("attachTime")) {
            this.h.put("bucket", (Object) d0b.a());
            this.h.put("stayTime", (Object) Long.valueOf(SystemClock.uptimeMillis() - this.h.getLongValue("attachTime")));
            uqa.b("Performance", "Smart_Loading", this.h.toJSONString());
            this.h.clear();
        }
        this.i.e();
        this.j.e();
    }

    public final void s(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77380415", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (baseSectionModel != null) {
            v(i, baseSectionModel);
            if (p(baseSectionModel.getSectionBizCode())) {
                q(i);
            }
        }
    }

    @Override // tb.g8d
    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else {
            x();
        }
    }

    public final void t(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb8e452", new Object[]{this, view, baseSectionModel});
        } else if (baseSectionModel != null && p(baseSectionModel.getSectionBizCode())) {
            r();
        }
    }

    public final void u() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f11046", new Object[]{this});
            return;
        }
        WeakReference<IContainerDataService.c> weakReference = this.c;
        if (weakReference != null && (cVar = weakReference.get()) != null) {
            this.l.removeRequestListener(cVar);
        }
    }

    public final void v(int i, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe73d28", new Object[]{this, new Integer(i), baseSectionModel});
        } else if (!this.f && i > 0) {
            this.f = true;
            HashMap hashMap = new HashMap();
            hashMap.put("isRemoteData", Boolean.valueOf(b3b.f(b3b.b(baseSectionModel))));
            rca.a(this.g, "homeViewRender", hashMap);
            rca.c(this.g, "homeViewLayout", 1);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6643d364", new Object[]{this});
            return;
        }
        h6c<?> b2 = b();
        if (b2 != null) {
            sgc.b j = j();
            this.b = new WeakReference<>(j);
            b2.y(j);
            IContainerDataService.c k = k();
            this.c = new WeakReference<>(k);
            this.l.addRequestListener(k);
            a aVar = new a();
            this.d = new WeakReference<>(aVar);
            this.l.addTriggerEventListener(aVar);
            b bVar = new b();
            this.e = new WeakReference<>(bVar);
            this.k.addUiRefreshListener(bVar);
        }
    }

    public final void x() {
        IContainerDataService.d dVar;
        IContainerDataService iContainerDataService;
        IContainerService.a aVar;
        IContainerService iContainerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef9abc4", new Object[]{this});
            return;
        }
        h6c<?> b2 = b();
        if (b2 != null) {
            sgc.b bVar = this.b.get();
            if (bVar != null) {
                b2.q(bVar);
            }
            u();
            WeakReference<IContainerService.a> weakReference = this.e;
            if (!(weakReference == null || (aVar = weakReference.get()) == null || (iContainerService = this.k) == null)) {
                iContainerService.removeUiRefreshListener(aVar);
            }
            WeakReference<IContainerDataService.d> weakReference2 = this.d;
            if (weakReference2 != null && (dVar = weakReference2.get()) != null && (iContainerDataService = this.l) != null) {
                iContainerDataService.removeTriggerEventListener(dVar);
            }
        }
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d556edc", new Object[]{this, new Integer(i)});
            return;
        }
        uve.a(c().getContainerType().a(), 19999, "nextPageLoading", null, null, "");
        HashMap hashMap = new HashMap();
        int l = l();
        hashMap.put("homeLoadingStay_" + i + "_" + l, 0);
        rca.d(this.g, "homeLoadingStay", 1, hashMap);
        this.h.put("index", (Object) Integer.valueOf(i));
        this.h.put("pageNum", (Object) Integer.valueOf(l));
        this.h.put("attachTime", (Object) Long.valueOf(SystemClock.uptimeMillis()));
        this.i.d(l, i);
        this.j.j(l, i, o());
    }
}
