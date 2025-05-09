package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.stream")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ho0 extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990009);
    }

    public static /* synthetic */ Object ipc$super(ho0 ho0Var, String str, Object... objArr) {
        if (str.hashCode() == 418368253) {
            super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/stream/AliBuyStreamResponseLifecycleExtension");
    }

    public final void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e158730", new Object[]{this});
            return;
        }
        io0 io0Var = (io0) L0().get("aliBuyGlobalDataStreamResponseProcessor", io0.class);
        if (io0Var != null) {
            ck.g().e("stream", "流程结束");
            if (!io0Var.r()) {
                ck.g().e("stream", "流式数据返回，执行pending事件");
                io0Var.l(M0().c());
            }
        }
    }

    @Override // tb.ms, tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(ykVar, cgVar, z);
        if (!z) {
            P0();
        }
    }
}
