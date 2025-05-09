package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETSCREENHEIGHT = -2819398366088431864L;

    static {
        t2o.a(614465668);
    }

    public static /* synthetic */ Object ipc$super(gl5 gl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserGetScreenHeight");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context h = dXRuntimeContext.h();
        if (h == null) {
            return "0";
        }
        try {
            int C = (int) pb6.C(h, c2u.o(h));
            kor.a("DXDataParserGetScreenHeight", "ScreenHeightDp = " + C, new String[0]);
            return String.valueOf(C);
        } catch (Throwable th) {
            ldv.e(h, "DXDataParserGetScreenHeight", "get screenHeight error = " + th.toString(), null);
            return 0;
        }
    }
}
