package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fy5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETWIDGETPROPERTYVALUE = 1720632590440773916L;

    static {
        t2o.a(444596801);
    }

    public static /* synthetic */ Object ipc$super(fy5 fy5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXGetWidgetPropertyValueDataParser");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "getWidgetPropertyValue";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode W;
        DXWidgetNode dXWidgetNode;
        Object nodePropByKey;
        DXRootView L;
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr == null || objArr.length < 2 || objArr[1] == null) {
            return null;
        }
        Object obj2 = objArr[0];
        String str = "";
        String str2 = (!(obj2 instanceof String) || TextUtils.isEmpty((CharSequence) obj2)) ? str : (String) obj2;
        Object obj3 = objArr[1];
        if (obj3 instanceof String) {
            str = (String) obj3;
        }
        if (objArr.length >= 3) {
            obj = objArr[2];
        }
        if (TextUtils.isEmpty(str) || (W = dXRuntimeContext.W()) == null) {
            return obj;
        }
        if (TextUtils.isEmpty(str2) || str2.equals(W.getUserId())) {
            dXWidgetNode = W;
        } else {
            dXWidgetNode = W.queryWidgetNodeByUserId(str2);
            if (!(dXWidgetNode != null || W.getDXRuntimeContext() == null || (L = W.getDXRuntimeContext().L()) == null || (expandWidgetNode = L.getExpandWidgetNode()) == null)) {
                dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(str2);
            }
        }
        if ("root".equals(str2) && dXWidgetNode == null) {
            dXWidgetNode = W.queryRootWidgetNode();
        }
        return ((dXWidgetNode instanceof hwb) && (nodePropByKey = ((hwb) dXWidgetNode).getNodePropByKey(str)) != null) ? nodePropByKey : obj;
    }
}
