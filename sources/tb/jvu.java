package tb;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710120);
    }

    public static boolean a(hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f6a033", new Object[]{hvuVar})).booleanValue();
        }
        if (hvuVar == null) {
            return false;
        }
        if (hvuVar.getNodeType() == UINodeType.DRAWABLE || hvuVar.getNodeType() == UINodeType.VIEW) {
            return true;
        }
        return false;
    }

    public static boolean b(hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59f59f38", new Object[]{hvuVar})).booleanValue();
        }
        if (hvuVar == null || hvuVar.getNodeType() != UINodeType.VIEW) {
            return false;
        }
        return true;
    }

    public static void c(View view, Drawable drawable) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64148058", new Object[]{view, drawable});
            return;
        }
        if (view.getVisibility() != 0) {
            z = false;
        }
        drawable.setVisible(z, false);
        drawable.setCallback(view);
    }

    public static void d(UINode uINode, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b850c175", new Object[]{uINode, view});
        } else if (uINode.hasEvent("click")) {
            ViewProxy.setOnClickListener(view, new puu(uINode.getInstance(), uINode.getNodeId()));
            view.setClickable(true);
        }
    }

    public static void f(Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55d39a7", new Object[]{obj, rect});
        } else if (obj instanceof View) {
            ((View) obj).setPadding(rect.left, rect.top, rect.right, rect.bottom);
        } else if (obj instanceof Drawable) {
            ((vuu) obj).n(rect);
        }
    }

    public static void g(UINode uINode, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd7ae2f", new Object[]{uINode, view});
            return;
        }
        view.setTag(R.id.mus_id_tag, uINode);
        d(uINode, view);
        e(uINode, view);
        f(view, uINode.getPadding());
        view.setContentDescription(uINode.getAriaLabel());
        if (uINode.getNodeInfo().O()) {
            view.setImportantForAccessibility(2);
        }
    }

    public static void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6d7de6", new Object[]{view});
            return;
        }
        view.setTag(R.id.mus_id_tag, null);
        ViewProxy.setOnClickListener(view, null);
        ViewProxy.setOnLongClickListener(view, null);
        view.setClickable(false);
        view.setLongClickable(false);
        i(view);
        view.setImportantForAccessibility(0);
        view.setContentDescription(null);
    }

    public static void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25ec6c8", new Object[]{view});
        } else {
            view.setPadding(0, 0, 0, 0);
        }
    }

    public static void e(UINode uINode, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61b9111", new Object[]{uINode, view});
        } else if (uINode.hasEvent("longtap")) {
            ViewProxy.setOnLongClickListener(view, new yuu(uINode.getInstance(), uINode.getNodeId()));
            view.setLongClickable(true);
        }
    }
}
