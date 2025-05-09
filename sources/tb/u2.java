package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class u2 extends g5p<ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793184);
    }

    public static /* synthetic */ Object ipc$super(u2 u2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/AIActivateTppConverter");
    }

    /* renamed from: d */
    public ja0 b(JSONObject jSONObject, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("61bbd5e5", new Object[]{this, jSONObject, v5pVar});
        }
        ja0 ja0Var = new ja0();
        if (jSONObject == null) {
            v5p.Companion.a(v5pVar, "DataConvert", "-1", "JSON is empty");
            return ja0Var;
        }
        String optString = jSONObject.optString(yj4.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        HashMap hashMap = new HashMap();
        hashMap.put("pvId", optString);
        hashMap.put("tppTrace", optString2);
        JSONArray optJSONArray = jSONObject.optJSONArray("result");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "result array is empty");
            v5p.Companion.b(v5pVar, "DataConvert", hashMap);
            return ja0Var;
        }
        a9u a9uVar = new a9u();
        e(optJSONArray, ja0Var, a9uVar);
        hashMap.put("pageStruct", a9uVar.f15618a);
        a9u a9uVar2 = new a9u();
        ja0Var.j = g(jSONObject, a9uVar2);
        hashMap.put("templates", a9uVar2.f15618a);
        if (!TextUtils.isEmpty(optString)) {
            Map<String, String> map = ja0Var.l;
            ckf.f(map, "utParams");
            ((HashMap) map).put(yj4.PARAM_PVID, optString);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(JTrackParams.TRACK_PARAMS);
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString3 = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                    Map<String, String> map2 = ja0Var.l;
                    ckf.f(map2, "utParams");
                    ((HashMap) map2).put(next, optString3);
                }
            }
        }
        v5p.Companion.c(v5pVar, "DataConvert", hashMap);
        return ja0Var;
    }

    /* renamed from: f */
    public ja0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("2bb7fcc4", new Object[]{this});
        }
        return new ja0();
    }

    public final Map<String, TemplateBean> g(JSONObject jSONObject, a9u a9uVar) {
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

    public final void e(JSONArray jSONArray, ja0 ja0Var, a9u a9uVar) {
        ActivateTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673aac27", new Object[]{this, jSONArray, ja0Var, a9uVar});
            return;
        }
        ja0Var.g = new ArrayList();
        ga0 b = s1p.c().b();
        if (b != null) {
            StringBuilder sb = new StringBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(jSONArray.optString(i));
                if (!(parseObject == null || (a2 = b.a(parseObject, ja0Var)) == null)) {
                    sb.append(a2.type);
                    sb.append("/");
                    ja0Var.g.add(a2);
                }
            }
            if (a9uVar != null) {
                a9uVar.f15618a = sb.toString();
            }
        } else if (a9uVar != null) {
            a9uVar.f15618a = "parser is null";
        }
    }
}
