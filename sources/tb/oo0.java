package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.submit.result.handler")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oo0 implements ycb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f25521a;

    static {
        t2o.a(301989949);
        t2o.a(81789144);
    }

    public final void B(AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592dbc83", new Object[]{this, aURARenderComponent, list});
            return;
        }
        for (Event event : list) {
            qi qiVar = new qi();
            qiVar.p(event.getId());
            qiVar.t(aURARenderComponent);
            qiVar.o(event.getTag());
            qiVar.n(event.getFields());
            pi.b(this.f25521a.c(), event.getType(), qiVar);
        }
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
            this.f25521a = loVar;
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

    public final AURARenderComponent r(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("74754a6a", new Object[]{this, renderComponent});
        }
        if (renderComponent == null) {
            return null;
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = renderComponent.getKey();
        Component component = renderComponent.getComponent();
        aURARenderComponent.data = new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), null, component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
        return aURARenderComponent;
    }

    @Override // tb.ycb
    public boolean w(RenderComponent renderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25a75e29", new Object[]{this, renderComponent, map})).booleanValue();
        }
        List<Event> x = x(renderComponent);
        if (x != null) {
            B(r(renderComponent), x);
        }
        return false;
    }

    public final List<Event> x(RenderComponent renderComponent) {
        Map<String, List<Event>> events;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d31788b6", new Object[]{this, renderComponent});
        }
        if (renderComponent == null || (events = renderComponent.getComponent().getEvents()) == null) {
            return null;
        }
        return events.get("onValidateFail");
    }
}
