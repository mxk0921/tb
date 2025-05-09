package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.submit.linkage.config")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zzr implements wcb {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f33130a;

    static {
        t2o.a(725614632);
        t2o.a(81789143);
    }

    @Override // tb.wcb
    public String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9851915", new Object[]{this});
        }
        return g4o.KEY_SERVICE_NAME;
    }

    @Override // tb.wcb
    public AURANextRPCEndpoint k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("8473fde7", new Object[]{this});
        }
        return ((hzr) this.f33130a.h("userContextPageAuraConfig", hzr.class, null)).c();
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f33130a = loVar;
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
