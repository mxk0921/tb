package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xwq extends g5p<ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public final yzd c = new bpw();

    static {
        t2o.a(815793282);
    }

    public xwq(String str, boolean z) {
        this.b = str;
        this.f19741a = z;
    }

    public static /* synthetic */ Object ipc$super(xwq xwqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/data/SuggestTppConverter");
    }

    public final void e(JSONObject jSONObject, ja0 ja0Var, Map<String, String> map, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1558ea", new Object[]{this, jSONObject, ja0Var, map, v5pVar});
            return;
        }
        ja0Var.o = jSONObject;
        ja0Var.e = this.b;
        ja0Var.d = jSONObject.optString(h1p.KEY_SUGGEST_RN);
        h(jSONObject, ja0Var);
        g(jSONObject, ja0Var);
        a9u a9uVar = new a9u();
        Map<String, TemplateBean> i = i(jSONObject, a9uVar);
        ja0Var.j = i;
        ((bpw) this.c).a(i);
        map.put("pageStruct", a9uVar.f15618a);
        v5p.d(v5pVar, "DataConvert", map);
    }

    /* renamed from: f */
    public ja0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("2bb7fcc4", new Object[]{this});
        }
        return new ja0();
    }

    public final void g(JSONObject jSONObject, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29503cc", new Object[]{this, jSONObject, ja0Var});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("review");
        if (optJSONObject != null) {
            i2p i2pVar = new i2p();
            ja0Var.h = i2pVar;
            i2pVar.j(Boolean.valueOf(optJSONObject.optBoolean("show")));
            ja0Var.h.g(optJSONObject.optString("h5Url"));
            ja0Var.h.h(optJSONObject.optString("iconUrl"));
            ja0Var.h.k(optJSONObject.optString("showText"));
            ja0Var.h.i("suggest");
        }
    }

    public final Map<String, TemplateBean> i(JSONObject jSONObject, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a54a8268", new Object[]{this, jSONObject, a9uVar});
        }
        String optString = jSONObject.optString("templates");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return qit.c(JSON.parseArray(optString), a9uVar, yak.f31939a);
    }

    public final void j(ja0 ja0Var, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fe44cd", new Object[]{this, ja0Var, new Integer(i), str});
        } else if (ja0Var.a() == null) {
            ja0Var.g(false);
            ja0Var.d(new ResultError(i, str));
        }
    }

    public final void h(JSONObject jSONObject, ja0 ja0Var) {
        ga0 b;
        ActivateTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc09b1f8", new Object[]{this, jSONObject, ja0Var});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("result");
        ja0Var.g = new ArrayList();
        if (!(optJSONArray == null || optJSONArray.length() == 0 || (b = s1p.c().b()) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(optJSONArray.optString(i));
                if (!(parseObject == null || (a2 = b.a(parseObject, ja0Var)) == null)) {
                    ja0Var.g.add(a2);
                }
            }
        }
    }

    /* renamed from: d */
    public ja0 b(JSONObject jSONObject, v5p v5pVar) {
        Object obj;
        JSONObject jSONObject2;
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("61bbd5e5", new Object[]{this, jSONObject, v5pVar});
        }
        ja0 ja0Var = new ja0();
        if (jSONObject == null) {
            j(ja0Var, 1, "Mtop Result Empty");
            v5p.b(v5pVar, "DataConvert", "-1", "JSON is empty");
            return ja0Var;
        }
        HashMap hashMap = new HashMap();
        if (this.f19741a) {
            try {
                obj = jSONObject.get(rb.RESULT_KEY);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONArray) {
                try {
                    str = ((JSONArray) obj).getString(0);
                } catch (JSONException e) {
                    e.printStackTrace();
                    str = "";
                }
                if (!TextUtils.isEmpty(str) && (split = str.split("::")) != null && split.length > 1) {
                    ja0Var.e(split[0]);
                    ja0Var.f(split[1]);
                    if (!ja0Var.c()) {
                        hashMap.put("errCode", ja0Var.b());
                        hashMap.put("errMsg", str);
                        ja0Var.d(new ResultError(1, str));
                    }
                }
            }
            try {
                jSONObject2 = jSONObject.getJSONObject("data");
            } catch (Exception unused2) {
                j(ja0Var, 3, "Mtop Data Convert Error");
                if (ja0Var.c()) {
                    hashMap.put("errCode", "-1");
                    hashMap.put("errMsg", "Mtop Data Convert Error");
                }
                hashMap.put("sourceData", jSONObject.toString());
                v5p.c(v5pVar, "DataConvert", hashMap);
                return ja0Var;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2 == null) {
            j(ja0Var, 5, "Mtop Result Data Empty");
            if (ja0Var.c()) {
                hashMap.put("errCode", "-1");
                hashMap.put("errMsg", "Mtop Result Data Empty");
            }
            hashMap.put("sourceData", jSONObject.toString());
            v5p.c(v5pVar, "DataConvert", hashMap);
            return ja0Var;
        }
        hashMap.put("pvId", jSONObject2.optString(yj4.PARAM_PVID));
        hashMap.put("tpp_trace", jSONObject2.optString("tpp_trace"));
        e(jSONObject2, ja0Var, hashMap, v5pVar);
        return ja0Var;
    }
}
