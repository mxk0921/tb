package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.ql6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETVARIABLE = 6682077146294913393L;

    static {
        t2o.a(444596742);
    }

    public static /* synthetic */ Object ipc$super(nl5 nl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserGetVariable");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (!(objArr == null || objArr.length == 0)) {
            String valueOf = String.valueOf(objArr[0]);
            if (objArr.length == 2) {
                obj = objArr[1];
            }
            DXWidgetNode queryRootWidgetNode = dXRuntimeContext.W().queryRootWidgetNode();
            if (queryRootWidgetNode == null) {
                return obj;
            }
            ql6 dxv3VariableInfo = queryRootWidgetNode.getDxv3VariableInfo();
            if (dxv3VariableInfo == null) {
                return obj;
            }
            Object c = dxv3VariableInfo.c(valueOf, dXRuntimeContext);
            if (c != null && !(c instanceof ql6.a)) {
                return c;
            }
        }
        return obj;
    }
}
