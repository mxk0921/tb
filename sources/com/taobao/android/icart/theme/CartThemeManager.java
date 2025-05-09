package com.taobao.android.icart.theme;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bd4;
import tb.cpt;
import tb.de3;
import tb.ei8;
import tb.eiv;
import tb.fdv;
import tb.fsb;
import tb.kmb;
import tb.mgw;
import tb.pb6;
import tb.t2o;
import tb.tot;
import tb.ux;
import tb.ykl;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartThemeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public int B;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8022a;
    public final PtrBase b;
    public final ViewGroup c;
    public boolean d;
    public final kmb e;
    public final CartRecyclerView f;
    public ThemeFrameLayout g;
    public final ViewGroup h;
    public final View i;
    public final ViewGroup j;
    public tot k;
    public ThemeBroadcastReceiver l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r = 4;
    public int s;
    public FrameLayout t;
    public LinearLayout u;
    public View v;
    public View w;
    public ThemeFrameLayout x;
    public int y;
    public Boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ThemeBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<CartThemeManager> f8024a;

        static {
            t2o.a(478150876);
        }

        public ThemeBroadcastReceiver(CartThemeManager cartThemeManager) {
            this.f8024a = new WeakReference<>(cartThemeManager);
        }

        public static /* synthetic */ Object ipc$super(ThemeBroadcastReceiver themeBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/theme/CartThemeManager$ThemeBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CartThemeManager cartThemeManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(cpt.ACTION_THEME_CHANGE, intent.getAction()) && (cartThemeManager = this.f8024a.get()) != null && CartThemeManager.k(cartThemeManager).R() != null) {
                eiv.a().c(context);
                try {
                    CartThemeManager.k(cartThemeManager).e().D();
                } catch (Exception e) {
                    ei8.a("themeRefreshError", e);
                }
                UnifyLog.g("CartThemeManager", "change theme refresh screen");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (!CartThemeManager.o(CartThemeManager.this)) {
                int t = CartThemeManager.t(CartThemeManager.this);
                if (CartThemeManager.b(CartThemeManager.this) != null && t == 0 && CartThemeManager.d(CartThemeManager.this) == 0) {
                    CartThemeManager.f(CartThemeManager.this, 0.0f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements zxb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    CartThemeManager.q(CartThemeManager.this);
                }
            }
        }

        public c() {
        }

        @Override // tb.zxb.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a3473a7", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.zxb.a
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66fb6f18", new Object[]{this, new Boolean(z)});
                return;
            }
            if (CartThemeManager.o(CartThemeManager.this)) {
                CartThemeManager.g(CartThemeManager.this);
            } else {
                CartThemeManager.this.v(z);
                CartThemeManager.h(CartThemeManager.this).post(new a());
            }
            de3.g(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements PullBase.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.ptr.PullBase.e
        public void a(PullBase pullBase, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e50fea3f", new Object[]{this, pullBase, new Integer(i)});
                return;
            }
            CartThemeManager.e(CartThemeManager.this, i);
            if (!CartThemeManager.o(CartThemeManager.this) && CartThemeManager.t(CartThemeManager.this) < pb6.f(CartThemeManager.l(CartThemeManager.this), 200.0f) && i <= 0 && CartThemeManager.i(CartThemeManager.this) != null) {
                CartThemeManager.j(CartThemeManager.this, i);
                CartThemeManager.f(CartThemeManager.this, -i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CartThemeManager.q(CartThemeManager.this);
                CartThemeManager.g(CartThemeManager.this);
            }
        }

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/theme/CartThemeManager$6");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                CartThemeManager.h(CartThemeManager.this).post(new a());
            }
        }
    }

    static {
        t2o.a(478150867);
    }

    public CartThemeManager(kmb kmbVar) {
        this.e = kmbVar;
        ViewGroup o0 = kmbVar.e().o0();
        this.c = o0;
        Activity context = kmbVar.getContext();
        this.f8022a = context;
        PtrBase ptrBase = (PtrBase) o0.findViewById(R.id.cart_refresh);
        this.b = ptrBase;
        this.i = new FrameLayout(context);
        this.f = (CartRecyclerView) kmbVar.e().o();
        I();
        G();
        H();
        C();
        this.h = (ViewGroup) o0.findViewById(R.id.cart_top_bg_container);
        ptrBase.getStartLayout().setPullBackground(new ColorDrawable(0));
        ViewGroup viewGroup = (ViewGroup) o0.findViewById(R.id.cart_container);
        this.j = viewGroup;
        viewGroup.setClipChildren(false);
    }

    public static /* synthetic */ int a(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8d70b1", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.y = i;
        return i;
    }

    public static /* synthetic */ View b(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d27469a", new Object[]{cartThemeManager});
        }
        return cartThemeManager.i;
    }

    public static /* synthetic */ int c(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("622179b2", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.B = i;
        return i;
    }

    public static /* synthetic */ int d(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38aa672a", new Object[]{cartThemeManager})).intValue();
        }
        return cartThemeManager.m;
    }

    public static /* synthetic */ int e(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f4b9d21", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.m = i;
        return i;
    }

    public static /* synthetic */ void f(CartThemeManager cartThemeManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236f06a", new Object[]{cartThemeManager, new Float(f)});
        } else {
            cartThemeManager.J(f);
        }
    }

    public static /* synthetic */ void g(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b170cf5", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.K();
        }
    }

    public static /* synthetic */ CartRecyclerView h(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartRecyclerView) ipChange.ipc$dispatch("d8ab701b", new Object[]{cartThemeManager});
        }
        return cartThemeManager.f;
    }

    public static /* synthetic */ ThemeFrameLayout i(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("b7c70536", new Object[]{cartThemeManager});
        }
        return cartThemeManager.g;
    }

    public static /* synthetic */ void j(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98871fb1", new Object[]{cartThemeManager, new Integer(i)});
        } else {
            cartThemeManager.L(i);
        }
    }

    public static /* synthetic */ kmb k(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("afd23bfa", new Object[]{cartThemeManager});
        }
        return cartThemeManager.e;
    }

    public static /* synthetic */ Context l(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6f3a475d", new Object[]{cartThemeManager});
        }
        return cartThemeManager.f8022a;
    }

    public static /* synthetic */ int m(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cbada37", new Object[]{cartThemeManager})).intValue();
        }
        return cartThemeManager.n;
    }

    public static /* synthetic */ int n(CartThemeManager cartThemeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad498bb4", new Object[]{cartThemeManager, new Integer(i)})).intValue();
        }
        cartThemeManager.n = i;
        return i;
    }

    public static /* synthetic */ boolean o(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3df12d27", new Object[]{cartThemeManager})).booleanValue();
        }
        return cartThemeManager.B();
    }

    public static /* synthetic */ ViewGroup p(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("46e0b7d3", new Object[]{cartThemeManager});
        }
        return cartThemeManager.h;
    }

    public static /* synthetic */ void q(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405dd2e1", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.P();
        }
    }

    public static /* synthetic */ void r(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419425c0", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.R();
        }
    }

    public static /* synthetic */ void s(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ca789f", new Object[]{cartThemeManager});
        } else {
            cartThemeManager.F();
        }
    }

    public static /* synthetic */ int t(CartThemeManager cartThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4400cb71", new Object[]{cartThemeManager})).intValue();
        }
        return cartThemeManager.z();
    }

    public final int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c0c6694", new Object[]{this})).intValue();
        }
        int i = this.o;
        if (i != 0) {
            return i;
        }
        return this.e.e().d0(125.0f) + SystemBarDecorator.getStatusBarHeight(this.f8022a);
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ceaf0af", new Object[]{this})).booleanValue();
        }
        return this.e.d().B().u();
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ff1808", new Object[]{this});
            return;
        }
        this.e.f().g(new ThemeConfiguration());
        this.k = new tot("cart", mgw.d(this.f8022a));
        int A = A();
        tot totVar = this.k;
        totVar.d = A;
        totVar.h = mgw.d(this.f8022a) - A;
        this.k.g = this.c.getResources().getColor(R.color.icart_background);
        tot totVar2 = this.k;
        totVar2.f = true;
        totVar2.j = true;
        totVar2.k = this.e.e().d0(50.0f);
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f151a7f6", new Object[]{this});
            return;
        }
        u();
        cpt.c().i("cart");
        F();
        View view = this.i;
        if (view != null) {
            view.setVisibility(0);
        }
        FrameLayout frameLayout = this.t;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ThemeFrameLayout themeFrameLayout = this.g;
        if (themeFrameLayout != null) {
            themeFrameLayout.setVisibility(0);
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29ab95b", new Object[]{this});
        } else if (!B()) {
            int z = z();
            if (this.i != null) {
                J(-z);
            }
            if (this.g != null) {
                L(z);
            }
            M(z);
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb846e5", new Object[]{this});
            return;
        }
        this.l = new ThemeBroadcastReceiver(this);
        LocalBroadcastManager.getInstance(this.f8022a).registerReceiver(this.l, new IntentFilter(cpt.ACTION_THEME_CHANGE));
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        this.f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.theme.CartThemeManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/theme/CartThemeManager$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i == 0) {
                    CartThemeManager.s(CartThemeManager.this);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    CartThemeManager.s(CartThemeManager.this);
                }
            }
        });
        this.f.addOnLayoutChangeListener(new b());
        this.e.d().o(new c());
        this.b.addOnScrollListener(new d());
        this.e.d().q(new e());
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d9b046", new Object[]{this});
            return;
        }
        eiv.a().c(this.f8022a);
        this.d = eiv.a().d();
        fdv.e("CartThemeManager", "skin", "useNewSkin", this.d + "");
    }

    public final void J(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0787a1", new Object[]{this, new Float(f)});
        } else if (this.i != null && !B()) {
            this.i.setTranslationY(f);
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85dfcb1", new Object[]{this});
            return;
        }
        ViewGroup r = this.e.e().r();
        r.post(new a(r));
    }

    public final void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbb9fd7", new Object[]{this, new Integer(i)});
            return;
        }
        ThemeFrameLayout themeFrameLayout = this.g;
        if (themeFrameLayout != null && this.q != i) {
            this.q = i;
            themeFrameLayout.setOnScrollY(i);
        }
    }

    public final void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b531e4e8", new Object[]{this, new Integer(i)});
        } else if (this.h != null) {
            if (Math.abs(i) < x() - w() || B()) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
            }
        }
    }

    @Deprecated
    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810e7eef", new Object[]{this});
            return;
        }
        ThemeFrameLayout themeFrameLayout = this.g;
        if (themeFrameLayout != null) {
            themeFrameLayout.setVisibility(8);
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(this.f8022a) + this.y;
        if (this.t == null) {
            this.t = (FrameLayout) this.c.findViewById(R.id.cart_theme_container_v2);
            tot totVar = new tot("cart", mgw.d(this.f8022a));
            totVar.d = statusBarHeight;
            totVar.h = mgw.d(this.f8022a) - statusBarHeight;
            totVar.g = this.c.getResources().getColor(R.color.icart_background);
            totVar.f = false;
            totVar.j = false;
            totVar.k = 0;
            this.x = cpt.c().b(this.f8022a, totVar);
            this.t.addView(this.x, 0, new FrameLayout.LayoutParams(-1, statusBarHeight));
            LinearLayout linearLayout = new LinearLayout(this.f8022a);
            this.u = linearLayout;
            linearLayout.setOrientation(1);
            this.u.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View view = new View(this.f8022a);
            view.setBackgroundResource(R.drawable.icart_gradual_theme_bg_v2_1);
            View view2 = new View(this.f8022a);
            view2.setBackgroundResource(R.drawable.icart_gradual_theme_bg_v2_2);
            this.v = view;
            this.w = view2;
            this.u.addView(view);
            this.u.addView(view2);
            this.t.addView(this.u, 1);
        }
        this.t.setVisibility(0);
        this.v.setLayoutParams(new LinearLayout.LayoutParams(-1, statusBarHeight));
        this.w.setVisibility(0);
        this.w.setLayoutParams(new LinearLayout.LayoutParams(-1, this.B + pb6.f(this.f8022a, 100.0f)));
        ThemeFrameLayout themeFrameLayout2 = this.x;
        if (themeFrameLayout2 != null) {
            if (themeFrameLayout2.getLayoutParams() != null) {
                this.x.getLayoutParams().height = statusBarHeight;
            }
            this.x.updateImageHeight(statusBarHeight);
            this.x.updateCoverHeight(mgw.d(this.f8022a) - statusBarHeight);
        }
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        View view3 = this.i;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    public final void P() {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6059", new Object[]{this});
        } else if (!B()) {
            if (B()) {
                dXRootView = bd4.c(this.e.e().r(), "tabCard");
            } else {
                dXRootView = bd4.c(this.f, "iCartTabCard");
                if (dXRootView == null) {
                    dXRootView = bd4.c(this.f, "tabCard");
                }
            }
            if (dXRootView != null) {
                this.p = dXRootView.getMeasuredHeight();
                this.o = w() + this.p;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = y();
                    marginLayoutParams.height = x();
                    this.i.setLayoutParams(marginLayoutParams);
                    this.i.requestLayout();
                }
                if (ykl.a() && this.g != null) {
                    int A = A();
                    this.g.updateImageHeight(A);
                    this.g.updateCoverHeight(mgw.d(this.f8022a) - A);
                }
            }
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df51d5d1", new Object[]{this});
            return;
        }
        ThemeData themeData = new ThemeData();
        themeData.skinColor = "#FFFFFF";
        themeData.skinPic = "";
        themeData.actionBarBackgroundColor = "#FFFFFF";
        themeData.actionBarBackgroundImage = "";
        themeData.themeLevel = "0";
        cpt.c().k("cart", themeData);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eefef18", new Object[]{this});
            return;
        }
        Boolean bool = this.z;
        if (bool == null || bool.booleanValue() != B()) {
            boolean B = B();
            if (B) {
                N();
            } else {
                E();
            }
            Q();
            this.z = Boolean.valueOf(B);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5d34fd", new Object[]{this});
        } else if (!this.A) {
            O();
            D();
            this.A = true;
        }
    }

    public void v(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2848d202", new Object[]{this, new Boolean(z)});
        } else if (!B()) {
            View view = this.i;
            if (z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue();
        }
        int i = this.n;
        if (i != 0) {
            return i;
        }
        return this.e.e().d0(41.5f) + SystemBarDecorator.getStatusBarHeight(this.f8022a);
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d89bd5d", new Object[]{this})).intValue();
        }
        return this.e.e().d0(130.0f);
    }

    public final int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1ed5905", new Object[]{this})).intValue();
        }
        int i = this.p;
        if (i == 0) {
            i = this.e.e().d0(30.0f);
        }
        return w() + i;
    }

    public final int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("547d4870", new Object[]{this})).intValue();
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.f.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition > this.r && this.s >= pb6.f(this.f8022a, 200.0f)) {
            return this.s;
        }
        this.r = findFirstVisibleItemPosition;
        int n0 = this.e.e().n0(this.r);
        this.s = n0;
        return n0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8025a;

        public a(ViewGroup viewGroup) {
            this.f8025a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXWidgetNode flattenWidgetNode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f8025a.getChildCount(); i2++) {
                View childAt = this.f8025a.getChildAt(i2);
                if (childAt instanceof DXRootView) {
                    DXRootView dXRootView = (DXRootView) childAt;
                    JSONObject data = dXRootView.getData();
                    boolean z = data != null && "hidden".equals(data.getString("status"));
                    if (!(dXRootView.getVisibility() == 8 || z || (flattenWidgetNode = dXRootView.getFlattenWidgetNode()) == null)) {
                        int measuredHeight = flattenWidgetNode.getMeasuredHeight();
                        i += measuredHeight;
                        if (data != null && "header".equals(data.getString("tag"))) {
                            CartThemeManager.a(CartThemeManager.this, measuredHeight);
                        }
                        if (data != null && "tabCard".equals(data.getString("tag"))) {
                            CartThemeManager.c(CartThemeManager.this, measuredHeight);
                        }
                    }
                }
            }
            int statusBarHeight = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(CartThemeManager.l(CartThemeManager.this));
            int i3 = i + statusBarHeight;
            UnifyLog.e("CartThemeManager", "actionBarHeight=" + i3 + ",statusBarHeight=" + statusBarHeight);
            CartThemeManager.n(CartThemeManager.this, i3);
            if (!CartThemeManager.o(CartThemeManager.this)) {
                ViewGroup.LayoutParams layoutParams = CartThemeManager.p(CartThemeManager.this).getLayoutParams();
                if (layoutParams.height != CartThemeManager.m(CartThemeManager.this)) {
                    layoutParams.height = CartThemeManager.m(CartThemeManager.this);
                    CartThemeManager.p(CartThemeManager.this).requestLayout();
                    CartThemeManager.q(CartThemeManager.this);
                }
            }
            CartThemeManager.r(CartThemeManager.this);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d905aa0", new Object[]{this});
            return;
        }
        if (this.j.findViewWithTag("newThemeBg") == null) {
            ThemeFrameLayout b2 = cpt.c().b(this.f8022a, this.k);
            this.g = b2;
            if (b2 != null) {
                b2.setTag("newThemeBg");
                this.j.addView(this.g, 0, new FrameLayout.LayoutParams(-1, mgw.d(this.f8022a) - SystemBarDecorator.getStatusBarHeight(this.f8022a)));
                if (this.e.W().w() && !this.e.W().u() && !QueryParamsManager.CartFeedFlowType.search.equals(this.e.W().k())) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, x());
                    layoutParams.topMargin = y();
                    this.i.setLayoutParams(layoutParams);
                    this.i.setBackgroundResource(R.drawable.icart_gradual_theme_bg);
                    this.i.setTag("gradualThemeBgView");
                    this.j.addView(this.i, 1, layoutParams);
                }
            }
        }
        if (this.h.findViewWithTag("actionBarBg") == null) {
            int w = w();
            FrameLayout.LayoutParams layoutParams2 = this.h.getLayoutParams() instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) this.h.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = w;
                this.h.setLayoutParams(layoutParams2);
            }
            tot totVar = new tot("cart", w);
            totVar.b = 1;
            ThemeFrameLayout b3 = cpt.c().b(this.c.getContext(), totVar);
            if (b3 == null) {
                UnifyLog.e("CartThemeManager", "actionBarThemeView is null");
            } else {
                b3.setTag("actionBarBg");
                this.h.addView(b3, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            this.h.setVisibility(8);
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612c57f6", new Object[]{this});
            return;
        }
        try {
            SystemBarDecorator systemBarDecorator = new SystemBarDecorator((Activity) this.f8022a);
            Map<String, String> g = FestivalMgr.i().g();
            String str = g.get("navStyle");
            if (TextUtils.equals(g.get("isFestivalOn"), "1")) {
                if (!TextUtils.equals(str, "0") && !TextUtils.equals(str, "1")) {
                    if (TextUtils.equals(str, "2")) {
                        systemBarDecorator.enableImmersiveStatusBar(true);
                    }
                }
                systemBarDecorator.enableImmersiveStatusBar(false);
            } else if (this.d) {
                systemBarDecorator.enableImmersiveStatusBar(true);
            }
        } catch (Throwable unused) {
        }
    }
}
