package com.taobao.android.turbo.core.service.user;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import tb.a07;
import tb.ckf;
import tb.foc;
import tb.g7e;
import tb.m7e;
import tb.plk;
import tb.qpu;
import tb.t2o;
import tb.tpu;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class UserService implements m7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final plk<g7e> f9751a = new plk<>();
    public foc.a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601348);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601347);
        t2o.a(919601345);
    }

    public static final /* synthetic */ plk B(UserService userService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plk) ipChange.ipc$dispatch("f58bf906", new Object[]{userService});
        }
        return userService.f9751a;
    }

    @Override // tb.m7e
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return ud0.Companion.d().isLogin();
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        if (this.b != null) {
            foc d = ud0.Companion.d();
            foc.a aVar = this.b;
            ckf.d(aVar);
            d.a(aVar);
        }
    }

    @Override // tb.h7e
    public void r(g7e g7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a42cec", new Object[]{this, g7eVar});
            return;
        }
        ckf.g(g7eVar, DataReceiveMonitor.CB_LISTENER);
        if (this.b == null) {
            this.b = new foc.a() { // from class: com.taobao.android.turbo.core.service.user.UserService$addUserChangeListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.foc.a
                public void a(foc.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20fbe8ae", new Object[]{this, bVar});
                        return;
                    }
                    ckf.g(bVar, "user");
                    tpu.a.b(tpu.Companion, "UserService", "onUserChanged", null, 4, null);
                    UserService.B(UserService.this).d(new UserService$addUserChangeListener$1$onUserChange$1(bVar));
                }
            };
            foc d = ud0.Companion.d();
            foc.a aVar = this.b;
            ckf.d(aVar);
            d.b(aVar);
        }
        this.f9751a.a(g7eVar);
    }

    @Override // tb.h7e
    public void x(g7e g7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f80b88f", new Object[]{this, g7eVar});
            return;
        }
        ckf.g(g7eVar, DataReceiveMonitor.CB_LISTENER);
        this.f9751a.c(g7eVar);
    }
}
