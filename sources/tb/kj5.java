package tb;

import android.graphics.Color;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_COLORMAP = 1756245084560162885L;

    static {
        t2o.a(444596720);
    }

    public static /* synthetic */ Object ipc$super(kj5 kj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserColorMap");
    }

    public final int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{this, str})).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            Log.e("ParserLinearGradient", str + "parse Color failed. color miss");
            return -12303292;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2 && objArr.length % 2 != 1 && DXDarkModeCenter.d()) {
            HashMap hashMap = new HashMap(5);
            for (int i = 0; i < objArr.length / 2; i++) {
                int i2 = i * 2;
                Object obj = objArr[i2];
                if (obj instanceof String) {
                    Object obj2 = objArr[i2 + 1];
                    if (obj2 instanceof String) {
                        hashMap.put((String) obj, Integer.valueOf(a((String) obj2)));
                    }
                }
                return null;
            }
            if (hashMap.size() > 0) {
                return hashMap;
            }
        }
        return null;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "colorMap";
    }
}
