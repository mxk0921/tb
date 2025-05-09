package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f32809a;

    static {
        t2o.a(785383562);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        return a(context).getString(str, "");
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcb1db5", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("14639e4a", new Object[]{context});
        }
        if (f32809a == null) {
            f32809a = context.getApplicationContext().getSharedPreferences("tb_sku_sp_util", 0);
        }
        return f32809a;
    }
}
