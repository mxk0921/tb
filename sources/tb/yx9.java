package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Choreographer.FrameCallback b;
    public final long d;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f32403a = new Handler(Looper.getMainLooper());
    public final Queue<Runnable> c = new ArrayDeque();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.yx9$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1110a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f32405a;

            public RunnableC1110a(long j) {
                this.f32405a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long a2 = (yx9.a(yx9.this) - (System.nanoTime() - this.f32405a)) / 2;
                long j = a2 / 1000000;
                tfs.g("FrameIdleScheduler", "doFrame, remain ms:" + j + " nano:" + a2);
                if (j > 0) {
                    yx9.b(yx9.this, a2);
                }
            }
        }

        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                return;
            }
            yx9.c(yx9.this).post(new RunnableC1110a(j));
            yx9.d(yx9.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class b implements Runnable {
        static {
            t2o.a(503317347);
        }
    }

    static {
        t2o.a(503317344);
    }

    public yx9(Activity activity) {
        this.d = g(activity);
    }

    public static /* synthetic */ long a(yx9 yx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1489f41c", new Object[]{yx9Var})).longValue();
        }
        return yx9Var.d;
    }

    public static /* synthetic */ void b(yx9 yx9Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d83861d", new Object[]{yx9Var, new Long(j)});
        } else {
            yx9Var.f(j);
        }
    }

    public static /* synthetic */ Handler c(yx9 yx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ebd33a20", new Object[]{yx9Var});
        }
        return yx9Var.f32403a;
    }

    public static /* synthetic */ void d(yx9 yx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacf7c45", new Object[]{yx9Var});
        } else {
            yx9Var.i();
        }
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113e5d4b", new Object[]{this, runnable});
        } else {
            ((ArrayDeque) this.c).add(runnable);
        }
    }

    public final void f(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afff8618", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = 0;
        while (!((ArrayDeque) this.c).isEmpty()) {
            long nanoTime = System.nanoTime();
            Runnable runnable = (Runnable) ((ArrayDeque) this.c).poll();
            if (runnable != null) {
                i++;
                runnable.run();
            }
            j2 += System.nanoTime() - nanoTime;
            if (j2 >= j) {
                break;
            }
        }
        tfs.g("FrameIdleScheduler", "executeIdleTasks, count:" + i);
    }

    public final long g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cedf9ad0", new Object[]{this, activity})).longValue();
        }
        return 1.0E9f / h(activity);
    }

    public final float h(Activity activity) {
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86ad6e", new Object[]{this, activity})).floatValue();
        }
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 60.0f;
        }
        return defaultDisplay.getRefreshRate();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf83b06a", new Object[]{this});
        } else if (this.b != null) {
            Choreographer.getInstance().postFrameCallback(this.b);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.b == null) {
            this.b = new a();
            Choreographer.getInstance().postFrameCallback(this.b);
            tfs.g("FrameIdleScheduler", "start");
        }
    }

    public void k() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        if (this.b != null) {
            Choreographer.getInstance().removeFrameCallback(this.b);
            this.b = null;
        }
        this.f32403a.removeCallbacksAndMessages(null);
        int i2 = 0;
        while (true) {
            Runnable runnable = (Runnable) ((ArrayDeque) this.c).poll();
            if (runnable == null) {
                tfs.g("FrameIdleScheduler", "stop, IdleTask clear, remainForceTaskCount:" + i + " remainNormalTaskCount:" + i2);
                return;
            } else if (runnable instanceof b) {
                runnable.run();
                i++;
            } else {
                i2++;
            }
        }
    }
}
