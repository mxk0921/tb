package com.alibaba.android.split.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ServiceConnectionImpl implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ServiceManager mServiceManager;

    static {
        t2o.a(677380156);
    }

    public ServiceConnectionImpl(ServiceManager serviceManager) {
        this.mServiceManager = serviceManager;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
        } else {
            ServiceManager.post(this.mServiceManager, new ServiceConnectedTask(this, iBinder));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
        } else {
            ServiceManager.post(this.mServiceManager, new ServiceDisconnection(this));
        }
    }
}
