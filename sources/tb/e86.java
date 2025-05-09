package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e86 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPMESSAGE = -5607208732990739170L;

    public static /* synthetic */ Object ipc$super(e86 e86Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/DXPopMessageEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 1) {
            DXRootView L = dXRuntimeContext.L();
            if (L == null || !L.isShown()) {
                vfm.f("DXPopMessage ", "root view is not show, discard pop message");
                return;
            }
            e3b g = tcm.g(dXRuntimeContext);
            IPopData f = tcm.f(dXRuntimeContext);
            if (g == null || f == null) {
                vfm.f("DXPopMessage ", "engine or popData is null");
                return;
            }
            Object obj = objArr[0];
            String obj2 = obj == null ? null : obj.toString();
            if (TextUtils.isEmpty(obj2)) {
                vfm.f("DXPopMessage ", "messageId is empty");
                return;
            }
            JSONObject jSONObject = objArr.length > 1 ? objArr[1] : null;
            JSONObject jSONObject2 = jSONObject instanceof JSONObject ? jSONObject : null;
            JSONObject jSONObject3 = objArr.length > 1 ? objArr[1] : null;
            if (jSONObject3 instanceof JSONObject) {
                f.getClientParams().putAll(jSONObject3);
            }
            BasePopSectionModel<?> h = tcm.h(dXRuntimeContext);
            JSONObject jSONObject4 = objArr.length > 3 ? objArr[3] : null;
            if (h != null && (jSONObject4 instanceof JSONObject)) {
                vhm.d(h, jSONObject4, null);
            }
            g.w(obj2, f.getBusinessID(), jSONObject2);
        }
    }
}
