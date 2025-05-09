package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.shop2023.Default2023Shop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gx6 implements ShopNewLiveLoftView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Default2023Shop f20286a;

    public gx6(Default2023Shop default2023Shop) {
        this.f20286a = default2023Shop;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView.a
    public void a() {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150378ba", new Object[]{this});
            return;
        }
        jnp F1 = Default2023Shop.F1(this.f20286a);
        if (!(F1 == null || (d = F1.d()) == null)) {
            kew.g0(d);
        }
        EmbedShopLoftComponent p1 = Default2023Shop.p1(this.f20286a);
        if (p1 != null) {
            p1.L();
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
        jnp F1 = Default2023Shop.F1(this.f20286a);
        if (!(F1 == null || (d = F1.d()) == null)) {
            kew.C(d);
        }
        EmbedShopLoftComponent p1 = Default2023Shop.p1(this.f20286a);
        if (p1 != null) {
            p1.y();
        }
    }
}
