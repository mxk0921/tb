package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class azo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16098a = 0;
    public int b = 0;
    public long c = 0;
    public int d = 0;
    public int e = Integer.MIN_VALUE;
    public int f = Integer.MIN_VALUE;
    public boolean g = false;
    public w2w h = w2w.EMPTY_LISTENER;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                azo.b(azo.this).g(azo.a(azo.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                azo.b(azo.this).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                azo.b(azo.this).c();
            }
        }
    }

    static {
        t2o.a(503317518);
        t2o.a(503317522);
    }

    public azo(Context context) {
        f(context, akt.J2(4000), akt.I2(2500));
    }

    public static /* synthetic */ int a(azo azoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ea93c8f", new Object[]{azoVar})).intValue();
        }
        return azoVar.d;
    }

    public static /* synthetic */ w2w b(azo azoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2w) ipChange.ipc$dispatch("523c7c4a", new Object[]{azoVar});
        }
        return azoVar.h;
    }

    public final void c(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9c5639", new Object[]{this, new Integer(i)});
            return;
        }
        this.b += i;
        int i3 = this.f16098a + 1;
        this.f16098a = i3;
        if (i3 >= 8) {
            long i4 = i();
            if (this.b != 0) {
                long j = this.c;
                if (j > 0 && i4 > j) {
                    g((int) ((i2 * 1000) / (i4 - j)));
                }
            }
            this.b = 0;
            this.f16098a = 0;
            this.c = i4;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f16098a = 0;
        this.b = 0;
        this.c = 0L;
        g(0);
    }

    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ef290", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < i2 || i2 <= 0) {
            throw new IllegalArgumentException("应该确保upThreshold >= downThreshold > 0");
        } else {
            this.e = i;
            this.f = i2;
        }
    }

    public void f(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6fffa7", new Object[]{this, context, new Integer(i), new Integer(i2)});
        } else if (i < i2 || i2 <= 0) {
            throw new IllegalArgumentException("应该确保upThreshold >= downThreshold > 0");
        } else {
            e(s6o.c(context, i), s6o.c(context, i2));
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13fe75d", new Object[]{this, new Integer(i)});
        } else if (i != this.d) {
            this.d = i;
            nwv.y0(new a());
            if (this.e != Integer.MIN_VALUE && this.f != Integer.MIN_VALUE) {
                if (this.g) {
                    if (Math.abs(this.d) < this.f) {
                        this.g = false;
                        nwv.y0(new b());
                    }
                } else if (Math.abs(this.d) > this.e) {
                    this.g = true;
                    nwv.y0(new c());
                }
            }
        }
    }

    public void h(w2w w2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c96325", new Object[]{this, w2wVar});
            return;
        }
        if (w2wVar == null) {
            w2wVar = w2w.EMPTY_LISTENER;
        }
        this.h = w2wVar;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79d83291", new Object[]{this})).longValue();
        }
        return SystemClock.uptimeMillis();
    }
}
