package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class po5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_NAVEXTHEIGHT = -8921102620643851301L;

    static {
        t2o.a(729809051);
    }

    public static /* synthetic */ Object ipc$super(po5 po5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserNavExtHeight");
    }

    public final float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d353", new Object[]{this, context, new Integer(i)})).floatValue();
        }
        return (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
        if (objArr == null || objArr.length == 0) {
            float a2 = a(dXRuntimeContext.h(), statusBarHeight);
            return a2 + "np";
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            float a3 = a(dXRuntimeContext.h(), statusBarHeight);
            return a3 + "np";
        }
        float a4 = a(dXRuntimeContext.h(), statusBarHeight + (owo.b(m0b.c(), 48.0f) - owo.e(Globals.getApplication(), (String) obj, 0)));
        return a4 + "np";
    }
}
