package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tmm extends uf3 implements icd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699353);
        t2o.a(295699050);
    }

    public tmm(xea xeaVar, ItemCategory itemCategory) {
        super(xeaVar, itemCategory);
        if (!(xeaVar == null || xeaVar.j() == null)) {
            xeaVar.j().u(this);
        }
        this.i = false;
    }

    public static /* synthetic */ Object ipc$super(tmm tmmVar, String str, Object... objArr) {
        if (str.hashCode() == 985537887) {
            super.p();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/PreHeatPresenter2");
    }

    @Override // tb.uf3, tb.uzp
    public boolean Y(ArrayList<th5> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74347192", new Object[]{this, arrayList})).booleanValue();
        }
        return false;
    }

    @Override // tb.wga, tb.vfa, tb.bdd
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
            return;
        }
        super.p();
        xea xeaVar = this.d;
        if (xeaVar != null && xeaVar.j() != null) {
            this.d.j().W(this);
        }
    }

    @Override // tb.icd
    public void E(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6386aeee", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew != null && goodMsgNew.liveItemDO != null) {
            if ("add".equalsIgnoreCase(goodMsgNew.action)) {
                Map<String, ItemSortInfo> map = goodMsgNew.categoryItemSortInfo;
                this.k.w(map != null ? map.get(this.f) : null, null, true, false);
                th5 x = this.d.x(Long.toString(goodMsgNew.liveItemDO.itemId));
                if (yga.y()) {
                    hea.s(x, goodMsgNew.liveItemDO, true);
                } else {
                    hea.s(x, goodMsgNew.liveItemDO, false);
                }
                O(goodMsgNew.liveItemDO, false, true, false);
            } else if ("remove".equalsIgnoreCase(goodMsgNew.action)) {
                S(Long.toString(goodMsgNew.liveItemDO.itemId));
                List N = ((v0d) this.f29980a).getAdapter().N();
                if (N == null || N.isEmpty()) {
                    ((v0d) this.f29980a).showEmptyView(new pxg(this.e, 0));
                }
            }
        }
    }
}
