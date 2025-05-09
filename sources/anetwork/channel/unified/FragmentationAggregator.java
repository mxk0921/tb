package anetwork.channel.unified;

import android.os.Handler;
import android.os.HandlerThread;
import anet.channel.AwcnConfig;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.SessionType;
import anet.channel.statist.FragmentParentStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentationAggregator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.FragmentationAggregator";
    private static HandlerThread handlerThread = null;
    private static Handler piorityHandler = null;
    private FragmentParentStatistic fps;
    private boolean isPacingDelayEnabled;
    private RequestContext rc;
    private ArrayList<FragmentationTask> tasksList;
    private ConcurrentHashMap<FragmentationTask, Integer> tasksStatesMap;
    private Session mulitpathSession = null;
    private boolean isMultipathEnabled = false;
    private long startTimeStamp = 0;
    private long endTimeStamp = 0;

    static {
        t2o.a(607126120);
    }

    public FragmentationAggregator(RequestContext requestContext) {
        this.tasksStatesMap = null;
        this.tasksList = null;
        this.fps = null;
        this.rc = null;
        this.isPacingDelayEnabled = false;
        this.tasksStatesMap = new ConcurrentHashMap<>();
        this.tasksList = new ArrayList<>();
        this.fps = new FragmentParentStatistic();
        this.rc = requestContext;
        this.isPacingDelayEnabled = AwcnConfig.isQoSPacingABSwitch;
    }

    public static /* synthetic */ RequestContext access$000(FragmentationAggregator fragmentationAggregator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestContext) ipChange.ipc$dispatch("5a86789", new Object[]{fragmentationAggregator});
        }
        return fragmentationAggregator.rc;
    }

    public static /* synthetic */ FragmentParentStatistic access$100(FragmentationAggregator fragmentationAggregator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentParentStatistic) ipChange.ipc$dispatch("45502e63", new Object[]{fragmentationAggregator});
        }
        return fragmentationAggregator.fps;
    }

    public static /* synthetic */ Session access$202(FragmentationAggregator fragmentationAggregator, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("f0deb56f", new Object[]{fragmentationAggregator, session});
        }
        fragmentationAggregator.mulitpathSession = session;
        return session;
    }

    public static /* synthetic */ void access$300(FragmentationAggregator fragmentationAggregator, ArrayList arrayList, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cd3493", new Object[]{fragmentationAggregator, arrayList, new Boolean(z), new Integer(i)});
        } else {
            fragmentationAggregator.sendQueueShortLink(arrayList, z, i);
        }
    }

    public static /* synthetic */ boolean access$400(FragmentationAggregator fragmentationAggregator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce1bcf8b", new Object[]{fragmentationAggregator})).booleanValue();
        }
        return fragmentationAggregator.isPacingDelayEnabled;
    }

    public static /* synthetic */ Handler access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1e938d8a", new Object[0]);
        }
        return getPiorityHandler();
    }

    public static /* synthetic */ void access$600(FragmentationAggregator fragmentationAggregator, ArrayList arrayList, Session session, Handler handler, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ebc148", new Object[]{fragmentationAggregator, arrayList, session, handler, new Long(j), new Integer(i)});
        } else {
            fragmentationAggregator.flushFragments(arrayList, session, handler, j, i);
        }
    }

    private void commitMetrics() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badb9213", new Object[]{this});
            return;
        }
        FragmentParentStatistic fragmentParentStatistic = this.fps;
        fragmentParentStatistic.totalTime = this.endTimeStamp - this.startTimeStamp;
        fragmentParentStatistic.fragmentCount = this.tasksList.size();
        FragmentParentStatistic fragmentParentStatistic2 = this.fps;
        fragmentParentStatistic2.successFragmentCount = 0L;
        fragmentParentStatistic2.failFragmentCount = 0L;
        fragmentParentStatistic2.cancelFragmentCount = 0L;
        fragmentParentStatistic2.multipathActualCount = 0L;
        fragmentParentStatistic2.ret = isSuccess() ? 1 : 0;
        Iterator<FragmentationTask> it = this.tasksList.iterator();
        while (it.hasNext()) {
            FragmentationTask next = it.next();
            int state = next.getState();
            if (state == 4) {
                this.fps.successFragmentCount++;
                if (next.isMultipath()) {
                    this.fps.multipathActualCount++;
                }
            } else if (state == 6) {
                this.fps.cancelFragmentCount++;
            } else {
                this.fps.failFragmentCount++;
            }
        }
        FragmentParentStatistic fragmentParentStatistic3 = this.fps;
        if (fragmentParentStatistic3.multipathActualCount <= 0) {
            z = false;
        }
        fragmentParentStatistic3.multipathActual = z;
        AppMonitor.getInstance().commitStat(this.fps);
        ALog.e(TAG, "[fragmentation] task, commitStatistic " + this.fps.toString(), this.rc.seqNum, new Object[0]);
    }

    private void flushFragments(ArrayList<FragmentationTask> arrayList, final Session session, Handler handler, long j, final int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ca8beb", new Object[]{this, arrayList, session, handler, new Long(j), new Integer(i)});
        } else if (handler != null) {
            ALog.e(TAG, "[fragmentation][QoS] flush fragments with delay, unit : " + j, this.rc.seqNum, new Object[0]);
            FragmentParentStatistic fragmentParentStatistic = this.fps;
            RequestConfig requestConfig = this.rc.config;
            fragmentParentStatistic.priorityLevel = requestConfig.priority;
            fragmentParentStatistic.scene = requestConfig.getBizScene();
            Iterator<FragmentationTask> it = arrayList.iterator();
            while (it.hasNext()) {
                final FragmentationTask next = it.next();
                long j2 = i2 * j * this.rc.config.priority;
                i2++;
                FragmentParentStatistic fragmentParentStatistic2 = this.fps;
                next.setScenePriority(fragmentParentStatistic2.scene, fragmentParentStatistic2.priorityLevel);
                handler.postDelayed(new Runnable() { // from class: anetwork.channel.unified.FragmentationAggregator.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        next.setGetLongMultiPathRet(i);
                        next.download(session);
                    }
                }, j2);
            }
        } else {
            ALog.e(TAG, "[fragmentation][QoS] flush fragments immediately, count : " + arrayList.size(), this.rc.seqNum, new Object[0]);
            Iterator<FragmentationTask> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FragmentationTask next2 = it2.next();
                next2.setGetLongMultiPathRet(i);
                next2.download(session);
            }
        }
    }

    private String getFragmentsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97132e1e", new Object[]{this});
        }
        if (this.tasksList.isEmpty()) {
            return null;
        }
        if (this.tasksList.size() == 1) {
            return this.tasksList.get(0).getRangeInfo();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<FragmentationTask> it = this.tasksList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getRangeInfo());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static synchronized Handler getPiorityHandler() {
        synchronized (FragmentationAggregator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("5bfd2cd1", new Object[0]);
            }
            Handler handler = piorityHandler;
            if (handler != null) {
                return handler;
            }
            HandlerThread handlerThread2 = new HandlerThread("FragmentationPriorityHandlerThread");
            handlerThread = handlerThread2;
            handlerThread2.start();
            Handler handler2 = new Handler(handlerThread.getLooper());
            piorityHandler = handler2;
            return handler2;
        }
    }

    private void sendFragmentTaskQueue(HttpUrl httpUrl, final ArrayList<FragmentationTask> arrayList, final boolean z, SessionCenter sessionCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211fdcfa", new Object[]{this, httpUrl, arrayList, new Boolean(z), sessionCenter});
            return;
        }
        ALog.e(TAG, "[fragmentation] aggregator send fragments queue, queue=[" + arrayList.size() + "], isMultipath=[" + z + "] ", this.rc.seqNum, new Object[0]);
        try {
            sessionCenter.asyncGet(httpUrl, SessionType.LONG_LINK, 1200L, z, new SessionGetCallback() { // from class: anetwork.channel.unified.FragmentationAggregator.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.SessionGetCallback
                public void onSessionGetFail() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("735355e4", new Object[]{this});
                        return;
                    }
                    ALog.e(FragmentationAggregator.TAG, "[fragmentation] aggregator get LONG_LINK failed, isMultipath=[" + z + "]", FragmentationAggregator.access$000(FragmentationAggregator.this).seqNum, new Object[0]);
                    FragmentationAggregator.access$300(FragmentationAggregator.this, arrayList, z, 3);
                }

                /* JADX WARN: Type inference failed for: r9v0, types: [int, boolean] */
                /* JADX WARN: Unknown variable types count: 1 */
                @Override // anet.channel.SessionGetCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onSessionGetSuccess(anet.channel.Session r11) {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.FragmentationAggregator.AnonymousClass1.onSessionGetSuccess(anet.channel.Session):void");
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "[fragmentation] aggregator send fragment queue exception: " + e, this.rc.seqNum, new Object[0]);
            sendQueueShortLink(arrayList, z, 4);
        }
    }

    private void sendQueueShortLink(ArrayList<FragmentationTask> arrayList, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab66cf25", new Object[]{this, arrayList, new Boolean(z), new Integer(i)});
            return;
        }
        this.fps.sessionType = SessionType.SHORT_LINK;
        Session httpSession = getHttpSession();
        if (httpSession != null) {
            if (z) {
                ALog.e(TAG, "[fragmentation] aggregator get SHORT_LINK (multi-path) success, session=[" + httpSession.mSeq + "]", this.rc.seqNum, new Object[0]);
                httpSession.setForceCellular(true);
            }
            RequestContext requestContext = this.rc;
            if (requestContext.config.priority != 9 || !this.isPacingDelayEnabled) {
                ALog.e(TAG, "[fragmentation][QoS] (SHORT_LINK) priority : " + this.rc.config.priority, this.rc.seqNum, new Object[0]);
                flushFragments(arrayList, httpSession, null, 0L, i);
            } else {
                ALog.e(TAG, "[fragmentation][QoS] (SHORT_LINK) priority : LOWEST", requestContext.seqNum, new Object[0]);
                flushFragments(arrayList, httpSession, getPiorityHandler(), AwcnConfig.getQosDelayUnit(), i);
            }
        }
        if (z) {
            this.mulitpathSession = httpSession;
        }
    }

    public synchronized void addTask(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2443de1d", new Object[]{this, fragmentationTask});
            return;
        }
        fragmentationTask.setParentAggregator(this);
        this.tasksStatesMap.put(fragmentationTask, new Integer(0));
        this.tasksList.add(fragmentationTask);
    }

    public synchronized Map<String, List<String>> buildResponseHeader(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5166ad17", new Object[]{this, map});
        }
        String fragmentsInfo = getFragmentsInfo();
        if (fragmentsInfo == null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(fragmentsInfo);
        hashMap.put(RequestConstant.KEY_FRAGMENTATION_INFO, arrayList);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public synchronized void cancelAllTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce7a573", new Object[]{this});
            return;
        }
        Iterator<FragmentationTask> it = this.tasksList.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public synchronized Session getMulitpathSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("a2fabef", new Object[]{this});
        }
        return this.mulitpathSession;
    }

    public void initStatisticInfo(String str, String str2, int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7f1f2a", new Object[]{this, str, str2, new Integer(i), new Long(j), new Boolean(z)});
        } else {
            this.fps.setBaseInfo(str, str2, i, j, z);
        }
    }

    public synchronized boolean isAllTasksFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a6b88b5", new Object[]{this})).booleanValue();
        }
        for (Map.Entry<FragmentationTask, Integer> entry : this.tasksStatesMap.entrySet()) {
            Integer value = entry.getValue();
            if (!(value.intValue() == 4 || value.intValue() == 5)) {
                return false;
            }
        }
        this.endTimeStamp = System.currentTimeMillis();
        commitMetrics();
        return true;
    }

    public synchronized boolean isMultipathAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dab3460", new Object[]{this})).booleanValue();
        }
        return this.isMultipathEnabled;
    }

    public synchronized boolean isResponded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbd8fd75", new Object[]{this})).booleanValue();
        }
        for (Map.Entry<FragmentationTask, Integer> entry : this.tasksStatesMap.entrySet()) {
            Integer value = entry.getValue();
            if (value.intValue() >= 2 && value.intValue() <= 4) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        Iterator<FragmentationTask> it = this.tasksList.iterator();
        while (it.hasNext()) {
            if (it.next().getState() != 4) {
                return false;
            }
        }
        return true;
    }

    public synchronized void runAllTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3c94c2", new Object[]{this});
            return;
        }
        this.startTimeStamp = System.currentTimeMillis();
        ALog.e(TAG, "[fragmentation] the aggregator run all tasks ", this.rc.seqNum, new Object[0]);
        HttpUrl httpUrl = this.rc.config.getHttpUrl();
        boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        if (NetworkConfigCenter.isSpdyEnabled() && !containsNonDefaultPort) {
            SessionCenter sessionCenter = RequestConfig.getSessionCenter(this.rc.config);
            HttpUrl httpUrl2 = this.rc.config.getHttpUrl();
            if (!(sessionCenter == null || httpUrl2 == null)) {
                ArrayList<FragmentationTask> arrayList = new ArrayList<>();
                ArrayList<FragmentationTask> arrayList2 = new ArrayList<>();
                Iterator<FragmentationTask> it = this.tasksList.iterator();
                while (it.hasNext()) {
                    FragmentationTask next = it.next();
                    if (next.isMultipath()) {
                        arrayList2.add(next);
                        this.isMultipathEnabled = true;
                    } else {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 0) {
                    sendFragmentTaskQueue(httpUrl, arrayList, false, sessionCenter);
                }
                if (arrayList2.size() > 0) {
                    FragmentParentStatistic fragmentParentStatistic = this.fps;
                    fragmentParentStatistic.multipathPlaned = true;
                    fragmentParentStatistic.multipathPlanedCount = arrayList2.size();
                    sendFragmentTaskQueue(httpUrl, arrayList2, true, sessionCenter);
                }
                return;
            }
            ALog.e(TAG, "[fragmentation] the aggregator run all tasks with SHORT_LINK with NULL session-center/url ", this.rc.seqNum, new Object[0]);
            sendQueueShortLink(this.tasksList, false, 0);
            return;
        }
        ALog.e(TAG, "[fragmentation] the aggregator run all tasks with SHORT_LINK with abnormal ", this.rc.seqNum, new Object[0]);
        sendQueueShortLink(this.tasksList, false, 0);
    }

    public synchronized void updateTaskState(FragmentationTask fragmentationTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd77ca9", new Object[]{this, fragmentationTask, new Integer(i)});
            return;
        }
        if (fragmentationTask != null) {
            this.tasksStatesMap.put(fragmentationTask, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.Session getHttpSession() {
        /*
            r11 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "anet.FragmentationAggregator"
            com.android.alibaba.ip.runtime.IpChange r4 = anetwork.channel.unified.FragmentationAggregator.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "a82c830f"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            java.lang.Object r0 = r4.ipc$dispatch(r0, r2)
            anet.channel.Session r0 = (anet.channel.Session) r0
            return r0
        L_0x0018:
            anetwork.channel.unified.RequestContext r4 = r11.rc
            anetwork.channel.entity.RequestConfig r4 = r4.config
            anet.channel.util.HttpUrl r4 = r4.getHttpUrl()
            r5 = 0
            anet.channel.Config$Builder r6 = new anet.channel.Config$Builder     // Catch: Exception -> 0x0059
            r6.<init>()     // Catch: Exception -> 0x0059
            java.lang.String r7 = anet.channel.GlobalAppRuntimeInfo.getAppkey()     // Catch: Exception -> 0x0059
            anet.channel.Config$Builder r6 = r6.setAppkey(r7)     // Catch: Exception -> 0x0059
            anet.channel.entity.ENV r7 = anet.channel.entity.ENV.ONLINE     // Catch: Exception -> 0x0059
            anet.channel.Config$Builder r6 = r6.setEnv(r7)     // Catch: Exception -> 0x0059
            anet.channel.Config r6 = r6.build()     // Catch: Exception -> 0x0059
            anet.channel.SessionCenter r6 = anet.channel.SessionCenter.getInstance(r6)     // Catch: Exception -> 0x0059
            int r7 = anet.channel.entity.SessionType.SHORT_LINK     // Catch: Exception -> 0x0059
            r8 = 0
            anet.channel.Session r6 = r6.get(r4, r7, r8)     // Catch: Exception -> 0x0059
            java.lang.String r7 = "[fragmentation] task,  getHttpSession SHORT_LINK 1"
            anetwork.channel.unified.RequestContext r8 = r11.rc     // Catch: Exception -> 0x0057
            java.lang.String r8 = r8.seqNum     // Catch: Exception -> 0x0057
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: Exception -> 0x0057
            java.lang.String r10 = "session"
            r9[r1] = r10     // Catch: Exception -> 0x0057
            r9[r2] = r6     // Catch: Exception -> 0x0057
            anet.channel.util.ALog.e(r3, r7, r8, r9)     // Catch: Exception -> 0x0057
            goto L_0x0076
        L_0x0057:
            r7 = move-exception
            goto L_0x005b
        L_0x0059:
            r7 = move-exception
            r6 = r5
        L_0x005b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "[fragmentation] task,  getHttpSession fail ="
            r8.<init>(r9)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            anetwork.channel.unified.RequestContext r8 = r11.rc
            java.lang.String r8 = r8.seqNum
            java.lang.Object[] r9 = new java.lang.Object[r1]
            anet.channel.util.ALog.e(r3, r7, r8, r9)
        L_0x0076:
            if (r6 != 0) goto L_0x00c5
            java.lang.String r6 = r4.scheme()
            java.lang.String r7 = "://"
            java.lang.String r4 = r4.host()
            java.lang.String r4 = anet.channel.util.StringUtils.concatString(r6, r7, r4)
            anet.channel.entity.ConnInfo r6 = new anet.channel.entity.ConnInfo
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            anetwork.channel.unified.RequestContext r8 = r11.rc
            java.lang.String r8 = r8.seqNum
            r7.append(r8)
            java.lang.String r8 = "_mc"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r4, r7, r5)
            anet.channel.session.HttpSession r4 = new anet.channel.session.HttpSession
            android.content.Context r5 = anet.channel.GlobalAppRuntimeInfo.getContext()
            r4.<init>(r5, r6)
            boolean r5 = anet.channel.session.okhttp.OkHttpConnector.checkEnvAvailable()
            if (r5 == 0) goto L_0x00b2
            r4.setUseOkhttp(r2)
        L_0x00b2:
            anetwork.channel.unified.RequestContext r5 = r11.rc
            java.lang.String r5 = r5.seqNum
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = "hs_session"
            r0[r1] = r6
            r0[r2] = r4
            java.lang.String r1 = "[fragmentation] task,  getHttpSession SHORT_LINK 2"
            anet.channel.util.ALog.e(r3, r1, r5, r0)
            r6 = r4
        L_0x00c5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.FragmentationAggregator.getHttpSession():anet.channel.Session");
    }
}
