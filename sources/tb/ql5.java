package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ql5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETVISIBLERECT = 7854820902555606954L;

    static {
        t2o.a(444596854);
    }

    public static /* synthetic */ Object ipc$super(ql5 ql5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/parser/DXDataParserGetVisibleRect");
    }

    public final JSONObject a(Context context, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24507dab", new Object[]{this, context, dXWidgetNode});
        }
        DXWidgetNode parentWidget = ((dXWidgetNode instanceof ei6) || (dXWidgetNode instanceof y06)) ? dXWidgetNode.getParentWidget() : dXWidgetNode;
        while (parentWidget instanceof ny5) {
            parentWidget = parentWidget.getParentWidget();
            if (!(parentWidget instanceof ny5)) {
                break;
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (parentWidget != null) {
            View D = parentWidget.getDXRuntimeContext().D();
            if (D != null) {
                Rect rect = new Rect();
                D.getGlobalVisibleRect(rect);
                jSONObject.put("x", (Object) Integer.valueOf(rect.left));
                jSONObject.put("y", (Object) Integer.valueOf(rect.top));
            }
            jSONObject.put("width", (Object) Integer.valueOf(parentWidget.getMeasuredWidth()));
            jSONObject.put("height", (Object) Integer.valueOf(parentWidget.getMeasuredHeight()));
            jSONObject.put("w_ap", (Object) Integer.valueOf(pb6.A(dXWidgetNode.getEngine(), context, parentWidget.getMeasuredWidth())));
            jSONObject.put("h_ap", (Object) Integer.valueOf(pb6.A(dXWidgetNode.getEngine(), context, parentWidget.getMeasuredHeight())));
        }
        return jSONObject;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        return a(dXRuntimeContext.h(), dXRuntimeContext.W());
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "getVisibleRect";
    }
}
