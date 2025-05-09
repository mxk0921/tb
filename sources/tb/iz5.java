package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HPAGECHANGEEXPOSE = -5738105571919564880L;

    /* renamed from: a  reason: collision with root package name */
    public static final String f21659a = "DXHPageChangeExposeEventHandler";

    static {
        t2o.a(729809013);
    }

    public static /* synthetic */ Object ipc$super(iz5 iz5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXHPageChangeExposeEventHandler");
    }

    public final int a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c88397a", new Object[]{this, dXEvent, dXRuntimeContext})).intValue();
        }
        if (dXEvent != null && (dXEvent instanceof DXPageChangeEvent)) {
            return ((DXPageChangeEvent) dXEvent).pageIndex;
        }
        if (dXRuntimeContext.W() instanceof DXSliderLayout) {
            return ((DXSliderLayout) dXRuntimeContext.W()).getPageIndex();
        }
        return -1;
    }

    public final void b(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c0ae5c", new Object[]{this, jSONObject, dXRuntimeContext});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            sfh.d(f21659a, "independentExpose, itemList is empty");
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            k4v.c((JSONObject) entry.getValue(), dXRuntimeContext.h());
        }
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
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        int a2 = a(dXEvent, dXRuntimeContext);
        if (a2 == -1) {
            sfh.d(f21659a, "pageIndex is -1");
            return;
        }
        if (objArr != null) {
            Object obj = objArr[0];
            if ((obj instanceof JSONObject) && (jSONObject = (JSONObject) obj) != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(a2));
                k4v.c(jSONObject2, dXRuntimeContext.h());
                b(jSONObject2, dXRuntimeContext);
            }
        }
        if (objArr != null && objArr.length > 1) {
            Object obj2 = objArr[1];
            if (obj2 instanceof String) {
                new tz5().handleEvent(dXEvent, new Object[]{String.valueOf(obj2), String.valueOf(a2)}, dXRuntimeContext);
            }
        }
    }
}
