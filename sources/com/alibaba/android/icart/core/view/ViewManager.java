package com.alibaba.android.icart.core.view;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.data.model.CartOpenPopupWindowEventModel;
import com.alibaba.android.ultron.trade.presenter.BaseViewManager;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.bd3;
import tb.c9x;
import tb.cfx;
import tb.du2;
import tb.et6;
import tb.fav;
import tb.fdv;
import tb.fsb;
import tb.ga3;
import tb.h1z;
import tb.hav;
import tb.ic3;
import tb.imb;
import tb.ir6;
import tb.jg2;
import tb.kcu;
import tb.kmb;
import tb.kvc;
import tb.mc3;
import tb.n7v;
import tb.na3;
import tb.neb;
import tb.obj;
import tb.pb6;
import tb.rfw;
import tb.t2o;
import tb.u55;
import tb.ub3;
import tb.ucv;
import tb.vav;
import tb.vc3;
import tb.vcv;
import tb.w0j;
import tb.ykl;
import tb.z7v;
import tb.zwc;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewManager extends BaseViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup o;
    public imb p;
    public final zxb q;
    public final Set<neb> r = new HashSet();
    public jg2 s;
    public final kmb t;
    @Deprecated
    public final rfw u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ucv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ViewManager viewManager) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/view/ViewManager$1");
        }

        @Override // tb.ucv
        public void a(et6 et6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9ac794", new Object[]{this, et6Var});
            } else {
                ic3.e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements rfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rfw
        public void onError(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                return;
            }
            String c = ((vc3) ViewManager.b0(ViewManager.this)).c();
            UnifyLog.m(c, "ViewManager", "view render error", "downgraded. componentName " + str + " ,code:" + str2 + " ,msg:" + str3);
            HashMap hashMap = new HashMap();
            hashMap.put("componentName", str);
            hashMap.put("errorCode", str2);
            hashMap.put("errorMsg", str3);
            fdv.a(fdv.F_PAGE_RENDER_TAG, "", "", "cart", "render", hashMap, "renderError", "组件渲染异常，不降级到h5了，期望是用兜底组件上屏");
        }
    }

    static {
        t2o.a(479199599);
    }

    public ViewManager(kmb kmbVar, z7v z7vVar) {
        super(kmbVar, z7vVar);
        b bVar = new b();
        this.t = kmbVar;
        O(vav.a(c9x.CART_BIZ_NAME, "exposureAsync", true));
        this.c.E(vav.a(c9x.CART_BIZ_NAME, "enableHandleComponentVisibilityOnScroll", false));
        this.c.U0(bVar);
        this.c.b1(new a(this));
        P(1);
        this.q = kmbVar.d();
    }

    public static /* synthetic */ Set a0(ViewManager viewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2447ea32", new Object[]{viewManager});
        }
        return viewManager.r;
    }

    public static /* synthetic */ kmb b0(ViewManager viewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("2280682b", new Object[]{viewManager});
        }
        return viewManager.t;
    }

    public static /* synthetic */ Object ipc$super(ViewManager viewManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -93749919) {
            super.E(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 128596342) {
            super.B((kcu) objArr[0]);
            return null;
        } else if (hashCode == 1333513635) {
            super.g((et6) objArr[0], (vcv) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/view/ViewManager");
        }
    }

    public void A0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a7e555", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (ykl.a()) {
            this.c.h1(DXWidgetNode.DXMeasureSpec.c(i2, 1073741824));
            super.E(i);
            if (y()) {
                w0();
            }
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void B(kcu kcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa3976", new Object[]{this, kcuVar});
            return;
        }
        if (y()) {
            x0(this.q.z());
        }
        super.B(kcuVar);
    }

    public void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2dc4d77", new Object[]{this});
            return;
        }
        imb imbVar = this.p;
        if (imbVar != null) {
            imbVar.c(127);
        }
    }

    public final void C0(List<IDMComponent> list) {
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29931d3", new Object[]{this, list});
        } else if (this.q.w().getControlParas().isShot2024ItemV2Gray) {
            Iterator<IDMComponent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iDMComponent = null;
                    break;
                }
                iDMComponent = it.next();
                if (iDMComponent instanceof BundleLineComponent) {
                    break;
                }
            }
            if (iDMComponent != null) {
                list.remove(iDMComponent);
            }
        }
    }

    public void D0(imb imbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4253d8", new Object[]{this, imbVar});
        } else {
            this.p = imbVar;
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa697d61", new Object[]{this, new Integer(i)});
            return;
        }
        super.E(i);
        if (y() && s0()) {
            B0();
        }
    }

    public void E0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
        } else {
            this.o = viewGroup;
        }
    }

    public void F0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9943663", new Object[]{this, new Boolean(z)});
            return;
        }
        imb imbVar = this.p;
        if (imbVar != null) {
            if (z) {
                imbVar.d();
            }
            TUrlImageView e = this.p.e();
            if (e != null) {
                if (z) {
                    g0(this.p.getComponents());
                    e.setVisibility(0);
                    return;
                }
                e.setVisibility(8);
            }
        }
    }

    public void c0(neb nebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd602bd", new Object[]{this, nebVar});
        } else {
            ((HashSet) this.r).add(nebVar);
        }
    }

    public int d0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda1bc1", new Object[]{this, new Float(f)})).intValue();
        }
        DinamicXEngine j0 = j0();
        Activity activity = this.f2303a;
        return pb6.p(j0, activity, f + "ap", 0);
    }

    public final et6 f0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("493f5a87", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
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
        }
        et6 et6Var = new et6();
        et6Var.l(arrayList2);
        et6Var.q(arrayList3);
        et6Var.o(arrayList);
        return et6Var;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void g(et6 et6Var, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7bcda3", new Object[]{this, et6Var, vcvVar});
            return;
        }
        super.g(et6Var, vcvVar);
        C0(et6Var.c());
    }

    public void g0(List<IDMComponent> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656c3b87", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            Iterator<IDMComponent> it = list.iterator();
            while (it.hasNext()) {
                IDMComponent next = it.next();
                if (next != null) {
                    String position = next.getPosition();
                    if (!"footer".equals(position) && !"header".equals(position)) {
                        it.remove();
                        z = true;
                    }
                }
            }
            if (!z) {
                return;
            }
            if (y()) {
                w0();
            } else {
                E(127);
            }
        }
    }

    public imb h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imb) ipChange.ipc$dispatch("5e5fe8c6", new Object[]{this});
        }
        imb imbVar = this.p;
        if (imbVar != null && !imbVar.hasInit()) {
            this.p.init();
        }
        return this.p;
    }

    public final Pair<Integer, List<IDMComponent>> i0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9caf4a88", new Object[]{this, list});
        }
        zwc a2 = obj.a(this.t, this.q.z());
        if (a2 != null) {
            return a2.a(list);
        }
        return null;
    }

    public DinamicXEngine j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        return this.c.Q().b().k();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5beb5f09", new Object[]{this, new Boolean(z)});
            return;
        }
        this.q.V("");
        imb imbVar = this.p;
        if (imbVar != null && imbVar.isShowing()) {
            this.p.f(true);
        }
        p0(true);
    }

    public List<IDMComponent> k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3d3038b4", new Object[]{this});
        }
        imb imbVar = this.p;
        if (imbVar != null) {
            return imbVar.getComponents();
        }
        return null;
    }

    public et6 l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("fce74c10", new Object[]{this});
        }
        imb imbVar = this.p;
        if (imbVar != null) {
            return imbVar.getDataSource();
        }
        return null;
    }

    public int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62ea9f4c", new Object[]{this})).intValue();
        }
        jg2 jg2Var = this.s;
        if (jg2Var == null) {
            return 0;
        }
        return jg2Var.c();
    }

    public int n0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa69bebd", new Object[]{this, new Integer(i)})).intValue();
        }
        jg2 jg2Var = this.s;
        if (jg2Var == null) {
            return 0;
        }
        return jg2Var.d(i);
    }

    public ViewGroup o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.o;
    }

    public final void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215d96c9", new Object[]{this, new Boolean(z)});
            return;
        }
        kmb kmbVar = this.t;
        if (kmbVar != null && kmbVar.T() != null) {
            mc3.k(this.c.K(), this.t.T().getInstanceId(), z);
        }
    }

    public boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5ab50", new Object[]{this})).booleanValue();
        }
        imb imbVar = this.p;
        if (imbVar == null || !imbVar.isFullScreen()) {
            return false;
        }
        return true;
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c44df501", new Object[]{this})).booleanValue();
        }
        jg2 jg2Var = this.s;
        if (jg2Var == null || !jg2Var.e()) {
            return false;
        }
        return true;
    }

    public final boolean s0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e2963", new Object[]{this})).booleanValue();
        }
        if (this.q.z() == null) {
            str = "";
        } else {
            str = this.q.z();
        }
        if (this.q.L() || str.contains("cartCalculateGlobal") || this.q.B().x()) {
            return true;
        }
        return false;
    }

    public int t0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da5f8eb3", new Object[]{this, new Float(f)})).intValue();
        }
        return pb6.A(j0(), this.f2303a, f);
    }

    public void u0(et6 et6Var, int i, bd3 bd3Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c8d062", new Object[]{this, et6Var, new Integer(i), bd3Var});
            return;
        }
        if (y()) {
            x0(this.q.z());
        }
        if (et6Var != null) {
            fsb b2 = this.t.b();
            if (b2 instanceof u55) {
                et6Var.m((u55) b2);
            } else if (n7v.a()) {
                throw new IllegalStateException("Presenter.getDataContext返回值必须是DMContext类型");
            }
            this.c.i1(et6Var);
            et6Var.n(b2.h());
            boolean b3 = fav.b(this.q.c(), true);
            this.t.N().c(b3);
            g(et6Var, bd3Var);
            ViewEngine viewEngine = this.c;
            if (b3) {
                i = 4;
            }
            viewEngine.A0(i, bd3Var);
            if (bd3Var == null) {
                str = null;
            } else {
                str = bd3Var.k();
            }
            if (str != null) {
                boolean w = this.t.W().w();
                if (b3) {
                    ic3.b(this.f2303a, str, w);
                } else {
                    ic3.a(this.f2303a, str, w);
                }
            } else {
                hav.b(c9x.CART_BIZ_NAME, "cannotFinishPerformance", "api is null");
            }
            if (w0j.a(this.f2303a)) {
                ((kvc) this.f2303a).a(true);
            }
        }
    }

    public void v0(kcu kcuVar, int i, bd3 bd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a5217a", new Object[]{this, kcuVar, new Integer(i), bd3Var});
            return;
        }
        et6 et6Var = new et6();
        if (kcuVar != null) {
            et6Var.l(kcuVar.a());
            et6Var.q(kcuVar.d());
            et6Var.o(kcuVar.c());
        }
        u0(et6Var, i, bd3Var);
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public void w(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656015b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        jg2 jg2Var = new jg2(recyclerView);
        this.s = jg2Var;
        c0(jg2Var.b());
        h(linearLayout, recyclerView, linearLayout2);
        L(new RecyclerViewAdapter(this.c) { // from class: com.alibaba.android.icart.core.view.ViewManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -351831764) {
                    super.onBindViewHolder((RecyclerViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/view/ViewManager$2");
            }

            @Override // com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter
            /* renamed from: N */
            public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eb07792c", new Object[]{this, recyclerViewHolder, new Integer(i)});
                    return;
                }
                super.onBindViewHolder(recyclerViewHolder, i);
                for (neb nebVar : ViewManager.a0(ViewManager.this)) {
                    nebVar.a(this.b, recyclerViewHolder, i);
                }
            }
        });
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f48ab7", new Object[]{this});
        } else if (this.p != null) {
            y0(new ArrayList(this.p.getComponents()));
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92e38102", new Object[]{this})).booleanValue();
        }
        if (this.q.x().R() != null) {
            return true;
        }
        return false;
    }

    public final void x0(String str) {
        List<IDMComponent> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3714c1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && s0() && (e = this.q.c().e(str)) != null) {
            for (IDMComponent iDMComponent : e) {
                iDMComponent.getFields().remove("cornerType");
            }
            ((u55) this.t.b()).v().m(e);
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent2 : e) {
                ir6.a(iDMComponent2, arrayList);
            }
            this.q.Y(str);
            y0(arrayList);
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.BaseViewManager
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb7aace", new Object[]{this})).booleanValue();
        }
        imb imbVar = this.p;
        if (imbVar == null || !imbVar.isShowing()) {
            return false;
        }
        return true;
    }

    public void y0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81fcc9a8", new Object[]{this, list});
            return;
        }
        imb imbVar = this.p;
        if (imbVar != null && imbVar.isShowing()) {
            Pair<Integer, List<IDMComponent>> i0 = i0(list);
            if (i0 != null) {
                list.addAll(((Integer) i0.first).intValue(), (Collection) i0.second);
            }
            this.p.b(list);
            this.p.l(f0(list));
            du2.a(this.q.c(), this.q.z(), list);
            this.p.c(127);
        }
    }

    public void z0(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d111cf0b", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null) {
            String position = iDMComponent.getPosition();
            if ("header".equals(position)) {
                this.c.H0(1);
            } else if ("footer".equals(position)) {
                this.c.H0(4);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iDMComponent);
                this.c.K0(arrayList);
            }
        }
    }

    public void G0(View view, String str, List<IDMComponent> list, CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel, h1z h1zVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a7e9f3", new Object[]{this, view, str, list, cartOpenPopupWindowEventModel, h1zVar});
            return;
        }
        p0(false);
        imb imbVar = this.p;
        if (imbVar != null) {
            if (imbVar.isShowing()) {
                this.p.f(false);
            }
            this.q.U(str);
            Pair<Integer, List<IDMComponent>> i0 = i0(list);
            if (i0 != null) {
                list.addAll(((Integer) i0.first).intValue(), (Collection) i0.second);
            }
            et6 f0 = f0(list);
            if (cartOpenPopupWindowEventModel == null) {
                cartOpenPopupWindowEventModel = new CartOpenPopupWindowEventModel();
            }
            this.p.b(list);
            this.p.l(f0);
            ga3 N = this.t.N();
            boolean b2 = N.b();
            if (b2) {
                N.a();
            }
            cfx e0 = e0(cartOpenPopupWindowEventModel);
            e0.o(view);
            e0.v(h1zVar.b());
            this.p.k(e0);
            du2.a(this.q.c(), str, list);
            this.p.j(h1zVar.a());
            if (b2) {
                str2 = "先隐藏优惠明细";
            } else {
                str2 = "不隐藏优惠明细";
            }
            ub3.d("hideFloatDetailFirst", str2, b2, 0.005f);
        }
    }

    public final cfx e0(CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfx) ipChange.ipc$dispatch("2fba6aec", new Object[]{this, cartOpenPopupWindowEventModel});
        }
        cfx cfxVar = new cfx();
        cfxVar.i = vav.a(c9x.CART_BIZ_NAME, na3.sShowWithStdPop, true);
        cfxVar.r(-1);
        CartOpenPopupWindowEventModel.Css css = cartOpenPopupWindowEventModel.getCss();
        if (css != null) {
            try {
                cfxVar.t(Float.parseFloat(css.getHeight()));
                cfxVar.s(Color.parseColor(css.getWindowColor()));
                cfxVar.p(css.getThemeUrl());
            } catch (Exception unused) {
            }
        } else {
            cfxVar.t(0.6f);
        }
        CartOpenPopupWindowEventModel.Options options = cartOpenPopupWindowEventModel.getOptions();
        if (options == null) {
            cfxVar.k(this.f2303a.getResources().getDrawable(R.drawable.popup_close_btn));
        } else if ("true".equals(options.getNeedCloseButton())) {
            cfxVar.k(this.f2303a.getResources().getDrawable(R.drawable.popup_close_btn));
        }
        cfxVar.n(80);
        if (css == null || !"0".equals(css.getRadius())) {
            cfxVar.q(pb6.f(this.f2303a, 12.0f));
        } else {
            cfxVar.q(0.0f);
        }
        cfxVar.l(cartOpenPopupWindowEventModel.isFilterPopLayer());
        return cfxVar;
    }
}
