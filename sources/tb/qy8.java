package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.HomePageConstantKey;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context b;

    /* renamed from: a  reason: collision with root package name */
    public static final String f27001a = "__NULL__";
    public static final Map<String, String> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(473956383);
        }

        public static /* synthetic */ SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("3aa2bed6", new Object[]{str});
            }
            return d(str);
        }

        public static boolean b(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f0d246b", new Object[]{str, str2, new Boolean(z)})).booleanValue();
            }
            return c(str, str2, z);
        }

        public static boolean c(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("98a8bd14", new Object[]{str, str2, new Boolean(z)})).booleanValue();
            }
            SharedPreferences d = d(str);
            if (d != null) {
                return d.getBoolean(str2, z);
            }
            return z;
        }

        public static SharedPreferences d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
            }
            Context a2 = qy8.a();
            if (a2 == null) {
                a2 = Globals.getApplication();
            }
            if (a2 != null) {
                return a2.getSharedPreferences(str, 0);
            }
            return null;
        }

        public static String e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
            }
            return f(str, str2, str3);
        }

        public static String f(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4de5145d", new Object[]{str, str2, str3});
            }
            SharedPreferences d = d(str);
            if (d != null) {
                return d.getString(str2, str3);
            }
            return str3;
        }

        public static void g(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98b9220", new Object[]{str, str2, new Boolean(z)});
            } else {
                h(str, str2, z);
            }
        }

        public static void h(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db668e89", new Object[]{str, str2, new Boolean(z)});
                return;
            }
            SharedPreferences d = d(str);
            if (d != null) {
                SharedPreferences.Editor edit = d.edit();
                edit.putBoolean(str2, z);
                edit.apply();
            }
        }

        public static void i(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48297325", new Object[]{str, str2, str3});
            } else {
                j(str, str2, str3);
            }
        }

        public static void j(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc54da1c", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences d = d(str);
            if (d != null) {
                SharedPreferences.Editor edit = d.edit();
                edit.putString(str2, str3);
                edit.apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static final qy8 instance = new qy8();

        static {
            t2o.a(473956384);
        }
    }

    static {
        t2o.a(473956381);
    }

    public static /* synthetic */ Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e942c1f1", new Object[0]);
        }
        return b;
    }

    public static qy8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qy8) ipChange.ipc$dispatch("39207c21", new Object[0]);
        }
        return c.instance;
    }

    public String b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        Map<String, String> map = c;
        if (map == null || !((ConcurrentHashMap) map).containsKey(str)) {
            str3 = b.e("homepage_switch", str, str2);
        } else {
            str3 = (String) ((ConcurrentHashMap) map).get(str);
        }
        if (TextUtils.equals(str3, f27001a)) {
            return str2;
        }
        return str3;
    }

    public String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.equals("homepage_switch", str)) {
            return b(str2, str3);
        }
        String e = b.e(str, str2, str3);
        if (TextUtils.equals(e, f27001a)) {
            return str3;
        }
        return e;
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            b = context;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae994a4", new Object[]{this});
            return;
        }
        SharedPreferences a2 = b.a("homepage_switch");
        if (a2 != null) {
            for (String str : HomePageConstantKey.allKnownOrangeKeys) {
                ((ConcurrentHashMap) c).put(str, a2.getString(str, f27001a));
            }
        }
    }

    public void g(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8424d3", new Object[]{this, map});
            return;
        }
        SharedPreferences a2 = b.a("homepage_switch");
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            for (String str2 : HomePageConstantKey.allKnownOrangeKeys) {
                if (map.containsKey(str2)) {
                    str = map.get(str2);
                } else {
                    str = f27001a;
                }
                edit.putString(str2, str);
                Map<String, String> map2 = c;
                if (map2 != null) {
                    ((ConcurrentHashMap) map2).put(str2, str);
                }
            }
            edit.apply();
        }
    }

    public qy8() {
    }
}
