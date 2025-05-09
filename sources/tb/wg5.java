package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cv5;
import tb.xob;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wg5 implements xob<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cv5 f30677a;
    public final jfr<?> b;

    static {
        t2o.a(804257817);
        t2o.a(803209232);
    }

    public wg5(jfr<?> jfrVar) {
        ckf.g(jfrVar, "context");
        this.b = jfrVar;
        this.f30677a = new cv5.a(jfrVar.c()).c(true).b(true).a();
    }

    /* renamed from: b */
    public ug5 a(cc4 cc4Var, mb4<JSONObject> mb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug5) ipChange.ipc$dispatch("696c2031", new Object[]{this, cc4Var, mb4Var});
        }
        ckf.g(cc4Var, "info");
        ckf.g(mb4Var, "data");
        ug5 ug5Var = new ug5(this.b, this.f30677a);
        ug5Var.f(cc4Var);
        ug5Var.e(mb4Var);
        return ug5Var;
    }

    public final void c(long j, w8<?> w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e9c763", new Object[]{this, new Long(j), w8Var});
            return;
        }
        ckf.g(w8Var, "abilityBuilder");
        this.f30677a.a().J0(j, w8Var);
    }

    public final void d(long j, nb5 nb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c161a", new Object[]{this, new Long(j), nb5Var});
            return;
        }
        ckf.g(nb5Var, "dataParser");
        this.f30677a.a().V0(j, nb5Var);
    }

    @Override // tb.xob
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        xob.a.a(this);
        this.f30677a.c();
    }

    public final cv5 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv5) ipChange.ipc$dispatch("f215441b", new Object[]{this});
        }
        return this.f30677a;
    }
}
