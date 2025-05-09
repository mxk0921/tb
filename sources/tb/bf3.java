package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bf3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("64930f9f", new Object[]{str});
            }
            return new a("CashDesk", str, "29841-tracker", bf3.a());
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/utils/CashDeskJSTracker$CashDeskCustomModel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends p5j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/utils/CashDeskJSTracker$CashMtopModel");
        }

        public static b o(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a0e80717", new Object[]{str, new Boolean(z)});
            }
            return new b("CashDesk", "29841-tracker", bf3.a(), str, z);
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return c();
    }

    public static void b(Map<String, String> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2fcc69", new Object[]{map, str, str2, str3});
            return;
        }
        String str4 = "未知";
        String str5 = map == null ? str4 : map.get("from");
        String b2 = igy.b(igy.a(map));
        h15 tag = a.a("payResult").tag(str2);
        if (str5 == null) {
            str5 = str4;
        }
        h15 dimension = tag.dimension("d1", str5);
        if (str == null) {
            str = str4;
        }
        h15 dimension2 = dimension.dimension("d2", str);
        if (b2 != null) {
            str4 = b2;
        }
        h15 sampling = dimension2.dimension("d3", str4).message(str3).sampling(0.1f);
        hav.d("CashDeskJSTracker", "aliPayResultMonitor tag:" + str2 + ",message:" + str3);
        if (yv6.a()) {
            sampling.sampling(1.0f);
        }
        f9v.p(sampling);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[0]);
        }
        if (yv6.a()) {
            return "http://taobao.com/jstracker/android/debug/cashdesk.html";
        }
        return "http://taobao.com/jstracker/android/cashdesk.html";
    }

    public static float d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79338cc", new Object[]{new Float(f)})).floatValue();
        }
        if (yv6.a()) {
            return 1.0f;
        }
        return f;
    }

    public static void f(h15 h15Var) {
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

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{str, str2});
            return;
        }
        f9v.q(xh8.b("CashDesk", "29841-tracker", c()).c(str).message(str2));
        if (yv6.a()) {
            Toast.makeText(Globals.getApplication(), str2, 1).show();
        }
    }

    public static void h(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (p5jVar instanceof b) {
            if (yv6.a()) {
                p5jVar.sampling(1.0f);
            }
            f9v.r(p5jVar);
        } else if (yv6.a()) {
            throw new IllegalArgumentException("model 必须为CashMtopModel");
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bf5730", new Object[0]);
        } else {
            f9v.s(new bkl("CashDesk", "29841-tracker", c()).sampling(d(0.01f)));
        }
    }

    public static void k(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe47dbc", new Object[]{map, str, str2});
            return;
        }
        String str3 = "未知";
        String str4 = map == null ? str3 : map.get("from");
        h15 tag = a.a("WechatPayResult").tag(str);
        if (str4 != null) {
            str3 = str4;
        }
        h15 sampling = tag.dimension("d1", str3).message(str2).sampling(0.1f);
        hav.d("CashDeskJSTracker", "wxPayResultMonitor tag:" + str + ",message:" + str2);
        if (yv6.a()) {
            sampling.sampling(1.0f);
        }
        f9v.p(sampling);
    }

    public static void l(String str, int i, String str2, String str3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7544e2fc", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        h15 tag = a.a("asyncBranch").tag(str);
        if (i != 0) {
            z = false;
        }
        f9v.p(tag.branchEntry(z).dimension("d1", str2).dimension("d2", str3).branch(i).sampling(1.0f));
    }

    public static void e(String str, int i, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd32a9a", new Object[]{str, new Integer(i), str2});
            return;
        }
        h15 tag = a.a("tbCashDeskRate").tag(str);
        if (i != 0) {
            z = false;
        }
        h15 sampling = tag.branchEntry(z).dimension("d1", str2).branch(i).sampling(0.1f);
        if (yv6.a()) {
            sampling.sampling(1.0f);
        }
        f9v.p(sampling);
    }

    public static void j(String str, Map<String, Long> map, List<String> list, float f) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8118118", new Object[]{str, map, list, new Float(f)});
        } else if (map.isEmpty()) {
            hav.a("AliBuyJSTracker#reportPerf", "stages 不能为空");
        } else {
            pwl e = new pwl("CashDesk", "29841-tracker", c()).e(str);
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
            if (yv6.a()) {
                f = 1.0f;
            }
            e.sampling(f);
            f9v.t(e);
        }
    }
}
