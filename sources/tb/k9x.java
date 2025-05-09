package tb;

import com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jwk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class k9x implements jwk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeexV2WidgetGroupContentRender f22506a;

    public k9x(WeexV2WidgetGroupContentRender weexV2WidgetGroupContentRender) {
        this.f22506a = weexV2WidgetGroupContentRender;
    }

    @Override // tb.jwk.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8682cdb2", new Object[]{this})).booleanValue();
        }
        return WeexV2WidgetGroupContentRender.v(this.f22506a);
    }
}
