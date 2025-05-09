package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kg5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CLOSE_ACTIVITY = -4639755379645601680L;

    static {
        t2o.a(614465660);
    }

    public static /* synthetic */ Object ipc$super(kg5 kg5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/event/DXCloseActivityEvent");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Context h = dXRuntimeContext.h();
        kor.a("DXCloseActivityEventHandler", "handleEvent", "----");
        if (h instanceof Activity) {
            if (h instanceof aid) {
                ((aid) h).p2(true);
            }
            ((Activity) h).finish();
        }
    }
}
