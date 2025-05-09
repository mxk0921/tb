package tb;

import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.provider.DefaultFragmentViewProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fhl implements aqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<JSONObject> f19300a = new ArrayList<>();
    public final ArrayList<ups> b = new ArrayList<>();
    public final HashMap<Integer, ShopStandardFragment> c = new HashMap<>();

    static {
        t2o.a(766510126);
        t2o.a(766510110);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fhl(ShopDataParser shopDataParser) {
        ckf.g(shopDataParser, "shopDataParser");
        int i = 0;
        for (Object obj : shopDataParser.u1()) {
            i++;
            if (i < 0) {
                yz3.p();
                throw null;
            } else if (obj instanceof JSONArray) {
                int i2 = 0;
                for (Object obj2 : (Iterable) obj) {
                    i2++;
                    if (i2 < 0) {
                        yz3.p();
                        throw null;
                    } else if (obj2 instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj2;
                        if (ckf.b(brf.d(jSONObject, "name"), "allitems")) {
                            this.b.add(new ups(jSONObject, shopDataParser, i, i2));
                            this.f19300a.add(obj2);
                        }
                    }
                }
                continue;
            }
        }
    }

    @Override // tb.aqd
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    @Override // tb.aqd
    public Fragment getItem(int i) {
        c8c c8cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
        }
        ShopStandardFragment shopStandardFragment = this.c.get(Integer.valueOf(i));
        if (shopStandardFragment == null) {
            shopStandardFragment = new ShopStandardFragment();
            ShopDataParser o = this.b.get(i).o();
            if (o != null && o.H1()) {
                ups upsVar = this.b.get(i);
                ckf.f(upsVar, "tabBarItemDataModelList[position]");
                c8cVar = new ehl(upsVar);
            } else {
                c8cVar = new DefaultFragmentViewProvider(this.b.get(i));
            }
            shopStandardFragment.B2(c8cVar);
        }
        this.c.put(Integer.valueOf(i), shopStandardFragment);
        return shopStandardFragment;
    }
}
