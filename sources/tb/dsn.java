package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dsn extends esn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERAPPENDITEMS = "594193460083487942";

    static {
        t2o.a(786432077);
    }

    public static /* synthetic */ Object ipc$super(dsn dsnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/recycler/RecyclerAppendItemsAbility");
    }

    @Override // tb.esn
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4f90048", new Object[]{this})).intValue();
        }
        return 30001;
    }

    @Override // tb.esn
    public c8 n(n8 n8Var, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, tk6 tk6Var) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("ee3769bc", new Object[]{this, n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var});
        }
        try {
            jSONArray = n8Var.f("data");
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        if (jSONArray == null) {
            return new b8(new a8(30001, "data参数解析异常"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS);
        jSONObject.put("data", (Object) jSONArray);
        dXRecyclerLayout.postEvent(l(jSONObject, tk6Var));
        return new f8();
    }
}
