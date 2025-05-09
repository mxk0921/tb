package tb;

import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.b1m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hpp<T extends b1m> implements s8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopLoftNewVideoView f20805a;

    public hpp(ShopLoftNewVideoView shopLoftNewVideoView) {
        this.f20805a = shopLoftNewVideoView;
    }

    /* renamed from: a */
    public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
        }
        MediaPlayCenter T = ShopLoftNewVideoView.T(this.f20805a);
        if (T != null) {
            T.setCoverImg(succPhenixEvent.getDrawable(), true);
            return true;
        }
        ckf.y("mediaPlayCenter");
        throw null;
    }
}
