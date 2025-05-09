package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ali.adapt.api.AtlasServiceFinder;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.ultron.trade.presenter.BaseViewManager;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.pa3;
import tb.ta3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vc3 extends kmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CART_IMAGE_CODE = 32;
    public static final int REQUEST_ADD_ADDRESS = 50101;
    public static final int REQUEST_ALI_PAY_SERVICE = 50103;
    public static final int REQUEST_CHANGE_ADDRESS = 50102;
    public static final String sStreamNextRpcServiceName = "nextrpc-CARTS2";
    public final spq j;
    public ViewManager k;
    public final zxb l;
    public Fragment m;
    public final QueryParamsManager n;
    public final ml1 o = new ml1(this);
    public final HandlerThread p;
    public final Handler q;
    public g8e r;
    public f8e s;
    public boolean t;
    public blq u;
    public rc8 v;
    public y0n w;
    public f4p x;
    public vqm y;
    public AbilityHubAdapter z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1000274106) {
                return new Boolean(super.e(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/CartPresenter$1");
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
                ((RecyclerView) vc3.this.k.o()).scrollToPosition(0);
            }
        }

        @Override // tb.ux
        public boolean e(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
            }
            return super.e(i, mtopResponse, obj);
        }
    }

    static {
        t2o.a(479199238);
    }

    public vc3(Activity activity) {
        super(activity);
        ob7.a();
        F(c9x.CART_BIZ_NAME);
        zxb p0 = p0();
        this.l = p0;
        QueryParamsManager queryParamsManager = new QueryParamsManager(activity);
        this.n = queryParamsManager;
        if (!TextUtils.isEmpty(queryParamsManager.i())) {
            p0.W(queryParamsManager.i());
        }
        HandlerThread handlerThread = new HandlerThread("CartPresenter");
        this.p = handlerThread;
        handlerThread.start();
        this.q = new Handler(handlerThread.getLooper());
        spq spqVar = (spq) uc3.b(td3.class, true);
        this.j = spqVar;
        if (spqVar == null) {
            C(sStreamNextRpcServiceName);
        }
    }

    public static /* synthetic */ Object ipc$super(vc3 vc3Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1830026766:
                super.z();
                return null;
            case -1752024028:
                super.p((ct1) objArr[0], (BaseViewManager) objArr[1]);
                return null;
            case -1504501726:
                super.t();
                return null;
            case -955969416:
                super.A();
                return null;
            case -71028999:
                super.q();
                return null;
            case -65622212:
                super.B();
                return null;
            case 1257714799:
                super.s(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1498349754:
                return super.m();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/CartPresenter");
        }
    }

    @Override // tb.kz1
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7051078", new Object[]{this});
            return;
        }
        ta3.a aVar = (ta3.a) uc3.b(ta3.class, true);
        if (aVar == null) {
            super.A();
            return;
        }
        for (Map.Entry<String, sn7> entry : aVar.c().entrySet()) {
            this.k.X(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Long, qub> entry2 : aVar.d().entrySet()) {
            this.k.Z(entry2.getKey().longValue(), entry2.getValue());
        }
    }

    @Override // tb.kz1
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc16af3c", new Object[]{this});
            return;
        }
        Boolean bool = (Boolean) uc3.b(he3.class, true);
        if (bool == null || !bool.booleanValue()) {
            super.B();
        }
    }

    @Override // tb.kmb
    public void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7a8667", new Object[]{this, new Boolean(z)});
        } else if (ykl.a()) {
            DinamicXEngine j0 = this.k.j0();
            if (!(j0 == null || j0.d() == null)) {
                if (z != this.t) {
                    pb6.g(true);
                    j0.k1();
                }
                j0.d().b(z, z);
                this.t = z;
            }
            this.k.t().h1(DXWidgetNode.DXMeasureSpec.c(TBAutoSizeConfig.x().H(this.f23014a), 1073741824));
        }
    }

    @Override // tb.kmb
    public AbilityHubAdapter K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("5c734b22", new Object[]{this});
        }
        if (this.z == null) {
            this.z = new AbilityHubAdapter(new zq(c9x.CART_BIZ_NAME, "cart").a(this.f23014a));
        }
        return this.z;
    }

    @Override // tb.kmb
    @Deprecated
    public Handler L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[]{this});
        }
        return this.q;
    }

    @Override // tb.kmb
    public ml1 M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ml1) ipChange.ipc$dispatch("52da9ea1", new Object[]{this});
        }
        return this.o;
    }

    @Override // tb.kmb
    /* renamed from: P */
    public zxb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("3f86e862", new Object[]{this});
        }
        return this.l;
    }

    @Override // tb.kmb
    public rc8 Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rc8) ipChange.ipc$dispatch("67ec55c3", new Object[]{this});
        }
        if (this.v == null) {
            this.v = new rc8(this);
        }
        return this.v;
    }

    @Override // tb.kmb
    public Fragment R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        return this.m;
    }

    @Override // tb.kmb
    public f8e S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8e) ipChange.ipc$dispatch("339f2605", new Object[]{this});
        }
        return this.s;
    }

    @Override // tb.kmb
    public g8e T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g8e) ipChange.ipc$dispatch("8d4a648f", new Object[]{this});
        }
        return this.r;
    }

    @Override // tb.kmb
    public vqm U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqm) ipChange.ipc$dispatch("b40a4d7e", new Object[]{this});
        }
        if (this.y == null) {
            this.y = new vqm(this);
        }
        return this.y;
    }

    @Override // tb.kmb
    public y0n V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0n) ipChange.ipc$dispatch("87fb7b67", new Object[]{this});
        }
        if (this.w == null) {
            this.w = new y0n(this);
        }
        return this.w;
    }

    @Override // tb.kmb
    public QueryParamsManager W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QueryParamsManager) ipChange.ipc$dispatch("45979145", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.kmb
    public f4p X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4p) ipChange.ipc$dispatch("2d756ed5", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new f4p(this);
        }
        return this.x;
    }

    @Override // tb.kmb
    public blq Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (blq) ipChange.ipc$dispatch("6d4e4f1a", new Object[]{this});
        }
        if (this.u == null) {
            this.u = new blq(this);
        }
        return this.u;
    }

    @Override // tb.kmb
    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff38b7d7", new Object[]{this})).booleanValue();
        }
        if (!this.n.w() || this.n.u() || !this.l.J() || this.n.b()) {
            return false;
        }
        return true;
    }

    @Override // tb.fdd
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return c9x.CART_BIZ_NAME;
    }

    @Override // tb.kmb
    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14b46de", new Object[]{this});
        } else if (this.k == null) {
            ViewManager q0 = q0();
            this.k = q0;
            p(this.l, q0);
        }
    }

    @Override // tb.kmb
    public void d0(ux uxVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fc0932", new Object[]{this, uxVar, new Boolean(z)});
        } else if (b0()) {
            RequestConfig D = new RequestConfig().D(RequestConfig.RequestType.LOAD_CACHE_DATA);
            if (z) {
                str = f7h.ASYNC_BIZ;
            } else {
                str = null;
            }
            this.l.S(D.B(str).v(false), uxVar);
        } else if (uxVar != null) {
            uxVar.a(-2, null, null, false, null);
        }
    }

    @Override // tb.kmb
    public void e0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0546d23", new Object[]{this, new Boolean(z)});
        } else {
            f0(z, null, null);
        }
    }

    @Override // tb.kmb
    public void g0(yc3 yc3Var, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aff0fee", new Object[]{this, yc3Var, uxVar});
            return;
        }
        i();
        this.l.S(new RequestConfig().D(RequestConfig.RequestType.QUERY_CART_PAGE).t(yc3Var.a()).x(yc3Var.c()).C(yc3Var.d()).u(true).w(yc3Var.b()).v(yc3Var.e()), uxVar);
    }

    @Override // tb.kmb, tb.kz1, tb.fdd
    public Activity getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.f23014a;
    }

    @Override // tb.kmb
    public void h0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652262d6", new Object[]{this, new Boolean(z)});
        } else {
            i0(z, null, null);
        }
    }

    @Override // tb.kmb
    @Deprecated
    public void i0(boolean z, Map<String, String> map, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2507844", new Object[]{this, new Boolean(z), map, uxVar});
            return;
        }
        yc3 yc3Var = new yc3();
        yc3Var.f(map);
        yc3Var.i(z);
        g0(yc3Var, uxVar);
    }

    @Override // tb.kmb
    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20120454", new Object[]{this});
        } else {
            i0(true, null, new a());
        }
    }

    @Override // tb.kmb
    public void k0(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26931385", new Object[]{this, iDMComponent, lcuVar, new Boolean(z), uxVar, obj});
        } else {
            this.l.S(new RequestConfig().D(RequestConfig.RequestType.UPDATE).s(iDMComponent).F(lcuVar).v(z).B(obj), uxVar);
        }
    }

    @Override // tb.kmb
    public void l0(fe3 fe3Var, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eeac2", new Object[]{this, fe3Var, uxVar});
        } else {
            this.l.S(new RequestConfig().D(RequestConfig.RequestType.UPDATE).s(fe3Var.f()).F(fe3Var.b()).v(fe3Var.e()).w(fe3Var.c()).B(fe3Var.d()).t(fe3Var.a()), uxVar);
        }
    }

    @Override // tb.kz1
    public spq m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spq) ipChange.ipc$dispatch("594f00ba", new Object[]{this});
        }
        spq spqVar = this.j;
        if (spqVar == null) {
            return super.m();
        }
        return spqVar;
    }

    @Override // tb.kmb
    public void m0(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ddd551", new Object[]{this, fragment});
        } else {
            this.m = fragment;
        }
    }

    @Override // tb.kz1
    public void n(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5e7e5e", new Object[]{this, iDMComponent, str});
        } else if ("exposureItem".equals(str)) {
            ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
            if (extMap.get(ml1.EXPOSURE_ONCE_KEY) == null) {
                extMap.put(ml1.EXPOSURE_ONCE_KEY, Boolean.TRUE);
                this.o.e(iDMComponent, str);
            }
        } else {
            this.o.c(iDMComponent, str);
        }
    }

    @Override // tb.kmb
    public void n0(f8e f8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12117e31", new Object[]{this, f8eVar});
        } else {
            this.s = f8eVar;
        }
    }

    @Override // tb.kmb
    public void o0(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f44fa8", new Object[]{this, iDMComponent, lcuVar, new Boolean(z), uxVar, obj});
        } else {
            this.l.S(new RequestConfig().D(RequestConfig.RequestType.UPDATE_STRUCTURE).s(iDMComponent).F(lcuVar).v(z).B(obj), uxVar);
        }
    }

    @Override // tb.kz1
    public void p(ct1 ct1Var, BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97923c24", new Object[]{this, ct1Var, baseViewManager});
            return;
        }
        super.p(ct1Var, baseViewManager);
        this.k.t().T0(zxb.class, this.l);
        this.k.t().T0(kmb.class, this);
        t0(this.k);
        u0();
        s0();
    }

    public final zxb p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("c89a16fc", new Object[]{this});
        }
        return new com.alibaba.android.icart.core.data.a(this);
    }

    @Override // tb.kz1
    public void q() {
        Map map = (Map) uc3.b(cb3.class, true);
        if (map == null || map.isEmpty()) {
            super.q();
            Map<String, Class<? extends qtd>> a2 = bb3.a();
            if (a2 != null && !a2.isEmpty()) {
                try {
                    for (Map.Entry<String, Class<? extends qtd>> entry : a2.entrySet()) {
                        this.e.n(entry.getKey(), (qtd) entry.getValue().newInstance());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } else {
            Map map2 = (Map) map.get("ultron");
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    this.e.c((String) entry2.getKey(), (qtd) entry2.getValue());
                }
            }
            Map map3 = (Map) map.get("cart");
            if (map3 != null) {
                for (Map.Entry entry3 : map3.entrySet()) {
                    this.e.n((String) entry3.getKey(), (qtd) entry3.getValue());
                }
            }
        }
    }

    public final ViewManager q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewManager) ipChange.ipc$dispatch("7706ddfd", new Object[]{this});
        }
        return new ViewManager(this, sa3.g(this.f23014a, W().w()));
    }

    public final boolean r0(int i, int i2, Intent intent) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c10b3c", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
        }
        if ((i == 101 || i == 102) && i2 == 10001) {
            this.l.B().S(true);
            juv.d(this, "Page_ShoppingCart_Notification", new String[0]);
            return true;
        } else if (50101 == i && i2 == -1) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            String string = extras.getString(gf0.K_DELIVERY_ID);
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            ziq.c().d(string);
            j0();
            return true;
        } else {
            if (50102 == i && i2 == -1) {
                String stringExtra = intent.getStringExtra("data");
                if (!TextUtils.isEmpty(stringExtra) && (parseObject = JSON.parseObject(stringExtra)) != null && parseObject.containsKey(sf0.K_DELIVERY_ID)) {
                    String string2 = parseObject.getString(sf0.K_DELIVERY_ID);
                    if (TextUtils.isEmpty(string2)) {
                        return false;
                    }
                    ziq.c().d(string2);
                    j0();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // tb.kz1
    public void s(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (!r0(i, i2, intent)) {
            super.s(i, i2, intent);
            lcu d = this.e.d();
            d.m("requestCode", Integer.valueOf(i));
            d.m("resultCode", Integer.valueOf(i2));
            d.m("data", intent);
            d.l("cart_activity_result");
            this.e.h(d);
        }
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b197e383", new Object[]{this});
            return;
        }
        try {
            AtlasServiceFinder.getInstance().registerService(n2e.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.TBBuyNavProcessor");
        } catch (Exception e) {
            UnifyLog.e("CartPresenter", "initNavProcess failed:" + e.toString());
        }
    }

    @Override // tb.kz1
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.t();
        ViewManager viewManager = this.k;
        if (viewManager != null) {
            viewManager.A();
            try {
                this.k.t().Q().b().k().m();
            } catch (Throwable unused) {
                hav.a("CartPresenter", "清理预渲染缓存失败");
            }
        }
        HandlerThread handlerThread = this.p;
        if (handlerThread != null) {
            try {
                handlerThread.quitSafely();
            } catch (Exception unused2) {
            }
        }
        zxb zxbVar = this.l;
        if (zxbVar != null) {
            zxbVar.N();
        }
        H();
        I();
        uc3.a();
        qbv.j().p().b("");
    }

    public final void t0(ViewManager viewManager) {
        jo7 Q;
        DinamicXEngine k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e747369", new Object[]{this, viewManager});
            return;
        }
        ViewEngine t = viewManager.t();
        if (t != null && (Q = t.Q()) != null && (k = Q.b().k()) != null) {
            k.T0(new qa6());
        }
    }

    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896bc3f2", new Object[]{this});
        } else {
            D(BundleLineComponent.COMPONENT_TAG, ea3.CREATOR);
        }
    }

    public void v0(g8e g8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c706057d", new Object[]{this, g8eVar});
        } else {
            this.r = g8eVar;
        }
    }

    @Override // tb.kz1
    public bpt w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpt) ipChange.ipc$dispatch("ed111d4e", new Object[]{this});
        }
        return (bpt) uc3.b(ae3.class, true);
    }

    @Override // tb.kz1
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ec01f2", new Object[]{this});
            return;
        }
        pa3.a aVar = (pa3.a) uc3.b(pa3.class, true);
        if (aVar == null) {
            super.z();
            for (Map.Entry<Long, evb> entry : pa3.g().entrySet()) {
                this.k.Y(entry.getKey().longValue(), entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : ((HashMap) aVar.f25972a).entrySet()) {
            this.k.Y(((Long) entry2.getKey()).longValue(), (evb) entry2.getValue());
        }
        for (Map.Entry entry3 : ((HashMap) aVar.b).entrySet()) {
            this.k.W((String) entry3.getKey(), (av) entry3.getValue());
        }
    }

    @Override // tb.kmb
    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2688be", new Object[]{this});
            return;
        }
        hav.d("CartPresenter", "登录成功，准备刷新界面");
        this.l.W("");
        this.l.B().a();
        if (this.m.isResumed()) {
            hav.d("CartPresenter", "登录成功，界面可见，刷新界面");
            h0(true);
            return;
        }
        hav.d("CartPresenter", "登录成功，界面不可见，设置刷新标识，延迟刷新");
        this.l.B().S(true);
    }

    @Override // tb.kmb
    public void f0(boolean z, Map<String, String> map, ux uxVar) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96679557", new Object[]{this, new Boolean(z), map, uxVar});
            return;
        }
        RequestConfig v = new RequestConfig().D(RequestConfig.RequestType.QUERY_CART_NEXT_PAGE).t(map).A(map != null && "true".equals(map.get(RequestConfig.IS_PRE_LOADV2))).v(z);
        if (map == null || !"true".equals(map.get(RequestConfig.IS_POP_LAYER_FIRST_PAGE))) {
            z2 = false;
        }
        this.l.S(v.z(z2), uxVar);
    }

    @Override // tb.kz1
    public void x(fsb fsbVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2868fc", new Object[]{this, fsbVar});
            return;
        }
        kcu d = this.l.d();
        if (fsbVar instanceof u55) {
            u55 u55Var = (u55) fsbVar;
            z = u55Var.O();
            if (d != null) {
                d.g(u55Var);
            }
        }
        this.k.C(d, new bd3().f(z).e(true).i(vav.a(c9x.CART_BIZ_NAME, "skipItemRenderWhenDataNotChangedOfAttachResponse", true)).h(vav.a(c9x.CART_BIZ_NAME, "enableRebuildWhenIdleOfAttachResponse", true)));
    }
}
