package tb;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321692);
    }

    public static Bundle a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("959c19b", new Object[]{jSONObject});
        }
        if (jSONObject == null || !jSONObject.containsKey("pageUserInfo") || (jSONObject2 = jSONObject.getJSONObject("pageUserInfo")) == null || !jSONObject2.containsKey(jjx.ZZB_BUNDLE_KEY) || (jSONObject3 = jSONObject2.getJSONObject(jjx.ZZB_BUNDLE_KEY)) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("from", jSONObject3.getString("from"));
        bundle.putString("subjectType", jSONObject3.getString("subjectType"));
        bundle.putString("subjectId", jSONObject3.getString("subjectId"));
        Bundle b = kff.b(jSONObject3.getJSONObject("extParams"));
        if (b != null) {
            bundle.putBundle("extParams", b);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(jjx.ZZB_BUNDLE_KEY, bundle);
        return bundle2;
    }
}
