package com.alipay.mobile.common.ipc.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.push.BindEventListener;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BindPushServiceManagerImpl implements BindPushServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PushServiceConnection b;
    public Context c;
    public boolean d;
    public IPCManagerDeathRecipient f;

    /* renamed from: a  reason: collision with root package name */
    public final List<BindEventListener> f3932a = new ArrayList(1);
    public String e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class IPCManagerDeathRecipient implements IBinder.DeathRecipient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public IPCManagerDeathRecipient() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            LogCatUtil.info("IPC_BindPushServiceManager", "IPCManagerDeathRecipient#binderDied");
            BindPushServiceManagerImpl.access$500(BindPushServiceManagerImpl.this);
            BindPushServiceManagerImpl.this.setBindedService(false);
            BindPushServiceManagerImpl.access$600(BindPushServiceManagerImpl.this);
            BindPushServiceManagerImpl.this.bindService();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class PushServiceConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IIPCManager f3933a = null;

        public PushServiceConnection() {
        }

        public static /* synthetic */ IIPCManager access$300(PushServiceConnection pushServiceConnection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IIPCManager) ipChange.ipc$dispatch("a55ad391", new Object[]{pushServiceConnection});
            }
            return pushServiceConnection.f3933a;
        }

        public IIPCManager getIpcManager() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IIPCManager) ipChange.ipc$dispatch("1d33c90e", new Object[]{this});
            }
            return this.f3933a;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            IIPCManager asInterface = IIPCManager.Stub.asInterface(iBinder);
            this.f3933a = asInterface;
            try {
                asInterface.asBinder().linkToDeath(BindPushServiceManagerImpl.access$100(BindPushServiceManagerImpl.this), 0);
            } catch (RemoteException e) {
                LogCatUtil.error("IPC_BindPushServiceManager", e);
            }
            try {
                NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl.PushServiceConnection.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            IPCApiFactory.getSingletonIPCContextManager().init(BindPushServiceManagerImpl.access$200(BindPushServiceManagerImpl.this), PushServiceConnection.access$300(PushServiceConnection.this));
                            BindPushServiceManagerImpl.this.setBindedService(true);
                            BindPushServiceManagerImpl.access$400(BindPushServiceManagerImpl.this);
                            LogCatUtil.info("IPC_BindPushServiceManager", "onServiceConnected finish");
                        } catch (Exception e2) {
                            LogCatUtil.error("IPC_BindPushServiceManager", "init ipcContextManager", e2);
                        }
                    }
                });
            } catch (Exception e2) {
                LogCatUtil.error("IPC_BindPushServiceManager", e2);
            }
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                this.f3933a = null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            if (this.f3933a != null) {
                LogCatUtil.info("IPC_BindPushServiceManager", "onServiceDisconnected ipcManager != null");
            }
            BindPushServiceManagerImpl.access$500(BindPushServiceManagerImpl.this);
            BindPushServiceManagerImpl.access$600(BindPushServiceManagerImpl.this);
            reset();
            BindPushServiceManagerImpl.this.setBindedService(false);
            LogCatUtil.info("IPC_BindPushServiceManager", "onServiceDisconnected finish. ");
            BindPushServiceManagerImpl.this.bindService();
        }
    }

    public static /* synthetic */ List access$000(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2bf5dbe4", new Object[]{bindPushServiceManagerImpl});
        }
        return bindPushServiceManagerImpl.f3932a;
    }

    public static /* synthetic */ IPCManagerDeathRecipient access$100(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCManagerDeathRecipient) ipChange.ipc$dispatch("5867f7de", new Object[]{bindPushServiceManagerImpl});
        }
        return bindPushServiceManagerImpl.b();
    }

    public static /* synthetic */ Context access$200(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3f78efd", new Object[]{bindPushServiceManagerImpl});
        }
        return bindPushServiceManagerImpl.a();
    }

    public static /* synthetic */ void access$400(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef9ce07", new Object[]{bindPushServiceManagerImpl});
        } else {
            bindPushServiceManagerImpl.e();
        }
    }

    public static /* synthetic */ void access$500(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804b5d88", new Object[]{bindPushServiceManagerImpl});
        } else {
            bindPushServiceManagerImpl.g();
        }
    }

    public static /* synthetic */ void access$600(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719ced09", new Object[]{bindPushServiceManagerImpl});
        } else {
            bindPushServiceManagerImpl.f();
        }
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.c == null) {
            this.c = TransportEnvUtil.getContext();
        }
        return this.c;
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void addBindEventListener(BindEventListener bindEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f72bc78", new Object[]{this, bindEventListener});
        } else {
            ((ArrayList) this.f3932a).add(bindEventListener);
        }
    }

    public final IPCManagerDeathRecipient b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCManagerDeathRecipient) ipChange.ipc$dispatch("ca59276d", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new IPCManagerDeathRecipient();
        }
        return this.f;
    }

    public final PushServiceConnection c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PushServiceConnection) ipChange.ipc$dispatch("95cb5e43", new Object[]{this});
        }
        PushServiceConnection pushServiceConnection = this.b;
        if (pushServiceConnection != null) {
            return pushServiceConnection;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new PushServiceConnection();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71fc438b", new Object[]{this});
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        if (TransportStrategy.isUseAmnetService()) {
            this.e = "com.alipay.mobile.common.amnet.service.AmnetService";
        } else {
            this.e = "com.alipay.pushsdk.push.NotificationService";
        }
        LogCatUtil.info("IPC_BindPushServiceManager", "[getTargetService] mTargetService: " + this.e);
        return this.e;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf4395c", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size = BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).size();
                    for (int i = 0; i < size; i++) {
                        try {
                            ((BindEventListener) BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).get(i)).binded();
                        } catch (Exception e) {
                            LogCatUtil.error("IPC_BindPushServiceManager", e);
                        }
                    }
                }
            });
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48f71c2", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size = BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).size();
                    for (int i = 0; i < size; i++) {
                        try {
                            ((BindEventListener) BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).get(i)).unBinde();
                        } catch (Exception e) {
                            LogCatUtil.error("IPC_BindPushServiceManager", e);
                        }
                    }
                }
            });
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ade7372", new Object[]{this});
            return;
        }
        try {
            IPCApiFactory.getSingletonIPCContextManager().resetIIPCManager();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public boolean isBindedService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db710d7a", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void removeBindEventListener(BindEventListener bindEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7a9b1b", new Object[]{this, bindEventListener});
        } else {
            ((ArrayList) this.f3932a).remove(bindEventListener);
        }
    }

    public void setBindedService(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8aa556", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void unbindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e2086", new Object[]{this});
            return;
        }
        try {
            LogCatUtil.info("IPC_BindPushServiceManager", "unbindService");
            PushServiceConnection c = c();
            if (c.getIpcManager() != null) {
                synchronized (this) {
                    if (c.getIpcManager() != null) {
                        c.reset();
                        a().unbindService(c);
                    }
                }
            }
        } catch (Exception e) {
            LogCatUtil.error("IPC_BindPushServiceManager", e);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void bindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780e543f", new Object[]{this});
            return;
        }
        LogCatUtil.info("IPC_BindPushServiceManager", "bindService");
        try {
            Intent intent = new Intent(a(), Class.forName(d()));
            intent.setPackage(a().getPackageName());
            this.c.bindService(intent, c(), 1);
            LogCatUtil.info("IPC_BindPushServiceManager", "push bind finish");
        } catch (Exception e) {
            LogCatUtil.error("IPC_BindPushServiceManager", e);
        }
    }
}
