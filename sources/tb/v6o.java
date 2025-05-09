package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29817a = "";
    public static boolean b = false;

    static {
        t2o.a(962592895);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("592cda11", new Object[0]);
        }
        return b("hw_sc.build.platform.version", "");
    }

    public static String b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            if (TextUtils.isEmpty(str3)) {
                return str2;
            }
            return str3;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2a0aba5", new Object[]{context});
        }
        if (b || context == null) {
            return f29817a + ",oaid=" + vyp.i().n();
        }
        synchronized (v6o.class) {
            try {
                if (b) {
                    return f29817a;
                }
                if (d()) {
                    String a2 = a();
                    f29817a = "hmos=1,hmv=" + a2;
                } else {
                    f29817a = "hmos=0";
                }
                b = true;
                return f29817a + ",oaid=" + vyp.i().n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
