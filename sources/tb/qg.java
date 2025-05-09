package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.lifecycle.dxEngine.config.autoTrack")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qg implements dbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788992);
        t2o.a(81788962);
    }

    @Override // tb.dbb
    public void O(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d731be67", new Object[]{this, sVar});
        } else {
            sVar.s(rg.DX_EVENT_AURA_EXPOSURE, new rg());
        }
    }

    @Override // tb.dbb
    public DXEngineConfig getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
