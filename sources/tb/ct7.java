package tb;

import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ct7 implements View.OnClickListener, d0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long d = ViewConfiguration.getDoubleTapTimeout();
    public final d0c b;

    /* renamed from: a  reason: collision with root package name */
    public long f17300a = 0;
    public final b c = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f17301a;
        private float b;

        static {
            t2o.a(468713942);
        }

        private b() {
        }

        public static /* synthetic */ float a(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2a70576a", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.f17301a = f;
            return f;
        }

        public static /* synthetic */ float b(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b8fbd86b", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.b = f;
            return f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ct7.a(ct7.this, 0L);
            ct7.b(ct7.this).h(this.f17301a, this.b);
        }
    }

    static {
        t2o.a(468713940);
        t2o.a(468713944);
    }

    public ct7(d0c d0cVar) {
        this.b = d0cVar;
    }

    public static /* synthetic */ long a(ct7 ct7Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b26816e", new Object[]{ct7Var, new Long(j)})).longValue();
        }
        ct7Var.f17300a = j;
        return j;
    }

    public static /* synthetic */ d0c b(ct7 ct7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d0c) ipChange.ipc$dispatch("d6adae6b", new Object[]{ct7Var});
        }
        return ct7Var.b;
    }

    @Override // tb.d0c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
        } else {
            this.b.c();
        }
    }

    @Override // tb.d0c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
        } else {
            this.b.d();
        }
    }

    @Override // tb.d0c
    public boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.b.e(z);
    }

    @Override // tb.d0c
    public void f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.b.f(f, f2);
        }
    }

    @Override // tb.d0c
    public void g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.b.g(f, f2);
        }
    }

    @Override // tb.d0c
    public void h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.b.h(f, f2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = d;
        if (currentTimeMillis - this.f17300a < j) {
            this.f17300a = 0L;
            view.removeCallbacks(this.c);
            this.b.f(view.getPivotX(), view.getPivotY());
            return;
        }
        this.f17300a = currentTimeMillis;
        this.b.d();
        b.a(this.c, view.getPivotX());
        b.b(this.c, view.getPivotY());
        view.postDelayed(this.c, j);
    }
}
