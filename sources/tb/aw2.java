package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.invoker.binder.BindException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aw2 implements ya2<BindingCallback, BridgeCallback> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uq f16036a;

    static {
        t2o.a(839909450);
        t2o.a(839909449);
    }

    public aw2(uq uqVar) {
        this.f16036a = uqVar;
    }

    /* renamed from: a */
    public BridgeCallback bind(Class<BridgeCallback> cls, BindingCallback bindingCallback) throws BindException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeCallback) ipChange.ipc$dispatch("54ffefed", new Object[]{this, cls, bindingCallback});
        }
        return new ey6(this.f16036a, bindingCallback.isSticky());
    }
}
