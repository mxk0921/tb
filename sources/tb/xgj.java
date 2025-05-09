package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.trade.event.Event;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xgj extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Long EVENT_IDENTIFY = 2610082068776943486L;

    static {
        t2o.a(352321617);
    }

    public static /* synthetic */ Object ipc$super(xgj xgjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/dinamicx/NDMainPicDXToWeexHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        List<Event> list;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null) {
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                String str = (String) obj2;
                JSONObject jSONObject = new JSONObject();
                if (objArr.length > 1) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof JSONObject) {
                        jSONObject = (JSONObject) obj3;
                    }
                }
                Object obj4 = new Object();
                if (objArr.length > 2 && (obj = objArr[2]) != null) {
                    obj4 = obj;
                }
                DXRootView L = dXRuntimeContext.L();
                Object tag = L.getTag(1188984821);
                Object tag2 = L.getTag(-1607140204);
                Object tag3 = L.getTag(1882865001);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(hxj.EVENT_KEY, (Object) o3w.OPERATE_EVENT_DX_TO_WEEX);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(hxj.EVENT_KEY, (Object) str);
                jSONObject3.put("itemInfo", (Object) jSONObject);
                jSONObject3.put("extraInfo", obj4);
                jSONObject2.put("params", (Object) jSONObject3);
                jSONObject2.put(hxj.UNIQID, tag);
                if (tag2 instanceof String) {
                    list = hxj.c((String) tag2, jSONObject2);
                } else {
                    list = hxj.c(null, jSONObject2);
                }
                for (Event event : list) {
                    rj8.d(tag3, event);
                }
            }
        }
    }
}
