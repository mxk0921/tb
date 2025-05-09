package anetwork.channel.unified;

import anet.channel.session.dns.NavigationHelper;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.monitor.NetworkQoSCenter;
import anetwork.channel.unified.DownloadResourcePriorityConf;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class QosTaskQueue implements NavigationHelper.IBlockingResourceListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HOLD_ON_TIME = 500;
    private static final int MAX_CONCURRENT_NONBLOCK_COUNT = 3;
    private static final String TAG = "RemoteFeatureQoS";
    private static QosTaskQueue instance = new QosTaskQueue();
    private static int currentScene = 0;
    private static int blockingResourceScene = 0;
    private ConcurrentLinkedQueue<RequestContext> goldQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<RequestContext> sliverQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<RequestContext> copperQueue = new ConcurrentLinkedQueue<>();
    private AtomicInteger goldTaskCount = new AtomicInteger(0);
    private AtomicInteger sliverTaskCount = new AtomicInteger(0);
    private AtomicInteger copperTaskCount = new AtomicInteger(0);
    private AtomicInteger blockingTaskCount = new AtomicInteger(0);
    private ArrayList<RequestContext> holdingOnMessageTasks = new ArrayList<>();

    static {
        t2o.a(607126142);
        t2o.a(607125737);
    }

    public static /* synthetic */ ArrayList access$000(QosTaskQueue qosTaskQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2214c322", new Object[]{qosTaskQueue});
        }
        return qosTaskQueue.holdingOnMessageTasks;
    }

    public static /* synthetic */ QosTaskQueue access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QosTaskQueue) ipChange.ipc$dispatch("6dd60987", new Object[0]);
        }
        return instance;
    }

    private synchronized void decrementTaskCount(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2c7f10", new Object[]{this, requestConfig});
            return;
        }
        int i = requestConfig.bandwidthLevel;
        if (i == 0) {
            if (this.goldTaskCount.get() > 0) {
                this.goldTaskCount.decrementAndGet();
            }
        } else if (i == 1) {
            if (this.sliverTaskCount.get() > 0) {
                this.sliverTaskCount.decrementAndGet();
            }
        } else if (i == 2 && this.copperTaskCount.get() > 0) {
            this.copperTaskCount.decrementAndGet();
        }
        if (requestConfig.isBlockingResource && this.blockingTaskCount.get() > 0) {
            this.blockingTaskCount.decrementAndGet();
        }
    }

    public static QosTaskQueue getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QosTaskQueue) ipChange.ipc$dispatch("af988c61", new Object[0]);
        }
        return instance;
    }

    private void holdOnMessageTasks(final RequestContext requestContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffdfbea", new Object[]{this, requestContext});
            return;
        }
        requestContext.isHoldOnDone = true;
        synchronized (this.holdingOnMessageTasks) {
            this.holdingOnMessageTasks.add(requestContext);
        }
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.unified.QosTaskQueue.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                RequestContext requestContext2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (QosTaskQueue.access$000(QosTaskQueue.this)) {
                    try {
                        if (QosTaskQueue.access$000(QosTaskQueue.this).contains(requestContext)) {
                            QosTaskQueue.access$000(QosTaskQueue.this).remove(requestContext);
                            requestContext2 = requestContext;
                        } else {
                            requestContext2 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (requestContext2 != null) {
                    ALog.e(QosTaskQueue.TAG, "re-offer hold-on task [" + requestContext.seqNum + "]", requestContext.seqNum, new Object[0]);
                    QosTaskQueue.access$100().offerRequest(requestContext);
                }
            }
        }, 500L, TimeUnit.MILLISECONDS);
    }

    public static void startFragmentsTasks(RequestContext requestContext, ArrayList<NetworkQoSCenter.FragmentationRecommender.Fragment> arrayList) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb33d648", new Object[]{requestContext, arrayList});
            return;
        }
        ALog.e(TAG, "[fragmentation] start fragmentation concurrency tasks", requestContext.seqNum, new Object[0]);
        FragmentationAggregator fragmentationAggregator = new FragmentationAggregator(requestContext);
        requestContext.fragmentationAggregator = fragmentationAggregator;
        if (!NetworkStatusHelper.getStatus().isMobile()) {
            i = 2;
        }
        try {
            fragmentationAggregator.initStatisticInfo(requestContext.config.getAwcnRequest().getHost(), requestContext.config.getUrlString(), i, requestContext.config.getFileLength(), requestContext.config.isRange());
        } catch (Exception e) {
            RequestStatistic requestStatistic = requestContext.config.rs;
            requestStatistic.msg = "[fragmentation] init aggregator statistic error, exception:[" + e + "]";
            ALog.e(TAG, requestContext.config.rs.msg, requestContext.seqNum, new Object[0]);
        }
        Iterator<NetworkQoSCenter.FragmentationRecommender.Fragment> it = arrayList.iterator();
        while (it.hasNext()) {
            fragmentationAggregator.addTask(new FragmentationTask(requestContext, it.next(), i));
        }
        fragmentationAggregator.runAllTask();
    }

    private void sendingQueuedTask(RequestContext requestContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c8a5d", new Object[]{this, requestContext});
            return;
        }
        ALog.e(TAG, "sending queued task...", requestContext.seqNum, new Object[0]);
        pollQueuingGoldTask(requestContext.seqNum, false);
        if (this.goldTaskCount.get() == 0) {
            pollQueuingSliverTask(requestContext.seqNum, false);
            pollQueuingCopperTask(requestContext.seqNum, false);
        }
        int i = this.goldTaskCount.get();
        int i2 = this.sliverTaskCount.get();
        int i3 = this.copperTaskCount.get();
        int size = this.goldQueue.size();
        int size2 = this.sliverQueue.size();
        int size3 = this.copperQueue.size();
        ALog.e(TAG, "after sending request, running-task: " + i + "/" + i2 + "/" + i3 + ", queue-task: " + size + "/" + size2 + "/" + size3, requestContext.seqNum, new Object[0]);
    }

    private void pollQueuingCopperTask(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b56e356", new Object[]{this, str, new Boolean(z)});
            return;
        }
        while (this.copperQueue.size() > 0 && this.goldTaskCount.get() + this.sliverTaskCount.get() + this.copperTaskCount.get() < 3) {
            RequestContext poll = this.copperQueue.poll();
            if (poll != null) {
                this.copperTaskCount.incrementAndGet();
                ALog.e(TAG, "peek a queued COPPER task[" + poll.seqNum + "]", str, new Object[0]);
                sendingRequest(poll, z, false);
            }
        }
    }

    private void pollQueuingGoldTask(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6127ef", new Object[]{this, str, new Boolean(z)});
            return;
        }
        while (this.goldQueue.size() > 0 && this.goldTaskCount.get() < 3) {
            RequestContext poll = this.goldQueue.poll();
            if (poll != null) {
                this.goldTaskCount.incrementAndGet();
                ALog.e(TAG, "peek a queued GOLD task[" + poll.seqNum + "]", str, new Object[0]);
                sendingRequest(poll, z, false);
            }
        }
    }

    private void pollQueuingSliverTask(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f06fbc", new Object[]{this, str, new Boolean(z)});
            return;
        }
        while (this.sliverQueue.size() > 0 && this.goldTaskCount.get() + this.sliverTaskCount.get() < 3) {
            RequestContext poll = this.sliverQueue.poll();
            if (poll != null) {
                this.sliverTaskCount.incrementAndGet();
                ALog.e(TAG, "peek a queued SLIVER task[" + poll.seqNum + "]", str, new Object[0]);
                sendingRequest(poll, z, false);
            }
        }
    }

    private void triggerQueuingBlockingResources(ConcurrentLinkedQueue<RequestContext> concurrentLinkedQueue, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4bbe7c", new Object[]{this, concurrentLinkedQueue, atomicInteger, atomicInteger2, new Integer(i)});
            return;
        }
        Iterator<RequestContext> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            RequestContext next = it.next();
            RequestConfig requestConfig = next.config;
            if (requestConfig != null && requestConfig.resourceScene == i) {
                it.remove();
                ALog.e(TAG, "onBlockingScene(" + i + ") found blocking resource", next.seqNum, new Object[0]);
                atomicInteger.incrementAndGet();
                atomicInteger2.incrementAndGet();
                sendingRequest(next, false, true);
            }
        }
    }

    public synchronized void offerRequest(RequestContext requestContext) {
        RequestConfig requestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebb7fc", new Object[]{this, requestContext});
            return;
        }
        if (!(requestContext == null || (requestConfig = requestContext.config) == null)) {
            int i = requestConfig.resourceScene;
            int i2 = currentScene;
            if (i == i2 && i2 != 0) {
                int i3 = requestConfig.bandwidthLevel;
                if (i3 == 0) {
                    this.goldTaskCount.incrementAndGet();
                    ALog.e(TAG, "sending GOLD task with block scene=" + currentScene, requestContext.seqNum, new Object[0]);
                } else if (i3 == 1) {
                    this.sliverTaskCount.incrementAndGet();
                    ALog.e(TAG, "sending SLIVER task with block scene=" + currentScene, requestContext.seqNum, new Object[0]);
                } else {
                    this.copperTaskCount.incrementAndGet();
                    ALog.e(TAG, "sending COPPER task with block scene=" + currentScene, requestContext.seqNum, new Object[0]);
                }
                this.blockingTaskCount.incrementAndGet();
                requestContext.config.isBlockingResource = true;
                blockingResourceScene = currentScene;
                sendingRequest(requestContext, false, true);
            } else if (i != 1 || requestContext.isHoldOnDone) {
                int i4 = requestContext.config.bandwidthLevel;
                if (i4 == 0) {
                    this.goldQueue.add(requestContext);
                    ALog.e(TAG, "offering GOLD task with scene=" + currentScene, requestContext.seqNum, new Object[0]);
                } else if (i4 == 1) {
                    this.sliverQueue.add(requestContext);
                    ALog.e(TAG, "offering SLIVER task with scene=" + currentScene, requestContext.seqNum, new Object[0]);
                } else {
                    this.copperQueue.add(requestContext);
                    ALog.e(TAG, "offering COPPER task with scene=" + currentScene, requestContext.seqNum, new Object[0]);
                }
                if (this.blockingTaskCount.get() == 0) {
                    sendingQueuedTask(requestContext);
                } else {
                    ALog.e(TAG, "there is blocking task [count=" + this.blockingTaskCount.get() + "] running...", requestContext.seqNum, new Object[0]);
                }
            } else {
                ALog.e(TAG, "hold on this MESSAGE task", requestContext.seqNum, new Object[0]);
                holdOnMessageTasks(requestContext);
            }
        }
    }

    @Override // anet.channel.session.dns.NavigationHelper.IBlockingResourceListener
    public synchronized void onBlockingScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738ad8a4", new Object[]{this, new Integer(i)});
            return;
        }
        currentScene = i;
        if (i == 1) {
            synchronized (this.holdingOnMessageTasks) {
                if (!this.holdingOnMessageTasks.isEmpty()) {
                    ALog.e(TAG, "move MESSAGE task from holding-on state to SLIVER queue urgently", "scene-changed", new Object[0]);
                    this.sliverQueue.addAll(this.holdingOnMessageTasks);
                    this.holdingOnMessageTasks.clear();
                }
            }
        }
        if (i != 0) {
            triggerQueuingBlockingResources(this.goldQueue, this.goldTaskCount, this.blockingTaskCount, i);
            triggerQueuingBlockingResources(this.sliverQueue, this.sliverTaskCount, this.blockingTaskCount, i);
        }
        if (this.blockingTaskCount.get() == 0 || this.goldTaskCount.get() + this.sliverTaskCount.get() + this.copperTaskCount.get() < 3) {
            pollQueuingGoldTask("scene-changed", false);
            if (this.goldTaskCount.get() == 0) {
                pollQueuingSliverTask("scene-changed", false);
                pollQueuingCopperTask("scene-changed", false);
            }
        }
    }

    public void pollQueuingTask(RequestContext requestContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957c773b", new Object[]{this, requestContext});
        } else if (requestContext != null && requestContext.config != null) {
            ALog.e(TAG, "polling queued task...", requestContext.seqNum, new Object[0]);
            RequestConfig requestConfig = requestContext.config;
            DownloadResourcePriorityConf.DynamicResource dynamicResource = requestConfig.vipDynamicResource;
            if (dynamicResource != null) {
                dynamicResource.isDownloadCompleted = true;
            }
            decrementTaskCount(requestConfig);
            if (this.blockingTaskCount.get() <= 0 || blockingResourceScene != currentScene) {
                pollQueuingGoldTask(requestContext.seqNum, true);
                if (this.goldTaskCount.get() == 0) {
                    pollQueuingSliverTask(requestContext.seqNum, true);
                    pollQueuingCopperTask(requestContext.seqNum, true);
                }
                int i = this.goldTaskCount.get();
                int i2 = this.sliverTaskCount.get();
                int i3 = this.copperTaskCount.get();
                int size = this.goldQueue.size();
                int size2 = this.sliverQueue.size();
                int size3 = this.copperQueue.size();
                ALog.e(TAG, "after polling request, running-task: " + i + "/" + i2 + "/" + i3 + ", queue-task: " + size + "/" + size2 + "/" + size3, requestContext.seqNum, new Object[0]);
                return;
            }
            ALog.e(TAG, "there is still blocking task running: count=" + this.blockingTaskCount.get() + ", scene=" + currentScene, requestContext.seqNum, new Object[0]);
        }
    }

    private void sendingRequest(RequestContext requestContext, boolean z, boolean z2) {
        RequestConfig requestConfig;
        NetworkTask networkTask;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bfb9fa", new Object[]{this, requestContext, new Boolean(z), new Boolean(z2)});
        } else if (requestContext != null && (requestConfig = requestContext.config) != null) {
            if (!z2) {
                boolean z3 = requestConfig.isRemoteCriticalPlan;
                int i = requestConfig.bandwidthLevel;
                if (i == 1) {
                    if (!DownloadResourcePriorityConf.isDownloadCompleted(0, z3)) {
                        ALog.e(TAG, "the GOLD task is not completed, set SLIVER task recv rate limitation", requestContext.seqNum, new Object[0]);
                        requestContext.config.setRecvRateBpsLimitation(false, (int) ((z3 ? 0.30000001192092896d : 0.6000000238418579d) * 5242880.0d));
                    } else if (z3) {
                        requestContext.config.setRecvRateBpsLimitation(false, 1572864);
                    } else {
                        ALog.e(TAG, "the GOLD task is completed, don't set SLIVER task recv rate limitation", requestContext.seqNum, new Object[0]);
                    }
                } else if (i == 2) {
                    if (!DownloadResourcePriorityConf.isDownloadCompleted(0, z3) && !DownloadResourcePriorityConf.isDownloadCompleted(1, z3)) {
                        ALog.e(TAG, "the GOLD/SLIVER task is not completed, set COPPER task recv rate limitation", requestContext.seqNum, new Object[0]);
                        requestContext.config.setRecvRateBpsLimitation(false, (int) ((z3 ? 0.10000000149011612d : 0.15000000596046448d) * 5242880.0d));
                    } else if (z3) {
                        requestContext.config.setRecvRateBpsLimitation(false, 524288);
                    } else {
                        ALog.e(TAG, "the GOLD/SLIVER task is completed, don't set COPPER task recv rate limitation", requestContext.seqNum, new Object[0]);
                    }
                }
            }
            RequestConfig requestConfig2 = requestContext.config;
            if (requestConfig2.bandwidthLevel != 0 || !requestConfig2.isBizRangeEnable()) {
                networkTask = null;
            } else {
                ArrayList<NetworkQoSCenter.FragmentationRecommender.Fragment> fragmentationControl = requestContext.config.getFragmentationControl();
                if (fragmentationControl == null || fragmentationControl.size() <= 0) {
                    networkTask = new NetworkTask(requestContext, null, null);
                } else {
                    requestContext.config.rs.fragmented = true;
                    ALog.e(TAG, "sending with fragmentation...", requestContext.seqNum, new Object[0]);
                    startFragmentsTasks(requestContext, fragmentationControl);
                    return;
                }
            }
            if (networkTask == null) {
                networkTask = new NetworkTask(requestContext, null, null);
                requestContext.runningTask = networkTask;
                if (OkHttpConnector.checkEnvAvailable()) {
                    networkTask.isForceOkHttpEnabled = true;
                }
            }
            ALog.e(TAG, "sending request.... [mt=" + requestContext.config.getMaxRetryTime() + "]", requestContext.seqNum, new Object[0]);
            if (z) {
                ThreadPoolExecutorFactory.submitBackupTask(networkTask);
            } else {
                networkTask.run();
            }
        }
    }
}
