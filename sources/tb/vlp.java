package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vlp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("a1eaf87f", new Object[0]);
        }
        return Globals.getApplication().getSharedPreferences("family", 0);
    }

    public static String b(String str) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (a2 = a()) != null) {
            return a2.getString(str, "");
        }
        return "";
    }

    public static boolean c(String str, String str2) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25d029c", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (a2 = a()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putString(str, str2);
        return edit.commit();
    }

    public static boolean d(Map<String, String> map) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82229f23", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty() || (a2 = a()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.edit();
        for (String str : map.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    edit.putString(str, str2);
                }
            }
        }
        return edit.commit();
    }
}
