package tb;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.ALog;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationPO;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.falco.m;
import com.taobao.falco.s;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f26289a = new ArrayList();
    public final Map<String, String> b = new HashMap();
    public final Set<String> c = new HashSet();
    public final Set<String> d = new HashSet();
    public final tz8 e;
    public volatile String f;
    public volatile List<c> g;
    public volatile boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pz8 f26290a;

        public a(pz8 pz8Var) {
            this.f26290a = pz8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                pti.b(pti.this, this.f26290a, pti.a(pti.this, this.f26290a));
            } catch (Exception unused) {
            }
        }
    }

    public pti(tz8 tz8Var) {
        this.e = tz8Var;
        n();
        k();
        l();
    }

    public static /* synthetic */ Pair a(pti ptiVar, pz8 pz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f45badb5", new Object[]{ptiVar, pz8Var});
        }
        return ptiVar.h(pz8Var);
    }

    public static /* synthetic */ void b(pti ptiVar, pz8 pz8Var, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286fd210", new Object[]{ptiVar, pz8Var, pair});
        } else {
            ptiVar.g(pz8Var, pair);
        }
    }

    public void c(pz8 pz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abf9a58", new Object[]{this, pz8Var});
        } else {
            crt.k(new a(pz8Var));
        }
    }

    public final void d(String str, pz8 pz8Var, Map<String, String> map, Map<String, Double> map2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56631d9", new Object[]{this, str, pz8Var, map, map2});
            return;
        }
        if (m.MODULE.equals(str)) {
            obj = pz8Var.A0("touchCategory");
        } else {
            obj = s.MODULE.equals(str) ? pz8Var.A0("category") : null;
        }
        if ("launch".equals(obj)) {
            HashMap hashMap = new HashMap(map);
            for (Map.Entry<String, Double> entry : map2.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Falco_UT", 19997, str + "_launch", "arg2", "arg3", hashMap).build());
        }
    }

    public final void f(String str, String str2, Map<String, String> map, Map<String, Double> map2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d712af7", new Object[]{this, str, str2, map, map2});
            return;
        }
        String str3 = str.trim() + str2;
        if (!((ArrayList) this.f26289a).contains(str3)) {
            ((ArrayList) this.f26289a).add(str3);
            if (this.e.i() != null) {
                this.e.i().a(FalcoEnvironmentImpl.MONITOR_MODULE, str3, this.d, this.c);
            }
        }
        e(str3, map, map2);
    }

    public final void g(pz8 pz8Var, Pair<Map<String, String>, Map<String, Double>> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490b2d1d", new Object[]{this, pz8Var, pair});
        } else if (pair != null && pair.first != null && pair.second != null) {
            String Z0 = pz8Var.Z0();
            if (!TextUtils.isEmpty(Z0)) {
                try {
                    if (p(Z0, pz8Var)) {
                        ALog.e("falco.Metrics", "[commitSpanToFullSamplingTable] is important mtop api or user", null, new Object[0]);
                        f(Z0, "_monitor", (Map) pair.first, (Map) pair.second);
                    }
                    if (o(Z0, pz8Var)) {
                        ALog.e("falco.Metrics", "[commitSpanToFullSamplingTable] is high sampling module", null, new Object[0]);
                        f(Z0, "_high_sample", (Map) pair.first, (Map) pair.second);
                    }
                    if (this.h) {
                        d(Z0, pz8Var, (Map) pair.first, (Map) pair.second);
                    }
                } catch (Exception e) {
                    ALog.e("falco.Metrics", "[commitSpanToSamplingTable] error.", null, e, new Object[0]);
                }
            }
        }
    }

    public final Pair<Map<String, String>, Map<String, Double>> h(pz8 pz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("b0b88d76", new Object[]{this, pz8Var});
        }
        String Z0 = pz8Var.Z0();
        if (TextUtils.isEmpty(Z0)) {
            return null;
        }
        String trim = Z0.trim();
        if (!((ArrayList) this.f26289a).contains(trim)) {
            ((ArrayList) this.f26289a).add(trim);
            if (this.e.i() != null) {
                this.e.i().a(FalcoEnvironmentImpl.MONITOR_MODULE, trim, this.d, this.c);
            }
        }
        try {
            Pair<Map<String, String>, Map<String, Double>> j = j(pz8Var);
            e(trim, (Map) j.first, (Map) j.second);
            return j;
        } catch (Exception e) {
            ALog.e("falco.Metrics", "[commitSpanToSamplingTable] error.", null, e, new Object[0]);
            return null;
        }
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64a974c5", new Object[]{this, str});
        }
        String str2 = this.b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public final Pair<Map<String, String>, Map<String, Double>> j(pz8 pz8Var) {
        Object obj;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("af0ecf52", new Object[]{this, pz8Var});
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("traceSize", Double.valueOf(pz8Var.d1()));
        hashMap2.put("logSize", Double.valueOf(pz8Var.Y0()));
        hashMap.put("traceID", pz8Var.a().b());
        hashMap.put("spanID", pz8Var.a().c());
        hashMap.put("operationName", pz8Var.d0());
        hashMap.put("startTime", String.valueOf(pz8Var.z()));
        hashMap.put("finishTime", String.valueOf(pz8Var.s0()));
        hashMap.put(i("_scene"), pz8Var.b1());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ?> entry : pz8Var.j0().entrySet()) {
            String i = i(entry.getKey());
            if (entry.getValue() != null) {
                obj = entry.getValue();
            } else {
                obj = "";
            }
            String valueOf = String.valueOf(obj);
            if (((HashSet) this.c).contains(i)) {
                hashMap.put(i, valueOf);
            } else if (((HashSet) this.d).contains(i)) {
                try {
                    d = Double.valueOf(valueOf).doubleValue();
                } catch (Exception unused) {
                    d = vu3.b.GEO_NOT_SUPPORT;
                }
                hashMap2.put(i, Double.valueOf(d));
            } else {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(zxv.c(i));
                sb.append("=");
                sb.append(zxv.c(valueOf));
            }
        }
        if (sb.length() > 0) {
            hashMap.put("tags", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry2 : pz8Var.a().a()) {
            String key = entry2.getKey();
            String value = entry2.getValue();
            if (!"_scene".equals(key)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(zxv.c(key));
                sb2.append("=");
                sb2.append(zxv.c(value));
            }
        }
        if (sb2.length() > 0) {
            hashMap.put("baggage", sb2.toString());
        }
        return new Pair<>(hashMap, hashMap2);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f933562a", new Object[]{this});
            return;
        }
        this.c.add("traceID");
        this.c.add("spanID");
        this.c.add("operationName");
        this.c.add("startTime");
        this.c.add("finishTime");
        this.c.add("tags");
        this.c.add("baggage");
        this.c.add("traceSize");
        this.c.add("logSize");
        this.c.add(i(pz8.MODULE.getKey()));
        this.c.add(i(pz8.LAYER.getKey()));
        this.c.add(i(pz8.STATUS.getKey()));
        this.c.add(i(pz8.STAGES.getKey()));
        this.c.add(i(pz8.PARENT_STAGE.getKey()));
        this.c.add(i("_scene"));
        this.c.add(oz8.ERROR_CODE.getKey());
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db7d62", new Object[]{this});
            return;
        }
        this.d.add(gz8.REQ_INFLATE_SIZE.getKey());
        this.d.add(gz8.REQ_DEFLATE_SIZE.getKey());
        this.d.add(gz8.RSP_INFLATE_SIZE.getKey());
        this.d.add(gz8.RSP_DEFLATE_SIZE.getKey());
        this.d.add(gz8.DESERIALIZE_TIME.getKey());
        this.d.add(gz8.MTOP_SIGN_TIME.getKey());
        this.d.add(gz8.FIRST_DATA_TIME.getKey());
        this.d.add(gz8.SEND_DATA_TIME.getKey());
        this.d.add(gz8.DISK_CACHE_LOOKUP_TIME.getKey());
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79775b9", new Object[]{this});
            return;
        }
        this.b.put(pz8.MODULE.getKey(), "module");
        this.b.put(pz8.LAYER.getKey(), ExperimentCognationPO.TYPE_LAYER);
        this.b.put(pz8.STATUS.getKey(), "status");
        this.b.put(pz8.STAGES.getKey(), "stages");
        this.b.put(pz8.PARENT_STAGE.getKey(), "pStage");
        this.b.put("_scene", "scene");
    }

    public final boolean o(String str, pz8 pz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83fdfe2", new Object[]{this, str, pz8Var})).booleanValue();
        }
        if (this.g == null) {
            this.g = new ArrayList();
            if (!TextUtils.isEmpty(this.f)) {
                try {
                    JSONArray jSONArray = new JSONArray(this.f);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        ((ArrayList) this.g).add(new c(jSONArray.getJSONObject(i)));
                    }
                } catch (Exception e) {
                    ALog.e("falco.Metrics", "[isHighSampling] error", null, e, new Object[0]);
                }
            }
        }
        try {
            if (((ArrayList) this.g).isEmpty()) {
                return false;
            }
            HashMap hashMap = new HashMap(2);
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                if (((c) it.next()).b(pz8Var, hashMap)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            ALog.e("falco.Metrics", "[isHighSampling] error", null, e2, new Object[0]);
            return false;
        }
    }

    public final boolean p(String str, pz8 pz8Var) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34173a87", new Object[]{this, str, pz8Var})).booleanValue();
        }
        if ("mtop".equals(str)) {
            str2 = (String) pz8Var.A0(gz8.API_NAME.getKey());
        } else {
            str2 = null;
        }
        if (FullTraceAnalysis.getInstance().isImportantMtopApi(str2) || FullTraceAnalysis.getInstance().isImportantUser()) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f26292a = new ArrayList(2);

        public c() {
        }

        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b05ebfa7", new Object[]{this, str, obj});
            } else {
                this.f26292a.add(new b(str, obj));
            }
        }

        public boolean b(pz8 pz8Var, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d6632ee4", new Object[]{this, pz8Var, map})).booleanValue();
            }
            if (((ArrayList) this.f26292a).isEmpty()) {
                return false;
            }
            Iterator it = ((ArrayList) this.f26292a).iterator();
            while (it.hasNext()) {
                if (!((b) it.next()).a(pz8Var, map)) {
                    return false;
                }
            }
            return true;
        }

        public c(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() != 0) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f26292a.add(new b(next, jSONObject.get(next)));
                    }
                } catch (Exception e) {
                    ALog.e("falco.Metrics", "[HighSamplingRule] error", null, e, new Object[0]);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f26291a;
        public final Object b;
        public final boolean c;
        public boolean d;
        public String e;
        public String f;

        public b(String str, Object obj) {
            boolean z;
            this.f26291a = str;
            this.b = obj;
            if (TextUtils.isEmpty(str) || !str.endsWith(MonitorItemConstants.KEY_URL)) {
                z = false;
            } else {
                z = true;
            }
            this.c = z;
        }

        public boolean a(pz8 pz8Var, Map<String, Object> map) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d6632ee4", new Object[]{this, pz8Var, map})).booleanValue();
            }
            try {
                if (map.containsKey(this.f26291a)) {
                    obj = map.get(this.f26291a);
                } else {
                    obj = pz8Var.A0(this.f26291a);
                    map.put(this.f26291a, obj);
                }
                if (this.c) {
                    return b(obj);
                }
                if (obj == null || !obj.equals(this.b)) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                ALog.e("falco.Metrics", "[matched] error", null, e, new Object[0]);
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #0 {Exception -> 0x0092, blocks: (B:28:0x0075, B:30:0x0083, B:37:0x0095, B:39:0x009d), top: B:48:0x0075 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 0
                r1 = 2
                r2 = 1
                com.android.alibaba.ip.runtime.IpChange r3 = tb.pti.b.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001c
                java.lang.String r4 = "f262124c"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r9
                r1[r2] = r10
                java.lang.Object r10 = r3.ipc$dispatch(r4, r1)
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                return r10
            L_0x001c:
                boolean r3 = r9.d
                if (r3 != 0) goto L_0x0060
                r9.d = r2
                java.lang.Object r3 = r9.b
                boolean r4 = r3 instanceof java.lang.String
                if (r4 == 0) goto L_0x0060
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = ","
                java.lang.String[] r3 = r3.split(r4)
                int r4 = r3.length
                r5 = 0
            L_0x0032:
                if (r5 >= r4) goto L_0x0060
                r6 = r3[r5]
                java.lang.String r7 = "="
                java.lang.String[] r6 = r6.split(r7)
                int r7 = r6.length
                if (r7 != r1) goto L_0x005e
                java.lang.String r7 = "host"
                r8 = r6[r0]
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L_0x004f
                r6 = r6[r2]
                r9.e = r6
                goto L_0x005e
            L_0x004f:
                java.lang.String r7 = "path"
                r8 = r6[r0]
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L_0x005e
                r6 = r6[r2]
                r9.f = r6
            L_0x005e:
                int r5 = r5 + r2
                goto L_0x0032
            L_0x0060:
                java.lang.String r1 = r9.e
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x0070
                java.lang.String r1 = r9.f
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0074
            L_0x0070:
                boolean r1 = r10 instanceof java.lang.String
                if (r1 != 0) goto L_0x0075
            L_0x0074:
                return r0
            L_0x0075:
                java.lang.String r10 = (java.lang.String) r10     // Catch: Exception -> 0x0092
                android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: Exception -> 0x0092
                java.lang.String r1 = r9.e     // Catch: Exception -> 0x0092
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: Exception -> 0x0092
                if (r1 != 0) goto L_0x0094
                java.lang.String r1 = r9.e     // Catch: Exception -> 0x0092
                java.lang.String r3 = r10.getHost()     // Catch: Exception -> 0x0092
                boolean r1 = r1.equals(r3)     // Catch: Exception -> 0x0092
                if (r1 == 0) goto L_0x0090
                goto L_0x0094
            L_0x0090:
                r1 = 0
                goto L_0x0095
            L_0x0092:
                r10 = move-exception
                goto L_0x00b3
            L_0x0094:
                r1 = 1
            L_0x0095:
                java.lang.String r3 = r9.f     // Catch: Exception -> 0x0092
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: Exception -> 0x0092
                if (r3 != 0) goto L_0x00ac
                java.lang.String r3 = r9.f     // Catch: Exception -> 0x0092
                java.lang.String r10 = r10.getPath()     // Catch: Exception -> 0x0092
                boolean r10 = r3.equals(r10)     // Catch: Exception -> 0x0092
                if (r10 == 0) goto L_0x00aa
                goto L_0x00ac
            L_0x00aa:
                r10 = 0
                goto L_0x00ad
            L_0x00ac:
                r10 = 1
            L_0x00ad:
                if (r1 == 0) goto L_0x00b2
                if (r10 == 0) goto L_0x00b2
                r0 = 1
            L_0x00b2:
                return r0
            L_0x00b3:
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r0]
                java.lang.String r3 = "falco.Metrics"
                java.lang.String r4 = "[matchedUrlPattern] error"
                anet.channel.util.ALog.e(r3, r4, r1, r10, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.pti.b.b(java.lang.Object):boolean");
        }
    }

    public void m(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a840a7", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.h = z;
        if (z) {
            ALog.e("falco.Metrics", "[init] report launch span to ut enabled", null, new Object[0]);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f = str;
        } else if (SceneIdentifier.isGrayVersion()) {
            ArrayList arrayList = new ArrayList(2);
            c cVar = new c();
            cVar.a("_module", m.MODULE);
            cVar.a("techStack", "canvas");
            arrayList.add(cVar);
            c cVar2 = new c();
            cVar2.a("_module", "themis_load");
            cVar2.a("techStack", "canvas");
            arrayList.add(cVar2);
            this.g = arrayList;
        }
    }

    public final void e(String str, Map<String, String> map, Map<String, Double> map2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2251bd", new Object[]{this, str, map, map2});
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("falco.Metrics", "[commitMetrics]", null, "point", str, "dimension", map, "measure", map2);
        }
        if (this.e.i() != null) {
            this.e.i().onCommit(FalcoEnvironmentImpl.MONITOR_MODULE, str, map2, map);
        }
    }
}
