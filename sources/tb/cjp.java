package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cjp extends pt1 {
    public static final String EVENT_KEY = "openShare";
    public final Map<String, String> e;
    public final a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f17102a;
        public List<String> b;
        public String c;
        public String d;
        public String e;

        static {
            t2o.a(352321544);
        }
    }

    static {
        t2o.a(352321543);
    }

    public cjp(JSONObject jSONObject, Object obj) {
        super(obj);
        if (jSONObject != null) {
            a aVar = new a();
            this.f = aVar;
            JSONObject jSONObject2 = jSONObject.getJSONObject("shareItemModel");
            if (jSONObject2 != null) {
                aVar.e = jSONObject2.getString("originPrice");
                aVar.f17102a = jSONObject2.getString("itemTitle");
                aVar.d = jSONObject2.getString("itemId");
                aVar.c = jSONObject2.getString("price");
                if (jSONObject2.getJSONArray("images") != null) {
                    aVar.b = JSON.parseArray(jSONObject2.getJSONArray("images").toJSONString(), String.class);
                }
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("detailShareParams");
            if (jSONObject3 != null) {
                this.e = new HashMap();
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    ((HashMap) this.e).put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
    }
}
