package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.bf3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ff3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASYNC_PAY_FLAG = "aysnV2";
    public static final a Companion = new a(null);
    public static final String DEFAULT_LOADING_TEXT = "支付中";
    public static final String KEY_CASHIER_PARAM = "cashierParam";
    public static final String KEY_DX_PAGE_DATA = "pageData";
    public static final String ORDER_LIST_ALL = "http://tm.m.taobao.com/list.htm?OrderListType=total_orders";

    /* renamed from: a  reason: collision with root package name */
    public final if3 f19247a;
    public final Activity b;
    public final HashMap<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements a8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ u1a b;

        public b(u1a u1aVar) {
            this.b = u1aVar;
        }

        @Override // tb.a8d
        public void a(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34ccc958", new Object[]{this, str, payResultInfo});
            } else {
                ckf.g(payResultInfo, "info");
            }
        }

        @Override // tb.a8d
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ee48ca9", new Object[]{this, str});
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "executePay: step5 异步支付回调去收银台");
            ff3 ff3Var = ff3.this;
            bf3.l("异步支付降级", 3, (String) ff3.h(ff3.this).get("from"), ff3.g(ff3Var, ff3.a(ff3Var)));
            this.b.invoke(str, ff3.a(ff3.this));
        }

        @Override // tb.a8d
        public void b(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf1415f2", new Object[]{this, str, payResultInfo});
                return;
            }
            ckf.g(payResultInfo, "info");
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "executePay: step5 异步支付回调失败");
            ff3 ff3Var = ff3.this;
            bf3.l("异步支付失败", 2, (String) ff3.h(ff3.this).get("from"), ff3.g(ff3Var, ff3.a(ff3Var)));
            ff3.b(ff3.this).finish();
        }

        @Override // tb.a8d
        public void c(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809cdc6b", new Object[]{this, str, payResultInfo});
                return;
            }
            ckf.g(payResultInfo, "info");
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "executePay: step5 异步支付回调成功");
            ff3 ff3Var = ff3.this;
            bf3.l("异步支付成功", 1, (String) ff3.h(ff3.this).get("from"), ff3.g(ff3Var, ff3.a(ff3Var)));
            ff3.b(ff3.this).finish();
        }
    }

    public ff3(Activity activity, HashMap<String, String> hashMap) {
        ckf.g(activity, "context");
        ckf.g(hashMap, "params");
        this.b = activity;
        this.c = hashMap;
        String str = hashMap.get("cashierParam");
        if (str != null) {
            JSONObject parseObject = JSON.parseObject(str);
            ckf.f(parseObject, "JSONObject.parseObject(it)");
            this.f19247a = e(parseObject);
        }
    }

    public static final /* synthetic */ if3 a(ff3 ff3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (if3) ipChange.ipc$dispatch("efc2352e", new Object[]{ff3Var});
        }
        return ff3Var.f19247a;
    }

    public static final /* synthetic */ Activity b(ff3 ff3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5baf18fc", new Object[]{ff3Var});
        }
        return ff3Var.b;
    }

    public static final /* synthetic */ String g(ff3 ff3Var, if3 if3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d954ae69", new Object[]{ff3Var, if3Var});
        }
        return ff3Var.j(if3Var);
    }

    public static final /* synthetic */ HashMap h(ff3 ff3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f8164ac", new Object[]{ff3Var});
        }
        return ff3Var.c;
    }

    public final PayRequest c(if3 if3Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayRequest) ipChange.ipc$dispatch("a6338663", new Object[]{this, if3Var});
        }
        PayRequest payRequest = new PayRequest();
        payRequest.setActionParams(this.c.get("signStr"));
        payRequest.setOrderIds(this.c.get("orderids"));
        HashMap<String, String> hashMap = this.c;
        payRequest.setFrom(hashMap.get(hashMap.get("from")));
        payRequest.setSuccessUrl(this.c.get("backURL"));
        payRequest.setUnSuccessUrl(ORDER_LIST_ALL);
        payRequest.setExtAttrMap(this.c);
        payRequest.setNextAction(PayRequest.CALL_ASYNC_QUERY);
        payRequest.setSearchConfig(if3Var.e());
        payRequest.setLoadingText(if3Var.b());
        g1p e = if3Var.e();
        if ((e != null ? e.g() : null) != null) {
            payRequest.setInstitutionCode(if3Var.e().g());
        } else {
            k6z a2 = if3Var.a();
            if (a2 == null || (str = a2.b()) == null) {
                str = "unknown";
            }
            payRequest.setInstitutionCode(str);
        }
        return payRequest;
    }

    public final void d(u1a<? super String, ? super if3, ? extends Object> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fbbe1f", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "executeOriPay");
        if3 if3Var = this.f19247a;
        if (if3Var == null) {
            u1aVar.invoke(null, if3Var);
        } else if (ckf.b(if3Var.c(), ASYNC_PAY_FLAG)) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "executePay: step1 开启异步支付");
            i();
            df3 df3Var = new df3();
            Activity activity = this.b;
            if3 if3Var2 = this.f19247a;
            ckf.d(if3Var2);
            df3Var.d(activity, c(if3Var2), new b(u1aVar));
        } else {
            u1aVar.invoke(null, this.f19247a);
        }
    }

    public final Map<String, String> f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddd3c4ed", new Object[]{this, jSONObject});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : jSONObject.keySet()) {
            ckf.f(str, "key");
            String string = jSONObject.getString(str);
            ckf.f(string, "this.getString(key)");
            linkedHashMap.put(str, string);
        }
        return linkedHashMap;
    }

    public final String j(if3 if3Var) {
        k6z a2;
        String b2;
        g1p e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("893f889d", new Object[]{this, if3Var});
        }
        if (((if3Var == null || (e = if3Var.e()) == null) ? null : e.g()) != null) {
            return if3Var.e().g();
        }
        return (if3Var == null || (a2 = if3Var.a()) == null || (b2 = a2.b()) == null) ? "unknown" : b2;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fe7420", new Object[]{this});
            return;
        }
        h15 tag = bf3.a.a("cashdesk_pv").tag("异步支付");
        String str = this.c.get("from");
        if (str == null) {
            str = "";
        }
        bf3.f(tag.dimension("d1", str).dimension("d2", j(this.f19247a)).sampling(1.0f));
        bf3.l("异步支付PV", 0, this.c.get("from"), j(this.f19247a));
    }

    public final if3 e(JSONObject jSONObject) {
        Map<String, String> linkedHashMap;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (if3) ipChange.ipc$dispatch("9f19f85a", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("payType");
        String str = null;
        String str2 = string != null ? string : null;
        String string2 = jSONObject.getString("loadingText");
        if (string2 == null) {
            string2 = DEFAULT_LOADING_TEXT;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("searchConfig");
        if (jSONObject3 == null) {
            jSONObject3 = null;
        }
        String string3 = jSONObject3 != null ? jSONObject3.getString("api") : null;
        String string4 = jSONObject3 != null ? jSONObject3.getString("version") : null;
        if (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("params")) == null || (linkedHashMap = f(jSONObject2)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Integer valueOf = jSONObject3 != null ? Integer.valueOf(jSONObject3.getIntValue("retryTimes")) : null;
        Long valueOf2 = jSONObject3 != null ? Long.valueOf(jSONObject3.getLongValue("retryInterval")) : null;
        Long valueOf3 = jSONObject3 != null ? Long.valueOf(jSONObject3.getLongValue(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME)) : null;
        String string5 = jSONObject3 != null ? jSONObject3.getString("institutionCode") : null;
        JSONObject jSONObject4 = jSONObject.getJSONObject("sdkExtParams");
        if (jSONObject4 == null) {
            jSONObject4 = null;
        }
        JSONObject a2 = cf3.a(jSONObject.getString("extStr"));
        String string6 = a2 != null ? a2.getString("payType") : null;
        JSONObject jSONObject5 = a2 != null ? a2.getJSONObject("fields") : null;
        if (a2 != null) {
            str = a2.getString("institutionCode");
        }
        return new if3(str2, new g1p(string3, string4, linkedHashMap, valueOf, valueOf2, valueOf3, string5), string2, jSONObject4, new k6z(string6, jSONObject5, str));
    }
}
