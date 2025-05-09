package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import tb.q8u;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class guq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final guq INSTANCE = new guq();

    static {
        t2o.a(919601365);
    }

    public final BaseSubPageComponent<?, ?> a(BaseOuterComponent.OuterComponentType outerComponentType, String str, String str2, qpu qpuVar, BaseServiceDelegate baseServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubPageComponent) ipChange.ipc$dispatch("c533da45", new Object[]{this, outerComponentType, str, str2, qpuVar, baseServiceDelegate});
        }
        ckf.g(outerComponentType, "outComponentType");
        ckf.g(str, "outComponentId");
        ckf.g(str2, "subPageType");
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(baseServiceDelegate, "serviceDelegate");
        q8u.a aVar = q8u.Companion;
        aVar.a("createSubPageComponent");
        TurboEngineConfig a2 = qpuVar.a();
        s4d g = a2.g();
        BaseSubPageComponent<?, ?> subPageComponent = g != null ? g.getSubPageComponent(str2, outerComponentType, str, qpuVar.getContext(), a2.f(), a2.n(), qpuVar.getInstanceId(), baseServiceDelegate) : null;
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, "SubPageCreator", "创建子页面组件，outComponentType=" + outerComponentType + "，outComponentId=" + str + "，subPageType=" + str2 + "，component=" + subPageComponent, null, 4, null);
        aVar.c();
        return subPageComponent;
    }
}
