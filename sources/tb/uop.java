package tb;

import androidx.fragment.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.provider.DefaultFragmentViewProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class uop implements aqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pps f29537a;
    public final Fragment[] b;

    static {
        t2o.a(766510135);
        t2o.a(766510110);
    }

    public uop(pps ppsVar) {
        this.f29537a = ppsVar;
        Fragment[] fragmentArr = null;
        if (!(ppsVar == null || ppsVar.b() == 0)) {
            int b = ppsVar.b();
            fragmentArr = new Fragment[b];
            for (int i = 0; i < b; i++) {
                ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
                ups a2 = this.f29537a.a(i);
                if (a2 != null) {
                    shopStandardFragment.B2(new DefaultFragmentViewProvider(a2));
                }
                fragmentArr[i] = shopStandardFragment;
            }
        }
        this.b = fragmentArr;
    }

    public ShopStandardFragment a(c8c c8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopStandardFragment) ipChange.ipc$dispatch("8aff4df2", new Object[]{this, c8cVar});
        }
        return aqd.a.a(this, c8cVar);
    }

    @Override // tb.aqd
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        pps ppsVar = this.f29537a;
        if (ppsVar == null) {
            return 0;
        }
        return ppsVar.b();
    }

    @Override // tb.aqd
    public Fragment getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
        }
        Fragment[] fragmentArr = this.b;
        if (fragmentArr == null || i >= fragmentArr.length) {
            return a(null);
        }
        return fragmentArr[i];
    }
}
