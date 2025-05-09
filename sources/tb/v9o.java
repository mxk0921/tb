package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031803);
    }

    public static <T> T a(JSONObject jSONObject, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f3e5342b", new Object[]{jSONObject, cls});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(jSONObject.toString(), cls);
        } catch (Throwable th) {
            lor.d("ResponseHelper", "getResult", "parseError ,error info =", th.toString(), jSONObject.toJSONString());
            return null;
        }
    }
}
