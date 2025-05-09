package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ihz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final chz<hhz.m> f21317a = new chz<>(10);
    public final chz<hhz.d> b = new chz<>(10);
    public final chz<hhz.g> c = new chz<>(10);
    public final chz<hhz.i> d = new chz<>(10);
    public final chz<hhz.f> e = new chz<>(10);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737352);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737351);
    }

    public final hhz a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("3797eb65", new Object[]{this, new Double(d)});
        }
        if (this.b.d()) {
            this.b.pop().K(d);
        }
        return hhz.Companion.b(d);
    }

    public final hhz b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("9cf5040a", new Object[]{this, new Float(f)});
        }
        if (this.e.d()) {
            this.e.pop().K(f);
        }
        return hhz.Companion.c(f);
    }

    public final hhz c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("1b40135a", new Object[]{this, new Integer(i)});
        }
        if (this.c.d()) {
            this.c.pop().K(i);
        }
        return hhz.Companion.d(i);
    }

    public final hhz d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("8fd0ab20", new Object[]{this, new Long(j)});
        }
        if (this.d.d()) {
            this.d.pop().K(j);
        }
        return hhz.Companion.e(j);
    }

    public final hhz e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("4f8d6e2f", new Object[]{this, str});
        }
        if (str == null) {
            return hhz.Companion.m();
        }
        if (!this.f21317a.d()) {
            return hhz.Companion.g(str);
        }
        hhz.m pop = this.f21317a.pop();
        pop.K(str);
        return pop;
    }

    public final void f(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d106cc59", new Object[]{this, hhzVar});
        } else if (hhzVar == null || !hhzVar.t()) {
            if (hhzVar instanceof hhz.g) {
                if (this.c.e()) {
                    this.c.push(hhzVar);
                }
            } else if (hhzVar instanceof hhz.i) {
                if (this.d.e()) {
                    this.d.push(hhzVar);
                }
            } else if (hhzVar instanceof hhz.m) {
                if (this.f21317a.e()) {
                    this.f21317a.push(hhzVar);
                }
            } else if (hhzVar instanceof hhz.f) {
                if (this.e.e()) {
                    this.e.push(hhzVar);
                }
            } else if ((hhzVar instanceof hhz.d) && this.b.e()) {
                this.b.push(hhzVar);
            }
        }
    }
}
