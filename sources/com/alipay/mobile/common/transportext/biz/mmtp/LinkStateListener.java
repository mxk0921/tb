package com.alipay.mobile.common.transportext.biz.mmtp;

import com.alipay.mobile.common.transport.monitor.SignalStateHelper;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LinkStateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long changeInterval = 3600000;
    public static LinkStateListener i;
    public ScheduledFuture<?> b;
    public final int c = 1;
    public final int d = 2;
    public final int f = 15;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4191a = false;
    public int e = 1;
    public int g = 0;
    public long h = System.currentTimeMillis();

    public static /* synthetic */ void access$000(LinkStateListener linkStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fd6b09", new Object[]{linkStateListener});
        } else {
            linkStateListener.b();
        }
    }

    public static LinkStateListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkStateListener) ipChange.ipc$dispatch("86ee9156", new Object[0]);
        }
        LinkStateListener linkStateListener = i;
        if (linkStateListener != null) {
            return linkStateListener;
        }
        synchronized (LinkStateListener.class) {
            try {
                if (i == null) {
                    i = new LinkStateListener();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public void change(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i2)});
            return;
        }
        LogCatUtil.debug("LinkStateListener", "--change-->state = " + i2);
        if (i2 != 4 && MiscUtils.isAtFrontDesk(ExtTransportEnv.getAppContext())) {
            a();
        }
    }

    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
            return;
        }
        LogCatUtil.debug("LinkStateListener", "--notifyInitOk--");
        this.f4191a = true;
        ScheduledFuture<?> scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = this.c;
            LogCatUtil.debug("LinkStateListener", "--cancle diagnose task--");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f4191a = false;
        synchronized (this) {
            try {
                int i2 = this.e;
                int i3 = this.d;
                if (i2 == i3) {
                    LogCatUtil.debug("LinkStateListener", "schedule task is busy...");
                    return;
                }
                this.e = i3;
                LogCatUtil.debug("LinkStateListener", "schedule task start...");
                this.b = NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.LinkStateListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            LinkStateListener.access$000(LinkStateListener.this);
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.f4191a) {
            LogCatUtil.debug("LinkStateListener", "initOk,no need to diagnose");
            ScheduledFuture<?> scheduledFuture = this.b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                LogCatUtil.debug("LinkStateListener", "--cancle diagnose task--");
            }
            this.e = this.c;
            return;
        }
        try {
            if (this.g > this.f) {
                if (this.h + 3600000 < System.currentTimeMillis()) {
                    this.g = 0;
                    this.h = System.currentTimeMillis();
                } else {
                    LogCatUtil.debug("LinkStateListener", "diagnoseNum is out " + this.f);
                    return;
                }
            }
            LogCatUtil.debug("LinkStateListener", "init has not success,start diagnose");
            NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.LinkStateListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SignalStateHelper.getInstance().reportNetStateInfo();
                    AlipayQosService.getInstance().getQosLevel();
                }
            });
        } finally {
            try {
            } finally {
            }
        }
    }
}
