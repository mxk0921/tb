package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.BaseMonitor;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
@Monitor(module = "accs", monitorPoint = "netperformance")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetPerformanceMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public int accs_sdk_version;
    @Dimension
    public int accs_type;
    public String data_id;
    public long enter_queue_date;
    @Dimension
    public int error_code;
    @Dimension
    public String fail_reasons;
    @Dimension
    public String host;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long in_queue_time;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long parse_to_ack_time;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long rcv_to_parse_time;
    public long receive_ack_date;
    public long receive_unparse_date;
    @Dimension
    public String ret;
    @Dimension
    public int retry_times;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long rtt;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long send_to_rcv_time;
    @Dimension
    public String service_id = "none";
    @Dimension
    public String service_type;
    public long start_parse_date;
    public long start_send_date;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long start_to_enter_queue_time;
    public long take_date;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long take_to_send_time;
    public long to_tnet_date;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT, max = 60000.0d, min = vu3.b.GEO_NOT_SUPPORT)
    public long total_time;

    static {
        t2o.a(343933212);
    }

    private long computeTime(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2b567df", new Object[]{this, new Long(j), new Long(j2)})).longValue();
        }
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        return j2 - j;
    }

    public static /* synthetic */ Object ipc$super(NetPerformanceMonitor netPerformanceMonitor, String str, Object... objArr) {
        if (str.hashCode() == 358433569) {
            return new Boolean(super.beforeCommit());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/ut/monitor/NetPerformanceMonitor");
    }

    @Override // com.taobao.accs.utl.BaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        this.accs_sdk_version = 402;
        this.total_time = computeTime(this.start_send_date, this.receive_ack_date);
        this.rtt = computeTime(this.to_tnet_date, this.receive_ack_date);
        this.start_to_enter_queue_time = computeTime(this.start_send_date, this.enter_queue_date);
        this.in_queue_time = computeTime(this.enter_queue_date, this.take_date);
        this.take_to_send_time = computeTime(this.take_date, this.to_tnet_date);
        this.send_to_rcv_time = computeTime(this.to_tnet_date, this.receive_unparse_date);
        this.rcv_to_parse_time = computeTime(this.receive_unparse_date, this.start_parse_date);
        this.parse_to_ack_time = computeTime(this.start_parse_date, this.receive_ack_date);
        return super.beforeCommit();
    }

    public void onEnterQueueData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa23a9", new Object[]{this});
        } else {
            this.enter_queue_date = System.currentTimeMillis();
        }
    }

    public void onRecAck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58440d1f", new Object[]{this});
        } else {
            this.receive_ack_date = System.currentTimeMillis();
        }
    }

    public void onRecUnParse(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9926494", new Object[]{this, new Long(j)});
        } else {
            this.receive_unparse_date = j;
        }
    }

    public void onSend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef62730e", new Object[]{this});
        } else {
            this.start_send_date = System.currentTimeMillis();
        }
    }

    public void onSendData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ff4658", new Object[]{this});
        } else {
            this.to_tnet_date = System.currentTimeMillis();
        }
    }

    public void onStartParse(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee27e6d", new Object[]{this, new Long(j)});
        } else {
            this.start_parse_date = j;
        }
    }

    public void onTakeFromQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d74f28", new Object[]{this});
        } else {
            this.take_date = System.currentTimeMillis();
        }
    }

    public void setConnType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684d4954", new Object[]{this, new Integer(i)});
        } else {
            this.accs_type = i;
        }
    }

    public void setDataId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9630b8", new Object[]{this, str});
        } else {
            this.data_id = str;
        }
    }

    public void setFailReason(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666ec95", new Object[]{this, str});
        } else {
            this.fail_reasons = str;
        }
    }

    public void setHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else {
            this.host = str;
        }
    }

    public void setRet(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603be1ae", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "y";
        } else {
            str = "n";
        }
        this.ret = str;
    }

    public void setServiceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51cb3c7f", new Object[]{this, str});
        } else {
            this.service_id = str;
        }
    }

    public void setServiceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85f549e", new Object[]{this, str});
        } else {
            this.service_type = str;
        }
    }

    public void setFailReason(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d1f4d8", new Object[]{this, new Integer(i)});
            return;
        }
        this.error_code = i;
        if (i == -4) {
            setFailReason("msg too large");
        } else if (i == -3) {
            setFailReason("service not available");
        } else if (i == -2) {
            setFailReason("param error");
        } else if (i == -1) {
            setFailReason("network fail");
        } else if (i == 200) {
        } else {
            if (i != 300) {
                setFailReason(String.valueOf(i));
            } else {
                setFailReason("app not bind");
            }
        }
    }
}
