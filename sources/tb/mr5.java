package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TABSHORIZONTALOFFSET = -5142515049732466353L;

    static {
        t2o.a(478150725);
    }

    public static /* synthetic */ Object ipc$super(mr5 mr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/DXDataParserTabsHorizontalOffset");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        kmb b = yn2.b(dXRuntimeContext);
        IDMComponent c = yn2.c(dXRuntimeContext);
        if (b == null) {
            return null;
        }
        int a2 = b.d().B().o(c.getKey()).a();
        new StringBuilder("lastScrollOffsetX:::").append(a2);
        return Integer.valueOf(pb6.z(dXRuntimeContext.h(), a2));
    }
}
