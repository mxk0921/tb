package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444598013);
    }

    public static qvb.a a(DXRuntimeContext dXRuntimeContext, int i) {
        qvb M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb.a) ipChange.ipc$dispatch("47a31d11", new Object[]{dXRuntimeContext, new Integer(i)});
        }
        if (dXRuntimeContext == null || (M = dXRuntimeContext.s().f().M()) == null) {
            return null;
        }
        try {
            return M.c(dXRuntimeContext, i, g.s().e(), null);
        } catch (Throwable th) {
            xv5.b(th);
            return new qvb.a(false, th.getMessage(), uw5.V());
        }
    }

    public static qvb.a b(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb.a) ipChange.ipc$dispatch("6002c3ab", new Object[]{dXWidgetNode, new Integer(i)});
        }
        qvb M = dXWidgetNode.getDXRuntimeContext().s().f().M();
        if (M == null) {
            return null;
        }
        try {
            return M.c(dXWidgetNode.getDXRuntimeContext(), i, g.s().e(), null);
        } catch (Exception e) {
            xv5.b(e);
            return new qvb.a(false, e.getMessage(), uw5.V());
        }
    }
}
