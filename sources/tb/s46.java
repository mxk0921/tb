package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538124);
    }

    public static /* synthetic */ Object ipc$super(s46 s46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/DXMtbToolsEditExposeEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object L;
        String obj;
        String obj2;
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.h(dXRuntimeContext, "runtimeContext");
        JSONObject jSONObject = null;
        if (!(dXEvent instanceof DXScrollEvent)) {
            dXEvent = null;
        }
        DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
        if (dXScrollEvent != null && objArr != null && (L = ic1.L(objArr, 0)) != null && (obj = L.toString()) != null) {
            float parseFloat = Float.parseFloat(obj);
            Object L2 = ic1.L(objArr, 1);
            if (L2 != null && (obj2 = L2.toString()) != null) {
                float parseFloat2 = Float.parseFloat(obj2);
                Object L3 = ic1.L(objArr, 2);
                if (L3 instanceof JSONObject) {
                    jSONObject = L3;
                }
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 != null && (dXScrollEvent.getContentSize().f29533a - dXScrollEvent.getScrollerSize().f29533a) - dXScrollEvent.getOffsetX() < pb6.c(dXRuntimeContext.h(), (parseFloat2 * 0.5f) + parseFloat) && (string = jSONObject2.getString("page")) != null && (string2 = jSONObject2.getString("arg1")) != null) {
                    r4v.a(string, 2201, string2, null, null, jSONObject2.getJSONObject("args"));
                }
            }
        }
    }
}
