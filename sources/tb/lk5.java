package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SIZEBYFACTOR = 7983029549530032097L;

    static {
        t2o.a(444596735);
    }

    public static /* synthetic */ Object ipc$super(lk5 lk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserFontSize");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            if (vu5.f() && objArr.length == 1 && objArr[0] != null) {
                return Integer.valueOf(pb6.A(dXRuntimeContext.r(), DinamicXEngine.x(), vu5.c(pb6.p(dXRuntimeContext.r(), DinamicXEngine.x(), String.valueOf(objArr[0]), 0))));
            }
            px5 b = px5.b();
            if (objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof Number) {
                    return b.d((Double) obj3);
                }
            }
            if (objArr.length == 2) {
                Object obj4 = objArr[0];
                if (obj4 instanceof Number) {
                    Object obj5 = objArr[1];
                    if (obj5 instanceof Number) {
                        return b.e((Double) obj4, (Double) obj5);
                    }
                }
            }
            if (objArr.length == 5) {
                Object obj6 = objArr[0];
                if (obj6 instanceof Number) {
                    Object obj7 = objArr[1];
                    if (obj7 instanceof Number) {
                        Object obj8 = objArr[2];
                        if (obj8 instanceof Number) {
                            Object obj9 = objArr[3];
                            if (obj9 instanceof Number) {
                                Object obj10 = objArr[4];
                                if (obj10 instanceof Number) {
                                    return b.f((Double) obj6, (Double) obj7, (Double) obj8, (Double) obj9, (Double) obj10);
                                }
                            }
                        }
                    }
                }
            }
            if (objArr.length == 1 && (obj2 = objArr[0]) != null) {
                return b.g(String.valueOf(obj2));
            }
            if (objArr.length == 2 && (obj = objArr[0]) != null && objArr[1] != null) {
                return b.h(String.valueOf(obj), String.valueOf(objArr[1]));
            }
            if (objArr.length == 5) {
                return b.i(String.valueOf(objArr[0]), String.valueOf(objArr[1]), String.valueOf(objArr[2]), String.valueOf(objArr[3]), String.valueOf(objArr[4]));
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
        return em7.SIZE_BY_FACTOR;
    }
}
