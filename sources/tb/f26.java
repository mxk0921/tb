package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f26 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LSCROLLEXPOSE = -6303467050116154020L;

    static {
        t2o.a(806355417);
    }

    public static /* synthetic */ Object ipc$super(f26 f26Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/event/DXLScrollExposeEventHandler");
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
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0 && dXRuntimeContext.h() != null) {
            if (dXEvent instanceof DXViewEvent) {
                i = ((DXViewEvent) dXEvent).getItemIndex();
            } else {
                i = dXEvent instanceof DXPageChangeEvent ? ((DXPageChangeEvent) dXEvent).pageIndex : -1;
            }
            Object obj = objArr[0];
            JSONObject jSONObject = null;
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= 0 && i < jSONArray.size()) {
                    jSONObject = jSONArray.getJSONObject(i);
                }
            } else if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            }
            if (jSONObject != null) {
                String string = jSONObject.getString("trackInfo");
                JSONObject jSONObject2 = jSONObject.getJSONObject("showMaidian");
                if (jSONObject2 != null && jSONObject2.get("params") != null) {
                    if (!arq.a(jSONObject2.getString("pageName"))) {
                        str = jSONObject2.getString("pageName");
                    } else {
                        str = "Page_TaobaoLive";
                    }
                    if (!arq.a(string)) {
                        String string2 = jSONObject2.getString("name");
                        s9m.d(str, string2, jSONObject2.getString("params") + ",trackInfo=" + string);
                        return;
                    }
                    s9m.d(str, jSONObject2.getString("name"), jSONObject2.getString("params"));
                }
            }
        }
    }
}
