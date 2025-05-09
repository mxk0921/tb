package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pue implements cfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26313a;
    public final Class<?> b;

    static {
        t2o.a(486539267);
        t2o.a(488636419);
    }

    public pue(cfc cfcVar, Class<?> cls) {
        this.f26313a = cfcVar;
        this.b = cls;
    }

    @Override // tb.cfc
    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISubService) ipChange.ipc$dispatch("3e2437be", new Object[]{this, cls}));
        }
        T t = (T) this.f26313a.a(cls);
        if (t != null && eue.b()) {
            fve.k("InfoFlowContextWrapper", "服务：" + this.b.getSimpleName() + " 查找服务 ： " + t.getClass().getSimpleName());
        }
        return t;
    }

    public cfc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("b1bd3794", new Object[]{this});
        }
        return this.f26313a;
    }

    @Override // tb.cfc
    public arb getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arb) ipChange.ipc$dispatch("6e3f0e14", new Object[]{this});
        }
        return this.f26313a.getContainerType();
    }
}
