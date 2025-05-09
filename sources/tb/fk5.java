package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596731);
    }

    public static /* synthetic */ Object ipc$super(fk5 fk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserEqual");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj == null && obj2 == null) {
            return Boolean.TRUE;
        }
        if (obj == null || obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj.getClass().equals(obj2.getClass())) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        return Boolean.valueOf(o66.a((Number) obj, (Number) obj2));
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return SmartLandingTask.Operation.STR_EQUAL;
    }
}
