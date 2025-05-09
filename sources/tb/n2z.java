package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n2z extends i2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737247);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2z(ComponentDescriptorParameters componentDescriptorParameters) {
        super(componentDescriptorParameters);
        ckf.g(componentDescriptorParameters, PushConstants.PARAMS);
    }

    public static /* synthetic */ Object ipc$super(n2z n2zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/ConcreteComponentDescriptor");
    }

    @Override // tb.i2z
    public xhz a(qgz qgzVar, vgz vgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhz) ipChange.ipc$dispatch("b73246a6", new Object[]{this, qgzVar, vgzVar});
        }
        ckf.g(qgzVar, "eventDispatcher");
        ckf.g(vgzVar, "eventTarget");
        return new xhz(qgzVar, vgzVar);
    }

    @Override // tb.i2z
    public jkz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("44d30334", new Object[]{this});
        }
        return h().invoke();
    }
}
