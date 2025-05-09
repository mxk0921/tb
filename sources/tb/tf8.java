package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tf8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698594);
    }

    public void a(ViewGroup viewGroup, ig1 ig1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4960dfe2", new Object[]{this, viewGroup, ig1Var});
        } else if (viewGroup != null && ig1Var != null && ig1Var.b() != null && ig1Var.b().getDxData() != null) {
            String templateName = ig1Var.b().getTemplateName();
            q0h.a("EntranceAreaDXRender", "templateName = " + templateName);
            if (TextUtils.isEmpty(templateName)) {
                q0h.a("EntranceAreaDXRender", "renderEntranceDXView | template name is Empty.");
                return;
            }
            viewGroup.removeAllViews();
            DXRootView createDX = d9m.n().createDX(viewGroup.getContext(), templateName);
            if (createDX != null) {
                viewGroup.addView(createDX);
                d9m.n().renderDX(createDX, fqu.b(ig1Var.b().getDxData()));
            }
        }
    }
}
