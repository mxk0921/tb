package tb;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.provider.DefaultFragmentViewProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class v09 extends r1k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v09(ShopDataParser shopDataParser) {
        super(shopDataParser);
        ckf.g(shopDataParser, "shopDataParser");
    }

    public static /* synthetic */ Object ipc$super(v09 v09Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/FarmShopHomePageProvider");
    }

    @Override // tb.r1k
    public DefaultFragmentViewProvider a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultFragmentViewProvider) ipChange.ipc$dispatch("ab026e0e", new Object[]{this, new Integer(i)});
        }
        ups upsVar = b().get(i);
        ckf.f(upsVar, "tabBarItemDataModelList[position]");
        return new u09(upsVar);
    }
}
