package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ns6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_HOME_DX_DATA = "home_dx_data";

    static {
        t2o.a(487587975);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("331957c5", new Object[]{str, str2});
        }
        return b("homepage_biz_switch", str, str2);
    }

    public static String b(String str, String str2, String str3) {
        Application a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eef51bfb", new Object[]{str, str2, str3});
        }
        if (!TextUtils.isEmpty(str2) && (a2 = rj7.a()) != null) {
            return a2.getSharedPreferences(str, 0).getString(str2, str3);
        }
        return null;
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cde6", new Object[]{str, str2})).booleanValue();
        }
        return d("homepage_biz_switch", str, str2);
    }

    public static boolean d(String str, String str2, String str3) {
        Application a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4b80330", new Object[]{str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || (a2 = rj7.a()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
        return true;
    }
}
