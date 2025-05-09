package com.alibaba.triver.triver_shop.newShop.data;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.x0;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.AllItemsContentRender;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.downgrade.AliHADowngradeSDKExtension;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.android.agoo.common.AgooConstants;
import tb.a07;
import tb.aop;
import tb.aqp;
import tb.arp;
import tb.bau;
import tb.bqp;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.eop;
import tb.g1a;
import tb.h8s;
import tb.i04;
import tb.jpu;
import tb.jwk;
import tb.kew;
import tb.khu;
import tb.mop;
import tb.njg;
import tb.npp;
import tb.pps;
import tb.r54;
import tb.rg0;
import tb.rsq;
import tb.spp;
import tb.ssq;
import tb.t2o;
import tb.tnp;
import tb.tsq;
import tb.ups;
import tb.v4s;
import tb.vpd;
import tb.vxm;
import tb.w1a;
import tb.why;
import tb.wsq;
import tb.xhv;
import tb.yh6;
import tb.yz3;
import tb.znp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopDataParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean n0 = true;
    public d1a<Integer> A;
    public d1a<String> B;
    public g1a<? super Bundle, xhv> C;
    public String D;
    public String E;
    public JSONObject F;
    public Bundle G;
    public final JSONObject J;
    public final String K;
    public final String L;
    public final String M;
    public int N;
    public int O;
    public final int P;
    public final int Q;
    public JSONArray R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public vpd Z;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f3077a;
    public final arp a0;
    public final Uri b;
    public final boolean b0;
    public tnp.b c0;
    public Context d;
    public boolean d0;
    public boolean e0;
    public long f;
    public final boolean f0;
    public boolean g;
    public final bqp g0;
    public ShopWrapWebView h;
    public final ShopViewContext h0;
    public final f i0;
    public boolean j;
    public final g j0;
    public final JSONObject k;
    public final d k0;
    public final JSONObject l;
    public final b l0;
    public final JSONObject m;
    public final e m0;
    public JSONObject n;
    public JSONObject o;
    public JSONArray p;
    public JSONObject q;
    public JSONObject r;
    public JSONArray s;
    public final String t;
    public final String u;
    public JSONObject v;
    public HashMap<String, String> w;
    public ShopView.c z;
    public final h c = h.Companion.a();
    public final HashSet<ComponentCallbacks2> e = new HashSet<>();
    public boolean i = true;
    public final ConcurrentHashMap<String, c> x = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> y = new ConcurrentHashMap<>();
    public final JSONArray H = new JSONArray();
    public final JSONObject I = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ShopViewContext {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public g1a<? super Boolean, xhv> f3078a;
        public g1a<? super String, xhv> b;
        public final boolean c;
        public final boolean d;
        public ViewGroup e;
        public View.OnClickListener f;
        public d1a<xhv> g;
        public d1a<xhv> h;
        public g1a<? super Boolean, xhv> i;
        public g1a<? super Boolean, Boolean> j;
        public w1a<? super Boolean, ? super Integer, ? super Integer, xhv> k;
        public final njg l;
        public g1a<? super Boolean, Boolean> m;
        public g1a<? super String, xhv> n;
        public d1a<Boolean> o;
        public g1a<? super String, ? extends JSONObject> p;
        public d1a<Boolean> q;
        public d1a<xhv> r;
        public g1a<? super Integer, xhv> s;

        static {
            t2o.a(766509459);
        }

        public ShopViewContext(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
            aqp.a aVar = aqp.Companion;
            this.c = aVar.Z();
            this.d = aVar.F();
            this.l = kotlin.a.b(new ShopDataParser$ShopViewContext$allItemCountIconContainer$2(shopDataParser));
            new HashSet();
        }

        public final void A(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebc4e436", new Object[]{this, viewGroup});
            } else {
                this.e = viewGroup;
            }
        }

        public final g1a<String, JSONObject> B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("b5aad194", new Object[]{this});
            }
            return this.p;
        }

        public final void C(g1a<? super String, ? extends JSONObject> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fd3349a", new Object[]{this, g1aVar});
            } else {
                this.p = g1aVar;
            }
        }

        public final d1a<Boolean> D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d1a) ipChange.ipc$dispatch("4b5834a", new Object[]{this});
            }
            return this.q;
        }

        public final d1a<xhv> E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d1a) ipChange.ipc$dispatch("ce1e8885", new Object[]{this});
            }
            return this.r;
        }

        public final g1a<Integer, xhv> F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("7032616d", new Object[]{this});
            }
            return this.s;
        }

        public final void G(d1a<Boolean> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("419e776e", new Object[]{this, d1aVar});
            } else {
                this.q = d1aVar;
            }
        }

        public final void H(d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4638cd93", new Object[]{this, d1aVar});
            } else {
                this.r = d1aVar;
            }
        }

        public final void I(g1a<? super Integer, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6703e749", new Object[]{this, g1aVar});
            } else {
                this.s = g1aVar;
            }
        }

        public final FrameLayout a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("1945951b", new Object[]{this});
            }
            return (FrameLayout) this.l.getValue();
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1839aa99", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a165621", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public final d1a<Boolean> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d1a) ipChange.ipc$dispatch("dce54d", new Object[]{this});
            }
            return this.o;
        }

        public final View.OnClickListener e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.OnClickListener) ipChange.ipc$dispatch("67aca423", new Object[]{this});
            }
            return this.f;
        }

        public final g1a<String, xhv> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("cb6ccd43", new Object[]{this});
            }
            return this.b;
        }

        public final d1a<xhv> g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d1a) ipChange.ipc$dispatch("fbc4c822", new Object[]{this});
            }
            return this.g;
        }

        public final d1a<xhv> h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d1a) ipChange.ipc$dispatch("9f014034", new Object[]{this});
            }
            return this.h;
        }

        public final g1a<Boolean, xhv> i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("43268faa", new Object[]{this});
            }
            return this.i;
        }

        public final g1a<Boolean, Boolean> j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("b02ef74d", new Object[]{this});
            }
            return this.m;
        }

        public final w1a<Boolean, Integer, Integer, xhv> k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w1a) ipChange.ipc$dispatch("500bd029", new Object[]{this});
            }
            return this.k;
        }

        public final g1a<Boolean, Boolean> l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("fe03bc99", new Object[]{this});
            }
            return this.j;
        }

        public final g1a<Boolean, xhv> m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("94244680", new Object[]{this});
            }
            return this.f3078a;
        }

        public final g1a<String, xhv> n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("f76511bc", new Object[]{this});
            }
            return this.n;
        }

        public final ViewGroup o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("a7a8832", new Object[]{this});
            }
            return this.e;
        }

        public final void p(d1a<Boolean> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dac7a63", new Object[]{this, d1aVar});
            } else {
                this.o = d1aVar;
            }
        }

        public final void q(View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("354da0cb", new Object[]{this, onClickListener});
            } else {
                this.f = onClickListener;
            }
        }

        public final void r(g1a<? super String, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda2e2cb", new Object[]{this, g1aVar});
            } else {
                this.b = g1aVar;
            }
        }

        public final void s(d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d849d32e", new Object[]{this, d1aVar});
            } else {
                this.g = d1aVar;
            }
        }

        public final void t(d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e97d31c4", new Object[]{this, d1aVar});
            } else {
                this.h = d1aVar;
            }
        }

        public final void u(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f02b26ac", new Object[]{this, g1aVar});
            } else {
                this.i = g1aVar;
            }
        }

        public final void v(g1a<? super Boolean, Boolean> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61042e01", new Object[]{this, g1aVar});
            } else {
                this.m = g1aVar;
            }
        }

        public final void w(w1a<? super Boolean, ? super Integer, ? super Integer, xhv> w1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb678ae1", new Object[]{this, w1aVar});
            } else {
                this.k = w1aVar;
            }
        }

        public final void x(g1a<? super Boolean, Boolean> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cd71735", new Object[]{this, g1aVar});
            } else {
                this.j = g1aVar;
            }
        }

        public final void y(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1ddfd96", new Object[]{this, g1aVar});
            } else {
                this.f3078a = g1aVar;
            }
        }

        public final void z(g1a<? super String, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("682a4c72", new Object[]{this, g1aVar});
            } else {
                this.n = g1aVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509450);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70da20ee", new Object[]{this})).booleanValue();
            }
            return ShopDataParser.c();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public g1a<? super Boolean, xhv> f3079a;
        public g1a<? super Boolean, xhv> b;
        public g1a<? super Boolean, xhv> c;
        public g1a<? super Boolean, xhv> d;
        public g1a<? super Boolean, xhv> e;
        public d1a<xhv> f;

        static {
            t2o.a(766509451);
        }

        public b(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
        }

        public final d1a<xhv> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d1a) ipChange.ipc$dispatch("47324147", new Object[]{this});
            }
            return this.f;
        }

        public final g1a<Boolean, xhv> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("5a121d09", new Object[]{this});
            }
            return this.b;
        }

        public final g1a<Boolean, xhv> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("5139949e", new Object[]{this});
            }
            return this.e;
        }

        public final g1a<Boolean, xhv> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("c091c06d", new Object[]{this});
            }
            return this.d;
        }

        public final g1a<Boolean, xhv> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("f289243b", new Object[]{this});
            }
            return this.f3079a;
        }

        public final g1a<Boolean, xhv> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1a) ipChange.ipc$dispatch("97842ab8", new Object[]{this});
            }
            return this.c;
        }

        public final void g(d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("176f83a9", new Object[]{this, d1aVar});
            } else {
                this.f = d1aVar;
            }
        }

        public final void h(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9088602d", new Object[]{this, g1aVar});
            } else {
                this.b = g1aVar;
            }
        }

        public final void i(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77eece38", new Object[]{this, g1aVar});
            } else {
                this.e = g1aVar;
            }
        }

        public final void j(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fd2949", new Object[]{this, g1aVar});
            } else {
                this.d = g1aVar;
            }
        }

        public final void k(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2c555d3", new Object[]{this, g1aVar});
            } else {
                this.f3079a = g1aVar;
            }
        }

        public final void l(g1a<? super Boolean, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe5ecbf6", new Object[]{this, g1aVar});
            } else {
                this.c = g1aVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class c implements jwk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public jwk.a f3080a;
        public boolean b;
        public String c = "";
        public final /* synthetic */ ShopDataParser d;

        static {
            t2o.a(766509452);
            t2o.a(766510478);
        }

        public c(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
            this.d = shopDataParser;
        }

        @Override // tb.jwk
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da2b03ee", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        @Override // tb.jwk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9daca77a", new Object[]{this});
                return;
            }
            g1a<String, xhv> f = this.d.m1().f();
            if (f != null) {
                f.invoke(this.c);
            }
        }

        @Override // tb.jwk
        public void c(jwk.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc4094a4", new Object[]{this, aVar});
            } else {
                this.f3080a = aVar;
            }
        }

        @Override // tb.jwk
        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b0f86ac", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public final jwk.a e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jwk.a) ipChange.ipc$dispatch("dc2bf8e9", new Object[]{this});
            }
            return this.f3080a;
        }

        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89cfad0f", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.c = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AllItemsContentRender f3081a;

        static {
            t2o.a(766509453);
        }

        public d(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
        }

        public final AllItemsContentRender a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AllItemsContentRender) ipChange.ipc$dispatch("59b03f4b", new Object[]{this});
            }
            return this.f3081a;
        }

        public final void b(AllItemsContentRender allItemsContentRender) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5bea9c5", new Object[]{this, allItemsContentRender});
            } else {
                this.f3081a = allItemsContentRender;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3083a = true;
        public boolean b = true;
        public boolean c = true;
        public boolean d;
        public boolean e;
        public boolean f;
        public final /* synthetic */ ShopDataParser g;

        static {
            t2o.a(766509455);
        }

        public f(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
            this.g = shopDataParser;
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ab3e4a", new Object[]{this})).booleanValue();
            }
            return this.f;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e143a272", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8dbf4bf7", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aeacb6a9", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("af7e1ab9", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2efaaa79", new Object[]{this})).booleanValue();
            }
            return this.f3083a;
        }

        public final void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
                return;
            }
            this.c = ckf.b(this.g.m2("isHitTBMuteSetting"), "true");
            this.f3083a = ckf.b(this.g.m2("vibrateWhenSwitchTab"), "true");
            this.b = ckf.b(this.g.m2("hideBottomBarWhenSlide"), "true");
            this.d = ckf.b(this.g.m2("reinforceSearchBar"), "true");
            this.e = ckf.b(this.g.m2("tabLayout"), "noFullWidthTopBar");
            this.f = ckf.b(this.g.m2("tabLayout"), "hiddenBottomBar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3084a;
        public boolean b;

        static {
            t2o.a(766509456);
        }

        public g(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
            boolean Q2 = shopDataParser.Q2();
            boolean z = true;
            this.f3084a = Q2 ? ShopExtKt.y() : true;
            this.b = Q2 ? ShopExtKt.r() : z;
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("353a0078", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed71f89b", new Object[]{this})).booleanValue();
            }
            return this.f3084a;
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c04b8054", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public final void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b20fc29", new Object[]{this, new Boolean(z)});
            } else {
                this.f3084a = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3085a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(766509458);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final h a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (h) ipChange.ipc$dispatch("8d83c5b3", new Object[]{this});
                }
                return new h(null);
            }

            public a() {
            }
        }

        static {
            t2o.a(766509457);
        }

        public /* synthetic */ h(a07 a07Var) {
            this();
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c897733", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d92d007", new Object[]{this})).booleanValue();
            }
            return this.g;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4d18803b", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("321e4e96", new Object[]{this})).booleanValue();
            }
            return this.h;
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6553e5e7", new Object[]{this})).booleanValue();
            }
            return this.f;
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b2b67202", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e9a9da6", new Object[]{this})).booleanValue();
            }
            return this.f3085a;
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fc93f44", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4280789c", new Object[]{this})).booleanValue();
            }
            return this.i;
        }

        public h() {
            aqp.a aVar = aqp.Companion;
            this.f3085a = aVar.R0();
            this.b = aVar.S0();
            this.c = aVar.k();
            this.d = aVar.K();
            this.e = aVar.U();
            this.f = aVar.T();
            this.g = aVar.o0();
            this.h = aVar.b1();
            this.i = aVar.Z0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements BridgeCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<String> f3086a;

        public i(Ref$ObjectRef<String> ref$ObjectRef) {
            this.f3086a = ref$ObjectRef;
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendBridgeResponse(BridgeResponse bridgeResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
            }
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendJSONResponse(JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
            }
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void sendJSONResponse(com.alibaba.fastjson.JSONObject r5) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.newShop.data.ShopDataParser.i.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0015
                java.lang.String r1 = "3456c918"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r4
                r3 = 1
                r2[r3] = r5
                r0.ipc$dispatch(r1, r2)
                return
            L_0x0015:
                if (r5 != 0) goto L_0x0018
                goto L_0x002f
            L_0x0018:
                java.lang.String r0 = "param"
                com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r0)
                if (r5 != 0) goto L_0x0022
                goto L_0x002f
            L_0x0022:
                java.lang.String r0 = "downgradeLevel"
                java.lang.String r5 = r5.getString(r0)
                if (r5 != 0) goto L_0x002b
                goto L_0x002f
            L_0x002b:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r0 = r4.f3086a
                r0.element = r5
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.data.ShopDataParser.i.sendJSONResponse(com.alibaba.fastjson.JSONObject):void");
        }
    }

    static {
        t2o.a(766509449);
    }

    public ShopDataParser(JSONObject jSONObject, Uri uri) {
        JSONObject jSONObject2;
        ckf.g(jSONObject, "shopFetchData");
        this.f3077a = jSONObject;
        this.b = uri;
        boolean z = true;
        JSONObject jSONObject3 = new JSONObject();
        this.J = jSONObject3;
        String str = null;
        this.K = uri == null ? null : uri.getQueryParameter(ShopRenderActivity.SHOP_NAVI);
        this.L = uri == null ? null : uri.getQueryParameter("weexShopTab");
        this.M = uri == null ? null : uri.getQueryParameter("weexShopSubTab");
        this.a0 = new arp(this);
        aqp.a aVar = aqp.Companion;
        this.b0 = aVar.m0();
        this.d0 = aVar.z();
        this.f0 = true;
        this.g0 = new bqp();
        this.h0 = new ShopViewContext(this);
        f fVar = new f(this);
        this.i0 = fVar;
        this.k0 = new d(this);
        JSONObject jSONObject4 = jSONObject.getJSONObject("hierarchy");
        String string = jSONObject4 == null ? null : jSONObject4.getString("root");
        JSONObject jSONObject5 = jSONObject.getJSONObject("hierarchy");
        this.k = jSONObject5 == null ? null : jSONObject5.getJSONObject("structure");
        JSONObject jSONObject6 = jSONObject.getJSONObject("components");
        this.l = jSONObject6;
        JSONObject jSONObject7 = (jSONObject6 == null || (jSONObject2 = jSONObject6.getJSONObject(string)) == null) ? null : jSONObject2.getJSONObject("payload");
        this.m = jSONObject7;
        if (string != null) {
            U2(string);
        }
        if (uri != null) {
            this.u = uri.getQueryParameter("shopId");
            this.t = uri.getQueryParameter("sellerId");
            M2(uri.getQueryParameter("subscribe_bizdata"));
        }
        JSONObject jSONObject8 = this.n;
        if (jSONObject8 != null) {
            jSONObject8.getJSONObject("liveInfo2");
        }
        v0();
        Pair<Integer, Integer> e0 = e0();
        int intValue = e0.getFirst().intValue();
        this.P = intValue;
        int intValue2 = e0.getSecond().intValue();
        this.Q = intValue2;
        spp.b(S(intValue, intValue2));
        jSONObject3.put((JSONObject) mop.KEY_SHOP_FETCH, jSONObject.toJSONString());
        jSONObject3.put((JSONObject) "fetchDowngradeConfig", String.valueOf(aVar.f()));
        boolean b2 = ckf.b(jSONObject7 == null ? null : jSONObject7.getString("enableShopAsyncBridge"), "true");
        boolean X = aVar.X();
        z = (!b2 || !X) ? false : z;
        this.f0 = z;
        npp.a aVar2 = npp.Companion;
        aVar2.b("shop async api init status : routeConfig : " + b2 + " , orangeConfig : " + X + ", final status : " + z);
        Y2("enableAsyncApi", Boolean.valueOf(z));
        String string2 = jSONObject7 == null ? null : jSONObject7.getString("recommendPage");
        if (string2 == null) {
            JSONObject jSONObject9 = this.n;
            string2 = jSONObject9 == null ? null : jSONObject9.getString("recommendPage");
        }
        String string3 = jSONObject7 == null ? null : jSONObject7.getString("index2PageType");
        if (string3 == null) {
            JSONObject jSONObject10 = this.n;
            if (jSONObject10 != null) {
                str = jSONObject10.getString("index2PageType");
            }
        } else {
            str = string3;
        }
        Y2("recommendPage", string2);
        Y2("index2PageType", str);
        fVar.g();
        this.j0 = new g(this);
        F1();
        this.l0 = new b(this);
        this.m0 = new e(this);
    }

    public static final /* synthetic */ HashSet a(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("cee3f1e5", new Object[]{shopDataParser});
        }
        return shopDataParser.e;
    }

    public static final /* synthetic */ Context b(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b8794114", new Object[]{shopDataParser});
        }
        return shopDataParser.d;
    }

    public static final /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b31612", new Object[0])).booleanValue();
        }
        return n0;
    }

    public static final /* synthetic */ JSONObject d(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27bb1559", new Object[]{shopDataParser});
        }
        return shopDataParser.m;
    }

    public static final /* synthetic */ JSONArray e(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8e0bfa64", new Object[]{shopDataParser});
        }
        return shopDataParser.s;
    }

    public static /* synthetic */ void n(ShopDataParser shopDataParser, String str, Object obj, boolean z, int i2, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd66895", new Object[]{shopDataParser, str, obj, new Boolean(z), new Integer(i2), obj2});
            return;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        shopDataParser.m(str, obj, z);
    }

    public final JSONArray A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fc12f46a", new Object[]{this});
        }
        return T2();
    }

    public final Bundle A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("a8f424e2", new Object[]{this});
        }
        return this.G;
    }

    public final boolean A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b85d26c", new Object[]{this})).booleanValue();
        }
        return S2();
    }

    public final void A2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d253c38", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final String B(int i2) {
        JSONObject g2;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6aa0950", new Object[]{this, new Integer(i2)});
        }
        JSONArray jSONArray = this.p;
        return (jSONArray == null || (g2 = brf.g(jSONArray, i2)) == null || (jSONObject = g2.getJSONObject("payload")) == null || (string = jSONObject.getString("utArg1")) == null) ? "" : string;
    }

    public final boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3238ea9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void B2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4313a4b2", new Object[]{this, new Integer(i2)});
        } else {
            this.X = i2;
        }
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3158c2b", new Object[]{this})).intValue();
        }
        return this.O;
    }

    public final jwk C0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwk) ipChange.ipc$dispatch("9edfe0ec", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, c> concurrentHashMap = this.x;
        c cVar = new c(this);
        cVar.f(str);
        concurrentHashMap.put(str, cVar);
        return this.x.get(str);
    }

    public final void C2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261a6c64", new Object[]{this, new Integer(i2)});
        } else {
            this.Y = i2;
        }
    }

    public final String D(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64715c05", new Object[]{this, new Integer(i2)});
        }
        JSONObject h2 = h();
        JSONArray jSONArray = new JSONArray();
        Object obj = h2.get("tabData");
        JSONArray jSONArray2 = jSONArray;
        if (obj instanceof JSONArray) {
            jSONArray2 = obj;
        }
        JSONObject g2 = brf.g((JSONArray) jSONArray2, i2);
        String str = "";
        if (g2 == null) {
            return str;
        }
        Object obj2 = g2.get("name");
        String str2 = str;
        if (obj2 instanceof String) {
            str2 = obj2;
        }
        return (String) str2;
    }

    public final int D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ad15b1f", new Object[]{this})).intValue();
        }
        ShopView.c cVar = this.z;
        if (cVar == null) {
            return 0;
        }
        return cVar.a();
    }

    public final void D2(d1a<String> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a862b2", new Object[]{this, d1aVar});
        } else {
            this.B = d1aVar;
        }
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63884045", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("brandFlagshipShopBackgroundPicJumpUrl");
    }

    public final Object E0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b3ff9eff", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return this.y.get(str);
    }

    public final JSONObject E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7ef168cc", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "shopInfo", (String) this.m);
        jSONObject.put((JSONObject) "navigatorData", (String) this.o);
        return jSONObject;
    }

    public final void E2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c1513", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fe0e077", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("brandFlagshipShopBackgroundPicUrl");
    }

    public final JSONObject F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f44f741b", new Object[]{this, str});
        }
        Object E0 = E0(str);
        if (E0 == null) {
            return null;
        }
        if (E0 instanceof JSONObject) {
            return (JSONObject) E0;
        }
        if (E0 instanceof String) {
            return brf.k((String) E0);
        }
        return null;
    }

    public final void F2(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7391eaea", new Object[]{this, bundle});
        } else {
            this.G = bundle;
        }
    }

    public final String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e734b2f6", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        String string = jSONObject == null ? null : jSONObject.getString("headerCardBackgroundVideoJumpUrl");
        if (string != null) {
            return string;
        }
        JSONObject jSONObject2 = this.n;
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getString("brandFlagshipShopBackgroundVideoJumpUrl");
    }

    public final String G0(String str) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eca53144", new Object[]{this, str});
        }
        if (str == null || (uri = this.b) == null) {
            return null;
        }
        return uri.getQueryParameter(str);
    }

    public final boolean G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("683f174", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    public final void G2(d1a<Integer> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59173ace", new Object[]{this, d1aVar});
        } else {
            this.A = d1aVar;
        }
    }

    public final String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69cc53a8", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        String string = jSONObject == null ? null : jSONObject.getString("headerCardBackgroundVideoUrl");
        if (string != null) {
            return string;
        }
        JSONObject jSONObject2 = this.n;
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getString("brandFlagshipShopBackgroundVideoUrl");
    }

    public final JSONObject H0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91bc982a", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject3 = new JSONObject();
        return (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("payload")) == null) ? jSONObject3 : jSONObject2;
    }

    public final boolean H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("facd6293", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public final void H2(ShopView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7de8c32", new Object[]{this, cVar});
        } else {
            this.z = cVar;
        }
    }

    public final vpd I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpd) ipChange.ipc$dispatch("541f097d", new Object[]{this});
        }
        return this.Z;
    }

    public final d I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("2f21824d", new Object[]{this});
        }
        return this.k0;
    }

    public final boolean I1() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfda38f1", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null || (bool = jSONObject.getBoolean("appleShopSignCustomStyle")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void I2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e87402a", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final JSONArray J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9296e1b7", new Object[]{this});
        }
        JSONObject R0 = R0();
        if (R0 == null) {
            return null;
        }
        return R0.getJSONArray("carouselFrameList");
    }

    public final JSONObject J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6fced03", new Object[]{this});
        }
        return this.f3077a;
    }

    public final void J2(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6fee94", new Object[]{this, shopWrapWebView});
        } else {
            this.h = shopWrapWebView;
        }
    }

    public final JSONArray K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b93863b9", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("childrens");
        if (jSONArray == null) {
            return new JSONArray();
        }
        return jSONArray;
    }

    public final Uri K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2e20b5d8", new Object[]{this});
        }
        return this.b;
    }

    public final boolean K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("332a9170", new Object[]{this})).booleanValue();
        }
        return ckf.b(u0(), eop.FLAG_SHIP_SHOP);
    }

    public final void K2(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4cbe87f", new Object[]{this, jSONArray});
        } else {
            this.R = jSONArray;
        }
    }

    public final JSONObject L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50fc4c9", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("offService");
    }

    public final d1a<Integer> L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("2032eb82", new Object[]{this});
        }
        return this.A;
    }

    public final boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579c48cc", new Object[]{this})).booleanValue();
        }
        return ckf.b(u0(), eop.FLAG_SHIP_SHOP_V2);
    }

    public final void L2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb39604", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public final int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c61e2dd", new Object[]{this})).intValue();
        }
        return this.V;
    }

    public final String M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b919a7a8", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("searchUrl");
    }

    public final boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57aa604d", new Object[]{this})).booleanValue();
        }
        String u0 = u0();
        if (u0 == null) {
            u0 = "";
        }
        if (!tsq.I(u0, eop.FLAG_SHIP_SHOP, false, 2, null) || !this.i0.e()) {
            return false;
        }
        return true;
    }

    public final void M2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffbe406", new Object[]{this, str});
        } else {
            this.D = str;
        }
    }

    public final String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a938b4fb", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("videoShopBackgroundPicJumpUrl");
    }

    public final String N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.t;
    }

    public final boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e660eb", new Object[]{this})).booleanValue();
        }
        return ckf.b("tmallCar", u0());
    }

    public final void N2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1b466f", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public final int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("319c8a99", new Object[]{this})).intValue();
        }
        return this.W;
    }

    public final e O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ff2c55ed", new Object[]{this});
        }
        return this.m0;
    }

    public final boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa947590", new Object[]{this})).booleanValue();
        }
        return ckf.b(u0(), eop.VIDEO_SHOP_2);
    }

    public final void O2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f293edb", new Object[]{this, jSONObject});
        } else {
            this.F = jSONObject;
        }
    }

    public final String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15442e45", new Object[]{this});
        }
        return D(this.O);
    }

    public final f P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("ce5864d", new Object[]{this});
        }
        return this.i0;
    }

    public final boolean P1(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1af1cb04", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return ckf.b("true", U(i2, i3, "fullScreen"));
    }

    public final void P2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad961a5", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    public final Context Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("859253dc", new Object[]{this});
        }
        return this.d;
    }

    public final g Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c3e12111", new Object[]{this});
        }
        return this.j0;
    }

    public final boolean Q1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca10f20d", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !this.x.containsKey(str)) {
            return true;
        }
        c cVar = this.x.get(str);
        ckf.d(cVar);
        jwk.a e2 = cVar.e();
        if (e2 == null) {
            return true;
        }
        return e2.a();
    }

    public final boolean Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebd57f57", new Object[]{this})).booleanValue();
        }
        Uri uri = this.b;
        return ckf.b(uri == null ? null : uri.getQueryParameter("source"), "taolive");
    }

    public final String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        d1a<String> d1aVar = this.B;
        if (d1aVar == null) {
            return T();
        }
        return d1aVar.invoke();
    }

    public final JSONObject R0() {
        JSONObject n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("77ad36fc", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("shopCarouselCardVO");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        if (!this.m0.u() || (n = this.m0.n()) == null) {
            return null;
        }
        return n.getJSONObject("data");
    }

    public final String S(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ee33b9c", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        return U(i2, i3, "name");
    }

    public final String S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a1477db", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("frameActivityAtmospherePicUrl");
    }

    public final String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de424e15", new Object[]{this});
        }
        return S(this.O, this.N);
    }

    public final JSONObject T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1de92b55", new Object[]{this});
        }
        return this.f3077a;
    }

    public final boolean T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27198d21", new Object[]{this})).booleanValue();
        }
        String u0 = u0();
        if (u0 == null) {
            return false;
        }
        return u0.equals("farmshop_z");
    }

    public final String U(int i2, int i3, String str) {
        JSONArray f2;
        JSONObject g2;
        String string;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12f46e5c", new Object[]{this, new Integer(i2), new Integer(i3), str});
        }
        if (str == null || (f2 = brf.f(u1(), i2)) == null || (g2 = brf.g(f2, i3)) == null || (string = g2.getString(str)) == null || (str2 = string.toString()) == null) {
            return "";
        }
        return str2;
    }

    public final boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9aa6e2", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final boolean U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1677dc3b", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        String str = null;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("relation");
        if (jSONObject2 == null) {
            JSONObject jSONObject3 = this.m;
            jSONObject2 = jSONObject3 == null ? null : jSONObject3.getJSONObject("relation");
        }
        if (jSONObject2 != null) {
            str = jSONObject2.getString("follow");
        }
        return ckf.b(str, "true");
    }

    public final String V(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7e3020d", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        return U(i2, i3, "utArg1");
    }

    public final boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bcdd293", new Object[]{this})).booleanValue();
        }
        Uri uri = this.b;
        return ckf.b(uri == null ? null : uri.getQueryParameter("shopHeaderNeedScrollMask"), "true");
    }

    public final boolean V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6805b07e", new Object[]{this})).booleanValue();
        }
        if (!this.c.c()) {
            return this.m0.q();
        }
        JSONObject jSONObject = this.m;
        String string = jSONObject == null ? null : jSONObject.getString("isLivingStatus");
        if (string != null) {
            return ckf.b(string, "true");
        }
        return this.m0.q();
    }

    public final void V2(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc318cd8", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (Object obj : jSONArray) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String string = jSONObject.getString("name");
                    Object obj2 = jSONObject.get("time");
                    ckf.f(string, "name");
                    Y2(string, obj2);
                }
            }
        }
    }

    public final JSONArray W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("30c53689", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it = u1().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                jSONArray.addAll((Collection) next);
            }
        }
        return jSONArray;
    }

    public final String W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.u;
    }

    public final void W2(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f90bc61", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.N = i2;
        this.O = i3;
    }

    public final JSONArray X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b4ea0d3d", new Object[]{this});
        }
        return this.H;
    }

    public final JSONObject X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("908d3dd4", new Object[]{this});
        }
        return this.J;
    }

    public final void X2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa22c54", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            n1().put((JSONObject) str, (String) Long.valueOf(currentTimeMillis));
            n(this, str, Long.valueOf(currentTimeMillis), false, 4, null);
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede922a2", new Object[]{this})).booleanValue();
        }
        return this.f0;
    }

    public final ShopWrapWebView Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("5dde717a", new Object[]{this});
        }
        return this.h;
    }

    public final void Y2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb4ad34", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        try {
            n1().put((JSONObject) str, (String) obj);
            n(this, str, obj, false, 4, null);
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dac24c", new Object[]{this})).booleanValue();
        }
        return this.d0;
    }

    public final JSONObject Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b16c5eab", new Object[]{this});
        }
        return this.m;
    }

    public final boolean Z1() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e46615aa", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.n;
        String str = null;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("relation")) == null)) {
            str = jSONObject.getString("newRelationStyle");
        }
        return ckf.b("true", str);
    }

    public final void Z2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc17ee5", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        try {
            if (!n1().containsKey(str)) {
                n1().put((JSONObject) str, (String) obj);
            }
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf6661ac", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final String a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d09144", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("introUrl");
    }

    public final boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85bcc91e", new Object[]{this})).booleanValue();
        }
        return this.b0;
    }

    public final boolean b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d72d9f84", new Object[]{this})).booleanValue();
        }
        return ckf.b(eop.TMALL_CAR_SHOP, u0());
    }

    public final JSONObject b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5eb151d9", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("utJO");
    }

    public final JSONObject c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("da0dc217", new Object[]{this});
        }
        JSONObject o0 = o0();
        if (o0 == null) {
            return null;
        }
        return o0.getJSONObject("endorseModuleVO");
    }

    public final boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5521d02b", new Object[]{this})).booleanValue();
        }
        return ckf.b("floatBar", this.E);
    }

    public final JSONObject c3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26c73174", new Object[]{this, str});
        }
        JSONObject b3 = b3();
        if (b3 == null) {
            return null;
        }
        return b3.getJSONObject(str);
    }

    public final int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61f384f9", new Object[]{this})).intValue();
        }
        return this.P;
    }

    public final String d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4cac022", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("shopLogo");
    }

    public final boolean d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62ea9f23", new Object[]{this})).booleanValue();
        }
        String S0 = S0();
        if (S0 != null && S0.length() > 0) {
            return true;
        }
        return false;
    }

    public final int d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a806e091", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final Pair<Integer, Integer> e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("91ca62da", new Object[]{this});
        }
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        if (R1()) {
            npp.Companion.b("directly jump to tab3");
            return pair;
        }
        String str = this.K;
        String str2 = this.L;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = this.M;
        if (str4 != null) {
            str3 = str4;
        }
        if (T2() == null) {
            return pair;
        }
        if (str != null && str.length() == 0) {
            str = this.M;
        }
        if (TextUtils.isEmpty(str)) {
            return ShopExtKt.R(str2, str3, this);
        }
        ckf.d(str);
        return ShopExtKt.Q(str, u1());
    }

    public final String e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6105d742", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("shopName");
    }

    public final boolean e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef8e7733", new Object[]{this})).booleanValue();
        }
        return ckf.b("redDot", this.E);
    }

    public final boolean e3(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cecf345", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return ckf.b("true", U(i2, i3, "fixedShopHead"));
    }

    public final void f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7e79c4", new Object[]{this, str, obj});
        } else if (str != null && obj != null) {
            this.y.put(str, obj);
        }
    }

    public final int f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a30c5a54", new Object[]{this})).intValue();
        }
        return this.Q;
    }

    public final JSONObject f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3088af43", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("offService");
    }

    public final boolean f2() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9ac10d4", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.n;
        String str = null;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("relation")) == null)) {
            str = jSONObject.getString("showSubscriptionPopup");
        }
        return ckf.b("true", str);
    }

    public final String f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd789c2b", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("identityType");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("910d04fa", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final String g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce8f979f", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("singleModuleRenderUrl");
    }

    public final h g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("25ab14d", new Object[]{this});
        }
        return this.c;
    }

    public final bqp h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqp) ipChange.ipc$dispatch("299fbac9", new Object[]{this});
        }
        return this.g0;
    }

    public final boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cb01912", new Object[]{this})).booleanValue();
        }
        return ckf.b(eop.VIDEO_SHOP, u0());
    }

    public final int i(int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a82e3a2", new Object[]{this, new Integer(i2)})).intValue();
        }
        JSONArray jSONArray = this.s;
        if (jSONArray == null) {
            return 0;
        }
        int size = jSONArray.size();
        if (size > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                Object obj = jSONArray.get(i3);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if ((jSONArray2.size() + i4) - 1 >= i2) {
                        break;
                    }
                    i4 += jSONArray2.size();
                }
                if (i5 >= size) {
                    break;
                }
                i3 = i5;
            }
            i3 = i4;
        }
        return i2 - i3;
    }

    public final String i0() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("203524f2", new Object[]{this});
        }
        JSONObject jSONObject2 = this.m;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("tabJO")) == null || (string = jSONObject.getString("navTextFlipColor")) == null) ? why.DEFAULT_MASK_BACKGROUND_COLOR : string;
    }

    public final String i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a573cb6", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("shopSignType");
    }

    public final boolean i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35de6fee", new Object[]{this})).booleanValue();
        }
        return ckf.b(eop.VIDEO_SHOP_2, u0());
    }

    public final int j(int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebf63ff7", new Object[]{this, new Integer(i2), new Integer(i3)})).intValue();
        }
        JSONArray jSONArray = this.s;
        if (jSONArray == null) {
            return 0;
        }
        int size = jSONArray.size();
        if (size > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i4 + 1;
                if (i4 == i2) {
                    break;
                }
                Object obj = jSONArray.get(i4);
                if (obj instanceof JSONArray) {
                    i5 += ((JSONArray) obj).size();
                }
                if (i6 >= size) {
                    break;
                }
                i4 = i6;
            }
            i4 = i5;
        }
        return i4 + i3;
    }

    public final String j0() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32fc9539", new Object[]{this});
        }
        JSONObject jSONObject2 = this.m;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("tabJO")) == null || (string = jSONObject.getString("navTextNormalColor")) == null) ? "#11192D" : string;
    }

    public final JSONArray j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("828c5493", new Object[]{this});
        }
        return this.R;
    }

    public final int k(int i2) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2acc2bf", new Object[]{this, new Integer(i2)})).intValue();
        }
        JSONArray jSONArray = this.s;
        if (jSONArray != null && (size = jSONArray.size()) > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                Object obj = jSONArray.get(i3);
                if (obj instanceof JSONArray) {
                    i4 += ((JSONArray) obj).size();
                    if (i4 - 1 >= i2) {
                        return i3;
                    }
                }
                if (i5 >= size) {
                    break;
                }
                i3 = i5;
            }
        }
        return 0;
    }

    public final String k0() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f26e982d", new Object[]{this});
        }
        JSONObject jSONObject2 = this.m;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("tabJO")) == null || (string = jSONObject.getString("navTextSelectedColor")) == null) ? "#FF6200" : string;
    }

    public final arp k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arp) ipChange.ipc$dispatch("25703a0b", new Object[]{this});
        }
        return this.a0;
    }

    public final boolean k2() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("194c4782", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.m;
        String str = null;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("mnnConfig")) == null)) {
            str = jSONObject.getString("needMnn");
        }
        return ckf.b(str, "true");
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5541c931", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        return ckf.b("true", jSONObject == null ? null : jSONObject.getString("changeSubscribe2Follow"));
    }

    public final int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("501a7258", new Object[]{this})).intValue();
        }
        return this.X;
    }

    public final HashMap<String, String> l1() {
        Map<String, String> o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3b5fdd1e", new Object[]{this});
        }
        if (this.w == null) {
            Uri uri = this.b;
            HashMap<String, String> hashMap = null;
            if (!(uri == null || (o = r54.o(uri)) == null)) {
                hashMap = r54.i(o);
            }
            this.w = hashMap;
        }
        HashMap<String, String> hashMap2 = this.w;
        if (hashMap2 == null) {
            return new HashMap<>();
        }
        return hashMap2;
    }

    public final boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cece334", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        return ckf.b("true", jSONObject == null ? null : jSONObject.getString("onlyOneLevelBar"));
    }

    public final int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c83a4fe", new Object[]{this})).intValue();
        }
        return this.Y;
    }

    public final ShopViewContext m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopViewContext) ipChange.ipc$dispatch("55fd73ed", new Object[]{this});
        }
        return this.h0;
    }

    public final String m2(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20cb62e0", new Object[]{this, str});
        }
        JSONObject jSONObject2 = this.m;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("abJO")) == null) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public final JSONObject n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec82debd", new Object[]{this});
        }
        return this.I;
    }

    public final void n2(ComponentCallbacks2 componentCallbacks2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9094b5", new Object[]{this, componentCallbacks2});
            return;
        }
        ckf.g(componentCallbacks2, "componentCallbacks2");
        this.e.add(componentCallbacks2);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8f96c1", new Object[]{this});
        } else {
            r54.C(new ShopDataParser$dispatchOnLowMem$1(this));
        }
    }

    public final JSONObject o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce7920f4", new Object[]{this});
        }
        return this.n;
    }

    public final long o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1d590a8", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public final void o2(ComponentCallbacks2 componentCallbacks2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203281b4", new Object[]{this, componentCallbacks2});
            return;
        }
        ckf.g(componentCallbacks2, "componentCallbacks2");
        this.e.remove(componentCallbacks2);
    }

    public final void p(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5510b82", new Object[]{this, new Integer(i2)});
        } else {
            r54.C(new ShopDataParser$dispatchOnTrimMem$1(this, i2));
        }
    }

    public final JSONObject p0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5f68104", new Object[]{this, new Integer(i2)});
        }
        JSONObject C1 = C1();
        JSONArray jSONArray = this.s;
        C1.put((JSONObject) "tabData", (String) (jSONArray == null ? null : brf.e(jSONArray, i2)));
        C1.put((JSONObject) mop.KEY_HEADER_EXPANDED, (String) Boolean.TRUE);
        C1.put((JSONObject) "bottomIndex", (String) Integer.valueOf(i2));
        C1.put((JSONObject) "isPromotionStyle", (String) Boolean.valueOf(d2()));
        return C1;
    }

    public final int p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return this.N;
    }

    public final Object p2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e4278de", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return this.y.remove(str);
    }

    public final boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7c3dd9", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final String q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bfdb870", new Object[]{this});
        }
        return this.D;
    }

    public final void q2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dd9c9c", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public final int r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d48121a", new Object[]{this})).intValue();
        }
        ShopView.c cVar = this.z;
        if (cVar == null) {
            return 0;
        }
        return cVar.b();
    }

    public final JSONObject r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb739c61", new Object[]{this});
        }
        return this.F;
    }

    public final void r2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec24f5d", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public final int s() {
        JSONArray f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("730eaa39", new Object[]{this})).intValue();
        }
        JSONArray jSONArray = this.s;
        if (jSONArray == null || (f2 = brf.f(jSONArray, 0)) == null) {
            return 0;
        }
        return f2.size();
    }

    public final String s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3e0bb58", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("identityCode");
    }

    public final JSONObject s1() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48cf225", new Object[]{this});
        }
        JSONObject jSONObject2 = this.n;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("nativeModuleRenderInfo")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("industryBar3");
    }

    public final void s2(tnp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b23705f", new Object[]{this, bVar});
        } else {
            this.c0 = bVar;
        }
    }

    public final tnp.b t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnp.b) ipChange.ipc$dispatch("afd57b55", new Object[]{this});
        }
        return this.c0;
    }

    public final JSONArray t0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ad2cef8a", new Object[]{this, new Integer(i2)});
        }
        return brf.f(u1(), i2);
    }

    public final ups t1(int i2, int i3) {
        ups a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("1cb768b1", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        try {
            a2 = new pps(u1().getJSONArray(i2), this, i2).a(i3);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (a2 != null) {
            return a2;
        }
        Result.m1108constructorimpl(null);
        return null;
    }

    public final void t2(g1a<? super Bundle, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fce2b8", new Object[]{this, g1aVar});
        } else {
            this.C = g1aVar;
        }
    }

    public final String u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c818eb5", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        String string = jSONObject == null ? null : jSONObject.getString("industryShop");
        if (string == null) {
            JSONObject jSONObject2 = this.m;
            string = jSONObject2 == null ? null : jSONObject2.getString("industryShop");
            if (string == null) {
                Uri uri = this.b;
                if (uri == null) {
                    return null;
                }
                return uri.getQueryParameter("industryShop");
            }
        }
        return string;
    }

    public final JSONArray u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ba8d86ae", new Object[]{this});
        }
        T2();
        JSONArray jSONArray = this.s;
        if (jSONArray == null) {
            return new JSONArray();
        }
        ckf.d(jSONArray);
        return jSONArray;
    }

    public final void u2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e2ce3a", new Object[]{this, new Boolean(z)});
        } else {
            this.e0 = z;
        }
    }

    public final g1a<Bundle, xhv> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("9856c1b6", new Object[]{this});
        }
        return this.C;
    }

    public final void v2(vpd vpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80624b", new Object[]{this, vpdVar});
        } else {
            this.Z = vpdVar;
        }
    }

    public final JSONArray w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f222e063", new Object[]{this});
        }
        return this.p;
    }

    public final b w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e29c1a0d", new Object[]{this});
        }
        return this.l0;
    }

    public final boolean w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9a1707", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public final void w2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a745cd", new Object[]{this, new Integer(i2)});
        } else {
            this.V = i2;
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f16e16a", new Object[]{this})).booleanValue();
        }
        return this.e0;
    }

    public final String x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24af9c4b", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("loftActivityAtmospherePicUrl");
    }

    public final String x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f75b0feb", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("videoShopBackgroundPicUrl");
    }

    public final void x2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3438d929", new Object[]{this, new Integer(i2)});
        } else {
            this.W = i2;
        }
    }

    public final boolean y() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72a52a09", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null || (bool = jSONObject.getBoolean("appleCustomOffService")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final JSONObject y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f248b87c", new Object[]{this});
        }
        return this.q;
    }

    public final String y1() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c18afa83", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        return (jSONObject == null || (string = jSONObject.getString("wangWangLink")) == null) ? "" : string;
    }

    public final void y2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dafcd8", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        this.d = context;
    }

    public final String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a819651", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("atmosphereTabBgPic");
    }

    public final JSONObject z0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a991fd00", new Object[]{this});
        }
        JSONObject jSONObject2 = this.m;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("mnnConfig")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("strategyConfig");
    }

    public final void z2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a075798", new Object[]{this, new Boolean(z)});
        } else {
            this.d0 = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f3082a = kew.v(96);
        public int b;
        public final /* synthetic */ ShopDataParser c;

        static {
            t2o.a(766509454);
        }

        public e(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "this$0");
            this.c = shopDataParser;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d67c1e5e", new Object[]{this})).booleanValue();
            }
            JSONObject d = ShopDataParser.d(this.c);
            return ckf.b(d == null ? null : d.getString("showMiniLiveWindow"), "true");
        }

        public final znp c() {
            String str;
            int i;
            float f;
            float f2;
            String string;
            Float l;
            String string2;
            Float l2;
            String string3;
            Integer m;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (znp) ipChange.ipc$dispatch("b6b60e65", new Object[]{this});
            }
            JSONObject o0 = this.c.o0();
            String str2 = null;
            if (o0 == null) {
                str = null;
            } else {
                str = o0.getString("backgroundMainColor");
            }
            JSONObject o02 = this.c.o0();
            if (o02 != null) {
                str2 = o02.getString(RVStartParams.KEY_BACKGROUND_IMAGE_URL);
            }
            JSONObject o03 = this.c.o0();
            if (o03 == null || (string3 = o03.getString("backgroundImageHeight")) == null || (m = ssq.m(string3)) == null) {
                i = 0;
            } else {
                i = m.intValue();
            }
            JSONObject o04 = this.c.o0();
            if (o04 == null || (string2 = o04.getString("backgroundMaskTransparency")) == null || (l2 = rsq.l(string2)) == null) {
                f = 0.5f;
            } else {
                f = l2.floatValue();
            }
            JSONObject o05 = this.c.o0();
            if (o05 == null || (string = o05.getString("backgroundMaskProportion")) == null || (l = rsq.l(string)) == null) {
                f2 = 0.66f;
            } else {
                f2 = l.floatValue();
            }
            return new znp(i, str2, str, f, f2);
        }

        public final JSONObject d() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("28e5e690", new Object[]{this});
            }
            JSONObject o0 = this.c.o0();
            if (o0 == null || (jSONObject = o0.getJSONObject("shopDynamicBlockData")) == null) {
                return null;
            }
            return jSONObject.getJSONObject("data");
        }

        public final JSONArray e() {
            int i;
            JSONArray f;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("11652356", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            ShopDataParser shopDataParser = this.c;
            JSONArray e = ShopDataParser.e(shopDataParser);
            if (e == null) {
                i = 0;
            } else {
                i = e.size();
            }
            if (i > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONArray e2 = ShopDataParser.e(shopDataParser);
                    if (!(e2 == null || (f = brf.f(e2, i2)) == null)) {
                        jSONArray.addAll(f);
                    }
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return jSONArray;
        }

        public final String f() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88c6a64e", new Object[]{this});
            }
            JSONObject n = n();
            if (n == null || (jSONObject = n.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("queryParam")) == null) {
                return null;
            }
            return jSONObject2.getString("feedId");
        }

        public final ShopComponentModel g() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopComponentModel) ipChange.ipc$dispatch("c1e2ad44", new Object[]{this});
            }
            JSONObject jSONObject2 = null;
            if (!this.c.a3() || !this.c.Y1()) {
                JSONObject o0 = this.c.o0();
                if (!(o0 == null || (jSONObject = o0.getJSONObject("shopDynamicBlockData")) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("liveWidgetVO");
                }
                return a(jSONObject2);
            }
            JSONObject c1 = this.c.c1();
            if (c1 != null) {
                jSONObject2 = c1.getJSONObject("liveWidgetVO");
            }
            return a(jSONObject2);
        }

        public final int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3ff8ffdc", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4267e5a7", new Object[]{this})).intValue();
            }
            return this.f3082a;
        }

        public final JSONArray j() {
            JSONArray f;
            JSONArray f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("269b5eb6", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            ShopDataParser shopDataParser = this.c;
            JSONArray e = ShopDataParser.e(shopDataParser);
            if (!(e == null || (f2 = brf.f(e, 0)) == null)) {
                jSONArray.addAll(f2);
            }
            JSONArray e2 = ShopDataParser.e(shopDataParser);
            if (!(e2 == null || (f = brf.f(e2, 1)) == null)) {
                jSONArray.addAll(f);
            }
            return jSONArray;
        }

        public final float k() {
            String string;
            Float l;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e21903d1", new Object[]{this})).floatValue();
            }
            JSONObject n = n();
            if (n == null || (string = n.getString("blockHeightPercent")) == null || (l = rsq.l(string)) == null) {
                return 0.8f;
            }
            return l.floatValue();
        }

        public final aop l() {
            Integer num;
            int i;
            int i2;
            String string;
            Integer m;
            String string2;
            Integer m2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aop) ipChange.ipc$dispatch("9e02d5ed", new Object[]{this});
            }
            JSONObject n = n();
            Integer num2 = null;
            if (n == null || (string2 = n.getString("blockHeight")) == null || (m2 = ssq.m(string2)) == null) {
                num = null;
            } else {
                num = Integer.valueOf(kew.P(m2));
            }
            if (num != null) {
                i = num.intValue();
            } else if (this.c.a3()) {
                i = (int) (kew.w() * 0.75d);
            } else {
                i = kew.P(Integer.valueOf((int) x0.k));
            }
            JSONObject n2 = n();
            if (!(n2 == null || (string = n2.getString("coveredHeight")) == null || (m = ssq.m(string)) == null)) {
                num2 = Integer.valueOf(kew.P(m));
            }
            if (num2 == null) {
                i2 = kew.P(262);
            } else {
                i2 = num2.intValue();
            }
            return new aop(i, i2);
        }

        public final Map<String, ShopComponentModel> m() {
            JSONObject jSONObject;
            ShopComponentModel a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("9b11a15d", new Object[]{this});
            }
            JSONObject o0 = this.c.o0();
            JSONArray jSONArray = o0 == null ? null : o0.getJSONArray("headerWidgetList");
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(jSONArray);
            JSONObject Z0 = this.c.Z0();
            JSONArray jSONArray2 = Z0 == null ? null : Z0.getJSONArray("frameWidgetList");
            if (jSONArray2 == null || jSONArray2.isEmpty()) {
                JSONArray j1 = this.c.j1();
                if (j1 != null) {
                    arrayList.addAll(j1);
                }
            } else {
                arrayList.addAll(jSONArray2);
            }
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    jSONObject = (JSONObject) next;
                } else if (next instanceof HashMap) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : ((Map) next).entrySet()) {
                        if (entry.getKey() instanceof String) {
                            Object key = entry.getKey();
                            if (key != null) {
                                jSONObject2.put((JSONObject) ((String) key), (String) entry.getValue());
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                    jSONObject = jSONObject2;
                } else {
                    jSONObject = null;
                }
                if (!(jSONObject == null || (a2 = a(jSONObject)) == null)) {
                    String name = a2.getName();
                    ckf.d(name);
                    hashMap.put(name, a2);
                }
            }
            if (hashMap.isEmpty()) {
                return null;
            }
            return hashMap;
        }

        public final JSONObject n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("e72f118b", new Object[]{this});
            }
            JSONObject o0 = this.c.o0();
            if (o0 == null) {
                return null;
            }
            return o0.getJSONObject("shopDynamicBlockData");
        }

        public final ShopComponentModel o() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopComponentModel) ipChange.ipc$dispatch("9e53c481", new Object[]{this});
            }
            JSONObject o0 = this.c.o0();
            JSONObject jSONObject2 = null;
            if (!(o0 == null || (jSONObject = o0.getJSONObject("shopDynamicBlockData")) == null)) {
                jSONObject2 = jSONObject.getJSONObject("videoWidgetVO");
            }
            return a(jSONObject2);
        }

        public final boolean p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d67529c1", new Object[]{this})).booleanValue();
            }
            JSONObject n = n();
            if (n == null || n.getString("blockType") == null || n.getJSONObject("data") == null) {
                return false;
            }
            return true;
        }

        public final void s(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63240546", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public final boolean u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab4605a5", new Object[]{this})).booleanValue();
            }
            JSONObject n = n();
            if (n == null || !ckf.b(n.getString("blockType"), "carousel") || n.getJSONObject("data") == null) {
                return false;
            }
            return true;
        }

        public final boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1b73061", new Object[]{this})).booleanValue();
            }
            JSONObject n = n();
            if (n == null || !ckf.b(n.getString("blockType"), "live") || n.getJSONObject("data") == null) {
                return this.c.a3() && this.c.Y1();
            }
            return true;
        }

        public final boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a7ed006", new Object[]{this})).booleanValue();
            }
            JSONObject n = n();
            if (n != null) {
                String string = n.getString("blockType");
                if (ckf.b(string, "live") || ckf.b(string, "video")) {
                    return true;
                }
            }
            return false;
        }

        public final ShopComponentModel a(JSONObject jSONObject) {
            String string;
            Integer m;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopComponentModel) ipChange.ipc$dispatch("625afc11", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || (string = jSONObject.getString("name")) == null) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("userTrackInfo");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            boolean b = ckf.b(jSONObject.getString("sendMtop"), "true");
            JSONObject jSONObject4 = jSONObject.getJSONObject("mtopInfo");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("version");
            String string4 = jSONObject.getString("targetUrl");
            String string5 = jSONObject.getString("renderHeight");
            return new ShopComponentModel(jSONObject2, b, jSONObject4, jSONObject3, string2, string, string4, string3, (string5 == null || (m = ssq.m(string5)) == null) ? 0 : m.intValue(), jSONObject.getString("renderTargetTab"), jSONObject.getJSONObject(AgooConstants.MESSAGE_EXT));
        }

        public final JSONObject t(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("533c2e7b", new Object[]{this, jSONObject});
            }
            Pair a2 = jpu.a("widgetData", jSONObject);
            String str = null;
            Pair a3 = jpu.a("asyncData", null);
            Pair a4 = jpu.a("headerData", this.c.o0());
            Pair a5 = jpu.a("shopInfo", ShopDataParser.d(this.c));
            JSONObject o0 = this.c.o0();
            if (o0 != null) {
                str = o0.getString("renderStyle");
            }
            return brf.a(a2, a3, jpu.a("nativeData", brf.a(a4, a5, jpu.a("renderStyle", str))));
        }
    }

    public final String B0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc06b18e", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = this.r;
        String str = null;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = this.m;
        String string = jSONObject3 == null ? null : jSONObject3.getString("shopName");
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject2.get("lofts");
        if (obj instanceof JSONArray) {
            jSONArray = obj;
        }
        JSONObject g2 = brf.g(jSONArray, 0);
        JSONObject jSONObject4 = g2 == null ? null : g2.getJSONObject("loftData");
        String string2 = jSONObject4 == null ? null : jSONObject4.getString("id");
        if (jSONObject4 != null) {
            str = jSONObject4.getString("sceneId");
        }
        Uri.Builder buildUpon = Uri.parse(ShopLoftActivity.KEY_SHARE_URL_BASE).buildUpon();
        buildUpon.appendQueryParameter("seller_id", this.t);
        buildUpon.appendQueryParameter("shop_id", this.u);
        buildUpon.appendQueryParameter("first_media_scene", str);
        buildUpon.appendQueryParameter("first_media_id", string2);
        buildUpon.appendQueryParameter("title", string);
        buildUpon.appendQueryParameter("source", "shop");
        buildUpon.appendQueryParameter("spm", InshopResultActivity.ALL_ITEM_SPM);
        if (jSONObject != null) {
            buildUpon.appendQueryParameter(AgooConstants.MESSAGE_EXT, jSONObject.toJSONString());
        }
        if (jSONObject4 != null) {
            buildUpon.appendQueryParameter("loftData", jSONObject4.toJSONString());
        }
        return buildUpon.build().toString();
    }

    public final JSONObject C1() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("13cf1da9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.p;
        if (jSONArray == null) {
            obj = null;
        } else {
            ckf.d(jSONArray);
            obj = jSONArray.get(0);
        }
        jSONObject.put((JSONObject) "indexData", (String) obj);
        jSONObject.put((JSONObject) "navigatorData", (String) this.o);
        jSONObject.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) 0);
        jSONObject.put((JSONObject) "headerData", (String) this.n);
        if (N1()) {
            JSONObject jSONObject2 = new JSONObject();
            Boolean bool = Boolean.FALSE;
            jSONObject2.put((JSONObject) "isDarkBg", (String) bool);
            jSONObject2.put((JSONObject) "followStatus", (String) bool);
            jSONObject.put((JSONObject) "carData", (String) jSONObject2);
        }
        if (h2()) {
            jSONObject.put((JSONObject) "isShopNameNavi", (String) Boolean.TRUE);
            jSONObject.put((JSONObject) "showShopName", (String) Boolean.FALSE);
        }
        jSONObject.put((JSONObject) "shopInfo", (String) this.m);
        return jSONObject;
    }

    public final JSONObject R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cc1726a1", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "navigatorData", (String) this.o);
        jSONObject.put((JSONObject) "allItemData", (String) u());
        jSONObject.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) 0);
        return jSONObject;
    }

    public final boolean S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42262bae", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.r;
        if (jSONObject == null) {
            return false;
        }
        return ckf.b("true", jSONObject.getString("new"));
    }

    public final boolean W1() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1f71f24", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null || (bool = jSONObject.getBoolean("isNewFarmer")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final JSONObject b1() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e115464", new Object[]{this});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject y0 = y0();
        if (y0 == null) {
            y0 = new JSONObject();
        }
        jSONObject2.put((JSONObject) "loftInfo", (String) y0);
        if (S2()) {
            jSONObject2.put((JSONObject) "loftInfo", (String) this.r);
            JSONObject jSONObject3 = this.r;
            ckf.d(jSONObject3);
            JSONObject jSONObject4 = this.r;
            if (jSONObject4 == null) {
                jSONObject = null;
            } else {
                JSONArray jSONArray = new JSONArray();
                Object obj = jSONObject4.get("lofts");
                if (obj instanceof JSONArray) {
                    jSONArray = obj;
                }
                jSONObject = brf.g(jSONArray, 0);
            }
            jSONObject3.put((JSONObject) "firstLoft", (String) jSONObject);
        }
        return jSONObject2;
    }

    public final JSONObject c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62eb104", new Object[]{this});
        }
        JSONObject jSONObject = this.r;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get("lofts");
        if (obj instanceof JSONArray) {
            jSONArray = obj;
        }
        JSONObject g2 = brf.g(jSONArray, 0);
        if (g2 == null) {
            return null;
        }
        return g2.getJSONObject("loftData");
    }

    public final boolean j2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9632e91f", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        JSONObject jSONObject = this.m;
        return ckf.b(jSONObject == null ? null : jSONObject.getString("wangWangLink"), str);
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c001a41f", new Object[]{this})).booleanValue();
        }
        JSONObject Z0 = Z0();
        return true ^ ckf.b(Z0 == null ? null : Z0.getString("closeClientAccsReport"), "true");
    }

    public final String v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f105784", new Object[]{this});
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "0";
        new AliHADowngradeSDKExtension().getDowngradeInfo("tblivecard", false, new i(ref$ObjectRef));
        return (String) ref$ObjectRef.element;
    }

    public final JSONObject D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1e793e6", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "shopInfo", (String) this.m);
        jSONObject.put((JSONObject) "headerData", (String) this.n);
        jSONObject.put((JSONObject) "navigatorData", (String) this.o);
        jSONObject.put((JSONObject) bau.EVENT_TYPE_NATIVE_KEY, (String) brf.a(jpu.a("autoScrollText", Boolean.valueOf(aqp.Companion.p()))));
        jSONObject.put((JSONObject) "nativeData", (String) brf.a(jpu.a("isLivingStatus", Boolean.valueOf(V1()))));
        return jSONObject;
    }

    public final void F1() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4868b023", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.I;
        if (n0) {
            n0 = false;
            z = true;
        }
        jSONObject.put((JSONObject) "firstLaunchShop", (String) Boolean.valueOf(z));
        this.I.put((JSONObject) "tmsLaunchTask", h8s.m(Globals.getApplication()));
    }

    public final boolean J1() {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a622233d", new Object[]{this})).booleanValue();
        }
        if (khu.e()) {
            npp.Companion.b("low devices , disable big card");
            return false;
        }
        Uri uri = this.b;
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null && queryParameterNames.contains("shopLoftVideoId")) {
            return true;
        }
        if (S2()) {
            return X1();
        }
        return false;
    }

    public final boolean R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cd05d2", new Object[]{this})).booleanValue();
        }
        if (s1() == null) {
            return false;
        }
        return ckf.b("industrybar3bar", this.L) || ckf.b("industrybar3", this.K) || ckf.b("industrybar3", this.M);
    }

    public final boolean S1(String str) {
        JSONObject c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13efad01", new Object[]{this, str})).booleanValue();
        }
        if (str == null || (c0 = c0()) == null) {
            return false;
        }
        for (Map.Entry<String, Object> entry : c0.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof JSONObject) && ckf.b(str, ((JSONObject) value).getString(rg0.JUMP_URL))) {
                return true;
            }
        }
        return false;
    }

    public final JSONArray T2() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("eb8be0a", new Object[]{this});
        }
        boolean i3 = ckf.b(u0(), eop.TMALL_CAR_SHOP) ? true : this.c.i();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = this.p;
        if (jSONArray3 != null) {
            for (Object obj : jSONArray3) {
                i2++;
                if (i2 < 0) {
                    yz3.p();
                    throw null;
                } else if (obj instanceof JSONObject) {
                    JSONArray jSONArray4 = new JSONArray();
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                    if (jSONObject2 != null) {
                        jSONArray.add(jSONObject2);
                        JSONArray jSONArray5 = jSONObject.getJSONArray("childrens");
                        ckf.f(jSONArray5, "any.getJSONArray(\"childrens\")");
                        Iterator<Object> it = jSONArray5.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next != null) {
                                JSONArray jSONArray6 = ((JSONObject) next).getJSONArray("childrens");
                                ckf.f(jSONArray6, "childrens_1_obj as JSONObject).getJSONArray(\"childrens\")");
                                if (!ckf.b(jSONObject2.getString("name"), mop.KEY_SHOP_INDEX_BAR) || i3) {
                                    jSONArray4.addAll(jSONArray6);
                                } else if (!jSONArray6.isEmpty()) {
                                    jSONArray4.add(i04.a0(jSONArray6));
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                            }
                        }
                    }
                    jSONArray2.add(jSONArray4);
                }
            }
        }
        this.s = jSONArray2;
        return jSONArray;
    }

    public final JSONObject U2(String str) {
        String str2;
        int size;
        int size2;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1ca6712", new Object[]{this, str});
        }
        List z0 = wsq.z0(str, new String[]{"_"}, false, 0, 6, null);
        if (!z0.isEmpty()) {
            str2 = (String) i04.a0(z0);
        } else {
            str2 = "";
        }
        JSONObject jSONObject4 = null;
        JSONObject jSONObject5 = null;
        Object obj = null;
        JSONObject jSONObject6 = null;
        JSONArray jSONArray2 = null;
        JSONArray jSONArray3 = null;
        if (ckf.b(str2, "header")) {
            JSONObject jSONObject7 = this.l;
            JSONObject jSONObject8 = jSONObject7 == null ? null : jSONObject7.getJSONObject(str);
            this.n = jSONObject8;
            this.q = (jSONObject8 == null || (jSONObject3 = jSONObject8.getJSONObject("payload")) == null) ? null : jSONObject3.getJSONObject("loftInfo");
            JSONObject jSONObject9 = this.n;
            this.r = (jSONObject9 == null || (jSONObject2 = jSONObject9.getJSONObject("payload")) == null) ? null : jSONObject2.getJSONObject("loftInfo2");
            JSONObject jSONObject10 = this.n;
            if (!(jSONObject10 == null || (jSONObject = jSONObject10.getJSONObject("payload")) == null)) {
                jSONObject.getJSONObject("liveInfo");
            }
            JSONObject jSONObject11 = new JSONObject();
            JSONObject jSONObject12 = this.n;
            if (jSONObject12 == null) {
                jSONObject12 = new JSONObject();
            }
            jSONObject11.putAll(jSONObject12);
            JSONObject jSONObject13 = this.n;
            JSONObject jSONObject14 = jSONObject13 == null ? null : jSONObject13.getJSONObject("payload");
            if (jSONObject14 == null) {
                jSONObject14 = new JSONObject();
            }
            jSONObject11.putAll(jSONObject14);
            this.n = jSONObject11;
            JSONObject jSONObject15 = this.l;
            if (jSONObject15 == null) {
                return null;
            }
            return jSONObject15.getJSONObject(str);
        } else if (ckf.b(str2, "navigator")) {
            JSONObject jSONObject16 = new JSONObject();
            JSONObject jSONObject17 = this.l;
            JSONObject jSONObject18 = jSONObject17 == null ? null : jSONObject17.getJSONObject(str);
            jSONObject16.putAll(jSONObject18 == null ? new JSONObject() : jSONObject18);
            if (jSONObject18 != null) {
                jSONObject5 = jSONObject18.getJSONObject("payload");
            }
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            jSONObject16.putAll(jSONObject5);
            this.o = jSONObject16;
            return jSONObject16;
        } else {
            ckf.b(str2, "customIndex");
            if (ckf.b(str2, "tab")) {
                JSONObject jSONObject19 = new JSONObject();
                JSONObject jSONObject20 = this.l;
                JSONObject jSONObject21 = jSONObject20 == null ? null : jSONObject20.getJSONObject(str);
                jSONObject19.putAll(jSONObject21 == null ? new JSONObject() : jSONObject21);
                JSONObject jSONObject22 = jSONObject21 == null ? null : jSONObject21.getJSONObject("payload");
                if (jSONObject22 == null) {
                    jSONObject22 = new JSONObject();
                }
                jSONObject19.putAll(jSONObject22);
                JSONObject jSONObject23 = this.k;
                List B0 = (jSONObject23 == null || (jSONArray = jSONObject23.getJSONArray(str)) == null) ? null : i04.B0(jSONArray);
                if (!(B0 instanceof List)) {
                    B0 = null;
                }
                JSONObject jSONObject24 = this.l;
                if (jSONObject24 != null) {
                    if (B0 != null) {
                        obj = B0.get(0);
                    }
                    jSONObject6 = jSONObject24.getJSONObject(String.valueOf(obj));
                }
                if (jSONObject6 != null) {
                    jSONObject19.putAll(jSONObject6);
                }
                return jSONObject19;
            } else if (ckf.b(str2, "tabContainer")) {
                JSONArray jSONArray4 = new JSONArray();
                JSONObject jSONObject25 = this.l;
                JSONObject jSONObject26 = jSONObject25 == null ? null : jSONObject25.getJSONObject(str);
                JSONObject jSONObject27 = this.k;
                if (jSONObject27 != null) {
                    jSONArray2 = jSONObject27.getJSONArray(str);
                }
                if (jSONArray2 != null && (size2 = jSONArray2.size()) > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        jSONArray4.add(U2(jSONArray2.get(i2).toString()));
                        if (i3 >= size2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                this.p = jSONArray4;
                JSONObject jSONObject28 = new JSONObject();
                jSONObject28.put((JSONObject) "childrens", (String) jSONArray4);
                JSONObject jSONObject29 = new JSONObject();
                if (jSONObject26 == null) {
                    jSONObject26 = new JSONObject();
                }
                jSONObject29.putAll(jSONObject26);
                jSONObject29.putAll(jSONObject28);
                return jSONObject29;
            } else {
                JSONObject jSONObject30 = this.k;
                if ((jSONObject30 == null ? null : jSONObject30.getJSONArray(str)) != null) {
                    JSONObject jSONObject31 = this.l;
                    JSONObject jSONObject32 = jSONObject31 == null ? null : jSONObject31.getJSONObject(str);
                    JSONObject jSONObject33 = this.k;
                    if (jSONObject33 != null) {
                        jSONArray3 = jSONObject33.getJSONArray(str);
                    }
                    JSONArray jSONArray5 = new JSONArray();
                    if (jSONArray3 != null && (size = jSONArray3.size()) > 0) {
                        while (true) {
                            int i4 = i2 + 1;
                            jSONArray5.add(U2(jSONArray3.get(i2).toString()));
                            if (i4 >= size) {
                                break;
                            }
                            i2 = i4;
                        }
                    }
                    JSONObject jSONObject34 = new JSONObject();
                    jSONObject34.put((JSONObject) "childrens", (String) jSONArray5);
                    JSONObject jSONObject35 = new JSONObject();
                    if (jSONObject32 == null) {
                        jSONObject32 = new JSONObject();
                    }
                    jSONObject35.putAll(jSONObject32);
                    jSONObject35.putAll(jSONObject34);
                    return jSONObject35;
                }
                JSONObject jSONObject36 = this.l;
                if (jSONObject36 != null) {
                    jSONObject4 = jSONObject36.getJSONObject(str);
                }
                JSONObject jSONObject37 = new JSONObject();
                jSONObject37.put((JSONObject) "childrens", (String) new JSONArray());
                JSONObject jSONObject38 = new JSONObject();
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                jSONObject38.putAll(jSONObject4);
                jSONObject38.putAll(jSONObject37);
                return jSONObject38;
            }
        }
    }

    public final boolean X1() {
        JSONObject g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea73570", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.r;
        if (jSONObject == null || !S2()) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get("lofts");
        if (obj instanceof JSONArray) {
            jSONArray = obj;
        }
        JSONArray jSONArray2 = jSONArray;
        return (jSONArray2.size() == 0 || (g2 = brf.g(jSONArray2, 0)) == null || !ckf.b(g2.getString("loftSize"), "open")) ? false : true;
    }

    public final boolean Y1() {
        JSONObject g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac55f4db", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.r;
        if (jSONObject == null || !S2()) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get("lofts");
        if (obj instanceof JSONArray) {
            jSONArray = obj;
        }
        JSONArray jSONArray2 = jSONArray;
        return (jSONArray2.size() == 0 || (g2 = brf.g(jSONArray2, 0)) == null || !ckf.b(g2.getString("loftType"), "live")) ? false : true;
    }

    public final boolean a2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d74b566a", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof String) {
            return tsq.I((String) obj, ShopLoftActivity.KEY_SHARE_URL_BASE, false, 2, null);
        }
        return false;
    }

    public final boolean a3() {
        JSONObject g2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94248708", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.r;
        if (jSONObject2 == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject2.get("lofts");
        if (obj instanceof JSONArray) {
            jSONArray = obj;
        }
        JSONArray jSONArray2 = jSONArray;
        return (jSONArray2.size() == 0 || (g2 = brf.g(jSONArray2, 0)) == null || (jSONObject = g2.getJSONObject("extraInfo")) == null || !ckf.b(jSONObject.getString("useNewLiveData"), "true")) ? false : true;
    }

    public final boolean g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (ckf.b(u0(), eop.XSD_SHOP)) {
            return true;
        }
        JSONObject jSONObject = this.m;
        if (jSONObject == null || this.p == null) {
            return false;
        }
        Boolean bool = null;
        if ((jSONObject == null ? null : Boolean.valueOf(jSONObject.isEmpty())) == null) {
            return false;
        }
        JSONArray jSONArray = this.p;
        if (jSONArray != null) {
            bool = Boolean.valueOf(jSONArray.isEmpty());
        }
        return bool != null;
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3dd6ef3", new Object[]{this});
        }
        if (this.v == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "shopInfo", (String) this.m);
            jSONObject.put((JSONObject) "tabData", (String) A());
            jSONObject.put((JSONObject) "isPromotionStyle", (String) Boolean.valueOf(d2()));
            jSONObject.put((JSONObject) "offService", (String) f1());
            jSONObject.put((JSONObject) "headerData", (String) o0());
            jSONObject.put((JSONObject) mop.KEY_IS_SHOW_LIVE_ICON, (String) Boolean.valueOf(Y1()));
            jSONObject.put((JSONObject) "nativeData", (String) brf.a(jpu.a("isLivingStatus", Boolean.valueOf(V1()))));
            this.v = jSONObject;
        }
        JSONObject jSONObject2 = this.v;
        ckf.d(jSONObject2);
        return jSONObject2;
    }

    public final boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f9085a", new Object[]{this})).booleanValue();
        }
        if (ckf.b(m2("adjustShopBottomBarTextStyle"), "true")) {
            return L1() || K1();
        }
        return false;
    }

    public final void m(String str, Object obj, boolean z) {
        Long l;
        Intent intent;
        Uri data;
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af36db3", new Object[]{this, str, obj, new Boolean(z)});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        String str2 = null;
        if ((tsq.w(str, mop.KEY_APP_END, false, 2, null) && !this.I.containsKey(mop.KEY_SHOP_NAVI_END)) || z) {
            this.I.put((JSONObject) mop.KEY_SHOP_NAVI_END, (String) obj);
            if (obj instanceof Long) {
                l = (Long) obj;
                l.longValue();
            } else {
                l = (obj == null || (obj2 = obj.toString()) == null) ? null : ssq.o(obj2);
            }
            if (l != null) {
                try {
                    ShopExtKt.U(this);
                    vxm vxmVar = vxm.b;
                    Context context = this.d;
                    if (context != null) {
                        vxmVar.a((Activity) context).j(mop.KEY_RENDER_FINISH_TIME, r54.j(l.longValue()));
                        Result.m1108constructorimpl(vxmVar.e().j(mop.KEY_RENDER_FINISH_TIME, r54.j(l.longValue())));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                } catch (Throwable th) {
                    Result.m1108constructorimpl(kotlin.b.a(th));
                }
            }
            Context context2 = this.d;
            if (context2 != null) {
                if (aqp.Companion.P() || !wsq.O(str, mop.KEY_SHOP_INDEX, false, 2, null)) {
                    if (!(!(context2 instanceof Activity) || (intent = ((Activity) context2).getIntent()) == null || (data = intent.getData()) == null)) {
                        str2 = data.toString();
                    }
                    ShopExtKt.m0(context2, str2, this);
                }
            }
        }
    }

    public final JSONObject r(String str) {
        JSONArray jSONArray;
        int size;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29d5960e", new Object[]{this, str});
        }
        if (str != null && (jSONArray = this.R) != null && (size = jSONArray.size()) > 0) {
            while (true) {
                int i3 = i2 + 1;
                Object obj = jSONArray.get(i2);
                if ((obj instanceof HashMap) && ckf.b(str, ((Map) obj).get(yh6.CONFIG_KEY_TEMPLATE_NAME))) {
                    return ShopExtKt.p(new JSONObject((HashMap) obj));
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (ckf.b(str, jSONObject.get(yh6.CONFIG_KEY_TEMPLATE_NAME))) {
                        return ShopExtKt.p(jSONObject);
                    }
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return null;
    }

    public final JSONArray u() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6d1e5a29", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = this.p;
        if (jSONArray2 != null && (size = jSONArray2.size()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Object obj = jSONArray2.get(i2);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (TextUtils.equals(H0(jSONObject).getString("name"), mop.KEY_ALL_ITEMS)) {
                        JSONArray K = K(jSONObject);
                        K.size();
                        return K(K.getJSONObject(0));
                    }
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return jSONArray;
    }

    public final Pair<Integer, Integer> v1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c0e7e170", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        Iterator<Object> it = u1().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                Iterator<Object> it2 = ((JSONArray) next).iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if ((next2 instanceof JSONObject) && ckf.b(((JSONObject) next2).getString("name"), str)) {
                        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                    i3++;
                }
                continue;
            }
            i2++;
        }
        return null;
    }

    public final boolean z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad804484", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        Object obj = jSONObject == null ? null : jSONObject.get("shopSignContentList");
        return (obj instanceof JSONArray) && ((JSONArray) obj).size() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0246 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONArray n0(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.data.ShopDataParser.n0(java.lang.String):com.alibaba.fastjson.JSONArray");
    }
}
