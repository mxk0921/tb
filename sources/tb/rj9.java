package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.RequestStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27421a = false;

    static {
        t2o.a(815793482);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("time_all");
        create.addMeasure("time_mtop");
        create.addMeasure("time_parse");
        create.addMeasure("time_parse_json");
        create.addMeasure("time_parse_model");
        create.addMeasure("time_template");
        create.addMeasure("time_send_size");
        create.addMeasure("time_recv_time");
        create.addMeasure("time_recv_size");
        create.addMeasure("time_server_rt");
        create.addMeasure("time_one_way_aserver");
        create.addMeasure("time_all_ui");
        create.addMeasure("time_render");
        create.addMeasure("time_setup_page");
        create.addMeasure("time_dipatch_to_main");
        create.addMeasure("time_between_request_page");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("page_name");
        create2.addDimension("device_level");
        create2.addDimension("traceId");
        create2.addDimension("good_price");
        create2.addDimension("bucket_id");
        create2.addDimension("srp_perf");
        create2.addDimension("zstd");
        create2.addDimension("coldLaunch");
        create2.addDimension("keepLink");
        create2.addDimension("template_delay");
        AppMonitor.register("tbsearch", "FirstScreenPerformance", create, create2);
    }

    public static void a(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f91ed", new Object[]{y5pVar});
            return;
        }
        if (!f27421a) {
            b();
            f27421a = true;
        }
        if (y5pVar.z != 0) {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("page_name", y5pVar.f);
            create.setValue("traceId", y5pVar.x);
            create.setValue("template_delay", String.valueOf(y5pVar.D));
            create.setValue("template_use_cache", String.valueOf(y5pVar.E));
            String a2 = x0p.INSTANCE.a("base_optimize");
            if (a2 == null) {
                a2 = "-1";
            }
            create.setValue("bucket_id", a2);
            create.setValue("good_price", String.valueOf(cvr.INSTANCE.d()));
            create.setValue("device_level", ri7.a());
            create.setValue("srp_perf", oen.n("tbAndroidSrpPerf"));
            create.setValue("zstd", String.valueOf(y5pVar.d));
            create.setValue("coldLaunch", String.valueOf(y5pVar.C));
            create.setValue("keepLink", String.valueOf(y5pVar.F));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("time_all", y5pVar.i);
            create2.setValue("time_mtop", y5pVar.j);
            create2.setValue("time_parse", y5pVar.k);
            create2.setValue("time_parse_json", y5pVar.l);
            create2.setValue("time_parse_model", y5pVar.m);
            create2.setValue("time_template", y5pVar.s);
            create2.setValue("time_render", y5pVar.B - y5pVar.A);
            create2.setValue("time_all_ui", y5pVar.B - y5pVar.z);
            create2.setValue("time_dipatch_to_main", y5pVar.r - y5pVar.q);
            create2.setValue("time_setup_page", y5pVar.p);
            create2.setValue("time_between_request_page", y5pVar.g - y5pVar.z);
            RequestStats requestStats = y5pVar.y;
            if (requestStats != null) {
                create2.setValue("time_server_rt", requestStats.serverRt);
                create2.setValue("time_send_size", requestStats.sendDataSize);
                create2.setValue("time_recv_size", requestStats.recvDataSize);
                create2.setValue("time_recv_time", requestStats.recvDataTime);
                create2.setValue("time_one_way_aserver", requestStats.oneWayTime);
            }
            c4p.D("TBSearch.FirstScreenPerformance", "commit first screen performance, coldLaunch=" + y5pVar.C, new Object[0]);
            AppMonitor.Stat.commit("tbsearch", "FirstScreenPerformance", create, create2);
        }
    }
}
