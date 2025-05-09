package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ig6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEINTERACTCLICK = -3740188743218598360L;

    static {
        t2o.a(295699897);
    }

    public static /* synthetic */ Object ipc$super(ig6 ig6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/dx/DXTaoliveInteractClickEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        v2s.o().A().c("handleEvent", Arrays.toString(objArr));
        if (objArr != null && objArr.length >= 2 && dXRuntimeContext != null && (i = dXRuntimeContext.i()) != null) {
            if ("event".equals(objArr[0]) || "custom".equals(objArr[0])) {
                sjr.g().c("com.taobao.taolive.room.dxmanager.event", new uv5(objArr, dXRuntimeContext.P()), i.getString("token"));
            } else if ("recommend_popview".equals(objArr[0])) {
                sjr.g().c("com.taobao.taolive.room.dxmanager.event.recommend_popview", new uv5(objArr, dXRuntimeContext.P()), i.getString("token"));
            }
        }
    }
}
