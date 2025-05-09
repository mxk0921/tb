package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.widget.j;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mb6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597852);
    }

    public static /* synthetic */ Object ipc$super(mb6 mb6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/sys/DXRuntimeDataFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "runtimeData";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        String str;
        String str2;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length != 2 || uw5Var == null) {
            return uw5.U(dXRuntimeContext.i());
        }
        uw5 uw5Var2 = uw5VarArr[0];
        if (uw5Var2 == null || !uw5Var2.M()) {
            str = "";
        } else {
            str = uw5VarArr[0].w();
        }
        if (TextUtils.isEmpty(str)) {
            str2 = uw5VarArr[1].w();
        } else {
            str2 = str + "." + uw5VarArr[1].w();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2, " .[]", false);
        Object obj = dXRuntimeContext;
        while (stringTokenizer.hasMoreElements()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (obj instanceof Map) {
                    obj = ((Map) obj).get(nextToken);
                } else if (obj instanceof List) {
                    obj = ((List) obj).get(Integer.parseInt(nextToken));
                } else if (obj instanceof DXRuntimeContext) {
                    String lowerCase = nextToken.toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -1868067350:
                            if (lowerCase.equals("subdata")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -263078616:
                            if (lowerCase.equals("subdataindex")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -166383732:
                            if (lowerCase.equals("rootdata")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3076010:
                            if (lowerCase.equals("data")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1346117960:
                            if (lowerCase.equals("listdata")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        return uw5.S(((DXRuntimeContext) obj).P());
                    }
                    if (c == 1) {
                        obj = ((DXRuntimeContext) obj).O();
                    } else if (c == 2) {
                        obj = ((DXRuntimeContext) obj).L().getData();
                    } else if (c != 3) {
                        obj = dXRuntimeContext.i();
                    } else {
                        obj = dXRuntimeContext.W() instanceof j ? ((j) dXRuntimeContext.W()).getListData() : null;
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (obj == null) {
            return uw5.V();
        }
        return uw5.T(obj);
    }
}
