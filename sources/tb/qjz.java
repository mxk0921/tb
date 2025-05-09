package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class qjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public int f26790a;
    public int b;
    public long c = iaz.a(0, 0);
    public long d = v2z.b(0, 0, 0, 0, 15, null);
    public long e = eaz.Companion.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737033);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737032);
        t2o.a(598737031);
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcdef62b", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aac0959c", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbb93fc", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3157c285", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d4e1b0f", new Object[]{this})).intValue();
        }
        return this.f26790a;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35c05f5", new Object[]{this});
            return;
        }
        this.f26790a = hfn.h(haz.f(i()), u2z.n(j()), u2z.l(j()));
        this.b = hfn.h(haz.e(i()), u2z.m(j()), u2z.k(j()));
        s(faz.a((this.f26790a - haz.f(i())) / 2, (this.b - haz.e(i())) / 2));
    }

    public final void m(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb696ee", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            n(faz.a(i, i2));
        }
    }

    public final void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7813fc5", new Object[]{this, new Long(j)});
        } else {
            o(j);
        }
    }

    public final void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30888060", new Object[]{this, new Long(j)});
            return;
        }
        long g = g();
        p(faz.a(eaz.d(j) + eaz.d(g), eaz.e(j) + eaz.e(g)));
    }

    public abstract void p(long j);

    public final void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6773d8", new Object[]{this, new Long(j)});
        } else {
            o(j);
        }
    }

    public final void r(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6905dda", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            q(faz.a(i, i2));
        }
    }

    public final void s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0543280", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public final void t(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67d12d5", new Object[]{this, new Long(j)});
            return;
        }
        this.c = j;
        l();
    }

    public final void u(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c3e2d3", new Object[]{this, new Long(j)});
            return;
        }
        this.d = j;
        l();
    }
}
