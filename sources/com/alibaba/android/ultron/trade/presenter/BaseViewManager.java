package com.alibaba.android.ultron.trade.presenter;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.trade.event.model.OpenPopupWindowEventModel;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.av;
import tb.bpt;
import tb.co9;
import tb.et6;
import tb.evb;
import tb.fdd;
import tb.gsb;
import tb.hav;
import tb.hqu;
import tb.jc4;
import tb.kcu;
import tb.kvc;
import tb.kz1;
import tb.lcu;
import tb.mcu;
import tb.mqk;
import tb.qbe;
import tb.qub;
import tb.sn7;
import tb.t2o;
import tb.twl;
import tb.u0q;
import tb.vcv;
import tb.w0j;
import tb.z7v;
import tb.z9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BaseViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXPOSURE_ONCE = 1;
    public static final int EXPOSURE_REPEAT = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f2303a;
    public final fdd b;
    public final ViewEngine c;
    public PopupWindowManager d;
    public co9 e;
    public Pair<IDMComponent, gsb> f;
    public ViewGroup g;
    public ViewGroup h;
    public RecyclerView i;
    public String j = "";
    public int k = 0;
    public boolean l;
    public HandlerThread m;
    public Handler n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ExposureStrategy {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements jc4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.ultron.trade.presenter.BaseViewManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0073a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IDMComponent f2305a;
            public final /* synthetic */ List b;
            public final /* synthetic */ mcu c;

            public RunnableC0073a(IDMComponent iDMComponent, List list, mcu mcuVar) {
                this.f2305a = iDMComponent;
                this.b = list;
                this.c = mcuVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BaseViewManager.e(BaseViewManager.this, this.f2305a, this.b, this.c);
                }
            }
        }

        public a() {
        }

        @Override // tb.jc4
        public void a(ViewGroup viewGroup, int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3caeab4", new Object[]{this, viewGroup, new Integer(i), map});
            } else if (BaseViewManager.a(BaseViewManager.this) != null) {
                BaseViewManager.a(BaseViewManager.this).a(viewGroup, i, map);
            }
        }

        @Override // tb.jc4
        public void b(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent, Map<String, Object> map) {
            List<gsb> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e613c21", new Object[]{this, recyclerViewHolder, iDMComponent, map});
                return;
            }
            if (BaseViewManager.a(BaseViewManager.this) != null) {
                BaseViewManager.a(BaseViewManager.this).b(recyclerViewHolder, iDMComponent, map);
            }
            if (iDMComponent != null && BaseViewManager.this.x()) {
                fdd fddVar = BaseViewManager.this.b;
                if (fddVar instanceof kz1) {
                    ((kz1) fddVar).n(iDMComponent, "exposureItem");
                }
                Map<String, List<gsb>> eventMap = iDMComponent.getEventMap();
                if (eventMap != null && (list = eventMap.get("exposureItem")) != null) {
                    if (BaseViewManager.b(BaseViewManager.this) == 1 && iDMComponent.getExtMap() != null) {
                        if (iDMComponent.getExtMap().get("exposureCount") == null) {
                            iDMComponent.getExtMap().put("exposureCount", 1);
                        } else {
                            return;
                        }
                    }
                    mcu g = BaseViewManager.this.b.g();
                    if (BaseViewManager.c(BaseViewManager.this)) {
                        ArrayList arrayList = new ArrayList(list);
                        BaseViewManager.d(BaseViewManager.this);
                        BaseViewManager.f(BaseViewManager.this).post(new RunnableC0073a(iDMComponent, arrayList, g));
                        return;
                    }
                    BaseViewManager.e(BaseViewManager.this, iDMComponent, list, g);
                }
            }
        }
    }

    static {
        t2o.a(155189370);
    }

    public BaseViewManager(fdd fddVar, z7v z7vVar) {
        if (fddVar != null) {
            this.b = fddVar;
            Activity context = fddVar.getContext();
            this.f2303a = context;
            if (fddVar instanceof kz1) {
                this.c = new ViewEngine(context, fddVar.c(), ((kz1) fddVar).k(), z7vVar);
            } else {
                this.c = new ViewEngine(context, fddVar.c(), (twl.b) null, z7vVar);
            }
            N();
            u();
            return;
        }
        throw new IllegalArgumentException("param presenter can not be null");
    }

    public static /* synthetic */ jc4 a(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jc4) ipChange.ipc$dispatch("eb99c743", new Object[]{baseViewManager});
        }
        baseViewManager.getClass();
        return null;
    }

    public static /* synthetic */ int b(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d91bccf", new Object[]{baseViewManager})).intValue();
        }
        return baseViewManager.k;
    }

    public static /* synthetic */ boolean c(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95338a1", new Object[]{baseViewManager})).booleanValue();
        }
        return baseViewManager.l;
    }

    public static /* synthetic */ void d(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c514b45e", new Object[]{baseViewManager});
        } else {
            baseViewManager.v();
        }
    }

    public static /* synthetic */ void e(BaseViewManager baseViewManager, IDMComponent iDMComponent, List list, mcu mcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65712f8b", new Object[]{baseViewManager, iDMComponent, list, mcuVar});
        } else {
            baseViewManager.n(iDMComponent, list, mcuVar);
        }
    }

    public static /* synthetic */ Handler f(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("42a9b6e6", new Object[]{baseViewManager});
        }
        return baseViewManager.n;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd0336e", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            try {
                handlerThread.quitSafely();
            } catch (Exception unused) {
            }
        }
    }

    public void B(kcu kcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa3976", new Object[]{this, kcuVar});
        } else {
            C(kcuVar, null);
        }
    }

    public void C(kcu kcuVar, vcv vcvVar) {
        IDMComponent iDMComponent;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895e4005", new Object[]{this, kcuVar, vcvVar});
        } else if (kcuVar != null) {
            List<IDMComponent> d = kcuVar.d();
            if (d != null) {
                for (int i2 = 0; i2 < d.size(); i2++) {
                    iDMComponent = kcuVar.d().get(i2);
                    if ("".equals(iDMComponent.getTag())) {
                        break;
                    }
                }
            }
            iDMComponent = null;
            List<IDMComponent> a2 = kcuVar.a();
            if (a2 != null) {
                while (true) {
                    if (i >= a2.size()) {
                        break;
                    }
                    if ("".equals(kcuVar.a().get(i).getTag()) && iDMComponent != null) {
                        this.c.l1(i, iDMComponent);
                        break;
                    }
                    i++;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(kcuVar.d());
            arrayList.addAll(kcuVar.a());
            arrayList.addAll(kcuVar.c());
            if (kcuVar.f() != null) {
                arrayList.addAll(kcuVar.f());
            }
            if (kcuVar.e() != null) {
                arrayList.addAll(kcuVar.e());
            }
            et6 et6Var = new et6();
            et6Var.l(kcuVar.a());
            et6Var.q(kcuVar.d());
            et6Var.o(kcuVar.c());
            et6Var.s(kcuVar.f());
            et6Var.r(kcuVar.e());
            et6Var.m(kcuVar.b());
            this.c.i1(et6Var);
            et6Var.n(this.b.b().h());
            g(et6Var, vcvVar);
            this.c.A0(127, vcvVar);
            if (w0j.a(this.f2303a)) {
                ((kvc) this.f2303a).a(true);
            }
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            E(127);
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa697d61", new Object[]{this, new Integer(i)});
        } else {
            this.c.H0(i);
        }
    }

    public void F(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1f2d49", new Object[]{this, list});
            return;
        }
        ViewEngine viewEngine = this.c;
        if (viewEngine != null) {
            viewEngine.K0(list);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a182530a", new Object[]{this});
            return;
        }
        PopupWindowManager popupWindowManager = this.d;
        if (popupWindowManager == null || !popupWindowManager.j()) {
            co9 co9Var = this.e;
            if (co9Var == null || !co9Var.h()) {
                D();
            } else {
                this.e.l(this.b.b());
            }
        } else {
            this.d.n();
        }
    }

    public void H(mqk mqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82cdca43", new Object[]{this, mqkVar});
        } else {
            this.c.O0(mqkVar);
        }
    }

    public void I(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfe4c0a", new Object[]{this, str, z9eVar});
            return;
        }
        ViewEngine viewEngine = this.c;
        if (viewEngine != null) {
            viewEngine.R0(str, z9eVar);
            return;
        }
        throw new IllegalArgumentException("initView method did not invoked");
    }

    public void J(String str, qbe qbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a57b02", new Object[]{this, str, qbeVar});
        } else {
            this.c.V0(str, qbeVar);
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            this.c.Y0(i);
        }
    }

    public void L(RecyclerViewAdapter recyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ec9b3a", new Object[]{this, recyclerViewAdapter});
        } else {
            this.c.a1(recyclerViewAdapter);
        }
    }

    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
            return;
        }
        this.j = str;
        this.c.d1(str);
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81648e9", new Object[]{this});
        } else {
            this.c.r(kz1.DINAMIC_CONTEXT_KEY_PRESENTER, this.b);
        }
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ceca9a", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524e6c0", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46af6d3", new Object[]{this, new Integer(i)});
        } else {
            this.c.o1(i);
        }
    }

    public void R(Pair<IDMComponent, gsb> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa490d5", new Object[]{this, pair});
        } else {
            this.f = pair;
        }
    }

    public void S(List<IDMComponent> list, OpenPopupWindowEventModel openPopupWindowEventModel, PopupWindowManager.e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3db2b55", new Object[]{this, list, openPopupWindowEventModel, eVar, new Integer(i)});
        } else if (list != null && !list.isEmpty()) {
            if (this.e == null) {
                this.e = new co9(this.c);
            }
            if (!this.e.h()) {
                T(j(list), openPopupWindowEventModel, eVar, i);
            }
        }
    }

    public void T(et6 et6Var, OpenPopupWindowEventModel openPopupWindowEventModel, PopupWindowManager.e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09d736a", new Object[]{this, et6Var, openPopupWindowEventModel, eVar, new Integer(i)});
        }
    }

    public void U(List<IDMComponent> list, OpenPopupWindowEventModel openPopupWindowEventModel, PopupWindowManager.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea387f9", new Object[]{this, list, openPopupWindowEventModel, eVar});
        } else if (list != null && !list.isEmpty()) {
            V(j(list), openPopupWindowEventModel, eVar);
        }
    }

    public void V(et6 et6Var, OpenPopupWindowEventModel openPopupWindowEventModel, PopupWindowManager.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2787d44", new Object[]{this, et6Var, openPopupWindowEventModel, eVar});
        } else if (et6Var != null) {
            if (openPopupWindowEventModel == null) {
                openPopupWindowEventModel = new OpenPopupWindowEventModel();
            }
            PopupWindowManager popupWindowManager = new PopupWindowManager(this.c);
            this.d = popupWindowManager;
            popupWindowManager.o(et6Var);
            this.d.q(i(openPopupWindowEventModel));
            this.d.p(eVar);
        }
    }

    public void W(String str, av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d22537", new Object[]{this, str, avVar});
            return;
        }
        try {
            this.c.Q().b().D(str, avVar);
        } catch (DinamicException unused) {
        }
    }

    public void X(String str, sn7 sn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eafe02c", new Object[]{this, str, sn7Var});
            return;
        }
        try {
            this.c.Q().b().E(str, sn7Var);
        } catch (DinamicException unused) {
        }
    }

    public void Y(long j, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1651a5f2", new Object[]{this, new Long(j), evbVar});
        } else {
            this.c.Q().b().r(j, evbVar);
        }
    }

    public void Z(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9669256", new Object[]{this, new Long(j), qubVar});
        } else {
            this.c.Q().b().u(j, qubVar);
        }
    }

    public void g(et6 et6Var, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7bcda3", new Object[]{this, et6Var, vcvVar});
        }
    }

    public void h(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a51b650", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.g = linearLayout;
        this.i = recyclerView;
        this.h = linearLayout2;
        this.c.u(linearLayout, recyclerView, linearLayout2);
    }

    public final et6 j(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("493f5a87", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            String h = ParseModule.h(iDMComponent);
            if ("footer".equals(h)) {
                arrayList.add(iDMComponent);
            } else if ("header".equals(h)) {
                arrayList3.add(iDMComponent);
            } else {
                arrayList2.add(iDMComponent);
            }
        }
        et6 et6Var = new et6();
        et6Var.l(arrayList2);
        et6Var.q(arrayList3);
        et6Var.o(arrayList);
        return et6Var;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5beb5f09", new Object[]{this, new Boolean(z)});
            return;
        }
        PopupWindowManager popupWindowManager = this.d;
        if (popupWindowManager != null && popupWindowManager.j()) {
            this.d.g(z);
        }
        co9 co9Var = this.e;
        if (co9Var != null && co9Var.h()) {
            this.e.e(z);
        }
    }

    public final lcu l(mcu mcuVar, IDMComponent iDMComponent, gsb gsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("40560a6", new Object[]{this, mcuVar, iDMComponent, gsbVar, str});
        }
        lcu l = mcuVar.d().l(str);
        l.i(iDMComponent);
        l.q("exposureItem");
        l.k(gsbVar);
        return l;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c.y();
        }
    }

    public final void n(IDMComponent iDMComponent, List<gsb> list, mcu mcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120adeb3", new Object[]{this, iDMComponent, list, mcuVar});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                gsb gsbVar = list.get(i);
                if (gsbVar != null) {
                    String type = gsbVar.getType();
                    if (!TextUtils.isEmpty(type)) {
                        mcuVar.h(l(mcuVar, iDMComponent, gsbVar, type));
                    }
                }
            } catch (Exception e) {
                String str = this.j;
                if (str == null) {
                    str = "UltronTrade";
                }
                hav.b(str, "ExposureAsyncException", e.getMessage());
                return;
            }
        }
    }

    public ViewGroup o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6dea490c", new Object[]{this});
        }
        return this.i;
    }

    public ViewGroup p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("865485b3", new Object[]{this});
        }
        return this.h;
    }

    public ViewGroup q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a9160118", new Object[]{this});
        }
        return this.h;
    }

    public ViewGroup r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f3fb3f01", new Object[]{this});
        }
        return this.g;
    }

    public Pair<IDMComponent, gsb> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("cc2e75e3", new Object[]{this});
        }
        return this.f;
    }

    public ViewEngine t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewEngine) ipChange.ipc$dispatch("f202aec", new Object[]{this});
        }
        return this.c;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.c.f1(new a());
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262d2fe5", new Object[]{this});
        } else if (this.n == null) {
            HandlerThread handlerThread = new HandlerThread("BaseViewManager");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
    }

    public void w(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656015b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92e38102", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean y() {
        co9 co9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb7aace", new Object[]{this})).booleanValue();
        }
        PopupWindowManager popupWindowManager = this.d;
        if ((popupWindowManager == null || !popupWindowManager.j()) && ((co9Var = this.e) == null || !co9Var.h())) {
            return false;
        }
        return true;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.c.t0();
        }
    }

    public final PopupWindowManager.f i(OpenPopupWindowEventModel openPopupWindowEventModel) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowManager.f) ipChange.ipc$dispatch("6c2a5f70", new Object[]{this, openPopupWindowEventModel});
        }
        PopupWindowManager.f fVar = new PopupWindowManager.f();
        fVar.j(-1);
        OpenPopupWindowEventModel.Css css = openPopupWindowEventModel.getCss();
        if (css != null) {
            try {
                fVar.l(Float.parseFloat(css.getHeight()));
            } catch (Exception unused) {
            }
        } else {
            fVar.l(0.6f);
        }
        OpenPopupWindowEventModel.Options options = openPopupWindowEventModel.getOptions();
        if (options == null) {
            fVar.h(this.f2303a.getResources().getDrawable(R.drawable.popup_close_btn));
        } else if ("true".equals(options.getNeedCloseButton())) {
            fVar.h(this.f2303a.getResources().getDrawable(R.drawable.popup_close_btn));
        }
        fVar.i(80);
        bpt f = this.b.f();
        List<String> c = f.c("popupWindowTopRadius");
        int a2 = (c == null || c.size() <= 0) ? 0 : hqu.a(c.get(0));
        List<String> c2 = f.c("popupWindowBottomRadius");
        if (c2 != null && c2.size() > 0) {
            i = hqu.a(c2.get(0));
        }
        fVar.k(u0q.a(this.f2303a, a2), u0q.a(this.f2303a, i));
        return fVar;
    }
}
