package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class py5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_GROWTHTAP = 4824678327777114825L;

    static {
        t2o.a(779093264);
    }

    public static /* synthetic */ Object ipc$super(py5 py5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/growth/DXGrowthTapEventHandler");
    }

    public final String a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91953018", new Object[]{this, dXRuntimeContext});
        }
        JSONObject jSONObject = dXRuntimeContext.i().getJSONObject(c4o.KEY_DATA_SOURCE);
        if (jSONObject == null || !jSONObject.containsKey("jumpParam") || !(jSONObject.get("jumpParam") instanceof JSONObject) || !jSONObject.getJSONObject("jumpParam").getBoolean("isSubscription").booleanValue()) {
            return "appointment-detail";
        }
        return "small_card_subscribe";
    }

    public final void b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ec1c68", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXRootView L = dXRuntimeContext.L();
        if (L != null) {
            ViewParent parent = L.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView(L);
                viewGroup.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1599999", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("componentName", (Object) str);
        jSONObject2.put("data", (Object) jSONObject);
        vkr.c(vx9.d(), "TBLiveWVPlugin.Event.openComponent", jSONObject2);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                if ("closeSubscribeFrame".equals(str)) {
                    b(dXRuntimeContext);
                    ua1.a(vx9.d());
                } else if ("popSubscribePlus".equals(str) && c(dXRuntimeContext)) {
                    ua1.b(vx9.d(), a(dXRuntimeContext));
                }
            }
        }
    }

    public final boolean c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8451b077", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        JSONObject jSONObject = dXRuntimeContext.i().getJSONObject(c4o.KEY_DATA_SOURCE);
        if (!jSONObject.containsKey("jumpParam") || !(jSONObject.get("jumpParam") instanceof JSONObject)) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("jumpParam");
        String string = jSONObject2.getString("componentName");
        if (!TextUtils.isEmpty(string)) {
            d(string, jSONObject2);
        }
        return true;
    }
}
