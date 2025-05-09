package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mg1 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262743);
        }

        public a() {
        }

        public final String a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dd9da75a", new Object[]{this, jSONObject});
            }
            JSONObject f = DynamicMergeUtils.f(jSONObject);
            if (f == null) {
                return null;
            }
            for (Map.Entry<String, Object> entry : f.entrySet()) {
                String key = entry.getKey();
                if (tsq.x("model", key, true) && (jSONObject2 = f.getJSONObject(key)) != null) {
                    for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                        String key2 = entry2.getKey();
                        if (tsq.x("detail3Atmosphere", key2, true)) {
                            JSONObject jSONObject4 = jSONObject2.getJSONObject(key2);
                            if (jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("fields")) == null) {
                                return null;
                            }
                            return jSONObject3.getString("backgroundImage");
                        }
                    }
                    continue;
                }
            }
            return null;
        }

        public final void b(String str, JSONObject jSONObject) {
            String b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bbfdcc0", new Object[]{this, str, jSONObject});
            } else if (vbl.w() && (b = jtm.a().b(str)) != null && b.length() != 0 && !ckf.b(b, a(jSONObject))) {
                jtm.a().g(str);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262742);
    }
}
