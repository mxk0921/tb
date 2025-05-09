package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.popupWindow.ext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class szr implements hcb {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f28379a;

    static {
        t2o.a(725614633);
        t2o.a(81789202);
    }

    @Override // tb.hcb
    public String E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af1569a1", new Object[]{this});
        }
        return "aura/aura_waitpay_detail_float_config.json";
    }

    @Override // tb.hcb
    public IAURAPluginCenter[] I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("d15e88bb", new Object[]{this});
        }
        return ((hzr) this.f28379a.h("userContextPageAuraConfig", hzr.class, null)).d();
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f28379a = loVar;
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

    @Override // tb.hcb
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11a6d5ba", new Object[]{this});
        }
        return "aura.workflow.float";
    }

    @Override // tb.hcb
    public List<IAURAInputField> u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f7e946f9", new Object[]{this});
        }
        return null;
    }

    @Override // tb.hcb
    public lo v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("6246e0c0", new Object[]{this});
        }
        return new lo(this.f28379a.f(), this.f28379a.i());
    }
}
