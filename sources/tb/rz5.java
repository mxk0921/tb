package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rz5 extends jx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETTOSTATICCACHE = -6889574796800758876L;

    public static /* synthetic */ Object ipc$super(rz5 rz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/DXHSetToStaticCacheEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            vfm.f("SetToStaticCache ", "dx args is null");
        } else {
            String obj2 = obj.toString();
            if (objArr.length > 1) {
                str = objArr[1].toString();
            } else {
                str = null;
            }
            qhm.c(tcm.j(dXRuntimeContext), obj2, str);
        }
    }
}
