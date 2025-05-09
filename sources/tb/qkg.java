package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qkg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE = "lite_effect";

    static {
        t2o.a(511705563);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig(NAMESPACE, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3701399", new Object[0])).booleanValue();
        }
        return c(a(rjl.MONITOR_BLACKLIST, ""), 21);
    }

    public static boolean d(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c769ed3d", new Object[]{str, jSONArray})).booleanValue();
        }
        if (!(jSONArray == null || jSONArray.length() == 0 || TextUtils.isEmpty(str))) {
            String trim = str.trim();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (TextUtils.equals(trim, optString) || e(trim, optString)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87915c52", new Object[]{str, str2})).booleanValue();
        }
        try {
            return str.matches(str2);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c(String str, int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("908b54c8", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Build.VERSION.SDK_INT < i;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.equals(jSONObject.optString("disable"), "true")) {
            return true;
        }
        int optInt = jSONObject.optInt("min_os_ver", i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= optInt && !d(String.valueOf(i2), jSONObject.optJSONArray("blk_os_ver")) && !d(Build.MODEL, jSONObject.optJSONArray("blk_model")) && !d(Build.BRAND, jSONObject.optJSONArray("blk_brand"))) {
            return d(Build.HARDWARE, jSONObject.optJSONArray("blk_hardware"));
        }
        return true;
    }
}
