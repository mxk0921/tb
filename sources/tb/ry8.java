package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ry8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f27670a = "__NULL__";
    public static boolean b;
    public static final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(487587939);
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("769f891e", new Object[]{str});
                return;
            }
            SharedPreferences c = c(str);
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.clear();
                edit.apply();
            }
        }

        public static void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4a42606", new Object[]{str});
            } else {
                a(str);
            }
        }

        public static SharedPreferences c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
            }
            Application a2 = rj7.a();
            if (a2 != null) {
                return a2.getSharedPreferences(str, 0);
            }
            return null;
        }

        public static String d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
            }
            return e(str, str2, str3);
        }

        public static String e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4de5145d", new Object[]{str, str2, str3});
            }
            SharedPreferences c = c(str);
            if (c != null) {
                return c.getString(str2, str3);
            }
            return str3;
        }

        public static void f(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48297325", new Object[]{str, str2, str3});
            } else {
                g(str, str2, str3);
            }
        }

        public static void g(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc54da1c", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences c = c(str);
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.putString(str2, str3);
                edit.apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static final ry8 instance = new ry8();

        static {
            t2o.a(487587940);
        }
    }

    static {
        t2o.a(487587937);
        c = true;
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
        } catch (Throwable unused) {
            c = false;
        }
    }

    public static ry8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ry8) ipChange.ipc$dispatch("cfcf440d", new Object[0]);
        }
        return c.instance;
    }

    public static synchronized void c(String str) {
        synchronized (ry8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8465b943", new Object[]{str});
            } else if (c) {
                if (!TextUtils.isEmpty(str)) {
                    if (!b) {
                        b = true;
                        OrangeConfig.getInstance().getConfigs(str);
                        OrangeConfig.getInstance().registerListener(new String[]{str}, new h9l(), true);
                    }
                }
            }
        }
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        String d = b.d(str, str2, str3);
        if (TextUtils.equals(d, f27670a)) {
            return str3;
        }
        return d;
    }

    public synchronized void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660a7649", new Object[]{this, str, map});
            return;
        }
        if (!TextUtils.isEmpty(str) && map != null) {
            b.b(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b.f(str, entry.getKey(), entry.getValue());
            }
        }
    }

    public ry8() {
    }
}
