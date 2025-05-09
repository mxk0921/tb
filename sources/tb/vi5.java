package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vi5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTEXISTCOMPONENTSBYTAG = 1508797689610607788L;

    static {
        t2o.a(478150717);
    }

    public static /* synthetic */ Object ipc$super(vi5 vi5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/DXDataParserCartExistComponentsByTag");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return Boolean.FALSE;
        }
        kmb b = yn2.b(dXRuntimeContext);
        for (Object obj : objArr) {
            IDMComponent u = b.d().u(String.valueOf(obj));
            if (u != null && u.isNormalComponent()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
