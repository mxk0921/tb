package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wc3 INSTANCE = new wc3();

    static {
        t2o.a(479199572);
    }

    public final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject l;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b33256ab", new Object[]{this, jSONObject, str});
        }
        ckf.g(str, "newRootKey");
        if (jSONObject == null || (l = fxu.l(jSONObject, str)) == null) {
            return null;
        }
        l.remove("features");
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        l.put("linkage", (Object) jSONObject2);
        Boolean bool = jSONObject.getBoolean("reload");
        hav.d("CartProtocolCropper", "reload=" + bool);
        if (bool != null) {
            z = bool.booleanValue();
        }
        l.put("reload", (Object) Boolean.valueOf(z));
        return l;
    }
}
