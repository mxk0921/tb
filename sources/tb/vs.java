package tb;

import android.content.Context;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class vs implements wab {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_DOWNGRADE_CODE = "F-10000-00-15-002";
    public static final int ERROR_419 = 419;
    public static final String ERROR_DOMAIN = "AbsAURAErrorExtension";

    /* renamed from: a  reason: collision with root package name */
    public lo f30214a;
    public hbb b;

    static {
        t2o.a(725614611);
        t2o.a(79691951);
    }

    public static JSONObject x(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0193e4b", new Object[]{kkVar});
        }
        JSONObject b = kkVar.b();
        if (bh.b(b)) {
            return null;
        }
        JSONObject jSONObject = b.getJSONObject("data");
        if (!bh.b(jSONObject) && sl.a(jSONObject)) {
            return jSONObject;
        }
        return null;
    }

    public void J0(Context context, MtopResponse mtopResponse, String str, String str2, String str3, boolean z, boolean z2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7241dd4", new Object[]{this, context, mtopResponse, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        kyb kybVar = (kyb) this.f30214a.g("userContextDateUpdate", kyb.class);
        pm0 pm0Var = new pm0();
        pm0Var.c(mtopResponse.getApi()).f(x8r.a(mtopResponse)).i(str).g(str2).h(str3);
        if (z2 && (str2.equals("-202AEC10001") || str2.equals("200AES20001"))) {
            pm0Var.a(Localization.q(R.string.app_back), r("pop")).b(Localization.q(R.string.purchase_taobao_app_1029_1_19083), r("refresh"));
        }
        if (z) {
            jSONObject = pm0Var.d();
        } else {
            jSONObject = pm0Var.e();
        }
        kybVar.g(jSONObject);
    }

    public hbb L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbb) ipChange.ipc$dispatch("482c0947", new Object[]{this});
        }
        return this.b;
    }

    public lo m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f30214a;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f30214a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.b = hbbVar;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static boolean B(lo loVar, kk kkVar) {
        kyb kybVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("986bd525", new Object[]{loVar, kkVar})).booleanValue();
        }
        if (loVar == null) {
            return false;
        }
        JSONObject x = x(kkVar);
        if (bh.b(x) || (kybVar = (kyb) loVar.g("userContextDateUpdate", kyb.class)) == null) {
            return false;
        }
        kybVar.g(x);
        return true;
    }

    public final JSONArray r(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7f09ebed", new Object[]{this, strArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }
}
