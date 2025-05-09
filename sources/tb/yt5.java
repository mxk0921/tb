package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.manager.datasource.DXDataSourceLruManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yt5 extends xt5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597563);
    }

    public yt5(DXDataSourceLruManager dXDataSourceLruManager) {
        super(dXDataSourceLruManager);
    }

    public static /* synthetic */ Object ipc$super(yt5 yt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/manager/datasource/DXDataSourceCommonManager");
    }

    @Override // tb.xt5
    public DXWidgetNode f(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, Object obj, List<Object> list, List<DXWidgetNode> list2, int i, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f4151d92", new Object[]{this, dXAbsContainerBaseLayout, obj, list, list2, new Integer(i), oz8Var});
        }
        bi6 bi6Var = null;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < list2.size() && (bi6Var = d(dXAbsContainerBaseLayout, list2.get(i2), obj, list, i, oz8Var, false)) == null; i2++) {
            }
        }
        if (bi6Var != null) {
            return bi6Var;
        }
        s96 s96Var = new s96();
        s96Var.setDXRuntimeContext(dXAbsContainerBaseLayout.getDXRuntimeContext().b(dXAbsContainerBaseLayout));
        s96Var.setVisibility(2);
        return s96Var;
    }

    @Override // tb.xt5
    public ArrayList<DXWidgetNode> g(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("95b8f9be", new Object[]{this, dXAbsContainerBaseLayout, list, list2, new Integer(i), new Integer(i2), oz8Var});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            for (int i3 = i; i3 < i2; i3++) {
                Object obj = list.get(i3);
                bi6 bi6Var = null;
                for (int i4 = 0; i4 < list2.size() && (bi6Var = d(dXAbsContainerBaseLayout, list2.get(i4), obj, list, i3, oz8Var, false)) == null; i4++) {
                }
                if (bi6Var == null) {
                    s96 s96Var = new s96();
                    s96Var.setDXRuntimeContext(dXAbsContainerBaseLayout.getDXRuntimeContext().b(s96Var));
                    s96Var.setVisibility(2);
                    arrayList.add(s96Var);
                } else {
                    arrayList.add(bi6Var);
                }
            }
        }
        return arrayList;
    }
}
