package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ssn extends esn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERUPDATECURRENTITEM = "3807884119613639239";

    static {
        t2o.a(786432087);
    }

    public static /* synthetic */ Object ipc$super(ssn ssnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/recycler/RecyclerUpdateCurrentItemAbility");
    }

    @Override // tb.esn
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4f90048", new Object[]{this})).intValue();
        }
        return 30005;
    }

    @Override // tb.esn
    public c8 n(n8 n8Var, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, tk6 tk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("ee3769bc", new Object[]{this, n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var});
        }
        return o(n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT);
    }

    public c8 o(n8 n8Var, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, tk6 tk6Var, String str) {
        DXWidgetNode dXWidgetNode2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("49325800", new Object[]{this, n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var, str});
        }
        String i = n8Var.i("targetNodeId");
        if (!TextUtils.isEmpty(i)) {
            dXWidgetNode2 = dXWidgetNode.queryWidgetNodeByUserId(i);
        } else {
            dXWidgetNode2 = tk6Var.q();
        }
        if (dXWidgetNode2 == null) {
            return i("当前widgetNode为空", true);
        }
        try {
            jSONArray = n8Var.f("actions");
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        if (jSONArray == null) {
            return new b8(new a8(k(), "data参数解析异常"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", (Object) str);
        jSONObject.put("actions", (Object) jSONArray);
        jSONObject.put("current", (Object) dXWidgetNode2);
        jSONObject.put(x96.REFRESH_TYPE, (Object) n8Var.i(x96.REFRESH_TYPE));
        jSONObject.put("params", (Object) n8Var.h());
        dXRecyclerLayout.postEvent(l(jSONObject, tk6Var));
        return new f8();
    }
}
