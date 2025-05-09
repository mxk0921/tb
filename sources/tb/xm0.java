package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.lifecycle.reset.state")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xm0 extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990002);
    }

    public static /* synthetic */ Object ipc$super(xm0 xm0Var, String str, Object... objArr) {
        if (str.hashCode() == 418368253) {
            super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/preload/AliBuyLifecycleResetGlobalStateExtension");
    }

    @Override // tb.ms, tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(ykVar, cgVar, z);
        j1i j1iVar = (j1i) L0().get("aura_parse_global_data_parse", j1i.class);
        if (j1iVar != null) {
            jn b = j1iVar.b();
            j1iVar.d(jn.c("", b.h(), b.g(), b.l(), b.i(), b.e(), b.d(), b.f()));
            L0().update("aura_parse_global_data_parse", j1iVar);
        }
    }
}
