package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f29681a;
    public static final Handler mMainHander = new Handler(Looper.getMainLooper());

    static {
        t2o.a(468714598);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea1d768", new Object[]{runnable});
            return;
        }
        Handler handler = f29681a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
        mMainHander.removeCallbacks(runnable);
    }

    public static void b(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc09aad", new Object[]{runnable, new Integer(i)});
            return;
        }
        if (f29681a == null) {
            HandlerThread handlerThread = new HandlerThread("TBVideoExcutor-single", 5);
            handlerThread.start();
            f29681a = new Handler(handlerThread.getLooper());
        }
        f29681a.postDelayed(runnable, Math.max(0, i));
    }

    public static void c(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5d8685", new Object[]{runnable, new Integer(i)});
        } else if (runnable != null) {
            if (Looper.myLooper() != Looper.getMainLooper() || i >= 0) {
                mMainHander.postDelayed(runnable, Math.max(i, 0));
            } else {
                runnable.run();
            }
        }
    }
}
