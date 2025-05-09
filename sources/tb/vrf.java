package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313637);
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        return b(jSONObject, str, z, false);
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb4d72e5", new Object[]{jSONObject, str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (jSONObject == null) {
            return z;
        }
        try {
            if (jSONObject.containsKey(str)) {
                z = jSONObject.getBooleanValue(str);
            }
            return z;
        } catch (Exception e) {
            TrtcLog.i("TRTC-JSONUtils", "getBoolean exception: " + e.getMessage());
            return z2;
        }
    }

    public static int c(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d6ea3c", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        try {
            if (jSONObject.containsKey(str)) {
                return jSONObject.getIntValue(str);
            }
            return i;
        } catch (Exception e) {
            TrtcLog.i("TRTC-JSONUtils", "getInt exception: " + e.getMessage());
            return i;
        }
    }

    public static String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40fbc34", new Object[]{jSONObject, str});
        }
        return e(jSONObject, str, "");
    }

    public static String e(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197ae2aa", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        try {
            if (jSONObject.containsKey(str)) {
                return jSONObject.getString(str);
            }
            return str2;
        } catch (Exception e) {
            TrtcLog.i("TRTC-JSONUtils", e.getMessage());
            return str2;
        }
    }
}
