package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPageInfo;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fof extends zda<ItemGroupView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699299);
        t2o.a(295699308);
    }

    public fof(xea xeaVar) {
        super(xeaVar);
    }

    public static /* synthetic */ Object ipc$super(fof fofVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/itemgroup/ItemGroupPresenter");
    }

    @Override // tb.zda
    public void S(List<ItemlistV2ResponseData.ItemListv1> list) {
        ItemGroupPageInfo pageInfo;
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3ef08e", new Object[]{this, list});
        } else if (list != null && !list.isEmpty() && (pageInfo = ((ItemGroupView) this.f29980a).getPageInfo()) != null) {
            for (int i = 0; i < list.size(); i++) {
                ItemlistV2ResponseData.ItemListv1 itemListv1 = list.get(i);
                if (!(itemListv1 == null || (liveItem = itemListv1.liveItemDO) == null)) {
                    if (liveItem.extraUTParams == null) {
                        liveItem.extraUTParams = new HashMap();
                    }
                    itemListv1.liveItemDO.extraUTParams.put("aggregation_id", pageInfo.id);
                    itemListv1.liveItemDO.extraUTParams.put("aggregation_type", pageInfo.type);
                    if (!TextUtils.isEmpty(pageInfo.source)) {
                        itemListv1.liveItemDO.extraUTParams.put("aggregation_source", pageInfo.source);
                    }
                }
            }
        }
    }
}
