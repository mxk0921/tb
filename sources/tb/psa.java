package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import de.greenrobot.event.EventBusException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class psa extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final hwl f26270a = new hwl();
    public final int b;
    public final hj8 c;
    public boolean d;

    public psa(hj8 hj8Var, Looper looper, int i) {
        super(looper);
        this.c = hj8Var;
        this.b = i;
    }

    public void a(gwq gwqVar, Object obj) {
        fwl a2 = fwl.a(gwqVar, obj);
        synchronized (this) {
            try {
                this.f26270a.a(a2);
                if (!this.d) {
                    this.d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                fwl b = this.f26270a.b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f26270a.b();
                        if (b == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.g(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (sendMessage(obtainMessage())) {
                this.d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }
}
