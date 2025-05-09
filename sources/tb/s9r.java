package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavInterface;
import com.taobao.android.purchase.core.Alipay;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.icu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s9r implements gfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27886a;
    public final mud b;
    public final jud c;
    public AURAGlobalData d;
    public aan e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ icu f27887a;

        public a(icu icuVar) {
            this.f27887a = icuVar;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            this.f27887a.f();
            wol.a(s9r.d(s9r.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements icu.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ icu f27888a;

        public b(icu icuVar) {
            this.f27888a = icuVar;
        }

        @Override // tb.icu.d
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            this.f27888a.f();
            s9r.e(s9r.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.a8d
        public void a(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34ccc958", new Object[]{this, str, payResultInfo});
            } else {
                hh.d(s9r.d(s9r.this));
            }
        }

        @Override // tb.a8d
        public void b(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf1415f2", new Object[]{this, str, payResultInfo});
            } else {
                hh.d(s9r.d(s9r.this));
            }
        }

        @Override // tb.a8d
        public void c(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809cdc6b", new Object[]{this, str, payResultInfo});
            } else {
                hh.d(s9r.d(s9r.this));
            }
        }

        @Override // tb.a8d
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ee48ca9", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ icu f27890a;

        public d(icu icuVar) {
            this.f27890a = icuVar;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            this.f27890a.f();
            s9r.e(s9r.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ icu f27891a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Context c;

        public e(icu icuVar, JSONObject jSONObject, Context context) {
            this.f27891a = icuVar;
            this.b = jSONObject;
            this.c = context;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            this.f27891a.f();
            s9r.e(s9r.this);
            xq0.c().a(this.c).c(this.b.getJSONObject("data").getString("errorTipUrl"));
        }
    }

    static {
        t2o.a(708837553);
        t2o.a(301990024);
    }

    public s9r(Context context, mud mudVar, jud judVar) {
        this.f27886a = context;
        this.b = mudVar;
        this.c = judVar;
    }

    public static /* synthetic */ Context d(s9r s9rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8d680573", new Object[]{s9rVar});
        }
        return s9rVar.f27886a;
    }

    public static /* synthetic */ void e(s9r s9rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9559a3da", new Object[]{s9rVar});
        } else {
            s9rVar.n();
        }
    }

    @Override // tb.gfb
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e227d9d", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            ck.g().e("[TBBuySubmitCallback]jsonObject is null");
        } else {
            boolean booleanValue = jSONObject.getBoolean("partSuccess").booleanValue();
            String string = jSONObject.getString("overrideUrl");
            if (booleanValue) {
                l();
            } else if (!TextUtils.isEmpty(string)) {
                k(string, jSONObject);
            } else {
                String r = r();
                String string2 = jSONObject.getString("cashierType");
                Map<String, String> i = i(jSONObject, r);
                if (PayRequest.CALL_WEIXIN_SDK.equals(string2) || PayRequest.CALL_LAUNCH_CASHIER_PAGE.equals(string2)) {
                    m(string2, i);
                } else {
                    w(i);
                }
            }
            aan aanVar = this.e;
            if (aanVar != null) {
                aanVar.g(jSONObject);
            }
        }
    }

    @Override // tb.gfb
    public void b(mi miVar, boolean z) {
        Map<String, Object> d2;
        MtopResponse e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77068ba4", new Object[]{this, miVar, new Boolean(z)});
        } else if (miVar != null && !z && "AURANextRPCServiceDomain".equals(miVar.c()) && (d2 = miVar.d()) != null) {
            Object obj = d2.get("NextRPCRemoteResponse");
            if ((obj instanceof kk) && (e2 = ((kk) obj).e()) != null) {
                String retCode = e2.getRetCode();
                JSONObject p = p(e2);
                JSONObject o = o(miVar);
                String string = o.getString("errorMsg");
                String string2 = o.getString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE);
                if ("BUYER_ALIPAY_NOT_FOUND".equals(retCode)) {
                    if (p != null) {
                        Alipay.a(this.f27886a, p);
                    }
                    n();
                } else if (!u(retCode, p)) {
                    if ("FAIL_SYS_UNIT_PROTECT".equals(retCode)) {
                        string = k5n.FAIL_SYS_UNIT_PROTECT_TIP;
                    } else if (retCode.equals("-202AEC10001") || retCode.equals("200AES20001")) {
                        string = k5n.ERROR_MSG_NETWORK_TIMEOUT;
                    }
                    if (!y8r.c() || !(this.f27886a instanceof Activity)) {
                        icu j = j(t9r.DEFAULT_ERROR_TITLE, string, string2, null, null);
                        j.s(new d(j));
                        j.x();
                    } else {
                        pm0 pm0Var = new pm0();
                        pm0Var.c(e2.getApi()).f(x8r.a(e2)).i(o.getString("errorTitle")).g(string2).h(string);
                        if (t()) {
                            pm0Var.a(Localization.q(R.string.app_i_know), h());
                        }
                        this.c.g(pm0Var.d());
                    }
                } else if (p != null) {
                    v(this.f27886a, miVar, p);
                }
                z9r.b(string2, string);
                aan aanVar = this.e;
                if (aanVar != null) {
                    aanVar.f(e2);
                }
            }
        }
    }

    @Override // tb.gfb
    public void c(lo loVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25449f6", new Object[]{this, loVar, aURAGlobalData});
            return;
        }
        this.d = aURAGlobalData;
        aan aanVar = new aan(aURAGlobalData);
        this.e = aanVar;
        aanVar.e();
    }

    public final void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62d502c", new Object[]{this, map});
            return;
        }
        Map<String, String> l1 = this.b.l1();
        if (l1 != null) {
            map.putAll(l1);
        }
    }

    public final void g(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38dafb72", new Object[]{this, map, str});
            return;
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData != null) {
            JSONObject jSONObject = (JSONObject) aURAGlobalData.get("linkagePerformance", JSONObject.class);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("paymentType", (Object) str);
            }
            if (!jSONObject.isEmpty()) {
                map.put("option", jSONObject.toString());
            }
        }
    }

    public final JSONArray h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bb3bd328", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "openUrl");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", (Object) ff3.ORDER_LIST_ALL);
        jSONObject2.put("pageType", (Object) "Native");
        jSONObject2.put("isReplace", (Object) "true");
        jSONObject.put("fields", (Object) jSONObject2);
        jSONArray.add(jSONObject);
        return jSONArray;
    }

    public final Map<String, String> i(JSONObject jSONObject, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1d0cca8", new Object[]{this, jSONObject, str});
        }
        HashMap hashMap = new HashMap();
        String str3 = "";
        String string = jSONObject.getString("nextUrl") == null ? str3 : jSONObject.getString("nextUrl");
        if (Login.getSid() != null) {
            str3 = Login.getSid();
        }
        String ttid = TaoHelper.getTTID();
        hashMap.put("alipayURL", string + "&sid=" + str3 + "&ttid=" + ttid + "&refer=tbc");
        hashMap.put("from", ds8.UT_PAGE_NAME);
        hashMap.put("result", "1");
        if (TBElder.b()) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put("agednessVersion", str2);
        if (!TextUtils.isEmpty(jSONObject.getString("bizOrderId"))) {
            hashMap.put("orderids", jSONObject.getString("bizOrderId"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("signStr"))) {
            hashMap.put("signStr", jSONObject.getString("signStr"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("simplePay"))) {
            hashMap.put("simplepay", jSONObject.getString("simplePay"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("backUrl"))) {
            hashMap.put("backURL", jSONObject.getString("backUrl"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("unSuccessUrl"))) {
            hashMap.put("unSuccessUrl", jSONObject.getString("unSuccessUrl"));
        }
        if (jSONObject.getJSONObject("cashierParam") != null) {
            hashMap.put("cashierParam", jSONObject.getJSONObject("cashierParam").toJSONString());
        }
        f(hashMap);
        g(hashMap, str);
        x(hashMap);
        return hashMap;
    }

    public final icu j(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icu) ipChange.ipc$dispatch("24a1d3a", new Object[]{this, str, str2, str3, str4, str5});
        }
        icu icuVar = new icu(this.f27886a);
        if (!TextUtils.isEmpty(str)) {
            icuVar.v(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            icuVar.q(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            icuVar.n(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            icuVar.m(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            icuVar.l(str5);
        }
        return icuVar;
    }

    public final void k(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6e754f", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        for (String str2 : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str2)) {
                String string = jSONObject.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString(str2, string);
                }
            }
        }
        String s = s(str);
        AliNavInterface d2 = xq0.c().a(this.f27886a).d(bundle);
        if (!TextUtils.isEmpty(s) && s.contains("needbackpop=1")) {
            d2.b(4322);
        }
        d2.c(str);
        if (!TextUtils.isEmpty(s) && s.contains("needpop=1")) {
            n();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f607c4", new Object[]{this});
            return;
        }
        icu j = j(t9r.SUBMIT_PARTY_SUCCESS_TITLE, t9r.SUBMIT_PARTY_SUCCESS_MSG, null, t9r.CHECK, t9r.CANCEL);
        j.s(new a(j));
        j.r(new b(j));
        j.x();
    }

    public final void m(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8b3f1a", new Object[]{this, str, map});
            return;
        }
        df3 df3Var = new df3();
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(map);
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setOrderIds(map.get("orderids"));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setFrom(map.get("from"));
        payRequest.setNextAction(str);
        df3Var.d((Activity) this.f27886a, payRequest, new c());
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f622f449", new Object[]{this});
        } else {
            hh.d(this.f27886a);
        }
    }

    public final JSONObject o(mi miVar) {
        MtopResponse e2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("10d13067", new Object[]{this, miVar});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> d2 = miVar.d();
        if (d2 == null) {
            return jSONObject;
        }
        Object obj = d2.get("NextRPCRemoteResponse");
        if ((obj instanceof kk) && (e2 = ((kk) obj).e()) != null) {
            String retMsg = e2.getRetMsg();
            String str2 = t9r.DEFAULT_ERROR_TITLE;
            if (t()) {
                retMsg = t9r.ERROR_MSG_GO_ORDER_LIST;
                str2 = t9r.ERROR_NET_TITLE;
            } else if (e2.isNetworkError()) {
                retMsg = t9r.NETWORK_ERROR_MSG;
            } else if (e2.isApiLockedResult()) {
                retMsg = t9r.API_LOCKED_MSG;
            }
            if (TextUtils.isEmpty(e2.getMappingCode())) {
                str = String.valueOf(e2.getResponseCode());
            } else {
                str = e2.getMappingCode();
            }
            jSONObject.put("errorMsg", (Object) retMsg);
            jSONObject.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, (Object) str);
            jSONObject.put("errorTitle", (Object) str2);
        }
        return jSONObject;
    }

    public final JSONObject p(MtopResponse mtopResponse) {
        byte[] bytedata;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("569498c8", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null || (bytedata = mtopResponse.getBytedata()) == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(bytedata, "utf-8"));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String q() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31b62e27", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null || (jSONObject = (JSONObject) aURAGlobalData.get("aura_data_protocol_json", JSONObject.class)) == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null || (jSONObject3 = jSONObject2.getJSONObject("paymentData")) == null) {
            return null;
        }
        return jSONObject3.getString("payType");
    }

    public final String r() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e85640f", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null || (jSONObject = (JSONObject) aURAGlobalData.get("aura_data_protocol_json", JSONObject.class)) == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null || (jSONObject3 = jSONObject2.getJSONObject("paymentData")) == null) {
            return null;
        }
        return jSONObject3.getString("selOptions");
    }

    public final String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3e05edd", new Object[]{this, str});
        }
        try {
            return new URI(str).getQuery();
        } catch (Exception e2) {
            UnifyLog.e("TBBuySubmitCallback", e2.toString());
            return null;
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c4b1e91", new Object[]{this})).booleanValue();
        }
        return ff3.ASYNC_PAY_FLAG.equals(q());
    }

    public final boolean u(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f4d945", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (!"F-10008-11-16-006".equals(str) || jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return false;
        }
        return !TextUtils.isEmpty(jSONObject2.getString("errorTipUrl"));
    }

    public final void v(Context context, mi miVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb1cd4b", new Object[]{this, context, miVar, jSONObject});
            return;
        }
        JSONObject o = o(miVar);
        icu j = j(t9r.DEFAULT_ERROR_TITLE, o.getString("errorMsg"), o.getString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE), t9r.GOTO_BIND, null);
        j.s(new e(j, jSONObject, context));
        j.x();
    }

    public final void w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a004f5", new Object[]{this, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse("http://d.m.taobao.com/goAlipay.htm").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, map.get(str));
        }
        xq0.c().a(this.f27886a).b(4321).g(buildUpon.build());
    }

    public final void x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cb442d", new Object[]{this, map});
            return;
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData != null) {
            String b2 = aan.b((JSONObject) aURAGlobalData.get("submitExposureItemArgs", JSONObject.class));
            if (!TextUtils.isEmpty(b2)) {
                map.put("realPay", b2);
            }
        }
    }
}
