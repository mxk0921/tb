package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.musie.NSMuiseViewHolder;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u17 implements wpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(995098652);
        t2o.a(995098655);
    }

    @Override // tb.wpb
    public mtf a(JSONObject jSONObject) {
        j22 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtf) ipChange.ipc$dispatch("e0d75be8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("trigger");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        mtf mtfVar = new mtf();
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(TextUtils.isEmpty(key) || value == null || (a2 = mtfVar.a(key)) == null)) {
                d(value, a2);
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("triggerOption");
        if (jSONObject3 == null) {
            return mtfVar;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("expose");
        if (jSONObject4 != null) {
            mtfVar.f24293a.b = jSONObject4.getIntValue("batchNum");
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("idle");
        if (jSONObject5 != null) {
            mtfVar.b.b = jSONObject5.getIntValue("idleSeconds");
        }
        JSONObject jSONObject6 = jSONObject3.getJSONObject(NSMuiseViewHolder.ACTION_STOP_SCROLL);
        if (jSONObject6 != null) {
            mtfVar.d.c = jSONObject6.getIntValue("interval_pos");
            mtfVar.d.b = jSONObject6.getIntValue("interval_time");
        }
        return mtfVar;
    }

    @Override // tb.wpb
    public String b(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdaaf386", new Object[]{this, baseSearchResult});
        }
        return baseSearchResult.getExtMod("jarvisContext");
    }

    @Override // tb.wpb
    public String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ce2713b", new Object[]{this, jSONObject});
        }
        return jSONObject.getString("scene");
    }

    public final void d(Object obj, j22 j22Var) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a459e39", new Object[]{this, obj, j22Var});
        } else if (obj instanceof String) {
            ((ArrayList) j22Var.f21711a).add((String) obj);
        } else if (obj instanceof JSONArray) {
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i < jSONArray.size()) {
                    ((ArrayList) j22Var.f21711a).add(jSONArray.getString(i));
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
