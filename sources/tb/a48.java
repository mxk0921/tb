package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782713);
    }

    public static View a(View view, String str) {
        View c;
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("843dbdee", new Object[]{view, str});
        }
        if (view == null || (c = c(view, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class})) == null || (b = b(c, str)) == null) {
            return null;
        }
        return b.getDXRuntimeContext().D();
    }

    public static DXWidgetNode b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("dc1d7e01", new Object[]{view, str});
        }
        DXWidgetNode d = d(view);
        if (d == null) {
            return null;
        }
        return d.queryWidgetNodeByUserId(str);
    }

    public static View c(View view, Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4e488b75", new Object[]{view, clsArr});
        }
        for (Class<?> cls : clsArr) {
            if (cls.isInstance(view)) {
                return view;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View c = c(viewGroup.getChildAt(i), clsArr);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public static DXWidgetNode d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("48c8d7a", new Object[]{view});
        }
        if (!f(view)) {
            return e(view);
        }
        ex5 a2 = kl6.a(view);
        if (a2 == null) {
            return null;
        }
        return a2.B();
    }

    public static DXWidgetNode e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d8349ab6", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getFlattenWidgetNode();
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (tag instanceof DXWidgetNode) {
            return (DXWidgetNode) tag;
        }
        return null;
    }

    public static boolean f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10bb19cc", new Object[]{view})).booleanValue();
        }
        if (kl6.a(view) != null) {
            return true;
        }
        return false;
    }
}
