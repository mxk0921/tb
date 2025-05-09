package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n7l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_LESS_THEN = "allLessThan3";
    public static final String ONE_LESS_THEN = "oneLessThan3";
    public static final String T_SCHEDULE = "tschedule";
    public static final String T_SCHEDULE_AND_INSTANT = "tscheduleAndInstantOpen";

    static {
        t2o.a(729809714);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22715b4c", new Object[0]);
        }
        JSONObject d = d();
        if (d != null && !d.isEmpty()) {
            return d.getString("experimentType");
        }
        uqa.b("recmdPrefetch", "OptimizationConfig", "recmdConfig == null || recmdConfig.isEmpty()");
        return null;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b347fc", new Object[0])).intValue();
        }
        return f4b.i("orderListPreloadExpireTime", 15000);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5acb0aec", new Object[0]);
        }
        JSONObject d = d();
        if (d != null && !d.isEmpty()) {
            return d.getString("optimizeType");
        }
        uqa.b("recmdPrefetch", "OptimizationConfig", "recmdConfig == null || recmdConfig.isEmpty()");
        return null;
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d416c92c", new Object[0]);
        }
        JSONObject a2 = xsl.a(z4a.REC_ORDER_LIST_CATAPULT.f32522a);
        if (a2 == null) {
            return null;
        }
        return a2.getJSONObject(vls.OPTIMIZATION_CONFIG);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fce16b37", new Object[0])).intValue();
        }
        JSONObject d = d();
        if (d != null && !d.isEmpty()) {
            return d.getIntValue("orderNumThreshold");
        }
        uqa.b("recmdPrefetch", "OptimizationConfig", "recmdConfig == null || recmdConfig.isEmpty()");
        return -1;
    }
}
