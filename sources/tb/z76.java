package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596942);
    }

    public static void a(View view, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8ce3b8", new Object[]{view, dXRuntimeContext});
        } else if (view != null) {
            if (dXRuntimeContext != null && dXRuntimeContext.s() != null && dXRuntimeContext.s().p()) {
                tm6 R = dXRuntimeContext.s().f().R();
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayList.add(viewGroup.getChildAt(i));
                    }
                    viewGroup.removeAllViews();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        R.c(dXRuntimeContext, (View) arrayList.get(i2));
                    }
                }
            } else if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
        }
    }

    public static void b(DXRuntimeContext dXRuntimeContext, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb854b48", new Object[]{dXRuntimeContext, view});
        } else if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
            if (dXRuntimeContext != null && dXRuntimeContext.s() != null && dXRuntimeContext.s().p()) {
                dXRuntimeContext.s().f().R().c(dXRuntimeContext, view);
            }
        }
    }
}
