package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kth extends mth {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, String> b = new HashMap();
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ iuh f22909a;
        public final /* synthetic */ Map b;

        public a(iuh iuhVar, Map map) {
            this.f22909a = iuhVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kth.e(kth.this, this.f22909a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cuh f22910a;
        public final /* synthetic */ quh b;

        public b(cuh cuhVar, quh quhVar) {
            this.f22910a = cuhVar;
            this.b = quhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kth.f(kth.this, this.f22910a, this.b);
            }
        }
    }

    public static /* synthetic */ void e(kth kthVar, iuh iuhVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9582910", new Object[]{kthVar, iuhVar, map});
        } else {
            kthVar.p(iuhVar, map);
        }
    }

    public static /* synthetic */ void f(kth kthVar, cuh cuhVar, quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93bd4b9", new Object[]{kthVar, cuhVar, quhVar});
        } else {
            kthVar.m(cuhVar, quhVar);
        }
    }

    public static mth i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mth) ipChange.ipc$dispatch("8d38ecae", new Object[0]);
        }
        return new kth();
    }

    public static /* synthetic */ Object ipc$super(kth kthVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/minutes/output/impl/MTSCollectorDP2OutputV2");
    }

    @Override // tb.mth
    public void b(cuh cuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b51ea9", new Object[]{this, cuhVar});
        }
    }

    public final ArrayList<cuh> g(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fa6296f1", new Object[]{this, quhVar});
        }
        ArrayList<cuh> arrayList = null;
        if (quhVar == null) {
            return null;
        }
        List<cuh> p = quhVar.p();
        List<cuh> q = quhVar.q();
        if (p != null && !p.isEmpty()) {
            arrayList = new ArrayList<>(p);
        }
        if (q != null && !q.isEmpty()) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.addAll(q);
        }
        return arrayList;
    }

    public final String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ebc04e", new Object[]{this, str, str2});
        }
        return str + "_" + str2 + "_MetricDetail";
    }

    public final String j(cuh cuhVar, quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e8c0842", new Object[]{this, cuhVar, quhVar});
        }
        if (quhVar == null) {
            return "";
        }
        String a2 = quhVar.v().a();
        String t = quhVar.t();
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(t)) {
            return "";
        }
        return h(a2, t);
    }

    public final String k(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c68354f3", new Object[]{this, iuhVar});
        }
        String a2 = iuhVar.s().v().a();
        String t = iuhVar.s().t();
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(t)) {
            return "";
        }
        return h(a2, t);
    }

    public final void m(cuh cuhVar, quh quhVar) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61aeba1d", new Object[]{this, cuhVar, quhVar});
            return;
        }
        String j = j(cuhVar, quhVar);
        if (TextUtils.isEmpty(j)) {
            guh.c(guh.TAG, "reportEvent monitorPoint error ");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Double.valueOf("0"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("mts_ver", "1.4");
        hashMap2.put("m_id", cuhVar.c());
        hashMap2.put("meter_id", quhVar.x());
        if (quhVar.u() != null) {
            hashMap2.put("m_biz_tags", quhVar.u().e());
        }
        hashMap2.put("m_name", cuhVar.e());
        hashMap2.put("m_type", "event");
        if (quhVar.s() != null) {
            hashMap2.put("m_timeoffset", (cuhVar.f() - quhVar.s().k()) + "");
        }
        hashMap2.put("m_timestamp", cuhVar.f() + "");
        iuh s = quhVar.s();
        if (!(s == null || (m = s.m()) == null)) {
            cuhVar.b().m("__metric__", m);
        }
        if (cuhVar.a() != null) {
            hashMap2.put("m_attrs", cuhVar.b().e());
        }
        AppMonitor.Stat.commit("Page_MTS", j, DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.create(hashMap));
        if (a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitorPoint", (Object) j);
            jSONObject.putAll(hashMap2);
            jSONObject.putAll(hashMap);
            guh.c("MTS-DP2", "event:" + jSONObject.toJSONString());
        }
    }

    public final void n(cuh cuhVar, quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdd4ba", new Object[]{this, cuhVar, quhVar});
        } else {
            wuh.a().a(new b(cuhVar, quhVar));
        }
    }

    public final void o(List<cuh> list, quh quhVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4b5786", new Object[]{this, list, quhVar});
        } else if (list != null && list.size() != 0) {
            for (cuh cuhVar : list) {
                if (i > 10) {
                    guh.c("MTS-DP2", "event size > 10");
                    return;
                } else {
                    i++;
                    n(cuhVar, quhVar);
                }
            }
        }
    }

    public final void q(iuh iuhVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf445df4", new Object[]{this, iuhVar, map});
        } else {
            wuh.a().a(new a(iuhVar, map));
        }
    }

    public final void r(List<iuh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c12c81", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            for (iuh iuhVar : list) {
                q(iuhVar, null);
            }
        }
    }

    public final void s(List<iuh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8255d932", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            for (iuh iuhVar : list) {
                q(iuhVar, null);
            }
        }
    }

    public final void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705761a5", new Object[]{this, str, str2});
            return;
        }
        String h = h(str, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("mts_ver");
        arrayList.add("meter_id");
        arrayList.add("m_id");
        arrayList.add("m_type");
        arrayList.add("m_name");
        arrayList.add("m_timestamp");
        arrayList.add("m_timeoffset");
        arrayList.add("m_ended");
        arrayList.add("m_status");
        arrayList.add("m_biz_tags");
        arrayList.add("m_attrs");
        arrayList.add("m_interval_ext");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("duration");
        AppMonitor.register("Page_MTS", h, MeasureSet.create(arrayList2), DimensionSet.create(arrayList), true);
    }

    public final void p(iuh iuhVar, Map<String, String> map) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45dc917", new Object[]{this, iuhVar, map});
            return;
        }
        String k = k(iuhVar);
        if (TextUtils.isEmpty(k)) {
            guh.c(guh.TAG, "reportMeasurement monitorPoint error ");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Double.valueOf(iuhVar.n()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("mts_ver", "1.4");
        hashMap2.put("m_id", iuhVar.r());
        hashMap2.put("meter_id", iuhVar.s().x());
        hashMap2.put("m_type", kuh.a(iuhVar.z()));
        hashMap2.put("m_name", iuhVar.t());
        hashMap2.put("m_timestamp", iuhVar.k() + "");
        if (iuhVar.A() == Long.MIN_VALUE) {
            guh.a(guh.TAG, "dimens : offset invalid。name:" + iuhVar.t() + " begin:" + iuhVar.k());
        } else {
            hashMap2.put("m_timeoffset", iuhVar.A() + "");
        }
        if (iuhVar.x() == 3) {
            hashMap2.put("m_ended", "true");
        } else {
            hashMap2.put("m_ended", "false");
        }
        hashMap2.put("m_status", JSON.toJSONString(iuhVar.y()));
        hashMap2.put("m_biz_tags", iuhVar.w().e());
        iuh s = iuhVar.s() != null ? iuhVar.s().s() : null;
        if (!(s == null || (m = s.m()) == null)) {
            iuhVar.i().m("__metric__", m);
        }
        if (iuhVar.e() != null) {
            hashMap2.put("m_attrs", iuhVar.i().e());
        }
        JSONObject p = iuhVar.q().p();
        if (map != null) {
            p.putAll(map);
        }
        hashMap2.put("m_interval_ext", p.toString());
        AppMonitor.Stat.commit("Page_MTS", k, DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.create(hashMap));
        if (a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitorPoint", (Object) k);
            jSONObject.putAll(hashMap2);
            jSONObject.putAll(hashMap);
            guh.c("MTS-DP2", jSONObject.toJSONString());
        }
    }

    @Override // tb.mth
    public void c(iuh iuhVar) {
        long j;
        long j2;
        List<iuh> list;
        String str;
        List<iuh> list2;
        long j3;
        long j4;
        long j5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a69a29", new Object[]{this, iuhVar});
        } else if (iuhVar == null || TextUtils.isEmpty(iuhVar.t()) || iuhVar.s() == null || iuhVar.s().v() == null || TextUtils.isEmpty(iuhVar.s().t())) {
            TLog.loge("MTSCollectorDP2Output", "processMeasurement is error ");
        } else if (iuhVar.x() == 3 && iuhVar.z() == 1) {
            this.c = true;
            String a2 = iuhVar.s().v().a();
            String t = iuhVar.s().t();
            if (!((HashMap) this.b).containsKey(a2 + t)) {
                l(a2, t);
                ((HashMap) this.b).put(a2 + t, "1");
            }
            List<iuh> r = iuhVar.s().r(2);
            List<iuh> r2 = iuhVar.s().r(3);
            ArrayList<cuh> g = g(iuhVar.s());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            if (r != null) {
                j = r.size();
                long j6 = 0;
                for (iuh iuhVar2 : r) {
                    if (iuhVar2.x() == 3) {
                        j6++;
                    }
                    JSONObject p = iuhVar2.S().p();
                    if (p != null) {
                        jSONObject.put(iuhVar2.t(), (Object) p);
                    }
                }
                j2 = j6;
            } else {
                j2 = 0;
                j = 0;
            }
            if (r2 != null) {
                String str2 = "count";
                j3 = r2.size();
                Iterator<iuh> it = r2.iterator();
                long j7 = 0;
                while (it.hasNext()) {
                    iuh next = it.next();
                    if (next.x() == 3) {
                        j7++;
                    }
                    JSONObject jSONObject4 = (JSONObject) jSONObject2.get(next.t());
                    if (jSONObject4 != null) {
                        JSONArray jSONArray = (JSONArray) jSONObject4.get("list");
                        if (jSONArray != null) {
                            it = it;
                            JSONObject p2 = next.S().p();
                            if (p2 != null) {
                                jSONArray.add(p2);
                                str2 = str2;
                                jSONObject4.put(str2, (Object) Integer.valueOf(jSONArray.size()));
                            }
                        } else {
                            it = it;
                        }
                        str2 = str2;
                    } else {
                        it = it;
                        str2 = str2;
                        JSONArray jSONArray2 = new JSONArray();
                        JSONObject p3 = next.S().p();
                        if (p3 != null) {
                            jSONArray2.add(p3);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(str2, (Object) "1");
                            jSONObject5.put("list", (Object) jSONArray2);
                            jSONObject2.put(next.t(), (Object) jSONObject5);
                        }
                    }
                    j3 = j3;
                }
                str = str2;
                list2 = r;
                list = r2;
                j4 = j7;
            } else {
                str = "count";
                list2 = r;
                list = r2;
                j4 = 0;
                j3 = 0;
            }
            if (g != null) {
                j5 = g.size();
                Iterator<cuh> it2 = g.iterator();
                while (it2.hasNext()) {
                    cuh next2 = it2.next();
                    JSONObject jSONObject6 = (JSONObject) jSONObject3.get(next2.e());
                    if (jSONObject6 != null) {
                        JSONArray jSONArray3 = (JSONArray) jSONObject6.get("list");
                        if (jSONArray3 != null) {
                            it2 = it2;
                            JSONObject p4 = next2.l().p();
                            if (p4 != null) {
                                jSONArray3.add(p4);
                                jSONObject6.put(str, (Object) Integer.valueOf(jSONArray3.size()));
                            }
                        } else {
                            it2 = it2;
                        }
                    } else {
                        it2 = it2;
                        JSONArray jSONArray4 = new JSONArray();
                        JSONObject p5 = next2.l().p();
                        if (p5 != null) {
                            jSONArray4.add(p5);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put(str, (Object) "1");
                            jSONObject7.put("list", (Object) jSONArray4);
                            jSONObject3.put(next2.e(), (Object) jSONObject7);
                        }
                    }
                    j5 = j5;
                }
            } else {
                j5 = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("stageCount", j + "");
            hashMap.put("taskCount", j3 + "");
            hashMap.put("eventCount", j5 + "");
            hashMap.put("stageEndedCount", j2 + "");
            hashMap.put("taskEndedCount", j4 + "");
            q(iuhVar, hashMap);
            r(list2);
            s(list);
            o(g, iuhVar.s());
        } else if (this.c) {
            String e = iuhVar.q().e();
            String a3 = iuhVar.s().v().a();
            String t2 = iuhVar.s().t();
            AppMonitor.Counter.commit("Page_MTS", h(a3, t2) + "_timeOutTask", e, 1.0d);
            if (a()) {
                guh.c(guh.DETAIL_LOG, "MTS-DP2:args:" + e);
            }
        }
    }
}
