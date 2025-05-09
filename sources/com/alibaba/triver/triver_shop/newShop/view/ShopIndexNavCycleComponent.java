package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import tb.a07;
import tb.bmi;
import tb.brp;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.ork;
import tb.r54;
import tb.t2o;
import tb.xhv;
import tb.zfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndexNavCycleComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a */
    public View f3142a;
    public TUrlImageView b;
    public TUrlImageView c;
    public TUrlImageView d;
    public ViewGroup e;
    public TUrlImageView f;
    public FrameLayout g;
    public RecyclerView h;
    public CenterLayoutManager i;
    public FrameLayout j;
    public ShopDataParser k;
    public int l;
    public final b m;
    public final ShopIndexNavCycleComponent$onScrollListener$1 n = new RecyclerView.OnScrollListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$onScrollListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ShopIndexNavCycleComponent$onScrollListener$1 shopIndexNavCycleComponent$onScrollListener$1, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopIndexNavCycleComponent$onScrollListener$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            CenterLayoutManager b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
            } else if (i2 == 0 && (b2 = ShopIndexNavCycleComponent.b(ShopIndexNavCycleComponent.this)) != null) {
                int findFirstVisibleItemPosition = b2.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = b2.findLastVisibleItemPosition();
                npp.a aVar = npp.Companion;
                aVar.b("recycle index nav scroll stable : " + findFirstVisibleItemPosition + ',' + findLastVisibleItemPosition);
                r54.P("cycleIndexNavExposeTask", new ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1(ShopIndexNavCycleComponent.this, findFirstVisibleItemPosition, findLastVisibleItemPosition));
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509690);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final HashSet<a> f3143a = new HashSet<>();
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public int h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface a {
            void a(b bVar);
        }

        static {
            t2o.a(766509691);
        }

        public final void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52109931", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "statusObserver");
            this.f3143a.add(aVar);
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bac60bda", new Object[]{this})).booleanValue();
            }
            return this.g;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a3158c2b", new Object[]{this})).intValue();
            }
            return this.h;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("41ecbf3a", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a50d9ceb", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c50cf6b7", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aa947590", new Object[]{this})).booleanValue();
            }
            return this.f;
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0350a9d", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public final void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("423da0", new Object[]{this});
                return;
            }
            Iterator<a> it = this.f3143a.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }

        public final void j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8365aee", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "statusObserver");
            this.f3143a.remove(aVar);
        }

        public final void k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e0ed432", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }

        public final void l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("639902d7", new Object[]{this, new Integer(i)});
            } else {
                this.h = i;
            }
        }

        public final void m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49e72e00", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z;
            }
        }

        public final void n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e8240d2", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public final void o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("563c723", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public final void p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76f9e1d9", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        public final void q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13692bf5", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ork {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ ork c;

        public c(RecyclerView recyclerView, ork orkVar) {
            ShopIndexNavCycleComponent.this = r1;
            this.b = recyclerView;
            this.c = orkVar;
        }

        @Override // tb.ork
        public void onItemClick(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
                return;
            }
            ShopIndexNavCycleComponent.f(ShopIndexNavCycleComponent.this, i);
            this.b.smoothScrollToPosition(i);
            ork orkVar = this.c;
            if (orkVar != null) {
                orkVar.onItemClick(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Context f3145a;
        public final /* synthetic */ ShopDataParser b;

        public d(Context context, ShopDataParser shopDataParser) {
            this.f3145a = context;
            this.b = shopDataParser;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ShopMoreUtils.INSTANCE.w((Activity) this.f3145a, this.b, this.b.P(), this.b.R(), null, null, null);
            brp.g(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Context f3146a;

        public e(Context context) {
            this.f3146a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                r54.Z(this.f3146a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements zfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Ref$IntRef f3147a;
        public final /* synthetic */ d1a<xhv> b;

        public f(Ref$IntRef ref$IntRef, d1a<xhv> d1aVar) {
            this.f3147a = ref$IntRef;
            this.b = d1aVar;
        }

        @Override // tb.zfw
        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96bf4b1c", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            ckf.g(view, "view");
            this.f3147a.element = i;
            this.b.invoke();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements zfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$IntRef b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ d1a<xhv> d;

        public g(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, d1a<xhv> d1aVar) {
            ShopIndexNavCycleComponent.this = r1;
            this.b = ref$IntRef;
            this.c = ref$IntRef2;
            this.d = d1aVar;
        }

        @Override // tb.zfw
        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96bf4b1c", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            ckf.g(view, "view");
            if (ShopIndexNavCycleComponent.c(ShopIndexNavCycleComponent.this) == null) {
                this.b.element = i2;
                this.c.element = i;
                this.d.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Context f3149a;
        public final /* synthetic */ ShopDataParser b;

        public h(Context context, ShopDataParser shopDataParser) {
            this.f3149a = context;
            this.b = shopDataParser;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                khu.h(this.f3149a, this.b.M0());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
            ShopIndexNavCycleComponent.this = r1;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.b.a
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c77dab7f", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "statusModel");
            ShopIndexNavCycleComponent.h(ShopIndexNavCycleComponent.this);
        }
    }

    static {
        t2o.a(766509689);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent$onScrollListener$1] */
    public ShopIndexNavCycleComponent() {
        i iVar = new i();
        b bVar = new b();
        bVar.a(iVar);
        xhv xhvVar = xhv.INSTANCE;
        this.m = bVar;
    }

    public static final /* synthetic */ RecyclerView a(ShopIndexNavCycleComponent shopIndexNavCycleComponent, Context context, List list, int i2, int i3, ork orkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef212484", new Object[]{shopIndexNavCycleComponent, context, list, new Integer(i2), new Integer(i3), orkVar});
        }
        return shopIndexNavCycleComponent.i(context, list, i2, i3, orkVar);
    }

    public static final /* synthetic */ CenterLayoutManager b(ShopIndexNavCycleComponent shopIndexNavCycleComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CenterLayoutManager) ipChange.ipc$dispatch("6f67aebf", new Object[]{shopIndexNavCycleComponent});
        }
        return shopIndexNavCycleComponent.i;
    }

    public static final /* synthetic */ RecyclerView c(ShopIndexNavCycleComponent shopIndexNavCycleComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("42a6c9c", new Object[]{shopIndexNavCycleComponent});
        }
        return shopIndexNavCycleComponent.h;
    }

    public static final /* synthetic */ ShopDataParser d(ShopIndexNavCycleComponent shopIndexNavCycleComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("e06eeaf1", new Object[]{shopIndexNavCycleComponent});
        }
        return shopIndexNavCycleComponent.k;
    }

    public static final /* synthetic */ b e(ShopIndexNavCycleComponent shopIndexNavCycleComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fba21bef", new Object[]{shopIndexNavCycleComponent});
        }
        return shopIndexNavCycleComponent.m;
    }

    public static final /* synthetic */ void f(ShopIndexNavCycleComponent shopIndexNavCycleComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c07846d", new Object[]{shopIndexNavCycleComponent, new Integer(i2)});
        } else {
            shopIndexNavCycleComponent.l = i2;
        }
    }

    public static final /* synthetic */ void g(ShopIndexNavCycleComponent shopIndexNavCycleComponent, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b66316", new Object[]{shopIndexNavCycleComponent, recyclerView});
        } else {
            shopIndexNavCycleComponent.h = recyclerView;
        }
    }

    public static final /* synthetic */ void h(ShopIndexNavCycleComponent shopIndexNavCycleComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61a4bd7", new Object[]{shopIndexNavCycleComponent});
        } else {
            shopIndexNavCycleComponent.r();
        }
    }

    public static /* synthetic */ void o(ShopIndexNavCycleComponent shopIndexNavCycleComponent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30ab2a0", new Object[]{shopIndexNavCycleComponent, bool, bool2, bool3, bool4, num, bool5, new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            bool3 = null;
        }
        if ((i2 & 8) != 0) {
            bool4 = null;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            bool5 = null;
        }
        shopIndexNavCycleComponent.n(bool, bool2, bool3, bool4, num, bool5);
    }

    public final View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.f3142a;
        if (view != null) {
            return view;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void l(int i2) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4532bf", new Object[]{this, new Integer(i2)});
        } else if (this.l != i2) {
            this.l = i2;
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i2);
            }
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2 == null) {
                adapter = null;
            } else {
                adapter = recyclerView2.getAdapter();
            }
            if (adapter instanceof InfinityCycleAdapter) {
                ((InfinityCycleAdapter) adapter).T(i2);
            }
        }
    }

    public final void m(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3177d13e", new Object[]{this, new Integer(i2)});
        } else {
            o(this, null, null, null, null, Integer.valueOf(i2), null, 47, null);
        }
    }

    public final void n(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f791de1a", new Object[]{this, bool, bool2, bool3, bool4, num, bool5});
            return;
        }
        b bVar = this.m;
        if (bool2 == null) {
            z = bVar.e();
        } else {
            z = bool2.booleanValue();
        }
        bVar.p(z);
        b bVar2 = this.m;
        if (bool == null) {
            z2 = bVar2.d();
        } else {
            z2 = bool.booleanValue();
        }
        bVar2.n(z2);
        b bVar3 = this.m;
        if (bool3 == null) {
            z3 = bVar3.h();
        } else {
            z3 = bool3.booleanValue();
        }
        bVar3.o(z3);
        b bVar4 = this.m;
        if (bool4 == null) {
            z4 = bVar4.g();
        } else {
            z4 = bool4.booleanValue();
        }
        bVar4.m(z4);
        b bVar5 = this.m;
        if (num == null) {
            i2 = bVar5.c();
        } else {
            i2 = num.intValue();
        }
        bVar5.l(i2);
        b bVar6 = this.m;
        if (bool5 == null) {
            z5 = bVar6.b();
        } else {
            z5 = bool5.booleanValue();
        }
        bVar6.k(z5);
        this.m.i();
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826d24c0", new Object[]{this, new Boolean(z)});
        } else {
            o(this, null, Boolean.valueOf(z), null, null, null, null, 61, null);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        if (this.m.h()) {
            if (this.m.e()) {
                TUrlImageView tUrlImageView = this.c;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01HSkEZO1EdnIvWCfFO_!!6000000000375-2-tps-256-256.png");
                    TUrlImageView tUrlImageView2 = this.b;
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN014WivCG23tPCFeqWJC_!!6000000007313-2-tps-240-240.png");
                        TUrlImageView tUrlImageView3 = this.f;
                        if (tUrlImageView3 != null) {
                            tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01GERx6s1jAFplLrTnm_!!6000000004507-2-tps-240-240.png");
                            if (this.m.b()) {
                                TUrlImageView tUrlImageView4 = this.c;
                                if (tUrlImageView4 != null) {
                                    kew.B(tUrlImageView4);
                                    FrameLayout frameLayout = this.g;
                                    if (frameLayout != null) {
                                        kew.B(frameLayout);
                                        ViewGroup viewGroup = this.e;
                                        if (viewGroup != null) {
                                            kew.C(viewGroup);
                                        } else {
                                            ckf.y("searchArea");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("fullScreenSearchArea");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("backButton");
                                    throw null;
                                }
                            } else {
                                ShopDataParser shopDataParser = this.k;
                                if (shopDataParser == null) {
                                    ckf.y("shopData");
                                    throw null;
                                } else if (shopDataParser.Z()) {
                                    p(this.m.d());
                                } else {
                                    TUrlImageView tUrlImageView5 = this.c;
                                    if (tUrlImageView5 != null) {
                                        kew.g0(tUrlImageView5);
                                        FrameLayout frameLayout2 = this.g;
                                        if (frameLayout2 != null) {
                                            kew.g0(frameLayout2);
                                            ViewGroup viewGroup2 = this.e;
                                            if (viewGroup2 != null) {
                                                kew.C(viewGroup2);
                                            } else {
                                                ckf.y("searchArea");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("fullScreenSearchArea");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("backButton");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            ckf.y("fullScreenSearchButton");
                            throw null;
                        }
                    } else {
                        ckf.y("moreButton");
                        throw null;
                    }
                } else {
                    ckf.y("backButton");
                    throw null;
                }
            } else {
                TUrlImageView tUrlImageView6 = this.c;
                if (tUrlImageView6 != null) {
                    tUrlImageView6.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01KPYj0C1wiEDrahb75_!!6000000006341-2-tps-256-256.png");
                    TUrlImageView tUrlImageView7 = this.b;
                    if (tUrlImageView7 != null) {
                        tUrlImageView7.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN015IWb5R29Dcedtk9RC_!!6000000008034-2-tps-60-60.png");
                        p(this.m.d());
                    } else {
                        ckf.y("moreButton");
                        throw null;
                    }
                } else {
                    ckf.y("backButton");
                    throw null;
                }
            }
        } else if (this.m.g()) {
            if (this.m.c() != 0) {
                TUrlImageView tUrlImageView8 = this.c;
                if (tUrlImageView8 != null) {
                    tUrlImageView8.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01KPYj0C1wiEDrahb75_!!6000000006341-2-tps-256-256.png");
                    TUrlImageView tUrlImageView9 = this.b;
                    if (tUrlImageView9 != null) {
                        tUrlImageView9.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN015IWb5R29Dcedtk9RC_!!6000000008034-2-tps-60-60.png");
                        TUrlImageView tUrlImageView10 = this.f;
                        if (tUrlImageView10 != null) {
                            tUrlImageView10.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01PB5kst1ricTm8lbdM_!!6000000005665-2-tps-240-240.png");
                        } else {
                            ckf.y("fullScreenSearchButton");
                            throw null;
                        }
                    } else {
                        ckf.y("moreButton");
                        throw null;
                    }
                } else {
                    ckf.y("backButton");
                    throw null;
                }
            } else if (!this.m.d()) {
                TUrlImageView tUrlImageView11 = this.c;
                if (tUrlImageView11 != null) {
                    tUrlImageView11.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01HSkEZO1EdnIvWCfFO_!!6000000000375-2-tps-256-256.png");
                    TUrlImageView tUrlImageView12 = this.b;
                    if (tUrlImageView12 != null) {
                        tUrlImageView12.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN014WivCG23tPCFeqWJC_!!6000000007313-2-tps-240-240.png");
                        TUrlImageView tUrlImageView13 = this.f;
                        if (tUrlImageView13 != null) {
                            tUrlImageView13.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01GERx6s1jAFplLrTnm_!!6000000004507-2-tps-240-240.png");
                        } else {
                            ckf.y("fullScreenSearchButton");
                            throw null;
                        }
                    } else {
                        ckf.y("moreButton");
                        throw null;
                    }
                } else {
                    ckf.y("backButton");
                    throw null;
                }
            }
            p(this.m.d());
        } else {
            p(this.m.d());
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final RecyclerView i(Context context, List<String> list, int i2, int i3, ork orkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("80ca389c", new Object[]{this, context, list, new Integer(i2), new Integer(i3), orkVar});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        CenterLayoutManager centerLayoutManager = new CenterLayoutManager(context);
        centerLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(centerLayoutManager);
        xhv xhvVar = xhv.INSTANCE;
        this.i = centerLayoutManager;
        b bVar = this.m;
        ShopDataParser shopDataParser = this.k;
        if (shopDataParser != null) {
            InfinityCycleAdapter infinityCycleAdapter = new InfinityCycleAdapter(i2, i3, list, bVar, shopDataParser);
            recyclerView.setAdapter(infinityCycleAdapter);
            infinityCycleAdapter.Y(new c(recyclerView, orkVar));
            recyclerView.addOnScrollListener(this.n);
            return recyclerView;
        }
        ckf.y("shopData");
        throw null;
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc7f626", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.m.h() && this.m.f() && this.m.b() && this.m.c() == 0) {
            z = true;
        }
        if (z) {
            TUrlImageView tUrlImageView = this.c;
            if (tUrlImageView != null) {
                kew.B(tUrlImageView);
                ViewGroup viewGroup = this.e;
                if (viewGroup != null) {
                    kew.B(viewGroup);
                    FrameLayout frameLayout = this.g;
                    if (frameLayout != null) {
                        kew.B(frameLayout);
                        TUrlImageView tUrlImageView2 = this.b;
                        if (tUrlImageView2 != null) {
                            kew.B(tUrlImageView2);
                            FrameLayout frameLayout2 = this.j;
                            if (frameLayout2 != null) {
                                kew.X(frameLayout2, kew.P(24));
                            } else {
                                ckf.y("listContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("moreButton");
                            throw null;
                        }
                    } else {
                        ckf.y("fullScreenSearchArea");
                        throw null;
                    }
                } else {
                    ckf.y("searchArea");
                    throw null;
                }
            } else {
                ckf.y("backButton");
                throw null;
            }
        } else {
            TUrlImageView tUrlImageView3 = this.c;
            if (tUrlImageView3 != null) {
                kew.g0(tUrlImageView3);
                FrameLayout frameLayout3 = this.g;
                if (frameLayout3 != null) {
                    kew.g0(frameLayout3);
                    TUrlImageView tUrlImageView4 = this.b;
                    if (tUrlImageView4 != null) {
                        kew.g0(tUrlImageView4);
                        FrameLayout frameLayout4 = this.j;
                        if (frameLayout4 != null) {
                            kew.X(frameLayout4, kew.p(6));
                        } else {
                            ckf.y("listContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("moreButton");
                        throw null;
                    }
                } else {
                    ckf.y("fullScreenSearchArea");
                    throw null;
                }
            } else {
                ckf.y("backButton");
                throw null;
            }
        }
    }

    public final void k(ShopDataParser shopDataParser, Context context, int i2, List<String> list, ork orkVar, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5755e3", new Object[]{this, shopDataParser, context, new Integer(i2), list, orkVar, new Boolean(z)});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        ckf.g(context, "context");
        ckf.g(list, bmi.CALLBACK_DATA_LIST);
        this.k = shopDataParser;
        View K = kew.K(context, R.layout.view_shop_cycle_index_nav);
        ckf.d(K);
        this.f3142a = K;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = (PerceptionSizeFrameLayout) K.findViewById(R.id.shop_index_nav_hidden_layout);
        View view = this.f3142a;
        if (view != null) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = (PerceptionSizeFrameLayout) view.findViewById(R.id.shop_index_nav_list);
            ckf.f(perceptionSizeFrameLayout2, "perceptionLayout");
            this.j = perceptionSizeFrameLayout2;
            View view2 = this.f3142a;
            if (view2 != null) {
                View findViewById = view2.findViewById(R.id.shop_index_nav_more_button);
                ckf.f(findViewById, "rootView.findViewById(R.id.shop_index_nav_more_button)");
                this.b = (TUrlImageView) findViewById;
                View view3 = this.f3142a;
                if (view3 != null) {
                    View findViewById2 = view3.findViewById(R.id.shop_index_nav_back_button);
                    ckf.f(findViewById2, "rootView.findViewById(R.id.shop_index_nav_back_button)");
                    this.c = (TUrlImageView) findViewById2;
                    View view4 = this.f3142a;
                    if (view4 != null) {
                        View findViewById3 = view4.findViewById(R.id.shop_index_nav_search_button);
                        ckf.f(findViewById3, "rootView.findViewById(R.id.shop_index_nav_search_button)");
                        this.d = (TUrlImageView) findViewById3;
                        View view5 = this.f3142a;
                        if (view5 != null) {
                            View findViewById4 = view5.findViewById(R.id.shop_index_nav_search_area);
                            ckf.f(findViewById4, "rootView.findViewById(R.id.shop_index_nav_search_area)");
                            this.e = (ViewGroup) findViewById4;
                            View view6 = this.f3142a;
                            if (view6 != null) {
                                View findViewById5 = view6.findViewById(R.id.shop_index_nav_full_screen_search_button);
                                ckf.f(findViewById5, "rootView.findViewById(R.id.shop_index_nav_full_screen_search_button)");
                                this.f = (TUrlImageView) findViewById5;
                                View view7 = this.f3142a;
                                if (view7 != null) {
                                    View findViewById6 = view7.findViewById(R.id.shop_index_nav_full_screen_search_area);
                                    ckf.f(findViewById6, "rootView.findViewById(R.id.shop_index_nav_full_screen_search_area)");
                                    this.g = (FrameLayout) findViewById6;
                                    TUrlImageView tUrlImageView = this.d;
                                    if (tUrlImageView != null) {
                                        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01qgdlsv1KrQnhB97ic_!!6000000001217-2-tps-200-200.png");
                                        TUrlImageView tUrlImageView2 = this.f;
                                        if (tUrlImageView2 != null) {
                                            tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01PB5kst1ricTm8lbdM_!!6000000005665-2-tps-240-240.png");
                                            TUrlImageView tUrlImageView3 = this.b;
                                            if (tUrlImageView3 != null) {
                                                tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN015IWb5R29Dcedtk9RC_!!6000000008034-2-tps-60-60.png");
                                                TUrlImageView tUrlImageView4 = this.c;
                                                if (tUrlImageView4 != null) {
                                                    tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01KPYj0C1wiEDrahb75_!!6000000006341-2-tps-256-256.png");
                                                    boolean h0 = shopDataParser.h0();
                                                    if (h0 && (layoutParams = perceptionSizeFrameLayout2.getLayoutParams()) != null && (layoutParams instanceof RelativeLayout.LayoutParams)) {
                                                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                                                        layoutParams2.removeRule(16);
                                                        layoutParams2.removeRule(0);
                                                        layoutParams2.removeRule(17);
                                                        layoutParams2.removeRule(1);
                                                    }
                                                    h hVar = new h(context, shopDataParser);
                                                    ViewGroup viewGroup = this.e;
                                                    if (viewGroup != null) {
                                                        viewGroup.setOnClickListener(hVar);
                                                        TUrlImageView tUrlImageView5 = this.f;
                                                        if (tUrlImageView5 != null) {
                                                            tUrlImageView5.setOnClickListener(hVar);
                                                            TUrlImageView tUrlImageView6 = this.b;
                                                            if (tUrlImageView6 != null) {
                                                                tUrlImageView6.setOnClickListener(new d(context, shopDataParser));
                                                                TUrlImageView tUrlImageView7 = this.c;
                                                                if (tUrlImageView7 != null) {
                                                                    tUrlImageView7.setOnClickListener(new e(context));
                                                                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                                                                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                                                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                                                                    ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 = new ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1(ref$IntRef2, ref$IntRef, ref$IntRef3, h0, this, context, list, orkVar, z, shopDataParser, perceptionSizeFrameLayout2);
                                                                    perceptionSizeFrameLayout.setViewSizeChangedListener(new f(ref$IntRef3, shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1));
                                                                    perceptionSizeFrameLayout2.setViewSizeChangedListener(new g(ref$IntRef2, ref$IntRef, shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1));
                                                                    return;
                                                                }
                                                                ckf.y("backButton");
                                                                throw null;
                                                            }
                                                            ckf.y("moreButton");
                                                            throw null;
                                                        }
                                                        ckf.y("fullScreenSearchButton");
                                                        throw null;
                                                    }
                                                    ckf.y("searchArea");
                                                    throw null;
                                                }
                                                ckf.y("backButton");
                                                throw null;
                                            }
                                            ckf.y("moreButton");
                                            throw null;
                                        }
                                        ckf.y("fullScreenSearchButton");
                                        throw null;
                                    }
                                    ckf.y("searchButton");
                                    throw null;
                                }
                                ckf.y("rootView");
                                throw null;
                            }
                            ckf.y("rootView");
                            throw null;
                        }
                        ckf.y("rootView");
                        throw null;
                    }
                    ckf.y("rootView");
                    throw null;
                }
                ckf.y("rootView");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
