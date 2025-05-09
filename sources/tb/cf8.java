package tb;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterLiveItemRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterLiveItemResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cf8 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ deb f17025a;

        public a(deb debVar) {
            this.f17025a = debVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", 0);
            nha.o("mtop.tblive.live.pop.item.card.list", -1);
            deb debVar = this.f17025a;
            if (debVar != null) {
                debVar.onError(netResponse.getRetCode(), netResponse.getRetMsg());
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", 0);
            nha.o("mtop.tblive.live.pop.item.card.list", -1);
            deb debVar = this.f17025a;
            if (debVar != null) {
                debVar.onError(netResponse.getRetCode(), netResponse.getRetMsg());
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", 0);
            if (netBaseOutDo != null) {
                nha.o("mtop.tblive.live.pop.item.card.list", 1);
                this.f17025a.onResult((EnterGoodsData) netBaseOutDo.getData());
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", -1);
        }
    }

    static {
        t2o.a(295698855);
    }

    public cf8(deb<EnterGoodsData> debVar) {
        super(new a(debVar));
    }

    public static /* synthetic */ Object ipc$super(cf8 cf8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/EnterLiveItemBusiness");
    }

    public void K(xea xeaVar, boolean z, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cd09d9", new Object[]{this, xeaVar, new Boolean(z), str, str2, str3});
        } else if (xeaVar.t() != null && xeaVar.t().mVideoInfo != null) {
            EnterLiveItemRequest enterLiveItemRequest = new EnterLiveItemRequest();
            enterLiveItemRequest.liveId = xeaVar.t().mVideoInfo.liveId;
            if (xeaVar.t().mVideoInfo.broadCaster != null) {
                enterLiveItemRequest.creatorId = xeaVar.t().mVideoInfo.broadCaster.accountId;
            }
            if (z) {
                enterLiveItemRequest.itemHoldType = xeaVar.t().mVideoInfo.itemHoldType;
                enterLiveItemRequest.holdItemIds = xeaVar.t().mVideoInfo.holdItemIds;
                if (!TextUtils.isEmpty(xeaVar.P) && TextUtils.isEmpty(enterLiveItemRequest.itemHoldType) && TextUtils.isEmpty(enterLiveItemRequest.holdItemIds)) {
                    enterLiveItemRequest.holdItemIds = xeaVar.P;
                    enterLiveItemRequest.itemHoldType = fgv.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            } else {
                enterLiveItemRequest.itemHoldType = str;
                enterLiveItemRequest.holdItemIds = str2;
                if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(enterLiveItemRequest.itemHoldType) && TextUtils.isEmpty(enterLiveItemRequest.holdItemIds)) {
                    enterLiveItemRequest.holdItemIds = str3;
                    enterLiveItemRequest.itemHoldType = fgv.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            }
            enterLiveItemRequest.liveSource = xeaVar.v();
            enterLiveItemRequest.entryLiveSource = xeaVar.m();
            enterLiveItemRequest.needRecommendItem = wda.r();
            if (xeaVar.t().mVideoInfo.itemTransferInfo == null) {
                str4 = "";
            } else {
                str4 = xeaVar.t().mVideoInfo.itemTransferInfo.toJSONString();
            }
            enterLiveItemRequest.itemTransferInfo = str4;
            ArrayList<String> arrayList = xeaVar.t().mVideoInfo == null ? null : xeaVar.t().mVideoInfo.interacts;
            if (arrayList != null && !arrayList.isEmpty()) {
                enterLiveItemRequest.interacts = fkx.i(arrayList);
            }
            if (nh4.r0()) {
                if (!DateUtils.isToday(t6t.d("new_user_zone_card_show_time"))) {
                    t6t.g("new_user_zone_card_show_count", 0);
                }
                enterLiveItemRequest.todayExposureCount = String.valueOf(t6t.c("new_user_zone_card_show_count", 0));
            }
            C(1, enterLiveItemRequest, EnterLiveItemResponse.class);
        }
    }
}
