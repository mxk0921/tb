package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0d0f37c", new Object[]{str, str2});
        }
        return Globals.getApplication().getSharedPreferences("android_mts", 0).getString(str, str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3703f2", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("android_mts", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
