package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class go6 implements a88 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k88 f20126a;
    public x1n<fxc> b;
    public x1n<sae> c;
    public x1n<fyp> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public k88 f20127a;

        static {
            t2o.a(511705335);
        }

        public a88 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a88) ipChange.ipc$dispatch("97adacff", new Object[]{this});
            }
            if (this.f20127a == null) {
                this.f20127a = new k88();
            }
            return new go6(this.f20127a);
        }

        public b() {
        }
    }

    static {
        t2o.a(511705333);
        t2o.a(511705336);
    }

    public static a88 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a88) ipChange.ipc$dispatch("a7f1630d", new Object[0]);
        }
        return new b().a();
    }

    @Override // tb.a88
    public void a(qv1 qv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788f01db", new Object[]{this, qv1Var});
        } else {
            e(qv1Var);
        }
    }

    @Override // tb.a88
    public void b(yke ykeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23076de", new Object[]{this, ykeVar});
        } else {
            f(ykeVar);
        }
    }

    public final void d(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee0e624", new Object[]{this, k88Var});
            return;
        }
        this.b = at7.a(t88.a(k88Var));
        this.c = at7.a(x88.a(k88Var));
        this.d = at7.a(u88.a(k88Var));
    }

    public final qv1 e(qv1 qv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qv1) ipChange.ipc$dispatch("8842129", new Object[]{this, qv1Var});
        }
        rv1.f(qv1Var, s88.a(this.f20126a));
        rv1.d(qv1Var, q88.a(this.f20126a));
        rv1.h(qv1Var, v88.a(this.f20126a));
        rv1.e(qv1Var, r88.a(this.f20126a));
        rv1.b(qv1Var, n88.a(this.f20126a));
        rv1.g(qv1Var, this.b.get());
        rv1.k(qv1Var, this.c.get());
        rv1.i(qv1Var, this.d.get());
        rv1.c(qv1Var, p88.a(this.f20126a));
        rv1.a(qv1Var, o88.a(this.f20126a));
        rv1.j(qv1Var, w88.a(this.f20126a));
        return qv1Var;
    }

    public final yke f(yke ykeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yke) ipChange.ipc$dispatch("e930ad72", new Object[]{this, ykeVar});
        }
        zke.a(ykeVar, this.d.get());
        return ykeVar;
    }

    public go6(k88 k88Var) {
        this.f20126a = k88Var;
        d(k88Var);
    }
}
