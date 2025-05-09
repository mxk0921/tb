package anet.channel.flow;

import anet.channel.statist.RequestStatistic;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OneFlowStat implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double bg_cell_down_flowSize;
    public double bg_cell_up_flowSize;
    public double bg_wifi_down_flowSize;
    public double bg_wifi_up_flowSize;
    public double sumFlowSize;
    public String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    public double fg_wifi_up_flowSize = vu3.b.GEO_NOT_SUPPORT;
    public double fg_wifi_down_flowSize = vu3.b.GEO_NOT_SUPPORT;
    public double fg_cell_up_flowSize = vu3.b.GEO_NOT_SUPPORT;
    public double fg_cell_down_flowSize = vu3.b.GEO_NOT_SUPPORT;
    public double fg_time = vu3.b.GEO_NOT_SUPPORT;
    public double bg_time = vu3.b.GEO_NOT_SUPPORT;
    public double cell_time = vu3.b.GEO_NOT_SUPPORT;
    public double wifi_time = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(607125653);
    }

    public OneFlowStat(RequestStatistic requestStatistic) {
        this.bg_wifi_up_flowSize = vu3.b.GEO_NOT_SUPPORT;
        this.bg_wifi_down_flowSize = vu3.b.GEO_NOT_SUPPORT;
        this.bg_cell_up_flowSize = vu3.b.GEO_NOT_SUPPORT;
        this.bg_cell_down_flowSize = vu3.b.GEO_NOT_SUPPORT;
        this.sumFlowSize = vu3.b.GEO_NOT_SUPPORT;
        double d = (requestStatistic.sendDataSize * 1.0d) / 1048576.0d;
        double d2 = (requestStatistic.recDataSize * 1.0d) / 1048576.0d;
        if ("bg".equalsIgnoreCase(requestStatistic.isBg)) {
            if (!requestStatistic.isWifi || requestStatistic.forceCellular > 0) {
                this.bg_cell_up_flowSize = d;
                this.bg_cell_down_flowSize = d2;
            } else {
                this.bg_wifi_up_flowSize = d;
                this.bg_wifi_down_flowSize = d2;
            }
        } else if (!requestStatistic.isWifi || requestStatistic.forceCellular > 0) {
            this.bg_cell_up_flowSize = d;
            this.bg_cell_down_flowSize = d2;
        } else {
            this.bg_wifi_up_flowSize = d;
            this.bg_wifi_down_flowSize = d2;
        }
        this.sumFlowSize = d + d2;
    }

    public synchronized OneFlowStat updateOneStat(OneFlowStat oneFlowStat, OneFlowStat oneFlowStat2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OneFlowStat) ipChange.ipc$dispatch("bc9319a3", new Object[]{this, oneFlowStat, oneFlowStat2});
        }
        oneFlowStat.fg_cell_down_flowSize += oneFlowStat2.fg_cell_down_flowSize;
        oneFlowStat.bg_cell_down_flowSize += oneFlowStat2.bg_cell_down_flowSize;
        oneFlowStat.fg_cell_up_flowSize += oneFlowStat2.fg_cell_up_flowSize;
        oneFlowStat.bg_cell_up_flowSize += oneFlowStat2.bg_cell_up_flowSize;
        oneFlowStat.fg_wifi_down_flowSize += oneFlowStat2.fg_wifi_down_flowSize;
        oneFlowStat.bg_wifi_down_flowSize += oneFlowStat2.bg_wifi_down_flowSize;
        oneFlowStat.fg_wifi_up_flowSize += oneFlowStat2.fg_wifi_up_flowSize;
        oneFlowStat.bg_wifi_up_flowSize += oneFlowStat2.bg_wifi_up_flowSize;
        oneFlowStat.sumFlowSize += oneFlowStat2.sumFlowSize;
        return oneFlowStat;
    }

    public synchronized void updateTime(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cffe5bd", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
            return;
        }
        this.fg_time = d;
        this.bg_time = d2;
        this.cell_time = d3;
        this.wifi_time = d4;
    }
}
