package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f18520a;
    public Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static final eet INSTANCE = new eet();

        static {
            t2o.a(447741992);
        }
    }

    static {
        t2o.a(447741990);
    }

    public static eet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eet) ipChange.ipc$dispatch("a074702f", new Object[0]);
        }
        return b.INSTANCE;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce96e7e", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e4b137", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = new HandlerThread("DOJOAbilitySubThread");
        this.f18520a = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.f18520a.getLooper());
    }

    public void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == this.f18520a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public eet() {
        c();
        b();
    }
}
