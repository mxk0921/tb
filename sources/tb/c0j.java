package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c0j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REPORT_IGNORE = 0;
    public static final int REPORT_IMMEDIATELY = -1;

    /* renamed from: a  reason: collision with root package name */
    public long f16752a = 0;
    public final Handler b = new Handler(Looper.getMainLooper());
    public Runnable c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f16753a;

        public a(Runnable runnable) {
            this.f16753a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Runnable runnable = this.f16753a;
            if (runnable != null) {
                runnable.run();
            }
            c0j.a(c0j.this);
        }
    }

    static {
        t2o.a(628097094);
    }

    public static /* synthetic */ void a(c0j c0jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93f7f17", new Object[]{c0jVar});
        } else {
            c0jVar.c();
        }
    }

    public synchronized boolean b(long j, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e15641a", new Object[]{this, new Long(j), runnable})).booleanValue();
        } else if (0 == j) {
            return false;
        } else {
            if (-1 == j) {
                if (runnable != null) {
                    runnable.run();
                }
                c();
                return true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis + j;
            long j3 = this.f16752a;
            if (j3 > 0 && currentTimeMillis < j3 && j3 < j2) {
                return false;
            }
            c();
            Handler handler = this.b;
            a aVar = new a(runnable);
            this.c = aVar;
            handler.postDelayed(aVar, j);
            this.f16752a = j2;
            return true;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
        }
        this.f16752a = 0L;
    }
}
