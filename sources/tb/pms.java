package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pms implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f26189a;
    public long b;
    public long c;
    public boolean d = false;
    public a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a();
    }

    static {
        t2o.a(329253014);
    }

    public pms() {
        long nanoTime = System.nanoTime();
        this.b = nanoTime;
        this.f26189a = nanoTime;
        this.c = nanoTime;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a1dbe4", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (!this.d) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (timeUnit.toMillis(j - this.f26189a) > 10000) {
                this.d = true;
                return;
            }
            long j2 = j - this.b;
            if (j2 > b9u.FRAME_TIME_NANO && j2 / b9u.FRAME_TIME_NANO > 10) {
                this.c = j;
            }
            if (timeUnit.toMillis(j - this.c) > zms.d(wms.CONFIG_KEY_SMOOTH_DURATION, 2000L)) {
                this.d = true;
                a aVar = this.e;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            this.b = j;
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
