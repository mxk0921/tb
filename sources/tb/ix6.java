package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.shop2023.Default2023Shop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ix6 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Default2023Shop f21627a;
    public final /* synthetic */ ShopWrapWebView b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Default2023Shop f21628a;
        public final /* synthetic */ ShopWrapWebView b;

        public a(Default2023Shop default2023Shop, ShopWrapWebView shopWrapWebView) {
            this.f21628a = default2023Shop;
            this.b = shopWrapWebView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!r54.d(Default2023Shop.o1(this.f21628a)) && !this.b.isDestroied()) {
                View a2 = this.b.getShopFrameworkBizAdapter().a();
                if (a2 != null) {
                    kew.h(a2);
                }
                kew.e(this.b, 0);
                Default2023Shop.w1(this.f21628a).h(0);
                dnp B1 = Default2023Shop.B1(this.f21628a);
                if (B1 != null) {
                    B1.I();
                }
                Default2023Shop.U1(this.f21628a);
            }
        }
    }

    public ix6(Default2023Shop default2023Shop, ShopWrapWebView shopWrapWebView) {
        this.f21627a = default2023Shop;
        this.b = shopWrapWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Default2023Shop default2023Shop = this.f21627a;
        a aVar = new a(default2023Shop, this.b);
        if (Default2023Shop.t1(default2023Shop) || Default2023Shop.g1(this.f21627a) || Default2023Shop.N1(this.f21627a)) {
            Default2023Shop.W1(this.f21627a, aVar);
        } else {
            aVar.run();
        }
    }
}
