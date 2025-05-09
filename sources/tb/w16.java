package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w16 implements wub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DXRuntimeContext f30392a;
    public final AbilityHubAdapter b;
    public final ovb c;

    static {
        t2o.a(444597904);
        t2o.a(444597907);
    }

    public w16(ovb ovbVar) {
        DXRuntimeContext dXRuntimeContext = (DXRuntimeContext) ovbVar.d();
        this.f30392a = dXRuntimeContext;
        this.b = dXRuntimeContext.r().w();
        ovbVar.f();
        this.c = ovbVar;
    }

    @Override // tb.bic
    public void a(kdb kdbVar, wub wubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e155791", new Object[]{this, kdbVar, wubVar});
        } else {
            d46.a(kdbVar, (DXRuntimeContext) wubVar.d());
        }
    }

    @Override // tb.wub
    public qwb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwb) ipChange.ipc$dispatch("229b4d22", new Object[]{this});
        }
        return this.f30392a;
    }

    @Override // tb.wub
    public AbilityHubAdapter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("82bec76f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.wub
    public ovb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovb) ipChange.ipc$dispatch("c37ed714", new Object[]{this});
        }
        return this.c;
    }
}
