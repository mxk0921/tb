package tb;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pfv implements IContainerDataService.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> c = Arrays.asList(Constant.KEY_PAGEBACK, "pullRefresh", "aiRefresh");

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26070a;
    public final ofv b;

    public pfv(cfc cfcVar, ofv ofvVar) {
        this.f26070a = cfcVar;
        this.b = ofvVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
    public Map<String, String> a(w1e w1eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
        }
        HashMap hashMap = new HashMap(8);
        if (g(str)) {
            b(hashMap);
        }
        return hashMap;
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3998f617", new Object[]{this, map});
        } else {
            map.put("unexposedItemIds", d(e(), c()));
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da035a0c", new Object[]{this})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f26070a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            fve.e("CardBackParamsCreator", "isRecommendFirstCardOnScreen mainFeedsViewService is null");
            return -1;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange != null && visiblePositionRange.length == 2) {
            return visiblePositionRange[1] + 1 + this.b.a();
        }
        fve.e("CardBackParamsCreator", "isRecommendFirstCardOnScreen visiblePositionRange error");
        return -1;
    }

    public final List<BaseSectionModel<?>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d02990bf", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f26070a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("CardBackParamsCreator", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null) {
            return containerData.getTotalData();
        }
        fve.e("CardBackParamsCreator", "containerData == null");
        return null;
    }

    public final String f(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel item;
        BaseSubItemModel baseItemModel;
        BaseUtModel clickParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4f3e42d", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || (item = baseSectionModel.getItem()) == null || (baseItemModel = item.getBaseItemModel(0)) == null || (clickParam = baseItemModel.getClickParam()) == null) {
            return null;
        }
        return clickParam.getItemId();
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aa31168", new Object[]{this, str})).booleanValue();
        }
        if (!this.b.b() || !c.contains(str)) {
            return false;
        }
        return true;
    }

    public final String d(List<BaseSectionModel<?>> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c9a81b6", new Object[]{this, list, new Integer(i)});
        }
        if (i < 0 || list == null || list.size() < i) {
            fve.e("CardBackParamsCreator", "startPosition not in sectionData,data may changed");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i < list.size()) {
            BaseSectionModel<?> baseSectionModel = list.get(i);
            if (baseSectionModel != null && !baseSectionModel.getBooleanValue(zjn.IS_USER_ACTION_TRACKED)) {
                String f = f(baseSectionModel);
                if (!TextUtils.isEmpty(f)) {
                    sb.append(f);
                    sb.append(",");
                }
            }
            i++;
        }
        String sb2 = sb.toString();
        return sb2.length() > 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    static {
        t2o.a(491782727);
        t2o.a(488636643);
    }
}
