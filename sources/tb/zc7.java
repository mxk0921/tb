package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zc7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32682a;
    public final JSONObject b;

    static {
        t2o.a(912262477);
    }

    public zc7(String str) {
        JSONObject parseObject = JSON.parseObject(str);
        this.b = parseObject;
        JSONObject parseObject2 = JSON.parseObject(parseObject.getString("value"));
        if (parseObject2 != null) {
            this.f32682a = parseObject2.getString("API_NAME");
        }
    }
}
