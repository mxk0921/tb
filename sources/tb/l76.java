package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l76 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_PARENTSUBDATA = -1943779674642760869L;

    static {
        t2o.a(444596861);
    }

    public static /* synthetic */ Object ipc$super(l76 l76Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/parser/DXParentSubDataParser");
    }

    public final Object a(DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode W;
        DXWidgetNode parentWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96ed4ed0", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || (W = dXRuntimeContext.W()) == null || (parentWidget = W.getParentWidget()) == null) {
            return null;
        }
        if (((bwb) parentWidget).isHandleListData()) {
            return parentWidget.getDXRuntimeContext().O();
        }
        return a(parentWidget.getDXRuntimeContext());
    }

    public final Object b(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("99f2a479", new Object[]{this, dXRuntimeContext, obj, str});
        }
        if (obj == null || str == null) {
            return null;
        }
        return bu5.a(dXRuntimeContext, obj, str);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object a2 = a(dXRuntimeContext);
        if (a2 == null) {
            return null;
        }
        if (!(objArr == null || objArr.length == 0)) {
            if (objArr.length > 1) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer((String) obj, " .[]", false);
            while (stringTokenizer.hasMoreTokens()) {
                a2 = b(dXRuntimeContext, a2, stringTokenizer.nextToken());
            }
        }
        return a2;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "parentSubdata";
    }
}
