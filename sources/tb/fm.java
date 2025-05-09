package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19399a = new Handler(Looper.getMainLooper());
    public long b = -1;
    public Runnable c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f19400a;

        public a(Runnable runnable) {
            this.f19400a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f19400a.run();
            fm.a(fm.this, -1L);
        }
    }

    static {
        t2o.a(80740557);
    }

    public static /* synthetic */ long a(fm fmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("981727b", new Object[]{fmVar, new Long(j)})).longValue();
        }
        fmVar.b = j;
        return j;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59325760", new Object[]{this, runnable});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (-1 == this.b) {
            this.b = currentTimeMillis;
        }
        if (currentTimeMillis - this.b < 50) {
            c(runnable, 50L);
        } else {
            c(runnable, 0L);
        }
    }

    public final void c(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e66e0c0", new Object[]{this, runnable, new Long(j)});
            return;
        }
        this.f19399a.removeCallbacks(this.c);
        a aVar = new a(runnable);
        this.c = aVar;
        this.f19399a.postDelayed(aVar, j);
    }
}
