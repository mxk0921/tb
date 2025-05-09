package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g96 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RUTCLICKTRACKEVENT = 5560765727008152586L;

    static {
        t2o.a(486539371);
    }

    public static /* synthetic */ Object ipc$super(g96 g96Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXRUTClickTrackEventEventHandler");
    }

    public final void a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19c1852", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        cfc c = j18.c(dXRuntimeContext);
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        if (bve.h()) {
            z73.f(e);
        }
        JSONObject jSONObject = (JSONObject) j18.a(objArr, 0, JSONObject.class);
        if (c != null && jSONObject != null && e != null) {
            vve.l(c, dXRuntimeContext.L(), e, jSONObject, null);
            hue.d(c, e, jSONObject);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            a(objArr, dXRuntimeContext);
        }
    }
}
