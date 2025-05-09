package com.etao.feimagesearch.capture.dynamic.bottom.history;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.a63;
import tb.ckf;
import tb.cxc;
import tb.d1a;
import tb.d32;
import tb.kl7;
import tb.lg4;
import tb.mz1;
import tb.p1p;
import tb.r7m;
import tb.rcc;
import tb.t2o;
import tb.v53;
import tb.vpt;
import tb.xhv;
import tb.yr3;
import tb.z53;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureHistoryView extends d32<v53, yr3, CaptureManager> implements CaptureBottomAreaView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float y = p1p.b(47.0f);
    public final d1a<xhv> l;
    public boolean m;
    public int n;
    public final List<cxc> o = new ArrayList();
    public View p;
    public TUrlImageView q;
    public RecyclerView r;
    public View s;
    public View t;
    public View u;
    public final CaptureHistoryAdapter v;
    public int w;
    public int x;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296603);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                CaptureHistoryView.N(CaptureHistoryView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ViewGroup d;
        public final /* synthetic */ CaptureHistoryView e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        public c(boolean z, ViewGroup viewGroup, CaptureHistoryView captureHistoryView, boolean z2, int i, int i2) {
            this.c = z;
            this.d = viewGroup;
            this.e = captureHistoryView;
            this.f = z2;
            this.g = i;
            this.h = i2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView$onViewStateChanged$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (this.c) {
                this.d.removeAllViews();
                this.d.addView(this.e.b0(), -1, -1);
                CaptureHistoryView.X(this.e, this.f);
            }
            this.e.e0(this.g, this.h);
        }
    }

    static {
        t2o.a(481296602);
        t2o.a(481296531);
        t2o.a(481296538);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureHistoryView(Activity activity, rcc<yr3, CaptureManager> rccVar, d1a<xhv> d1aVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
        ckf.g(d1aVar, "onHistoryClear");
        this.l = d1aVar;
        this.n = lg4.O1(activity);
        CaptureHistoryAdapter captureHistoryAdapter = new CaptureHistoryAdapter(activity, this.n, m().M(), new CaptureHistoryView$historyAdapter$1(this), new CaptureHistoryView$historyAdapter$2(this), new CaptureHistoryView$historyAdapter$3(this));
        this.v = captureHistoryAdapter;
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            recyclerView.setAdapter(captureHistoryAdapter);
        } else {
            ckf.y("rvHistory");
            throw null;
        }
    }

    public static final /* synthetic */ void N(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dfcf13", new Object[]{captureHistoryView});
        } else {
            captureHistoryView.Z();
        }
    }

    public static final /* synthetic */ View O(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d6b0cde", new Object[]{captureHistoryView});
        }
        return captureHistoryView.s;
    }

    public static final /* synthetic */ CaptureHistoryAdapter P(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureHistoryAdapter) ipChange.ipc$dispatch("83c42830", new Object[]{captureHistoryView});
        }
        return captureHistoryView.v;
    }

    public static final /* synthetic */ int Q(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f136e32", new Object[]{captureHistoryView})).intValue();
        }
        return captureHistoryView.n;
    }

    public static final /* synthetic */ List R(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("624457fd", new Object[]{captureHistoryView});
        }
        return captureHistoryView.o;
    }

    public static final /* synthetic */ d1a S(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("770c2bd7", new Object[]{captureHistoryView});
        }
        return captureHistoryView.l;
    }

    public static final /* synthetic */ int T(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa7f8286", new Object[]{captureHistoryView})).intValue();
        }
        return captureHistoryView.x;
    }

    public static final /* synthetic */ int U(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7ed76bf", new Object[]{captureHistoryView})).intValue();
        }
        return captureHistoryView.w;
    }

    public static final /* synthetic */ mz1 V(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz1) ipChange.ipc$dispatch("7dad641a", new Object[]{captureHistoryView});
        }
        return captureHistoryView.f17536a;
    }

    public static final /* synthetic */ RecyclerView W(CaptureHistoryView captureHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3c14c39", new Object[]{captureHistoryView});
        }
        return captureHistoryView.r;
    }

    public static final /* synthetic */ void X(CaptureHistoryView captureHistoryView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d021d8b", new Object[]{captureHistoryView, new Boolean(z)});
        } else {
            captureHistoryView.g0(z);
        }
    }

    public static final /* synthetic */ void Y(CaptureHistoryView captureHistoryView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970d02f2", new Object[]{captureHistoryView, new Integer(i), new Integer(i2)});
        } else {
            captureHistoryView.j0(i, i2);
        }
    }

    public static /* synthetic */ Object ipc$super(CaptureHistoryView captureHistoryView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1805108756:
                super.D();
                return null;
            case -587316827:
                super.F();
                return null;
            case -172443846:
                super.H();
                return null;
            case -3136315:
                super.K();
                return null;
            case 1411002928:
                super.A();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView");
        }
    }

    @Override // tb.d32
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
            return;
        }
        super.A();
        Iterator it = ((ArrayList) this.o).iterator();
        while (it.hasNext()) {
            ((cxc) it.next()).i();
        }
        ((ArrayList) this.o).clear();
    }

    @Override // tb.d32
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946839ec", new Object[]{this});
            return;
        }
        super.D();
        Iterator it = ((ArrayList) this.o).iterator();
        while (it.hasNext()) {
            ((cxc) it.next()).o();
        }
    }

    @Override // tb.d32
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfe41a5", new Object[]{this});
            return;
        }
        super.F();
        Iterator it = ((ArrayList) this.o).iterator();
        while (it.hasNext()) {
            ((cxc) it.next()).r();
        }
    }

    @Override // tb.d32
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b8b73a", new Object[]{this});
            return;
        }
        super.H();
        Iterator it = ((ArrayList) this.o).iterator();
        while (it.hasNext()) {
            ((cxc) it.next()).m();
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
            return;
        }
        View view = this.s;
        if (view == null) {
            ckf.y("hintContainer");
            throw null;
        } else if (view.getVisibility() != 0) {
            kl7.a(this.c, "", Localization.q(R.string.taobao_app_1007_1_18976), Localization.q(R.string.taobao_app_1007_confirm), new z53(this), Localization.q(R.string.irp_error_message_cancel_text), a63.INSTANCE);
        }
    }

    /* renamed from: a0 */
    public v53 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v53) ipChange.ipc$dispatch("982f6e1", new Object[]{this});
        }
        return new v53();
    }

    public final View b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View view = this.p;
        if (view != null) {
            return view;
        }
        ckf.y("rootView");
        throw null;
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580c8f7d", new Object[]{this})).booleanValue();
        }
        v53 v53Var = (v53) this.f17536a;
        if (v53Var == null) {
            return false;
        }
        return v53Var.I();
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public void d(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d8911", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        e0(i, i2);
        if (i <= i2 / 2) {
            z = false;
        }
        g0(z);
    }

    public void e0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f9d2d0", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.w != i) {
            this.w = i;
            this.x = i2;
            j0(i, i2);
        }
    }

    public void f0(ViewGroup viewGroup, boolean z, boolean z2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb1cbcd", new Object[]{this, viewGroup, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(viewGroup, "container");
        if (this.m != z) {
            this.m = z;
            vpt.g("", new c(z, viewGroup, this, z2, i, i2));
        }
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51db6da", new Object[]{this, new Boolean(z)});
        }
    }

    public final void h0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9a75a2", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.p = view;
    }

    public final void i0(r7m r7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c259b1d3", new Object[]{this, r7mVar, new Boolean(z)});
        } else if (!z) {
            this.v.W();
        } else if (r7mVar != null) {
            this.v.T(r7mVar);
        }
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            ckf.y("rvHistory");
            throw null;
        } else if (recyclerView.getVisibility() != 0) {
            return true;
        } else {
            RecyclerView recyclerView2 = this.r;
            if (recyclerView2 != null) {
                return true ^ recyclerView2.canScrollVertically(-1);
            }
            ckf.y("rvHistory");
            throw null;
        }
    }

    public final void d0(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6e515c", new Object[]{this, list});
            return;
        }
        ckf.g(list, "result");
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.r;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                View view = this.s;
                if (view != null) {
                    view.setVisibility(0);
                    g0(false);
                    j0(this.w, this.x);
                    return;
                }
                ckf.y("hintContainer");
                throw null;
            }
            ckf.y("rvHistory");
            throw null;
        }
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
            View view2 = this.s;
            if (view2 != null) {
                view2.setVisibility(8);
                this.v.V(list);
                return;
            }
            ckf.y("hintContainer");
            throw null;
        }
        ckf.y("rvHistory");
        throw null;
    }

    public final void g0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5447b9f0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.s;
            if (view == null) {
                ckf.y("hintContainer");
                throw null;
            } else if (view.getVisibility() == 0) {
                TUrlImageView tUrlImageView = this.q;
                if (tUrlImageView == null) {
                    ckf.y("deleteBtn");
                    throw null;
                } else if (tUrlImageView.getVisibility() != 8) {
                    TUrlImageView tUrlImageView2 = this.q;
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setVisibility(8);
                        RecyclerView recyclerView = this.r;
                        if (recyclerView != null) {
                            recyclerView.setTranslationY(-y);
                        } else {
                            ckf.y("rvHistory");
                            throw null;
                        }
                    } else {
                        ckf.y("deleteBtn");
                        throw null;
                    }
                }
            } else {
                TUrlImageView tUrlImageView3 = this.q;
                if (tUrlImageView3 == null) {
                    ckf.y("deleteBtn");
                    throw null;
                } else if (tUrlImageView3.getVisibility() != 0) {
                    TUrlImageView tUrlImageView4 = this.q;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setVisibility(0);
                        RecyclerView recyclerView2 = this.r;
                        if (recyclerView2 != null) {
                            recyclerView2.setTranslationY(0.0f);
                        } else {
                            ckf.y("rvHistory");
                            throw null;
                        }
                    } else {
                        ckf.y("deleteBtn");
                        throw null;
                    }
                }
            }
        } else {
            TUrlImageView tUrlImageView5 = this.q;
            if (tUrlImageView5 == null) {
                ckf.y("deleteBtn");
                throw null;
            } else if (tUrlImageView5.getVisibility() != 8) {
                TUrlImageView tUrlImageView6 = this.q;
                if (tUrlImageView6 != null) {
                    tUrlImageView6.setVisibility(8);
                    RecyclerView recyclerView3 = this.r;
                    if (recyclerView3 != null) {
                        recyclerView3.setTranslationY(-y);
                    } else {
                        ckf.y("rvHistory");
                        throw null;
                    }
                } else {
                    ckf.y("deleteBtn");
                    throw null;
                }
            }
        }
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_history, (ViewGroup) null, false);
        ckf.f(inflate, "from(activity).inflate(\n…istory, null, false\n    )");
        h0(inflate);
        View findViewById = b0().findViewById(R.id.btn_delete);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01h4HC9j1DVGYNQC1N3_!!6000000000221-49-tps-75-73.webp");
        tUrlImageView.setOnClickListener(new b());
        tUrlImageView.setContentDescription(Localization.q(R.string.taobao_app_1007_1_clear_all_history) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
        tUrlImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        layoutParams.height = p1p.a(m().M() ? 24.0f : 19.0f);
        layoutParams.width = p1p.a(m().M() ? 25.0f : 20.0f);
        tUrlImageView.setLayoutParams(layoutParams);
        ckf.f(findViewById, "rootView.findViewById<TU…f else 20f)\n      }\n    }");
        this.q = (TUrlImageView) findViewById;
        View findViewById2 = b0().findViewById(R.id.fl_empty_container);
        ckf.f(findViewById2, "rootView.findViewById(R.id.fl_empty_container)");
        this.s = findViewById2;
        View findViewById3 = b0().findViewById(R.id.ll_empty_hint);
        ckf.f(findViewById3, "rootView.findViewById(R.id.ll_empty_hint)");
        this.t = findViewById3;
        float f = 15.0f;
        ((TextView) b0().findViewById(R.id.tv_empty_hint)).setTextSize(1, m().M() ? 17.0f : 15.0f);
        ((TUrlImageView) b0().findViewById(R.id.iv_empty_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
        View findViewById4 = b0().findViewById(R.id.ll_empty_full);
        ckf.f(findViewById4, "rootView.findViewById(R.id.ll_empty_full)");
        this.u = findViewById4;
        TextView textView = (TextView) b0().findViewById(R.id.tv_empty_hint_full);
        if (m().M()) {
            f = 17.0f;
        }
        textView.setTextSize(1, f);
        ((TUrlImageView) b0().findViewById(R.id.iv_empty_hint_full)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
        View findViewById5 = b0().findViewById(R.id.rv_list);
        ckf.f(findViewById5, "rootView.findViewById(R.id.rv_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.r = recyclerView;
        recyclerView.setTranslationY(-y);
        int O1 = lg4.O1(this.c);
        this.n = O1;
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.c, O1);
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.history.CaptureHistoryView$initViews$4$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(CaptureHistoryView$initViews$4$1 captureHistoryView$initViews$4$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView$initViews$4$1");
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
                    }
                    int itemViewType = CaptureHistoryView.P(CaptureHistoryView.this).getItemViewType(i);
                    if (itemViewType == 0) {
                        return 1;
                    }
                    if (itemViewType != 1) {
                        return CaptureHistoryView.Q(CaptureHistoryView.this);
                    }
                    return CaptureHistoryView.Q(CaptureHistoryView.this);
                }
            });
            recyclerView2.setLayoutManager(gridLayoutManager);
            RecyclerView recyclerView3 = this.r;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.history.CaptureHistoryView$initViews$5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(CaptureHistoryView$initViews$5 captureHistoryView$initViews$5, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView$initViews$5");
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView4, RecyclerView.State state) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView4, state});
                            return;
                        }
                        ckf.g(rect, "outRect");
                        ckf.g(view, "view");
                        ckf.g(recyclerView4, a.MSG_SOURCE_PARENT);
                        ckf.g(state, "state");
                        if ((view.getTag() instanceof String) && ckf.b("item", view.getTag())) {
                            int a2 = p1p.a(1.0f);
                            rect.bottom = a2;
                            int i = a2 / 2;
                            rect.left = i;
                            rect.right = i;
                        }
                    }
                });
            } else {
                ckf.y("rvHistory");
                throw null;
            }
        } else {
            ckf.y("rvHistory");
            throw null;
        }
    }

    public final void j0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98ad0ed", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View view = this.s;
        if (view == null) {
            ckf.y("hintContainer");
            throw null;
        } else if (view.getVisibility() == 0) {
            if (i > i2 / 3) {
                View view2 = this.t;
                if (view2 != null) {
                    if (view2.getVisibility() != 8) {
                        View view3 = this.t;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            View view4 = this.t;
                            if (view4 != null) {
                                view4.setVisibility(8);
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        } else {
                            ckf.y("emptyHintView");
                            throw null;
                        }
                    }
                    View view5 = this.u;
                    if (view5 == null) {
                        ckf.y("emptyHintFullView");
                        throw null;
                    } else if (view5.getVisibility() != 0) {
                        View view6 = this.u;
                        if (view6 != null) {
                            view6.setVisibility(0);
                        } else {
                            ckf.y("emptyHintFullView");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("emptyHintView");
                    throw null;
                }
            } else {
                View view7 = this.t;
                if (view7 != null) {
                    if (view7.getVisibility() != 0) {
                        View view8 = this.t;
                        if (view8 != null) {
                            view8.setVisibility(0);
                            View view9 = this.t;
                            if (view9 != null) {
                                view9.setVisibility(0);
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        } else {
                            ckf.y("emptyHintView");
                            throw null;
                        }
                    }
                    View view10 = this.u;
                    if (view10 == null) {
                        ckf.y("emptyHintFullView");
                        throw null;
                    } else if (view10.getVisibility() != 8) {
                        View view11 = this.u;
                        if (view11 != null) {
                            view11.setVisibility(8);
                        } else {
                            ckf.y("emptyHintFullView");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("emptyHintView");
                    throw null;
                }
            }
            View view12 = this.t;
            if (view12 != null) {
                if (view12.getVisibility() == 0) {
                    View view13 = this.t;
                    if (view13 != null) {
                        ViewGroup.LayoutParams layoutParams = view13.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = ((i - p1p.a(48.0f)) - CaptureBottomAreaView.Companion.c()) / 2;
                            View view14 = this.t;
                            if (view14 != null) {
                                view14.setLayoutParams(layoutParams2);
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        ckf.y("emptyHintView");
                        throw null;
                    }
                }
                View view15 = this.u;
                if (view15 == null) {
                    ckf.y("emptyHintFullView");
                    throw null;
                } else if (view15.getVisibility() == 0) {
                    View view16 = this.u;
                    if (view16 != null) {
                        ViewGroup.LayoutParams layoutParams3 = view16.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            layoutParams4.topMargin = ((i - CaptureBottomAreaView.Companion.c()) / 2) - p1p.a(152.0f);
                            View view17 = this.u;
                            if (view17 != null) {
                                view17.setLayoutParams(layoutParams4);
                            } else {
                                ckf.y("emptyHintFullView");
                                throw null;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        ckf.y("emptyHintFullView");
                        throw null;
                    }
                }
            } else {
                ckf.y("emptyHintView");
                throw null;
            }
        }
    }
}
