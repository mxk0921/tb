package tb;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class oba {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oba INSTANCE = new oba();

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f25278a = yz3.l("wvDisableWebViewWarmup", "wvEnableSkipSnapshot", "wvEnablePostAtFrontOfQueue", "wvEnableFccDowngradeFailOver");
    public static final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    public static final Map<String, Pair<String, String>> c = kotlin.collections.a.h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25279a;
        public final boolean b;

        static {
            t2o.a(989855833);
        }

        public a(String str, boolean z) {
            ckf.g(str, "group");
            this.f25279a = str;
            this.b = z;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba4599d0", new Object[]{this});
            }
            return this.f25279a;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
            }
            return this.b;
        }
    }

    @JvmStatic
    public static final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("743e0c73", new Object[0]);
        }
        List<String> list = f25278a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hfn.c(v3i.e(zz3.q(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, e((String) obj).a());
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d2b2d005", new Object[]{str});
        }
        ConcurrentHashMap<String, a> concurrentHashMap = b;
        synchronized (concurrentHashMap) {
            a aVar = concurrentHashMap.get(str);
            if (aVar != null) {
                return aVar;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            r9u.b("getFeatureDetailInternal#" + str);
            a f = f(str);
            r9u.d();
            v7t.i("GlobalExperimentManager", "getFeatureDetailInternal: " + str + ", " + f.b() + ", " + f.a() + ", cost: " + (SystemClock.uptimeMillis() - uptimeMillis));
            concurrentHashMap.put(str, f);
            return f;
        }
    }

    @JvmStatic
    public static final a e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6828459", new Object[]{str});
        }
        ckf.g(str, "feature");
        a aVar = b.get(str);
        return aVar != null ? aVar : d(str);
    }

    @JvmStatic
    public static final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("292fc40a", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "feature");
        return e(str).b();
    }

    public final String b(String str) {
        String second;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c19b6837", new Object[]{this, str});
        }
        Pair<String, String> pair = c.get(str);
        if (pair == null || (second = pair.getSecond()) == null) {
            return "";
        }
        return second;
    }

    public final String c(String str) {
        String first;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("982a29bb", new Object[]{this, str});
        }
        Pair<String, String> pair = c.get(str);
        if (pair == null || (first = pair.getFirst()) == null) {
            return "";
        }
        return first;
    }

    @JvmStatic
    public static final a f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ad1cff36", new Object[]{str});
        }
        Application application = yaa.n;
        if (application != null) {
            oba obaVar = INSTANCE;
            String b2 = obaVar.b(str);
            String c2 = obaVar.c(str);
            String J3 = q9s.J3("windvane_common", str + "_EXP", c2);
            String J32 = q9s.J3("windvane_common", str + "_CTR", b2);
            v7t.i("GlobalExperimentManager", "getFeatureDetailInternal: " + str + ", " + J3 + ", " + J32);
            no8 k = h8s.k(application, str, "", "", J3, J32, null, 64, null);
            return new a(k.b(), k.d());
        }
        return new a(str + "_DEFAULT", false);
    }

    static {
        t2o.a(989855832);
    }
}
