package com.alipay.mobile.common.transport.http.cookie;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayNetCookieSyncManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AlipayNetCookieSyncManager f4090a;
    public static IAlipayNetCookieSyncManager b;

    public AlipayNetCookieSyncManager() {
        b = new AlipayNetDefaultCookieSyncManager();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            b.createInstance(context);
        }
    }

    public static AlipayNetCookieSyncManager createInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieSyncManager) ipChange.ipc$dispatch("d10d2b2e", new Object[]{context});
        }
        if (b == null) {
            get();
        }
        a(context);
        return get();
    }

    public static AlipayNetCookieSyncManager get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieSyncManager) ipChange.ipc$dispatch("3e09d6bb", new Object[0]);
        }
        AlipayNetCookieSyncManager alipayNetCookieSyncManager = f4090a;
        if (alipayNetCookieSyncManager != null) {
            return alipayNetCookieSyncManager;
        }
        synchronized (AlipayNetCookieSyncManager.class) {
            try {
                AlipayNetCookieSyncManager alipayNetCookieSyncManager2 = f4090a;
                if (alipayNetCookieSyncManager2 != null) {
                    return alipayNetCookieSyncManager2;
                }
                AlipayNetCookieSyncManager alipayNetCookieSyncManager3 = new AlipayNetCookieSyncManager();
                f4090a = alipayNetCookieSyncManager3;
                return alipayNetCookieSyncManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AlipayNetCookieSyncManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieSyncManager) ipChange.ipc$dispatch("aef590b0", new Object[0]);
        }
        if (b == null) {
            get();
        }
        b.getInstance();
        return get();
    }

    public synchronized void setCustomCookieSyncManager(IAlipayNetCookieSyncManager iAlipayNetCookieSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ef3b05", new Object[]{this, iAlipayNetCookieSyncManager});
            return;
        }
        if (iAlipayNetCookieSyncManager != null) {
            b = iAlipayNetCookieSyncManager;
        }
    }

    public void sync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c36d9a2", new Object[]{this});
        } else {
            b.sync();
        }
    }
}
