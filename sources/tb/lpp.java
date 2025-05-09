package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lpp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopLoftNewVideoViewWithDW f23503a;

    public lpp(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        this.f23503a = shopLoftNewVideoViewWithDW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        r T = ShopLoftNewVideoViewWithDW.T(this.f23503a);
        if (T != null && T.T()) {
            ShopLoftNewVideoViewWithDW.Q(this.f23503a);
            xpd.c h = this.f23503a.h();
            if (h != null) {
                h.p(xpd.c.EVENT_ON_MUTE_STATUS_CHANGED, brf.a(jpu.a("isMuted", Boolean.FALSE)));
                return;
            }
            return;
        }
        ShopLoftNewVideoViewWithDW.P(this.f23503a);
        xpd.c h2 = this.f23503a.h();
        if (h2 != null) {
            h2.p(xpd.c.EVENT_ON_MUTE_STATUS_CHANGED, brf.a(jpu.a("isMuted", Boolean.TRUE)));
        }
    }
}
