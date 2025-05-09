package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;
import tb.dw5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rb6 extends fw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596704);
    }

    public static /* synthetic */ Object ipc$super(rb6 rb6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/DXScriptNode");
    }

    @Override // tb.fw5
    public Object b(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        dw5 dw5Var;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1f85463f", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        if (dXEvent != null) {
            try {
                if (dXEvent.isPrepareBind()) {
                    return null;
                }
            } catch (Throwable th) {
                xv5.b(th);
                ic5.r(dXRuntimeContext, "DX_SCRIPT", "DX_SCRIPT_ERROR", f.DXSCRIPT_SCRIPT_NODE_ERROR, xv5.a(th));
                return null;
            }
        }
        if (dXRuntimeContext.s() == null) {
            dw5Var = null;
        } else {
            dw5Var = dXRuntimeContext.s().d();
        }
        if (dw5Var == null) {
            return null;
        }
        if (dXRuntimeContext.p() == null) {
            str = null;
        } else {
            str = dXRuntimeContext.p().d();
        }
        if (!dw5Var.a(str)) {
            DXWidgetNode W = dXRuntimeContext.W();
            if (W == null) {
                h36.h(str + " 执行表达式失败: thisNode == null");
                return null;
            }
            DXWidgetNode queryRootWidgetNode = W.queryRootWidgetNode();
            if (queryRootWidgetNode == null) {
                h36.h(str + " 执行表达式失败: rootNode == null)");
                return null;
            }
            byte[] dxExprBytes = queryRootWidgetNode.getDxExprBytes();
            if (dxExprBytes == null) {
                return null;
            }
            dw5Var.b(str, dxExprBytes, 0);
        }
        HashMap hashMap = new HashMap();
        if (!(dXEvent == null || dXEvent.getArgs() == null)) {
            hashMap.putAll(dXEvent.getArgs());
        }
        Map<String, mw5> t = dXRuntimeContext.t();
        if (t != null) {
            hashMap.putAll(t);
        }
        dw5.a h = dw5Var.h(dXRuntimeContext, dXEvent, str, (int) this.b, dXRuntimeContext.i(), null, null, hashMap, dXRuntimeContext.s().e(), dXRuntimeContext.s().e(), dXRuntimeContext.s().e());
        if (h.f18109a) {
            return mw5.Q(h.c);
        }
        h36.h(str + " 模板中执行表达式失败: " + h.b);
        return null;
    }
}
