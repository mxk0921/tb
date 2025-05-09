package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e36 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_LOCALIZEDTEXT = 9207027465889631337L;

    static {
        t2o.a(444596802);
    }

    public static /* synthetic */ Object ipc$super(e36 e36Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXLocalizedTextDataParser");
    }

    public final DXWidgetNode a(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("2907514c", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if (!(queryRootWidgetNode.getParentWidget() instanceof bi6) || ((bi6) queryRootWidgetNode.getParentWidget()).H() != 1) {
            return queryRootWidgetNode;
        }
        return a(queryRootWidgetNode.getParentWidget());
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == null) {
            return null;
        }
        DXWidgetNode a2 = a(dXRuntimeContext.W());
        String obj2 = objArr[0].toString();
        if (objArr.length <= 1 || (obj = objArr[1]) == null) {
            return a2.getLanguageString(g.o().b(), obj2);
        }
        return a2.getLanguageString(obj2, (String) obj);
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "localizedText";
    }
}
