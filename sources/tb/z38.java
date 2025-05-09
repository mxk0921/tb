package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Class<? extends DXWidgetNode>> f32508a;

    static {
        t2o.a(491782763);
    }

    public z38(List<Class<? extends DXWidgetNode>> list) {
        this.f32508a = list;
    }

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

    public final List<IVideoPlayControllerService.c> b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54515b5c", new Object[]{this, dXWidgetNode});
        }
        ArrayList arrayList = new ArrayList();
        if (g(dXWidgetNode)) {
            arrayList.add((IVideoPlayControllerService.c) dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null) {
            return arrayList;
        }
        for (DXWidgetNode dXWidgetNode2 : children) {
            arrayList.addAll(b(dXWidgetNode2));
        }
        return arrayList;
    }

    public final List<IVideoPlayControllerService.c> c(ex5 ex5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43647da8", new Object[]{this, ex5Var});
        }
        DXWidgetNode B = ex5Var.B();
        ArrayList arrayList = new ArrayList();
        if (g(B)) {
            arrayList.add((IVideoPlayControllerService.c) B);
        }
        List<ex5> i = ex5Var.i();
        if (i == null) {
            return arrayList;
        }
        for (ex5 ex5Var2 : i) {
            arrayList.addAll(c(ex5Var2));
        }
        return arrayList;
    }

    public List<IVideoPlayControllerService.c> d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf90cfad", new Object[]{this, view});
        }
        View a2 = a(view, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class});
        if (a2 == null) {
            return null;
        }
        if (h(a2)) {
            return e(a2);
        }
        DXWidgetNode f = f(a2);
        if (f == null) {
            return null;
        }
        return b(f);
    }

    public List<IVideoPlayControllerService.c> e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e7d942b", new Object[]{this, view});
        }
        ex5 a2 = kl6.a(view);
        if (a2 == null) {
            return null;
        }
        return c(a2);
    }

    public final DXWidgetNode f(View view) {
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

    public final boolean g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a55cb21b", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof IVideoPlayControllerService.c)) {
            return false;
        }
        for (Class<? extends DXWidgetNode> cls : this.f32508a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10bb19cc", new Object[]{this, view})).booleanValue();
        }
        if (kl6.a(view) != null) {
            return true;
        }
        return false;
    }
}
