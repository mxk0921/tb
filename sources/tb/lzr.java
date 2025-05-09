package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavInterface;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.internal.PayRequest;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.icu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lzr implements gfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23671a;
    public final mud b;
    public final kyb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ icu f23672a;

        public a(icu icuVar) {
            this.f23672a = icuVar;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            this.f23672a.f();
            wol.a(lzr.d(lzr.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements icu.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ icu f23673a;

        public b(icu icuVar) {
            this.f23673a = icuVar;
        }

        @Override // tb.icu.d
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            this.f23673a.f();
            lzr.e(lzr.this);
        }
    }

    static {
        t2o.a(725614625);
        t2o.a(301990024);
    }

    public lzr(Context context, mud mudVar, kyb kybVar) {
        this.f23671a = context;
        this.b = mudVar;
        this.c = kybVar;
    }

    public static /* synthetic */ Context d(lzr lzrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a5685574", new Object[]{lzrVar});
        }
        return lzrVar.f23671a;
    }

    public static /* synthetic */ void e(lzr lzrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ebd7db", new Object[]{lzrVar});
        } else {
            lzrVar.i();
        }
    }

    @Override // tb.gfb
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e227d9d", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            if (jSONObject.getBoolean("partSuccess").booleanValue()) {
                icu g = g(jzr.SUBMIT_PARTY_SUCCESS_TITLE, jzr.SUBMIT_PARTY_SUCCESS_MSG, null, jzr.CHECK, jzr.CANCEL);
                g.s(new a(g));
                g.r(new b(g));
                g.x();
                return;
            }
            String string = jSONObject.getString("overrideUrl");
            if (!TextUtils.isEmpty(string)) {
                n(string, jSONObject);
                return;
            }
            String string2 = jSONObject.getString("cashierType");
            Map<String, String> m = m(jSONObject);
            if (PayRequest.CALL_WEIXIN_SDK.equals(string2)) {
                h(string2, m);
            } else {
                o(m);
            }
        }
    }

    @Override // tb.gfb
    public void b(mi miVar, boolean z) {
        Map<String, Object> d;
        MtopResponse e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77068ba4", new Object[]{this, miVar, new Boolean(z)});
        } else if (miVar != null && !z && "AURANextRPCServiceDomain".equals(miVar.c()) && (d = miVar.d()) != null) {
            Object obj = d.get("NextRPCRemoteResponse");
            if ((obj instanceof kk) && (e = ((kk) obj).e()) != null) {
                JSONObject j = j(miVar);
                String string = j.getString("errorMsg");
                String string2 = j.getString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE);
                pm0 pm0Var = new pm0();
                pm0Var.c(e.getApi()).f(x8r.a(e)).i(jzr.DEFAULT_ERROR_TITLE).g(string2).h(string);
                this.c.g(pm0Var.d());
            }
        }
    }

    @Override // tb.gfb
    public void c(lo loVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25449f6", new Object[]{this, loVar, aURAGlobalData});
        }
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

    public final icu g(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icu) ipChange.ipc$dispatch("24a1d3a", new Object[]{this, str, str2, str3, str4, str5});
        }
        icu icuVar = new icu(this.f23671a);
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

    public final void h(String str, Map<String, String> map) {
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
        df3Var.d((Activity) this.f23671a, payRequest, new mzr(this));
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f622f449", new Object[]{this});
            return;
        }
        Context context = this.f23671a;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public final String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3e05edd", new Object[]{this, str});
        }
        try {
            return new URI(str).getQuery();
        } catch (Exception e) {
            UnifyLog.e("TBBuySubmitCallback", e.toString());
            return null;
        }
    }

    public final Map<String, String> m(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("13bf9786", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        String str2 = "";
        String string = jSONObject.getString("nextUrl") == null ? str2 : jSONObject.getString("nextUrl");
        if (Login.getSid() != null) {
            str2 = Login.getSid();
        }
        String ttid = TaoHelper.getTTID();
        hashMap.put("alipayURL", string + "&sid=" + str2 + "&ttid=" + ttid + "&refer=tbc");
        hashMap.put("from", "WaitPayDetail");
        hashMap.put("result", "1");
        if (TBElder.b()) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("agednessVersion", str);
        String k = k(jSONObject);
        if (!TextUtils.isEmpty(k)) {
            hashMap.put("orderids", k);
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
        JSONObject jSONObject2 = jSONObject.getJSONObject("cashierParam");
        if (jSONObject2 != null) {
            hashMap.put("cashierParam", jSONObject2.toJSONString());
        }
        f(hashMap);
        return hashMap;
    }

    public final void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a8b245", new Object[]{this, str, jSONObject});
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
        String l = l(str);
        AliNavInterface d = xq0.c().a(this.f23671a).d(bundle);
        if (!TextUtils.isEmpty(l) && l.contains("needbackpop=1")) {
            d.b(4322);
        }
        d.c(str);
        if (!TextUtils.isEmpty(l) && l.contains("needpop=1")) {
            i();
        }
    }

    public final void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a004f5", new Object[]{this, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse("http://d.m.taobao.com/goAlipay.htm").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, map.get(str));
        }
        xq0.c().a(this.f23671a).b(4322).g(buildUpon.build());
    }

    public final JSONObject j(mi miVar) {
        MtopResponse e;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("10d13067", new Object[]{this, miVar});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> d = miVar.d();
        if (d == null) {
            return jSONObject;
        }
        Object obj = d.get("NextRPCRemoteResponse");
        if ((obj instanceof kk) && (e = ((kk) obj).e()) != null) {
            String retMsg = e.getRetMsg();
            if (e.isNetworkError()) {
                retMsg = jzr.NETWORK_ERROR_MSG;
            } else if (e.isApiLockedResult()) {
                retMsg = jzr.API_LOCKED_MSG;
            } else if (y8r.f("useRetMsg", true)) {
                retMsg = aao.a(e);
            }
            if (TextUtils.isEmpty(e.getMappingCode())) {
                str = String.valueOf(e.getResponseCode());
            } else {
                str = e.getMappingCode();
            }
            jSONObject.put("errorMsg", (Object) retMsg);
            jSONObject.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, (Object) str);
        }
        return jSONObject;
    }

    public final String k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29ec9677", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("orderIds");
        if (jSONArray == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(jSONArray.get(i));
        }
        return sb.toString();
    }
}
