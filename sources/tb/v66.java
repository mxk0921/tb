package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v66 extends w76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596943);
    }

    public static /* synthetic */ Object ipc$super(v66 v66Var, String str, Object... objArr) {
        if (str.hashCode() == 792275837) {
            super.a((svb) objArr[0], (svb) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/pipeline/opt/DXOptPipelineDiff");
    }

    @Override // tb.w76
    public void a(svb svbVar, svb svbVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f392b7d", new Object[]{this, svbVar, svbVar2, dXRuntimeContext});
        } else {
            super.a(svbVar, svbVar2, dXRuntimeContext);
        }
    }
}
