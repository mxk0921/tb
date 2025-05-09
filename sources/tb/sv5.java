package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597061);
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        DinamicXEngine engine;
        qv5 H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e5c52a", new Object[]{dXWidgetNode});
        } else if (dXWidgetNode != null && (engine = dXWidgetNode.getEngine()) != null && (H = engine.H()) != null) {
            H.h(dXWidgetNode);
        }
    }

    public static void b(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ce75bf", new Object[]{dXWidgetNode, dXWidgetNode2});
        } else if (dXWidgetNode2 != null && dXWidgetNode != dXWidgetNode2 && dXWidgetNode2.getAutoId() == dXWidgetNode.getAutoId()) {
            a(dXWidgetNode);
        }
    }

    public static boolean c(DXWidgetNode dXWidgetNode, DXEvent dXEvent) {
        ov5 u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8f4d865", new Object[]{dXWidgetNode, dXEvent})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        if (dXRuntimeContext == null || (u = dXRuntimeContext.u()) == null) {
            return false;
        }
        boolean f = u.f();
        if (f && DinamicXEngine.j0()) {
            h36.g("EventChainCancel", "RL onEvent cancel by eventChain: " + dXEvent.getEventId());
        }
        return f;
    }
}
