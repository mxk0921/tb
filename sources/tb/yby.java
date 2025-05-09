package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.security.ccrc.service.build.vb;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class yby {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f31973a = "";

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        String a2 = hvx.a(context, "vkeyid_settings", "update_time_interval");
        if (!vux.f(a2)) {
            return 86400000L;
        }
        try {
            return Long.parseLong(a2);
        } catch (Exception unused) {
            return 86400000L;
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            d(context, "update_time_interval", str);
        }
    }

    public static void c(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
        } else {
            hvx.b(context, "vkeyid_settings", "vkey_valid".concat(String.valueOf(str)), String.valueOf(j));
        }
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            hvx.b(context, "vkeyid_settings", str, str2);
        }
    }

    public static void e(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        d(context, vb.m, str);
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        return hvx.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else {
            d(context, "last_machine_boot_time", str);
        }
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
        } else {
            d(context, "last_apdid_env", str);
        }
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        return hvx.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
        } else {
            d(context, "agent_switch", str);
        }
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        return hvx.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static void m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
        } else {
            d(context, "dynamic_key", str);
        }
    }

    public static void o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab5f85", new Object[]{context, str});
        } else {
            d(context, "webrtc_url", str);
        }
    }

    public static void p(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc760164", new Object[]{context, str});
        } else {
            d(context, "apse_degrade", str);
        }
    }

    public static long q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f640a337", new Object[]{context, str})).longValue();
        }
        try {
            String a2 = hvx.a(context, "vkeyid_settings", "vkey_valid".concat(String.valueOf(str)));
            if (vux.c(a2)) {
                return 0L;
            }
            return Long.parseLong(a2);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String n(Context context) {
        String str;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        synchronized (yby.class) {
            try {
                if (vux.c(f31973a)) {
                    String a2 = kvx.a(context, "alipay_vkey_random", pg1.ATOM_EXT_random, "");
                    f31973a = a2;
                    if (vux.c(a2)) {
                        String a3 = avx.a(UUID.randomUUID().toString());
                        f31973a = a3;
                        if (!(a3 == null || (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) == null)) {
                            edit.putString(pg1.ATOM_EXT_random, a3);
                            edit.commit();
                        }
                    }
                }
                str = f31973a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        String a2 = hvx.a(context, "vkeyid_settings", vb.m);
        return a2 != null && "1".equals(a2);
    }
}
