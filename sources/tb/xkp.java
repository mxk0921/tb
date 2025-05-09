package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xkp extends h24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237867);
    }

    public static /* synthetic */ Object ipc$super(xkp xkpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/combine/ShareWithRefreshV3Subscriber");
    }

    @Override // tb.h24
    public JSONObject H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "shareV3");
        jSONObject2.put("fields", (Object) twf.b(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        twf.c(jSONObject3, twf.b(jSONObject));
        G(jSONObject2, "onFinish", "refreshPageV3", jSONObject3);
        return jSONObject2;
    }
}
