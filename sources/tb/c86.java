package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c86 extends jx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPCLICK = 5584505997581213501L;

    public static /* synthetic */ Object ipc$super(c86 c86Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/DXPopClickEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 1) {
            Object obj = objArr[0];
            Object obj2 = null;
            if (obj == null) {
                str = null;
            } else {
                str = obj.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                BasePopSectionModel<?> h = tcm.h(dXRuntimeContext);
                if (objArr.length > 1) {
                    obj2 = objArr[1];
                }
                if (h != null && (obj2 instanceof JSONObject)) {
                    a(h, (JSONObject) obj2);
                }
                e3b g = tcm.g(dXRuntimeContext);
                IPopData f = tcm.f(dXRuntimeContext);
                if (g != null && f != null) {
                    try {
                        int intValue = Integer.valueOf(str).intValue();
                        vfm.c("PopClickEvent ", "==== popClick, type=" + intValue);
                        g.v(intValue, f.getBusinessID());
                    } catch (Throwable th) {
                        vfm.d("PopClickEvent ", th);
                    }
                }
            }
        }
    }
}
