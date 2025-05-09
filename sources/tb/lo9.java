package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lo9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final lo9 f23466a = new lo9();

        static {
            t2o.a(435159108);
        }

        public static /* synthetic */ lo9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lo9) ipChange.ipc$dispatch("def3352d", new Object[0]);
            }
            return f23466a;
        }
    }

    static {
        t2o.a(435159107);
    }

    public static lo9 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo9) ipChange.ipc$dispatch("58c66252", new Object[0]);
        }
        return a.a();
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bed79f30", new Object[]{this, str});
        }
        return "float_window_data_" + str;
    }

    public JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa9ff6b1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object a2 = gno.b(sd7.d().a()).a(a(str), "");
        if (a2 instanceof String) {
            String str2 = (String) a2;
            if (!TextUtils.isEmpty(str2)) {
                JSONObject parseObject = JSON.parseObject(str2);
                if (!parseObject.isEmpty()) {
                    return parseObject;
                }
            }
        }
        return null;
    }

    public void f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bcaaf0", new Object[]{this, jSONObject});
        } else if (jSONObject.getBooleanValue("success") && (jSONObject2 = jSONObject.getJSONObject(e9.TAK_ABILITY_MATCH_CONTENT)) != null) {
            String string = jSONObject2.getString("bizCode");
            if (!TextUtils.isEmpty(string) && e(jSONObject2)) {
                gno.b(sd7.d().a()).e(a(string), jSONObject.toJSONString());
            }
        }
    }

    public void g(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca7122f", new Object[]{this, list});
        } else if (list != null) {
            for (JSONObject jSONObject : list) {
                f(jSONObject);
            }
        }
    }

    public JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f0849be4", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            yv8.a("Fetcher.fetchDSL.Mtop.responseContent=%s", jSONObject);
            JSONObject jSONObject3 = jSONObject.getJSONObject("contentMap");
            if (!(jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("androidFloatWindow")) == null || !jSONObject2.getBooleanValue("success") || (jSONArray = jSONObject2.getJSONArray("content")) == null || jSONArray.isEmpty())) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                if (!jSONObject4.getBooleanValue("success")) {
                    return null;
                }
                return jSONObject4;
            }
            return null;
        } catch (Throwable th) {
            yv8.b("DSLFetcher.fetchDSL.MTOP.parseObject.responseContent.error.", th);
            return null;
        }
    }

    public final boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71f59b", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject != null && jSONObject.containsKey("bizCode") && jSONObject.containsKey("dslContent") && jSONObject.containsKey("style");
    }
}
