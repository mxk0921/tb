package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ir {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FIELDS = "fields";
    public static final String KEY_KEY = "key";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TYPE = "type";

    /* renamed from: a  reason: collision with root package name */
    public final String f21517a;
    public final JSONObject b;

    static {
        t2o.a(912261975);
    }

    public ir(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        this.f21517a = string;
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        this.b = jSONObject2;
        if (TextUtils.isEmpty(string)) {
            this.f21517a = jSONObject.getString("key");
        }
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            this.b = jSONObject.getJSONObject("params");
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f21517a;
    }
}
