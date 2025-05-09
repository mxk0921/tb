package tb;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xap extends iy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean e = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ux b;
        public final /* synthetic */ RequestConfig c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ux uxVar, ux uxVar2, RequestConfig requestConfig) {
            super(uxVar);
            this.b = uxVar2;
            this.c = requestConfig;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendQueryRequest$1");
        }

        @Override // tb.o3o, tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
            xap.this.d.Y().g(mtopResponse);
            if (mtopResponse != null && !xap.this.d(mtopResponse, map)) {
                if ((xap.this.e() || xap.this.f()) && !fsbVar.d()) {
                    xap.this.d.U().e();
                }
                if (xap.this.f21638a.K()) {
                    xap.this.f21638a.X(true);
                }
                fq3.b(xap.this.f21638a, fsbVar);
                u55 u55Var = (u55) xap.this.f21638a.c();
                if ((u55Var == null || !u55Var.d()) && (!map.containsKey("isCachaData") || !"true".equals(map.get("isCachaData")))) {
                    String t = sca.t(xap.this.f21638a);
                    if (!TextUtils.isEmpty(t)) {
                        fdv.c("SendQueryRequest", fdv.F_NETWORK_REQUEST, "WAKEUP_ERROR", t, xap.this.d.W().g());
                        xap.this.d.W().x();
                        be3.c(xap.this.b, t);
                    }
                }
                xap.this.d.V().g();
                xap xapVar = xap.this;
                xap.l(xapVar, fsbVar, xapVar.b);
                xap.m(xap.this);
                xap.this.h(this.c);
            }
        }

        @Override // tb.o3o, tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.a(i, mtopResponse, obj, z, map);
            }
            if (mtopResponse != null && !xap.this.d(mtopResponse, map)) {
                u55 u55Var = (u55) xap.this.f21638a.c();
                if ((u55Var == null || !u55Var.d() || xap.this.f21638a.B().f() != null) && (map == null || !map.containsKey("isCachaData") || !"true".equals(map.get("isCachaData")))) {
                    if (this.c.l() && !xap.k().getAndSet(true)) {
                        z2 = true;
                    }
                    xap.this.d.Y().f(1, mtopResponse, !z2, z2);
                    return;
                }
                xap.this.f21638a.s();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xap.n(xap.this);
            }
        }
    }

    static {
        t2o.a(479199331);
    }

    public xap(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(xap xapVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendQueryRequest");
    }

    public static /* synthetic */ AtomicBoolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ void l(xap xapVar, fsb fsbVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89bf412", new Object[]{xapVar, fsbVar, context});
        } else {
            xapVar.u(fsbVar, context);
        }
    }

    public static /* synthetic */ void m(xap xapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f080fd", new Object[]{xapVar});
        } else {
            xapVar.o();
        }
    }

    public static /* synthetic */ void n(xap xapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1842107e", new Object[]{xapVar});
        } else {
            xapVar.v();
        }
    }

    public static String p() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5b7ba7e", new Object[0]);
        }
        try {
            str = CookieManager.getInstance().getCookie(h1p.TMALL_HOST);
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(?:^|;)\\s*sm4=([^;]*)").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // tb.jod
    public String a(RequestConfig requestConfig, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523b998e", new Object[]{this, requestConfig, uxVar});
        }
        juv.d(this.d, "Page_ShoppingCart_Query", new String[0]);
        this.f21638a.B().R(true);
        this.f21638a.B().F(cb4.C(this.f21638a.c()));
        b3o t = t();
        t.v(requestConfig.e());
        cs1 r = r(t);
        r.a(s(requestConfig));
        r.h(new a(uxVar, uxVar, requestConfig), null, null);
        return r.f();
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4256310", new Object[]{this});
        } else if (vav.a(c9x.CART_BIZ_NAME, "asyncShowPopWhenQueryRequest", true)) {
            pav.k(new b());
        } else {
            v();
        }
    }

    public HashMap<String, String> s(RequestConfig requestConfig) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d6848b9", new Object[]{this, requestConfig});
        }
        Map<String, String> c = requestConfig.c();
        QueryParamsManager W = this.f21638a.x().W();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String c2 = o6g.c(this.f21638a.x().getContext());
            String q = q(W.f());
            JSONObject jSONObject = new JSONObject();
            i(jSONObject, requestConfig);
            if (!TextUtils.isEmpty(c2)) {
                jSONObject.put("shopIdInfoStr", (Object) c2);
            }
            if (!TextUtils.isEmpty(q)) {
                jSONObject.put("divisionCode", (Object) q);
            }
            if (W.t()) {
                jSONObject.put(RequestConfig.IS_FULL_DATA_QUERY, "true");
            }
            if (W.w() && !W.u()) {
                if (!CheckHoldManager.i().f().isEmpty()) {
                    jSONObject.put("iCheckedCartIds", (Object) CheckHoldManager.i().g());
                }
                if (!CheckHoldManager.i().l().isEmpty()) {
                    jSONObject.put("iCheckedCartIdsForRepeatBuy", (Object) CheckHoldManager.i().l());
                }
            }
            if (c != null) {
                jSONObject.putAll(RequestConfig.a(c));
            }
            if (this.f21638a.L()) {
                jSONObject.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
            }
            if (!sca.x(this.f21638a)) {
                IDMComponent u = this.f21638a.u("submit");
                if (!(u == null || (fields = u.getFields()) == null || !"true".equals(fields.getString("isChecked")))) {
                    jSONObject.put("isSubmitChecked", "true");
                }
            } else if (this.f21638a.B().v() && !"repeatBuy".equals(this.f21638a.y())) {
                jSONObject.put("isSubmitChecked", "true");
            }
            if (requestConfig.l()) {
                jSONObject.put("onceCustomExParams", (Object) this.d.W().n());
            }
            if (ic3.c() && !this.f21638a.F()) {
                jSONObject.put(RequestConfig.NO_CACHE_OF_FIRST_PAGE, "true");
            }
            hashMap.put("exParams", jSONObject.toJSONString());
        } catch (Throwable th) {
            UnifyLog.m(((vc3) this.f21638a.x()).c(), "SendQueryRequest", "getOtherParams exception: ", th.getMessage());
        }
        return hashMap;
    }

    public b3o t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("2a03a206", new Object[]{this});
        }
        return zs6.e(this.d);
    }

    public final void u(fsb fsbVar, Context context) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24da744", new Object[]{this, fsbVar, context});
            return;
        }
        JSONObject i = fsbVar.i();
        if (i != null && (jSONObject = i.getJSONObject("feature")) != null && (jSONObject2 = jSONObject.getJSONObject("otherParams")) != null) {
            String string = jSONObject2.getString("dataTracks");
            if (!TextUtils.isEmpty(string) && context != null) {
                UTABTest.activateServer(string, context);
            }
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff867c9b", new Object[]{this});
            return;
        }
        try {
            JSONObject popWindow = this.f21638a.w().getControlParas().getPopWindow();
            if (popWindow != null) {
                String string = popWindow.getString("url");
                if (!TextUtils.isEmpty(string)) {
                    xq0.c().a(this.b).c(string);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9fa274", new Object[]{str});
        }
        if (QueryParamsManager.TMALL_MARKET_CART_FROM.equalsIgnoreCase(str) || vav.a(c9x.CART_BIZ_NAME, "extractDivisionCode", false)) {
            return p();
        }
        return null;
    }

    public cs1 r(b3o b3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cs1) ipChange.ipc$dispatch("c8d050ef", new Object[]{this, b3oVar});
        }
        zxb zxbVar = this.f21638a;
        s7n s7nVar = new s7n(zxbVar, zxbVar.x().getContext(), b3oVar, "query");
        s7nVar.c().x(false).r(true);
        return s7nVar;
    }
}
