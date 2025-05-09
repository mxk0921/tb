package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rw5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELIMITER = " .[]";

    static {
        t2o.a(444596858);
    }

    public static /* synthetic */ Object ipc$super(rw5 rw5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/parser/DXExpressionParser");
    }

    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8dd225a", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        return dXRuntimeContext.i();
    }

    public Object b(String str, Object obj, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ca34c931", new Object[]{this, str, obj, dXRuntimeContext});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = c(dXRuntimeContext, obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    public final Object c(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
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
        Object a2 = a(dXRuntimeContext);
        if (objArr == null || objArr.length == 0) {
            return a2;
        }
        if (objArr.length <= 1 || !eb5.t()) {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            return b((String) obj, a2, dXRuntimeContext);
        }
        for (int i = 1; i < objArr.length; i++) {
            Object obj2 = objArr[i];
            if (!(obj2 instanceof String) || (a2 = c(dXRuntimeContext, a2, (String) obj2)) == null) {
                return null;
            }
        }
        return a2;
    }
}
