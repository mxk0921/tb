package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AliConfigInterface f29253a = yo0.b();
    public static final Map<String, wo0> b = new HashMap();
    public static final Map<String, Map<String, String>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements wo0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wo0
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            u9v.a().put(str, map);
            if (aw6.a()) {
                iav.i("UltronOrange", "接收到Orange配置更新:namespace=", str, JSON.toJSONString(map));
            }
        }
    }

    static {
        t2o.a(794820636);
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
        Map map = (Map) ((HashMap) c).get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    public static float d(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b5130f", new Object[]{str, str2, new Float(f)})).floatValue();
        }
        return ((Float) e(str, str2, Float.valueOf(f))).floatValue();
    }

    public static <T> Object e(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("927d5840", new Object[]{str, str2, t});
        }
        AliConfigInterface aliConfigInterface = f29253a;
        if (aliConfigInterface == null) {
            return t;
        }
        g(str);
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
            iav.c(str, "UltronOrange", "key=" + str2 + ",value=" + c2);
            return t;
        }
    }

    public static boolean f(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79167770", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return ((Boolean) e(str, str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c67bc8", new Object[]{str});
            return;
        }
        AliConfigInterface aliConfigInterface = f29253a;
        if (aliConfigInterface != null) {
            HashMap hashMap = (HashMap) b;
            if (!hashMap.containsKey(str)) {
                a aVar = new a();
                hashMap.put(str, aVar);
                aliConfigInterface.b(new String[]{str}, aVar);
            }
        }
    }
}
