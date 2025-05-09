package tb;

import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ozq implements aqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Fragment> f25770a;
    public final int b;

    static {
        t2o.a(766510137);
        t2o.a(766510110);
    }

    public ozq(SwipeBigCardComponent swipeBigCardComponent) {
        ckf.g(swipeBigCardComponent, "swipeBigCardComponent");
        ArrayList<Fragment> arrayList = new ArrayList<>();
        this.f25770a = arrayList;
        JSONArray J = swipeBigCardComponent.i().J();
        int size = J == null ? 0 : J.size();
        boolean a2 = swipeBigCardComponent.a();
        if (size == 1) {
            this.b = 1;
        } else if (size > 1) {
            this.b = a2 ? 2 : 1;
        }
        if (this.b == 1) {
            ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
            shopStandardFragment.B2(new nzq(swipeBigCardComponent, 0, a2));
            xhv xhvVar = xhv.INSTANCE;
            arrayList.add(shopStandardFragment);
            return;
        }
        ShopStandardFragment shopStandardFragment2 = new ShopStandardFragment();
        shopStandardFragment2.B2(new nzq(swipeBigCardComponent, 0, true));
        xhv xhvVar2 = xhv.INSTANCE;
        arrayList.add(shopStandardFragment2);
        ShopStandardFragment shopStandardFragment3 = new ShopStandardFragment();
        shopStandardFragment3.B2(new nzq(swipeBigCardComponent, 1, false));
        arrayList.add(shopStandardFragment3);
    }

    @Override // tb.aqd
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // tb.aqd
    public Fragment getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
        }
        Fragment fragment = this.f25770a.get(i);
        ckf.f(fragment, "fragments[position]");
        return fragment;
    }
}
