package anet.channel.flow;

import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.DayFlowStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SingleFlowStatistic;
import anet.channel.statist.WifiFgUseCellReqStatic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlowManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.FlowAttributes";
    private static final int maxSize = 128;
    private static AtomicBoolean flag = new AtomicBoolean(false);
    public static Map<String, DayFlowStat> curTopTraffic = null;
    public static Map<String, SingleFlowStat> curTopTrafficUrl = null;
    public static HashMap<String, Double> useCellFlow = null;
    public static HashMap<String, Long> reportUseCellFlow = null;
    public static double curUseCellFlow = vu3.b.GEO_NOT_SUPPORT;
    public static String curDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        curTopTraffic = null;
        curTopTrafficUrl = null;
    }

    public static void commitDayFlowStat(HashMap<String, DayFlowStat> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa8e745", new Object[]{hashMap});
        } else if (hashMap != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, DayFlowStat> entry : hashMap.entrySet()) {
                DayFlowStat value = entry.getValue();
                OneFlowStat oneFlowStat = value.oneFlowStat;
                if (oneFlowStat != null) {
                    DayFlowStatistic dayFlowStatistic = new DayFlowStatistic(value.oneFlowStat.date, value.startUpCount);
                    dayFlowStatistic.setFlowSize(oneFlowStat.fg_wifi_up_flowSize, oneFlowStat.bg_wifi_up_flowSize, oneFlowStat.fg_wifi_down_flowSize, oneFlowStat.bg_wifi_down_flowSize, oneFlowStat.fg_cell_up_flowSize, oneFlowStat.bg_cell_up_flowSize, oneFlowStat.fg_cell_down_flowSize, oneFlowStat.bg_cell_down_flowSize);
                    dayFlowStatistic.setFlowTime(oneFlowStat.fg_time, oneFlowStat.bg_time, oneFlowStat.cell_time, oneFlowStat.wifi_time);
                    ALog.e(TAG, "[flow] commitDayFlowStat", null, "fg_wifi", Double.valueOf(dayFlowStatistic.fg_wifi_up_flowSize + dayFlowStatistic.fg_wifi_down_flowSize), "bg_wifi", Double.valueOf(dayFlowStatistic.bg_wifi_up_flowSize + dayFlowStatistic.bg_wifi_down_flowSize), "fg_cell", Double.valueOf(dayFlowStatistic.fg_cell_up_flowSize + dayFlowStatistic.fg_cell_down_flowSize), "bg_cell", Double.valueOf(dayFlowStatistic.bg_cell_up_flowSize + dayFlowStatistic.bg_cell_down_flowSize));
                    AppMonitor.getInstance().commitStat(dayFlowStatistic);
                    arrayList = arrayList;
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashMap.remove((String) it.next());
            }
        }
    }

    public static void commitSingleFlowStat(HashMap<String, SingleFlowStat> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2ae68b", new Object[]{hashMap});
        } else if (hashMap != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, SingleFlowStat> entry : hashMap.entrySet()) {
                SingleFlowStat value = entry.getValue();
                OneFlowStat oneFlowStat = value.oneFlowStat;
                if (oneFlowStat != null) {
                    SingleFlowStatistic singleFlowStatistic = new SingleFlowStatistic(value.oneFlowStat.date, value.launchTime, value.host, value.url);
                    singleFlowStatistic.setFlowSize(oneFlowStat.fg_wifi_up_flowSize, oneFlowStat.bg_wifi_up_flowSize, oneFlowStat.fg_wifi_down_flowSize, oneFlowStat.bg_wifi_down_flowSize, oneFlowStat.fg_cell_up_flowSize, oneFlowStat.bg_cell_up_flowSize, oneFlowStat.fg_cell_down_flowSize, oneFlowStat.bg_cell_down_flowSize);
                    singleFlowStatistic.setFlowTime(oneFlowStat.fg_time, oneFlowStat.bg_time, oneFlowStat.cell_time, oneFlowStat.wifi_time);
                    ALog.e(TAG, "[flow] commitSingleFlowStat", null, "fg_wifi", Double.valueOf(singleFlowStatistic.fg_wifi_up_flowSize + singleFlowStatistic.fg_wifi_down_flowSize), "bg_wifi", Double.valueOf(singleFlowStatistic.bg_wifi_up_flowSize + singleFlowStatistic.bg_wifi_down_flowSize), "fg_cell", Double.valueOf(singleFlowStatistic.fg_cell_up_flowSize + singleFlowStatistic.fg_cell_down_flowSize), "bg_cell", Double.valueOf(singleFlowStatistic.bg_cell_up_flowSize + singleFlowStatistic.bg_cell_down_flowSize));
                    AppMonitor.getInstance().commitStat(singleFlowStatistic);
                    arrayList = arrayList;
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashMap.remove((String) it.next());
            }
        }
    }

    public static void commitWifiFgUseCellReqStatic(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07e0571", new Object[]{requestStatistic});
            return;
        }
        if (reportUseCellFlow == null) {
            reportUseCellFlow = new HashMap<>();
        }
        Long l = reportUseCellFlow.get(curDate);
        if ((l == null ? 0L : l.longValue()) != 1) {
            if (useCellFlow == null) {
                useCellFlow = new HashMap<>();
            }
            Double d = useCellFlow.get(curDate);
            double doubleValue = d == null ? vu3.b.GEO_NOT_SUPPORT : d.doubleValue();
            if (isOverCellFlow(doubleValue)) {
                commitWifiFgUseCellReqStatic(requestStatistic, doubleValue, 1);
            }
        }
    }

    public static synchronized void dueToCurCellData(double d) {
        double d2;
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9793b3a", new Object[]{new Double(d)});
                return;
            }
            if (useCellFlow == null) {
                useCellFlow = new HashMap<>();
            }
            if (useCellFlow.containsKey(curDate)) {
                Double d3 = useCellFlow.get(curDate);
                if (d3 == null) {
                    d2 = vu3.b.GEO_NOT_SUPPORT;
                } else {
                    d2 = d3.doubleValue();
                }
                d += d2;
            }
            useCellFlow.put(curDate, Double.valueOf(d));
            if (isOverCellFlow(d)) {
                AwcnConfig.setWifiUnavailableUseCellOptOpened(false);
                ALog.e(TAG, "[wifi fg detect opt] [flow] not allow use cell! cell=" + d + " > " + AwcnConfig.getAllowUseCellFlowSize(), null, new Object[0]);
            }
        }
    }

    public static synchronized void dueToCurTrafficData(RequestStatistic requestStatistic) {
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d6f176b", new Object[]{requestStatistic});
                return;
            }
            OneFlowStat oneFlowStat = new OneFlowStat(requestStatistic);
            dueToCurTrafficUrlData(new SingleFlowStat(requestStatistic, oneFlowStat));
            dueToCurTrafficData(new DayFlowStat(requestStatistic, oneFlowStat));
            if (requestStatistic.isWifi && requestStatistic.forceCellular > 0) {
                double d = oneFlowStat.bg_cell_down_flowSize + oneFlowStat.bg_cell_up_flowSize + oneFlowStat.fg_cell_down_flowSize + oneFlowStat.fg_cell_up_flowSize;
                dueToCurCellData(d);
                curUseCellFlow += d;
            }
        }
    }

    public static synchronized void dueToCurTrafficUrlData(SingleFlowStat singleFlowStat) {
        String str;
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7855ed7", new Object[]{singleFlowStat});
                return;
            }
            if (curTopTrafficUrl == null) {
                curTopTrafficUrl = new HashMap();
            }
            if (curTopTrafficUrl.size() >= 128) {
                String str2 = singleFlowStat.url;
                if (curTopTrafficUrl.containsKey(str2)) {
                    SingleFlowStat singleFlowStat2 = curTopTrafficUrl.get(str2);
                    if (singleFlowStat2 != null) {
                        OneFlowStat oneFlowStat = singleFlowStat.oneFlowStat;
                        singleFlowStat.oneFlowStat = oneFlowStat.updateOneStat(singleFlowStat2.oneFlowStat, oneFlowStat);
                    }
                    curTopTrafficUrl.remove(str2);
                } else {
                    double d = Double.MAX_VALUE;
                    for (SingleFlowStat singleFlowStat3 : curTopTrafficUrl.values()) {
                        d = Math.min(d, singleFlowStat3.oneFlowStat.sumFlowSize);
                    }
                    if (singleFlowStat.oneFlowStat.sumFlowSize >= d) {
                        Iterator<Map.Entry<String, SingleFlowStat>> it = curTopTrafficUrl.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str = null;
                                break;
                            }
                            Map.Entry<String, SingleFlowStat> next = it.next();
                            if (next.getValue().oneFlowStat.sumFlowSize == d) {
                                str = next.getKey();
                                break;
                            }
                        }
                        curTopTrafficUrl.remove(str);
                    } else {
                        return;
                    }
                }
            }
            curTopTrafficUrl.put(singleFlowStat.url, singleFlowStat);
        }
    }

    public static synchronized void dueToReportData(long j) {
        long j2;
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fd59750", new Object[]{new Long(j)});
                return;
            }
            if (reportUseCellFlow == null) {
                reportUseCellFlow = new HashMap<>();
            }
            if (reportUseCellFlow.containsKey(curDate)) {
                Long l = reportUseCellFlow.get(curDate);
                if (l == null) {
                    j2 = 0;
                } else {
                    j2 = l.longValue();
                }
                if (j2 != -1) {
                    j = j2;
                }
            }
            reportUseCellFlow.put(curDate, Long.valueOf(j));
        }
    }

    public static synchronized boolean isOverCellFlow(double d) {
        boolean z = false;
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fe74546d", new Object[]{new Double(d)})).booleanValue();
            }
            if (d > AwcnConfig.getAllowUseCellFlowSize()) {
                z = true;
            }
            return z;
        }
    }

    static {
        t2o.a(607125643);
    }

    public static synchronized void dueToCurTrafficData(DayFlowStat dayFlowStat) {
        DayFlowStat dayFlowStat2;
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773cf88", new Object[]{dayFlowStat});
                return;
            }
            if (curTopTraffic == null) {
                curTopTraffic = new HashMap();
            }
            if (curTopTraffic.containsKey(curDate) && (dayFlowStat2 = curTopTraffic.get(curDate)) != null) {
                OneFlowStat oneFlowStat = dayFlowStat.oneFlowStat;
                dayFlowStat.oneFlowStat = oneFlowStat.updateOneStat(dayFlowStat2.oneFlowStat, oneFlowStat);
                dayFlowStat.startUpCount = dayFlowStat2.startUpCount;
                if (flag.compareAndSet(false, true)) {
                    dayFlowStat.startUpCount++;
                }
            }
            curTopTraffic.put(curDate, dayFlowStat);
        }
    }

    public static void commitWifiFgUseCellReqStatic(RequestStatistic requestStatistic, double d, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891e87b6", new Object[]{requestStatistic, new Double(d), new Integer(i)});
            return;
        }
        if (i == 1) {
            reportUseCellFlow.put(curDate, 1L);
            str = "over_cell_flow";
        } else {
            str = "bg_report";
        }
        WifiFgUseCellReqStatic wifiFgUseCellReqStatic = new WifiFgUseCellReqStatic(requestStatistic, str);
        wifiFgUseCellReqStatic.useForceCellFlowByDay = d;
        ALog.e(TAG, "[wifi fg detect opt] [flow] " + str + ", commitWifiFgUseCellReqStatic", null, "useForceCellFlowByDay", Double.valueOf(wifiFgUseCellReqStatic.useForceCellFlowByDay));
        AppMonitor.getInstance().commitStat(wifiFgUseCellReqStatic);
    }
}
