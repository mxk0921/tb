package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class baw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final z38 f16286a;

    static {
        t2o.a(491782764);
    }

    public baw(List<Class<? extends DXWidgetNode>> list) {
        this.f16286a = new z38(list);
    }

    public final aaw a(IVideoPlayControllerService.c cVar, a69 a69Var) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aaw) ipChange.ipc$dispatch("27bee366", new Object[]{this, cVar, a69Var});
        }
        if (!(cVar instanceof DXWidgetNode)) {
            return null;
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) cVar;
        if (dXWidgetNode.getWRView() == null) {
            view = null;
        } else {
            view = dXWidgetNode.getWRView().get();
        }
        if (view == null) {
            return null;
        }
        return new aaw(cVar, b(view, a69Var));
    }

    public final dcw b(View view, a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcw) ipChange.ipc$dispatch("8e8cc5ce", new Object[]{this, view, a69Var});
        }
        Rect b = lue.b(view);
        if (a69Var == null) {
            return new dcw(-1.0f, b);
        }
        float d = lue.d(a69Var.a(), b);
        fve.e("VideoPlayControllerItemFinder", "exposureRatio : " + d);
        return new dcw(d, b);
    }

    public List<aaw> c(View view, a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("765dc6c0", new Object[]{this, view, a69Var});
        }
        return e(this.f16286a.d(view), a69Var);
    }

    public List<aaw> d(List<View> list, a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cefdcae5", new Object[]{this, list, a69Var});
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            List<aaw> c = c(view, a69Var);
            if (c != null && !c.isEmpty()) {
                arrayList.addAll(c);
            }
        }
        return arrayList;
    }

    public final List<aaw> e(List<IVideoPlayControllerService.c> list, a69 a69Var) {
        aaw a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa44a20", new Object[]{this, list, a69Var});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IVideoPlayControllerService.c cVar : list) {
            if (cVar.m() && (a2 = a(cVar, a69Var)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
