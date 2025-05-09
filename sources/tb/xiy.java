package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.shop2023.FlagShipV25;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xiy implements ShopNewLiveLoftView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlagShipV25 f31417a;

    public xiy(FlagShipV25 flagShipV25) {
        this.f31417a = flagShipV25;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView.a
    public void a() {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150378ba", new Object[]{this});
            return;
        }
        jnp u1 = FlagShipV25.u1(this.f31417a);
        if (!(u1 == null || (d = u1.d()) == null)) {
            kew.g0(d);
        }
        EmbedShopLoftComponent n1 = FlagShipV25.n1(this.f31417a);
        if (n1 != null) {
            n1.L();
        }
    }

    @Override // tb.xpd.a.AbstractC1101a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView.a
    public void onError() {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            return;
        }
        jnp u1 = FlagShipV25.u1(this.f31417a);
        if (!(u1 == null || (d = u1.d()) == null)) {
            kew.C(d);
        }
        EmbedShopLoftComponent n1 = FlagShipV25.n1(this.f31417a);
        if (n1 != null) {
            n1.y();
        }
    }
}
