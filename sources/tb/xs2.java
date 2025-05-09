package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31577a = xs2.class.getSimpleName();

    static {
        t2o.a(295699733);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13c082d7", new Object[]{context, str});
        }
        if (context != null && !zqq.a(str)) {
            try {
                return context.getSharedPreferences("taobao_live_home", 0).getString(str, "");
            } catch (Exception e) {
                o3s.c(f31577a, "readPreferences exp", e);
            }
        }
        return "";
    }

    public static boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a027340", new Object[]{context, str, str2})).booleanValue();
        }
        if (context != null && !zqq.a(str)) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("taobao_live_home", 0).edit();
                edit.putString(str, str2);
                edit.apply();
                return true;
            } catch (Exception e) {
                o3s.c(f31577a, "writePreferences exp", e);
            }
        }
        return false;
    }
}
