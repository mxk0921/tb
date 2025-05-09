package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c8j extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465578);
    }

    public static /* synthetic */ Object ipc$super(c8j c8jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/combine/MtopWithRefreshV2Subscriber");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV2");
        jSONObject2.put("fields", (Object) axf.b(jSONObject));
        if ((jSONObject.get("reloadType") instanceof String) && !TextUtils.equals("none", jSONObject.getString("reloadType"))) {
            J(jSONObject2, "success", "refreshPageV2", null);
        }
        if (jSONObject.get("nextUrl") instanceof String) {
            String string = jSONObject.getString("nextUrl");
            if ("response_url".equals(string)) {
                string = "@data{data.url}";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) string);
            J(jSONObject2, "success", "openUrlV2", jSONObject3);
        }
        return jSONObject2;
    }
}
