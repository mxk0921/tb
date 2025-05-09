package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tlp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_NAME = "homepage_location_sp";

    static {
        t2o.a(486539736);
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        return context.getSharedPreferences("homepage_location_sp", 0);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        Application a2 = eue.a();
        if (a2 != null) {
            return a(a2).getString(str, str2);
        }
        fve.e("SharedPreferenceUtil", "getString error. application is null");
        return str2;
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb567a1f", new Object[]{str, str2})).booleanValue();
        }
        Application a2 = eue.a();
        if (a2 == null) {
            fve.e("SharedPreferenceUtil", "putString error. application is null");
            return false;
        }
        SharedPreferences.Editor edit = a(a2).edit();
        edit.putString(str, str2);
        edit.apply();
        return true;
    }
}
