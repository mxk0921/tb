package com.taobao.android.detail.ttdetail.skeleton;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.skeleton.recommend.NewTTDetailRecommendComponent;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.b1i;
import tb.dtc;
import tb.hrj;
import tb.jns;
import tb.jos;
import tb.lcd;
import tb.lns;
import tb.lyo;
import tb.nj7;
import tb.ntc;
import tb.oa4;
import tb.pch;
import tb.q84;
import tb.qql;
import tb.rql;
import tb.rr2;
import tb.t2o;
import tb.tgh;
import tb.yns;
import tb.z4k;
import tb.ze7;
import tb.zns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailScrollerLayoutComponent extends qql<rql> implements ntc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TTDetailScrollerLayout b;
    public final Context c;
    public final ze7 d;
    public b1i f;
    public jos g;
    public int h;
    public int i;
    public d j;
    public boolean k;
    public List<String> l;
    public zns m;
    public final ArrayList<TTDetailScrollerLayout.c> y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements lcd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6878a;
        public final /* synthetic */ int b;

        public b(int i, int i2) {
            this.f6878a = i;
            this.b = i2;
        }

        @Override // tb.lcd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
                return;
            }
            for (int i = this.f6878a - 1; i >= (this.f6878a - 1) - this.b; i--) {
                hrj h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(TTDetailScrollerLayoutComponent.G(TTDetailScrollerLayoutComponent.this).getChildAt(i));
                if (h instanceof NewTTDetailRecommendComponent) {
                    h.a();
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TTDetailScrollerLayoutComponent.B(TTDetailScrollerLayoutComponent.this, false);
            TTDetailScrollerLayoutComponent.y(TTDetailScrollerLayoutComponent.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
    }

    static {
        t2o.a(912262228);
        t2o.a(912261362);
    }

    public TTDetailScrollerLayoutComponent(Context context, ze7 ze7Var, rql rqlVar, DataEntry... dataEntryArr) {
        super(context, ze7Var, rqlVar, dataEntryArr);
        this.y = new ArrayList<>();
        this.i = -1;
        this.k = false;
    }

    public static /* synthetic */ boolean A(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb86d6ea", new Object[]{tTDetailScrollerLayoutComponent, new Boolean(z)})).booleanValue();
        }
        tTDetailScrollerLayoutComponent.k = z;
        return z;
    }

    public static /* synthetic */ void B(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347b90e5", new Object[]{tTDetailScrollerLayoutComponent, new Boolean(z)});
        } else {
            tTDetailScrollerLayoutComponent.Q(z);
        }
    }

    public static /* synthetic */ zns D(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zns) ipChange.ipc$dispatch("80879e0", new Object[]{tTDetailScrollerLayoutComponent});
        }
        return tTDetailScrollerLayoutComponent.m;
    }

    public static /* synthetic */ Context E(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a7e811e4", new Object[]{tTDetailScrollerLayoutComponent});
        }
        return tTDetailScrollerLayoutComponent.c;
    }

    public static /* synthetic */ ze7 F(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("d65f8090", new Object[]{tTDetailScrollerLayoutComponent});
        }
        return tTDetailScrollerLayoutComponent.d;
    }

    public static /* synthetic */ TTDetailScrollerLayout G(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout) ipChange.ipc$dispatch("ec72d152", new Object[]{tTDetailScrollerLayoutComponent});
        }
        return tTDetailScrollerLayoutComponent.b;
    }

    public static /* synthetic */ ArrayList a(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("463dfb08", new Object[]{tTDetailScrollerLayoutComponent});
        }
        return tTDetailScrollerLayoutComponent.y;
    }

    public static /* synthetic */ Object ipc$super(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/TTDetailScrollerLayoutComponent");
    }

    public static /* synthetic */ void y(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99df11", new Object[]{tTDetailScrollerLayoutComponent});
        } else {
            tTDetailScrollerLayoutComponent.M();
        }
    }

    public static /* synthetic */ boolean z(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56993d74", new Object[]{tTDetailScrollerLayoutComponent})).booleanValue();
        }
        return tTDetailScrollerLayoutComponent.k;
    }

    public void H(jns jnsVar) {
        int i;
        int i2 = -1;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fc4470", new Object[]{this, jnsVar});
            return;
        }
        boolean i0 = DataUtils.i0((Feature) this.d.e().f(Feature.class));
        int childCount = this.b.getChildCount();
        oa4 oa4Var = null;
        if (childCount > 0) {
            View view = null;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.b.getChildAt(i3);
                hrj h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(childAt);
                if (h != null) {
                    if (!(h instanceof b1i)) {
                        x(h);
                        h.destroy();
                    } else if (i0) {
                        view = childAt;
                    } else {
                        x(h);
                    }
                }
            }
            int indexOfChild = this.b.indexOfChild(view);
            if (indexOfChild != -1) {
                for (int childCount2 = this.b.getChildCount() - 1; childCount2 >= 0; childCount2--) {
                    if (childCount2 != indexOfChild) {
                        this.b.removeViewAt(childCount2);
                    }
                }
                z = true;
            } else {
                this.b.removeAllViews();
            }
        }
        yns s = jnsVar.s();
        if (s != null) {
            z4k r = jnsVar.s().r();
            if (r != null) {
                oa4Var = r.f(this.d.d());
            }
            jos josVar = (jos) oa4Var;
            this.g = josVar;
            if (josVar != null) {
                this.l = I(josVar.E());
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) s.s();
            if (z) {
                i = b(linkedHashMap);
            } else {
                i = -1;
            }
            if (i == -1) {
                this.b.removeAllViews();
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int i4 = i2 + 1;
                hrj c2 = c((String) entry.getKey(), (z4k) entry.getValue());
                if (c2 != null) {
                    if (i4 != i) {
                        if (i4 < i) {
                            a(c2, i4);
                            this.b.addNestedComponent(c2, i4);
                        } else {
                            u(c2);
                            this.b.addNestedComponent(c2);
                        }
                    }
                    List<String> list = this.l;
                    if (list != null && !list.isEmpty() && !TextUtils.isEmpty(c2.v())) {
                        this.l.remove(c2.v());
                    }
                    i2 = i4;
                }
            }
            this.b.post(new c());
            N(s);
        }
    }

    public final ArrayList<String> I(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("918fc1f0", new Object[]{this, list});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final String J(int i) {
        hrj h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d94a2cb", new Object[]{this, new Integer(i)});
        }
        for (int i2 = i - 1; i2 > -1; i2--) {
            View childAt = this.b.getChildAt(i2);
            if (!(childAt == null || (h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(childAt)) == null)) {
                String v = h.v();
                if (!TextUtils.isEmpty(v)) {
                    return v;
                }
            }
        }
        return "";
    }

    public final b1i K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b1i) ipChange.ipc$dispatch("33a5ee20", new Object[]{this});
        }
        if (this.f == null) {
            this.f = (b1i) this.d.h().d("mainScreen");
        }
        return this.f;
    }

    public final int L() {
        jos josVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4267e5a7", new Object[]{this})).intValue();
        }
        if (this.h == 0 && (josVar = this.g) != null) {
            this.h = josVar.A();
        }
        if (nj7.i(this.c)) {
            this.h = 1;
        }
        return this.h;
    }

    public final void N(yns ynsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacfdc56", new Object[]{this, ynsVar});
        } else if (!rr2.a(this.d)) {
        } else {
            if (this.m != null) {
                tgh.b("TTDetailScrollerController", "detailScrollerPreRequestHandler 存在");
                this.m.b();
                return;
            }
            this.m = new zns(this.d, ynsVar);
            tgh.b("TTDetailScrollerController", "initDetailScrollerPreRequest success");
        }
    }

    public final boolean O(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e90eda", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect) || rect.width() <= 0 || rect.height() <= 0) {
            return false;
        }
        return true;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5890cac9", new Object[]{this})).booleanValue();
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.b;
        if (tTDetailScrollerLayout == null) {
            return true;
        }
        return tTDetailScrollerLayout.isScrollTop();
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.b;
        if (tTDetailScrollerLayout != null) {
            int size = tTDetailScrollerLayout.getNonGoneChildren().size();
            for (int i = 0; i < size; i++) {
                hrj h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(this.b.getChildAt(i));
                if (h != null) {
                    h.f20842a = false;
                    h.t(false, false);
                    if (!(h instanceof b1i)) {
                        UserBehaviorTracker.j(this.c, RuntimeUtils.c(h), 2);
                    }
                }
            }
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.b != null) {
            Q(false);
        }
    }

    public final void T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
            return;
        }
        q84.i(context, DescNativeController.c.class, this);
        q84.i(context, pch.class, this);
    }

    public void U(TTDetailScrollerLayout.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1e4d5c", new Object[]{this, cVar});
        } else {
            this.y.add(cVar);
        }
    }

    public void V(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c505b695", new Object[]{this, dVar});
        } else {
            this.j = dVar;
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cea4712", new Object[]{this});
            return;
        }
        q84.l(this.c, DescNativeController.c.class);
        q84.l(this.c, pch.class);
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final int b(Map<String, z4k> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50926160", new Object[]{this, map})).intValue();
        }
        int i = -1;
        for (Map.Entry<String, z4k> entry : map.entrySet()) {
            int i2 = i + 1;
            hrj c2 = c(entry.getKey(), entry.getValue());
            if (c2 != null) {
                if (c2 instanceof b1i) {
                    return i2;
                }
                i = i2;
            }
        }
        return -1;
    }

    public final hrj c(String str, z4k z4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrj) ipChange.ipc$dispatch("74030fd4", new Object[]{this, str, z4kVar});
        }
        if ("mainScreen".equals(str)) {
            return (hrj) this.d.h().d("mainScreen");
        }
        return (hrj) z4kVar.f(this.d.d());
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.b;
        if (tTDetailScrollerLayout != null) {
            tTDetailScrollerLayout.getNonGoneChildren();
            this.b.scrollToChild(this.b.getChildAt(i));
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        W();
        zns znsVar = this.m;
        if (znsVar != null) {
            znsVar.b();
        }
        ArrayList<TTDetailScrollerLayout.c> arrayList = this.y;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.b;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements TTDetailScrollerLayout.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.c
        public void m(View view, int i, int i2, int i3) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f709b34", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            lyo.a("TTDetailScrollerController", "scrollY:" + i + "oldScrollY:" + i2);
            TTDetailScrollerLayoutComponent.y(TTDetailScrollerLayoutComponent.this);
            if (i != i2) {
                TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent = TTDetailScrollerLayoutComponent.this;
                if (i - i2 <= 0) {
                    z = false;
                }
                TTDetailScrollerLayoutComponent.A(tTDetailScrollerLayoutComponent, z);
            }
            TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent2 = TTDetailScrollerLayoutComponent.this;
            TTDetailScrollerLayoutComponent.B(tTDetailScrollerLayoutComponent2, TTDetailScrollerLayoutComponent.z(tTDetailScrollerLayoutComponent2));
            Iterator it = TTDetailScrollerLayoutComponent.a(TTDetailScrollerLayoutComponent.this).iterator();
            while (it.hasNext()) {
                ((TTDetailScrollerLayout.c) it.next()).m(view, i, i2, i3);
            }
            if (TTDetailScrollerLayoutComponent.D(TTDetailScrollerLayoutComponent.this) != null) {
                TTDetailScrollerLayoutComponent.D(TTDetailScrollerLayoutComponent.this).e(i, i2, i3);
            }
        }
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if (dtcVar instanceof DescNativeController.c) {
            String a2 = ((DescNativeController.c) dtcVar).a();
            if ("adjust".equals(a2) || "expand".equals(a2)) {
                this.b.checkTargetsScroll(true, true);
            } else if ("native".equals(a2) || "web".equals(a2)) {
                this.b.fixTargetsScroll(true);
            } else {
                this.b.checkTargetsScroll(false, true);
            }
            return true;
        }
        if (dtcVar instanceof pch) {
            String str = ((pch) dtcVar).b;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.b.stopScroll();
            int size = this.b.getNonGoneChildren().size();
            int i = 0;
            while (true) {
                if (i < size) {
                    View childAt = this.b.getChildAt(i);
                    hrj h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(childAt);
                    if (h != null) {
                        String v = h.v();
                        if (!TextUtils.isEmpty(v) && childAt.getVisibility() != 8) {
                            int L = i == 0 ? 0 : L();
                            if (str.equals(v)) {
                                this.b.scrollToChildWithOffset(childAt, L);
                                break;
                            }
                        }
                    }
                    i++;
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        View childAt2 = this.b.getChildAt(i2);
                        hrj h2 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(childAt2);
                        if (!(h2 == null || childAt2.getVisibility() == 8 || !h2.w(this.b, str, L()))) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a14be6", new Object[]{this});
        } else if (this.b != null) {
            int L = L();
            int scrollY = this.b.getScrollY() + this.b.getPaddingTop() + L;
            int childCount = this.b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt != null && childAt.getTop() <= scrollY && childAt.getBottom() > scrollY) {
                    if (this.g != null) {
                        hrj h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(childAt);
                        if (h == null) {
                            continue;
                        } else {
                            String v = h.v();
                            if (TextUtils.isEmpty(v)) {
                                v = J(i);
                            }
                            if ("header".equals(v)) {
                                for (int size = this.l.size() - 1; size >= 0; size--) {
                                    String str = this.l.get(size);
                                    int A = K().A(str);
                                    int scrollY2 = this.b.getScrollY();
                                    lyo.a("TTDetailScrollerController", "rateTopOffset:" + A + "mainScreenOffset:" + scrollY2 + "height:" + L + "scrollY:" + scrollY2);
                                    if (scrollY2 == 0 && (A == -1 || A - L > 0)) {
                                        this.g.G("header");
                                        return;
                                    } else if ((scrollY2 - A) + L > 0) {
                                        this.g.G(str);
                                        return;
                                    }
                                }
                                this.g.G("header");
                                return;
                            }
                            this.g.G(v);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24f868a", new Object[]{this, new Boolean(z)});
            return;
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.b;
        if (tTDetailScrollerLayout != null) {
            int size = tTDetailScrollerLayout.getNonGoneChildren().size();
            int scrollY = this.b.getScrollY();
            for (int i = 0; i < size; i++) {
                View childAt = this.b.getChildAt(i);
                boolean O = O(childAt);
                hrj h = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.h(childAt);
                if (h != null) {
                    if (h.f20842a != O) {
                        if (O) {
                            h.didAppear();
                        } else {
                            h.t(true, z);
                        }
                        if (!(h instanceof b1i)) {
                            UserBehaviorTracker.j(this.c, RuntimeUtils.c(h), O ? 1 : 2);
                        }
                        h.f20842a = O;
                    }
                    if (h instanceof lns) {
                        lns lnsVar = (lns) h;
                        lnsVar.U(childAt.getTop() - this.b.getScrollY());
                        lnsVar.V(new b(size, i));
                    }
                    lyo.a("TTDetailScrollerController", "第" + i + "个View visible:" + O);
                    if (this.i != i && scrollY >= childAt.getTop() && scrollY < childAt.getBottom()) {
                        d dVar = this.j;
                        if (dVar != null) {
                            ((TTDetailPageManager.d0) dVar).a(this.i, i);
                        }
                        this.i = i;
                    }
                }
            }
        }
    }

    public TTDetailScrollerLayoutComponent(View view, Context context, ze7 ze7Var, rql rqlVar, DataEntry... dataEntryArr) {
        this(context, ze7Var, rqlVar, dataEntryArr);
        this.c = context;
        this.d = ze7Var;
        TTDetailScrollerLayout tTDetailScrollerLayout = (TTDetailScrollerLayout) view.findViewById(R.id.tt_scrollerLayout);
        this.b = tTDetailScrollerLayout;
        tTDetailScrollerLayout.setOnVerticalScrollChangeListener(new a());
        tTDetailScrollerLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final int f6876a;
            public float b = 0.0f;
            public long c = 0;

            {
                this.f6876a = ViewConfiguration.get(TTDetailScrollerLayoutComponent.E(TTDetailScrollerLayoutComponent.this)).getScaledPagingTouchSlop();
            }

            public static /* synthetic */ long a(AnonymousClass2 r4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("70258931", new Object[]{r4})).longValue();
                }
                return r4.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
                if (r9 != 3) goto L_0x0095;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
                /*
                    r8 = this;
                    r0 = 2
                    r1 = 1
                    r2 = 0
                    r3 = 3
                    com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.AnonymousClass2.$ipChange
                    boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r5 == 0) goto L_0x001f
                    java.lang.String r5 = "d4aa3aa4"
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r3[r2] = r8
                    r3[r1] = r9
                    r3[r0] = r10
                    java.lang.Object r9 = r4.ipc$dispatch(r5, r3)
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    return r9
                L_0x001f:
                    int r9 = r10.getAction()
                    r4 = 0
                    if (r9 == 0) goto L_0x0083
                    if (r9 == r1) goto L_0x002e
                    if (r9 == r0) goto L_0x0083
                    if (r9 == r3) goto L_0x002e
                    goto L_0x0095
                L_0x002e:
                    float r9 = r10.getY()
                    float r10 = r8.b
                    float r9 = r9 - r10
                    float r10 = java.lang.Math.abs(r9)
                    int r0 = r8.f6876a
                    float r0 = (float) r0
                    r1 = 0
                    int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                    if (r10 <= 0) goto L_0x007e
                    long r6 = r8.c
                    int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                    if (r10 <= 0) goto L_0x007e
                    com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent$2$1 r10 = new com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent$2$1
                    r10.<init>()
                    com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent r0 = com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.this
                    android.content.Context r0 = com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.E(r0)
                    int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                    if (r9 >= 0) goto L_0x0059
                    java.lang.String r3 = "downSlide"
                    goto L_0x005c
                L_0x0059:
                    java.lang.String r3 = "upSlide"
                L_0x005c:
                    java.lang.String r6 = "PageSlide"
                    com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.l(r0, r6, r3, r10)
                    com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent r0 = com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.this
                    tb.ze7 r0 = com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.F(r0)
                    tb.bq6 r0 = r0.e()
                    com.alibaba.fastjson.JSONObject r0 = com.taobao.android.detail.ttdetail.utils.UtUtils.c(r0)
                    r0.putAll(r10)
                    if (r9 >= 0) goto L_0x0077
                    java.lang.String r9 = "Page_Detail_Button-downSlide"
                    goto L_0x0079
                L_0x0077:
                    java.lang.String r9 = "Page_Detail_Button-upSlide"
                L_0x0079:
                    r10 = 2101(0x835, float:2.944E-42)
                    com.taobao.android.detail.ttdetail.utils.UtUtils.f(r10, r9, r0)
                L_0x007e:
                    r8.b = r1
                    r8.c = r4
                    goto L_0x0095
                L_0x0083:
                    long r0 = r8.c
                    int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r9 != 0) goto L_0x0095
                    float r9 = r10.getY()
                    r8.b = r9
                    long r9 = java.lang.System.currentTimeMillis()
                    r8.c = r9
                L_0x0095:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        T(context);
    }
}
