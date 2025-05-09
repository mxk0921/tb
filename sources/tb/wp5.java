package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_DATA_PARSER_RECYCLER_CURRENT_POSITION = -4732527849534416472L;

    static {
        t2o.a(444596773);
    }

    public static /* synthetic */ Object ipc$super(wp5 wp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserRecyclerCurrentPosition");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int i = -1;
        if (objArr == null || objArr.length < 1 || dXRuntimeContext == null) {
            return -1;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            String str = (String) obj;
            DXRootView L = dXRuntimeContext.L();
            if (!(L == null || (expandWidgetNode = L.getExpandWidgetNode()) == null)) {
                DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str);
                if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                    i = ((DXRecyclerLayout) queryWidgetNodeByUserId).a();
                }
            }
        }
        return Integer.valueOf(i);
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "recyclerCurrentPosition";
    }
}
