package tb;

import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngine;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class app implements xpd.a.AbstractC1101a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopLoftDXEngine f15921a;

    static {
        t2o.a(766509244);
        t2o.a(766509128);
    }

    public app(ShopLoftDXEngine shopLoftDXEngine) {
        ckf.g(shopLoftDXEngine, "shopLoftDXEngine");
        this.f15921a = shopLoftDXEngine;
    }

    @Override // tb.xpd.a.AbstractC1101a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
        } else {
            this.f15921a.f().q0();
        }
    }

    public final ShopLoftDXEngine e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftDXEngine) ipChange.ipc$dispatch("56170082", new Object[]{this});
        }
        return this.f15921a;
    }
}
