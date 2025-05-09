package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a28 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f15501a = new HashMap();

    static {
        t2o.a(473956380);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de74a4f6", new Object[]{context, str});
        }
        Map<String, String> map = f15501a;
        if (((HashMap) map).containsKey(str)) {
            return (String) ((HashMap) map).get(str);
        }
        String b = b(context, str);
        ((HashMap) map).put(str, b);
        return b;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642e5d2", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("home_dx_data", 0).getString(str, "");
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94db7ad1", new Object[]{context, str, str2});
        } else if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("home_dx_data", 0).edit();
            edit.putString(str, str2);
            edit.apply();
            ((HashMap) f15501a).put(str, str2);
            bqa.d("DxDataStoreUtil", "saveData to sp: key = " + str + ", value = " + str2);
        }
    }
}
