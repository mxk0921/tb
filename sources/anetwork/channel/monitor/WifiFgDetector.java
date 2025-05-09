package anetwork.channel.monitor;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.DetectHistoryRecord;
import anet.channel.detect.WifiDetector;
import anet.channel.statist.WifiFgDetectStatic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;
import tb.hxj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WifiFgDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CDN_URL = "https://gw.alicdn.com/status.taobao";
    private static final String IDC_URL = "https://guide-acs.m.taobao.com/gw/mtop.common.gettimestamp/1.0";
    private static final int REQUEST_COUNT = 2;
    private static final String SP_HISTORY_RECORDS = "networksdk_wifi_fg_history_records";
    private static final String TAG = "awcn.WifiFgDetector";
    private static AtomicInteger seq = new AtomicInteger(1);
    private static AtomicInteger lastDetectType = new AtomicInteger(-1);
    private static CopyOnWriteArraySet<String> requestList = null;
    private static int continueTimeoutCount = 0;
    private static int periodTimeoutCount = 0;
    private static long startTime = -1;
    private static long endTime = -1;
    private static AtomicBoolean isInit = new AtomicBoolean(false);
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anetwork.channel.monitor.WifiFgDetector.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else {
                WifiFgDetector.access$000(true);
            }
        }
    };
    private static AppLifecycle.AppLifecycleListener appLifecycleListener = new AppLifecycle.AppLifecycleListener() { // from class: anetwork.channel.monitor.WifiFgDetector.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5402817", new Object[]{this});
            } else {
                WifiFgDetector.access$000(true);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IOneDetectFinishCb {
        void onRequestFinish(boolean z);
    }

    static {
        t2o.a(607126100);
    }

    public static /* synthetic */ void access$000(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            startDetect(z);
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            clearWifiFgStatus();
        }
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            updateWifiFgStatus();
        }
    }

    public static /* synthetic */ CopyOnWriteArraySet access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("ff65c64f", new Object[0]);
        }
        return requestList;
    }

    public static /* synthetic */ void access$400(NetworkStatusHelper.NetworkStatus networkStatus, String str, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb2ba6e", new Object[]{networkStatus, str, list, new Integer(i)});
        } else {
            startOneDetect(networkStatus, str, list, i);
        }
    }

    public static /* synthetic */ AtomicInteger access$600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("62a161a7", new Object[0]);
        }
        return lastDetectType;
    }

    private static synchronized void clearWifiFgStatus() {
        synchronized (WifiFgDetector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d833c", new Object[0]);
                return;
            }
            startTime = -1L;
            endTime = -1L;
            continueTimeoutCount = 0;
            periodTimeoutCount = 0;
        }
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
            return;
        }
        try {
            if (isInit.compareAndSet(false, true)) {
                ALog.e(TAG, "registerListener wifiFgDetect", null, new Object[0]);
                NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
                AppLifecycle.registerLifecycleListener(appLifecycleListener);
            }
        } catch (Exception e) {
            ALog.e(TAG, "[registerListener] wifiFgDetect error", null, e, new Object[0]);
        }
    }

    private static void startDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9fcf8a8", new Object[]{new Boolean(z)});
            return;
        }
        final NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!status.isWifi() || GlobalAppRuntimeInfo.isAppBackground()) {
            clearWifiFgStatus();
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] not wifi or isAppBackground", null, "isWifi", Boolean.valueOf(status.isWifi()), "isAppBackground", Boolean.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            return;
        }
        String uniqueId = NetworkStatusHelper.getUniqueId(status);
        if ("error".equalsIgnoreCase(uniqueId)) {
            clearWifiFgStatus();
            ALog.e(TAG, "[wifi fg detect opt]startWifiFgDetect uniqueId = error", null, new Object[0]);
        } else if (isNeedDetect(uniqueId, z)) {
            ThreadPoolExecutorFactory.submitHRTask(new Runnable() { // from class: anetwork.channel.monitor.WifiFgDetector.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt][DetectOpt] run startDetect!", null, "requestList", WifiFgDetector.access$300());
                    ArrayList arrayList = new ArrayList();
                    int size = WifiFgDetector.access$300().size();
                    Iterator it = WifiFgDetector.access$300().iterator();
                    while (it.hasNext()) {
                        WifiFgDetector.access$400(NetworkStatusHelper.NetworkStatus.this, (String) it.next(), arrayList, size);
                    }
                }
            });
        }
    }

    private static void startOneDetect(final NetworkStatusHelper.NetworkStatus networkStatus, String str, final List<DetectHistoryRecord.DetectRecord> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553c13a1", new Object[]{networkStatus, str, list, new Integer(i)});
            return;
        }
        final String str2 = "WifiFgDetect" + seq.getAndIncrement();
        final WifiFgDetectStatic wifiFgDetectStatic = new WifiFgDetectStatic(str);
        final long currentTimeMillis = System.currentTimeMillis();
        WifiFgDetectTask.access$500(str, str2, new IOneDetectFinishCb() { // from class: anetwork.channel.monitor.WifiFgDetector.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anetwork.channel.monitor.WifiFgDetector.IOneDetectFinishCb
            public void onRequestFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9929caa", new Object[]{this, new Boolean(z)});
                } else if (!GlobalAppRuntimeInfo.isAppBackground() || z) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.NetworkStatus.this);
                    if (z) {
                        WifiDetector.detectWifiFgHistoryRecord.update(uniqueId, true);
                    } else {
                        list.add(WifiDetector.detectWifiFgHistoryRecord.createDetectRecord(false));
                        if (list.size() >= 2) {
                            WifiDetector.detectWifiFgHistoryRecord.update(uniqueId, false);
                        }
                    }
                    WifiFgDetectStatic wifiFgDetectStatic2 = wifiFgDetectStatic;
                    wifiFgDetectStatic2.uniqueId = uniqueId;
                    wifiFgDetectStatic2.detectTime = currentTimeMillis2 - currentTimeMillis;
                    wifiFgDetectStatic.ret = z ? 1 : 0;
                    AppMonitor.getInstance().commitStat(wifiFgDetectStatic);
                    ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt] [DetectOpt] onRequestFinish:", str2, hxj.UNIQID, uniqueId, "enable", Boolean.valueOf(z), "detectRecordList", list);
                }
            }
        });
    }

    public static void updateWifiFgDetect(final int i, final String str, final boolean z, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6b6533", new Object[]{new Integer(i), str, new Boolean(z), new Integer(i2)});
        } else {
            ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anetwork.channel.monitor.WifiFgDetector.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AwcnConfig.isWifiUnavailableUseCellOptOpened()) {
                        if (!z) {
                            WifiFgDetector.access$100();
                            return;
                        }
                        if (AwcnConfig.isHostInWifiFgForceCellWhiteList(str)) {
                            if (i <= 0 || !z || i2 > 0) {
                                WifiFgDetector.access$200();
                            } else {
                                WifiFgDetector.access$100();
                                return;
                            }
                        }
                        WifiFgDetector.access$000(false);
                    }
                }
            });
        }
    }

    private static synchronized void updateWifiFgStatus() {
        synchronized (WifiFgDetector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29bb8db8", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (startTime == -1) {
                startTime = currentTimeMillis;
            }
            endTime = currentTimeMillis;
            continueTimeoutCount++;
            periodTimeoutCount++;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class WifiFgDetectTask implements NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IOneDetectFinishCb oneDetectFinishCb;
        public String seq;
        public String url;

        static {
            t2o.a(607126107);
            t2o.a(607125966);
        }

        public WifiFgDetectTask(String str, String str2, IOneDetectFinishCb iOneDetectFinishCb) {
            this.url = str;
            this.seq = str2;
            this.oneDetectFinishCb = iOneDetectFinishCb;
        }

        public static /* synthetic */ void access$500(String str, String str2, IOneDetectFinishCb iOneDetectFinishCb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6372a48", new Object[]{str, str2, iOneDetectFinishCb});
            } else {
                startWifiFgDetectOneTask(str, str2, iOneDetectFinishCb);
            }
        }

        private static void startWifiFgDetectOneTask(String str, String str2, IOneDetectFinishCb iOneDetectFinishCb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e59f0123", new Object[]{str, str2, iOneDetectFinishCb});
            } else {
                new WifiFgDetectTask(str, str2, iOneDetectFinishCb).start();
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            int httpCode = finishEvent.getHttpCode();
            ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt][DetectOpt] onFinished", this.seq, "code", Integer.valueOf(httpCode));
            IOneDetectFinishCb iOneDetectFinishCb = this.oneDetectFinishCb;
            if (httpCode == -202 || httpCode == -200 || httpCode == -401 || httpCode == -400 || httpCode == -406 || httpCode == -402) {
                z = false;
            }
            iOneDetectFinishCb.onRequestFinish(z);
        }

        public Future start() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("bdd2dfff", new Object[]{this});
            }
            RequestImpl requestImpl = new RequestImpl(this.url);
            requestImpl.setReadTimeout(AwcnConfig.getDetectReadTimeOut());
            requestImpl.setSeqNo(this.seq);
            if (AwcnConfig.isWifiDetectOptOpened()) {
                if (WifiFgDetector.access$600().get() == 1) {
                    WifiFgDetector.access$600().set(0);
                    str = "long_link";
                } else {
                    WifiFgDetector.access$600().set(1);
                    str = "short_link";
                }
                ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt][DetectOpt] start! ", this.seq, AgooConstants.MESSAGE_FLAG, str);
            } else {
                str = "true";
            }
            requestImpl.setExtProperty(RequestConstant.KEY_WIFI_DETECT_REQ, str);
            requestImpl.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
            return new DegradableNetwork(GlobalAppRuntimeInfo.getContext()).asyncSend(requestImpl, null, null, this);
        }
    }

    private static synchronized boolean isNeedDetect(String str, boolean z) {
        boolean z2;
        DetectHistoryRecord detectHistoryRecord;
        synchronized (WifiFgDetector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d539364", new Object[]{str, new Boolean(z)})).booleanValue();
            }
            CopyOnWriteArraySet<String> copyOnWriteArraySet = requestList;
            if (copyOnWriteArraySet == null || copyOnWriteArraySet.isEmpty()) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                requestList = copyOnWriteArraySet2;
                copyOnWriteArraySet2.add(IDC_URL);
                requestList.add(CDN_URL);
            }
            if (z) {
                ALog.e(TAG, "[wifi fg detect opt][DetectOpt] need wifi fg detect, isStatusChangeDetect is true ", null, new Object[0]);
                return true;
            }
            if (WifiDetector.detectWifiFgHistoryRecord == null) {
                WifiDetector.detectWifiFgHistoryRecord = new DetectHistoryRecord(SP_HISTORY_RECORDS);
            }
            boolean z3 = continueTimeoutCount >= AwcnConfig.getContinueTimeoutCount();
            long j = endTime;
            long j2 = -1;
            if (j != -1) {
                long j3 = startTime;
                if (j3 != -1) {
                    j2 = j - j3;
                }
            }
            boolean z4 = j2 >= AwcnConfig.getPeriodTime() * 1000 && periodTimeoutCount >= AwcnConfig.getPeriodTimeoutCount();
            if (!z3 && !z4) {
                z2 = false;
                detectHistoryRecord = WifiDetector.detectWifiFgHistoryRecord;
                if (detectHistoryRecord != null || !detectHistoryRecord.isNeedsWifiFgDetect(str, z2)) {
                    ALog.e(TAG, "[wifi fg detect opt][DetectOpt] not need wifi fg detect, condition is false", null, "continueTimeoutCount", Integer.valueOf(continueTimeoutCount), "periodTimeoutCount", Integer.valueOf(periodTimeoutCount), "periodTime", Long.valueOf(j2));
                    return false;
                }
                ALog.e(TAG, "[wifi fg detect opt][DetectOpt] need wifi fg detect, isNeedsWifiFgDetect is true ", null, new Object[0]);
                clearWifiFgStatus();
                return true;
            }
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] detect condition true", null, "continueTimeoutCount", Integer.valueOf(continueTimeoutCount), "periodTimeoutCount", Integer.valueOf(periodTimeoutCount), "periodTime", Long.valueOf(j2));
            z2 = true;
            detectHistoryRecord = WifiDetector.detectWifiFgHistoryRecord;
            if (detectHistoryRecord != null) {
            }
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] not need wifi fg detect, condition is false", null, "continueTimeoutCount", Integer.valueOf(continueTimeoutCount), "periodTimeoutCount", Integer.valueOf(periodTimeoutCount), "periodTime", Long.valueOf(j2));
            return false;
        }
    }
}
