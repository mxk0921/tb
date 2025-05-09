package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f86 extends jx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPTRIGGER = -5560324439967280595L;

    public static /* synthetic */ Object ipc$super(f86 f86Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/DXPopTriggerEventHandler");
    }

    public final int c(Object[] objArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b65d77e1", new Object[]{this, objArr})).intValue();
        }
        if (!(objArr == null || objArr.length == 0)) {
            Object obj = objArr[0];
            if (obj == null) {
                str = null;
            } else {
                str = obj.toString();
            }
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            try {
                return Integer.valueOf(str).intValue();
            } catch (Throwable th) {
                vfm.d("dx popTrigger event, getTriggerType error", th);
            }
        }
        return -1;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        int c = c(objArr);
        if (c < 0) {
            vfm.f("DXPopTriggerEvent ", "getTriggerType is null");
            return;
        }
        e3b g = tcm.g(dXRuntimeContext);
        IPopData f = tcm.f(dXRuntimeContext);
        if (g == null || f == null) {
            vfm.f("DXPopTriggerEvent ", "popEngine or popData is null");
        } else {
            g.y(c, f.getBusinessID());
        }
    }
}
