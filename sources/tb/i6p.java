package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class i6p implements z8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final z8e f21129a = new q5p();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793507);
        }
    }

    static {
        t2o.a(815793506);
        t2o.a(993001708);
    }

    @Override // tb.z8e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7082ac8d", new Object[]{this});
        } else {
            ((qz) this.f21129a).a();
        }
    }

    @Override // tb.z8e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2580662b", new Object[]{this});
        } else {
            ((qz) this.f21129a).b();
        }
    }

    @Override // tb.z8e
    public void c(y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687fc934", new Object[]{this, y8eVar});
            return;
        }
        ckf.g(y8eVar, "videoList");
        ((q5p) this.f21129a).c(y8eVar);
    }

    @Override // tb.z8e
    public void d(boolean z, y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df90f09b", new Object[]{this, new Boolean(z), y8eVar});
            return;
        }
        ckf.g(y8eVar, "videoList");
        ((qz) this.f21129a).d(z, y8eVar);
    }

    @Override // tb.z8e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((qz) this.f21129a).destroy();
        }
    }

    @Override // tb.z8e
    public void e(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566214d1", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((qz) this.f21129a).e(wg3Var, i);
        }
    }

    @Override // tb.z8e
    public void f(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("412a370c", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((qz) this.f21129a).f(wg3Var, i);
        }
    }

    @Override // tb.z8e
    public void g(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62a2c", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((qz) this.f21129a).g(wg3Var, i);
        }
    }

    @Override // tb.z8e
    public void h(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335241df", new Object[]{this, wg3Var, new Integer(i)});
        } else {
            ((qz) this.f21129a).h(wg3Var, i);
        }
    }

    @Override // tb.z8e
    public void i(boolean z, y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b44b46e", new Object[]{this, new Boolean(z), y8eVar});
            return;
        }
        ckf.g(y8eVar, "videoList");
        ((qz) this.f21129a).i(z, y8eVar);
    }

    @Override // tb.z8e
    public void j(y8e y8eVar, wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd456d54", new Object[]{this, y8eVar, wg3Var, new Integer(i)});
            return;
        }
        ckf.g(y8eVar, "videoList");
        ckf.g(wg3Var, "currentPlayable");
        ((qz) this.f21129a).j(y8eVar, wg3Var, i);
    }
}
