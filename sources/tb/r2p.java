package tb;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.SearchDoorLayout;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.RpxConfigVM;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.util.NetWorkUtils;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDoorActivity f27063a;
    public ViewGroup b;
    public o2p c;
    public boolean d;
    public String e;
    public SearchDoorViewPool i;
    public Handler k;
    public ild l;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public zko m = null;
    public final us7 n = new us7();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorWrapper$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                r2p.a(r2p.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorWrapper$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                r2p.b(r2p.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorWrapper$3");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                r2p.this.f27063a.C3();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SearchDoorLayout f27064a;

        public d(SearchDoorLayout searchDoorLayout) {
            this.f27064a = searchDoorLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r2p.d(r2p.this).addView(this.f27064a, new FrameLayout.LayoutParams(-1, -1));
            r2p.this.K();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (r2p.e(r2p.this) != null) {
                SearchSdk.init();
                r2p.e(r2p.this).u(yak.f31939a);
            }
            z8t.d(r2p.this.f27063a.getCore());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r2p.f(r2p.this).c(vxm.b.b(snl.f28161a.f(r2p.this.f27063a).b()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                le1.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o2p c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                    r2p.j(r2p.this);
                }
            }
        }

        public h(o2p o2pVar) {
            this.c = o2pVar;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorWrapper$8");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            r2p.g(r2p.this, this.c);
            int x3 = r2p.this.f27063a.x3();
            if (x3 == 1) {
                r2p.h(r2p.this);
                if (r2p.i(r2p.this)) {
                    r2p.this.f27063a.getWindow().getDecorView().post(new a());
                } else {
                    r2p.j(r2p.this);
                }
            } else if (x3 == 2) {
                r2p.k(r2p.this);
            } else if (x3 == 3) {
                r2p.c(r2p.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                    a6p.a(r2p.this.f27063a);
                }
            }
        }

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (o4p.a2()) {
                a4p.f(r2p.this.f27063a.getApplicationContext());
            }
            if (!NetWorkUtils.isNetworkAvailable(r2p.this.f27063a)) {
                r2p.this.f27063a.runOnUiThread(new a());
            }
        }
    }

    static {
        t2o.a(815792949);
    }

    public r2p(SearchDoorActivity searchDoorActivity) {
        this.f27063a = searchDoorActivity;
    }

    public static /* synthetic */ void a(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e076e98e", new Object[]{r2pVar});
        } else {
            r2pVar.n();
        }
    }

    public static /* synthetic */ void b(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb3ecf", new Object[]{r2pVar});
        } else {
            r2pVar.o();
        }
    }

    public static /* synthetic */ void c(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf611cbd", new Object[]{r2pVar});
        } else {
            r2pVar.F();
        }
    }

    public static /* synthetic */ ViewGroup d(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4327f405", new Object[]{r2pVar});
        }
        return r2pVar.b;
    }

    public static /* synthetic */ zko e(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zko) ipChange.ipc$dispatch("243ee218", new Object[]{r2pVar});
        }
        return r2pVar.m;
    }

    public static /* synthetic */ us7 f(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (us7) ipChange.ipc$dispatch("4defec2e", new Object[]{r2pVar});
        }
        return r2pVar.n;
    }

    public static /* synthetic */ void g(r2p r2pVar, o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1389e391", new Object[]{r2pVar, o2pVar});
        } else {
            r2pVar.Q(o2pVar);
        }
    }

    public static /* synthetic */ void h(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d870e914", new Object[]{r2pVar});
        } else {
            r2pVar.I();
        }
    }

    public static /* synthetic */ boolean i(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c53e59", new Object[]{r2pVar})).booleanValue();
        }
        return r2pVar.f;
    }

    public static /* synthetic */ void j(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b199396", new Object[]{r2pVar});
        } else {
            r2pVar.G();
        }
    }

    public static /* synthetic */ void k(r2p r2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546de8d7", new Object[]{r2pVar});
        } else {
            r2pVar.H();
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("370526eb", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58aaec2f", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94810df4", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb438c9", new Object[]{this});
        } else {
            ((elo) this.l).g(null);
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b19654", new Object[]{this});
            return;
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            o2pVar.onCtxDestroyInternal();
        }
        ((elo) this.l).a();
    }

    public final void G() {
        o2p o2pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da17b51", new Object[]{this});
        } else if (this.f27063a.hasWindowFocus() && (o2pVar = this.c) != null) {
            o2pVar.p3(true);
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5125710", new Object[]{this});
            return;
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            o2pVar.onCtxPauseInternal();
        }
        ((elo) this.l).h();
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9197c901", new Object[]{this});
            return;
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            o2pVar.onCtxResumeInternal();
        }
        ((elo) this.l).l();
    }

    public void J(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
        } else if (i3 == -1 && 136 == i2 && intent != null && this.c != null) {
            String stringExtra = intent.getStringExtra("q");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.c.postEvent(fbq.a(stringExtra, ""));
            }
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488b7e93", new Object[]{this});
        }
    }

    public final void L(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bee02c", new Object[]{this, o2pVar});
        } else {
            this.f27063a.runOnUiThread(new h(o2pVar));
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        F();
        m();
    }

    public void N(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else if (!D() || !SearchDoorActivity.y3(this.f27063a.getIntent())) {
            o2p o2pVar = this.c;
            if (o2pVar != null) {
                o2pVar.j3();
            }
        } else {
            Nav.from(this.f27063a).toUri(intent.getData());
            this.f27063a.finish();
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            H();
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        I();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, SearchDoorActivity.PAGE_NAME);
        le1.a().execute(new i());
    }

    public final void Q(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b244ea", new Object[]{this, o2pVar});
            return;
        }
        this.c = o2pVar;
        o2pVar.postEvent(u1p.a());
        this.c.subscribeEvent(this.f27063a);
        TLogTracker.m(this.c.d.z());
        this.f27063a.r3(s(), 0);
    }

    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            o2pVar.p3(z);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5267a382", new Object[]{this});
            return;
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.post(new a());
        } else {
            n();
        }
        W();
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e6d105", new Object[]{this});
            return;
        }
        this.l = new elo(this.f27063a);
        boolean r = r();
        this.f = r;
        if (r && !this.f27063a.v3()) {
            this.k = le1.b();
            le1.e();
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.post(new b());
        } else {
            o();
        }
    }

    public void U(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
        } else {
            this.b = viewGroup;
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a998ec13", new Object[]{this});
            return;
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.post(new c());
        } else {
            this.f27063a.C3();
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7e2c38", new Object[]{this});
        } else {
            RpxConfigVM.Companion.l(this.f27063a);
        }
    }

    public o2p l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2p) ipChange.ipc$dispatch("6deda54d", new Object[]{this});
        }
        SearchDoorActivity searchDoorActivity = this.f27063a;
        return new o2p(searchDoorActivity, searchDoorActivity);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2338a582", new Object[]{this});
            return;
        }
        SearchDoorViewPool searchDoorViewPool = this.i;
        if (searchDoorViewPool != null) {
            searchDoorViewPool.d();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6378cbc3", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.g)) {
            vxm vxmVar = vxm.b;
            snl snlVar = snl.f28161a;
            vxmVar.b(snlVar.f(this.f27063a).b()).a("search_door_opt", this.g);
            vxmVar.b(snlVar.f(this.f27063a).b()).a("rainbow_loaded", String.valueOf(this.h));
        }
        ((elo) this.l).c();
        z();
        if (!this.f || this.f27063a.v3()) {
            SearchSdk.init();
            o2p l = l();
            l.s3();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Q(l);
            } else {
                L(l);
            }
            f1p.f();
        } else {
            o2p l2 = l();
            SearchDoorLayout searchDoorLayout = new SearchDoorLayout(this.f27063a);
            l2.w3(searchDoorLayout);
            this.f27063a.runOnUiThread(new d(searchDoorLayout));
            if (!l2.r3(this.k, this.n)) {
                l2.s3();
            }
            k8j.a((Application) this.f27063a.getApplicationContext());
            this.k.post(new e());
            this.f27063a.getWindow().getDecorView().post(new f());
            L(l2);
            m3p.INSTANCE.d(this.f27063a);
            o4p.c0();
            f1p.f();
        }
        IpChange ipChange2 = g54.$ipChange;
        l3p.INSTANCE.j();
        Handler handler = this.k;
        if (handler != null) {
            handler.post(new g());
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a31ba6", new Object[]{this})).booleanValue();
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            return o2pVar.L2();
        }
        return false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (B() && this.c != null && o4p.o1()) {
            this.c.postEvent(h0p.a());
            this.f27063a.overridePendingTransition(0, 0);
        }
        m();
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58d85670", new Object[]{this})).booleanValue();
        }
        boolean r = y4p.r();
        this.g = y4p.c();
        this.h = y4p.l();
        return r;
    }

    public View s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f27063a.getWindow().getDecorView();
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d3cc2d", new Object[]{this})).intValue();
        }
        if (this.f) {
            return R.layout.tbsearch_sf_searchdoor_immersive_opt;
        }
        return R.layout.tbsearch_sf_searchdoor_immersive;
    }

    public yko u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        yko ykoVar = yak.f31939a;
        if (ykoVar != null) {
            return ykoVar;
        }
        return this.m;
    }

    public SearchDoorContext v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorContext) ipChange.ipc$dispatch("9df95967", new Object[]{this});
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            return o2pVar.d;
        }
        return null;
    }

    public SearchDoorViewPool w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorViewPool) ipChange.ipc$dispatch("567c0283", new Object[]{this});
        }
        return this.i;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbaff8b5", new Object[]{this});
        }
        return this.e;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fa639a", new Object[]{this});
            return;
        }
        o2p o2pVar = this.c;
        if (o2pVar != null) {
            o2pVar.postEvent(h0p.a());
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52611db4", new Object[]{this})).booleanValue();
        }
        try {
            o2p o2pVar = this.c;
            if (o2pVar == null) {
                return false;
            }
            return TextUtils.equals(o2pVar.d.q(r4p.KEY_G_POP_UP), "true");
        } catch (Exception unused) {
            return false;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc58df7c", new Object[]{this});
            return;
        }
        this.n.d("viewPool");
        if (this.f) {
            if (yak.f31939a == null) {
                yak.a();
                this.m = yak.c;
            }
            this.i = new SearchDoorViewPool(new WeakReference(this.f27063a));
        }
        this.n.b("viewPool");
        ((elo) this.l).d();
        TLogTracker.s("MainSearchDoor");
        String w3 = SearchDoorActivity.w3(this.f27063a.getIntent());
        if (this.f) {
            y90.INSTANCE.m(w3);
        } else {
            SearchSdk.init();
        }
        this.n.d(r4p.KEY_TB_2024);
        if (yak.f31939a != null && TextUtils.isEmpty(w3) && Localization.n()) {
            this.d = y4p.t();
            this.e = y4p.a();
        }
        this.n.b(r4p.KEY_TB_2024);
        this.n.d("searchBarPreload");
        SearchDoorViewPool searchDoorViewPool = this.i;
        if (searchDoorViewPool != null && Build.VERSION.SDK_INT >= 28) {
            searchDoorViewPool.j(this.d);
        }
        this.n.b("searchBarPreload");
        TLogTracker.t(o4p.i2());
        if (!this.f) {
            z8t.d(this.f27063a.getCore());
            m3p.INSTANCE.d(this.f27063a);
            o4p.c0();
            if (j3p.g() != null) {
                j3p.g().f().h().e = true;
            }
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7675f6", new Object[]{this});
        } else if (!this.j.get()) {
            this.j.set(true);
            bcq.a().f(this.f27063a, "tbsearch_remote");
        }
    }
}
