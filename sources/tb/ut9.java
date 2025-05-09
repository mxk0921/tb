package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ut9 implements q7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final q7c f29601a = new m0k();

    static {
        t2o.a(779092292);
        t2o.a(806355895);
    }

    @Override // tb.q7c
    public void a(qt9 qt9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7231b9", new Object[]{this, qt9Var, new Boolean(z)});
        } else {
            ((m0k) this.f29601a).a(qt9Var, z);
        }
    }

    @Override // tb.q7c
    public void b(et9 et9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dccb9c9", new Object[]{this, et9Var});
        } else {
            ((m0k) this.f29601a).b(et9Var);
        }
    }

    @Override // tb.q7c
    public void c(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637f513", new Object[]{this, qt9Var, stkVar});
        } else {
            ((m0k) this.f29601a).c(qt9Var, stkVar);
        }
    }

    @Override // tb.q7c
    public void d(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b7aacf", new Object[]{this, qt9Var, stkVar});
        } else {
            ((m0k) this.f29601a).d(qt9Var, stkVar);
        }
    }

    @Override // tb.q7c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((m0k) this.f29601a).destroy();
        }
    }

    @Override // tb.q7c
    public boolean e(qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ddc460", new Object[]{this, qt9Var})).booleanValue();
        }
        return ((m0k) this.f29601a).e(qt9Var);
    }

    @Override // tb.q7c
    public void f(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b108505", new Object[]{this, qt9Var, stkVar});
        } else {
            ((m0k) this.f29601a).f(qt9Var, stkVar);
        }
    }

    @Override // tb.q7c
    public void g(et9 et9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2d60c6", new Object[]{this, et9Var});
        } else {
            ((m0k) this.f29601a).g(et9Var);
        }
    }

    @Override // tb.q7c
    public void h(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b04eafe", new Object[]{this, qt9Var, stkVar});
        } else {
            ((m0k) this.f29601a).h(qt9Var, stkVar);
        }
    }
}
