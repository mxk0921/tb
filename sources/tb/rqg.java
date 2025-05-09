package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rqg b = new rqg();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f27555a;

    static {
        t2o.a(1030750340);
    }

    public rqg() {
        HandlerThread handlerThread = new HandlerThread("LinkCommonNonUIThread");
        handlerThread.start();
        this.f27555a = new Handler(handlerThread.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09024d8", new Object[]{this, runnable});
        } else {
            this.f27555a.post(runnable);
        }
    }
}
