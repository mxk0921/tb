package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wwi INSTANCE = new wwi();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30973a;

    static {
        t2o.a(481297060);
    }

    public final void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9e009e", new Object[]{this, str, map});
            return;
        }
        map.put("device_level", String.valueOf(ri7.b()));
        if (str == null) {
            str = "unknown";
        }
        map.put("task_name", str);
    }

    public final void b(Map<String, Double> map, String str, long j, Long l, Long l2) {
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72114be9", new Object[]{this, map, str, new Long(j), l, l2});
            return;
        }
        if (l == null) {
            j2 = 0;
        } else {
            j2 = l.longValue();
        }
        if (j > j2) {
            if (l2 == null) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = l2.longValue();
            }
            if (j < j3) {
                map.put(str, Double.valueOf(j));
            }
        }
    }

    public final void d(String str, Long l, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7943d9", new Object[]{this, str, l, l2});
            return;
        }
        c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(str, linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b(linkedHashMap2, "model_cost_time", l2 == null ? 0L : l2.longValue(), 0L, 10000L);
        b(linkedHashMap2, "client_cost_time", l == null ? 0L : l.longValue(), 0L, 10000L);
        jzu.d("PLT", "MnnModelPerf", linkedHashMap2, linkedHashMap);
        if (caa.q()) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("dimension", linkedHashMap);
            linkedHashMap3.put("measure", linkedHashMap2);
            TLogTracker.f("MnnModelPerfTrace", "Default", JSON.toJSONString(linkedHashMap3));
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77ceb6f", new Object[]{this});
        } else if (!f30973a) {
            f30973a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("model_cost_time");
            arrayList.add("client_cost_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("device_level");
            arrayList2.add("task_name");
            jzu.m("PLT", "MnnModelPerf", arrayList, arrayList2);
        }
    }
}
