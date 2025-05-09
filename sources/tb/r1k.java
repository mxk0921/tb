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
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class r1k implements aqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<JSONObject> f27047a = new ArrayList<>();
    public final ArrayList<ups> b = new ArrayList<>();
    public final HashMap<Integer, ShopStandardFragment> c = new HashMap<>();

    static {
        t2o.a(766510125);
        t2o.a(766510110);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r1k(ShopDataParser shopDataParser) {
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
                        b().add(new ups((JSONObject) obj2, shopDataParser, i, i2));
                        this.f27047a.add(obj2);
                    }
                }
                continue;
            }
        }
    }

    public final ArrayList<ups> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("15cf8697", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ee64cf", new Object[]{this})).booleanValue();
        }
        Iterator<ups> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
        }
        ShopStandardFragment shopStandardFragment = this.c.get(Integer.valueOf(i));
        if (shopStandardFragment == null) {
            shopStandardFragment = new ShopStandardFragment();
            shopStandardFragment.B2(a(i));
        }
        this.c.put(Integer.valueOf(i), shopStandardFragment);
        return shopStandardFragment;
    }

    public DefaultFragmentViewProvider a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultFragmentViewProvider) ipChange.ipc$dispatch("ab026e0e", new Object[]{this, new Integer(i)});
        }
        ShopDataParser o = this.b.get(i).o();
        if (o != null && o.H1()) {
            ShopDataParser o2 = this.b.get(i).o();
            if (!ckf.b(o2 == null ? null : o2.u0(), eop.FLAG_SHIP_V25)) {
                ups upsVar = this.b.get(i);
                ckf.f(upsVar, "tabBarItemDataModelList[position]");
                return new cnp(upsVar);
            }
        }
        return new DefaultFragmentViewProvider(this.b.get(i));
    }
}
