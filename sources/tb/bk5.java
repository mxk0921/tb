package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXDEFAULTSCALE = -6138832447406711913L;

    static {
        t2o.a(444596727);
    }

    public static /* synthetic */ Object ipc$super(bk5 bk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserDxDefaultScale");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (dXRuntimeContext.r().y() == null) {
            context = dXRuntimeContext.h();
        } else {
            context = dXRuntimeContext.r().y();
        }
        if (!nb6.b(nb6.d(dXRuntimeContext.r()))) {
            return Float.valueOf(Float.parseFloat(obj.toString()));
        }
        try {
            return Integer.valueOf(pb6.A(dXRuntimeContext.r(), context, pb6.s(context) * (Float.parseFloat(obj.toString()) / 375.0f)));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dxDefaultScale";
    }
}
