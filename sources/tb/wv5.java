package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class wv5 implements nvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte eventType;

    static {
        t2o.a(444597969);
        t2o.a(444597968);
    }

    public qvb.a exeExprWithIndex(DXWidgetNode dXWidgetNode, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb.a) ipChange.ipc$dispatch("787fcaf0", new Object[]{this, dXWidgetNode, new Integer(i), map});
        }
        qvb M = dXWidgetNode.getDXRuntimeContext().s().f().M();
        if (M == null) {
            return null;
        }
        qvb.a c = M.c(dXWidgetNode.getDXRuntimeContext(), i, g.s().e(), map);
        if (!DinamicXEngine.j0() || (c != null && c.f26952a)) {
            return c;
        }
        throw new RuntimeException(c.b);
    }

    public byte getEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23373fb1", new Object[]{this})).byteValue();
        }
        return this.eventType;
    }
}
