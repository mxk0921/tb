package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RUNTIMESCOUNT = 7598383176175623821L;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f19463a = new HashMap();

    static {
        t2o.a(486539388);
    }

    public static /* synthetic */ Object ipc$super(fq5 fq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserRuntimesCount");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || dXRuntimeContext == null || dXRuntimeContext.D() == null || dXRuntimeContext.D().getParent() == null) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return 0;
        }
        String str = (String) obj;
        if (((HashMap) this.f19463a).containsKey(str)) {
            int intValue = ((Integer) ((HashMap) this.f19463a).get(str)).intValue() + 1;
            ((HashMap) this.f19463a).put(str, Integer.valueOf(intValue));
            i = intValue;
        } else {
            ((HashMap) this.f19463a).put(str, 0);
        }
        fve.e("home.RuntimesCount", "currentCount=" + i);
        return Integer.valueOf(i);
    }
}
