package tb;

import android.text.TextUtils;
import androidx.core.app.FrameMetricsAggregator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bm1 extends g5p<am1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793216);
    }

    public static /* synthetic */ Object ipc$super(bm1 bm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/bgwords/BGWordsTppConverter");
    }

    /* renamed from: e */
    public am1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am1) ipChange.ipc$dispatch("d9a03b14", new Object[]{this});
        }
        return new am1(null, null, null, 7, null);
    }

    public final void g(JSONObject jSONObject, am1 am1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822ccd5c", new Object[]{this, jSONObject, am1Var});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("hintq_rolling");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(f(optJSONObject));
                }
            }
            am1Var.c(arrayList);
        }
    }

    /* renamed from: d */
    public am1 b(JSONObject jSONObject, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am1) ipChange.ipc$dispatch("6336413", new Object[]{this, jSONObject, v5pVar});
        }
        am1 am1Var = new am1(null, null, null, 7, null);
        if (jSONObject == null) {
            v5p.Companion.a(v5pVar, "DataConvert", "-1", "JSON is empty");
            return am1Var;
        }
        HashMap hashMap = new HashMap();
        String optString = jSONObject.optString(yj4.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        hashMap.put("pvId", optString);
        hashMap.put("tppTrace", optString2);
        JSONObject optJSONObject = jSONObject.optJSONObject("result");
        if (optJSONObject == null) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "inner result is empty");
            v5p.Companion.b(v5pVar, "DataConvert", hashMap);
            return am1Var;
        }
        String optString3 = optJSONObject.optString(h1p.KEY_SUGGEST_RN);
        String optString4 = optJSONObject.optString("data_from");
        hashMap.put("suggestRn", optString3);
        hashMap.put(TBImageFlowMonitor.DATA_FROM_DIMEN, optString4);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("result");
        if (optJSONObject2 == null) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "bgwords result is empty");
            v5p.Companion.b(v5pVar, "DataConvert", hashMap);
            return am1Var;
        }
        am1Var.e(optString3);
        am1Var.d(optString4);
        g(optJSONObject2, am1Var);
        if (am1Var.a() != null) {
            List<zl1> a2 = am1Var.a();
            ckf.d(a2);
            zl1 zl1Var = a2.get(0);
            if (zl1Var != null && !TextUtils.isEmpty(zl1Var.a())) {
                hashMap.put("displayText", zl1Var.a());
                hashMap.put("searchText", zl1Var.e());
            }
        }
        v5p.Companion.c(v5pVar, "DataConvert", hashMap);
        return am1Var;
    }

    public final zl1 f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zl1) ipChange.ipc$dispatch("d0849311", new Object[]{this, jSONObject});
        }
        zl1 zl1Var = new zl1(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        zl1Var.g(jSONObject.optString("darkIconUrl"));
        zl1Var.h(jSONObject.optString("displayText"));
        zl1Var.i(jSONObject.optString("iconHeight"));
        zl1Var.j(jSONObject.optString("iconUrl"));
        zl1Var.k(jSONObject.optString("iconWidth"));
        zl1Var.l(jSONObject.optString("recallType"));
        zl1Var.m(jSONObject.optString("roughScore"));
        zl1Var.n(jSONObject.optString("searchText"));
        zl1Var.o(new LinkedHashMap());
        JSONArray optJSONArray = jSONObject.optJSONArray("searchparams");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("key");
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject.optString("value");
                        Map<String, String> f = zl1Var.f();
                        if (f != null) {
                            f.put(optString, optString2);
                        }
                    }
                }
            }
        }
        return zl1Var;
    }
}
