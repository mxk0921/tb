package anet.channel.status;

import anet.channel.AwcnConfig;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.entity.SessionType;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkFullLowLatency {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.NetworkFullLowLatency";
    public static Random random = new Random();
    public static final String[] PING_HOST = {"heic.alicdn.com", "gw.alicdn.com"};
    public static volatile AtomicBoolean isPinging = new AtomicBoolean(false);
    public static volatile AtomicLong pingReqCount = new AtomicLong(0);
    public static volatile AtomicLong pingingCount = new AtomicLong(0);
    private static volatile ScheduledFuture<?> future = null;
    public static ScheduledThreadPoolExecutor scheduledPingExecutor = null;

    static {
        t2o.a(607125812);
    }

    public static /* synthetic */ void access$000(String str, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b3ebd9", new Object[]{str, session});
        } else {
            doTask(str, session);
        }
    }

    private static void doTask(final String str, final Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78f4999", new Object[]{str, session});
            return;
        }
        if (scheduledPingExecutor == null) {
            ThreadPoolExecutorFactory.initScheduledPingExecutor();
        }
        future = scheduledPingExecutor.scheduleAtFixedRate(new Runnable() { // from class: anet.channel.status.NetworkFullLowLatency.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkFullLowLatency.pingingCount.incrementAndGet();
                ALog.e(NetworkFullLowLatency.TAG, "[low latency] [dueToNetFullLowLatency] ping session=" + Session.this.mSeq, str, "pingReqCount", Long.valueOf(NetworkFullLowLatency.pingReqCount.get()), "pingingCount", Long.valueOf(NetworkFullLowLatency.pingingCount.get()));
                Session.this.ping(true, 1000);
            }
        }, 0L, AwcnConfig.getPingTime(), TimeUnit.MILLISECONDS);
    }

    public static synchronized void dueToNetFullLowLatency(RequestStatistic requestStatistic, String str, final SessionCenter sessionCenter, final String str2) {
        synchronized (NetworkFullLowLatency.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86d52ad1", new Object[]{requestStatistic, str, sessionCenter, str2});
            } else {
                ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anet.channel.status.NetworkFullLowLatency.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        NetworkFullLowLatency.pingReqCount.incrementAndGet();
                        ALog.e(NetworkFullLowLatency.TAG, "[low latency] [dueToNetFullLowLatency] ping req ++!!", str2, "pingReqCount", Long.valueOf(NetworkFullLowLatency.pingReqCount.get()));
                        if (NetworkFullLowLatency.isPinging.get()) {
                            ALog.e(NetworkFullLowLatency.TAG, "[low latency] [dueToNetFullLowLatency] ping already start!!", str2, "pingReqCount", Long.valueOf(NetworkFullLowLatency.pingReqCount.get()));
                            return;
                        }
                        ALog.e(NetworkFullLowLatency.TAG, "[low latency] [dueToNetFullLowLatency] ping start!!", str2, "pingReqCount", Long.valueOf(NetworkFullLowLatency.pingReqCount.get()));
                        NetworkFullLowLatency.isPinging.set(true);
                        if (sessionCenter == null) {
                            NetworkFullLowLatency.isPinging.set(false);
                            ALog.e(NetworkFullLowLatency.TAG, "[low latency] [dueToNetFullLowLatency] sessionCenter instance is null!!", str2, "pingReqCount", Long.valueOf(NetworkFullLowLatency.pingReqCount.get()));
                            return;
                        }
                        for (String str3 : NetworkFullLowLatency.PING_HOST) {
                            Session sessionBySessionPool = sessionCenter.getSessionBySessionPool(str3, SessionType.LONG_LINK);
                            if (sessionBySessionPool != null) {
                                NetworkFullLowLatency.access$000(str2, sessionBySessionPool);
                                return;
                            }
                        }
                        String[] strArr = NetworkFullLowLatency.PING_HOST;
                        final String buildKey = StringUtils.buildKey("https", strArr[NetworkFullLowLatency.random.nextInt(strArr.length)]);
                        sessionCenter.asyncGet(HttpUrl.parse(buildKey), SessionType.LONG_LINK, 3000L, new SessionGetCallback() { // from class: anet.channel.status.NetworkFullLowLatency.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // anet.channel.SessionGetCallback
                            public void onSessionGetFail() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("735355e4", new Object[]{this});
                                    return;
                                }
                                NetworkFullLowLatency.isPinging.set(false);
                                ALog.e(NetworkFullLowLatency.TAG, "[low latency] onSessionGetFail! ", str2, "url", buildKey);
                            }

                            @Override // anet.channel.SessionGetCallback
                            public void onSessionGetSuccess(Session session) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6d473443", new Object[]{this, session});
                                    return;
                                }
                                ALog.e(NetworkFullLowLatency.TAG, "[low latency] onSessionGetSuccess！", str2, "newSession", session.mSeq, "pingReqCount", Long.valueOf(NetworkFullLowLatency.pingReqCount.get()), "url", buildKey);
                                if (NetworkFullLowLatency.pingReqCount.get() > 0) {
                                    NetworkFullLowLatency.access$000(str2, session);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean isNetFullLowLatencyEnable(RequestStatistic requestStatistic, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ce79aa", new Object[]{requestStatistic, str, str2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (AwcnConfig.isAllowNetFullLowLatencyEnable() && AwcnConfig.isUrlInLowLatencyWhiteList(str)) {
                if (!str.startsWith("h5.m.taobao.com/taolive/video") && !str.contains("BizName=taobaolive") && !str.contains("bizType=taolive")) {
                    String simOp = NetworkStatusHelper.getSimOp();
                    if (AwcnConfig.isMncBlack(str2, simOp)) {
                        updateStatistic(requestStatistic, str2, currentTimeMillis, DispatchConstants.MNC, simOp);
                        return false;
                    }
                    updateStatistic(requestStatistic, str2, currentTimeMillis, "ping", simOp);
                    return true;
                }
                updateStatistic(requestStatistic, str2, currentTimeMillis, "live", str);
                return false;
            }
            if (AwcnConfig.isAllowNetFullLowLatencyEnable()) {
                str3 = "true ";
            } else {
                str3 = "false";
            }
            updateStatistic(requestStatistic, str2, currentTimeMillis, "nowhite", "isNetFullLowLatencyEnable = ".concat(str3));
            return false;
        } catch (Throwable th) {
            updateStatistic(requestStatistic, str2, currentTimeMillis, "error", th.toString());
            return false;
        }
    }

    public static synchronized void finishTask(boolean z, String str) {
        synchronized (NetworkFullLowLatency.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5933d3ff", new Object[]{new Boolean(z), str});
                return;
            }
            if (z) {
                pingReqCount.decrementAndGet();
                ALog.e(TAG, "[low latency] [finishTask] ping req --!!", str, "pingReqCount", Long.valueOf(pingReqCount.get()), "pingingCount", Long.valueOf(pingingCount.get()));
            }
            if (pingReqCount.get() == 0 || pingingCount.get() == 1000) {
                if (isPinging.get()) {
                    isPinging.set(false);
                    ALog.e(TAG, "[low latency] [finishTask] isPinging reset!!", str, "pingReqCount", Long.valueOf(pingReqCount.get()), "pingingCount", Long.valueOf(pingingCount.get()));
                }
                if (!(scheduledPingExecutor == null || future == null)) {
                    future.cancel(true);
                    scheduledPingExecutor.shutdown();
                    scheduledPingExecutor = null;
                    future = null;
                    pingingCount.set(0L);
                    ALog.e(TAG, "[low latency] [finishTask] ping end!! ", str, "pingReqCount", Long.valueOf(pingReqCount.get()), "pingingCount", Long.valueOf(pingingCount.get()));
                }
            }
        }
    }

    private static void updateStatistic(RequestStatistic requestStatistic, String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3ea74", new Object[]{requestStatistic, str, new Long(j), str2, str3});
            return;
        }
        requestStatistic.lowLatencyType = str2;
        requestStatistic.lowLatencyTime = System.currentTimeMillis() - j;
        ALog.e(TAG, "[low latency] [isNetFullLowLatencyEnable] lowLatencyType=" + str2, str, "lowLatencyTime", Long.valueOf(requestStatistic.lowLatencyTime), "msg", str3);
    }
}
