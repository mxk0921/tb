package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593005);
    }

    public static String a(Context context, String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4b4feab", new Object[]{context, str});
        }
        if (context == null || (sharedPreferences = context.getSharedPreferences("ut_setting", 4)) == null) {
            return null;
        }
        return sharedPreferences.getString(str, null);
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a0fc86", new Object[]{context, str, str2});
        } else if (context != null && (sharedPreferences = context.getSharedPreferences("ut_setting", 4)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
