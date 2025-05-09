package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class emp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1032847456);
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5921344", new Object[]{str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(b98.a()).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f502d", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(b98.a()).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static int c(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d20b37a4", new Object[]{context, str, new Integer(i)})).intValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, i);
    }

    public static int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60be1c6c", new Object[]{str, new Integer(i)})).intValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(b98.a()).getInt(str, i);
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5d117e", new Object[]{str, str2});
        }
        return PreferenceManager.getDefaultSharedPreferences(b98.a()).getString(str, str2);
    }
}
