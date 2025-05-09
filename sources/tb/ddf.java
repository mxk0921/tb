package tb;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ddf extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ddf d;

    /* renamed from: a  reason: collision with root package name */
    private wnc f17741a = (wnc) d62.b(wnc.class, "InstantiatorThread");
    private ArrayBlockingQueue<cdf> b = new ArrayBlockingQueue<>(10);
    private Pools.SynchronizedPool<cdf> c = new Pools.SynchronizedPool<>(10);

    static {
        t2o.a(676331619);
        ddf ddfVar = new ddf();
        d = ddfVar;
        ddfVar.start();
    }

    public static ddf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddf) ipChange.ipc$dispatch("510cbb13", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ Object ipc$super(ddf ddfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/instantiation/InstantiatorThread");
    }

    public void a(cdf cdfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c531539", new Object[]{this, cdfVar});
            return;
        }
        try {
            this.b.put(cdfVar);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async instantiator request", e);
        }
    }

    public cdf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdf) ipChange.ipc$dispatch("6c035849", new Object[]{this});
        }
        cdf acquire = this.c.acquire();
        if (acquire == null || !acquire.f16991a) {
            acquire = new cdf();
        }
        acquire.f16991a = false;
        return acquire;
    }

    public void d(cdf cdfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af0d6b9", new Object[]{this, cdfVar});
            return;
        }
        cdfVar.e = null;
        cdfVar.f = null;
        cdfVar.i = null;
        cdfVar.d = null;
        cdfVar.g = null;
        cdfVar.j = null;
        cdfVar.f16991a = true;
        this.c.release(cdfVar);
    }

    public void e() {
        try {
            cdf take = this.b.take();
            try {
                Class[] clsArr = take.j;
                if (clsArr == null || clsArr.length <= 0) {
                    take.h = Class.forName(take.g).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } else {
                    take.h = Class.forName(take.g).getDeclaredConstructor(take.j).newInstance(take.d);
                }
                WeakReference<Context> weakReference = take.c;
                if (!(weakReference == null || weakReference.get() == null || TextUtils.isEmpty(take.b))) {
                    ((cad) bcq.a()).i().n(take.c.get(), take.b);
                    ((cad) bcq.a()).i().e(take.c.get(), Collections.singletonList(hcq.a().a(take.b)));
                }
            } catch (Exception unused) {
                this.f17741a.c("Failed to Instance %s in the background!", take.g);
            }
            Message.obtain(take.i.f20576a, 0, take).sendToTarget();
        } catch (InterruptedException unused2) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            e();
        }
    }
}
