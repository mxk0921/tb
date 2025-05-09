package tb;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class h0s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f20349a;
    public final long b;
    public long c;
    public boolean d = false;
    public boolean f = false;
    public final a e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779093372);
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/utils/TCountDownTimer$TimerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            synchronized (h0s.this) {
                try {
                    if (!h0s.a(h0s.this)) {
                        long b = h0s.b(h0s.this) - SystemClock.elapsedRealtime();
                        if (b <= 0) {
                            h0s.this.e();
                            h0s.this.f = false;
                        } else if (b < h0s.c(h0s.this)) {
                            sendMessageDelayed(obtainMessage(1), b);
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            h0s.this.f(b);
                            long c = (elapsedRealtime + h0s.c(h0s.this)) - SystemClock.elapsedRealtime();
                            while (c < 0) {
                                c += h0s.c(h0s.this);
                            }
                            sendMessageDelayed(obtainMessage(1), c);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        t2o.a(779093371);
    }

    public h0s(long j, long j2) {
        this.f20349a = j;
        this.b = j2;
    }

    public static /* synthetic */ boolean a(h0s h0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6043d84", new Object[]{h0sVar})).booleanValue();
        }
        return h0sVar.d;
    }

    public static /* synthetic */ long b(h0s h0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f01fbc13", new Object[]{h0sVar})).longValue();
        }
        return h0sVar.c;
    }

    public static /* synthetic */ long c(h0s h0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3b3ab2", new Object[]{h0sVar})).longValue();
        }
        return h0sVar.b;
    }

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.d = true;
        this.f = false;
        this.e.removeMessages(1);
    }

    public abstract void e();

    public abstract void f(long j);

    public final synchronized h0s g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0s) ipChange.ipc$dispatch("33eb2d30", new Object[]{this});
        }
        this.d = false;
        if (this.f20349a <= 0) {
            e();
            return this;
        }
        this.c = SystemClock.elapsedRealtime() + this.f20349a;
        a aVar = this.e;
        aVar.sendMessage(aVar.obtainMessage(1));
        this.f = true;
        return this;
    }
}
