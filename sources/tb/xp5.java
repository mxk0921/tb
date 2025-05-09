package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RECYCLERDATAINDEX = -1158194156417975076L;

    static {
        t2o.a(444596774);
    }

    public static /* synthetic */ Object ipc$super(xp5 xp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserRecyclerDataIndex");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.W() == null) {
            return -1;
        }
        DXWidgetNode W = dXRuntimeContext.W();
        DXWidgetNode dXWidgetNode = W;
        while (dXWidgetNode.getParentWidget() != null) {
            dXWidgetNode = dXWidgetNode.getParentWidget();
            if (dXWidgetNode instanceof DXRecyclerLayout) {
                return Integer.valueOf(((DXRecyclerLayout) dXWidgetNode).a0(W));
            }
        }
        return -1;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "recyclerDataIndex";
    }
}
