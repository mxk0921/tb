package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class r09 implements ShopNewLiveLoftView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FarmShop f27031a;

    public r09(FarmShop farmShop) {
        this.f27031a = farmShop;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView.a
    public void a() {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150378ba", new Object[]{this});
            return;
        }
        jnp s1 = FarmShop.s1(this.f27031a);
        if (!(s1 == null || (d = s1.d()) == null)) {
            kew.g0(d);
        }
        EmbedShopLoftComponent j1 = FarmShop.j1(this.f27031a);
        if (j1 != null) {
            j1.L();
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
        jnp s1 = FarmShop.s1(this.f27031a);
        if (!(s1 == null || (d = s1.d()) == null)) {
            kew.C(d);
        }
        EmbedShopLoftComponent j1 = FarmShop.j1(this.f27031a);
        if (j1 != null) {
            j1.y();
        }
    }
}
