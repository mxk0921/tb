package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b8j extends h24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237864);
    }

    public static /* synthetic */ Object ipc$super(b8j b8jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/combine/MtopWithRefreshV2Subscriber");
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
        if ((jSONObject.get("reloadType") instanceof String) && !TextUtils.equals("none", jSONObject.getString("reloadType"))) {
            G(jSONObject2, "success", "refreshPageV3", null);
        }
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
