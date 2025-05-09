package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ml6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700131);
    }

    public static DXRenderOptions a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions) ipChange.ipc$dispatch("4d4e7030", new Object[]{context});
        }
        if (!vc.a() || !vc.h(context)) {
            return null;
        }
        DXRenderOptions.b bVar = new DXRenderOptions.b();
        bVar.G(DXWidgetNode.DXMeasureSpec.c(vc.b(context), 1073741824));
        bVar.t(vc.c(context));
        return bVar.q();
    }
}
