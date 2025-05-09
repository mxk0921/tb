package tb;

import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g5l extends pt1 {
    public static final String EVENT_KEY = "openUrl";
    public final String e;

    static {
        t2o.a(352321571);
    }

    public g5l(JSONObject jSONObject, Object obj) {
        super(obj);
        if (jSONObject != null) {
            this.e = jSONObject.getString("url");
        }
    }
}
