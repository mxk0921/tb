package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ohe implements Choreographer.FrameCallback, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f25391a;
    public long b;
    public final HandlerThread c;
    public final Handler d;
    public final Runnable e;
    public volatile boolean f = false;

    public ohe(String str, long j, Runnable runnable, long j2) {
        this.f25391a = j;
        this.b = j;
        HandlerThread handlerThread = new HandlerThread(str + "-smooth-handler");
        this.c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.d = handler;
        handler.sendEmptyMessageDelayed(101, j2);
        this.e = runnable;
    }

    public final boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b150ef0", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (TimeUnit.NANOSECONDS.toMillis(j - this.b) >= 20000) {
            return true;
        }
        return false;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc750a1c", new Object[]{this});
        } else {
            this.c.quitSafely();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eae95ab", new Object[]{this});
        } else if (!this.f) {
            this.e.run();
            this.f = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (!this.f) {
            if (this.f25391a == 0) {
                this.f25391a = j;
                this.b = j;
            }
            if (a(j)) {
                Log.e("IdleFrameCallback", "triggered idle final timeout");
                this.d.sendEmptyMessage(101);
                return;
            }
            long j2 = j - this.f25391a;
            if (j2 >= b9u.FRAME_TIME_NANO) {
                long j3 = j2 / b9u.FRAME_TIME_NANO;
                if (j3 > 10) {
                    Log.e("IdleFrameCallback", "WARNING, skipped " + j3 + " frames, the application may be doing too much work on its main thread");
                    this.d.removeMessages(101);
                    this.d.removeMessages(100);
                    this.d.sendEmptyMessageDelayed(100, Math.max(j3 * 16, 2000L));
                }
            }
            this.f25391a = j;
            if (!this.f) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 100) {
            Log.e("IdleFrameCallback", "idle reached");
            c();
            b();
            return true;
        } else if (i != 101) {
            return false;
        } else {
            Log.e("IdleFrameCallback", "idle timeout");
            c();
            b();
            return true;
        }
    }
}
