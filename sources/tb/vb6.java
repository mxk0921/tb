package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class vb6 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432062);
    }

    public static /* synthetic */ Object ipc$super(vb6 vb6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXScrollLayoutAbsAbility");
    }

    public final DXRecyclerLayout i(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("6bba05e7", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            return (DXRecyclerLayout) dXWidgetNode;
        }
        return i(dXWidgetNode.getParentWidget());
    }

    public abstract String j();

    public abstract void l(String str, DXWidgetNode dXWidgetNode);

    /* renamed from: k */
    public c8<?> f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext dXRuntimeContext;
        DXWidgetNode H;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var != null) {
            String i = n8Var.i("targetNodeId");
            String i2 = n8Var.i("eventType");
            String i3 = n8Var.i("targetNodeType");
            if (i3 == null) {
                i3 = "scrollLayout";
            }
            if (i == null || i.length() == 0 || i2 == null || i2.length() == 0 || tk6Var == null) {
                return new b8(new a8(-1999, "DXScrollLayoutAbsAbility " + j() + " empty userId or type or akCtx"), false);
            }
            DXWidgetNode q = tk6Var.q();
            DXWidgetNode dXWidgetNode = null;
            if (ckf.b(i, q != null ? q.getUserId() : null)) {
                dXWidgetNode = tk6Var.q();
            } else {
                DXWidgetNode q2 = tk6Var.q();
                if (q2 == null || (queryWidgetNodeByUserId = q2.queryWidgetNodeByUserId(i)) == null) {
                    DXWidgetNode q3 = tk6Var.q();
                    if (!(q3 == null || (dXRuntimeContext = q3.getDXRuntimeContext()) == null || (H = dXRuntimeContext.H()) == null)) {
                        dXWidgetNode = H.queryWidgetNodeByUserId(i);
                    }
                } else {
                    dXWidgetNode = queryWidgetNodeByUserId;
                }
            }
            if (ckf.b(i3, "recyclerLayout") && !(dXWidgetNode instanceof DXRecyclerLayout)) {
                dXWidgetNode = i(tk6Var.q());
            }
            if (dXWidgetNode != null) {
                l(i2, dXWidgetNode);
            } else {
                return new b8(new a8(-1999, "DXScrollLayoutAbsAbility " + j() + " widgetNode not found"), false);
            }
        }
        return new f8();
    }
}
