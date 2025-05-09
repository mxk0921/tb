package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class dk8 implements hk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f17879a;
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tfs.f("[EventExecuteMonitor] time out " + dk8.this);
            dk8.this.a();
        }
    }

    static {
        t2o.a(503317231);
        t2o.a(503317234);
    }

    public dk8() {
        a aVar = new a();
        this.f17879a = aVar;
        c.postDelayed(aVar, 5000L);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        tfs.f("[EventExecuteMonitor] execute: " + this.b + "  " + this);
        if (!this.b) {
            this.b = true;
            c.removeCallbacks(this.f17879a);
            b();
        }
    }

    public abstract void b();

    @Override // tb.hk8
    public void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        }
    }
}
