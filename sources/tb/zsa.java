package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zsa b = new zsa();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f32989a;

    static {
        t2o.a(467664981);
    }

    public zsa() {
        HandlerThread handlerThread = new HandlerThread("FlowCustomsNonUIThread");
        handlerThread.start();
        this.f32989a = new Handler(handlerThread.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad9b350", new Object[]{this, runnable});
        } else {
            this.f32989a.post(runnable);
        }
    }

    public void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805d2d74", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f32989a.postDelayed(runnable, j);
        }
    }
}
