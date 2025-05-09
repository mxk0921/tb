package com.taobao.accs.ut.monitor;

import anet.channel.statist.Monitor;
import com.taobao.accs.utl.ALog;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "accs", monitorPoint = "netperformance_overseas")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NetPerformanceOverseasMonitor extends NetPerformanceMonitor {
    private static final String TAG = "NetPerformanceOverseasMonitor";

    static {
        t2o.a(343933213);
    }

    public NetPerformanceOverseasMonitor(NetPerformanceMonitor netPerformanceMonitor) {
        if (netPerformanceMonitor == null) {
            ALog.e(TAG, "npm null", new Object[0]);
            return;
        }
        this.accs_sdk_version = netPerformanceMonitor.accs_sdk_version;
        this.service_id = netPerformanceMonitor.service_id;
        this.ret = netPerformanceMonitor.ret;
        this.error_code = netPerformanceMonitor.error_code;
        this.fail_reasons = netPerformanceMonitor.fail_reasons;
        this.accs_type = netPerformanceMonitor.accs_type;
        this.host = netPerformanceMonitor.host;
        this.retry_times = netPerformanceMonitor.retry_times;
        this.service_type = netPerformanceMonitor.service_type;
        this.data_id = netPerformanceMonitor.data_id;
        this.start_send_date = netPerformanceMonitor.start_send_date;
        this.enter_queue_date = netPerformanceMonitor.enter_queue_date;
        this.take_date = netPerformanceMonitor.take_date;
        this.to_tnet_date = netPerformanceMonitor.to_tnet_date;
        this.receive_unparse_date = netPerformanceMonitor.receive_unparse_date;
        this.start_parse_date = netPerformanceMonitor.start_parse_date;
        this.receive_ack_date = netPerformanceMonitor.receive_ack_date;
    }
}
