package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uix implements tix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f29409a;

    static {
        t2o.a(993001585);
        t2o.a(993001584);
    }

    public uix() {
        HandlerThread handlerThread = new HandlerThread("ace-worker");
        handlerThread.start();
        this.f29409a = new Handler(handlerThread.getLooper());
    }

    @Override // tb.tix
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffc7c8c", new Object[]{this, runnable});
        } else {
            this.f29409a.post(runnable);
        }
    }
}
