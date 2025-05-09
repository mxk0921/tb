package tb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jay;
import tb.o9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lby implements ServiceConnection {
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public a f23241a;
    public Handler b = null;
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    public lby(zyn zynVar) {
    }

    public final void a() {
        synchronized (e) {
            try {
                Handler handler = this.b;
                if (handler != null) {
                    handler.removeMessages(1001);
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        int i2;
        a aVar = this.f23241a;
        if (aVar != null) {
            vay vayVar = (vay) aVar;
            AtomicInteger atomicInteger = vayVar.f29901a.f15651a;
            if (i == HonorPushErrorEnum.ERROR_SERVICE_TIME_OUT.statusCode) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            atomicInteger.set(i2);
            vayVar.f29901a.a(i);
            vayVar.f29901a.b = null;
        }
    }

    public void c() {
        try {
            new StringBuilder("trying to unbind service from ").append(this);
            s4y.e.d().unbindService(this);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        if (this.c) {
            this.c = false;
            return;
        }
        c();
        a();
        a aVar = this.f23241a;
        if (aVar != null) {
            vay vayVar = (vay) aVar;
            vayVar.f29901a.f15651a.set(1);
            vayVar.f29901a.a(8002005);
            vayVar.f29901a.b = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a();
        a aVar = this.f23241a;
        if (aVar != null) {
            vay vayVar = (vay) aVar;
            vayVar.f29901a.b = IPushInvoke.Stub.asInterface(iBinder);
            if (vayVar.f29901a.b == null) {
                vayVar.f29901a.d.c();
                vayVar.f29901a.f15651a.set(1);
                vayVar.f29901a.a(8002001);
                return;
            }
            vayVar.f29901a.f15651a.set(3);
            jay.a aVar2 = vayVar.f29901a.c;
            if (aVar2 != null) {
                o9y.a aVar3 = (o9y.a) aVar2;
                if (Looper.myLooper() == o9y.this.f25238a.getLooper()) {
                    aVar3.d();
                } else {
                    o9y.this.f25238a.post(new r8y(aVar3));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.f23241a;
        if (aVar != null) {
            vay vayVar = (vay) aVar;
            vayVar.f29901a.f15651a.set(1);
            vayVar.f29901a.a(8002002);
            vayVar.f29901a.b = null;
        }
    }
}
