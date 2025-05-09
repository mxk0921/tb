package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jpp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopLoftNewVideoView f22143a;

    public jpp(ShopLoftNewVideoView shopLoftNewVideoView) {
        this.f22143a = shopLoftNewVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.f22143a.a0()) {
            ShopLoftNewVideoView.Q(this.f22143a);
        } else {
            ShopLoftNewVideoView.P(this.f22143a);
        }
    }
}
