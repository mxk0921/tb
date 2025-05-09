package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092151);
    }

    public static w55 a(Context context, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("caf383b0", new Object[]{context, jSONObject, map});
        }
        if (jSONObject == null) {
            return null;
        }
        String str = gj4.e;
        if (!jSONObject.containsKey(str)) {
            return null;
        }
        return new w55(context).b(jSONObject.getString(str)).z0(jSONObject.getString(gj4.f)).p0(map).v0(jSONObject.getString(gj4.g)).q0(false);
    }
}
