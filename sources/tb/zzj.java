package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "gateway2.postMsg";

    static {
        t2o.a(487587919);
        t2o.a(475004944);
    }

    public zzj(xs6 xs6Var) {
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            Object obj = jSONObject.get("widgetNode");
            if (obj instanceof DXWidgetNode) {
                DXWidgetNode dXWidgetNode = (DXWidgetNode) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("widgetParams");
                if (jSONObject2 != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("params");
                    if (jSONObject3 == null) {
                        str = "null";
                    } else {
                        str = jSONObject3.getString("videoOperation");
                    }
                    i65.d("gateway2.postMsg", "post msg to widget, operation=", str);
                    DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
                    dXMsgCenterEvent.setType(jSONObject2.getString("type"));
                    dXMsgCenterEvent.setParams(jSONObject3);
                    dXWidgetNode.postEvent(dXMsgCenterEvent);
                }
            }
        }
    }
}
