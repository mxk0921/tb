package tb;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346567);
    }

    public static boolean a(Bundle bundle, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb7e5b3", new Object[]{bundle, str, new Boolean(z)})).booleanValue();
        }
        if (bundle != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!bundle.containsKey(str)) {
                        return z;
                    }
                    Boolean castToBoolean = TypeUtils.castToBoolean(bundle.get(str));
                    if (castToBoolean != null) {
                        return castToBoolean.booleanValue();
                    }
                    return z;
                }
            } catch (Exception e) {
                Log.e("TMS:BundleUtils", "get json value exception", e);
            }
        }
        return z;
    }

    public static String b(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8033f850", new Object[]{bundle, str});
        }
        return c(bundle, str, "");
    }

    public static String c(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("122acfc6", new Object[]{bundle, str, str2});
        }
        if (str2 == null) {
            str2 = "";
        }
        if (bundle != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!bundle.containsKey(str)) {
                        return str2;
                    }
                    String castToString = TypeUtils.castToString(bundle.get(str));
                    if (castToString != null) {
                        return castToString;
                    }
                }
            } catch (Exception e) {
                Log.e("TMS:BundleUtils", "get json value exception", e);
            }
        }
        return str2;
    }
}
