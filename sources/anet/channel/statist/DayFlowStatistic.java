package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "day_flow_stat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DayFlowStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Measure
    public double bg_cell_down_flowSize;
    @Measure
    public double bg_cell_up_flowSize;
    @Measure
    public double bg_time;
    @Measure
    public double bg_wifi_down_flowSize;
    @Measure
    public double bg_wifi_up_flowSize;
    @Measure
    public double cell_time;
    @Dimension
    public String date;
    @Measure
    public double fg_cell_down_flowSize;
    @Measure
    public double fg_cell_up_flowSize;
    @Measure
    public double fg_time;
    @Measure
    public double fg_wifi_down_flowSize;
    @Measure
    public double fg_wifi_up_flowSize;
    @Dimension
    public int start_count;
    @Measure
    public double wifi_time;

    static {
        t2o.a(607125757);
    }

    public DayFlowStatistic(String str, int i) {
        this.date = str;
        this.start_count = i;
    }

    public static /* synthetic */ Object ipc$super(DayFlowStatistic dayFlowStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/DayFlowStatistic");
    }

    public void setFlowSize(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39687d8", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), new Double(d8)});
            return;
        }
        this.fg_wifi_up_flowSize = d;
        this.bg_wifi_up_flowSize = d2;
        this.fg_wifi_down_flowSize = d3;
        this.bg_wifi_down_flowSize = d4;
        this.fg_cell_up_flowSize = d5;
        this.bg_cell_up_flowSize = d6;
        this.fg_cell_down_flowSize = d7;
        this.bg_cell_down_flowSize = d8;
    }

    public void setFlowTime(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634a3b24", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
            return;
        }
        this.fg_time = d;
        this.bg_time = d2;
        this.cell_time = d3;
        this.wifi_time = d4;
    }
}
