package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691959);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d0dacfd", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3feb423f", new Object[]{obj});
        }
        try {
            return (JSONObject) JSON.toJSON(obj);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28e5ac37", new Object[]{obj});
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
