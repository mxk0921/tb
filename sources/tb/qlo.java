package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qlo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yko f26817a;
    public final rlo b;

    static {
        t2o.a(993002166);
    }

    public qlo(yko ykoVar, rlo rloVar) {
        this.f26817a = ykoVar;
        this.b = rloVar;
        l();
    }

    public final void a(boolean z, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e3fabd", new Object[]{this, new Boolean(z), str, str2, str3, map});
            return;
        }
        String j = j(map);
        this.f26817a.l().c("SFMonitor", "CommitAlarmEvent: %s<succ: %b>: errCode:%s; errMsg:%s; arg:%s", str, Boolean.valueOf(z), str2, str3, j);
        if (z) {
            AppMonitor.Alarm.commitSuccess(((nlo) this.b).e(), str, j);
        } else {
            AppMonitor.Alarm.commitFail(((nlo) this.b).e(), str, j, str2, str3);
        }
    }

    public void c(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d219c5bf", new Object[]{this, y5pVar});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("name", y5pVar.e);
        create.setValue("page_name", y5pVar.f);
        create.setValue(ls7.INFO_PAGE_NUMBER, String.valueOf(y5pVar.v));
        create.setValue("bucketId", y5pVar.w);
        create.setValue("traceId", y5pVar.x);
        create.setValue("zstd", String.valueOf(y5pVar.d));
        create.setValue("coldLaunch", String.valueOf(y5pVar.C));
        create.setValue("template_delay", String.valueOf(y5pVar.D));
        create.setValue("template_use_cache", String.valueOf(y5pVar.E));
        ((nlo) this.b).c(create);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("time_all", y5pVar.i);
        m("time_all", y5pVar.i);
        create2.setValue("time_mtop", y5pVar.j);
        m("time_mtop", y5pVar.j);
        create2.setValue("time_parse", y5pVar.k);
        m("time_parse", y5pVar.k);
        create2.setValue("time_template", y5pVar.s);
        m("time_template", y5pVar.s);
        create2.setValue("time_template_num", y5pVar.t);
        create2.setValue("time_dipatch_to_main", y5pVar.r - y5pVar.q);
        m("time_dipatch_to_main", y5pVar.r - y5pVar.q);
        RequestStats requestStats = y5pVar.y;
        if (requestStats != null) {
            create2.setValue("time_server_rt", requestStats.serverRt);
            create2.setValue("time_send_size", requestStats.sendDataSize);
            create2.setValue("time_recv_size", requestStats.recvDataSize);
            create2.setValue("time_recv_time", requestStats.recvDataTime);
            create2.setValue("time_retry_times", requestStats.retryTimes);
            create2.setValue("time_one_way_aserver", requestStats.oneWayTime);
            m("time_server_rt", requestStats.serverRt);
        }
        AppMonitor.Stat.commit(((nlo) this.b).e(), "SearchTime", create, create2);
    }

    public final void d(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4634b64c", new Object[]{this, new Boolean(z), str, str2, str3});
            return;
        }
        Map<String, String> k = k();
        k.put("api", str);
        a(z, "MtopRequest", str2, str3, k);
    }

    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b842", new Object[]{this, str, str2, str3});
        } else {
            d(false, str, str2, str3);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77e0252", new Object[]{this, str});
        } else {
            d(true, str, null, null);
        }
    }

    public final void g(boolean z, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bc19d9", new Object[]{this, new Boolean(z), str, str2, str3, map});
            return;
        }
        Map<String, String> k = k();
        k.put("bizType", str);
        if (map != null) {
            k.putAll(map);
        }
        a(z, "SearchRequest", str2, str3, k);
    }

    public void h(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c577e72", new Object[]{this, str, str2, str3, map});
        } else {
            g(false, str, str2, str3, map);
        }
    }

    public void i(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d255de2", new Object[]{this, str, map});
        } else {
            g(true, str, null, null, map);
        }
    }

    public final String j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ba6dbbb", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        ((nlo) this.b).a(jSONObject);
        return jSONObject.toJSONString();
    }

    public final Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d66893c", new Object[]{this});
        }
        return new HashMap();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("time_all");
        create.addMeasure("time_mtop");
        create.addMeasure("time_parse");
        create.addMeasure("time_template");
        create.addMeasure("time_template_num");
        create.addMeasure("time_send_size");
        create.addMeasure("time_recv_time");
        create.addMeasure("time_recv_size");
        create.addMeasure("time_server_rt");
        create.addMeasure("time_retry_times");
        create.addMeasure("time_one_way_aserver");
        create.addMeasure("time_dipatch_to_main");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("name");
        create2.addDimension("page_name");
        create2.addDimension(ls7.INFO_PAGE_NUMBER);
        create2.addDimension("bucketId");
        create2.addDimension("traceId");
        create2.addDimension("zstd");
        create2.addDimension("coldLaunch");
        create2.addDimension("template_delay");
        create2.addDimension("template_use_cache");
        ((nlo) this.b).b(create2);
        AppMonitor.register(((nlo) this.b).e(), "SearchTime", create, create2);
        MeasureSet create3 = MeasureSet.create();
        create3.addMeasure("time_all");
        create3.addMeasure("time_page");
        DimensionSet create4 = DimensionSet.create();
        create4.addDimension("name");
        create4.addDimension("page_name");
        ((nlo) this.b).b(create4);
        AppMonitor.register(((nlo) this.b).e(), "FirstScreenTime", create3, create4);
        MeasureSet create5 = MeasureSet.create();
        create5.addMeasure("time_all");
        DimensionSet create6 = DimensionSet.create();
        create6.addDimension("name");
        create6.addDimension("not_found");
        ((nlo) this.b).b(create6);
        AppMonitor.register(((nlo) this.b).e(), "CacheLoadTime", create5, create6);
    }

    public final void m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81cd7e8f", new Object[]{this, str, new Long(j)});
        } else {
            TLog.loge("tbsearch_performance", str, String.valueOf(j));
        }
    }

    public void b(String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe440f4d", new Object[]{this, str, str2, new Long(j), new Long(j2)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("name", str);
        create.setValue("page_name", str2);
        ((nlo) this.b).c(create);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("time_all", j);
        create2.setValue("time_page", j2);
        AppMonitor.Stat.commit(((nlo) this.b).e(), "FirstScreenTime", create, create2);
        this.f26817a.l().c("SFMonitor", "CommitStateEvent %s(%s:%s)(%s:%s): <%s:%d> <%s:%d>", "FirstScreenTime", "name", str, "page_name", str2, "time_all", Long.valueOf(j), "time_page", Long.valueOf(j2));
    }
}
