package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zui.deviceidservice.IDeviceidInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class j3l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IDeviceidInterface b;
    public ServiceConnection c;

    /* renamed from: a  reason: collision with root package name */
    public Context f21739a = null;
    public b d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            j3l.a(j3l.this, IDeviceidInterface.Stub.asInterface(iBinder));
            if (j3l.b(j3l.this) != null) {
                j3l.b(j3l.this).a("Deviceid Service Connected", j3l.this);
            }
            j3l.c(j3l.this, "Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            j3l.a(j3l.this, null);
            j3l.c(j3l.this, "Service onServiceDisconnected");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface b<T> {
        void a(T t, j3l j3lVar);
    }

    static {
        t2o.a(147849277);
    }

    public static /* synthetic */ IDeviceidInterface a(j3l j3lVar, IDeviceidInterface iDeviceidInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDeviceidInterface) ipChange.ipc$dispatch("c65fae47", new Object[]{j3lVar, iDeviceidInterface});
        }
        j3lVar.b = iDeviceidInterface;
        return iDeviceidInterface;
    }

    public static /* synthetic */ b b(j3l j3lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e417fc6f", new Object[]{j3lVar});
        }
        return j3lVar.d;
    }

    public static /* synthetic */ void c(j3l j3lVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a727d6b9", new Object[]{j3lVar, str});
        } else {
            j3lVar.h(str);
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9d1bc16", new Object[]{this});
        }
        if (this.f21739a != null) {
            try {
                IDeviceidInterface iDeviceidInterface = this.b;
                if (iDeviceidInterface != null) {
                    return iDeviceidInterface.getOAID();
                }
                return null;
            } catch (RemoteException e) {
                g("getOAID error, RemoteException!");
                e.printStackTrace();
                return null;
            }
        } else {
            g("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
    }

    public int e(Context context, b<String> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d95c253", new Object[]{this, context, bVar})).intValue();
        }
        if (context != null) {
            this.f21739a = context;
            this.d = bVar;
            this.c = new a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.f21739a.bindService(intent, this.c, 1)) {
                h("bindService Successful!");
                return 1;
            }
            h("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b0a92f", new Object[]{this})).booleanValue();
        }
        try {
            if (this.b == null) {
                return false;
            }
            h("Device support opendeviceid");
            return this.b.isSupport();
        } catch (RemoteException unused) {
            g("isSupport error, RemoteException!");
            return false;
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19760d2d", new Object[]{this, str});
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423c7231", new Object[]{this, str});
        }
    }
}
