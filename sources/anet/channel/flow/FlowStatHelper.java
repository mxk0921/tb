package anet.channel.flow;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.encode.FileHelper;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppTimer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlowStatHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = "awcn.FlowStatHelper";
    private static long DELAY_TIME = 30;
    private static AtomicBoolean isInit = new AtomicBoolean(false);
    public static HashMap<String, FlowAttribute> flowAttributesHashMap = null;
    public static AppTimer fgAppTimer = new AppTimer("fg");
    public static AppTimer bgAppTimer = new AppTimer("bg");
    public static AppTimer cellAppTimer = new AppTimer(WXBasicComponentType.CELL);
    public static AppTimer wifiAppTimer = new AppTimer("wifi");
    public static String curDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    public static /* synthetic */ AtomicBoolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return isInit;
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            loadCurDateFlow();
        }
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return TAG;
    }

    private static synchronized void clear() {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
                return;
            }
            flowAttributesHashMap = null;
            FlowManager.clear();
            fgAppTimer.clear();
            bgAppTimer.clear();
            cellAppTimer.clear();
            wifiAppTimer.clear();
        }
    }

    public static void commitFlowStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f8fb00", new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.flow.FlowStatHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    boolean z2;
                    HashMap<String, DayFlowStat> hashMap;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FlowStatHelper.initFlow();
                        if (FlowStatHelper.flowAttributesHashMap == null) {
                            FlowStatHelper.access$100();
                        }
                        boolean z3 = false;
                        boolean z4 = false;
                        for (Map.Entry<String, FlowAttribute> entry : FlowStatHelper.flowAttributesHashMap.entrySet()) {
                            String key = entry.getKey();
                            FlowAttribute value = entry.getValue();
                            if (FlowStatHelper.curDate.equalsIgnoreCase(key) || (hashMap = value.topTraffic) == null || hashMap.get(key) == null) {
                                z = false;
                            } else {
                                z = true;
                            }
                            HashMap<String, SingleFlowStat> hashMap2 = value.topTrafficUrl;
                            if (hashMap2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z) {
                                FlowManager.commitDayFlowStat(value.topTraffic);
                            } else if (z2) {
                                FlowManager.commitSingleFlowStat(hashMap2);
                            }
                            z3 = z;
                            z4 = z2;
                        }
                        if (z3 || z4) {
                            FlowFileHelper.updateData(null);
                        }
                    } catch (Exception e) {
                        String access$200 = FlowStatHelper.access$200();
                        ALog.e(access$200, "[flow] commitFlowStat fail, e=" + e.toString(), null, new Object[0]);
                    }
                }
            }, DELAY_TIME, TimeUnit.SECONDS);
        }
    }

    public static void dueToBackgroundFlowStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cadd6e6", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        updateFlow(currentTimeMillis);
        bgAppTimer.start(currentTimeMillis);
        setNetworkStatusTimer(NetworkStatusHelper.getStatus(), currentTimeMillis);
    }

    public static void dueToForgroundFlowStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2178b8a", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        fgAppTimer.start(currentTimeMillis);
        bgAppTimer.stop(currentTimeMillis);
        setNetworkStatusTimer(NetworkStatusHelper.getStatus(), currentTimeMillis);
    }

    public static void dueToNetworkChangedFlowStat(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8b0d37", new Object[]{networkStatus});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        updateFlow(currentTimeMillis);
        setNetworkStatusTimer(networkStatus, currentTimeMillis);
    }

    public static synchronized void dueToTrafficData(final RequestStatistic requestStatistic) {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7060c049", new Object[]{requestStatistic});
            } else {
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.flow.FlowStatHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        HashMap<String, Long> hashMap;
                        HashMap<String, Double> hashMap2;
                        HashMap<String, DayFlowStat> hashMap3;
                        DayFlowStat dayFlowStat;
                        HashMap<String, SingleFlowStat> hashMap4;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (FlowStatHelper.access$000().compareAndSet(false, true)) {
                                FlowStatHelper.initFlow();
                            }
                            if (FlowStatHelper.flowAttributesHashMap == null) {
                                FlowStatHelper.access$100();
                                if (FlowStatHelper.flowAttributesHashMap == null) {
                                    FlowStatHelper.flowAttributesHashMap = new HashMap<>();
                                }
                            }
                            FlowAttribute flowAttribute = FlowStatHelper.flowAttributesHashMap.get(FlowStatHelper.curDate);
                            if (!(FlowManager.curTopTrafficUrl != null || flowAttribute == null || (hashMap4 = flowAttribute.topTrafficUrl) == null)) {
                                for (Map.Entry<String, SingleFlowStat> entry : hashMap4.entrySet()) {
                                    FlowManager.dueToCurTrafficUrlData(entry.getValue());
                                }
                            }
                            if (!(FlowManager.curTopTraffic != null || flowAttribute == null || (hashMap3 = flowAttribute.topTraffic) == null || (dayFlowStat = hashMap3.get(FlowStatHelper.curDate)) == null)) {
                                FlowManager.dueToCurTrafficData(dayFlowStat);
                            }
                            if (!(FlowManager.useCellFlow != null || flowAttribute == null || (hashMap2 = flowAttribute.useCellFlow) == null)) {
                                double doubleValue = hashMap2.get(FlowStatHelper.curDate).doubleValue();
                                if (doubleValue != vu3.b.GEO_NOT_SUPPORT) {
                                    FlowManager.dueToCurCellData(doubleValue);
                                }
                            }
                            if (!(FlowManager.reportUseCellFlow != null || flowAttribute == null || (hashMap = flowAttribute.reportUseCellFlow) == null)) {
                                long longValue = hashMap.get(FlowStatHelper.curDate).longValue();
                                if (longValue != -1) {
                                    FlowManager.dueToReportData(longValue);
                                }
                            }
                            FlowManager.dueToCurTrafficData(RequestStatistic.this);
                            FlowManager.commitWifiFgUseCellReqStatic(RequestStatistic.this);
                        } catch (Exception e) {
                            String access$200 = FlowStatHelper.access$200();
                            ALog.e(access$200, "[flow] dueToTrafficData fail, e=" + e.toString(), null, new Object[0]);
                        }
                    }
                });
            }
        }
    }

    public static synchronized void initFlow() {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f7e5", new Object[0]);
                return;
            }
            if (isInit.compareAndSet(false, true)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (NetworkStatusHelper.getStatus().isWifi()) {
                    cellAppTimer.stop(currentTimeMillis);
                    wifiAppTimer.start(currentTimeMillis);
                } else if (NetworkStatusHelper.getStatus().isMobile()) {
                    wifiAppTimer.stop(currentTimeMillis);
                    cellAppTimer.start(currentTimeMillis);
                }
                if (!GlobalAppRuntimeInfo.isAppBackground()) {
                    bgAppTimer.stop(currentTimeMillis);
                    fgAppTimer.start(currentTimeMillis);
                } else {
                    fgAppTimer.stop(currentTimeMillis);
                    bgAppTimer.start(currentTimeMillis);
                }
            }
        }
    }

    private static void loadCurDateFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47b451d", new Object[0]);
        } else if (flowAttributesHashMap == null) {
            flowAttributesHashMap = (HashMap) FileHelper.loadFile(null, FileHelper.getFile(null, FlowFileHelper.DEFAULT_PATH, FlowFileHelper.DEFAULT_FILE_NAME, FlowFileHelper.FLOW_TAG), FlowFileHelper.FLOW_TAG);
        }
    }

    private static void setNetworkStatusTimer(NetworkStatusHelper.NetworkStatus networkStatus, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525d01fd", new Object[]{networkStatus, new Long(j)});
        } else if (networkStatus.isWifi()) {
            cellAppTimer.stop(j);
            wifiAppTimer.start(j);
        } else if (networkStatus.isMobile()) {
            wifiAppTimer.stop(j);
            cellAppTimer.start(j);
        }
    }

    private static synchronized void timerStop(long j) {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf95a296", new Object[]{new Long(j)});
                return;
            }
            fgAppTimer.stop(j);
            bgAppTimer.stop(j);
            cellAppTimer.stop(j);
            wifiAppTimer.stop(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void updateFlow(long j) {
        long j2;
        double d;
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9dc7e6", new Object[]{new Long(j)});
            } else if (flowAttributesHashMap != null) {
                try {
                    timerStop(j);
                    FlowAttribute flowAttribute = new FlowAttribute();
                    if (FlowManager.curTopTraffic != null) {
                        ArrayList arrayList = new ArrayList(FlowManager.curTopTraffic.entrySet());
                        Collections.sort(arrayList, new Comparator<Map.Entry<String, DayFlowStat>>() { // from class: anet.channel.flow.FlowStatHelper.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public int compare(Map.Entry<String, DayFlowStat> entry, Map.Entry<String, DayFlowStat> entry2) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue() : Double.compare(entry.getValue().oneFlowStat.sumFlowSize, entry2.getValue().oneFlowStat.sumFlowSize);
                            }
                        });
                        for (int i = 0; i < Math.min(arrayList.size(), 10); i++) {
                            Map.Entry entry = (Map.Entry) arrayList.get(i);
                            DayFlowStat dayFlowStat = (DayFlowStat) entry.getValue();
                            OneFlowStat oneFlowStat = dayFlowStat.oneFlowStat;
                            if (oneFlowStat != null) {
                                oneFlowStat.updateTime(fgAppTimer.getTimes(), bgAppTimer.getTimes(), cellAppTimer.getTimes(), wifiAppTimer.getTimes());
                                flowAttribute.topTraffic.put(entry.getKey(), dayFlowStat);
                            }
                        }
                    }
                    if (FlowManager.curTopTrafficUrl != null) {
                        ArrayList arrayList2 = new ArrayList(FlowManager.curTopTrafficUrl.entrySet());
                        Collections.sort(arrayList2, new Comparator<Map.Entry<String, SingleFlowStat>>() { // from class: anet.channel.flow.FlowStatHelper.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public int compare(Map.Entry<String, SingleFlowStat> entry2, Map.Entry<String, SingleFlowStat> entry3) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("51cd4c3f", new Object[]{this, entry2, entry3})).intValue() : Double.compare(entry2.getValue().oneFlowStat.sumFlowSize, entry3.getValue().oneFlowStat.sumFlowSize);
                            }
                        });
                        for (int i2 = 0; i2 < Math.min(arrayList2.size(), 10); i2++) {
                            Map.Entry entry2 = (Map.Entry) arrayList2.get(i2);
                            SingleFlowStat singleFlowStat = (SingleFlowStat) entry2.getValue();
                            OneFlowStat oneFlowStat2 = singleFlowStat.oneFlowStat;
                            if (oneFlowStat2 != null) {
                                oneFlowStat2.updateTime(fgAppTimer.getTimes(), bgAppTimer.getTimes(), cellAppTimer.getTimes(), wifiAppTimer.getTimes());
                                flowAttribute.topTrafficUrl.put(entry2.getKey(), singleFlowStat);
                            }
                        }
                    }
                    HashMap<String, Double> hashMap = FlowManager.useCellFlow;
                    if (hashMap != null) {
                        Double d2 = hashMap.get(curDate);
                        if (d2 == null) {
                            d = vu3.b.GEO_NOT_SUPPORT;
                        } else {
                            d = d2.doubleValue();
                        }
                        HashMap<String, Double> hashMap2 = new HashMap<>();
                        hashMap2.put(curDate, Double.valueOf(d));
                        flowAttribute.useCellFlow = hashMap2;
                    }
                    HashMap<String, Long> hashMap3 = FlowManager.reportUseCellFlow;
                    if (hashMap3 != null) {
                        Long l = hashMap3.get(curDate);
                        if (l == null) {
                            j2 = 0;
                        } else {
                            j2 = l.longValue();
                        }
                        HashMap<String, Long> hashMap4 = new HashMap<>();
                        hashMap4.put(curDate, Long.valueOf(j2));
                        flowAttribute.reportUseCellFlow = hashMap4;
                    }
                    HashMap<String, FlowAttribute> hashMap5 = flowAttributesHashMap;
                    if (hashMap5 != null) {
                        hashMap5.remove(curDate);
                    } else {
                        flowAttributesHashMap = new HashMap<>();
                    }
                    flowAttributesHashMap.put(curDate, flowAttribute);
                    FlowFileHelper.updateData(null);
                    clear();
                } catch (Exception e) {
                    String str = TAG;
                    ALog.e(str, "[flow] updateFlow fail, e=" + e.toString(), null, new Object[0]);
                }
            }
        }
    }

    static {
        t2o.a(607125645);
    }
}
