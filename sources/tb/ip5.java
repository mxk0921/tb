package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ip5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_QUERYRECYCLERCELLINDEXBYUSERID = 2161714594209669644L;

    static {
        t2o.a(444596772);
    }

    public static /* synthetic */ Object ipc$super(ip5 ip5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserQueryRecyclerCellIndexByUserId");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.W() == null) {
            return -1;
        }
        if (objArr == null || objArr.length != 2) {
            return -2;
        }
        Object obj = objArr[0];
        if (obj == null) {
            return -20;
        }
        if (objArr[1] == null) {
            return -21;
        }
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return -3;
        }
        DXRootView L = dXRuntimeContext.L();
        if (L == null) {
            return -4;
        }
        DXWidgetNode expandWidgetNode = L.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return -5;
        }
        if (zg5.w5(expandWidgetNode.getDXRuntimeContext())) {
            dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(obj2);
        } else {
            dXWidgetNode = expandWidgetNode.queryWTByUserId(obj2);
        }
        if (!(dXWidgetNode instanceof DXRecyclerLayout)) {
            return -7;
        }
        String obj3 = objArr[1].toString();
        if (TextUtils.isEmpty(obj3)) {
            return -8;
        }
        int V = ((DXRecyclerLayout) dXWidgetNode).V(obj3);
        if (V < 0) {
            return -9;
        }
        return Integer.valueOf(V);
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "queryRecyclerCellIndexByUserId";
    }
}
