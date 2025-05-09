package tb;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_LINEAR_GRADIENT = 5808997026297879479L;

    static {
        t2o.a(444596756);
    }

    public static /* synthetic */ Object ipc$super(wn5 wn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserLinearGradient");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "linearGradient";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        GradientDrawable.Orientation orientation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        int[] iArr = new int[objArr.length - 1];
        int length = objArr.length;
        for (int i = 1; i < length; i++) {
            try {
                iArr[i - 1] = Color.parseColor(String.valueOf(objArr[i]));
            } catch (Exception unused) {
                Object obj2 = objArr[i];
                String obj3 = obj2 != null ? obj2.toString() : null;
                iArr[i - 1] = -12303292;
                Log.e("ParserLinearGradient", obj3 + "parse Color failed. color miss");
            }
        }
        if ("toLeft".equals(str)) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else if ("toRight".equals(str)) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        } else if ("toTop".equals(str)) {
            orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        } else if ("toBottom".equals(str)) {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        } else if ("toTopLeft".equals(str)) {
            orientation = GradientDrawable.Orientation.BR_TL;
        } else if ("toTopRight".equals(str)) {
            orientation = GradientDrawable.Orientation.BL_TR;
        } else if ("toBottomLeft".equals(str)) {
            orientation = GradientDrawable.Orientation.TR_BL;
        } else if ("toBottomRight".equals(str)) {
            orientation = GradientDrawable.Orientation.TL_BR;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        DXWidgetNode.d dVar = new DXWidgetNode.d();
        dVar.d(0);
        dVar.f(orientation);
        dVar.e(iArr);
        return dVar;
    }
}
