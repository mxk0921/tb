package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SCREEN_WIDTH = 1125;

    static {
        t2o.a(444597698);
    }

    public static ex5 a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ex5) ipChange.ipc$dispatch("67835f7f", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(u86.c);
        if (tag instanceof ex5) {
            return (ex5) tag;
        }
        return null;
    }

    public static DXWidgetNode b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e1473088", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (tag instanceof DXWidgetNode) {
            return (DXWidgetNode) tag;
        }
        return null;
    }

    public static boolean c(View view, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28f7e48e", new Object[]{view, dXWidgetNode})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.setTag(u86.f29223a, dXWidgetNode);
        return true;
    }

    public static void d(ex5 ex5Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54cd0ee", new Object[]{ex5Var, view});
        } else if (view != null && ex5Var != null) {
            view.setTag(u86.c, ex5Var);
            e(view, ex5Var.B());
        }
    }

    public static boolean e(View view, svb svbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e2553b", new Object[]{view, svbVar})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.setTag(DXWidgetNode.TAG_WIDGET_NODE, svbVar);
        return true;
    }

    public static int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58f07adf", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 51;
        }
        if (i == 1) {
            return 19;
        }
        if (i == 2) {
            return 83;
        }
        if (i == 3) {
            return 49;
        }
        if (i == 4) {
            return 17;
        }
        if (i == 5) {
            return 81;
        }
        if (i == 6) {
            return 53;
        }
        if (i == 7) {
            return 21;
        }
        if (i == 8) {
            return 85;
        }
        return 51;
    }
}
