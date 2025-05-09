package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BehaviXAppAdapter;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.o0r;
import tb.oy8;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v82 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INIT_FAST_GROUP_NAME = "behavix_init";
    public static final String K_ENABLE_BEHAVIR = "behaviREnable";
    public static final String K_NEW_TABLE_WRITE = "new_table_write";
    public static final String ORANGE_GROUP_NAME = "behavix";

    /* renamed from: a  reason: collision with root package name */
    public static final String f29847a = "__NULL__";
    public static boolean b = false;
    public static boolean c = true;
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = false;
    public static boolean h = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static Context f29848a;

        static {
            t2o.a(404750484);
        }

        public static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            if (f29848a == null) {
                f29848a = f82.d();
            }
            Context context = f29848a;
            if (context != null) {
                return m7l.a(context, str, 0);
            }
            return null;
        }

        public static /* synthetic */ void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            } else {
                d(str, str2, str3);
            }
        }

        public static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            if (a2 != null) {
                return a2.getString(str2, str3);
            }
            return str3;
        }

        public static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 != null) {
                a2.edit().putString(str2, str3).apply();
            }
        }

        public static String e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
            }
            return c(str, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750486);
            t2o.a(613416995);
        }

        public d() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(v82.ORANGE_GROUP_NAME);
                oy8.c().d(v82.ORANGE_GROUP_NAME, configs);
                oy8.c().e(configs);
                v82.b();
                gg4.l().n();
                LogUtils.h();
                gwv.B();
            } catch (Exception e) {
                q82.f("onConfigUpdate", null, null, e);
            }
        }
    }

    static {
        t2o.a(404750482);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return f29847a;
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            e();
        }
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return h;
    }

    public static synchronized void d() {
        synchronized (v82.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
            } else if (!g) {
                try {
                    OrangeConfig.getInstance().getConfigs(ORANGE_GROUP_NAME);
                    OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME}, new d(), true);
                    f();
                    g = true;
                } catch (Exception e2) {
                    q82.f("BehaviX_switch_init_error", null, null, e2);
                }
            }
        }
    }

    @Deprecated
    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        b = e.c(true);
        c = e.e(true);
        d = e.m("enable_expose_area", true, true);
        e = e.m(K_NEW_TABLE_WRITE, BehaviXAppAdapter.b(K_NEW_TABLE_WRITE), true);
        f = e.m(K_ENABLE_BEHAVIR, true, true);
        e.n("behaviRHistoryEventCount", 200, true);
        e.n("behaviRHistoryEventClearCount", 50, true);
        String str = "false";
        e.b(b ? "true" : str);
        e.d(c ? "true" : str);
        e.f(d ? "true" : str);
        if (e) {
            str = "true";
        }
        b.b(ORANGE_GROUP_NAME, K_NEW_TABLE_WRITE, str);
        c.H();
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        b = e.c(false);
        c = e.e(false);
        d = e.m("enable_expose_area", true, false);
        e = e.m(K_NEW_TABLE_WRITE, BehaviXAppAdapter.b(K_NEW_TABLE_WRITE), false);
        f = e.m(K_ENABLE_BEHAVIR, true, false);
        e.n("behaviRHistoryEventCount", 200, false);
        e.n("behaviRHistoryEventClearCount", 50, false);
        c.H();
    }

    public static Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b7c5fbd", new Object[0]);
        }
        SharedPreferences c2 = oy8.b.c(ORANGE_GROUP_NAME);
        HashMap hashMap = new HashMap();
        if (c2 == null) {
            return hashMap;
        }
        Map<String, ?> all = c2.getAll();
        if (all == null) {
            return hashMap;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (!f29847a.equals(entry.getValue())) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static boolean h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c9dc565", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String l = l(str, z + "");
        return TextUtils.isEmpty(l) ? z : l.trim().toLowerCase().equals("true");
    }

    public static double i(String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dcb64b2", new Object[]{str, new Double(d2)})).doubleValue();
        }
        try {
            return Double.valueOf(l(str, d2 + "")).doubleValue();
        } catch (Throwable unused) {
            return d2;
        }
    }

    public static float j(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adb262b7", new Object[]{str, new Float(f2)})).floatValue();
        }
        try {
            return Float.parseFloat(l(str, f2 + ""));
        } catch (Throwable unused) {
            return f2;
        }
    }

    public static int k(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd78aaca", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(l(str, i + "")).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    public static String l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c405fcfb", new Object[]{str, str2});
        }
        try {
            return oy8.c().b(ORANGE_GROUP_NAME, str, str2);
        } catch (Exception e2) {
            TLog.loge("behavix_track", "BehaviXSwitch", e2);
            return str2;
        }
    }

    public static String m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61a90ed6", new Object[]{str, str2});
        }
        oy8 c2 = oy8.c();
        String b2 = c2.b(INIT_FAST_GROUP_NAME, str, str2 + "");
        if (TextUtils.isEmpty(b2)) {
            return str2;
        }
        return b2;
    }

    public static boolean n(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3cb1998", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        oy8 c2 = oy8.c();
        String b2 = c2.b(INIT_FAST_GROUP_NAME, str, z + "");
        return TextUtils.isEmpty(b2) ? z : b2.trim().toLowerCase().equals("true");
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43c4b81", new Object[0])).booleanValue();
        }
        if (!g) {
            d();
        }
        return f;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14575329", new Object[0])).booleanValue();
        }
        if (!g) {
            d();
        }
        return d;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176b4aaf", new Object[0])).booleanValue();
        }
        if (!g) {
            d();
        }
        return e;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6e3e7e", new Object[0])).booleanValue();
        }
        if (!g) {
            d();
        }
        if (!c || h) {
            return false;
        }
        return true;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac4252c", new Object[0])).booleanValue();
        }
        return g;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("161ae7cc", new Object[0])).booleanValue();
        }
        return h;
    }

    public static void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40ca744", new Object[]{new Boolean(z)});
        } else {
            h = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<Integer, JSONObject> f29850a = new LinkedHashMap();

        static {
            t2o.a(404750487);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
            }
            String e = b.e(str, str2, str3);
            if (TextUtils.equals(e, v82.a())) {
                return str3;
            }
            return e;
        }

        public static /* synthetic */ void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                h(str);
            }
        }

        public static /* synthetic */ boolean c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
            }
            return g(z);
        }

        public static /* synthetic */ void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            } else {
                j(str);
            }
        }

        public static /* synthetic */ boolean e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
            }
            return i(z);
        }

        public static /* synthetic */ void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            } else {
                k(str);
            }
        }

        public static void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            } else {
                b.b(v82.ORANGE_GROUP_NAME, "enableUserActionUpload", str);
            }
        }

        public static void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            } else {
                b.b(v82.ORANGE_GROUP_NAME, "enable_user_track", str);
            }
        }

        public static void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("669e4a77", new Object[]{str});
            } else {
                b.b(v82.ORANGE_GROUP_NAME, "enable_expose_area", str);
            }
        }

        public static String l(String str, String str2, boolean z) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("31529c5c", new Object[]{str, str2, new Boolean(z)});
            }
            try {
                if (z) {
                    str3 = OrangeConfig.getInstance().getConfig(v82.ORANGE_GROUP_NAME, str, str2);
                } else {
                    str3 = a(v82.ORANGE_GROUP_NAME, str, str2);
                }
                TLog.logd("BehaviXSwitch", str + "=" + str3);
                return str3;
            } catch (Exception e) {
                q82.f("getBehaviXConfigException", null, null, e);
                return str2;
            }
        }

        public static boolean m(String str, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fe9d2a9", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            try {
                return Boolean.valueOf(l(str, z + "", z2)).booleanValue();
            } catch (Throwable unused) {
                return z;
            }
        }

        public static int n(String str, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d19d62d0", new Object[]{str, new Integer(i), new Boolean(z)})).intValue();
            }
            try {
                return Integer.valueOf(l(str, i + "", z)).intValue();
            } catch (Throwable unused) {
                return i;
            }
        }

        public static JSONObject o(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1df45abd", new Object[]{str, str2, new Boolean(z)});
            }
            String l = l(str, str2, z);
            int hashCode = l.hashCode();
            HashMap<Integer, JSONObject> hashMap = f29850a;
            if (hashMap.containsKey(Integer.valueOf(hashCode))) {
                return hashMap.get(Integer.valueOf(hashCode));
            }
            try {
                JSONObject parseObject = JSON.parseObject(l);
                if (parseObject == null) {
                    parseObject = new JSONObject();
                }
                hashMap.put(Integer.valueOf(hashCode), parseObject);
                return parseObject;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }

        public static boolean g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
            }
            String l = l("enableUserActionUpload", "false", z);
            return !TextUtils.isEmpty(l) && l.equalsIgnoreCase("true");
        }

        public static boolean i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{new Boolean(z)})).booleanValue();
            }
            String l = l("enable_user_track", "true", z);
            return !TextUtils.isEmpty(l) && l.equalsIgnoreCase("true");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static String b;
        public static final int[] i;
        public static int[] j;
        public static JSONObject l;
        public static Set<String> u;

        /* renamed from: a  reason: collision with root package name */
        public static boolean f29849a = false;
        public static int c = 10;
        public static boolean d = false;
        public static boolean e = true;
        public static boolean f = true;
        public static boolean g = true;
        public static boolean h = true;
        public static String k = "{\"custom\":[19999],\"pv\":[2001],\"tap\":[2101],\"scroll\":[2601],\"expose\":[2201, 2202]}";
        public static boolean m = true;
        public static boolean n = true;
        public static boolean o = false;
        public static double p = vu3.b.GEO_NOT_SUPPORT;
        public static double q = vu3.b.GEO_NOT_SUPPORT;
        public static double r = vu3.b.GEO_NOT_SUPPORT;
        public static float s = 1.0f;
        public static boolean t = false;

        public static boolean A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae624788", new Object[0])).booleanValue();
            }
            return gwv.w(p);
        }

        public static boolean B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58d9aaca", new Object[0])).booleanValue();
            }
            return h;
        }

        public static boolean C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5136b7b9", new Object[0])).booleanValue();
            }
            return g;
        }

        public static boolean D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c89ffea4", new Object[0])).booleanValue();
            }
            return gwv.w(r);
        }

        public static boolean E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1860179b", new Object[0])).booleanValue();
            }
            return gwv.w(q);
        }

        public static boolean F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45638c98", new Object[0])).booleanValue();
            }
            return e.m("removeAppVersionCheck", true, false);
        }

        public static void G(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86df75be", new Object[]{new Boolean(z)});
            }
        }

        public static void H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29bc46b1", new Object[0]);
                return;
            }
            b = v82.l("supportDeviceLevels", "l,m,h,unknow");
            mj7.a();
            f29849a = v82.n(o0r.c.K_ENABLE_ALL_DATA, "taobao".equals(f82.c()) && bkt.c().e());
            c = v82.k("uppTrackSampling", 100);
            a(v82.l("uppFailedPostErrorCodeBalckList", ""));
            DAIKVStoreage.put("BehaviX", o0r.c.K_ENABLE_ALL_DATA, f29849a + "");
            b(v82.l("brTaskBlackIds", ""));
            d = v82.n(o0r.c.K_ENABLE_CHANGE_UTLISTENER, false);
            d(v82.l("ucpConvertProtocolSchemeIds", "Page_Detail_float_view,Page_MyTaobao_10_icon,Page_Home_10_icon"));
            e = v82.h("isChangeUTCustomNum", true);
            f = v82.h("enableBHXCXXBUFS", true);
            m = v82.h("enableLocalFeature", true);
            n = v82.h("enableExpFocusDur", true);
            t = v82.h("bhx_android_closeBizArgs", true);
            o = v82.h("isExpUpdateSupportScroll", false);
            e(v82.l(o0r.a.K_UT_LISTEN_EVENT_IDS, ""));
            r = v82.i("decodeReplaceSample", 0.5d);
            s = v82.j("scrollingStepRatio", 1.0f);
            p = v82.i("bxNativeTaskMonitorSample", rja.a() ? 0.001d : 1.0E-5d);
            q = v82.i("useUTMapSample", 0.5d);
            g = v82.h("enableCrashReport", true);
            h = v82.h("enableCpuMonitor", true);
            JSON.parseObject(v82.l("completedOptSwitchMap", "{\"ucp_cold_start_opt_new\":true}"));
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                HashMap hashMap = new HashMap(split.length);
                for (String str2 : split) {
                    try {
                        hashMap.put(Integer.valueOf(Integer.parseInt(str2)), Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public static Set<String> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("d2e8bc22", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return new HashSet();
            }
            return new HashSet(Arrays.asList(str.split(",")));
        }

        public static JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("dced99d2", new Object[0]);
            }
            return e.o("bxidMap", "{\"Page_NewDetail\":{\"bk\":[\"item_id\"]},\"Page_LiteDetail\":{\"bk\":[\"item_id\"]},\"Page_Detail\":{\"gk\":\"D\"},\"Page_New_SKU\":{},\"Page_NewBuy\":{},\"Page_DetailComments2\":{},\"Page_wendajiaquestionlist\":{},\"Page_wendajiaquestiondetail\":{}}", false);
        }

        public static Set<String> d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("e6908fa3", new Object[]{str});
            }
            if (str == null) {
                return Collections.emptySet();
            }
            String[] split = str.split(",");
            HashSet hashSet = new HashSet(split.length);
            hashSet.addAll(Arrays.asList(split));
            return hashSet;
        }

        public static void e(String str) {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
                return;
            }
            try {
                if (!(TextUtils.isEmpty(str) || TextUtils.equals(str, k) || (parseObject = JSON.parseObject(str)) == null)) {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                        jSONArray.addAll((JSONArray) entry.getValue());
                    }
                    int[] iArr = new int[jSONArray.size()];
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        iArr[i2] = jSONArray.getIntValue(i2);
                    }
                    j = iArr;
                    l = parseObject;
                    k = str;
                }
            } catch (Exception e2) {
                q82.f("UtEventListener.changeUtAttentionEventIds", "", null, e2);
            }
        }

        public static boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2a31a82c", new Object[0])).booleanValue();
            }
            return e.m("enableBHXUTPlugin", rja.b(), false);
        }

        public static boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("736590d", new Object[0])).booleanValue();
            }
            return e.m("enableBlackIndustrySignal", true, false);
        }

        public static boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("392008a6", new Object[0])).booleanValue();
            }
            return TextUtils.equals(oy8.c().b(v82.ORANGE_GROUP_NAME, "enableLowDeviceBXEvent", "true"), "true");
        }

        public static boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c1e8b58", new Object[0])).booleanValue();
            }
            return e.m("enableNewGestureCollect", true, false);
        }

        public static int[] j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("8e05946e", new Object[0]);
            }
            try {
                String[] split = e.l("bhxUTPluginEventIds", "[2001,2101,2201]", false).replace("[", "").replace("]", "").replace("\"", "").split(",");
                int[] iArr = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    iArr[i2] = Integer.parseInt(split[i2]);
                }
                return iArr;
            } catch (Throwable unused) {
                return new int[0];
            }
        }

        public static boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca36866e", new Object[0])).booleanValue();
            }
            return e.m("fixLocationXValue", true, false);
        }

        public static int[] l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[0]);
            }
            int[] iArr = j;
            if (iArr == null || iArr.length == 0) {
                return i;
            }
            return iArr;
        }

        public static boolean m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a2d4fb96", new Object[0])).booleanValue();
            }
            return t;
        }

        public static boolean n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16a4c5bd", new Object[0])).booleanValue();
            }
            return f29849a;
        }

        public static boolean o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fb875255", new Object[0])).booleanValue();
            }
            return f;
        }

        public static boolean p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8a220935", new Object[0])).booleanValue();
            }
            return o;
        }

        public static boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9b55ab18", new Object[0])).booleanValue();
            }
            return n;
        }

        public static boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("581296af", new Object[0])).booleanValue();
            }
            return m;
        }

        public static boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5ae9b837", new Object[0])).booleanValue();
            }
            if (!d || v82.c()) {
                return false;
            }
            return true;
        }

        public static Set<String> t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("63daf2f", new Object[0]);
            }
            if (u == null) {
                String b2 = oy8.c().b(v82.ORANGE_GROUP_NAME, "slideGestureScenesV2", "[\"com.taobao.tao.TBMainActivity\",\"com.taobao.tao.welcome.Welcome\",\"com.taobao.search.sf.MainSearchResultActivity\"]");
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(b2)) {
                    try {
                        JSONArray parseArray = JSON.parseArray(b2);
                        for (int i2 = 0; i2 < parseArray.size(); i2++) {
                            hashSet.add(parseArray.getString(i2));
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (hashSet.size() > 0) {
                    u = hashSet;
                }
            }
            return u;
        }

        public static float u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("13ea484c", new Object[0])).floatValue();
            }
            return s;
        }

        public static JSONObject v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("bc0798d7", new Object[0]);
            }
            return e.o("slideGestureConfig", "{\"Page_Home_Recommend\":{\"bxSample\":\"1\",\"utSample\":\"0\"},\"com.taobao.search.sf.MainSearchResultActivity\":{\"bxSample\":\"0\",\"utSample\":\"0\"}}", false);
        }

        public static String w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e4eaa4a4", new Object[0]);
            }
            return b;
        }

        public static int x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("96d75d8d", new Object[0])).intValue();
            }
            return c;
        }

        public static JSONObject y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("cfdf5be3", new Object[0]);
            }
            if (l == null) {
                l = JSON.parseObject(k);
            }
            return l;
        }

        public static boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e32f47", new Object[0])).booleanValue();
            }
            return e;
        }

        static {
            t2o.a(404750485);
            int[] iArr = {2101, 2201, 2202, 19999, 2001, 2601};
            i = iArr;
            j = iArr;
        }
    }
}
