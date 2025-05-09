package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h6h extends h24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092108);
    }

    public static /* synthetic */ Object ipc$super(h6h h6hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/common/page/LoadMoreSubscriber");
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
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", "success");
        G(jSONObject2, "success", "loadData", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("type", "fail");
        G(jSONObject2, "fail", "loadData", jSONObject4);
        return jSONObject2;
    }
}
