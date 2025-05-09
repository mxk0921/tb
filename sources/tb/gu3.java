package tb;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MULTI_CLICK_TIMEOUT = 250;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20236a;
    public final Handler b;
    public long c;
    public long d;
    public float e;
    public float f;
    public long g;
    public float h;
    public float i;
    public int j;
    public int k;
    public final c l;
    public final d m;
    public final Runnable n;
    public int o;
    public final Runnable p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gu3.a(gu3.this);
            if (gu3.b(gu3.this) != null) {
                gu3.b(gu3.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gu3.d(gu3.this);
            if (gu3.b(gu3.this) != null) {
                gu3.b(gu3.this).b(gu3.c(gu3.this), new PointF(gu3.e(gu3.this), gu3.f(gu3.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void a();

        void b(int i, PointF pointF);
    }

    static {
        t2o.a(806356463);
    }

    public gu3(Context context, c cVar) {
        this.f20236a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.l = cVar;
    }

    public static /* synthetic */ void a(gu3 gu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c085c983", new Object[]{gu3Var});
        } else {
            gu3Var.g();
        }
    }

    public static /* synthetic */ d b(gu3 gu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1689112", new Object[]{gu3Var});
        }
        return gu3Var.m;
    }

    public static /* synthetic */ int c(gu3 gu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab7a15f8", new Object[]{gu3Var})).intValue();
        }
        return gu3Var.o;
    }

    public static /* synthetic */ int d(gu3 gu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80802a00", new Object[]{gu3Var})).intValue();
        }
        int i = gu3Var.o;
        gu3Var.o = 1 + i;
        return i;
    }

    public static /* synthetic */ float e(gu3 gu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f43c36", new Object[]{gu3Var})).floatValue();
        }
        return gu3Var.h;
    }

    public static /* synthetic */ float f(gu3 gu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("966e6277", new Object[]{gu3Var})).floatValue();
        }
        return gu3Var.i;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.d = 0L;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0L;
        this.h = 0.0f;
        this.i = 0.0f;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void j(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1af1288", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.d = currentTimeMillis;
        this.e = f;
        this.f = f2;
        if (currentTimeMillis - this.c > 250) {
            this.o = 0;
        }
        this.b.removeCallbacks(this.n);
    }

    public boolean k(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d707985", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        this.c = this.g;
        long currentTimeMillis = System.currentTimeMillis();
        this.g = currentTimeMillis;
        this.h = f;
        this.i = f2;
        if (currentTimeMillis - this.d < 200 && Math.abs(this.e - f) < 10.0f && Math.abs(this.f - this.i) < 10.0f) {
            float f3 = this.i;
            if (f3 > this.j && f3 < iw0.e(this.f20236a) - this.k) {
                if (this.m != null) {
                    if (this.d - this.c < 250) {
                        this.b.post(this.p);
                    } else {
                        this.b.postDelayed(this.n, 250L);
                    }
                    return true;
                }
                c cVar = this.l;
                if (cVar != null) {
                    cVar.a();
                    return true;
                }
                return false;
            }
        }
        g();
        return false;
    }

    public gu3(Context context, d dVar) {
        this.f20236a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.m = dVar;
        this.n = new a();
        this.p = new b();
    }
}
