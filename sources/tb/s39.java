package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s39 INSTANCE = new s39();

    static {
        t2o.a(1007681561);
        t2o.a(1007681570);
    }

    public void a(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5959cb", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        rdp.INSTANCE.c(srv.b()).a(xohVar, s29Var);
    }

    public boolean b(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7763d0d", new Object[]{this, xohVar})).booleanValue();
        }
        ckf.g(xohVar, "requestParams");
        return rdp.INSTANCE.c(srv.b()).b(xohVar);
    }

    public void c(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af619af7", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        rdp.INSTANCE.c(srv.b()).c(xohVar, s29Var);
    }

    public void d(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c5ec6e", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        rdp.INSTANCE.c(srv.b()).d(xohVar, s29Var);
    }

    public void e(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d278d8b", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        rdp.INSTANCE.c(srv.b()).e(xohVar, s29Var);
    }
}
