package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "albbcashier.impl.submit.result.monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class al1 implements ycb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f15800a;

    static {
        t2o.a(860880924);
        t2o.a(81789144);
    }

    @Override // tb.ycb
    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd087b5", new Object[]{this});
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f15800a = loVar;
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

    @Override // tb.ycb
    public boolean w(RenderComponent renderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25a75e29", new Object[]{this, renderComponent, map})).booleanValue();
        }
        if ((renderComponent != null && ("overseaPayType".equals(renderComponent.key) || "overseaPaymentMethod".equals(renderComponent.key))) || "overseaPaymentMethod_OvsPaymentCardVO".equals(renderComponent.key)) {
            nbb c = this.f15800a.c();
            if (this.f15800a != null) {
                for (Event event : renderComponent.component.events.get("itemClick")) {
                    jh.a(c, event, fxu.f(renderComponent), map);
                }
            }
        }
        return false;
    }
}
