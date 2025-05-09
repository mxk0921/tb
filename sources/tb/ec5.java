package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.animation.util.DXAnimationProperty;
import com.taobao.android.dinamicx_v4.responsive.impl.PropertyInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ec5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597770);
    }

    public static void a(yb5 yb5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc42ba5", new Object[]{yb5Var, new Boolean(z)});
            return;
        }
        View b = yb5Var.b();
        DXWidgetNode b2 = kl6.b(b);
        if ((b2 instanceof DXWidgetNode) && b2.getReferenceNode() != null) {
            for (Pair pair : yb5Var.a()) {
                DXAnimationProperty b3 = DXAnimationProperty.b((String) pair.first);
                if (b3 != null) {
                    b3.a(b, z);
                }
            }
        }
    }

    public static Object b(String str, View view, Object obj) {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c4c2b854", new Object[]{str, view, obj});
        }
        try {
            b = kl6.b(view);
        } catch (Throwable unused) {
        }
        if (!(b instanceof DXWidgetNode)) {
            return view;
        }
        if (b.getReferenceNode() == null) {
            return view;
        }
        sl6 dxv4Properties = b.getDxv4Properties();
        if (dxv4Properties == null) {
            return obj;
        }
        DXLongSparseArray<ivb> g = dxv4Properties.g();
        if (g == null) {
            return obj;
        }
        Long b2 = PropertyInfo.b(str);
        if (b2 == null) {
            return obj;
        }
        ivb ivbVar = g.get(b2.longValue());
        if (ivbVar == null) {
            return obj;
        }
        if (ivbVar.c() == 32 && (obj instanceof Number)) {
            return Float.valueOf(pb6.d(pb6.n(view), DinamicXEngine.x(), ((Number) obj).floatValue()));
        }
        return obj;
    }
}
