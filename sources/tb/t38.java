package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120561);
    }

    public static q26 a(int i, int i2, double d, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q26) ipChange.ipc$dispatch("3e4e70e0", new Object[]{new Integer(i), new Integer(i2), new Double(d), new Integer(i3), new Integer(i4)});
        }
        q26 q26Var = new q26();
        q26Var.f26456a = i;
        q26Var.b = i2;
        if (i3 != q26Var.d) {
            q26Var.c = kl6.f(DXWidgetNode.getAbsoluteGravity(i3, i4));
            q26Var.d = i3;
        }
        return q26Var;
    }

    public static void b(ViewGroup viewGroup, j jVar, q26 q26Var) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85406a2b", new Object[]{viewGroup, jVar, q26Var});
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = jVar.generateLayoutParams(q26Var);
        } else {
            layoutParams = jVar.generateLayoutParams(q26Var, layoutParams2);
        }
        viewGroup.setLayoutParams(layoutParams);
    }
}
