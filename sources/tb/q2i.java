package tb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q2i implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile IBinder f26463a;
    public final Object b = new Object();
    public String c;
    public ComponentName d;

    static {
        t2o.a(578814114);
    }

    public IBinder a(long j) throws InterruptedException, TimeoutException {
        IBinder iBinder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("8a9f6ba0", new Object[]{this, new Long(j)});
        }
        try {
            IBinder iBinder2 = this.f26463a;
            if (iBinder2 != null) {
                return iBinder2;
            }
            synchronized (this.b) {
                long uptimeMillis = SystemClock.uptimeMillis();
                while (this.f26463a == null) {
                    this.b.wait(j);
                    if (SystemClock.uptimeMillis() - uptimeMillis > j) {
                        throw new TimeoutException();
                    }
                }
                iBinder = this.f26463a;
            }
            return iBinder;
        } finally {
            this.f26463a = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        new StringBuilder("onServiceConnected: ").append(componentName);
        synchronized (this.b) {
            this.d = componentName;
            this.f26463a = iBinder;
            this.b.notifyAll();
        }
        try {
            this.c = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            return;
        }
        new StringBuilder("onServiceDisconnected: ").append(componentName);
        synchronized (this.b) {
            this.f26463a = null;
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("ManagedServiceConnection[");
        sb.append(this.c);
        sb.append(":");
        ComponentName componentName = this.d;
        if (componentName == null) {
            str = "not connected";
        } else {
            str = componentName.flattenToShortString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
