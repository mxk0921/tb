package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class oue implements cfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final arb f25662a;
    public final quq b;

    static {
        t2o.a(486539266);
        t2o.a(488636419);
    }

    public oue(arb arbVar, qve qveVar) {
        fve.e("InfoFlowContext", arbVar.getContainerId() + " InfoFlowContext");
        this.f25662a = arbVar;
        quq quqVar = new quq();
        this.b = quqVar;
        c(quqVar, qveVar);
    }

    @Override // tb.cfc
    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISubService) ipChange.ipc$dispatch("3e2437be", new Object[]{this, cls}));
        }
        long nanoTime = System.nanoTime();
        T t = (T) this.b.d(cls);
        if (t == null) {
            fve.e("InfoFlowContext", "未找到服务：".concat(cls.getName()));
            return null;
        }
        if (eue.b()) {
            fve.k("InfoFlowContext", this.f25662a.getContainerId() + " findSubService : " + t.getClass().getName() + " ，耗时：" + (System.nanoTime() - nanoTime) + " ns");
        }
        return t;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        fve.e("InfoFlowContext", this.f25662a.getContainerId() + " destroy");
        Log.e("InfoFlowContext", this.f25662a.getContainerId() + " destroy");
        this.b.h();
    }

    public final void c(quq quqVar, qve qveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a784ef06", new Object[]{this, quqVar, qveVar});
            return;
        }
        z67 z67Var = new z67();
        quqVar.j(z67Var.a());
        if (qveVar != null) {
            quqVar.j(qveVar.a().a());
        }
        quqVar.f(this, z67Var.b());
    }

    @Override // tb.cfc
    public arb getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arb) ipChange.ipc$dispatch("6e3f0e14", new Object[]{this});
        }
        return this.f25662a;
    }
}
