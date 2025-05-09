package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class knp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Shop2023BaseComponent f22787a;
    public bnp b;

    static {
        t2o.a(766510379);
    }

    public knp(Shop2023BaseComponent shop2023BaseComponent) {
        ckf.g(shop2023BaseComponent, "shop");
        this.f22787a = shop2023BaseComponent;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final void c(boolean z) {
        View d;
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e23ad3", new Object[]{this, new Boolean(z)});
        } else if (z) {
            bnp bnpVar = this.b;
            if (bnpVar != null && (d2 = bnpVar.d()) != null) {
                kew.C(d2);
            }
        } else {
            bnp bnpVar2 = this.b;
            if (bnpVar2 != null && (d = bnpVar2.d()) != null) {
                kew.g0(d);
            }
        }
    }

    public final void a(ShopDataParser shopDataParser, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d8a947", new Object[]{this, shopDataParser, viewGroup});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        ckf.g(viewGroup, "rootLayout");
        if (this.f22787a instanceof FarmShop) {
            this.b = new bnp(kew.v(45));
        } else {
            this.b = new bnp(0, 1, null);
        }
        bnp bnpVar = this.b;
        if (bnpVar != null) {
            bnpVar.b(shopDataParser.L(), viewGroup);
        }
    }
}
