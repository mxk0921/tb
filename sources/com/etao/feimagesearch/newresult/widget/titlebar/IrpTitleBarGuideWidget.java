package com.etao.feimagesearch.newresult.widget.titlebar;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import com.etao.feimagesearch.ui.CornerImageView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedList;
import java.util.List;
import tb.amf;
import tb.caa;
import tb.ckf;
import tb.i04;
import tb.l53;
import tb.lg4;
import tb.mno;
import tb.mzu;
import tb.o4w;
import tb.p1p;
import tb.p9j;
import tb.t2o;
import tb.vz;
import tb.xfw;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpTitleBarGuideWidget extends ViewWidget<FrameLayout, IrpDatasource, IrpTitleBarGuideWidget> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final IrpDatasource l;
    public FrameLayout m;
    public View n;
    public View o;
    public View p;
    public RecyclerView q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout h0 = IrpTitleBarGuideWidget.h0(IrpTitleBarGuideWidget.this);
            if (h0 != null) {
                h0.setVisibility(8);
            } else {
                ckf.y("mRootView");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            IrpTitleBarGuideWidget.i0(IrpTitleBarGuideWidget.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            IrpTitleBarGuideWidget.i0(IrpTitleBarGuideWidget.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout h0 = IrpTitleBarGuideWidget.h0(IrpTitleBarGuideWidget.this);
            if (h0 != null) {
                h0.setVisibility(0);
            } else {
                ckf.y("mRootView");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                IrpTitleBarGuideWidget.i0(IrpTitleBarGuideWidget.this);
            }
        }
    }

    static {
        t2o.a(481297262);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpTitleBarGuideWidget(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.l = irpDatasource;
    }

    public static final /* synthetic */ FrameLayout h0(IrpTitleBarGuideWidget irpTitleBarGuideWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("548f73d1", new Object[]{irpTitleBarGuideWidget});
        }
        return irpTitleBarGuideWidget.m;
    }

    public static final /* synthetic */ void i0(IrpTitleBarGuideWidget irpTitleBarGuideWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1a8cd3", new Object[]{irpTitleBarGuideWidget});
        } else {
            irpTitleBarGuideWidget.j0();
        }
    }

    public static /* synthetic */ Object ipc$super(IrpTitleBarGuideWidget irpTitleBarGuideWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpTitleBarGuideWidget");
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732035a6", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(200L).withEndAction(new a());
        } else {
            ckf.y("mRootView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class TitleBarGuideRegionAdapter extends RecyclerView.Adapter<TitleBarGuideRegionViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4836a;
        public final List<? extends p9j> b;
        public int c = -1;
        public final /* synthetic */ IrpTitleBarGuideWidget d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpTitleBarGuideWidget f4837a;
            public final /* synthetic */ int b;
            public final /* synthetic */ TitleBarGuideRegionAdapter c;

            public a(IrpTitleBarGuideWidget irpTitleBarGuideWidget, int i, TitleBarGuideRegionAdapter titleBarGuideRegionAdapter) {
                this.f4837a = irpTitleBarGuideWidget;
                this.b = i;
                this.c = titleBarGuideRegionAdapter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                mno.e(caa.c(), amf.KEY_IRP_CODE_HEAD_CLICK, true);
                IrpTitleBarGuideWidget.i0(this.f4837a);
                mzu.i("Page_PhotoSearchResult", "codeBoxGuideClick", new String[0]);
                if (this.b == TitleBarGuideRegionAdapter.M(this.c)) {
                    p9j p9jVar = this.c.N().get(TitleBarGuideRegionAdapter.M(this.c));
                    if (p9jVar.a()) {
                        o4w.a();
                        zmf.a r = this.f4837a.W().r(p9jVar.b);
                        if (r != null) {
                            zmf.g().d((FragmentActivity) this.f4837a.E(), r);
                        }
                    }
                }
            }
        }

        static {
            t2o.a(481297263);
        }

        public TitleBarGuideRegionAdapter(IrpTitleBarGuideWidget irpTitleBarGuideWidget, boolean z, List<? extends p9j> list) {
            ckf.g(irpTitleBarGuideWidget, "this$0");
            ckf.g(list, "titleBarRegionImgList");
            this.d = irpTitleBarGuideWidget;
            this.f4836a = z;
            this.b = list;
        }

        public static final /* synthetic */ int M(TitleBarGuideRegionAdapter titleBarGuideRegionAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e7dc6773", new Object[]{titleBarGuideRegionAdapter})).intValue();
            }
            return titleBarGuideRegionAdapter.c;
        }

        public static /* synthetic */ Object ipc$super(TitleBarGuideRegionAdapter titleBarGuideRegionAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpTitleBarGuideWidget$TitleBarGuideRegionAdapter");
        }

        public final List<p9j> N() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a6243c84", new Object[]{this});
            }
            return this.b;
        }

        /* renamed from: P */
        public TitleBarGuideRegionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TitleBarGuideRegionViewHolder) ipChange.ipc$dispatch("5a434958", new Object[]{this, viewGroup, new Integer(i)});
            }
            ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
            return new TitleBarGuideRegionViewHolder(this.d, this.f4836a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return this.b.size();
        }

        /* renamed from: O */
        public void onBindViewHolder(TitleBarGuideRegionViewHolder titleBarGuideRegionViewHolder, int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a917d740", new Object[]{this, titleBarGuideRegionViewHolder, new Integer(i)});
                return;
            }
            ckf.g(titleBarGuideRegionViewHolder, "holder");
            int adapterPosition = titleBarGuideRegionViewHolder.getAdapterPosition();
            if (((p9j) this.b.get(adapterPosition)).a() && this.c < 0) {
                this.c = adapterPosition;
                z = false;
            }
            titleBarGuideRegionViewHolder.b0((p9j) this.b.get(adapterPosition), z);
            ViewProxy.setOnClickListener(titleBarGuideRegionViewHolder.itemView, new a(this.d, adapterPosition, this));
        }
    }

    /* renamed from: k0 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_irp_scan_code_region_guide, V(), false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.m = frameLayout;
            View findViewById = frameLayout.findViewById(R.id.view_guide_top);
            ckf.f(findViewById, "mRootView.findViewById(R.id.view_guide_top)");
            this.n = findViewById;
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 != null) {
                View findViewById2 = frameLayout2.findViewById(R.id.view_guide_bottom);
                ckf.f(findViewById2, "mRootView.findViewById(R.id.view_guide_bottom)");
                this.o = findViewById2;
                FrameLayout frameLayout3 = this.m;
                if (frameLayout3 != null) {
                    View findViewById3 = frameLayout3.findViewById(R.id.fl_region_container);
                    ckf.f(findViewById3, "mRootView.findViewById(R.id.fl_region_container)");
                    this.p = findViewById3;
                    FrameLayout frameLayout4 = this.m;
                    if (frameLayout4 != null) {
                        View findViewById4 = frameLayout4.findViewById(R.id.rv_region);
                        ckf.f(findViewById4, "mRootView.findViewById(R.id.rv_region)");
                        this.q = (RecyclerView) findViewById4;
                        FrameLayout frameLayout5 = this.m;
                        if (frameLayout5 != null) {
                            frameLayout5.setVisibility(8);
                            FrameLayout frameLayout6 = this.m;
                            if (frameLayout6 != null) {
                                return frameLayout6;
                            }
                            ckf.y("mRootView");
                            throw null;
                        }
                        ckf.y("mRootView");
                        throw null;
                    }
                    ckf.y("mRootView");
                    throw null;
                }
                ckf.y("mRootView");
                throw null;
            }
            ckf.y("mRootView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.List] */
    public final void l0(LinkedList<p9j> linkedList, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da6911a", new Object[]{this, linkedList, new Boolean(z), new Integer(i)});
        } else if (!W().q().isEmpty() && linkedList != null && !linkedList.isEmpty() && !lg4.i()) {
            Boolean Z1 = lg4.Z1(amf.KEY_IRP_TITLE_BAR_GUIDE);
            if (Z1 == null || !Z1.booleanValue()) {
                if (ckf.b(this.l.y(), l53.PsSourceSY_SYS)) {
                    if (mno.a(E(), amf.KEY_IRP_CODE_HEAD_CLICK)) {
                        return;
                    }
                } else if (mno.a(E(), amf.KEY_IRP_TITLE_BAR_GUIDE)) {
                    return;
                }
            }
            mno.e(E(), amf.KEY_IRP_TITLE_BAR_GUIDE, true);
            int a2 = p1p.a((z ? 3.0f : 8.0f) + 32.0f);
            int a3 = p1p.a(amf.a(z));
            View view = this.p;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = a2;
                    layoutParams2.height = a3;
                    View view2 = this.p;
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams2);
                        View view3 = this.n;
                        if (view3 != null) {
                            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                            int i2 = a3 + a2;
                            layoutParams3.height = i2;
                            View view4 = this.n;
                            if (view4 != null) {
                                view4.setLayoutParams(layoutParams3);
                                View view5 = this.n;
                                if (view5 != null) {
                                    view5.setBackgroundColor(Color.parseColor("#000000"));
                                    View view6 = this.o;
                                    if (view6 != null) {
                                        ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
                                        if (layoutParams4 != null) {
                                            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                                            layoutParams5.topMargin = i2;
                                            View view7 = this.o;
                                            if (view7 != null) {
                                                view7.setLayoutParams(layoutParams5);
                                                View view8 = this.o;
                                                if (view8 != null) {
                                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                                    gradientDrawable.setShape(0);
                                                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                                                    gradientDrawable.setColors(new int[]{Color.parseColor("#CC000000"), Color.parseColor("#00000000")});
                                                    gradientDrawable.setGradientType(0);
                                                    view8.setBackground(gradientDrawable);
                                                    int a4 = p1p.a(amf.d(z));
                                                    RecyclerView recyclerView = this.q;
                                                    if (recyclerView != null) {
                                                        ViewGroup.LayoutParams layoutParams6 = recyclerView.getLayoutParams();
                                                        if (layoutParams6 != null) {
                                                            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                                                            layoutParams7.height = a4;
                                                            int a5 = p1p.a(13.0f);
                                                            layoutParams7.leftMargin = a5;
                                                            RecyclerView recyclerView2 = this.q;
                                                            if (recyclerView2 != null) {
                                                                recyclerView2.setLayoutParams(layoutParams7);
                                                                RecyclerView recyclerView3 = this.q;
                                                                if (recyclerView3 != null) {
                                                                    recyclerView3.setLayoutManager(new LinearLayoutManager(E(), 0, false));
                                                                    RecyclerView recyclerView4 = this.q;
                                                                    if (recyclerView4 != null) {
                                                                        recyclerView4.setItemAnimator(null);
                                                                        final int a6 = p1p.a(amf.b());
                                                                        RecyclerView recyclerView5 = this.q;
                                                                        if (recyclerView5 != null) {
                                                                            recyclerView5.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.etao.feimagesearch.newresult.widget.titlebar.IrpTitleBarGuideWidget$processTitleBarGuideLogic$2
                                                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                                                public static /* synthetic */ Object ipc$super(IrpTitleBarGuideWidget$processTitleBarGuideLogic$2 irpTitleBarGuideWidget$processTitleBarGuideLogic$2, String str, Object... objArr) {
                                                                                    str.hashCode();
                                                                                    int hashCode = str.hashCode();
                                                                                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpTitleBarGuideWidget$processTitleBarGuideLogic$2");
                                                                                }

                                                                                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                                                                                public void getItemOffsets(Rect rect, View view9, RecyclerView recyclerView6, RecyclerView.State state) {
                                                                                    IpChange ipChange2 = $ipChange;
                                                                                    if (ipChange2 instanceof IpChange) {
                                                                                        ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view9, recyclerView6, state});
                                                                                        return;
                                                                                    }
                                                                                    ckf.g(rect, "outRect");
                                                                                    ckf.g(view9, "view");
                                                                                    ckf.g(recyclerView6, a.MSG_SOURCE_PARENT);
                                                                                    ckf.g(state, "state");
                                                                                    if (recyclerView6.getChildAdapterPosition(view9) != state.getItemCount() - 1) {
                                                                                        rect.right = a6;
                                                                                    }
                                                                                }
                                                                            });
                                                                            int a7 = p1p.a(amf.e(z));
                                                                            int i3 = i / (a7 + a6);
                                                                            int size = linkedList.size();
                                                                            LinkedList<p9j> linkedList2 = linkedList;
                                                                            if (size >= i3) {
                                                                                List<p9j> subList = linkedList.subList(0, i3);
                                                                                ckf.f(subList, "titleBarRegionImgList.subList(0, showCount)");
                                                                                linkedList2 = i04.B0(subList);
                                                                            }
                                                                            RecyclerView recyclerView6 = this.q;
                                                                            if (recyclerView6 != null) {
                                                                                recyclerView6.setOnTouchListener(new b());
                                                                                RecyclerView recyclerView7 = this.q;
                                                                                if (recyclerView7 != null) {
                                                                                    recyclerView7.setAdapter(new TitleBarGuideRegionAdapter(this, z, linkedList2));
                                                                                    FrameLayout frameLayout = this.m;
                                                                                    if (frameLayout != null) {
                                                                                        ((TUrlImageView) frameLayout.findViewById(R.id.tiv_hing_bg)).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01wmMiGr1ChLHJ6TXvt_!!6000000000112-2-tps-568-180.png");
                                                                                        FrameLayout frameLayout2 = this.m;
                                                                                        if (frameLayout2 != null) {
                                                                                            View findViewById = frameLayout2.findViewById(R.id.fl_guide_hint);
                                                                                            ViewGroup.LayoutParams layoutParams8 = findViewById.getLayoutParams();
                                                                                            if (layoutParams8 != null) {
                                                                                                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams8;
                                                                                                layoutParams9.width = p1p.a(140.0f);
                                                                                                layoutParams9.topMargin = a2 + a4;
                                                                                                layoutParams9.leftMargin = (((a5 + a7) + a6) + (a7 / 2)) - p1p.a(70.0f);
                                                                                                findViewById.setLayoutParams(layoutParams9);
                                                                                                FrameLayout frameLayout3 = this.m;
                                                                                                if (frameLayout3 != null) {
                                                                                                    frameLayout3.setOnTouchListener(new c());
                                                                                                    FrameLayout frameLayout4 = this.m;
                                                                                                    if (frameLayout4 != null) {
                                                                                                        frameLayout4.postDelayed(new d(), 200L);
                                                                                                        FrameLayout frameLayout5 = this.m;
                                                                                                        if (frameLayout5 != null) {
                                                                                                            frameLayout5.postDelayed(new e(), 3000L);
                                                                                                            mzu.q("Page_PhotoSearchResult", "codeBoxGuideExpose", new String[0]);
                                                                                                            return;
                                                                                                        }
                                                                                                        ckf.y("mRootView");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    ckf.y("mRootView");
                                                                                                    throw null;
                                                                                                }
                                                                                                ckf.y("mRootView");
                                                                                                throw null;
                                                                                            }
                                                                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                        }
                                                                                        ckf.y("mRootView");
                                                                                        throw null;
                                                                                    }
                                                                                    ckf.y("mRootView");
                                                                                    throw null;
                                                                                }
                                                                                ckf.y("mRegionRv");
                                                                                throw null;
                                                                            }
                                                                            ckf.y("mRegionRv");
                                                                            throw null;
                                                                        }
                                                                        ckf.y("mRegionRv");
                                                                        throw null;
                                                                    }
                                                                    ckf.y("mRegionRv");
                                                                    throw null;
                                                                }
                                                                ckf.y("mRegionRv");
                                                                throw null;
                                                            }
                                                            ckf.y("mRegionRv");
                                                            throw null;
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                    }
                                                    ckf.y("mRegionRv");
                                                    throw null;
                                                }
                                                ckf.y("mGuideBottomBg");
                                                throw null;
                                            }
                                            ckf.y("mGuideBottomBg");
                                            throw null;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    }
                                    ckf.y("mGuideBottomBg");
                                    throw null;
                                }
                                ckf.y("mGuideTopBg");
                                throw null;
                            }
                            ckf.y("mGuideTopBg");
                            throw null;
                        }
                        ckf.y("mGuideTopBg");
                        throw null;
                    }
                    ckf.y("mRegionContainer");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            ckf.y("mRegionContainer");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class TitleBarGuideRegionViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4838a;
        public final View b = this.itemView.findViewById(R.id.view_shade);
        public final CornerImageView c;
        public final FrameLayout d;
        public final int e;
        public final /* synthetic */ IrpTitleBarGuideWidget f;

        static {
            t2o.a(481297265);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleBarGuideRegionViewHolder(IrpTitleBarGuideWidget irpTitleBarGuideWidget, boolean z) {
            super(LayoutInflater.from(irpTitleBarGuideWidget.E()).inflate(R.layout.feis_view_title_bar_guide_region_object_2024, irpTitleBarGuideWidget.V(), false));
            ckf.g(irpTitleBarGuideWidget, "this$0");
            this.f = irpTitleBarGuideWidget;
            this.f4838a = z;
            View findViewById = this.itemView.findViewById(R.id.iv_object);
            CornerImageView cornerImageView = (CornerImageView) findViewById;
            cornerImageView.setRadius(p1p.b(c0() ? 4.5f : 6.5f));
            cornerImageView.setBackgroundColor(Color.parseColor("#222222"));
            ckf.f(findViewById, "itemView.findViewById<Co…Color(\"#222222\"))\n      }");
            this.c = (CornerImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.fl_scan_hint);
            ckf.f(findViewById2, "itemView.findViewById(R.id.fl_scan_hint)");
            this.d = (FrameLayout) findViewById2;
            this.e = p1p.a(amf.c(z));
        }

        public static /* synthetic */ Object ipc$super(TitleBarGuideRegionViewHolder titleBarGuideRegionViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpTitleBarGuideWidget$TitleBarGuideRegionViewHolder");
        }

        public final boolean c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b7cda19d", new Object[]{this})).booleanValue();
            }
            return this.f4838a;
        }

        public final void d0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c0caf30", new Object[]{this, new Boolean(z)});
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i = this.e;
                layoutParams2.width = i;
                layoutParams2.height = i;
                float f = 3.5f;
                layoutParams2.topMargin = p1p.a(z ? 3.0f : 3.5f);
                this.c.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = this.b.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    int i2 = this.e;
                    layoutParams4.width = i2;
                    layoutParams4.height = i2;
                    if (z) {
                        f = 3.0f;
                    }
                    layoutParams4.topMargin = p1p.a(f);
                    this.b.setLayoutParams(layoutParams4);
                    ViewGroup.LayoutParams layoutParams5 = this.itemView.getLayoutParams();
                    layoutParams5.width = p1p.a(amf.e(z));
                    layoutParams5.height = p1p.a(amf.d(z));
                    this.itemView.setLayoutParams(layoutParams5);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        public final void b0(p9j p9jVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f29526bc", new Object[]{this, p9jVar, new Boolean(z)});
                return;
            }
            ckf.g(p9jVar, "bean");
            d0(this.f4838a);
            float f = 6.5f;
            float b = p1p.b(6.5f);
            this.c.setImageBitmap(p9jVar.c);
            if (this.b.getBackground() == null) {
                View view = this.b;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(b);
                gradientDrawable.setColor(Color.parseColor("#CC000000"));
                view.setBackground(gradientDrawable);
            }
            this.b.setVisibility(z ? 0 : 8);
            if (p9jVar.a()) {
                this.d.setVisibility(0);
                FrameLayout frameLayout = this.d;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(Color.parseColor("#B3000000"));
                float b2 = p1p.b(8.0f);
                gradientDrawable2.setCornerRadii(new float[]{b2, b2, 0.0f, 0.0f, b, b, 0.0f, 0.0f});
                frameLayout.setBackground(gradientDrawable2);
                int a2 = p1p.a(this.f4838a ? 14.0f : 18.0f);
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = a2;
                    layoutParams2.height = a2;
                    if (this.f4838a) {
                        f = 5.0f;
                    }
                    layoutParams2.bottomMargin = p1p.a(f);
                    layoutParams2.rightMargin = p1p.a(this.f4838a ? 3.0f : 3.5f);
                    this.d.setLayoutParams(layoutParams2);
                    this.d.removeAllViews();
                    TUrlImageView tUrlImageView = new TUrlImageView(this.f.E());
                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016i1s771dsmmoEqz9f_!!6000000003792-49-tps-511-489.webp");
                    int a3 = p1p.a(this.f4838a ? 9.0f : 12.0f);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a3, a3);
                    layoutParams3.gravity = 17;
                    this.d.addView(tUrlImageView, layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                this.d.setVisibility(8);
            }
            this.itemView.invalidate();
        }
    }
}
