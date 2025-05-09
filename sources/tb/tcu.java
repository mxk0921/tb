package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import tb.qwl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class tcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final UTTracker f28635a = UTAnalytics.getInstance().getDefaultTracker();
    public static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f28636a;
        public final /* synthetic */ akl b;
        public final /* synthetic */ String c;

        public a(float f, akl aklVar, String str) {
            this.f28636a = f;
            this.b = aklVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tcu.a(this.f28636a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f28637a;
        public final /* synthetic */ wh8 b;
        public final /* synthetic */ String c;

        public b(float f, wh8 wh8Var, String str) {
            this.f28637a = f;
            this.b = wh8Var;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tcu.b(this.f28637a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f28638a;
        public final /* synthetic */ g15 b;
        public final /* synthetic */ String c;

        public c(float f, g15 g15Var, String str) {
            this.f28638a = f;
            this.b = g15Var;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tcu.c(this.f28638a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f28639a;
        public final /* synthetic */ o5j b;
        public final /* synthetic */ String c;

        public d(float f, o5j o5jVar, String str) {
            this.f28639a = f;
            this.b = o5jVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tcu.d(this.f28639a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f28640a;
        public final /* synthetic */ qwl b;
        public final /* synthetic */ String c;

        public e(float f, qwl qwlVar, String str) {
            this.f28640a = f;
            this.b = qwlVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tcu.e(this.f28640a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(794820615);
    }

    public static /* synthetic */ void a(float f, akl aklVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909c0cfb", new Object[]{new Float(f), aklVar, str});
        } else {
            j(f, aklVar, str);
        }
    }

    public static /* synthetic */ void b(float f, wh8 wh8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13de224", new Object[]{new Float(f), wh8Var, str});
        } else {
            h(f, wh8Var, str);
        }
    }

    public static /* synthetic */ void c(float f, g15 g15Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871f78c8", new Object[]{new Float(f), g15Var, str});
        } else {
            g(f, g15Var, str);
        }
    }

    public static /* synthetic */ void d(float f, o5j o5jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ced220", new Object[]{new Float(f), o5jVar, str});
        } else {
            i(f, o5jVar, str);
        }
    }

    public static /* synthetic */ void e(float f, qwl qwlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2597c242", new Object[]{new Float(f), qwlVar, str});
        } else {
            k(f, qwlVar, str);
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ce08522", new Object[]{str});
        }
        if (!Localization.o()) {
            return str;
        }
        return str + "_overseas";
    }

    public static void h(float f, wh8 wh8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ff602c", new Object[]{new Float(f), wh8Var, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, wh8Var.d());
            hashMap.put("type", "error");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("message", Uri.encode(wh8Var.n()));
            hashMap.put("fileName", wh8Var.o());
            hashMap.put(pg1.ATOM_stack, Uri.encode(wh8Var.c()));
            hashMap.put("collection_url", wh8Var.b());
            t(wh8Var.a(), hashMap);
        } catch (Exception e2) {
            iav.e("UltronJSTracker#reportError", e2.getMessage());
        }
    }

    public static void i(float f, o5j o5jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433fe1f4", new Object[]{new Float(f), o5jVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, o5jVar.d());
            hashMap.put("type", "mtop_perf");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("api", Uri.encode(o5jVar.k()));
            hashMap.put("traceId", o5jVar.n());
            hashMap.put("message", Uri.encode(o5jVar.c()));
            Map<String, String> l = o5jVar.l();
            if (l != null) {
                try {
                    hashMap.put("params", Uri.encode(JSON.toJSONString(l)));
                } catch (Exception unused) {
                }
            }
            hashMap.put("timing", String.valueOf(o5jVar.m()));
            hashMap.put("success", String.valueOf(o5jVar.o()));
            hashMap.put("collection_url", o5jVar.b());
            t(o5jVar.a(), hashMap);
        } catch (Exception e2) {
            iav.b("UltronJSTracker#reportMtop", e2.getMessage());
        }
    }

    public static void j(float f, akl aklVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362313b0", new Object[]{new Float(f), aklVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, aklVar.d());
            hashMap.put("type", "pv");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("message", "__PV");
            hashMap.put("collection_url", aklVar.b());
            hashMap.put(pg1.ATOM_stack, aklVar.c());
            t(aklVar.a(), hashMap);
        } catch (Exception e2) {
            iav.e("UltronJSTracker#reportPV", e2.getMessage());
        }
    }

    public static float l(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79338cc", new Object[]{new Float(f)})).floatValue();
        }
        if (m7v.a()) {
            return 1.0f;
        }
        return f;
    }

    public static String m(cy1<?> cy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a3630d", new Object[]{cy1Var});
        }
        String f = cy1Var.f();
        if (f != null) {
            return f;
        }
        String str = b.get(cy1Var.a());
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb2c80fa", new Object[]{new Float(f)})).booleanValue();
        }
        if (f <= 0.0f || f > 1.0f || f < new Random().nextFloat()) {
            return true;
        }
        return false;
    }

    public static void t(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159fff68", new Object[]{str, map});
        } else if (u7v.a()) {
            f28635a.send(new UTOriginalCustomHitBuilder(f(str), 19999, "/jstracker.3", "", "", map).build());
        }
    }

    public static void g(float f, g15 g15Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31920fc6", new Object[]{new Float(f), g15Var, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, g15Var.d());
            hashMap.put("type", BizTaskData.MANUAL_TIME);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("code", Uri.encode(g15Var.o()));
            int n = g15Var.n();
            if (n >= 1 && n <= 9) {
                hashMap.put("branch", String.valueOf(n));
            }
            if (g15Var.t()) {
                hashMap.put(iiz.PERF_STAG_TOTAL, "all");
            }
            if (g15Var.r() == null) {
                hashMap.put("message", Uri.encode(g15Var.c()));
            } else {
                hashMap.put("message", Uri.encode(g15Var.r()));
                hashMap.put(pg1.ATOM_stack, Uri.encode(g15Var.c()));
            }
            hashMap.put("success", String.valueOf(g15Var.u()));
            hashMap.put("collection_url", g15Var.b());
            Map<String, String> p = g15Var.p();
            if (p != null) {
                for (String str2 : p.keySet()) {
                    hashMap.put(str2, Uri.encode(p.get(str2)));
                }
            }
            Map<String, String> q = g15Var.q();
            if (q != null) {
                for (String str3 : q.keySet()) {
                    hashMap.put(str3, Uri.encode(q.get(str3)));
                }
            }
            t(g15Var.a(), hashMap);
        } catch (Exception e2) {
            iav.b("UltronJSTracker#reportCustom", e2.getMessage());
        }
    }

    public static void k(float f, qwl qwlVar, String str) {
        Map<String, Long> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e047e376", new Object[]{new Float(f), qwlVar, str});
            return;
        }
        qwl.a n = qwlVar.n();
        if (n != null && (c2 = n.c()) != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, qwlVar.d());
                hashMap.put("collection_url", qwlVar.b());
                hashMap.put("type", tmu.MTP_PERF);
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("uniqId", str);
                }
                HashMap hashMap2 = new HashMap();
                for (String str2 : c2.keySet()) {
                    hashMap2.put(str2, c2.get(str2));
                }
                hashMap2.put("name", Uri.encode(n.b()));
                hashMap.put("message", Uri.encode(JSON.toJSONString(hashMap2)));
                hashMap.put(pg1.ATOM_stack, Uri.encode(qwlVar.c()));
                Map<String, String> m = qwlVar.m();
                if (m != null) {
                    for (String str3 : m.keySet()) {
                        if (str3.matches("d([1-9]|10)")) {
                            hashMap.put(str3, Uri.encode(m.get(str3)));
                        }
                    }
                    if (!m.isEmpty() && wav.a("ultron", "uploadBizPropsToJSTracker", true)) {
                        hashMap.put("bizProps", Uri.encode(JSON.toJSONString(m)));
                    }
                }
                t(qwlVar.a(), hashMap);
                if (m7v.a()) {
                    String a2 = qwlVar.a();
                    iav.g(a2, "性能耗时:" + n.b(), hashMap2);
                }
            } catch (Exception e2) {
                iav.b("UltronJSTracker#reportPerf", e2.getMessage());
            }
        }
    }

    public static void o(g15 g15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7a8df9", new Object[]{g15Var});
        } else if (!wav.a("newUltron_container", "disableReportCustom", false)) {
            String a2 = g15Var.a();
            float d2 = wav.d(a2, "TRACKER_CUSTOM_SAMPLING_" + g15Var.o(), -1.0f);
            if (-1.0f == d2) {
                d2 = l(g15Var.e());
            }
            if (!n(d2)) {
                String m = m(g15Var);
                if (yav.a()) {
                    oav.f(new c(d2, g15Var, m));
                } else {
                    g(d2, g15Var, m);
                }
            }
        }
    }

    public static void p(wh8 wh8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485f524d", new Object[]{wh8Var});
            return;
        }
        String a2 = wh8Var.a();
        iav.c(a2, wh8Var.n(), wh8Var.c());
        if (!wav.a("newUltron_container", "disableReportError", false)) {
            float d2 = wav.d(a2, "TRACKER_ERROR_SAMPLING_" + wh8Var.n(), -1.0f);
            if (-1.0f == d2) {
                d2 = wh8Var.e();
            }
            if (!n(wh8Var.e())) {
                String m = m(wh8Var);
                if (yav.a()) {
                    oav.f(new b(d2, wh8Var, m));
                } else {
                    h(d2, wh8Var, m);
                }
            }
        }
    }

    public static void q(o5j o5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9048419", new Object[]{o5jVar});
        } else if (!wav.a("newUltron_container", "disableReportMtop", false)) {
            String a2 = o5jVar.a();
            float d2 = wav.d(a2, "TRACKER_API_SAMPLING_" + o5jVar.k(), -1.0f);
            if (-1.0f == d2) {
                d2 = l(o5jVar.e());
            }
            if (!n(d2)) {
                String m = m(o5jVar);
                if (yav.a()) {
                    oav.f(new d(d2, o5jVar, m));
                } else {
                    i(d2, o5jVar, m);
                }
            }
        }
    }

    public static void r(akl aklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec27fbd9", new Object[]{aklVar});
        } else if (!wav.a("newUltron_container", "disableReportPV", false)) {
            String a2 = aklVar.a();
            float d2 = wav.d(a2, "TRACKER_PV_SAMPLING_" + aklVar.a(), -1.0f);
            if (-1.0f == d2) {
                d2 = l(aklVar.e());
            }
            if (!n(d2)) {
                oav.f(new a(d2, aklVar, m(aklVar)));
            }
        }
    }

    public static void s(qwl qwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee96e39", new Object[]{qwlVar});
            return;
        }
        qwl.a n = qwlVar.n();
        if (n == null) {
            iav.c(qwlVar.a(), "UltronJSTracker#reportPerfException", "PerfModel.Msg is null");
        } else if (TextUtils.isEmpty(n.b())) {
            iav.b("UltronJSTracker", "reportPerf#name不能为空");
        } else if (n.c() == null || n.c().isEmpty()) {
            iav.b("UltronJSTracker", "reportPerf#必须添加stage");
        } else if (!wav.a("newUltron_container", "disableReportPerf", false)) {
            String a2 = qwlVar.a();
            float d2 = wav.d(a2, "TRACKER_PERF_SAMPLING_" + n.b(), -1.0f);
            if (-1.0f == d2) {
                d2 = l(qwlVar.e());
            }
            if (!n(d2)) {
                String m = m(qwlVar);
                if (yav.a()) {
                    oav.f(new e(d2, qwlVar, m));
                } else {
                    k(d2, qwlVar, m);
                }
            }
        }
    }
}
