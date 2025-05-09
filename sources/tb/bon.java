package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bon extends ub5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093220);
    }

    public static /* synthetic */ Object ipc$super(bon bonVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/recommendpop/RecommendPopDxAdapter");
    }

    @Override // tb.ub5
    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        return w36.k().a(context, str);
    }

    @Override // tb.ub5
    public void e(DXRootView dXRootView, JSONObject jSONObject, String str) {
        DXRenderOptions dXRenderOptions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbf92c8", new Object[]{this, dXRootView, jSONObject, str});
            return;
        }
        Context context = dXRootView.getContext();
        if (!vc.a() || !vc.h(context)) {
            dXRenderOptions = null;
        } else {
            DXRenderOptions.b bVar = new DXRenderOptions.b();
            bVar.G(DXWidgetNode.DXMeasureSpec.c(vc.b(context), 1073741824));
            dXRenderOptions = bVar.q();
        }
        w36.k().i(dXRootView, jSONObject, dXRenderOptions);
    }
}
