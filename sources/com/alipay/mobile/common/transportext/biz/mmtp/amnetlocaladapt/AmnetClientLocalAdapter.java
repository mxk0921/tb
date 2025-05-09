package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import android.os.SystemClock;
import anet.channel.Constants;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.amnet.service.AmnetServiceOperationHelper;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.appevent.AppEventManager;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetClientLocalAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AmnetClientLocalAdapter c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4197a = false;
    public long b = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ActAmnetResult implements AmnetResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final CountDownLatch countDownLatch;

        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
        public void notifyResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z)});
                return;
            }
            try {
                this.countDownLatch.countDown();
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetClientLocalAdapter", "[ActAmnetResult] CountDown exception: " + th.toString());
            }
            LogCatUtil.info("AmnetClientLocalAdapter", "[ActAmnetResult] Activate amnet result = " + z);
        }

        public ActAmnetResult(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ShutdownAmnetResult implements AmnetResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final CountDownLatch countDownLatch;

        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
        public void notifyResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z)});
                return;
            }
            try {
                CountDownLatch countDownLatch = this.countDownLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetClientLocalAdapter", "[ShutdownAmnetResult] CountDown exception: " + th.toString());
            }
            LogCatUtil.info("AmnetClientLocalAdapter", "[ShutdownAmnetResult] Shutdown amnet result = " + z);
        }

        public ShutdownAmnetResult(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
    }

    public AmnetClientLocalAdapter() {
        init();
    }

    public static final AmnetClientLocalAdapter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetClientLocalAdapter) ipChange.ipc$dispatch("38199e48", new Object[0]);
        }
        AmnetClientLocalAdapter amnetClientLocalAdapter = c;
        if (amnetClientLocalAdapter != null) {
            return amnetClientLocalAdapter;
        }
        synchronized (AmnetClientLocalAdapter.class) {
            try {
                if (c == null) {
                    c = new AmnetClientLocalAdapter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
            b();
        }
    }

    public final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AmnetHelper.getAmnetManager().activateAmnet(new ActAmnetResult(countDownLatch));
            countDownLatch.await();
            LogCatUtil.info("AmnetClientLocalAdapter", "[checkActivated] checkActivated.  cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public synchronized void forceShutdownAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ca497", new Object[]{this});
        } else {
            AmnetHelper.getAmnetManager().shutdownAmnet(new ShutdownAmnetResult(null));
        }
    }

    public long getLastPostTimeMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25742f3a", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f4197a) {
            synchronized (this) {
                try {
                    if (!this.f4197a) {
                        AmnetHelper.initMmtp();
                        AppEventManager.register(AmnetLocalAppEventListener.getInstance());
                        AmnetHelper.getAmnetManager().addSetActivatingParamsListener(AmnetLocalSetActivatingParamsListener.getInstance());
                        this.f4197a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean isCanShutdown() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25077d47", new Object[]{this})).booleanValue();
        }
        if (this.b <= 0) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.b;
        if (j >= Constants.MAX_SESSION_IDLE_TIME) {
            z = true;
        }
        LogCatUtil.info("AmnetClientLocalAdapter", "[isCanShutdown] curTimeMs = " + elapsedRealtime + ", lastPostTimeMs = " + this.b + ", postTimeInterval = " + j + ", result = " + z);
        return z;
    }

    public void notifyResultFeedback(ResultFeedback resultFeedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c4f226", new Object[]{this, resultFeedback});
            return;
        }
        try {
            if (AmnetHelper.getAmnetManager().isActivated()) {
                AmnetHelper.getAmnetManager().notifyResultFeedback(resultFeedback);
                LogCatUtil.info("AmnetClientLocalAdapter", "[notifyResultFeedback] finished.");
            }
        } catch (Exception e) {
            LogCatUtil.error("AmnetClientLocalAdapter", "notifyResultFeedback exception: " + e.toString(), e);
        }
    }

    public synchronized void post(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad854cc", new Object[]{this, amnetPost});
            return;
        }
        try {
            this.b = SystemClock.elapsedRealtime();
            AmnetLocalAliveManager.getInstance().startTimerCheck();
            a();
            AmnetHelper.getAmnetManager().post(amnetPost);
            LogCatUtil.info("AmnetClientLocalAdapter", "[post] finished.");
        } catch (MMTPException e) {
            throw e;
        } catch (Exception e2) {
            LogCatUtil.error("AmnetClientLocalAdapter", e2);
        }
    }

    public void preConnect(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42135da", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        try {
            if (TransportStrategy.isNetworkRunInSingleProcess(ExtTransportEnv.getAppContext())) {
                this.b = SystemClock.elapsedRealtime();
                a();
                LogCatUtil.debug("AmnetClientLocalAdapter", "start pre connect host= " + str);
                AmnetServiceOperationHelper.preConnect(str, i, z, i2);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetClientLocalAdapter", "preConnect ex=" + th.toString());
        }
    }

    public synchronized boolean shutdownAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("466a1c46", new Object[]{this})).booleanValue();
        } else if (!isCanShutdown()) {
            LogCatUtil.info("AmnetClientLocalAdapter", "[shutdownAmnet] Can't shutdown.");
            return false;
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
            return true;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AmnetHelper.getAmnetManager().shutdownAmnet(new ShutdownAmnetResult(countDownLatch));
            countDownLatch.await();
            LogCatUtil.info("AmnetClientLocalAdapter", "[shutdownAmnet] shutdown amnet.  cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            return true;
        }
    }
}
