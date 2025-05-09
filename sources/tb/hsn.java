package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hsn extends esn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERINSERTITEMSBYOFFSET = "2259045112721041933";

    static {
        t2o.a(786432081);
    }

    public static /* synthetic */ Object ipc$super(hsn hsnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/recycler/RecyclerInsertItemsByOffsetAbility");
    }

    @Override // tb.esn
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4f90048", new Object[]{this})).intValue();
        }
        return f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER_MAP;
    }

    @Override // tb.esn
    public c8 n(n8 n8Var, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, tk6 tk6Var) {
        DXWidgetNode dXWidgetNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("ee3769bc", new Object[]{this, n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var});
        }
        if (n8Var == null || dXRecyclerLayout == null || dXWidgetNode == null || tk6Var == null) {
            return i("RecyclerInsertItemsByOffsetAbility param check error", true);
        }
        String i = n8Var.i("targetNodeId");
        if (TextUtils.isEmpty(i)) {
            dXWidgetNode2 = tk6Var.q();
        } else {
            dXWidgetNode2 = dXWidgetNode.queryWidgetNodeByUserId(i);
        }
        if (dXWidgetNode2 == null) {
            return i("RecyclerInsertItemsByOffsetAbility 当前widgetNode为空", true);
        }
        JSONArray f = n8Var.f("data");
        if (f == null) {
            return i("RecyclerInsertItemsByOffsetAbility data参数解析异常", true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", (Object) DXRecyclerLayout.MSG_METHOD_INSERT_ITEMS_BY_OFFSET);
        jSONObject.put("current", (Object) dXWidgetNode2);
        jSONObject.put("targetNodeId", (Object) i);
        jSONObject.put("data", (Object) f);
        jSONObject.put("recyclerNodeId", (Object) n8Var.i("recyclerNodeId"));
        jSONObject.put("offset", (Object) n8Var.i("offset"));
        jSONObject.put("isRelative", (Object) n8Var.c("isRelative"));
        jSONObject.put("isRelativeOrder", (Object) n8Var.c("isRelativeOrder"));
        dXRecyclerLayout.postEvent(l(jSONObject, tk6Var));
        return new f8();
    }
}
