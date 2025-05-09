package tb;

import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.model.DataReceiveMonitor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import tao.reactivex.h.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h3m<T> implements r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTROL_STREAM = "control_stream";
    public static final String DOWN_STREAM = "down_stream";
    public static final String UP_STREAM = "up_stream";

    /* renamed from: a  reason: collision with root package name */
    public final uzx<T> f20393a = a.P().M();
    public String b;

    static {
        t2o.a(628097167);
        t2o.a(628097533);
    }

    public jzx<T> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("d4a02a2b", new Object[]{this});
        }
        return this.f20393a.d(tao.reactivex.a.BUFFER).k();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec319c2c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        MsgLog.i("Pipe", "onComplete, name=" + this.b);
    }

    @Override // tb.r9y
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        th.printStackTrace();
        MsgLog.g("Pipe", "onError,  name=" + this.b, Log.getStackTraceString(th));
        MsgMonitor.a("MKT", "c_pipe_err", 1.0d);
    }

    @Override // tb.r9y
    public void onNext(T t) {
        DataReceiveMonitor dataReceiveMonitor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            return;
        }
        try {
            if ((t instanceof ikl) && (dataReceiveMonitor = ((ikl) t).o) != null) {
                dataReceiveMonitor.pipeTime = SystemClock.elapsedRealtime();
            }
            this.f20393a.onNext(t);
            MsgLog.e("Pipe", "onNext, name=" + this.b, t);
        } catch (Throwable th) {
            onError(th);
        }
    }

    @Override // tb.r9y
    public void onSubscribe(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
        }
    }
}
