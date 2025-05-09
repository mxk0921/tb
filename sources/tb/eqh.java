package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final eqh b = new eqh();

    /* renamed from: a  reason: collision with root package name */
    public Handler f18759a;

    static {
        t2o.a(577765434);
    }

    public static eqh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqh) ipChange.ipc$dispatch("3b5c8c1e", new Object[0]);
        }
        return b;
    }

    public void a(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200857cb", new Object[]{this, runnable, new Integer(i)});
            return;
        }
        if (this.f18759a == null) {
            synchronized (eqh.class) {
                try {
                    if (this.f18759a == null) {
                        HandlerThread handlerThread = new HandlerThread("mrt");
                        handlerThread.start();
                        this.f18759a = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f18759a.postDelayed(runnable, i);
    }
}
