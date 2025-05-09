package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e25 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ValueAnimator.AnimatorUpdateListener c;
    public ValueAnimator d;
    public Animator.AnimatorListener e;
    public int f;
    public ValueAnimator g;
    public float h;

    /* renamed from: a  reason: collision with root package name */
    public int f18222a = 12;
    public int b = 1;
    public long i = 0;
    public long j = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ValueAnimator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/CustomVerticalSyncAnimation$1");
        }

        @Override // android.animation.ValueAnimator
        public Object getAnimatedValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e009a6b3", new Object[]{this});
            }
            return Float.valueOf(e25.a(e25.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Choreographer f18224a;

        public b(Choreographer choreographer) {
            this.f18224a = choreographer;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                return;
            }
            int c = e25.c(e25.this);
            e25 e25Var = e25.this;
            if (c > e25Var.f18222a) {
                e25.b(e25Var, 1.0f);
                e25 e25Var2 = e25.this;
                e25Var2.c.onAnimationUpdate(e25.e(e25Var2));
                e25 e25Var3 = e25.this;
                e25Var3.e.onAnimationEnd(e25Var3.d);
                return;
            }
            e25.g(e25Var, System.currentTimeMillis());
            long f = e25.f(e25.this) - e25.h(e25.this);
            e25 e25Var4 = e25.this;
            if (f < e25Var4.f) {
                this.f18224a.postFrameCallback(this);
                return;
            }
            e25.i(e25Var4, e25.f(e25Var4));
            e25 e25Var5 = e25.this;
            e25.b(e25Var5, e25.c(e25Var5) / e25.this.f18222a);
            e25 e25Var6 = e25.this;
            e25Var6.c.onAnimationUpdate(e25.e(e25Var6));
            this.f18224a.postFrameCallback(this);
            e25.d(e25.this);
        }
    }

    static {
        t2o.a(352322002);
    }

    public static /* synthetic */ float a(e25 e25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5927254f", new Object[]{e25Var})).floatValue();
        }
        return e25Var.h;
    }

    public static /* synthetic */ float b(e25 e25Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca0b0cef", new Object[]{e25Var, new Float(f)})).floatValue();
        }
        e25Var.h = f;
        return f;
    }

    public static /* synthetic */ int c(e25 e25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ed281d3", new Object[]{e25Var})).intValue();
        }
        return e25Var.b;
    }

    public static /* synthetic */ int d(e25 e25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7026c7db", new Object[]{e25Var})).intValue();
        }
        int i = e25Var.b;
        e25Var.b = 1 + i;
        return i;
    }

    public static /* synthetic */ ValueAnimator e(e25 e25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("7d6083c5", new Object[]{e25Var});
        }
        return e25Var.g;
    }

    public static /* synthetic */ long f(e25 e25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a293ad6", new Object[]{e25Var})).longValue();
        }
        return e25Var.j;
    }

    public static /* synthetic */ long g(e25 e25Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("394bb6d4", new Object[]{e25Var, new Long(j)})).longValue();
        }
        e25Var.j = j;
        return j;
    }

    public static /* synthetic */ long h(e25 e25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efd49757", new Object[]{e25Var})).longValue();
        }
        return e25Var.i;
    }

    public static /* synthetic */ long i(e25 e25Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90bea73", new Object[]{e25Var, new Long(j)})).longValue();
        }
        e25Var.i = j;
        return j;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579958cd", new Object[]{this})).booleanValue();
        }
        if (this.c == null || this.d == null || this.e == null) {
            return false;
        }
        this.g = new a();
        b bVar = new b(Choreographer.getInstance());
        this.e.onAnimationStart(this.d);
        bVar.doFrame(0L);
        return true;
    }
}
