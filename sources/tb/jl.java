package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.performance.customStage")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class jl extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789176);
    }

    public static /* synthetic */ Object ipc$super(jl jlVar, String str, Object... objArr) {
        if (str.hashCode() == 1335413541) {
            super.beforeFlowExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/performance/AURAPerformanceCustomStageExtension");
    }

    public final void P0(List<AURAPerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb494f96", new Object[]{this, list});
            return;
        }
        List<gcb> f = J0().f(gcb.class);
        if (!bh.a(f)) {
            for (AURAPerformanceStageModel aURAPerformanceStageModel : list) {
                for (gcb gcbVar : f) {
                    gcbVar.s0(aURAPerformanceStageModel, null, false);
                }
            }
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        List<AURAPerformanceStageModel> L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, cgVar);
        Iterator it = J0().f(ht.class).iterator();
        while (it.hasNext() && (L = ((ht) it.next()).L()) != null) {
            P0(L);
        }
    }
}
