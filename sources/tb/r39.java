package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27085a;
    public final t39 b;

    static {
        t2o.a(1007681540);
        t2o.a(1007681570);
    }

    public r39(String str) {
        ckf.g(str, "userId");
        this.f27085a = str;
        this.b = new t39(str);
    }

    public void a(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5959cb", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        this.b.p(xohVar, s29Var);
    }

    public void d(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c5ec6e", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        this.b.E(xohVar, s29Var);
    }

    public boolean b(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7763d0d", new Object[]{this, xohVar})).booleanValue();
        }
        ckf.g(xohVar, "requestParams");
        if (ckf.b(lpv.INSTANCE.a(), Boolean.FALSE)) {
            return false;
        }
        boolean b = k29.INSTANCE.b(this.f27085a, xohVar.c());
        this.b.t();
        return b;
    }

    public void c(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af619af7", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        this.b.n(xohVar.c());
        s29Var.onSuccess(true);
    }

    public void e(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d278d8b", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        if (ckf.b(lpv.INSTANCE.a(), Boolean.FALSE)) {
            s29Var.onSuccess(false);
            return;
        }
        String c = xohVar.c();
        if (k29.INSTANCE.b(this.f27085a, c)) {
            s29Var.onSuccess(true);
        } else {
            this.b.B(c, s29Var);
        }
    }
}
