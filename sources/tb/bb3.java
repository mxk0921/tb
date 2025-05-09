package tb;

import com.alibaba.android.icart.core.ability.event.CartOpenPopEventAbility;
import com.alibaba.android.icart.core.event.CartGroupInitSubscribe;
import com.alibaba.android.icart.core.event.CartItemsShareSubscriber;
import com.alibaba.android.icart.core.event.CartReorderClickSubscriber;
import com.alibaba.android.icart.core.event.ItemOperationSubscriber;
import com.alibaba.android.icart.core.event.MTopRequestSubscriber;
import com.alibaba.android.icart.core.event.ReceiveUPPSubscriber;
import com.alibaba.ariver.kernel.RVEvents;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends qtd>> f16289a;

    public static Map<String, Class<? extends qtd>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8dd1bfc", new Object[0]);
        }
        return f16289a;
    }

    static {
        t2o.a(479199378);
        HashMap hashMap = new HashMap();
        f16289a = hashMap;
        hashMap.put("cartSelect", md3.class);
        hashMap.put("cartAdjustOperate", z93.class);
        hashMap.put("changeQuantity", ii3.class);
        hashMap.put("cartSubmit", xd3.class);
        hashMap.put("cartGroupSubmit", lb3.class);
        hashMap.put("cartUserTrack", ge3.class);
        hashMap.put("widgetExposure", tbx.class);
        hashMap.put("popItemExpand", qc3.class);
        hashMap.put("popExpandClick", pc3.class);
        hashMap.put("cartCalculateClick", to0.class);
        hashMap.put("cartCheckAll", uo0.class);
        hashMap.put("cartSettlement", ud3.class);
        hashMap.put("receiveUPP", ReceiveUPPSubscriber.class);
        hashMap.put("openSearch", ld3.class);
        hashMap.put("closeSearch", ld3.class);
        hashMap.put("searchClick", ld3.class);
        hashMap.put("keywordChange", n18.class);
        hashMap.put("mtopRequest", MTopRequestSubscriber.class);
        hashMap.put("reorderClick", CartReorderClickSubscriber.class);
        hashMap.put("addItemSelect", v93.class);
        hashMap.put("addGroupPopupWindow", t93.class);
        hashMap.put("shareClick", CartItemsShareSubscriber.class);
        hashMap.put("moreClick", tb3.class);
        hashMap.put("openPopupWindow", z2l.class);
        hashMap.put("closePopupWindow", xv3.class);
        hashMap.put(RVEvents.TAB_CLICK, yd3.class);
        hashMap.put("confirmAddClick", u93.class);
        hashMap.put("cartOperateDialog", ItemOperationSubscriber.class);
        hashMap.put("checkPromotion", ka3.class);
        hashMap.put("eventQueue", ab3.class);
        hashMap.put("groupInit", CartGroupInitSubscribe.class);
        hashMap.put("transparent", rc3.class);
        hashMap.put(yf6.ACTION_RECOMMEND_ITEM_CLICK, cd3.class);
        hashMap.put("expandSelectedItems", db3.class);
        hashMap.put("recommendTabClick", dd3.class);
        hashMap.put("showAllGroup", od3.class);
        hashMap.put("confirmGroupClick", ma3.class);
        hashMap.put("couponInit", hv4.class);
        hashMap.put("jumpElevatorClick", ac3.class);
        hashMap.put("addressEyeClick", y93.class);
        hashMap.put("showStdPop", sd3.class);
        hashMap.put("alipayService", aa3.class);
        hashMap.put("showAll", pd3.class);
        hashMap.put(f4l.EVENT_TYPE, CartOpenPopEventAbility.class);
        hashMap.put("mtopPreRequest", dc3.class);
        hashMap.put("addCartSelectItems", pe0.class);
        hashMap.put("hideItem", ob3.class);
    }
}
