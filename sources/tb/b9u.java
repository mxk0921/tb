package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.concurrent.TimeUnit;
import tb.e4b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b9u implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FRAME_CHECK_DURATION = 2000;
    public static final long FRAME_CHECK_TIMEOUT = 20000;

    /* renamed from: a  reason: collision with root package name */
    public final long f16270a;
    public long b;
    public long c;
    public boolean d = false;
    public a e;
    public static final long FRAME_TIME_NANO = 16666666;
    public static final long FRAME_TIME_MILLIS = TimeUnit.NANOSECONDS.toMillis(FRAME_TIME_NANO);
    public static final long f = vxl.c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(729809896);
    }

    public b9u() {
        long nanoTime = System.nanoTime();
        this.b = nanoTime;
        this.f16270a = nanoTime;
        this.c = nanoTime;
        TLog.loge("home", "GlobalTrace", "=============，start smooth check. JITTER_COUNT=" + f);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3775fa6e", new Object[]{this})).longValue();
        }
        return TimeUnit.NANOSECONDS.toMillis(this.c);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a641166c", new Object[]{this});
            return;
        }
        this.d = true;
        Choreographer.getInstance().removeFrameCallback(this);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2608e1a", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737b13f0", new Object[]{this, aVar});
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
            if (timeUnit.toMillis(j - this.f16270a) > 20000) {
                TLog.loge("home", "GlobalTrace", "=================，idle check timeout.");
                this.d = true;
                a aVar = this.e;
                if (aVar != null) {
                    ((e4b.b) aVar).a(false);
                    return;
                }
                return;
            }
            long j2 = j - this.b;
            if (j2 > f * FRAME_TIME_NANO) {
                TLog.logw("home", "GlobalTrace", "block happened. duration=" + timeUnit.toMillis(j2));
                this.c = j;
            }
            if (timeUnit.toMillis(j - this.c) > 2000) {
                TLog.loge("home", "GlobalTrace", "=============， smooth checked.");
                this.d = true;
                a aVar2 = this.e;
                if (aVar2 != null) {
                    ((e4b.b) aVar2).a(true);
                    return;
                }
                return;
            }
            this.b = j;
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
