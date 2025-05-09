package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AliConfigInterface f29879a = yo0.b();
    public static final Map<String, wo0> b = new HashMap();
    public static final Map<String, Map<String, String>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements wo0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wo0
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                v9v.a().put(str, map);
            }
        }
    }

    static {
        t2o.a(83886344);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return c;
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f5cd74", new Object[]{str, str2, str3});
        } else if (str3 != null) {
            Map<String, Map<String, String>> map = c;
            Map map2 = (Map) ((HashMap) map).get(str);
            if (map2 == null) {
                map2 = new HashMap();
                ((HashMap) map).put(str, map2);
            }
            map2.put(str2, str3);
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b165cc", new Object[]{str, str2});
        }
        try {
            Map map = (Map) ((HashMap) c).get(str);
            if (map == null) {
                return null;
            }
            return (String) map.get(str2);
        } catch (Throwable th) {
            f9v.q(xh8.a(str).c("UltronOrange").message(th.getMessage()));
            return null;
        }
    }

    public static float d(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b5130f", new Object[]{str, str2, new Float(f)})).floatValue();
        }
        return ((Float) h(str, str2, Float.valueOf(f))).floatValue();
    }

    public static int e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72ed8fa2", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        return ((Integer) h(str, str2, Integer.valueOf(i))).intValue();
    }

    public static long f(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c57414b", new Object[]{str, str2, new Long(j)})).longValue();
        }
        return ((Long) h(str, str2, Long.valueOf(j))).longValue();
    }

    public static String g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
        }
        String str4 = (String) h(str, str2, str3);
        if (TextUtils.isEmpty(str4)) {
            return str3;
        }
        return str4;
    }

    public static <T> Object h(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("927d5840", new Object[]{str, str2, t});
        }
        AliConfigInterface aliConfigInterface = f29879a;
        if (aliConfigInterface == null) {
            return t;
        }
        j(str);
        String c2 = c(str, str2);
        if (c2 == null) {
            c2 = aliConfigInterface.getConfig(str, str2, t == null ? null : String.valueOf(t));
            b(str, str2, c2);
        }
        try {
            if (t instanceof Boolean) {
                return Boolean.valueOf(Boolean.parseBoolean(c2));
            }
            if (t instanceof Float) {
                return Float.valueOf(Float.parseFloat(c2));
            }
            if (t instanceof Integer) {
                return Integer.valueOf(Integer.parseInt(c2));
            }
            return t instanceof Long ? Long.valueOf(Long.parseLong(c2)) : c2;
        } catch (Exception unused) {
            hav.b(str, "UltronOrange", "key=" + str2 + ",value=" + c2);
            return t;
        }
    }

    public static boolean i(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79167770", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return ((Boolean) h(str, str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c67bc8", new Object[]{str});
            return;
        }
        AliConfigInterface aliConfigInterface = f29879a;
        if (aliConfigInterface != null) {
            HashMap hashMap = (HashMap) b;
            if (!hashMap.containsKey(str)) {
                a aVar = new a();
                hashMap.put(str, aVar);
                aliConfigInterface.b(new String[]{str}, aVar);
            }
        }
    }

    public static void k(String str, wo0 wo0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961a26d6", new Object[]{str, wo0Var});
            return;
        }
        AliConfigInterface aliConfigInterface = f29879a;
        if (aliConfigInterface != null) {
            aliConfigInterface.b(new String[]{str}, wo0Var);
        }
    }

    public static void l(String str, wo0 wo0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6ecfef", new Object[]{str, wo0Var});
            return;
        }
        AliConfigInterface aliConfigInterface = f29879a;
        if (aliConfigInterface != null) {
            aliConfigInterface.a(new String[]{str}, wo0Var);
        }
    }
}
