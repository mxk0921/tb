package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.TBLoftDWShopVideoView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wnr implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TBLoftDWShopVideoView f30804a;

    public wnr(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        this.f30804a = tBLoftDWShopVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (TBLoftDWShopVideoView.W(this.f30804a).g()) {
            TBLoftDWShopVideoView.Q(this.f30804a);
            xpd.c T = TBLoftDWShopVideoView.T(this.f30804a);
            if (T != null) {
                T.p(xpd.c.EVENT_ON_MUTE_STATUS_CHANGED, brf.a(jpu.a("isMuted", Boolean.FALSE)));
            }
        } else {
            TBLoftDWShopVideoView.P(this.f30804a);
            xpd.c T2 = TBLoftDWShopVideoView.T(this.f30804a);
            if (T2 != null) {
                T2.p(xpd.c.EVENT_ON_MUTE_STATUS_CHANGED, brf.a(jpu.a("isMuted", Boolean.TRUE)));
            }
        }
    }
}
