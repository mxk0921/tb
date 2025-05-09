package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.mce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30460a;
    public volatile Map<String, String> b;
    public volatile Map<String, String> c;
    public volatile Map<String, String> d;
    public volatile Map<String, String> e;
    public volatile Map<String, String> f;
    public volatile Map<String, String> g;
    public String h;
    public String i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public static final String[] UNICORN_TRUE_CONFIGS = {"enable-hybrid-plus", "enable-tile-render"};
    public static final String[] UNICORN_FALSE_CONFIGS = {"enable-share-thread", "enable-earlier-ready"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements mce.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.mce.a
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
            } else {
                w4x.a(w4x.this, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements mce.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.mce.a
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
            } else {
                w4x.b(w4x.this, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements mce.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.mce.a
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
            } else {
                w4x.c(w4x.this, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final w4x f30464a = new w4x(null);

        static {
            t2o.a(982516272);
        }
    }

    static {
        t2o.a(982516268);
    }

    public /* synthetic */ w4x(a aVar) {
        this();
    }

    public static /* synthetic */ void a(w4x w4xVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43cb6d72", new Object[]{w4xVar, map});
        } else {
            w4xVar.D(map);
        }
    }

    public static /* synthetic */ void b(w4x w4xVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4499ebf3", new Object[]{w4xVar, map});
        } else {
            w4xVar.G(map);
        }
    }

    public static /* synthetic */ void c(w4x w4xVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45686a74", new Object[]{w4xVar, map});
        } else {
            w4xVar.F(map);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3a15cda", new Object[0])).booleanValue();
        }
        return p().m;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a040caf7", new Object[0])).booleanValue();
        }
        return p().o;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f42cea", new Object[0])).booleanValue();
        }
        return p().n;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee5f27f2", new Object[0])).booleanValue();
        }
        return p().q;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd77b15", new Object[0])).booleanValue();
        }
        return p().p;
    }

    public static String j(String str, String str2) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f39c60dc", new Object[]{str, str2});
        }
        try {
            VariationSet activate = UTABTest.activate("AB_", str);
            if (activate == null || (variation = activate.getVariation(str2)) == null) {
                return null;
            }
            return variation.getValueAsString("");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d90b27b6", new Object[0])).intValue();
        }
        return p().r;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27aa51e1", new Object[0]);
        }
        return p().h;
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f1696b1", new Object[0])).intValue();
        }
        return p().j;
    }

    public static int n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72b2098b", new Object[]{str})).intValue();
        }
        int k = k();
        if (TextUtils.isEmpty(str)) {
            return k;
        }
        try {
            String w = w(Uri.parse(str).buildUpon().clearQuery().fragment("").scheme("").build().toString().replaceFirst("^(/|://|:/|//)", ""));
            if (TextUtils.isEmpty(w)) {
                return k;
            }
            return Integer.parseInt(w);
        } catch (Exception e) {
            e.printStackTrace();
            return k;
        }
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("291452d", new Object[0]);
        }
        return p().i;
    }

    public static w4x p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4x) ipChange.ipc$dispatch("887722d", new Object[0]);
        }
        return d.f30464a;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("626979af", new Object[0])).intValue();
        }
        return p().l;
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d631abc", new Object[0])).intValue();
        }
        return p().k;
    }

    public static String t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("105801ea", new Object[]{str});
        }
        return p().c.get(str);
    }

    public static String u(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ecbba56", new Object[]{str, str2, str3});
        }
        Map<String, String> map = p().c;
        if (map.isEmpty()) {
            return str3;
        }
        String str4 = map.get(str);
        if (str4 == null) {
            return str2;
        }
        return str4;
    }

    public static String w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31dd6421", new Object[]{str});
        }
        return p().e.get(str);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c307ad43", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffcac8a8", new Object[0])).booleanValue();
        }
        return true;
    }

    public final int A(Map<String, String> map, Map<String, String> map2, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd0aba8c", new Object[]{this, map, map2, str, new Integer(i)})).intValue();
        }
        String str2 = map2.get(str);
        if (str2 != null) {
            try {
                int parseInt = Integer.parseInt(str2);
                map.put(str, str2);
                return parseInt;
            } catch (NumberFormatException e) {
                dwh.x("WeexConfig", "int format error for: " + str, e);
            }
        }
        map.put(str, String.valueOf(i));
        return i;
    }

    public final String C(Map<String, String> map, Map<String, String> map2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44a49b9e", new Object[]{this, map, map2, str, str2});
        }
        String str3 = map2.get(str);
        if (str3 != null) {
            map.put(str, str3);
            return str3;
        }
        map.put(str, str2);
        return str2;
    }

    public final void D(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99903a08", new Object[]{this, map});
            return;
        }
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        this.c = Collections.unmodifiableMap(map);
                        this.b = E(this.c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c = Collections.emptyMap();
            this.b = E(this.c);
        }
    }

    public final void F(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af1c021", new Object[]{this, map});
            return;
        }
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        this.g = Collections.unmodifiableMap(map);
                        this.f = H(this.g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g = Collections.emptyMap();
            this.f = H(this.g);
        }
    }

    public final void G(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e59854", new Object[]{this, map});
            return;
        }
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        this.e = Collections.unmodifiableMap(map);
                        this.d = I(this.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.e = Collections.emptyMap();
            this.d = I(this.e);
        }
    }

    public final Map<String, String> H(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72e7382c", new Object[]{this, map});
        }
        return Collections.unmodifiableMap(new HashMap());
    }

    public final Map<String, String> I(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3959dd9", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        this.r = A(hashMap, map, "default", 98);
        return Collections.unmodifiableMap(hashMap);
    }

    public final void d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce20b59", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences sharedPreferences = this.f30460a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(str, z).apply();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public w4x() {
        new HashMap();
        this.c = new HashMap();
        new HashMap();
        this.e = new HashMap();
        new HashMap();
        this.g = new HashMap();
        u8x.i("WeexConfigUtilInit");
        Application a2 = f5x.a();
        if (a2 != null) {
            this.f30460a = a2.getSharedPreferences("weex_2_preference", 0);
        } else {
            this.f30460a = null;
        }
        mce d2 = r3x.d();
        d2.a(MUSDKInstance.UNICORN_CONFIG_GROUP, new a());
        d2.a(MUSDKInstance.UNICORN_WHITE_SCREEN_CONFIG_GROUP, new b());
        d2.a("qking_so_ab_config", new c());
        D(d2.getConfigs(MUSDKInstance.UNICORN_CONFIG_GROUP));
        G(d2.getConfigs(MUSDKInstance.UNICORN_WHITE_SCREEN_CONFIG_GROUP));
        F(d2.getConfigs("qking_so_ab_config"));
        u8x.j();
    }

    public final Map<String, String> E(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ff27564", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        this.p = z(hashMap, map, "enable-print-throwable", false, false);
        this.m = z(hashMap, map, "enable-engine-reuse6", true, true);
        this.n = z(hashMap, map, "enable-new-focus-event2", false, false);
        this.o = z(hashMap, map, "enable-extend-font", true, true);
        this.q = B(hashMap, map, "enable-lazy-load-fonts", true);
        this.k = A(hashMap, map, "monitor_report_sample_rate", 1000);
        this.j = A(hashMap, map, "exception_report_sample_rate", 1);
        this.l = A(hashMap, map, "long_task_report_sample_rate", 10);
        this.h = C(hashMap, map, "click-event-log-report", "");
        this.i = C(hashMap, map, "image-mode-white-list", "app/mtb/icart/cart");
        return Collections.unmodifiableMap(hashMap);
    }

    public static boolean s(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee7d0a25", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        Map<String, String> map = p().c;
        if (map.isEmpty()) {
            return z2;
        }
        String str2 = map.get(str);
        if (str2 == null) {
            return z;
        }
        if ("true".equals(str2)) {
            return true;
        }
        if ("false".equals(str2)) {
            return false;
        }
        return z;
    }

    public static ArrayList<String> v(Map<String, Boolean> map) {
        String[] strArr;
        String[] strArr2;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8f554b3e", new Object[]{map});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str3 : UNICORN_TRUE_CONFIGS) {
            if (map == null || map.get(str3) == null) {
                str2 = t(str3);
                if (str2 == null) {
                    str2 = "true";
                }
            } else {
                str2 = String.valueOf(map.get(str3));
            }
            arrayList.add("--" + str3 + "=" + str2);
        }
        for (String str4 : UNICORN_FALSE_CONFIGS) {
            if (map == null || map.get(str4) == null) {
                str = t(str4);
                if (str == null) {
                    str = "false";
                }
            } else {
                str = String.valueOf(map.get(str4));
            }
            arrayList.add("--" + str4 + "=" + str);
        }
        return arrayList;
    }

    public final boolean B(Map<String, String> map, Map<String, String> map2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b729ba9d", new Object[]{this, map, map2, str, new Boolean(z)})).booleanValue();
        }
        String str2 = map2.get(str);
        if (str2 != null) {
            if ("true".equals(str2)) {
                map.put(str, "true");
                d(str, true);
                return true;
            } else if ("false".equals(str2)) {
                map.put(str, "false");
                d(str, false);
                return false;
            }
        }
        if (str2 != null) {
            map.put(str, String.valueOf(z));
            d(str, z);
            return z;
        }
        try {
            SharedPreferences sharedPreferences = this.f30460a;
            if (sharedPreferences != null) {
                boolean z2 = sharedPreferences.getBoolean(str, z);
                map.put(str, String.valueOf(z2));
                return z2;
            }
        } catch (Exception e) {
            dwh.i(e);
        }
        map.put(str, String.valueOf(z));
        return z;
    }

    public final boolean z(Map<String, String> map, Map<String, String> map2, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d8a4027", new Object[]{this, map, map2, str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String str2 = "false";
        if (map2.isEmpty()) {
            if (z2) {
                str2 = "true";
            }
            map.put(str, str2);
            return z2;
        }
        String str3 = map2.get(str);
        if (str3 != null) {
            if ("true".equals(str3)) {
                map.put(str, "true");
                return true;
            } else if (str2.equals(str3)) {
                map.put(str, str2);
                return false;
            }
        }
        map.put(str, String.valueOf(z));
        return z;
    }
}
