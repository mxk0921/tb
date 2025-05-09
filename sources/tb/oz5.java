package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oz5 extends jx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETPOPCLIENTPARAMS = -5468254988785752167L;

    public static /* synthetic */ Object ipc$super(oz5 oz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/DXHSetPopClientParamsEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 1) {
            vfm.f("setPopClientParams ", "dx args is null");
        } else {
            String str = (String) objArr[0];
            String str2 = objArr.length > 1 ? (String) objArr[1] : null;
            if (TextUtils.isEmpty(str)) {
                vfm.f("setPopClientParams ", "args key is null");
                return;
            }
            e3b g = tcm.g(dXRuntimeContext);
            IPopData f = tcm.f(dXRuntimeContext);
            if (g == null || f == null) {
                vfm.f("setPopClientParams ", "popService or popData is null");
                return;
            }
            JSONObject clientParams = f.getClientParams();
            if (str2 == null) {
                clientParams.remove(str);
            } else {
                clientParams.put(str, (Object) str2);
            }
            vfm.c("setPopClientParams ", "set, key=" + str + ", value=" + str2);
        }
    }
}
