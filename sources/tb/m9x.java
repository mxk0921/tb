package tb;

import com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class m9x implements dde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeexV2WidgetGroupContentRender f23880a;

    public m9x(WeexV2WidgetGroupContentRender weexV2WidgetGroupContentRender) {
        this.f23880a = weexV2WidgetGroupContentRender;
    }

    @Override // tb.dde
    public final void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            return;
        }
        Object obj = map.get("pixels");
        if (obj != null) {
            double doubleValue = ((Double) obj).doubleValue();
            Object obj2 = map.get("velocity");
            if (obj2 != null) {
                Double d = (Double) obj2;
                Object obj3 = map.get("axis");
                String str = obj3 instanceof String ? (String) obj3 : null;
                npp.Companion.b(ckf.p("velocity : ", d));
                if (ckf.b(str, "vertical") && doubleValue > vu3.b.GEO_NOT_SUPPORT) {
                    WeexV2WidgetGroupContentRender.w(this.f23880a, true);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
    }
}
