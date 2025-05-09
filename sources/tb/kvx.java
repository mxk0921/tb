package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kvx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53af5a22", new Object[]{context, str, str2, str3});
        }
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void b(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if (edit != null) {
            for (String str2 : map.keySet()) {
                edit.putString(str2, map.get(str2));
            }
            edit.commit();
        }
    }
}
