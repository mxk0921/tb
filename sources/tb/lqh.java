package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lqh implements yqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f23512a = new ArrayList();
    public final List<MRTJob> b = new ArrayList();
    public final Object c = new Object();

    static {
        t2o.a(577765399);
        t2o.a(577765400);
    }

    public final MRTJob a() {
        MRTJob mRTJob;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTJob) ipChange.ipc$dispatch("b7d16025", new Object[]{this});
        }
        synchronized (this.b) {
            try {
                Iterator it = ((ArrayList) this.b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        mRTJob = null;
                        break;
                    }
                    mRTJob = (MRTJob) it.next();
                    if (!((ArrayList) this.f23512a).contains(mRTJob.h.name)) {
                        break;
                    }
                }
                if (mRTJob != null) {
                    ((ArrayList) this.b).remove(mRTJob);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mRTJob;
    }

    public void b(MRTJob mRTJob) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d148602", new Object[]{this, mRTJob});
            return;
        }
        synchronized (this.f23512a) {
            ((ArrayList) this.f23512a).remove(mRTJob.h.name);
        }
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a2ea28a", new Object[]{this});
        }
        return this.c;
    }

    public void d(MRTJob mRTJob) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531c9937", new Object[]{this, mRTJob});
        } else if (mRTJob != null) {
            synchronized (this.b) {
                ((ArrayList) this.b).add(mRTJob);
            }
            synchronized (this.c) {
                this.c.notifyAll();
            }
        }
    }

    public MRTJob e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTJob) ipChange.ipc$dispatch("9d0f4d43", new Object[]{this});
        }
        while (true) {
            MRTJob a2 = a();
            if (a2 == null) {
                synchronized (this.c) {
                    try {
                        this.c.wait();
                    } catch (InterruptedException e) {
                        kgh.d("MRTFIFOScheduler", "", e);
                    }
                }
            } else {
                synchronized (this.f23512a) {
                    ((ArrayList) this.f23512a).add(a2.h.name);
                }
                return a2;
            }
        }
    }
}
