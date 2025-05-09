package tb;

import android.text.TextUtils;
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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jth extends mth {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;

    public static mth g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mth) ipChange.ipc$dispatch("8d38ecae", new Object[0]);
        }
        return new jth();
    }

    public static /* synthetic */ Object ipc$super(jth jthVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/minutes/output/impl/MTSCollectorDP2Output");
    }

    @Override // tb.mth
    public void b(cuh cuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b51ea9", new Object[]{this, cuhVar});
        }
    }

    public final ArrayList<cuh> e(quh quhVar) {
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

    public final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ebc04e", new Object[]{this, str, str2});
        }
        return str + "_" + str2 + "_Metric";
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705761a5", new Object[]{this, str, str2});
            return;
        }
        String f = f(str, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("meterId");
        arrayList.add("endStatus");
        arrayList.add("beginFeatures");
        arrayList.add("endFeatures");
        arrayList.add("beginTime");
        arrayList.add("bizTags");
        arrayList.add("name");
        arrayList.add("stages");
        arrayList.add("tasks");
        arrayList.add("events");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("duration");
        arrayList2.add("mtsVer");
        arrayList2.add("stageCount");
        arrayList2.add("stageEndedCount");
        arrayList2.add("taskCount");
        arrayList2.add("taskEndedCount");
        AppMonitor.register("Page_MTS", f, MeasureSet.create(arrayList2), DimensionSet.create(arrayList), true);
    }

    @Override // tb.mth
    public void c(iuh iuhVar) {
        long j;
        long j2;
        long j3;
        String str;
        String str2;
        long j4;
        JSONObject p;
        JSONObject p2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a69a29", new Object[]{this, iuhVar});
        } else if (iuhVar == null || TextUtils.isEmpty(iuhVar.t()) || iuhVar.s() == null || iuhVar.s().v() == null || TextUtils.isEmpty(iuhVar.s().t())) {
            TLog.loge("MTSCollectorDP2Output", "processMeasurement is error ");
        } else if (iuhVar.x() == 3 && iuhVar.z() == 1) {
            this.b = true;
            String a2 = iuhVar.s().v().a();
            String t = iuhVar.s().t();
            h(a2, t);
            List<iuh> r = iuhVar.s().r(2);
            List<iuh> r2 = iuhVar.s().r(3);
            ArrayList<cuh> e = e(iuhVar.s());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            long j5 = 1;
            if (r != null) {
                j = r.size();
                Iterator<iuh> it = r.iterator();
                long j6 = 0;
                while (it.hasNext()) {
                    iuh next = it.next();
                    if (next.x() == 3) {
                        j6 += j5;
                    }
                    JSONObject p3 = next.S().p();
                    if (p3 != null) {
                        jSONObject.put(next.t(), (Object) p3);
                    }
                    it = it;
                    j5 = 1;
                }
                j2 = j6;
            } else {
                j2 = 0;
                j = 0;
            }
            if (r2 != null) {
                str2 = "Page_MTS";
                str = a2;
                j4 = r2.size();
                long j7 = 0;
                for (iuh iuhVar2 : r2) {
                    if (iuhVar2.x() == 3) {
                        j7++;
                    }
                    JSONObject jSONObject4 = (JSONObject) jSONObject2.get(iuhVar2.t());
                    if (jSONObject4 != null) {
                        JSONArray jSONArray = (JSONArray) jSONObject4.get("list");
                        if (!(jSONArray == null || (p2 = iuhVar2.S().p()) == null)) {
                            jSONArray.add(p2);
                            jSONObject4.put("count", (Object) Integer.valueOf(jSONArray.size()));
                        }
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        JSONObject p4 = iuhVar2.S().p();
                        if (p4 != null) {
                            jSONArray2.add(p4);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("count", (Object) "1");
                            jSONObject5.put("list", (Object) jSONArray2);
                            jSONObject2.put(iuhVar2.t(), (Object) jSONObject5);
                        }
                    }
                    j4 = j4;
                }
                j3 = j7;
            } else {
                str = a2;
                str2 = "Page_MTS";
                j4 = 0;
                j3 = 0;
            }
            if (e != null) {
                Iterator<cuh> it2 = e.iterator();
                while (it2.hasNext()) {
                    cuh next2 = it2.next();
                    JSONObject jSONObject6 = (JSONObject) jSONObject3.get(next2.e());
                    if (jSONObject6 != null) {
                        it2 = it2;
                        JSONArray jSONArray3 = (JSONArray) jSONObject6.get("list");
                        if (!(jSONArray3 == null || (p = next2.l().p()) == null)) {
                            jSONArray3.add(p);
                            jSONObject6.put("count", (Object) Integer.valueOf(jSONArray3.size()));
                        }
                    } else {
                        it2 = it2;
                        JSONArray jSONArray4 = new JSONArray();
                        JSONObject p5 = next2.l().p();
                        if (p5 != null) {
                            jSONArray4.add(p5);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("count", (Object) "1");
                            jSONObject7.put("list", (Object) jSONArray4);
                            jSONObject3.put(next2.e(), (Object) jSONObject7);
                        }
                    }
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("meterId", iuhVar.s().x());
            hashMap.put("name", iuhVar.t());
            hashMap.put("endStatus", iuhVar.p() + "");
            fvh d = iuhVar.d();
            if (d != null) {
                hashMap.put("beginFeatures", d.e());
            }
            fvh h = iuhVar.h();
            if (h != null) {
                hashMap.put("endFeatures", h.e());
            }
            hashMap.put("stages", jSONObject.toJSONString());
            hashMap.put("tasks", jSONObject2.toJSONString());
            hashMap.put("events", jSONObject3.toJSONString());
            hashMap.put("beginTime", iuhVar.k() + "");
            hashMap.put("bizTags", iuhVar.w().e());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("duration", Double.valueOf((double) iuhVar.n()));
            hashMap2.put("mtsVer", Double.valueOf(Double.parseDouble("1.4")));
            hashMap2.put("stageCount", Double.valueOf(j));
            hashMap2.put("stageEndedCount", Double.valueOf(j2));
            hashMap2.put("taskCount", Double.valueOf(j4));
            hashMap2.put("taskEndedCount", Double.valueOf(j3));
            AppMonitor.Stat.commit(str2, f(str, t), DimensionValueSet.fromStringMap(hashMap), MeasureValueSet.create(hashMap2));
            if (a()) {
                guh.c(guh.DETAIL_LOG, "MTS-DP2:dimens:" + hashMap + "measures:" + hashMap2);
            }
        } else if (this.b) {
            String e2 = iuhVar.S().e();
            String a3 = iuhVar.s().v().a();
            String t2 = iuhVar.s().t();
            AppMonitor.Counter.commit("Page_MTS", f(a3, t2) + "_timeOutTask", e2, 1.0d);
            if (a()) {
                guh.c(guh.DETAIL_LOG, "MTS-DP2:args:" + e2);
            }
        }
    }
}
