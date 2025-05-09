package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a8j extends h24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237863);
    }

    public static /* synthetic */ Object ipc$super(a8j a8jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/combine/MtopWithOpenUrlV3Subcriber");
    }

    @Override // tb.h24
    public JSONObject H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV3");
        jSONObject2.put("fields", (Object) twf.b(jSONObject));
        if (jSONObject.get("nextUrl") instanceof String) {
            String string = jSONObject.getString("nextUrl");
            if ("response_url".equals(string)) {
                string = "@data{data.url}";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) string);
            G(jSONObject2, "success", "openUrlV3", jSONObject3);
        }
        return jSONObject2;
    }
}
