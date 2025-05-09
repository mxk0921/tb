package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import tb.pwl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class f9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final UTTracker f19128a = UTAnalytics.getInstance().getDefaultTracker();
    public static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f19129a;
        public final /* synthetic */ bkl b;
        public final /* synthetic */ String c;

        public a(float f, bkl bklVar, String str) {
            this.f19129a = f;
            this.b = bklVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f9v.a(this.f19129a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f19130a;
        public final /* synthetic */ xh8 b;
        public final /* synthetic */ String c;

        public b(float f, xh8 xh8Var, String str) {
            this.f19130a = f;
            this.b = xh8Var;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f9v.b(this.f19130a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f19131a;
        public final /* synthetic */ h15 b;
        public final /* synthetic */ String c;

        public c(float f, h15 h15Var, String str) {
            this.f19131a = f;
            this.b = h15Var;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f9v.c(this.f19131a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f19132a;
        public final /* synthetic */ p5j b;
        public final /* synthetic */ String c;

        public d(float f, p5j p5jVar, String str) {
            this.f19132a = f;
            this.b = p5jVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f9v.d(this.f19132a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f19133a;
        public final /* synthetic */ pwl b;
        public final /* synthetic */ String c;

        public e(float f, pwl pwlVar, String str) {
            this.f19133a = f;
            this.b = pwlVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f9v.e(this.f19133a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(83886292);
    }

    public static /* synthetic */ void a(float f, bkl bklVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581ca284", new Object[]{new Float(f), bklVar, str});
        } else {
            j(f, bklVar, str);
        }
    }

    public static /* synthetic */ void b(float f, xh8 xh8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c55fbb", new Object[]{new Float(f), xh8Var, str});
        } else {
            h(f, xh8Var, str);
        }
    }

    public static /* synthetic */ void c(float f, h15 h15Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17373a51", new Object[]{new Float(f), h15Var, str});
        } else {
            g(f, h15Var, str);
        }
    }

    public static /* synthetic */ void d(float f, p5j p5jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c970fe29", new Object[]{new Float(f), p5jVar, str});
        } else {
            i(f, p5jVar, str);
        }
    }

    public static /* synthetic */ void e(float f, pwl pwlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5df8a8b", new Object[]{new Float(f), pwlVar, str});
        } else {
            k(f, pwlVar, str);
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

    public static void h(float f, xh8 xh8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25ebfc3", new Object[]{new Float(f), xh8Var, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, xh8Var.getPid());
            hashMap.put("type", "error");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            String d2 = xh8Var.d();
            if (TextUtils.isEmpty(d2)) {
                hashMap.put("message", Uri.encode(xh8Var.getMessage()));
            } else {
                hashMap.put("message", Uri.encode(d2));
                hashMap.put(pg1.ATOM_stack, Uri.encode(xh8Var.getMessage()));
            }
            hashMap.put("fileName", xh8Var.e());
            hashMap.put("collection_url", xh8Var.getCollectionUrl());
            String from = xh8Var.getFrom();
            if (from != null) {
                hashMap.put("from", Uri.encode(from));
            }
            u(xh8Var.getBizCode(), hashMap);
            hav.a("UltronJSTracker#reportError", "params=" + hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void i(float f, p5j p5jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84cbf2fd", new Object[]{new Float(f), p5jVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, p5jVar.getPid());
            hashMap.put("type", "mtop_perf");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("api", Uri.encode(p5jVar.c()));
            hashMap.put("traceId", p5jVar.g());
            hashMap.put("message", Uri.encode(p5jVar.getMessage()));
            hashMap.put("silence", String.valueOf(p5jVar.h()));
            String d2 = p5jVar.d();
            if (d2 != null) {
                hashMap.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, Uri.encode(d2));
            }
            Map<String, String> e2 = p5jVar.e();
            if (e2 != null) {
                try {
                    hashMap.put("params", Uri.encode(JSON.toJSONString(e2)));
                } catch (Exception unused) {
                }
            }
            hashMap.put("timing", String.valueOf(p5jVar.f()));
            hashMap.put("success", String.valueOf(p5jVar.isSuccess()));
            hashMap.put("collection_url", p5jVar.getCollectionUrl());
            String from = p5jVar.getFrom();
            if (from != null) {
                hashMap.put("from", Uri.encode(from));
            }
            u(p5jVar.getBizCode(), hashMap);
        } catch (Throwable unused2) {
        }
    }

    public static void j(float f, bkl bklVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15afd279", new Object[]{new Float(f), bklVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, bklVar.getPid());
            hashMap.put("type", "pv");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("message", "__PV");
            hashMap.put("collection_url", bklVar.getCollectionUrl());
            hashMap.put(pg1.ATOM_stack, bklVar.getMessage());
            String from = bklVar.getFrom();
            if (from != null) {
                hashMap.put("from", Uri.encode(from));
            }
            u(bklVar.getBizCode(), hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86ec6e4", new Object[]{str});
        }
    }

    public static float m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79338cc", new Object[]{new Float(f)})).floatValue();
        }
        if (n7v.a()) {
            return 1.0f;
        }
        return f;
    }

    public static String n(dy1<?> dy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1925bce4", new Object[]{dy1Var});
        }
        String uuid = dy1Var.getUuid();
        if (uuid != null) {
            return uuid;
        }
        String str = b.get(dy1Var.getBizCode());
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb2c80fa", new Object[]{new Float(f)})).booleanValue();
        }
        if (n7v.a()) {
            return false;
        }
        if (f <= 0.0f || f > 1.0f || f < new Random().nextFloat()) {
            return true;
        }
        return false;
    }

    public static void u(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159fff68", new Object[]{str, map});
        } else if (v7v.a()) {
            f19128a.send(new UTOriginalCustomHitBuilder(f(str), 19999, "/jstracker.3", "", "", map).build());
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{str});
        } else if (v7v.a()) {
            b.put(str, UUID.randomUUID().toString());
        }
    }

    public static void g(float f, h15 h15Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82bf78cf", new Object[]{new Float(f), h15Var, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, h15Var.getPid());
            hashMap.put("type", BizTaskData.MANUAL_TIME);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("code", Uri.encode(h15Var.getCode()));
            int branch = h15Var.getBranch();
            if (branch >= 1 && branch <= 9) {
                hashMap.put("branch", String.valueOf(branch));
            }
            if (h15Var.isBranchEntry()) {
                hashMap.put(iiz.PERF_STAG_TOTAL, "all");
            }
            if (h15Var.getTag() == null) {
                hashMap.put("message", Uri.encode(h15Var.getMessage()));
            } else {
                hashMap.put("message", Uri.encode(h15Var.getTag()));
                hashMap.put(pg1.ATOM_stack, Uri.encode(h15Var.getMessage()));
            }
            hashMap.put("success", String.valueOf(h15Var.isSuccess()));
            hashMap.put("collection_url", h15Var.getCollectionUrl());
            String from = h15Var.getFrom();
            if (from != null) {
                hashMap.put("from", Uri.encode(from));
            }
            Map<String, String> dimensions = h15Var.getDimensions();
            if (dimensions != null) {
                for (String str2 : dimensions.keySet()) {
                    hashMap.put(str2, Uri.encode(dimensions.get(str2)));
                }
            }
            Map<String, String> indicators = h15Var.getIndicators();
            if (indicators != null) {
                for (String str3 : indicators.keySet()) {
                    hashMap.put(str3, Uri.encode(indicators.get(str3)));
                }
            }
            u(h15Var.getBizCode(), hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void k(float f, pwl pwlVar, String str) {
        Map<String, Long> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ce68bf", new Object[]{new Float(f), pwlVar, str});
            return;
        }
        pwl.a d2 = pwlVar.d();
        if (d2 != null && (c2 = d2.c()) != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, pwlVar.getPid());
                hashMap.put("collection_url", pwlVar.getCollectionUrl());
                hashMap.put("type", tmu.MTP_PERF);
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("uniqId", str);
                }
                HashMap hashMap2 = new HashMap();
                for (String str2 : c2.keySet()) {
                    hashMap2.put(str2, c2.get(str2));
                }
                hashMap2.put("name", Uri.encode(d2.b()));
                hashMap.put("message", Uri.encode(JSON.toJSONString(hashMap2)));
                hashMap.put(pg1.ATOM_stack, Uri.encode(pwlVar.getMessage()));
                String from = pwlVar.getFrom();
                if (from != null) {
                    hashMap.put("from", Uri.encode(from));
                }
                Map<String, String> dimensions = pwlVar.getDimensions();
                if (dimensions != null) {
                    if (!vav.a(pwlVar.getBizCode(), "uploadBizPropsToJSTracker", false)) {
                        for (String str3 : dimensions.keySet()) {
                            if (str3.startsWith("d")) {
                                hashMap.put(str3, Uri.encode(dimensions.get(str3)));
                            }
                        }
                    } else if (!dimensions.isEmpty()) {
                        hashMap.put("bizProps", Uri.encode(JSON.toJSONString(dimensions)));
                    }
                }
                String bizCode = pwlVar.getBizCode();
                u(bizCode, hashMap);
                if (n7v.a()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("dimension", dimensions);
                    hashMap3.put("stages", hashMap2);
                    hav.f(bizCode, "性能耗时:", hashMap3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void p(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (!vav.a("newUltron_container", "disableReportCustom", false)) {
            String bizCode = h15Var.getBizCode();
            float d2 = vav.d(bizCode, "TRACKER_CUSTOM_SAMPLING_" + h15Var.getCode(), -1.0f);
            if (-1.0f == d2) {
                d2 = m(h15Var.getSampling());
            }
            if (!o(d2)) {
                String n = n(h15Var);
                if (zav.a()) {
                    pav.k(new c(d2, h15Var, n));
                } else {
                    g(d2, h15Var, n);
                }
            }
        }
    }

    public static void q(xh8 xh8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bc1864", new Object[]{xh8Var});
            return;
        }
        String bizCode = xh8Var.getBizCode();
        hav.b(bizCode, xh8Var.d(), xh8Var.getMessage());
        if (!vav.a("newUltron_container", "disableReportError", false)) {
            float d2 = vav.d(bizCode, "TRACKER_ERROR_SAMPLING_" + xh8Var.d(), -1.0f);
            if (-1.0f == d2) {
                d2 = xh8Var.getSampling();
            }
            if (!o(xh8Var.getSampling())) {
                String n = n(xh8Var);
                if (zav.a()) {
                    pav.k(new b(d2, xh8Var, n));
                } else {
                    h(d2, xh8Var, n);
                }
            }
        }
    }

    public static void r(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (!vav.a("newUltron_container", "disableReportMtop", false)) {
            String bizCode = p5jVar.getBizCode();
            float d2 = vav.d(bizCode, "TRACKER_API_SAMPLING_" + p5jVar.c(), -1.0f);
            if (-1.0f == d2) {
                d2 = m(p5jVar.getSampling());
            }
            if (!o(d2)) {
                String n = n(p5jVar);
                if (zav.a()) {
                    pav.k(new d(d2, p5jVar, n));
                } else {
                    i(d2, p5jVar, n);
                }
            }
        }
    }

    public static void s(bkl bklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3998ba2", new Object[]{bklVar});
        } else if (!vav.a("newUltron_container", "disableReportPV", false)) {
            String bizCode = bklVar.getBizCode();
            float d2 = vav.d(bizCode, "TRACKER_PV_SAMPLING_" + bklVar.getBizCode(), -1.0f);
            if (-1.0f == d2) {
                d2 = m(bklVar.getSampling());
            }
            if (!o(d2)) {
                pav.k(new a(d2, bklVar, n(bklVar)));
            }
        }
    }

    public static void t(pwl pwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e69e302", new Object[]{pwlVar});
            return;
        }
        pwl.a d2 = pwlVar.d();
        if (d2 == null) {
            hav.b(pwlVar.getBizCode(), "UltronJSTracker#reportPerfException", "PerfModel.Msg is null");
        } else if (TextUtils.isEmpty(d2.b())) {
            hav.a("UltronJSTracker", "reportPerf#name不能为空");
        } else if (d2.c() == null || d2.c().isEmpty()) {
            hav.a("UltronJSTracker", "reportPerf#必须添加stage");
        } else if (!vav.a("newUltron_container", "disableReportPerf", false)) {
            String bizCode = pwlVar.getBizCode();
            float d3 = vav.d(bizCode, "TRACKER_PERF_CUSTOM_SAMPLING_" + d2.b(), -1.0f);
            if (-1.0f == d3) {
                d3 = m(pwlVar.getSampling());
            }
            if (!o(d3)) {
                String n = n(pwlVar);
                if (zav.a()) {
                    pav.k(new e(d3, pwlVar, n));
                } else {
                    k(d3, pwlVar, n);
                }
            }
        }
    }
}
