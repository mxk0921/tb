package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(301990105);
        }

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a3355ed5", new Object[]{str});
            }
            return new a("AliBuy", str, "29224-tracker", vm0.a());
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/utils/AliBuyJSTracker$BuyCustomModel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends p5j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(301990106);
        }

        public b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/utils/AliBuyJSTracker$BuyMtopModel");
        }

        public static b o(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d756346", new Object[]{str, new Boolean(z)});
            }
            return new b("AliBuy", "29224-tracker", vm0.a(), str, z);
        }
    }

    static {
        t2o.a(301990104);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return b();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[0]);
        }
        if (yv6.a()) {
            return "http://taobao.com/jstracker/android/debug/tbbuy.html";
        }
        return "http://taobao.com/jstracker/android/tbbuy.html";
    }

    public static float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79338cc", new Object[]{new Float(f)})).floatValue();
        }
        if (yv6.a() || scv.b()) {
            return 1.0f;
        }
        return f;
    }

    public static void d(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (h15Var instanceof a) {
            if (yv6.a()) {
                h15Var.sampling(1.0f);
            }
            f9v.p(h15Var);
        } else if (yv6.a()) {
            throw new IllegalArgumentException("model 必须为BuyCustomModel");
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{str, str2});
        } else {
            f9v.q(xh8.b("AliBuy", "29224-tracker", b()).c(str).message(str2));
        }
    }

    public static void f(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (p5jVar instanceof b) {
            if (yv6.a()) {
                p5jVar.sampling(1.0f);
            }
            f9v.r(p5jVar);
        } else if (yv6.a()) {
            throw new IllegalArgumentException("model 必须为BuyMtopModel");
        }
    }

    public static void g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42bf690", new Object[]{new Float(f)});
        } else {
            f9v.s(new bkl("AliBuy", "29224-tracker", b()).sampling(c(f)));
        }
    }

    public static void h(String str, Map<String, Long> map, List<String> list, String str2, float f) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ceea8e", new Object[]{str, map, list, str2, new Float(f)});
        } else if (map.isEmpty()) {
            hav.a("AliBuyJSTracker#reportPerf", "stages 不能为空");
        } else {
            pwl e = new pwl("AliBuy", "29224-tracker", b()).e(str);
            if (list != null) {
                while (i < list.size()) {
                    StringBuilder sb = new StringBuilder("d");
                    int i2 = i + 1;
                    sb.append(i2);
                    e.b(sb.toString(), list.get(i));
                    i = i2;
                }
            }
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                e.a(entry.getKey(), entry.getValue().longValue());
            }
            if (!TextUtils.isEmpty(str2)) {
                e.message(str2);
            }
            e.sampling(c(f));
            f9v.t(e);
        }
    }
}
