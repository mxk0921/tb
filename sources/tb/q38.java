package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f26480a = {"recMainTitle_visible"};

    public final View a(View view, Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4e488b75", new Object[]{this, view, clsArr});
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
            View a2 = a(viewGroup.getChildAt(i), clsArr);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final DXWidgetNode b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f9dd4e11", new Object[]{this, view});
        }
        DXWidgetNode d = d(view);
        DXWidgetNode dXWidgetNode = null;
        if (d == null) {
            return null;
        }
        for (String str : f26480a) {
            dXWidgetNode = d.queryWidgetNodeByUserId(str);
            if (dXWidgetNode != null) {
                break;
            }
        }
        return dXWidgetNode;
    }

    public RRichTextView c(View view) {
        View a2;
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RRichTextView) ipChange.ipc$dispatch("de6e1b56", new Object[]{this, view});
        }
        if (!(view == null || (a2 = a(view, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class})) == null || (b = b(a2)) == null)) {
            View D = b.getDXRuntimeContext().D();
            if (D instanceof RRichTextView) {
                return (RRichTextView) D;
            }
        }
        return null;
    }

    public final DXWidgetNode d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("48c8d7a", new Object[]{this, view});
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

    public final DXWidgetNode e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d8349ab6", new Object[]{this, view});
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

    public final boolean f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10bb19cc", new Object[]{this, view})).booleanValue();
        }
        if (kl6.a(view) != null) {
            return true;
        }
        return false;
    }

    static {
        t2o.a(486539529);
    }
}
