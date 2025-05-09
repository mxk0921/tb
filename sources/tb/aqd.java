package tb;

import androidx.fragment.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface aqd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510111);
        }

        public static ShopStandardFragment a(aqd aqdVar, c8c c8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopStandardFragment) ipChange.ipc$dispatch("fe4bc5f", new Object[]{aqdVar, c8cVar});
            }
            ckf.g(aqdVar, "this");
            ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
            shopStandardFragment.B2(c8cVar);
            return shopStandardFragment;
        }
    }

    int getCount();

    Fragment getItem(int i);
}
