package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class sby {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String a(Context context, String str) {
        synchronized (sby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
            }
            String a2 = kvx.a(context, "openapi_file_pri", "openApi".concat(String.valueOf(str)), "");
            if (vux.c(a2)) {
                return "";
            }
            String e = bvx.e(bvx.a(), a2);
            return vux.c(e) ? "" : e;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (sby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void c(Context context, String str, String str2) {
        synchronized (sby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
                return;
            }
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi".concat(String.valueOf(str)), bvx.b(bvx.a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
