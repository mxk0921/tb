package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class v10 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092626);
    }

    public static ux9 a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("e087be85", new Object[]{dXRuntimeContext, str});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        fl6 S = dXRuntimeContext.S();
        if (S instanceof zwa) {
            return ((zwa) S).f();
        }
        Log.e("AbstractGoodDXHandler", "getContextFromDX | no_match, className=" + str);
        return null;
    }

    public static /* synthetic */ Object ipc$super(v10 v10Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/AbstractHighlightDXHandler");
    }

    public abstract void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, ux9 ux9Var);

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ux9 a2 = a(dXRuntimeContext, getClass().getSimpleName());
        Log.e("AbstractGoodDXHandler", "handleEvent | className=".concat(getClass().getSimpleName()));
        b(dXEvent, objArr, dXRuntimeContext, a2);
    }
}
