package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zo7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long b;

    /* renamed from: a  reason: collision with root package name */
    public long f32906a = 52428800;
    public final ReentrantLock c = new ReentrantLock();

    static {
        t2o.a(106954757);
    }

    public zo7(Context context, String str) {
        ckf.g(context, "context");
        ckf.g(str, "businessId");
        this.b = oc9.f(new File(bvl.INSTANCE.a(context, str)));
    }

    public final boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eecb26f", new Object[]{this, new Long(j)})).booleanValue();
        }
        this.c.lock();
        try {
            long j2 = this.b;
            if (j + j2 > this.f32906a) {
                return false;
            }
            this.b = j2 + j;
            return true;
        } finally {
            this.c.unlock();
        }
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c086e21", new Object[]{this, new Long(j)});
            return;
        }
        this.c.lock();
        try {
            this.f32906a = j;
        } finally {
            this.c.unlock();
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a134f3", new Object[]{this, new Long(j)});
            return;
        }
        this.c.lock();
        try {
            this.b += j;
        } finally {
            this.c.unlock();
        }
    }
}
