package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.bmi;
import tb.ckf;
import tb.kew;
import tb.mrk;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndexNavNativeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public View f3244a;
    public RecyclerView b;
    public CenterLayoutManager c;
    public FrameLayout d;
    public ShopDataParser e;
    public int f;
    public final b g;
    public List<String> h;
    public final ShopIndexNavNativeComponent$onScrollListener$1 i = new RecyclerView.OnScrollListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.ShopIndexNavNativeComponent$onScrollListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ShopIndexNavNativeComponent$onScrollListener$1 shopIndexNavNativeComponent$onScrollListener$1, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/ShopIndexNavNativeComponent$onScrollListener$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            CenterLayoutManager a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            } else if (i == 0 && (a2 = ShopIndexNavNativeComponent.a(ShopIndexNavNativeComponent.this)) != null) {
                int findFirstVisibleItemPosition = a2.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = a2.findLastVisibleItemPosition();
                npp.a aVar = npp.Companion;
                aVar.b("recycle index nav scroll stable : " + findFirstVisibleItemPosition + ',' + findLastVisibleItemPosition);
                r54.P("cycleIndexNavExposeTask", new ShopIndexNavNativeComponent$onScrollListener$1$onScrollStateChanged$1(ShopIndexNavNativeComponent.this, findFirstVisibleItemPosition, findLastVisibleItemPosition));
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510024);
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

        /* renamed from: a  reason: collision with root package name */
        public final HashSet<a> f3245a = new HashSet<>();
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
            t2o.a(766510025);
        }

        public final void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a64f3f1", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "statusObserver");
            this.f3245a.add(aVar);
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
            Iterator<a> it = this.f3245a.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }

        public final void j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81f219ee", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "statusObserver");
            this.f3245a.remove(aVar);
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
    public static final class c implements mrk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ mrk c;

        public c(RecyclerView recyclerView, mrk mrkVar) {
            this.b = recyclerView;
            this.c = mrkVar;
        }

        @Override // tb.mrk
        public void onItemClick(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
                return;
            }
            ShopIndexNavNativeComponent.d(ShopIndexNavNativeComponent.this, i);
            this.b.smoothScrollToPosition(i);
            mrk mrkVar = this.c;
            if (mrkVar != null) {
                mrkVar.onItemClick(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RecyclerView b;

        public d(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout b = ShopIndexNavNativeComponent.b(ShopIndexNavNativeComponent.this);
            if (b != null) {
                b.addView(this.b, -1, -1);
            } else {
                ckf.y("listContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.component.nativeview.ShopIndexNavNativeComponent.b.a
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf37fbf", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "statusModel");
            ShopIndexNavNativeComponent.e(ShopIndexNavNativeComponent.this);
        }
    }

    static {
        t2o.a(766510023);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.alibaba.triver.triver_shop.newShop.view.component.nativeview.ShopIndexNavNativeComponent$onScrollListener$1] */
    public ShopIndexNavNativeComponent() {
        e eVar = new e();
        b bVar = new b();
        bVar.a(eVar);
        xhv xhvVar = xhv.INSTANCE;
        this.g = bVar;
    }

    public static final /* synthetic */ CenterLayoutManager a(ShopIndexNavNativeComponent shopIndexNavNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CenterLayoutManager) ipChange.ipc$dispatch("992017c", new Object[]{shopIndexNavNativeComponent});
        }
        return shopIndexNavNativeComponent.c;
    }

    public static final /* synthetic */ FrameLayout b(ShopIndexNavNativeComponent shopIndexNavNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b2edb651", new Object[]{shopIndexNavNativeComponent});
        }
        return shopIndexNavNativeComponent.d;
    }

    public static final /* synthetic */ ShopDataParser c(ShopIndexNavNativeComponent shopIndexNavNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("80a36ff1", new Object[]{shopIndexNavNativeComponent});
        }
        return shopIndexNavNativeComponent.e;
    }

    public static final /* synthetic */ void d(ShopIndexNavNativeComponent shopIndexNavNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1381b2d", new Object[]{shopIndexNavNativeComponent, new Integer(i)});
        } else {
            shopIndexNavNativeComponent.f = i;
        }
    }

    public static final /* synthetic */ void e(ShopIndexNavNativeComponent shopIndexNavNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29889657", new Object[]{shopIndexNavNativeComponent});
        } else {
            shopIndexNavNativeComponent.q();
        }
    }

    public static /* synthetic */ void m(ShopIndexNavNativeComponent shopIndexNavNativeComponent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1171a0", new Object[]{shopIndexNavNativeComponent, bool, bool2, bool3, bool4, num, bool5, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        if ((i & 8) != 0) {
            bool4 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            bool5 = null;
        }
        shopIndexNavNativeComponent.l(bool, bool2, bool3, bool4, num, bool5);
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33df4582", new Object[]{this})).intValue();
        }
        List<String> list = this.h;
        if (list == null) {
            return 0;
        }
        if (list != null) {
            return list.size();
        }
        ckf.y(bmi.CALLBACK_DATA_LIST);
        throw null;
    }

    public final View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.f3244a;
        if (view != null) {
            return view;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void j(int i) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4532bf", new Object[]{this, new Integer(i)});
        } else if (this.f != i) {
            this.f = i;
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i);
            }
            RecyclerView recyclerView2 = this.b;
            if (recyclerView2 == null) {
                adapter = null;
            } else {
                adapter = recyclerView2.getAdapter();
            }
            if (adapter instanceof InfinityCycleAdapter) {
                ((InfinityCycleAdapter) adapter).S(i);
            }
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3177d13e", new Object[]{this, new Integer(i)});
        } else {
            m(this, null, null, null, null, Integer.valueOf(i), null, 47, null);
        }
    }

    public final void l(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f791de1a", new Object[]{this, bool, bool2, bool3, bool4, num, bool5});
            return;
        }
        b bVar = this.g;
        if (bool2 == null) {
            z = bVar.e();
        } else {
            z = bool2.booleanValue();
        }
        bVar.p(z);
        b bVar2 = this.g;
        if (bool == null) {
            z2 = bVar2.d();
        } else {
            z2 = bool.booleanValue();
        }
        bVar2.n(z2);
        b bVar3 = this.g;
        if (bool3 == null) {
            z3 = bVar3.h();
        } else {
            z3 = bool3.booleanValue();
        }
        bVar3.o(z3);
        b bVar4 = this.g;
        if (bool4 == null) {
            z4 = bVar4.g();
        } else {
            z4 = bool4.booleanValue();
        }
        bVar4.m(z4);
        b bVar5 = this.g;
        if (num == null) {
            i = bVar5.c();
        } else {
            i = num.intValue();
        }
        bVar5.l(i);
        b bVar6 = this.g;
        if (bool5 == null) {
            z5 = bVar6.b();
        } else {
            z5 = bool5.booleanValue();
        }
        bVar6.k(z5);
        this.g.i();
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a50f479", new Object[]{this, new Boolean(z)});
        } else {
            m(this, Boolean.valueOf(z), null, null, null, null, null, 62, null);
        }
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826d24c0", new Object[]{this, new Boolean(z)});
        } else {
            m(this, null, Boolean.valueOf(z), null, null, null, null, 61, null);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        if (this.g.h() && !this.g.e()) {
            o(this.g.d());
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final RecyclerView f(Context context, List<String> list, mrk mrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3133074f", new Object[]{this, context, list, mrkVar});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        CenterLayoutManager centerLayoutManager = new CenterLayoutManager(context);
        centerLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(centerLayoutManager);
        xhv xhvVar = xhv.INSTANCE;
        this.c = centerLayoutManager;
        b bVar = this.g;
        ShopDataParser shopDataParser = this.e;
        if (shopDataParser != null) {
            InfinityCycleAdapter infinityCycleAdapter = new InfinityCycleAdapter(list, bVar, shopDataParser);
            recyclerView.setAdapter(infinityCycleAdapter);
            infinityCycleAdapter.X(new c(recyclerView, mrkVar));
            recyclerView.addOnScrollListener(this.i);
            return recyclerView;
        }
        ckf.y("shopData");
        throw null;
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc7f626", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.g.h() && this.g.f() && this.g.c() == 0) {
            z = true;
        }
        if (z) {
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                kew.X(frameLayout, kew.P(24));
            } else {
                ckf.y("listContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout2 = this.d;
            if (frameLayout2 != null) {
                kew.X(frameLayout2, kew.p(6));
            } else {
                ckf.y("listContainer");
                throw null;
            }
        }
    }

    public final void i(ShopDataParser shopDataParser, Context context, int i, List<String> list, mrk mrkVar, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1265468", new Object[]{this, shopDataParser, context, new Integer(i), list, mrkVar, new Boolean(z)});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        ckf.g(context, "context");
        ckf.g(list, bmi.CALLBACK_DATA_LIST);
        this.h = list;
        this.e = shopDataParser;
        this.f3244a = new FrameLayout(context);
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = new PerceptionSizeFrameLayout(context);
        this.d = perceptionSizeFrameLayout;
        View view = this.f3244a;
        if (view != null) {
            ((ViewGroup) view).addView(perceptionSizeFrameLayout, kew.j(0, kew.p(40), 0, 0, kew.p(6), 0, 0, 109, null));
            RecyclerView f = f(context, list, mrkVar);
            this.b = f;
            this.g.q(z);
            Boolean bool = Boolean.TRUE;
            if (!shopDataParser.K1() && !shopDataParser.L1()) {
                z2 = false;
            }
            m(this, bool, null, Boolean.valueOf(z2), Boolean.valueOf(shopDataParser.O1()), null, Boolean.valueOf(shopDataParser.g()), 18, null);
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                kew.T(recyclerView);
            }
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                frameLayout.post(new d(f));
            } else {
                ckf.y("listContainer");
                throw null;
            }
        } else {
            ckf.y("rootView");
            throw null;
        }
    }
}
