package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class urf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356475);
    }

    public static HashMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("45abf1be", new Object[]{jSONObject});
        }
        return m3s.b(jSONObject);
    }

    public static Map<String, Object> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e537550", new Object[]{jSONObject});
        }
        return m3s.d(jSONObject);
    }

    public static boolean c(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getBooleanValue(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return z;
    }

    public static int d(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d6ea3c", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getInteger(str).intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i;
    }

    public static long e(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28dcd537", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getLongValue(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return j;
    }
}
