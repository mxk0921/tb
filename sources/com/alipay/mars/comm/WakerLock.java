package com.alipay.mars.comm;

import android.content.Context;
import android.os.PowerManager;
import com.alipay.bifrost.Bifrost;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WakerLock {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PowerManager.WakeLock f3869a;

    public WakerLock(Context context) {
        this.f3869a = null;
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.WakerLock", "WakerLock error", th);
                return;
            }
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "bifrost.WakerLock");
        this.f3869a = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            unLock();
        }
    }

    public boolean isLocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dc11c58", new Object[]{this})).booleanValue();
        }
        PowerManager.WakeLock wakeLock = this.f3869a;
        if (wakeLock == null) {
            return false;
        }
        return wakeLock.isHeld();
    }

    public void lock(long j) {
        PowerManager.WakeLock wakeLock;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bc40d2", new Object[]{this, new Long(j)});
        } else if (Bifrost.getSwchmng().enableBifrostUseWakeLock() && (wakeLock = this.f3869a) != null) {
            wakeLock.acquire(j);
        }
    }

    public void unLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08e85eb", new Object[]{this});
            return;
        }
        PowerManager.WakeLock wakeLock = this.f3869a;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f3869a.release();
        }
    }

    public void lock() {
        PowerManager.WakeLock wakeLock;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bbbc32", new Object[]{this});
        } else if (Bifrost.getSwchmng().enableBifrostUseWakeLock() && (wakeLock = this.f3869a) != null) {
            wakeLock.acquire();
        }
    }
}
