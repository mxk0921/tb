package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nbv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sBizName = "tradeHybridContainer";
    public static final String sPid = "29266-tracker";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286909);
        }

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("35c1db23", new Object[]{str});
            }
            return new a(nbv.sBizName, str, nbv.sPid, "http://taobao.com/jstracker/android/tradeHybridContainer.html");
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/tracker/UltronTradeHybridJSTracker$UltronTradeHybridCustomModel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends p5j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286910);
        }

        public b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/tracker/UltronTradeHybridJSTracker$UltronTradeHybridMtopModel");
        }

        public static b o(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("42ffe6a0", new Object[]{str, new Boolean(z)});
            }
            return new b(nbv.sBizName, nbv.sPid, "http://taobao.com/jstracker/android/tradeHybridContainer.html", str, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends pwl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286911);
        }

        public c(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        public static c f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("36e0509b", new Object[]{str});
            }
            c cVar = new c(nbv.sBizName, nbv.sPid, "http://taobao.com/jstracker/android/tradeHybridContainer.html");
            cVar.e(str);
            return cVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/tracker/UltronTradeHybridJSTracker$UltronTradeHybridPerfModel");
        }
    }

    static {
        t2o.a(157286908);
    }

    public static void a(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (h15Var instanceof a) {
            f9v.p(h15Var);
        } else {
            throw new IllegalArgumentException("请使用UltronTradeHybridCustomModel");
        }
    }

    public static void b(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (p5jVar instanceof b) {
            f9v.r(p5jVar);
        } else {
            throw new IllegalArgumentException("请使用UltronTradeHybridMtopModel");
        }
    }

    public static void c(String str, String str2, long j, float f, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99078231", new Object[]{str, str2, new Long(j), new Float(f), map});
        } else if (j >= 0) {
            c f2 = c.f(str);
            f2.a(str2, j);
            if (cw6.b()) {
                f = 1.0f;
            }
            f2.sampling(f);
            f2.c(map);
            f9v.t(f2);
        }
    }
}
