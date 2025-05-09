package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kj6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TRACKEXPOSE = 2989037286431506580L;

    static {
        t2o.a(729809035);
    }

    public static /* synthetic */ Object ipc$super(kj6 kj6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/ut/DXTrackExposeEventHandler");
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
            return;
        }
        String str = (String) objArr[1];
        JSONObject a2 = ib1.a(str.split("\\."), str, (JSONObject) objArr[0]);
        if (a2 == null) {
            bqa.d("DXTrackExposeEventHandler", "exposureUtParam == null");
        } else if (a2.getBooleanValue("isTracked")) {
            bqa.d("DXTrackExposeEventHandler", "这份数据曝光过了");
        } else {
            a2.put("page", (Object) "Page_Home");
            a2.put("eventId", (Object) "2201");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(i2b.TRACK_EXPOSURE_PARAM, (Object) a2);
            k4v.c(jSONObject, Globals.getApplication());
            sbq.d(jSONObject);
            a2.put("isTracked", (Object) Boolean.TRUE);
        }
    }
}
