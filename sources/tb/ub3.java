package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ub3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PID = "28330-tracker";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Long> f29271a = new HashMap();
    public static final Map<String, Map<String, String>> b = new HashMap();
    public static final Map<String, Map<String, String>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(479199566);
        }

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b96918bc", new Object[]{str});
            }
            return new a(c9x.CART_BIZ_NAME, str, ub3.PID, ub3.b());
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/utils/CartJSTracker$CartCustomModel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends p5j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(479199567);
        }

        public b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/utils/CartJSTracker$CartMtopModel");
        }

        public static b o(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("776dbbf9", new Object[]{str, new Boolean(z)});
            }
            return new b(c9x.CART_BIZ_NAME, ub3.PID, ub3.b(), str, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends pwl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(479199568);
        }

        public c(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        public static c f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("223c2074", new Object[]{str});
            }
            c cVar = new c(c9x.CART_BIZ_NAME, ub3.PID, ub3.b());
            cVar.e(str);
            return cVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/utils/CartJSTracker$CartPerfModel");
        }
    }

    static {
        t2o.a(479199565);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[0]);
        }
        return "http://taobao.com/jstracker/android/cart.html";
    }

    public static float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79338cc", new Object[]{new Float(f)})).floatValue();
        }
        if (n7v.a() || scv.b()) {
            return 1.0f;
        }
        return f;
    }

    public static void d(String str, String str2, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fd464c", new Object[]{str, str2, new Boolean(z), new Float(f)});
            return;
        }
        a a2 = a.a(str);
        a2.message(str2);
        a2.success(z);
        a2.sampling(f);
        e(a2);
    }

    public static void e(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (!(h15Var instanceof a)) {
            g("reportCustom", "请传入CartCustomModel");
            if (n7v.a()) {
                throw new IllegalArgumentException("请传入CartCustomModel");
            }
        } else {
            f9v.p(h15Var.sampling(c(h15Var.getSampling())));
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd48c5", new Object[]{str});
        } else {
            h("", str, 1.0f);
        }
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{str, str2});
        } else {
            h(str, str2, 1.0f);
        }
    }

    public static void h(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b82651", new Object[]{str, str2, new Float(f)});
        } else {
            f9v.q(xh8.b(c9x.CART_BIZ_NAME, PID, b()).c(str).sampling(c(f)).message(str2));
        }
    }

    public static void i(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (!(p5jVar instanceof b)) {
            g("reportMtop", "请传入CartMtopModel");
            if (n7v.a()) {
                throw new IllegalArgumentException("请传入CartMtopModel");
            }
        } else {
            f9v.r(p5jVar.sampling(c(p5jVar.getSampling())));
        }
    }

    public static void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42bf690", new Object[]{new Float(f)});
        } else {
            f9v.s(new bkl(c9x.CART_BIZ_NAME, PID, b()).sampling(c(f)));
        }
    }

    public static void k(String str, String str2, long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36bf56d4", new Object[]{str, str2, new Long(j), new Float(f)});
        } else if (j < 0) {
            hav.b(c9x.CART_BIZ_NAME, "性能数据小于0，不合法:", str2);
        } else {
            c f2 = c.f(str);
            f2.a(str2, j);
            f2.sampling(f);
            l(f2);
        }
    }

    public static void l(pwl pwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e69e302", new Object[]{pwlVar});
        } else if (!(pwlVar instanceof c)) {
            g("reportPerf", "perfModel必须为CartPerfModel类型");
            if (n7v.a()) {
                throw new IllegalArgumentException("请传入CartPerfModel");
            }
        } else {
            pwlVar.sampling(c(pwlVar.getSampling()));
            f9v.t(pwlVar);
        }
    }

    public static void m(String str, String str2, boolean z, float f, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8972f240", new Object[]{str, str2, new Boolean(z), new Float(f), map});
            return;
        }
        String str3 = str + str2;
        Long l = (Long) ((HashMap) f29271a).remove(str3);
        if (l != null && z) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (currentTimeMillis >= 0) {
                c f2 = c.f(str);
                f2.a(str2, currentTimeMillis);
                f2.sampling(f);
                HashMap hashMap = new HashMap();
                Map map2 = (Map) ((HashMap) c).get(str);
                if (map2 != null) {
                    hashMap.putAll(map2);
                }
                Map map3 = (Map) ((HashMap) b).remove(str3);
                if (map3 != null) {
                    hashMap.putAll(map3);
                }
                if (map != null) {
                    hashMap.putAll(map);
                }
                f2.c(hashMap);
                l(f2);
            }
        }
    }

    public static void n(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed208a45", new Object[]{str, str2, map});
            return;
        }
        String str3 = str + str2;
        Map<String, Long> map2 = f29271a;
        if (!((HashMap) map2).containsKey(str3)) {
            ((HashMap) map2).put(str3, Long.valueOf(System.currentTimeMillis()));
            ((HashMap) b).put(str3, map);
        }
    }

    public static void o(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9e27ac", new Object[]{str, map});
            return;
        }
        if (map != null) {
            ((HashMap) c).put(str, map);
        }
        n(str, "总耗时", map);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b8d1a5", new Object[]{str, map});
            return;
        }
        m(str, "总耗时", true, 0.05f, map);
        ((HashMap) c).remove(str);
    }
}
