package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ksn extends ssn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERMODIFYCURRENTITEMDATA = "-1682233800684224822";

    static {
        t2o.a(786432082);
    }

    public static /* synthetic */ Object ipc$super(ksn ksnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/recycler/RecyclerModifyCurrentItemDataAbility");
    }

    @Override // tb.ssn, tb.esn
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4f90048", new Object[]{this})).intValue();
        }
        return f.DXError_EngineInitContextNUll;
    }

    @Override // tb.ssn, tb.esn
    public c8 n(n8 n8Var, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, tk6 tk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("ee3769bc", new Object[]{this, n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var});
        }
        return o(n8Var, dXRecyclerLayout, dXWidgetNode, tk6Var, DXRecyclerLayout.MSG_METHOD_MODIFY_CURRENT_ITEM_DATA);
    }
}
