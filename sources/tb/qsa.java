package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qsa extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final iwl f26903a = new iwl();
    public final int b;
    public final mj8 c;
    public boolean d;

    static {
        t2o.a(723517462);
    }

    public qsa(mj8 mj8Var, Looper looper, int i) {
        super(looper);
        this.c = mj8Var;
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(qsa qsaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/event/HandlerPoster");
    }

    public void a(iwq iwqVar, Event event, kj8 kj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1646f16d", new Object[]{this, iwqVar, event, kj8Var});
            return;
        }
        gwl a2 = gwl.a(iwqVar, event, kj8Var);
        synchronized (this) {
            try {
                this.f26903a.a(a2);
                if (!this.d) {
                    this.d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new RuntimeException("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                gwl b = this.f26903a.b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f26903a.b();
                        if (b == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.d(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (sendMessage(obtainMessage())) {
                this.d = true;
                return;
            }
            throw new RuntimeException("Could not send handler message");
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }
}
