package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETRECYCLERSTATEDATASOURCE = 5890925234203956351L;

    static {
        t2o.a(444596739);
    }

    public static /* synthetic */ Object ipc$super(fl5 fl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserGetRecyclerStateDataSource");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXRootView L;
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 1 || dXRuntimeContext == null) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String) || (L = dXRuntimeContext.L()) == null || (expandWidgetNode = L.getExpandWidgetNode()) == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId((String) obj);
        if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
            return ((DXRecyclerLayout) queryWidgetNodeByUserId).x();
        }
        return null;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "getRecyclerStateDataSource";
    }
}
