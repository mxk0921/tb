package com.alipay.mobile.alertsentry.trace;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WatchDog implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AtomicBoolean atomicBoolean = new AtomicBoolean();
    private final long timeout;

    public WatchDog(long j) {
        this.timeout = j;
    }

    public void bark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f16f3f", new Object[]{this});
        } else {
            this.atomicBoolean.compareAndSet(false, true);
        }
    }

    public long getTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838026", new Object[]{this})).longValue();
        }
        return this.timeout;
    }

    public boolean isSomethingUnusual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eb6c084", new Object[]{this})).booleanValue();
        }
        if (!this.atomicBoolean.get()) {
            return true;
        }
        return false;
    }
}
