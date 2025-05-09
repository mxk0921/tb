package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ap5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ORDERNAVBARHEIGHT = 1442841143712731328L;

    static {
        t2o.a(614465672);
    }

    public static /* synthetic */ Object ipc$super(ap5 ap5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserOrderNavBarHeight");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(dXRuntimeContext.h() instanceof Activity)) {
            return "0ap";
        }
        return pb6.z(dXRuntimeContext.h(), c2u.e((Activity) dXRuntimeContext.h())) + "ap";
    }
}
