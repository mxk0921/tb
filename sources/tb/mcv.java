package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f23947a;
    public final Handler b;

    static {
        t2o.a(157286810);
    }

    public mcv() {
        HandlerThread handlerThread = new HandlerThread("UltronTradeHybridWorkerThread");
        this.f23947a = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.f23947a.getLooper());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            HandlerThread handlerThread = this.f23947a;
            if (handlerThread == null) {
                UnifyLog.e("UltronTradeHybridWorkerThread.destroy", "mThread is null");
                return;
            }
            handlerThread.quitSafely();
            this.f23947a = null;
        } catch (Throwable th) {
            UnifyLog.e("UltronTradeHybridWorkerThread.destroy", th.toString());
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
        } else if (runnable == null) {
            UnifyLog.e("UltronTradeHybridWorkerThread.postTask", "runnable is null");
        } else {
            this.b.post(runnable);
        }
    }
}
