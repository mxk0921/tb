package tb;

import android.graphics.Paint;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vs5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TOFLEXLAYOUTARRAY = 8849752766190120960L;

    static {
        t2o.a(614465679);
    }

    public static /* synthetic */ Object ipc$super(vs5 vs5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserToFlexLayoutArray");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 6) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int intValue = ((Integer) objArr[1]).intValue();
        int intValue2 = ((Integer) objArr[2]).intValue();
        int intValue3 = ((Integer) objArr[3]).intValue();
        int intValue4 = ((Integer) objArr[4]).intValue();
        int intValue5 = ((Integer) objArr[5]).intValue();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        float f = 0.0f;
        for (int i = 0; i < jSONArray.size(); i++) {
            Paint paint = new Paint();
            paint.setTextSize(intValue);
            float measureText = intValue2 + paint.measureText(jSONArray.getString(i)) + intValue3 + intValue4;
            if (f + measureText > intValue5) {
                jSONArray2.add(jSONArray3.clone());
                jSONArray3.clear();
                f = 0.0f;
            }
            jSONArray3.add(jSONArray.getString(i));
            f += measureText;
        }
        if (jSONArray3.size() > 0) {
            jSONArray2.add(jSONArray3);
        }
        return jSONArray2;
    }
}
