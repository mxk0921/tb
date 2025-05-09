package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_DATA_PARSER_ORANGE = 2060908603279329344L;

    static {
        t2o.a(444596769);
    }

    public static /* synthetic */ Object ipc$super(yo5 yo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserOrange");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String)) {
            return null;
        }
        ch5 ch5Var = new ch5();
        String str2 = (String) objArr[0];
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = (String) objArr[1];
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        if (objArr.length >= 3) {
            obj = objArr[2];
        } else {
            obj = null;
        }
        if (obj != null) {
            str = obj.toString();
        }
        return ch5Var.getConfig(str2, str3, str);
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dxOrange";
    }
}
