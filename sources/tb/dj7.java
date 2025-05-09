package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(147849246);
    }

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("648d8561", new Object[0])).booleanValue();
        }
        return Build.MANUFACTURER.equalsIgnoreCase(SystemUtils.PRODUCT_HONOR);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e37e48", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            String a2 = a(m.v);
            String a3 = a("hw_sc.build.platform.version");
            if (TextUtils.isEmpty(a2) && TextUtils.isEmpty(a3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return !TextUtils.isEmpty((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.flyme.version", ""));
        } catch (Exception unused) {
            return false;
        }
    }
}
