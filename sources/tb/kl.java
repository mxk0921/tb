package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.performance")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kl extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789177);
    }

    public static /* synthetic */ Object ipc$super(kl klVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1162528052:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
                return null;
            case -25033014:
                super.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            case 148614476:
                super.afterServiceExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 418368253:
                super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1111077198:
                super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            case 1335413541:
                super.beforeFlowExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/performance/AURAPerformanceExtension");
        }
    }

    public final Map<String, String> P0(yk ykVar, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cef08fe4", new Object[]{this, ykVar, cgVar});
        }
        if (!Q0(cgVar)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Serializable b = ykVar.b();
        if (!(b instanceof AURAEventIO)) {
            return null;
        }
        hashMap.put("eventType", ((AURAEventIO) b).getEventType());
        return hashMap;
    }

    public final boolean Q0(cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20cc635", new Object[]{this, cgVar})).booleanValue();
        }
        return ri.CODE.equals(cgVar.b());
    }

    public final void R0(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7365dcac", new Object[]{this, ykVar, cgVar, new Boolean(z)});
        } else if (tk.NEXT_RPC_SERVICE_CODE.equals(cgVar.b())) {
            Serializable b = ykVar.b();
            if (b instanceof AURAParseIO) {
                fn fnVar = new fn((AURAParseIO) b);
                Map<String, String> b2 = fnVar.b();
                List<AURAPerformanceStageModel> c = fnVar.c();
                if (b2 != null || !bh.a(c)) {
                    for (gcb gcbVar : J0().f(gcb.class)) {
                        if (b2 != null) {
                            gcbVar.P(b2);
                        }
                        if (c != null) {
                            for (AURAPerformanceStageModel aURAPerformanceStageModel : c) {
                                gcbVar.s0(aURAPerformanceStageModel, tk.NEXT_RPC_SERVICE_CODE, false);
                            }
                        }
                    }
                }
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
        for (gcb gcbVar : J0().f(gcb.class)) {
            gcbVar.v0(cgVar.a(), z, null);
        }
    }

    @Override // tb.ms, tb.xab
    public void afterServiceExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbad4c", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(ykVar, cgVar, z);
        List<gcb> f = J0().f(gcb.class);
        Map<String, String> P0 = P0(ykVar, cgVar);
        for (gcb gcbVar : f) {
            gcbVar.i0(cgVar.b(), z, P0);
        }
        R0(ykVar, cgVar, z);
    }

    @Override // tb.ms, tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, cgVar);
        for (gcb gcbVar : J0().f(gcb.class)) {
            gcbVar.Z(cgVar.a(), "流程耗时");
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        for (gcb gcbVar : J0().f(gcb.class)) {
            gcbVar.q(cgVar.b(), "服务耗时");
        }
    }

    @Override // tb.ms, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        }
    }

    @Override // tb.ms, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
