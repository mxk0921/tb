package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uf3 extends wga {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean n = true;

    static {
        t2o.a(295699342);
    }

    public uf3(xea xeaVar, ItemCategory itemCategory) {
        super(xeaVar, itemCategory);
    }

    public static /* synthetic */ Object ipc$super(uf3 uf3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/CategoryPresenter");
    }

    @Override // tb.uzp
    public boolean P(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e89a3146", new Object[]{this, new Long(j), new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // tb.uzp
    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d780fc7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.uzp
    public boolean Y(ArrayList<th5> arrayList) {
        ItemCategory itemCategory;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74347192", new Object[]{this, arrayList})).booleanValue();
        }
        if (wda.A() && this.n && (itemCategory = this.j) != null && !itemCategory.isIndependentTab()) {
            xea xeaVar = this.d;
            if (xeaVar == null) {
                hha.b("CategoryPresenter", "mGoodLiveContext=null");
                return false;
            } else if (xeaVar.g == null) {
                hha.b("CategoryPresenter", "allNormalGoodsItems=null");
                return false;
            } else if (arrayList == null) {
                hha.b("CategoryPresenter", "dataList=null");
                return false;
            } else {
                this.n = false;
                HashMap hashMap = new HashMap();
                Iterator<th5> it = arrayList.iterator();
                while (it.hasNext()) {
                    th5 next = it.next();
                    hashMap.put(next.e, next);
                }
                List<ItemIdentifier> l = this.k.l();
                ArrayList arrayList2 = new ArrayList();
                int size = l.size();
                int size2 = arrayList.size();
                Iterator<ItemIdentifier> it2 = l.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ItemIdentifier next2 = it2.next();
                    if (!hashMap.containsKey(next2.itemId)) {
                        th5 th5Var = this.d.g.get(next2.itemId);
                        if (th5Var == null) {
                            hha.b("CategoryPresenter", "缓存存在缺失数据");
                            break;
                        }
                        arrayList2.add(th5Var);
                        i++;
                        z = true;
                    }
                }
                hha.b("CategoryPresenter", "newGoods+oldGoods / totalGoods=" + i + f7l.PLUS + size2 + "/" + size);
                arrayList.addAll(arrayList2);
            }
        }
        return z;
    }
}
