package tb;

import android.os.CountDownTimer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l5q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<b> f23124a;
    public CountDownTimer b;
    public long c;
    public final long d;
    public long e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/widgetnode/SmartCountDownTimer$1");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                l5q.this.c();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            } else {
                l5q.this.d(j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(long j);

        void c();
    }

    static {
        t2o.a(295699819);
    }

    public l5q(long j, long j2) {
        this.c = j;
        this.e = j;
        this.d = j2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.f = false;
        CountDownTimer countDownTimer = this.b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("736a7558", new Object[]{this});
        }
        WeakReference<b> weakReference = this.f23124a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f23124a.get();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        this.f = false;
        if (b() != null) {
            b().c();
        }
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            return;
        }
        this.e = j;
        if (b() != null) {
            b().a(j);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.f = false;
        CountDownTimer countDownTimer = this.b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.b = null;
            this.c = this.e;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            g();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new a(this.c, this.d);
        }
        if (!this.f) {
            this.f = true;
            this.b.start();
        }
    }

    public void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0df6f7", new Object[]{this, bVar});
        } else if (bVar == null) {
            this.f23124a = null;
        } else {
            this.f23124a = new WeakReference<>(bVar);
        }
    }
}
