package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class irp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopWrapWebView f21531a;

    static {
        t2o.a(766510077);
    }

    public irp(Context context) {
        ckf.g(context, "context");
        this.f21531a = new ShopWrapWebView(context);
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("143738ac", new Object[]{this});
        }
        return this.f21531a;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1609a5ca", new Object[]{this, str});
        } else if (str != null) {
            this.f21531a.render(str);
        }
    }

    public final void c(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
        } else {
            this.f21531a.setShopData(shopDataParser);
        }
    }
}
