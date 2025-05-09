package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class md6 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596863);
    }

    public static /* synthetic */ Object ipc$super(md6 md6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/parser/DXSubDataParser");
    }

    public Object a(String str, Object obj, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ca34c931", new Object[]{this, str, obj, dXRuntimeContext});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = b(dXRuntimeContext, obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    public final Object b(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("99f2a479", new Object[]{this, dXRuntimeContext, obj, str});
        }
        if (obj == null || str == null) {
            return null;
        }
        return bu5.a(dXRuntimeContext, obj, str);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object O = dXRuntimeContext.O();
        if (objArr == null || objArr.length == 0) {
            return O;
        }
        if (objArr.length <= 1 || !eb5.t()) {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            return a((String) obj, O, dXRuntimeContext);
        }
        for (int i = 1; i < objArr.length; i++) {
            Object obj2 = objArr[i];
            if (!(obj2 instanceof String) || (O = b(dXRuntimeContext, O, (String) obj2)) == null) {
                return null;
            }
        }
        return O;
    }
}
