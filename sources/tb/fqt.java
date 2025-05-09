package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile fqt c;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19470a = new Handler(Looper.getMainLooper());
    public final ScheduledThreadPoolExecutor b;

    static {
        t2o.a(284164128);
    }

    public fqt() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.eqt
            @Override // tb.qqt
            public final String newThreadName() {
                String e;
                e = fqt.e();
                return e;
            }
        });
        this.b = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static fqt d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fqt) ipChange.ipc$dispatch("fece9ed1", new Object[0]);
        }
        if (c == null) {
            synchronized (fqt.class) {
                try {
                    if (c == null) {
                        c = new fqt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("636fc465", new Object[0]);
        }
        return qh3.TAG;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977e81e4", new Object[]{this, runnable});
        } else {
            this.b.execute(runnable);
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf6a713", new Object[]{this, runnable});
        } else {
            this.f19470a.post(runnable);
        }
    }
}
