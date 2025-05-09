package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class mb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596947);
    }

    public abstract void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, DXRuntimeContext dXRuntimeContext);

    public void b(WeakReference<View> weakReference, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1687a44", new Object[]{this, weakReference, dXRuntimeContext});
        } else if (weakReference != null) {
            if (dXRuntimeContext == null || dXRuntimeContext.s() == null || !dXRuntimeContext.s().p()) {
                View view = weakReference.get();
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).removeAllViews();
                    return;
                }
                return;
            }
            tm6 R = dXRuntimeContext.s().f().R();
            View view2 = weakReference.get();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
                viewGroup.removeAllViews();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    R.c(dXRuntimeContext, (View) arrayList.get(i2));
                }
            }
        }
    }

    public void c(DXRuntimeContext dXRuntimeContext, WeakReference<View> weakReference) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbb7994", new Object[]{this, dXRuntimeContext, weakReference});
        } else if (weakReference != null && (view = weakReference.get()) != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
            if (dXRuntimeContext != null && dXRuntimeContext.s() != null && dXRuntimeContext.s().p()) {
                dXRuntimeContext.s().f().R().c(dXRuntimeContext, view);
            }
        }
    }
}
