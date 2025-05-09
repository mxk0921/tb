package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596781);
    }

    public static /* synthetic */ Object ipc$super(uq5 uq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserStringSubstr");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr == null || objArr.length > 3 || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        Object obj2 = objArr[1];
        if (!(obj2 instanceof String)) {
            return null;
        }
        int f = o66.f((String) obj2);
        if (objArr.length == 3) {
            Number h = o66.h(objArr[2]);
            if (h == null) {
                return null;
            }
            int intValue = h.intValue();
            if (intValue < 0 || f + 1 > str2.length()) {
                return "";
            }
            if (f >= 0) {
                i = f;
            }
            int i2 = intValue + i;
            if (i2 > str2.length()) {
                str = str2.substring(i);
            }
            if (i2 - 1 < str2.length()) {
                return str2.substring(i, i2);
            }
            return str;
        } else if (1 + f > str2.length()) {
            return "";
        } else {
            if (f >= 0) {
                i = f;
            }
            return str2.substring(i);
        }
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "substr";
    }
}
