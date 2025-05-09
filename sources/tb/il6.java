package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class il6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.il6$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class C0945a implements hf5 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewGroup f21376a;
            public final /* synthetic */ DinamicXEngine b;
            public final /* synthetic */ gf5 c;

            public C0945a(ViewGroup viewGroup, DinamicXEngine dinamicXEngine, gf5 gf5Var) {
                this.f21376a = viewGroup;
                this.b = dinamicXEngine;
                this.c = gf5Var;
            }

            @Override // tb.hf5
            public void a(DXTemplateItem dXTemplateItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("daf0aa14", new Object[]{this, dXTemplateItem});
                    return;
                }
                a aVar = il6.Companion;
                Context context = this.f21376a.getContext();
                ckf.f(context, "parent.context");
                DXResult<DXRootView> f = aVar.f(context, this.b, dXTemplateItem);
                if (f == null) {
                    this.c.a("after download createView() dxViewResult is null");
                } else if (f.d()) {
                    gf5 gf5Var = this.c;
                    gf5Var.a("after download createView() has error: " + f.a().toString());
                } else {
                    DXRootView dXRootView = f.f7291a;
                    if (dXRootView == null) {
                        this.c.a("after download createView() dxViewResult.result is null");
                    } else {
                        this.c.b(dXRootView);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ gf5 f21377a;

            public b(gf5 gf5Var) {
                this.f21377a = gf5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gf5 gf5Var = this.f21377a;
                if (gf5Var != null) {
                    gf5Var.a("createView() dxViewResult is null");
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ gf5 f21378a;
            public final /* synthetic */ DXResult b;

            public c(gf5 gf5Var, DXResult dXResult) {
                this.f21378a = gf5Var;
                this.b = dXResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gf5 gf5Var = this.f21378a;
                if (gf5Var != null) {
                    gf5Var.a("createView() has error: " + this.b.a().toString());
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ gf5 f21379a;

            public d(gf5 gf5Var) {
                this.f21379a = gf5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gf5 gf5Var = this.f21379a;
                if (gf5Var != null) {
                    gf5Var.a("createView() dxViewResult.result is null");
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ gf5 f21380a;
            public final /* synthetic */ DXResult b;

            public e(gf5 gf5Var, DXResult dXResult) {
                this.f21380a = gf5Var;
                this.b = dXResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gf5 gf5Var = this.f21380a;
                if (gf5Var != null) {
                    gf5Var.b((ViewGroup) this.b.f7291a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class f implements iwb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXTemplateItem f21381a;
            public final /* synthetic */ hf5 b;

            public f(DXTemplateItem dXTemplateItem, hf5 hf5Var) {
                this.f21381a = dXTemplateItem;
                this.b = hf5Var;
            }

            @Override // tb.iwb
            public final void onNotificationListener(k66 k66Var) {
                Object obj;
                hf5 hf5Var;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                    return;
                }
                List<DXTemplateItem> list = k66Var.f22428a;
                if (list != null && !list.isEmpty()) {
                    List<DXTemplateItem> list2 = k66Var.f22428a;
                    ckf.f(list2, "result.finishedTemplateItems");
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((DXTemplateItem) obj).f7343a.equals(this.f21381a.f7343a)) {
                            break;
                        }
                    }
                    DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
                    if (dXTemplateItem != null && (hf5Var = this.b) != null) {
                        hf5Var.a(dXTemplateItem);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class g implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ if5 f21382a;

            public g(if5 if5Var) {
                this.f21382a = if5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if5 if5Var = this.f21382a;
                if (if5Var != null) {
                    if5Var.a("renderView() dxViewResult is null");
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class h implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ if5 f21383a;
            public final /* synthetic */ DXResult b;

            public h(if5 if5Var, DXResult dXResult) {
                this.f21383a = if5Var;
                this.b = dXResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if5 if5Var = this.f21383a;
                if (if5Var != null) {
                    if5Var.a("renderView() " + this.b.a().toString());
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class i implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ if5 f21384a;
            public final /* synthetic */ DXResult b;

            public i(if5 if5Var, DXResult dXResult) {
                this.f21384a = if5Var;
                this.b = dXResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if5 if5Var = this.f21384a;
                if (if5Var != null) {
                    if5Var.b((ViewGroup) this.b.f7291a);
                }
            }
        }

        static {
            t2o.a(629145651);
        }

        public a() {
        }

        @JvmStatic
        public final ViewGroup b(DinamicXEngine dinamicXEngine, DXTemplateItem dXTemplateItem, ViewGroup viewGroup, gf5 gf5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f4e7b6f2", new Object[]{this, dinamicXEngine, dXTemplateItem, viewGroup, gf5Var});
            }
            ckf.g(dinamicXEngine, "engine");
            ckf.g(dXTemplateItem, yg.CACHE_KEY_TEMPLATE_INFO);
            ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
            DXTemplateItem u = dinamicXEngine.u(dXTemplateItem);
            boolean d2 = d(u, dXTemplateItem);
            Context context = viewGroup.getContext();
            ckf.f(context, "parent.context");
            DXResult<DXRootView> f2 = f(context, dinamicXEngine, u);
            if (!d2 && gf5Var != null) {
                c(dinamicXEngine, dXTemplateItem, new C0945a(viewGroup, dinamicXEngine, gf5Var));
            }
            if (f2 == null) {
                i(new b(gf5Var));
            } else if (f2.d()) {
                i(new c(gf5Var, f2));
            } else if (f2.f7291a == null) {
                i(new d(gf5Var));
            } else {
                i(new e(gf5Var, f2));
            }
            if (f2 != null) {
                return f2.f7291a;
            }
            return null;
        }

        @JvmStatic
        public final void c(DinamicXEngine dinamicXEngine, DXTemplateItem dXTemplateItem, hf5 hf5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98427e8", new Object[]{this, dinamicXEngine, dXTemplateItem, hf5Var});
                return;
            }
            ckf.g(dinamicXEngine, "engine");
            ckf.g(dXTemplateItem, "templateItem");
            dinamicXEngine.a1(new f(dXTemplateItem, hf5Var));
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            xhv xhvVar = xhv.INSTANCE;
            dinamicXEngine.p(arrayList);
        }

        public final boolean d(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
            String str;
            String str2;
            Long l;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a9703e7", new Object[]{this, dXTemplateItem, dXTemplateItem2})).booleanValue();
            }
            if (dXTemplateItem == null && dXTemplateItem2 == null) {
                return true;
            }
            Long l2 = null;
            if (dXTemplateItem != null) {
                str = dXTemplateItem.f7343a;
            } else {
                str = null;
            }
            if (dXTemplateItem2 != null) {
                str2 = dXTemplateItem2.f7343a;
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str, str2)) {
                if (dXTemplateItem != null) {
                    l = Long.valueOf(dXTemplateItem.b);
                } else {
                    l = null;
                }
                if (dXTemplateItem2 != null) {
                    l2 = Long.valueOf(dXTemplateItem2.b);
                }
                if (ckf.b(l, l2)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("95f63efd", new Object[]{this, dXTemplateItem})).booleanValue();
            }
            if (dXTemplateItem != null) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final DXResult<DXRootView> f(Context context, DinamicXEngine dinamicXEngine, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXResult) ipChange.ipc$dispatch("5bd780c6", new Object[]{this, context, dinamicXEngine, dXTemplateItem});
            }
            ckf.g(context, "context");
            ckf.g(dinamicXEngine, "engine");
            try {
                if (!e(dXTemplateItem)) {
                    return new DXResult<>(j("Router_Create_view", dXTemplateItem, com.taobao.android.dinamicx.f.DXERROR_ROUTER_CREATE_VIEW_EXCEPTION_TEMPLATE_NULL, "template is null ", null));
                }
                return dinamicXEngine.o(context, dXTemplateItem);
            } catch (Throwable th) {
                if (DinamicXEngine.j0()) {
                    th.printStackTrace();
                }
                String a2 = xv5.a(th);
                ckf.f(a2, "DXExceptionUtil.getStackTrace(e)");
                return new DXResult<>(j("Router_Create_view", dXTemplateItem, 20005, a2, null));
            }
        }

        @JvmStatic
        public final void g(DinamicXEngine dinamicXEngine, DXRootView dXRootView, int i2, int i3, JSONObject jSONObject, if5 if5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65f7c9c4", new Object[]{this, dinamicXEngine, dXRootView, new Integer(i2), new Integer(i3), jSONObject, if5Var});
                return;
            }
            ckf.g(dinamicXEngine, "engine");
            ckf.g(dXRootView, "dxRootView");
            DXResult<DXRootView> i1 = dinamicXEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.b().G(i2).t(i3).q());
            if (i1 == null) {
                i(new g(if5Var));
            } else if (i1.d()) {
                i(new h(if5Var, i1));
            } else {
                i(new i(if5Var, i1));
            }
        }

        @JvmStatic
        public final void h(DinamicXEngine dinamicXEngine, DXRootView dXRootView, JSONObject jSONObject, if5 if5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50ffe924", new Object[]{this, dinamicXEngine, dXRootView, jSONObject, if5Var});
                return;
            }
            ckf.g(dinamicXEngine, "engine");
            ckf.g(dXRootView, "dxRootView");
            ckf.g(jSONObject, "data");
            g(dinamicXEngine, dXRootView, pb6.j(), pb6.i(), jSONObject, if5Var);
        }

        public final void i(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d49fc35", new Object[]{this, runnable});
            } else if (runnable != null) {
                runnable.run();
            }
        }

        public final com.taobao.android.dinamicx.f j(String str, DXTemplateItem dXTemplateItem, int i2, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.dinamicx.f) ipChange.ipc$dispatch("9e475532", new Object[]{this, str, dXTemplateItem, new Integer(i2), str2, map});
            }
            com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("promotion-content");
            fVar.b = dXTemplateItem;
            f.a aVar = new f.a("Router", str, i2);
            aVar.e = str2;
            aVar.f = map;
            fVar.c.add(aVar);
            ic5.p(fVar);
            return fVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final DinamicXEngine a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DinamicXEngine) ipChange.ipc$dispatch("4d167dee", new Object[]{this});
            }
            DXVideoControlConfig<iew> n = DXVideoControlConfig.n();
            try {
                IpChange ipChange2 = DXVideoViewWidgetNode.$ipChange;
                n.l(DXVideoViewWidgetNode.class);
                n.c(true);
            } catch (Throwable th) {
                odg.c("DXUtils", "find DXVideoViewWidgetNode error", th);
            }
            return new DinamicXEngine(new DXEngineConfig.b("promotion_content").Q(1).J(new y7(new zq("666", "DX"), null)).g0(true).R(true).j0(0).X(nd2.EVALUATION).Y("SwiftyRateKit").b0(true).W(true).i0(n).F());
        }
    }

    static {
        t2o.a(629145650);
    }

    @JvmStatic
    public static final DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("4d167dee", new Object[0]);
        }
        return Companion.a();
    }

    @JvmStatic
    public static final ViewGroup b(DinamicXEngine dinamicXEngine, DXTemplateItem dXTemplateItem, ViewGroup viewGroup, gf5 gf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f4e7b6f2", new Object[]{dinamicXEngine, dXTemplateItem, viewGroup, gf5Var});
        }
        return Companion.b(dinamicXEngine, dXTemplateItem, viewGroup, gf5Var);
    }

    @JvmStatic
    public static final void c(DinamicXEngine dinamicXEngine, DXRootView dXRootView, int i, int i2, JSONObject jSONObject, if5 if5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f7c9c4", new Object[]{dinamicXEngine, dXRootView, new Integer(i), new Integer(i2), jSONObject, if5Var});
        } else {
            Companion.g(dinamicXEngine, dXRootView, i, i2, jSONObject, if5Var);
        }
    }

    @JvmStatic
    public static final void d(DinamicXEngine dinamicXEngine, DXRootView dXRootView, JSONObject jSONObject, if5 if5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ffe924", new Object[]{dinamicXEngine, dXRootView, jSONObject, if5Var});
        } else {
            Companion.h(dinamicXEngine, dXRootView, jSONObject, if5Var);
        }
    }
}
