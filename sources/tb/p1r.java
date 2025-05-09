package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class p1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f48a274", new Object[]{context, str, str2});
        } else {
            context.getSharedPreferences(rpo.SHARE_PREFERENCES_NAME, 0).edit().putString(str, str2).apply();
        }
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b7d68b3", new Object[]{context, str, str2});
        }
        return context.getSharedPreferences(rpo.SHARE_PREFERENCES_NAME, 0).getString(str, str2);
    }
}
