package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ww5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jw5<uw5> f30962a = new jw5<>(10);

    static {
        t2o.a(444597988);
    }

    public ww5() {
        for (int i = 0; i < 10; i++) {
            this.f30962a.c(new uw5());
        }
    }

    public uw5 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("2fb2513c", new Object[]{this});
        }
        if (this.f30962a.d() > 0) {
            return this.f30962a.b();
        }
        return new uw5();
    }

    public uw5 b(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("232ef2c9", new Object[]{this, new Double(d)});
        }
        uw5 a2 = a();
        a2.k(d);
        return a2;
    }

    public uw5 c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("eaf87c13", new Object[]{this, new Long(j)});
        }
        uw5 a2 = a();
        a2.l(j);
        return a2;
    }

    public uw5 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("3478eebf", new Object[]{this, str});
        }
        if (str == null) {
            return uw5.V();
        }
        uw5 a2 = a();
        a2.m(str);
        return a2;
    }

    public uw5 e(uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("a8e1c6df", new Object[]{this, uw5Var});
        }
        uw5 a2 = a();
        a2.f29645a = uw5Var.f29645a;
        a2.c = uw5Var.c;
        a2.b = uw5Var.b;
        a2.d = uw5Var.d;
        return a2;
    }

    public void f(uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e96100f", new Object[]{this, uw5Var});
        } else if (uw5Var != null && uw5Var != uw5.NULL_VAR && uw5Var != uw5.VOID_VAR && uw5Var != uw5.TRUE_VAR && uw5Var != uw5.FALSE_VAR && this.f30962a.d() != 10) {
            uw5Var.Z();
            this.f30962a.c(uw5Var);
        }
    }
}
