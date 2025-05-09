package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class as2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile as2 c;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f15971a;
    public final HandlerThread b;

    static {
        t2o.a(737148959);
    }

    public as2() {
        HandlerThread handlerThread = new HandlerThread("cache_clear");
        this.b = handlerThread;
        handlerThread.start();
        this.f15971a = new Handler(handlerThread.getLooper());
    }

    public static as2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (as2) ipChange.ipc$dispatch("92e69267", new Object[0]);
        }
        if (c == null) {
            synchronized (as2.class) {
                try {
                    if (c == null) {
                        c = new as2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public boolean b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd609e29", new Object[]{this, runnable})).booleanValue();
        }
        return this.f15971a.post(runnable);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79acd10", new Object[]{this});
        } else {
            this.b.quitSafely();
        }
    }
}
