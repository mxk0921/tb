package com.alipay.mobile.common.transportext.biz.mmtp;

import com.alipay.mobile.common.ipc.api.push.BindEventListener;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.appevent.AmnetEventNotify;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BindEventListenerManger implements BindEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static BindEventListenerManger d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4190a;
    public final Object b = new Object();
    public final Object c = new Object();

    public BindEventListenerManger() {
        this.f4190a = false;
        this.f4190a = BindPushServiceManager.BindPushServiceFactory.getInstance().isBindedService();
    }

    public static final BindEventListenerManger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BindEventListenerManger) ipChange.ipc$dispatch("d35f8016", new Object[0]);
        }
        if (d == null) {
            synchronized (BindEventListenerManger.class) {
                try {
                    if (d == null) {
                        d = new BindEventListenerManger();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindEventListener
    public void binded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52cf6c23", new Object[]{this});
            return;
        }
        this.f4190a = true;
        synchronized (this.b) {
            try {
                this.b.notifyAll();
            } catch (Exception e) {
                LogCatUtil.error("BindEventListenerManger", e);
            }
        }
        AmnetEventNotify.onSyncConnState();
    }

    public boolean isBinded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d43a68f1", new Object[]{this})).booleanValue();
        }
        return this.f4190a;
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindEventListener
    public void unBinde() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444b31b6", new Object[]{this});
            return;
        }
        this.f4190a = false;
        synchronized (this.c) {
            try {
                this.c.notifyAll();
            } catch (Exception e) {
                LogCatUtil.error("BindEventListenerManger", e);
            }
        }
        LogCatUtil.debug("EXT_Watchdog", "Unbind event captured, ticking watchdog");
        ExtTransportTunnelWatchdog.getInstance().bindFailureTick();
    }

    public void waitToBinded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5d1713", new Object[]{this});
        } else if (!this.f4190a) {
            synchronized (this.b) {
                try {
                    this.b.wait(3000L);
                } catch (InterruptedException e) {
                    LogCatUtil.error("BindEventListenerManger", e);
                }
            }
        }
    }

    public void waitToUnBinded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e55a8c", new Object[]{this});
        } else if (this.f4190a) {
            synchronized (this.c) {
                try {
                    this.c.wait(3000L);
                } catch (InterruptedException e) {
                    LogCatUtil.error("BindEventListenerManger", e);
                }
            }
        }
    }
}
