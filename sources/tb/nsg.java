package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nsg b = new nsg();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24924a;

    public nsg() {
        HandlerThread handlerThread = new HandlerThread("LinkBackNonUIThread");
        handlerThread.start();
        this.f24924a = new Handler(handlerThread.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad9b350", new Object[]{this, runnable});
        } else {
            this.f24924a.post(runnable);
        }
    }
}
