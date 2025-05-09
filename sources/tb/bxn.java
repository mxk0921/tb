package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f16706a = new Handler(Looper.getMainLooper());

    public static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580b79d", new Object[]{obj});
        } else {
            f16706a.removeCallbacksAndMessages(obj);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
            return;
        }
        Thread currentThread = Thread.currentThread();
        Handler handler = f16706a;
        if (currentThread != handler.getLooper().getThread()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad743b6d", new Object[]{runnable});
        } else if (Thread.currentThread() != f16706a.getLooper().getThread()) {
            runnable.run();
        } else {
            qbn.d(runnable);
        }
    }

    public static void d(Runnable runnable, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05331cc", new Object[]{runnable, obj, new Long(j)});
        } else {
            f16706a.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
        }
    }
}
