package tb;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yb0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicBoolean f31951a = new AtomicBoolean(false);
        public static final HandlerThread b = new HandlerThread("ActivityMonitor");

        public static /* synthetic */ Looper a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Looper) ipChange.ipc$dispatch("1dccc48c", new Object[0]);
            }
            return c();
        }

        public static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a45d380", new Object[0]);
            } else if (f31951a.compareAndSet(false, true)) {
                try {
                    b.start();
                } catch (IllegalThreadStateException e) {
                    whh.b("ActivityMonitors", "sWorker.start() failed", e);
                }
            }
        }

        public static Looper c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Looper) ipChange.ipc$dispatch("92edbba3", new Object[0]);
            }
            b();
            return b.getLooper();
        }
    }

    public static wb0 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wb0) ipChange.ipc$dispatch("370aa3ab", new Object[]{context});
        }
        return new xb0(a.a());
    }
}
