package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kpp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopLoftNewVideoViewWithDW f22832a;

    public kpp(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        this.f22832a = shopLoftNewVideoViewWithDW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        r T = ShopLoftNewVideoViewWithDW.T(this.f22832a);
        if (T != null && T.U()) {
            ShopLoftNewVideoViewWithDW.R(this.f22832a);
            return;
        }
        ShopLoftNewVideoViewWithDW.S(this.f22832a);
        z9w W = ShopLoftNewVideoViewWithDW.W(this.f22832a);
        if (W != null) {
            W.a(true);
        } else {
            ckf.y("videoPlayController");
            throw null;
        }
    }
}
