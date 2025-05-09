package com.taobao.android.navigationextern;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ano;
import tb.b1q;
import tb.gkf;
import tb.ife;
import tb.jhj;
import tb.lpj;
import tb.opj;
import tb.sqs;
import tb.tqs;
import tb.ue2;
import tb.w4v;
import tb.xe2;
import tb.xpj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context m;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f9035a = new AtomicBoolean(false);
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public final lpj j = new lpj();
    public final ue2 k = new ue2();
    public final sqs l = new sqs();
    public final Handler n = new Handler(Looper.getMainLooper());
    public final NavigationExternSwitch.b o = new b();
    public final a.e p = new c();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.navigationextern.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class RunnableC0468a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9036a;

        public RunnableC0468a(int i) {
            this.f9036a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.this, this.f9036a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements NavigationExternSwitch.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(Context context, Intent intent, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("828ae0c0", new Object[]{this, context, intent, new Boolean(z), new Boolean(z2)});
            } else {
                a.b(a.this, 0);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9abdc2e4", new Object[]{this});
            } else {
                a.b(a.this, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public int a(String str, tqs tqsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ab5096d1", new Object[]{this, str, tqsVar})).intValue();
            }
            if (tqsVar == null) {
                if (ife.s().x(str)) {
                    return 1;
                }
                ife.s().z(str);
                ife.s().A(str, a.k(a.this), a.l(a.this));
                return 1;
            } else if (xe2.a(str) == -1) {
                return 8;
            } else {
                int f = ife.s().f(str, tqsVar);
                jhj.a("NavEInternal", "cacheNavigationTab ret = " + f);
                return a.m(a.this);
            }
        }

        public void b(int i, com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0591c0", new Object[]{this, new Integer(i), bVar});
            } else if (!NavigationExternSwitch.l()) {
                jhj.b("NavEInternal", " cancel cache, switch off.");
            } else if (bVar != null) {
                ife.s().g(i, bVar);
                a.j(a.this);
            } else if (ife.s().k(i) != null) {
                ife.s().y(String.valueOf(i));
                a.i(a.this, false);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("438244c3", new Object[]{this});
            } else if (!NavigationExternSwitch.l()) {
                jhj.b("NavEInternal", "cancel notifyStyleChanged, switch off.");
            } else {
                a.f(a.this).d();
                if (a.g(a.this) || a.h(a.this)) {
                    com.taobao.tao.navigation.a.C();
                    jhj.b("NavEInternal", ", notifyStyleChanged. ");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements a.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.tao.navigation.a.g
        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                a.i(a.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.navigationextern.a$e$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0469a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0469a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                a.j(a.this);
                a.m(a.this);
                a.d();
                jhj.b("NavEInternal", "refresh tab end, cost: " + (SystemClock.uptimeMillis() - uptimeMillis));
            }
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jhj.b("NavEInternal", "initAndUpdateAsync");
            long uptimeMillis = SystemClock.uptimeMillis();
            ife.s().u(a.c(a.this));
            jhj.b("NavEInternal", "initAndUpdateAsync end, cost: " + (SystemClock.uptimeMillis() - uptimeMillis));
            a.e(a.this).post(new RunnableC0469a());
        }
    }

    public static void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbd239e", new Object[0]);
            return;
        }
        String g = NavigationExternSwitch.g();
        if (g != null) {
            try {
                jhj.b("NavEInternal", "set color; color str:".concat(g));
                int parseColor = Color.parseColor(g);
                com.taobao.tao.navigation.a.P(Integer.valueOf(parseColor));
                jhj.b("NavEInternal", "set color; color int:" + parseColor);
            } catch (Exception unused) {
                jhj.b("NavEInternal", "parse color failed; color str:".concat(g));
            }
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264d94f6", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.B(i);
        }
    }

    public static /* synthetic */ void b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2df595", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.K(i);
        }
    }

    public static /* synthetic */ Context c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3de1394", new Object[]{aVar});
        }
        return aVar.m;
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad12fe7", new Object[0]);
        } else {
            F();
        }
    }

    public static /* synthetic */ Handler e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b928b668", new Object[]{aVar});
        }
        return aVar.n;
    }

    public static /* synthetic */ sqs f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sqs) ipChange.ipc$dispatch("a18951a9", new Object[]{aVar});
        }
        return aVar.l;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59520234", new Object[]{aVar})).booleanValue();
        }
        return aVar.t();
    }

    public static /* synthetic */ boolean h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa391b5", new Object[]{aVar})).booleanValue();
        }
        return aVar.r();
    }

    public static /* synthetic */ void i(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42afb7e2", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.M(z);
        }
    }

    public static /* synthetic */ void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d46b0b3", new Object[]{aVar});
        } else {
            aVar.C();
        }
    }

    public static /* synthetic */ int k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e984027", new Object[]{aVar})).intValue();
        }
        return aVar.p();
    }

    public static /* synthetic */ int l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe9cfa8", new Object[]{aVar})).intValue();
        }
        return aVar.o();
    }

    public static /* synthetic */ int m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b5f29", new Object[]{aVar})).intValue();
        }
        return aVar.n();
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35492d2", new Object[]{this});
        } else {
            ife.s().u(this.m);
        }
    }

    public final void D(List<com.taobao.tao.navigation.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd2154", new Object[]{this, list});
        } else if (!NavigationExternSwitch.i()) {
            for (int i = 0; i < list.size(); i++) {
                com.taobao.tao.navigation.b bVar = list.get(i);
                bVar.L(NavigationTabIconSourceType.DRAWABLE);
                bVar.J(xpj.DEFAULT_TAB_BAR_CONFIG.get(i));
                com.taobao.tao.navigation.a.j0(i, bVar);
            }
        }
    }

    public final void E(xpj xpjVar, com.taobao.tao.navigation.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c66870b", new Object[]{this, xpjVar, bVar});
            return;
        }
        int N = xpjVar.N();
        if (N == 0) {
            bVar.L(NavigationTabIconSourceType.DRAWABLE);
            bVar.J(new Pair(xpjVar.O(), xpjVar.L()));
        } else if (N == 1) {
            bVar.L(NavigationTabIconSourceType.DRAWABLE2);
        } else if (N == 2) {
            Drawable w = w((String) xpjVar.O());
            Drawable w2 = w((String) xpjVar.L());
            if (w2 == null || w == null) {
                bVar.L(NavigationTabIconSourceType.URL);
                bVar.J(new Pair(xpjVar.O(), xpjVar.L()));
                return;
            }
            bVar.L(NavigationTabIconSourceType.DRAWABLE2);
            bVar.a0(w);
            bVar.W(w2);
        }
    }

    public final void G(List<com.taobao.tao.navigation.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb479749", new Object[]{this, list});
        } else if (NavigationExternSwitch.o()) {
            I(list, xpj.EDLP_ELDER_HOME_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        } else {
            I(list, xpj.ELDER_HOME_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        }
    }

    public final void H(List<com.taobao.tao.navigation.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba859e2", new Object[]{this, list});
        } else if (NavigationExternSwitch.F()) {
            I(list, xpj.I18N_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        } else if (NavigationExternSwitch.t()) {
            I(list, xpj.I18N_RUSSIA_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        } else if (NavigationExternSwitch.H()) {
            I(list, xpj.I18N_THAI_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        } else if (NavigationExternSwitch.G()) {
            I(list, xpj.I18N_MALAY_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        } else {
            I(list, xpj.I18N_EN_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        }
    }

    public final void I(List<com.taobao.tao.navigation.b> list, List<Pair> list2, NavigationTabIconSourceType navigationTabIconSourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52661c2d", new Object[]{this, list, list2, navigationTabIconSourceType});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            com.taobao.tao.navigation.b bVar = list.get(i);
            bVar.L(navigationTabIconSourceType);
            bVar.J(list2.get(i));
            com.taobao.tao.navigation.a.j0(i, bVar);
        }
    }

    public final void J(List<com.taobao.tao.navigation.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20d8f0e", new Object[]{this, list});
            return;
        }
        boolean F = NavigationExternSwitch.F();
        for (int i = 0; i < list.size(); i++) {
            com.taobao.tao.navigation.b bVar = list.get(i);
            Integer num = xpj.TAB_BAR_TITLE_CONFIG.get(bVar.e());
            if (num != null) {
                String q = Localization.q(num.intValue());
                if (!TextUtils.isEmpty(q)) {
                    bVar.Y(q);
                    if (F) {
                        if (!"homePage".equals(bVar.e())) {
                            bVar.O(true);
                        }
                        bVar.P(true);
                        opj.j(true);
                    } else if (!NavigationExternSwitch.i()) {
                        opj.j(false);
                    }
                    com.taobao.tao.navigation.a.j0(i, bVar);
                }
            }
        }
    }

    public final void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dd3e25", new Object[]{this, new Integer(i)});
        } else {
            this.n.post(new RunnableC0468a(i));
        }
    }

    public void L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acc3626", new Object[]{this, context});
            return;
        }
        y(context);
        M(true);
        if (!NavigationExternSwitch.v(context)) {
            F();
        }
    }

    public final void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174e1732", new Object[]{this, new Boolean(z)});
            return;
        }
        List<xpj> v = v(z);
        if (!v.isEmpty()) {
            N(v, NavigationExternSwitch.y());
        }
    }

    public final void N(List<xpj> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a59ea6c", new Object[]{this, list, new Boolean(z)});
            return;
        }
        if (NavigationExternSwitch.A()) {
            xpj xpjVar = xpj.NEW_TB_MAIN_TAB;
            if (!list.contains(xpjVar)) {
                list.add(xpjVar);
            }
        }
        ArrayList<com.taobao.tao.navigation.b> t = com.taobao.tao.navigation.a.t();
        D(t);
        for (xpj xpjVar2 : list) {
            int S = xpjVar2.S();
            com.taobao.tao.navigation.b bVar = t.get(S);
            if (!TextUtils.equals(xpjVar2.E(), bVar.e())) {
                bVar.Q("0");
            }
            bVar.Y(xpjVar2.T());
            bVar.T(xpjVar2.U());
            bVar.F(xpjVar2.G());
            bVar.I(xpjVar2.I());
            bVar.E(xpjVar2.F());
            bVar.N(xpjVar2.V());
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", xpjVar2.R());
            bVar.U(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("pageName", xpjVar2.Q());
            hashMap2.put("controlName", xpjVar2.H());
            bVar.G(hashMap2);
            bVar.D(xpjVar2.E());
            t.set(S, bVar);
            if ((TextUtils.isEmpty(FestivalMgr.i().l("global", "tabbarImagesURL_we")) || "true".equals(b1q.g(b1q.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN)) || "ing".equals(b1q.g(b1q.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN))) && !z) {
                E(xpjVar2, bVar);
            } else if (z && !NavigationExternSwitch.i()) {
                E(xpjVar2, bVar);
            }
            com.taobao.tao.navigation.a.j0(S, bVar);
        }
        O(t);
        J(t);
        C();
        n();
        w4v.d(t);
        this.j.C();
    }

    public final void O(List<com.taobao.tao.navigation.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07df09", new Object[]{this, list});
            return;
        }
        if (NavigationExternSwitch.C()) {
            G(list);
        }
        if (NavigationExternSwitch.u()) {
            H(list);
        }
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eb906a7", new Object[]{this})).intValue();
        }
        if (!NavigationExternSwitch.m()) {
            jhj.b("NavEInternal", "applyCachedTabWithVersion cancel, switch off.");
            return 16;
        }
        List<xpj> o = ife.s().o(p(), o());
        if (o != null && !o.isEmpty()) {
            for (xpj xpjVar : o) {
                if (xpjVar == null) {
                    jhj.a("NavEInternal", "applyCachedTabWithVersion failed. config is null");
                } else {
                    int a2 = xe2.a(xpjVar.E());
                    if (a2 == -1) {
                        jhj.a("NavEInternal", "applyCachedTabWithVersion failed. index is -1 config: " + xpjVar);
                    } else {
                        com.taobao.tao.navigation.b m = com.taobao.tao.navigation.a.m(a2);
                        if (m == null) {
                            jhj.a("NavEInternal", "applyCachedTabWithVersion failed. tab is null config: " + xpjVar);
                        } else {
                            ife.e n = ife.s().n(xpjVar);
                            if (n == null) {
                                jhj.a("NavEInternal", "applyCachedTabWithVersion failed. iconInfo is null config: " + xpjVar);
                            } else {
                                m.L(NavigationTabIconSourceType.LOCALCACHEDDRAWABLE);
                                m.W(n.f21289a);
                                m.a0(n.b);
                                m.Y(xpjVar.T());
                                m.K(xpjVar.J());
                                com.taobao.tao.navigation.a.s0(a2, m);
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89024420", new Object[]{this})).intValue();
        }
        return this.l.a();
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d508db60", new Object[]{this})).intValue();
        }
        return this.l.b();
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f18c56", new Object[]{this})).booleanValue();
        }
        this.l.d();
        boolean p = NavigationExternSwitch.p();
        if (p == this.i) {
            return false;
        }
        this.i = p;
        return true;
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cc6bf94", new Object[]{this})).booleanValue();
        }
        boolean i = NavigationExternSwitch.i();
        if (i == this.h) {
            return false;
        }
        this.h = i;
        jhj.b("NavEInternal", "checkNeedUpdate hasFestival = " + this.h);
        return true;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eda3cba", new Object[]{this})).booleanValue();
        }
        if (this.d == Localization.o()) {
            return false;
        }
        this.d = Localization.o();
        jhj.b("NavEInternal", "checkNeedUpdate cntIsI18n = " + this.d);
        return true;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84179532", new Object[]{this})).booleanValue();
        }
        if (this.e != NavigationExternSwitch.A()) {
            this.e = NavigationExternSwitch.A();
            jhj.b("NavEInternal", "checkNeedUpdate cntIsNewTBMain = " + this.e);
            return true;
        } else if (this.b != NavigationExternSwitch.y()) {
            this.b = NavigationExternSwitch.y();
            jhj.b("NavEInternal", "checkNeedUpdate cntIsNewContent = " + this.b);
            return true;
        } else if (this.c != NavigationExternSwitch.z(this.m)) {
            this.c = NavigationExternSwitch.z(this.m);
            jhj.b("NavEInternal", "checkNeedUpdate cntIsNewDiscovery = " + this.c);
            return true;
        } else if (this.f != NavigationExternSwitch.C()) {
            this.f = NavigationExternSwitch.C();
            jhj.b("NavEInternal", "checkNeedUpdate cntIsElder = " + this.f);
            return true;
        } else if (this.g == NavigationExternSwitch.o()) {
            return false;
        } else {
            this.g = NavigationExternSwitch.o();
            jhj.b("NavEInternal", "checkNeedUpdate cntIsEDLP = " + this.g);
            return true;
        }
    }

    public final List<xpj> u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4b1a73bc", new Object[]{this, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        if (!LocationHelper.d(this.m)) {
            if (z) {
                this.b = true;
            }
            arrayList.add(xpj.DefaultGuangGuangTab);
        } else if (NavigationExternSwitch.z(this.m)) {
            if (z) {
                this.c = true;
            }
            if (NavigationExternSwitch.B()) {
                arrayList.add(xpj.CATEGORY_TAB_CH);
            } else {
                arrayList.add(xpj.DISCOVERY_TAB);
            }
        } else {
            if (z) {
                this.c = false;
            }
            arrayList.add(xpj.DefaultGuangGuangTab);
        }
        if (NavigationExternSwitch.A()) {
            if (z) {
                this.e = true;
            }
            arrayList.add(xpj.NEW_TB_MAIN_TAB);
        } else {
            if (z) {
                this.e = false;
            }
            arrayList.add(xpj.DEFAULT_TB_MAIN_TAB);
        }
        if (z) {
            this.f = NavigationExternSwitch.C();
        }
        if (NavigationExternSwitch.o()) {
            arrayList.add(xpj.EDLP_EDLP_TAB);
            this.g = true;
        } else {
            arrayList.add(xpj.DefaultMessageTab);
            this.g = false;
        }
        return arrayList;
    }

    public final List<xpj> v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ba1c6935", new Object[]{this, new Boolean(z)});
        }
        if (Localization.o()) {
            return x();
        }
        return u(z);
    }

    public Drawable w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("dfa06df5", new Object[]{this, str});
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return null;
        }
        return new BitmapDrawable(decodeFile);
    }

    public final List<xpj> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cde31783", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(xpj.CATEGORY_TAB_EN);
        arrayList.add(xpj.SEARCH_TAB);
        return arrayList;
    }

    public final void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.f9035a.compareAndSet(false, true)) {
            this.m = context;
            ano.a();
            NavigationExternSwitch.j();
            if (NavigationExternSwitch.v(context)) {
                z();
            } else {
                A();
            }
            NavigationExternSwitch.E(context, this.o);
            NavigationExternSwitch.D(this.o);
            com.taobao.tao.navigation.a.H(new d());
            com.taobao.tao.navigation.a.W(this.p);
            this.j.v(context);
            this.j.C();
            gkf.b(this.j);
            this.k.c();
            this.l.c();
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebd1493", new Object[]{this});
        } else {
            Coordinator.execute(new e());
        }
    }

    public final void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e550a1a7", new Object[]{this, new Integer(i)});
            return;
        }
        boolean t = t();
        boolean s = s();
        this.l.e();
        if (t || s) {
            M(true);
            com.taobao.tao.navigation.a.C();
            jhj.b("NavEInternal", "notifyStyleChanged");
            P(i);
        } else if (q()) {
            com.taobao.tao.navigation.a.C();
            jhj.b("NavEInternal", "notifyStyleChanged");
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2269d081", new Object[]{this});
        } else if (!NavigationExternSwitch.l()) {
            jhj.b("NavEInternal", "refreshGuangGuangTab cancel, switch off.");
        } else if (this.f || this.c) {
            jhj.b("NavEInternal", "refreshGuangGuangTab failed; cntIsElder: " + this.f + " cntIsNewDiscovery: " + this.c);
        } else {
            xpj k = ife.s().k(1);
            com.taobao.tao.navigation.b m = com.taobao.tao.navigation.a.m(1);
            if (m == null) {
                jhj.b("NavEInternal", "guangguang tab is null");
                return;
            }
            if (k != null) {
                if (!NavigationExternSwitch.i()) {
                    ife.e l = ife.s().l(k);
                    if (l == null || l.f21289a == null || l.b == null) {
                        jhj.b("NavEInternal", "iconInfo is null");
                    } else {
                        m.L(NavigationTabIconSourceType.LOCALCACHEDDRAWABLE);
                        m.W(l.f21289a);
                        m.a0(l.b);
                        jhj.b("NavEInternal", "setDrawable");
                    }
                }
                m.Y(k.T());
                jhj.b("NavEInternal", "guangguang TabConfig tab is not null");
            }
            com.taobao.tao.navigation.a.s0(1, m);
        }
    }

    public static void P(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b379208", new Object[]{new Integer(i)});
            return;
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o == null) {
            jhj.b("NavEInternal", "updateTabHost tabHost is null.");
            return;
        }
        int currentTab = o.getCurrentTab();
        String b2 = xe2.b(currentTab);
        o.clearAllTabsWithoutFramgent(1);
        o.updateTabHost();
        String b3 = xe2.b(currentTab);
        if (!TextUtils.isEmpty(b2) && TextUtils.equals(b2, b3)) {
            i2 = currentTab;
        }
        o.setCurrentTab(i2);
        opj.e(i);
    }
}
