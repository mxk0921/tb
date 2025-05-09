package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ipp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopLoftNewVideoView f21498a;

    public ipp(ShopLoftNewVideoView shopLoftNewVideoView) {
        this.f21498a = shopLoftNewVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        MediaPlayCenter T = ShopLoftNewVideoView.T(this.f21498a);
        if (T == null) {
            ckf.y("mediaPlayCenter");
            throw null;
        } else if (T.isPlaying()) {
            ShopLoftNewVideoView.R(this.f21498a);
        } else {
            ShopLoftNewVideoView.S(this.f21498a);
            z9w V = ShopLoftNewVideoView.V(this.f21498a);
            if (V != null) {
                V.a(true);
            } else {
                ckf.y("videoPlayController");
                throw null;
            }
        }
    }
}
