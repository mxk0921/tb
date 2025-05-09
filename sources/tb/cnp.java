package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.provider.DefaultFragmentViewProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cnp extends DefaultFragmentViewProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FrameLayout d;

    static {
        t2o.a(766510408);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnp(ups upsVar) {
        super(upsVar);
        ShopDataParser.e O0;
        ShopDataParser.e O02;
        ckf.g(upsVar, "tabBarItemDataModel");
        ShopDataParser o = upsVar.o();
        ckf.d(o);
        Context Q = o.Q();
        ckf.d(Q);
        FrameLayout frameLayout = new FrameLayout(Q);
        int i = 0;
        if (upsVar.j() <= 1) {
            kew.T(frameLayout);
            ShopDataParser o2 = upsVar.o();
            kew.a0(frameLayout, (o2 == null || (O02 = o2.O0()) == null) ? 0 : O02.i());
        }
        ShopDataParser o3 = upsVar.o();
        if (!(o3 == null || (O0 = o3.O0()) == null)) {
            i = O0.i();
        }
        kew.e0(frameLayout, true, i / 2);
        xhv xhvVar = xhv.INSTANCE;
        this.d = frameLayout;
    }

    public static /* synthetic */ Object ipc$super(cnp cnpVar, String str, Object... objArr) {
        if (str.hashCode() == -625877200) {
            return super.b((Context) objArr[0], (Fragment) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/provider/Shop2023FragmentViewProvider");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.provider.DefaultFragmentViewProvider, tb.c8c
    public View b(Context context, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dab1df30", new Object[]{this, context, fragment});
        }
        ckf.g(fragment, "outerFragment");
        View b = super.b(context, fragment);
        if (b != null) {
            kew.a(this.d, b);
        }
        return this.d;
    }
}
