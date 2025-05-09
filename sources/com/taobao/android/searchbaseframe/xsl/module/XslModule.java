package com.taobao.android.searchbaseframe.xsl.module;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.xsl.refact.XslChildPageWidget;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.box;
import tb.c4p;
import tb.gy;
import tb.kuc;
import tb.lox;
import tb.mox;
import tb.nde;
import tb.ng3;
import tb.o02;
import tb.phw;
import tb.qit;
import tb.qj9;
import tb.qug;
import tb.t2o;
import tb.t2p;
import tb.t48;
import tb.tee;
import tb.tnl;
import tb.ude;
import tb.uee;
import tb.v5h;
import tb.v7p;
import tb.vee;
import tb.wee;
import tb.xjt;
import tb.y5p;
import tb.yko;
import tb.znd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslModule implements ude {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static g c0;
    public static e d0;
    public static d e0;
    public static volatile yko f0;
    public String A;
    public int L;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;

    /* renamed from: a  reason: collision with root package name */
    public uee f9358a;
    public h c;
    public f d;
    public vee e;
    public JSONObject g;
    public tnl h;
    public tee p;
    public wee q;
    public boolean r;
    public final Activity s;
    public XslDatasource t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;
    public final List<XslDatasource> b = new ArrayList();
    public boolean f = false;
    public boolean i = false;
    public boolean j = false;
    public String k = null;
    public String l = null;
    public com.taobao.android.weex_framework.a m = null;
    public boolean n = false;
    public boolean o = false;
    public boolean B = true;
    public boolean C = false;
    public boolean D = false;
    public JSONObject E = null;
    public final Map<String, String> F = new HashMap();
    public int G = 0;
    public boolean H = true;
    public boolean I = false;
    public int J = 0;
    public int K = 0;
    public Integer M = null;
    public int W = -1;
    public int X = -1;
    public int Y = 2;
    public boolean Z = false;
    public final Map<String, String> a0 = new HashMap();
    public final Map<String, String> b0 = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements kuc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kuc
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
                return;
            }
            f fVar = XslModule.this.d;
            if (fVar != null) {
                fVar.onPageScrollStateChange(true, i);
            }
        }

        @Override // tb.kuc
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7740ab11", new Object[]{this, new Integer(i)});
                return;
            }
            f fVar = XslModule.this.d;
            if (fVar != null) {
                fVar.onPageScroll(i);
            }
        }

        @Override // tb.kuc
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd5cfe1d", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.kuc
        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2191d0d", new Object[]{this, new Integer(i)});
                return;
            }
            f fVar = XslModule.this.d;
            if (fVar != null) {
                fVar.onPageScrollStateChange(false, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements t48 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.t48
        public void n0(nde ndeVar, String str, Object obj, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d391adbc", new Object[]{this, ndeVar, str, obj, str2, str3});
                return;
            }
            f fVar = XslModule.this.d;
            if (fVar != null) {
                fVar.onDynamicError(str, obj, str2, str3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        void onDataLoaded(gy<?, ?, ?> gyVar);

        void onDataLoadedMeta(gy<?, ?, ?> gyVar);

        void onDynamicError(String str, Object obj, String str2, String str3);

        void onPageScroll(int i);

        void onPageScrollStateChange(boolean z, int i);

        void onTabChanged(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface g {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface h {
    }

    static {
        t2o.a(993002049);
        t2o.a(993002008);
    }

    public XslModule(Activity activity) {
        this.s = activity;
    }

    public static void C(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70d8fe4", new Object[]{dVar});
        } else {
            e0 = dVar;
        }
    }

    public static void D(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f21b718", new Object[]{eVar});
        } else {
            d0 = eVar;
        }
    }

    public static synchronized void E(g gVar) {
        synchronized (XslModule.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de53b053", new Object[]{gVar});
            } else {
                c0 = gVar;
            }
        }
    }

    public static yko H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("15c911e4", new Object[0]);
        }
        if (f0 != null) {
            return f0;
        }
        synchronized (XslModule.class) {
            try {
                if (f0 != null) {
                    return f0;
                }
                g gVar = c0;
                if (gVar == null) {
                    return null;
                }
                f0 = ((SearchXslSdk.a) gVar).a();
                u(f0);
                return f0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ uee a(XslModule xslModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uee) ipChange.ipc$dispatch("71b31062", new Object[]{xslModule});
        }
        return xslModule.f9358a;
    }

    public static yko d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[0]);
        }
        if (f0 != null) {
            return f0;
        }
        synchronized (XslModule.class) {
            try {
                if (f0 != null) {
                    return f0;
                }
                f0 = ((SearchXslSdk.a) c0).a();
                u(f0);
                return f0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static XslDatasource f(XslModule xslModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("9a481253", new Object[]{xslModule, new Boolean(z)});
        }
        e eVar = d0;
        if (eVar != null) {
            return ((SearchXslSdk.c) eVar).a(xslModule, d(), z);
        }
        return new XslDatasource(d());
    }

    public static void u(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b10ee49", new Object[]{ykoVar});
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.onCtxResumeInternal();
        }
    }

    public void A0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f6e6db", new Object[]{this, map});
            return;
        }
        ((HashMap) this.b0).clear();
        ((HashMap) this.b0).putAll(map);
        XslDatasource xslDatasource = this.t;
        if (xslDatasource != null) {
            G0(xslDatasource);
        }
    }

    public final void B(int i, XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89faad2", new Object[]{this, new Integer(i), xslDatasource});
            return;
        }
        xslDatasource.setBundleUrl(this.l);
        xslDatasource.subscribe(this, 10);
        d dVar = e0;
        if (dVar != null) {
            ((SearchXslSdk.b) dVar).a(this, xslDatasource);
        }
        xslDatasource.setCurrentTabIndex(i);
        xslDatasource.setExtraStatus(this.g);
        C0(xslDatasource);
        ((ArrayList) this.b).add(xslDatasource);
    }

    public void B0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7523ef5", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void C0(XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b996fe60", new Object[]{this, xslDatasource});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.F).entrySet()) {
            xslDatasource.forceSetFallbackType((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public void D0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84321ed6", new Object[]{this, new Integer(i)});
        } else {
            E0(i, true);
        }
    }

    public void E0(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2126ebe", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.e1(i, z);
        }
    }

    public final void F(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eb375b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        XslDatasource n = n(i);
        if (n != null && !n.isJsRequestEventFired() && !n.isTaskRunning()) {
            n.setJsRequestEventFired(true);
            h hVar = this.c;
            if (hVar != null) {
                ((XslMUSLayout.c) hVar).a(i, i2);
            }
            if (i2 != 1) {
                z = false;
            }
            n.triggerBefore(z, false, false);
        }
    }

    public void F0(XslSearchResult xslSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6258b90", new Object[]{this, xslSearchResult});
        } else if (this.f9358a != null) {
            if (TextUtils.isEmpty(this.y)) {
                this.f9358a.d2(xslSearchResult.getAtmosphereType(), xslSearchResult.getAtmosphereUrl());
                this.f9358a.f2(xslSearchResult.isAtmosphereAnim());
            }
            if (TextUtils.isEmpty(this.z)) {
                this.f9358a.U1(xslSearchResult.getAtmosphereListBgColor());
            }
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d2e351", new Object[]{this});
        }
    }

    public final void G0(XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80110d47", new Object[]{this, xslDatasource});
            return;
        }
        if (xslDatasource != null) {
            xslDatasource.setFlatParams(this.n);
        }
        for (Map.Entry entry : ((HashMap) this.a0).entrySet()) {
            xslDatasource.setParam((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : ((HashMap) this.b0).entrySet()) {
            xslDatasource.addTppParam((String) entry2.getKey(), (String) entry2.getValue());
        }
    }

    public void I(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4e6f7d", new Object[]{this, str, str2, str3});
            return;
        }
        this.u = str;
        this.v = str2;
        this.w = str3;
        XslDatasource xslDatasource = this.t;
        if (xslDatasource != null) {
            xslDatasource.setApi(str, str2, str3);
        }
    }

    public final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd150bb", new Object[]{this});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ((box) ueeVar.B().c()).q1().g(Boolean.valueOf(this.f));
        }
    }

    public void J(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d5ad4b", new Object[]{this, str, str2});
            return;
        }
        this.y = str;
        this.A = str2;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.d2(str, str2);
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1c3428", new Object[]{this});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ((box) ueeVar.B().c()).Q0(this.e);
        }
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc9fa6c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.B = z;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.f2(z);
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void M(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142122d1", new Object[]{this, num});
        } else {
            this.M = num;
        }
    }

    public void N(tee teeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5711e419", new Object[]{this, teeVar});
        } else {
            this.p = teeVar;
        }
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40057825", new Object[]{this, new Integer(i)});
        } else if (this.Y != i) {
            this.Y = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ColumnCount", Integer.valueOf(i));
            }
            uee ueeVar = this.f9358a;
            if (ueeVar != null) {
                ueeVar.T1(i);
            }
        }
    }

    public void P(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d110b1", new Object[]{this, fVar});
        } else {
            this.d = fVar;
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9a70f3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.D = z;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.A0(z);
        }
    }

    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cb3ab7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.I = z;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.X1(z);
        }
    }

    public void S(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f860e9", new Object[]{this, jSONObject});
            return;
        }
        this.g = jSONObject;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((XslDatasource) it.next()).setExtraStatus(this.g);
        }
    }

    public void T(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c2bc6", new Object[]{this, map});
            return;
        }
        ((HashMap) this.F).clear();
        ((HashMap) this.F).putAll(map);
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            C0((XslDatasource) it.next());
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d551a76c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642bac23", new Object[]{this, new Integer(i)});
        } else if (this.P != i) {
            this.P = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_FoldPaddingBottom", Integer.valueOf(i));
            }
        }
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bff055", new Object[]{this, new Integer(i)});
        } else if (this.O != i) {
            this.O = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_FoldPaddingTop", Integer.valueOf(i));
            }
        }
    }

    public void X(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else if (this.X != i) {
            this.X = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ItemMargin", Integer.valueOf(i));
            }
            uee ueeVar = this.f9358a;
            if (ueeVar != null) {
                ueeVar.Z1(this.X);
            }
        }
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f8942e", new Object[]{this, new Integer(i)});
        } else if (this.W != i) {
            this.W = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ItemSpacing", Integer.valueOf(i));
            }
            uee ueeVar = this.f9358a;
            if (ueeVar != null) {
                ueeVar.k1(this.W);
            }
        }
    }

    public void Z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41269b", new Object[]{this, jSONObject});
            return;
        }
        this.E = jSONObject;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.A1(jSONObject);
        }
    }

    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab18c9ef", new Object[]{this, str});
            return;
        }
        this.z = str;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.U1(str);
        }
    }

    public void b(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258287d2", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        XslDatasource n = n(i);
        if (n == null) {
            c4p l = d().l();
            l.d("XslModule", "appendRequestedData of null datasource: tab " + i);
            return;
        }
        n.setJsRequestEventFired(false);
        if (n.getTotalSearchResult() == 0) {
            n.doNewSearch(jSONObject);
        } else {
            n.doNextPageSearch(jSONObject);
        }
    }

    public void b0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db53747b", new Object[]{this, new Integer(i)});
        } else if (this.V != i) {
            this.V = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ListFooterPaddingBottom", Integer.valueOf(i));
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfed42c", new Object[]{this});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.x0(this.L, this.N);
            this.f9358a.I1(this.O, this.P);
            this.f9358a.F(this.Q, this.R);
            this.f9358a.L0(this.S, this.T);
            this.f9358a.T(this.U, this.V);
            this.f9358a.Z1(this.X);
            this.f9358a.k1(this.W);
            this.f9358a.T1(this.Y);
            this.f9358a.z1(this.Z);
        }
    }

    public void c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39acc6fd", new Object[]{this, new Integer(i)});
        } else if (this.U != i) {
            this.U = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ListFooterPaddingTop", Integer.valueOf(i));
            }
        }
    }

    public void d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88708ed", new Object[]{this, new Integer(i)});
        } else if (this.R != i) {
            this.R = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ListHeaderPaddingBottom", Integer.valueOf(i));
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fd1ce0", new Object[]{this});
        }
    }

    public void e0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1cd7cb", new Object[]{this, new Integer(i)});
        } else if (this.Q != i) {
            this.Q = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ListHeaderPaddingTop", Integer.valueOf(i));
            }
        }
    }

    public void f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b76e0", new Object[]{this, new Integer(i)});
        } else if (this.T != i) {
            this.T = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ListItemsPaddingBottom", Integer.valueOf(i));
            }
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32be2b39", new Object[]{this});
            return;
        }
        XslDatasource l = l(0);
        this.t = l;
        l.setApi(this.u, this.v, this.w);
        G0(this.t);
    }

    public void g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898166b8", new Object[]{this, new Integer(i)});
        } else if (this.S != i) {
            this.S = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ListItemsPaddingTop", Integer.valueOf(i));
            }
        }
    }

    @Override // tb.ude
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return d();
    }

    public void h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3e41b5", new Object[]{this, new Integer(i)});
            return;
        }
        this.J = i;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.l0(i);
            this.f9358a.postEvent(new qug(i));
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f9358a != null) {
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((XslDatasource) it.next()).unsubscribe(this);
            }
            this.f9358a.onCtxDestroyInternal();
            this.f9358a.destroyAndRemoveFromParent();
            this.f9358a = null;
            this.t.destroy();
            this.t = null;
        }
    }

    public void i0(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2202ff78", new Object[]{this, aVar});
        } else {
            this.m = aVar;
        }
    }

    public void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17e3c84", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b040e9dc", new Object[]{this, new Integer(i)});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.U0(i);
        }
    }

    public void k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc892be9", new Object[]{this, new Boolean(z)});
        } else if (this.Z != z) {
            this.Z = z;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_ObserveSection", Boolean.valueOf(z));
            }
        }
    }

    public XslDatasource l(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("92df00cb", new Object[]{this, new Integer(i)});
        }
        XslDatasource n = n(i);
        if (n != null) {
            return n;
        }
        if (i != 0) {
            z = false;
        }
        XslDatasource f2 = f(this, z);
        B(i, f2);
        return f2;
    }

    public Integer m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("805f7219", new Object[]{this});
        }
        return this.M;
    }

    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c56f808", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public XslDatasource n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("589b3bab", new Object[]{this, new Integer(i)});
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            XslDatasource xslDatasource = (XslDatasource) it.next();
            if (xslDatasource.getCurrentTabIndex() == i) {
                return xslDatasource;
            }
        }
        return null;
    }

    public void n0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df17d034", new Object[]{this, new Boolean(z)});
            return;
        }
        this.C = z;
        tnl tnlVar = this.h;
        if (tnlVar != null) {
            tnlVar.q("XslPageConfig_PreventRequest", Boolean.valueOf(z));
        }
    }

    public XslDatasource o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("468944a4", new Object[]{this});
        }
        return this.t;
    }

    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7242f9c0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        I0();
    }

    public void onEventMainThread(ng3 ng3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade063", new Object[]{this, ng3Var});
            return;
        }
        tee teeVar = this.p;
        if (teeVar == null) {
            return;
        }
        if (ng3Var.c) {
            ((XslMUSLayout.a) teeVar).a(ng3Var.f24711a, ng3Var.b, "list");
        } else {
            ((XslMUSLayout.a) teeVar).b(ng3Var.f24711a, ng3Var.b, "list");
        }
    }

    public void p(int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4feb66f6", new Object[]{this, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        yko core = getCore();
        XslDatasource n = n(i);
        if (n == null) {
            d().l().d("XslModule", "Insert before ds created");
            return;
        }
        XslSearchResult xslSearchResult = (XslSearchResult) n.getTotalSearchResult();
        if (xslSearchResult == null || xslSearchResult.isFailed()) {
            d().l().d("XslModule", "Insert to not exist or failed ds");
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (xslSearchResult.getCellsCount() <= i2) {
            i2 = xslSearchResult.getCellsCount();
        }
        new c(jSONObject, core, xslSearchResult, n, i, i2).executeOnExecutor(getCore().f().j().f21080a, new Void[0]);
    }

    public void p0(vee veeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca379cb4", new Object[]{this, veeVar});
            return;
        }
        this.e = veeVar;
        J0();
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59dbb48c", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public void q0(String str, String str2, Map<String, String> map, Map<String, String> map2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81edc38a", new Object[]{this, str, str2, map, map2, new Integer(i)});
            return;
        }
        XslDatasource n = n(i);
        if (n != null) {
            if (str != null) {
                n.setApi(str, str2);
            }
            n.setParams(map2);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    n.addTppParam(entry.getKey(), entry.getValue());
                }
            }
            if (n.isJsParamReady() && this.f9358a.E(i)) {
                this.f9358a.g0(i).bindWithData(null);
            }
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e506656c", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public void r0(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24edd5a", new Object[]{this, hVar});
        } else {
            this.c = hVar;
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b2447f", new Object[]{this})).booleanValue();
        }
        uee ueeVar = this.f9358a;
        if (ueeVar == null) {
            return true;
        }
        return ueeVar.isReachBottom();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        uee ueeVar = this.f9358a;
        if (ueeVar == null) {
            return true;
        }
        return ueeVar.isReachTop();
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
            return;
        }
        this.K = i;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.O0(i);
        }
    }

    public void u0(wee weeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945e48f7", new Object[]{this, weeVar});
        } else {
            this.q = weeVar;
        }
    }

    public void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fba385", new Object[]{this, new Integer(i)});
            return;
        }
        this.G = i;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.N1(i);
        }
    }

    public void w(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9943b198", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.i1(str, i, z, i2);
        }
    }

    public void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5f7c26", new Object[]{this, new Boolean(z)});
            return;
        }
        this.H = z;
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.k0(z);
        }
    }

    public void x(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48495dc2", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.w0(z, i);
        }
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46ea633", new Object[]{this, new Integer(i)});
        } else if (this.N != i) {
            this.N = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_TopPaddingBottom", Integer.valueOf(i));
            }
        }
    }

    public void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49db045", new Object[]{this, new Integer(i)});
        } else if (this.L != i) {
            this.L = i;
            tnl tnlVar = this.h;
            if (tnlVar != null) {
                tnlVar.q("XslPageConfig_TopPaddingTop", Integer.valueOf(i));
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        uee ueeVar = this.f9358a;
        if (ueeVar != null) {
            ueeVar.onCtxPauseInternal();
        }
    }

    public void z0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d722bc", new Object[]{this, map});
            return;
        }
        ((HashMap) this.a0).clear();
        ((HashMap) this.a0).putAll(map);
        XslDatasource xslDatasource = this.t;
        if (xslDatasource != null) {
            G0(xslDatasource);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends AsyncTask<Void, Void, List<BaseCellBean>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9361a;
        public final /* synthetic */ yko b;
        public final /* synthetic */ XslSearchResult c;
        public final /* synthetic */ XslDatasource d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public c(JSONObject jSONObject, yko ykoVar, XslSearchResult xslSearchResult, XslDatasource xslDatasource, int i, int i2) {
            this.f9361a = jSONObject;
            this.b = ykoVar;
            this.c = xslSearchResult;
            this.d = xslDatasource;
            this.e = i;
            this.f = i2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/module/XslModule$3");
        }

        /* renamed from: b */
        public void onPostExecute(List<BaseCellBean> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
                return;
            }
            try {
                XslDatasource n = XslModule.this.n(this.e);
                if (n == this.d) {
                    RESULT totalSearchResult = n.getTotalSearchResult();
                    XslSearchResult xslSearchResult = this.c;
                    if (totalSearchResult == xslSearchResult) {
                        int cellsCount = xslSearchResult.getCellsCount();
                        int i = this.f;
                        if (i < cellsCount) {
                            cellsCount = i;
                        }
                        if (cellsCount < 0) {
                            cellsCount = 0;
                        }
                        for (BaseCellBean baseCellBean : list) {
                            n.insertCellToTotal(baseCellBean, cellsCount);
                            cellsCount++;
                        }
                        if (n.isMetaMode()) {
                            phw<?, ?, ?> g0 = XslModule.a(XslModule.this).g0(n.getCurrentTabIndex());
                            if (g0 instanceof XslChildPageWidget) {
                                ((XslChildPageWidget) g0).f3(false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.b.l().A("XslModule", "insertListItemsData has researched");
            } catch (Exception e) {
                this.b.l().e("XslModule", "insertListItemsData post exception", e);
            }
        }

        /* renamed from: a */
        public List<BaseCellBean> doInBackground(Void... voidArr) {
            BaseCellBean b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f9c7edf0", new Object[]{this, voidArr});
            }
            try {
                Map<String, TemplateBean> b2 = qit.b(this.f9361a.getJSONArray("templates"), this.b);
                JSONObject jSONObject = this.f9361a.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
                JSONArray jSONArray = this.f9361a.getJSONArray("listItems");
                ArrayList arrayList = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (!(jSONObject2 == null || (b = this.b.b().b(jSONObject2, this.c, jSONObject)) == null)) {
                        arrayList.add(b);
                        b.pagePos = i;
                        b.pageSize = size;
                        b.pageNo = this.c.getPageNo();
                    }
                }
                com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
                cVar.q(this.d.getBundleUrl());
                cVar.r(this.d.getTrackingPageName());
                xjt.c(cVar, b2, this.b, this.d.getTemplateFiles());
                this.d.mergeTemplates(b2);
                return arrayList;
            } catch (Exception e) {
                this.b.l().e("XslModule", "insertListItemsData bg exception", e);
                return null;
            }
        }
    }

    public void H0(int i, int i2, JSONObject jSONObject, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f1bdfd", new Object[]{this, new Integer(i), new Integer(i2), jSONObject, new Integer(i3), new Boolean(z), new Boolean(z2)});
            return;
        }
        XslDatasource n = n(i);
        if (n == null) {
            c4p l = d().l();
            l.d("XslModule", "updateListItemsData of null datasource: tab " + i);
            return;
        }
        n.setJsRequestEventFired(false);
        if (n.getTotalSearchResult() == 0) {
            c4p l2 = d().l();
            l2.d("XslModule", "updateListItemsData of none-first datasource: tab " + i);
            return;
        }
        n.doUpdateSearch(jSONObject, i2, i3, z, z2);
    }

    public void l0(int i, JSONObject jSONObject, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310f11c2", new Object[]{this, new Integer(i), jSONObject, set});
            return;
        }
        XslDatasource n = n(i);
        if (n == null) {
            c4p l = d().l();
            l.d("XslModule", "setPartialData of null datasource: tab " + i);
            return;
        }
        n.setJsRequestEventFired(false);
        if (n.getTotalSearchResult() == 0) {
            c4p l2 = d().l();
            l2.d("XslModule", "setPartialData of none-first datasource: tab " + i);
            return;
        }
        n.doPartialSearch(set, jSONObject);
    }

    public ViewGroup h() {
        XslDatasource xslDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("600fb74e", new Object[]{this});
        }
        if (this.f9358a == null) {
            if (!TextUtils.isEmpty(this.x)) {
                this.t = mox.e().c(this.x, this.u, this.v, this.a0, this.b0);
            }
            if (this.t == null) {
                g();
            } else {
                com.taobao.android.weex_framework.a aVar = this.m;
                if (aVar != null) {
                    aVar.setMonitorDetailDims(MUSMonitor.DIMS_PAGE_DATA_PRELOAD, "true");
                }
                B(0, this.t);
                this.i = true;
            }
            String str = this.k;
            if (!(str == null || (xslDatasource = this.t) == null)) {
                xslDatasource.setTrackingName(str);
            }
            e eVar = d0;
            if (eVar != null) {
                this.f9358a = ((SearchXslSdk.c) eVar).b(this, this.s, this.t);
                J0();
                I0();
            }
            int i = this.K;
            if (i != 0) {
                this.f9358a.O0(i);
            }
            JSONObject jSONObject = this.E;
            if (jSONObject != null) {
                this.f9358a.A1(jSONObject);
            }
            com.taobao.android.weex_framework.a aVar2 = this.m;
            if (aVar2 != null) {
                Object tag = aVar2.getTag(XslMUSComponent.PAGE_SCROLL_LISTENER);
                if (tag instanceof lox) {
                    this.f9358a.g1((lox) tag);
                }
                Object tag2 = this.m.getTag(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK);
                if (tag2 instanceof znd) {
                    this.t.perfStaticsCallback = (znd) tag2;
                    this.m.getInstanceTags().remove(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK);
                }
            }
            tnl<? extends o02<? extends BaseSearchResult, ?>> d2 = this.f9358a.B().d();
            this.h = d2;
            d2.n(this.l);
            c();
            this.h.q("XslPageConfig_TopPaddingTop", Integer.valueOf(this.L));
            this.h.q("XslPageConfig_TopPaddingBottom", Integer.valueOf(this.N));
            this.h.q("XslPageConfig_FoldPaddingTop", Integer.valueOf(this.O));
            this.h.q("XslPageConfig_FoldPaddingBottom", Integer.valueOf(this.P));
            this.h.q("XslPageConfig_ListHeaderPaddingTop", Integer.valueOf(this.Q));
            this.h.q("XslPageConfig_ListHeaderPaddingBottom", Integer.valueOf(this.R));
            this.h.q("XslPageConfig_ListItemsPaddingTop", Integer.valueOf(this.S));
            this.h.q("XslPageConfig_ListItemsPaddingBottom", Integer.valueOf(this.T));
            this.h.q("XslPageConfig_ListFooterPaddingBottom", Integer.valueOf(this.U));
            this.h.q("XslPageConfig_ListFooterPaddingBottom", Integer.valueOf(this.V));
            this.h.q("XslPageConfig_ItemMargin", Integer.valueOf(this.X));
            this.h.q("XslPageConfig_ItemSpacing", Integer.valueOf(this.W));
            this.h.q("XslPageConfig_ColumnCount", Integer.valueOf(this.Y));
            this.h.q("XslPageConfig_ObserveSection", Boolean.valueOf(this.Z));
            e();
            this.h.q("XslPageConfig_PreventRequest", Boolean.valueOf(this.C));
            d dVar = e0;
            if (dVar != null) {
                ((SearchXslSdk.b) dVar).b(this, this.f9358a);
            }
            this.f9358a.subscribeEvent(this);
            this.f9358a.d2(this.y, this.A);
            this.f9358a.f2(this.B);
            this.f9358a.U1(this.z);
            this.f9358a.N1(this.G);
            this.f9358a.k0(this.H);
            this.f9358a.X1(this.I);
            this.f9358a.l0(this.J);
            this.f9358a.f1(new a());
            this.f9358a.A0(this.D);
            this.f9358a.Q1(new b());
            return this.f9358a.getView();
        }
        throw new IllegalStateException("XslModule can't create twice");
    }

    public void j() {
        XslDatasource xslDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38d8cca", new Object[]{this});
        } else if (this.f9358a != null && (xslDatasource = this.t) != null) {
            if (this.j) {
                d().l().d("XslModule", "InitSearch call twice");
                return;
            }
            this.j = true;
            if (this.i) {
                if (xslDatasource.getTotalSearchResult() == 0) {
                    d().l().b("XslModule", "BindPreload: not return yet");
                } else if (this.f9358a.T0()) {
                    d().l().b("XslModule", "BindPreload: already notified");
                } else {
                    d().l().b("XslModule", "BindPreload: fire after event");
                    this.t.triggerAfter(true, false, false);
                }
            } else if (!xslDatasource.isFirstSearchDone()) {
                if (this.C) {
                    c4p.D("[XS.xsl]", "First request for tab %d, params: %s", 0, "js request mtop, no param");
                    F(0, 1);
                } else if (!this.t.isJsParamReady()) {
                    d().l().d("XslModule", "JsParam not ready");
                } else {
                    this.t.doNewSearch();
                }
            }
        }
    }

    public void s0(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbbe58a", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        XslDatasource n = n(i);
        if (n == null && i != 0 && ((ArrayList) this.b).size() == 1 && !this.o && this.C) {
            n = n(0);
            this.o = true;
        }
        if (n == null) {
            c4p l = d().l();
            l.d("XslModule", "setRequestedData of null datasource: tab " + i);
            return;
        }
        n.setJsRequestEventFired(false);
        n.doNewSearch(jSONObject);
    }

    public void onEventMainThread(v5h v5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a439a3e7", new Object[]{this, v5hVar});
            return;
        }
        tee teeVar = this.p;
        if (teeVar != null) {
            ((XslMUSLayout.a) teeVar).c(v5hVar.f29792a, v5hVar.b, v5hVar.c, v5hVar.d);
        }
    }

    public void onEventMainThread(v7p v7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d511c488", new Object[]{this, v7pVar});
            return;
        }
        wee weeVar = this.q;
        if (weeVar != null) {
            ((XslMUSLayout.b) weeVar).a(v7pVar.f29841a, v7pVar.b, v7pVar.c);
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
            return;
        }
        XslDatasource xslDatasource = (XslDatasource) t2pVar.b();
        if (this.t == xslDatasource && xslDatasource.getTotalSearchResult() == xslDatasource.getLastSearchResult() && xslDatasource.getTotalSearchResult() != 0) {
            XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getTotalSearchResult();
            F0(xslSearchResult);
            this.t.setCurrentTabIndex(xslSearchResult.getDefaultTabIndex());
        }
        f fVar = this.d;
        if (fVar != null) {
            fVar.onDataLoaded(xslDatasource);
        }
    }

    public void onEventMainThread(qj9 qj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dafe3a5", new Object[]{this, qj9Var});
            return;
        }
        XslDatasource xslDatasource = this.t;
        if (xslDatasource != null && this.m != null) {
            y5p firstRequestPerf = xslDatasource.getFirstRequestPerf();
            this.m.setMonitorDetailDims("page_template_download_count", String.valueOf(firstRequestPerf.t));
            this.m.setMonitorDetailDims("page_template_download_succ_count", String.valueOf(firstRequestPerf.u));
            this.m.setMonitorDetailDims(MUSMonitor.DIMS_PAGE_DATA_PRELOAD, String.valueOf(this.i));
            this.m.setMonitorDetailTime("page_template_download_count", firstRequestPerf.t);
            this.m.setMonitorDetailTime("page_template_download_succ_count", firstRequestPerf.u);
            this.m.setMonitorDetailTime(MUSMonitor.KEY_PAGE_TEMPLATE_DOWNLOAD_TIME, firstRequestPerf.s);
            if (!(qj9Var.d() == 0 || qj9Var.a() == 0)) {
                this.m.setMonitorDetailTime(MUSMonitor.KEY_PAGE_FIRST_SCREEN_TIME, qj9Var.a() - qj9Var.d());
            }
            this.m.setMonitorDetailTime(MUSMonitor.KEY_PAGE_MTOP_TIME, firstRequestPerf.j);
            if (this.i && qj9Var.d() != 0) {
                this.m.setMonitorDetailTime(MUSMonitor.KEY_PAGE_CONTAINER_TO_PRELOAD_START, firstRequestPerf.g - qj9Var.d());
                this.m.setMonitorDetailTime(MUSMonitor.KEY_PAGE_CONTAINER_TO_PRELOAD_FINISH, firstRequestPerf.h - qj9Var.d());
            }
        }
    }
}
