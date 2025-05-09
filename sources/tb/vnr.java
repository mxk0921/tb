package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.TBLoftDWShopVideoView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vnr implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TBLoftDWShopVideoView f30131a;

    public vnr(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        this.f30131a = tBLoftDWShopVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (TBLoftDWShopVideoView.W(this.f30131a).h()) {
            TBLoftDWShopVideoView.R(this.f30131a);
        } else {
            TBLoftDWShopVideoView.S(this.f30131a);
            z9w Y = TBLoftDWShopVideoView.Y(this.f30131a);
            if (Y != null) {
                Y.a(true);
            } else {
                ckf.y("videoPlayController");
                throw null;
            }
        }
    }
}
