package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile o1d b;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f25082a;

    static {
        t2o.a(737149013);
    }

    public o1d() {
        HandlerThread handlerThread = new HandlerThread("io_recorder");
        handlerThread.start();
        this.f25082a = new Handler(handlerThread.getLooper());
    }

    public static o1d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1d) ipChange.ipc$dispatch("e775167f", new Object[0]);
        }
        if (b == null) {
            synchronized (o1d.class) {
                try {
                    if (b == null) {
                        b = new o1d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public boolean b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad27e80", new Object[]{this, runnable, new Long(j)})).booleanValue();
        }
        return this.f25082a.postDelayed(runnable, j);
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bf80a9", new Object[]{this, runnable});
            return;
        }
        try {
            this.f25082a.removeCallbacks(runnable);
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "IORecorderHandlerWrapper", String.format("removeCallbacksSafely: remove runnable %s with exception %s", runnable, th));
        }
    }
}
