package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtHotSaleItemModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtHotSaleModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.czs;
import tb.exs;
import tb.g1a;
import tb.ic1;
import tb.rxs;
import tb.t2o;
import tb.vqx;
import tb.w1a;
import tb.xhv;
import tb.xys;
import tb.zys;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004R\u0089\u0001\u0010\u001b\u001ai\u0012#\u0012!\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fj\u0004\u0018\u0001`\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\n¨\u00065"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtHotSalePull;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "Ltb/xhv;", "delayHotSaleIntervalEvent", "mapFetchedHotSales", "", "getLastItemIds", "()Ljava/lang/String;", "tag", "handleEvent", "(Ljava/lang/String;)V", "pullMTopHotSaleItems", "Lkotlin/Function3;", "", "", "Lkotlin/ParameterName;", "name", "hotSaleResult", "", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "hotSale", "", "disappearTime", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtHotSaleFetchCallback;", "fetchCallback", "Ltb/w1a;", "getFetchCallback", "()Ltb/w1a;", "setFetchCallback", "(Ltb/w1a;)V", "lastPullItemIds", "[Ljava/lang/String;", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtHotSaleModel;", "lastModel", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtHotSaleModel;", "", "paused", "Z", "getPaused", "()Z", "setPaused", "(Z)V", "hotSaleIntervalTag", "Ljava/lang/String;", vqx.HUMMER_FOUNDATION_GET_INTPUT_PARAMS, "()Ljava/util/Map;", "inputParams", "isFirstPull", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtHotSalePull extends TaoLiveKtComponent implements ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private w1a<? super Map<String, ? extends Object>, ? super TaoLiveKtCommentEntity[], ? super Long, xhv> fetchCallback;
    private final String hotSaleIntervalTag = "hotSaleIntervalTag";
    private TaoLiveKtHotSaleModel lastModel;
    private String[] lastPullItemIds;
    private boolean paused;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1010827366);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a(exs exsVar) {
            czs a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7aabc259", new Object[]{this, exsVar})).booleanValue();
            }
            if (!zys.INSTANCE.c() || exsVar == null || (a2 = exsVar.a()) == null || !a2.x()) {
                return false;
            }
            return true;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements g1a<TaoLiveKtHotSaleModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(TaoLiveKtHotSaleModel taoLiveKtHotSaleModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22f06c1f", new Object[]{this, taoLiveKtHotSaleModel});
                return;
            }
            ckf.g(taoLiveKtHotSaleModel, "hotSaleModel");
            TaoLiveKtHotSalePull.access$setLastModel$p(TaoLiveKtHotSalePull.this, taoLiveKtHotSaleModel);
            TaoLiveKtHotSalePull.access$mapFetchedHotSales(TaoLiveKtHotSalePull.this);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(TaoLiveKtHotSaleModel taoLiveKtHotSaleModel) {
            a(taoLiveKtHotSaleModel);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827365);
        t2o.a(1003487277);
    }

    public static final /* synthetic */ void access$mapFetchedHotSales(TaoLiveKtHotSalePull taoLiveKtHotSalePull) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f784df", new Object[]{taoLiveKtHotSalePull});
        } else {
            taoLiveKtHotSalePull.mapFetchedHotSales();
        }
    }

    public static final /* synthetic */ void access$setLastModel$p(TaoLiveKtHotSalePull taoLiveKtHotSalePull, TaoLiveKtHotSaleModel taoLiveKtHotSaleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265f7a80", new Object[]{taoLiveKtHotSalePull, taoLiveKtHotSaleModel});
        } else {
            taoLiveKtHotSalePull.lastModel = taoLiveKtHotSaleModel;
        }
    }

    private final void delayHotSaleIntervalEvent() {
        ITaoLiveKtGlobalTimer b2;
        long j;
        Long pullInterval;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2418bbab", new Object[]{this});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b2 = bizContext.b()) != null) {
            TaoLiveKtHotSaleModel taoLiveKtHotSaleModel = this.lastModel;
            if (taoLiveKtHotSaleModel == null || (pullInterval = taoLiveKtHotSaleModel.getPullInterval()) == null) {
                j = 0;
            } else {
                j = pullInterval.longValue() * 1000;
            }
            if (j <= 0) {
                j = 120000;
            }
            b2.delayEvent(this, this.hotSaleIntervalTag, j);
        }
    }

    private final Map<String, Object> getInputParams() {
        String str;
        String str2;
        czs a2;
        String i;
        czs a3;
        czs a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad86a8b6", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        exs bizContext = getBizContext();
        String str3 = "";
        if (bizContext == null || (a4 = bizContext.a()) == null || (str = a4.m()) == null) {
            str = str3;
        }
        linkedHashMap.put("liveId", str);
        linkedHashMap.put("bizType", "hotSale");
        exs bizContext2 = getBizContext();
        if (bizContext2 == null || (a3 = bizContext2.a()) == null || (str2 = a3.a()) == null) {
            str2 = str3;
        }
        linkedHashMap.put(RequestConfig.KEY_ANCHOR_ID, str2);
        exs bizContext3 = getBizContext();
        if (!(bizContext3 == null || (a2 = bizContext3.a()) == null || (i = a2.i()) == null)) {
            str3 = i;
        }
        linkedHashMap.put("liveSource", str3);
        linkedHashMap.put("lastItemIds", getLastItemIds());
        linkedHashMap.put("entryForFirst", isFirstPull());
        return kotlin.collections.a.r(linkedHashMap);
    }

    private final String getLastItemIds() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("899f16a0", new Object[]{this});
        }
        String[] strArr = this.lastPullItemIds;
        if (strArr == null) {
            strArr = new String[0];
        }
        if (strArr.length == 0) {
            z = true;
        }
        if (!z) {
            return ic1.Q(strArr, ",", null, null, 0, null, null, 62, null);
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtHotSalePull taoLiveKtHotSalePull, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtHotSalePull");
    }

    private final String isFirstPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74c234ce", new Object[]{this});
        }
        String[] strArr = this.lastPullItemIds;
        if (strArr == null || strArr.length == 0) {
            return "true";
        }
        return "false";
    }

    private final void mapFetchedHotSales() {
        List<TaoLiveKtHotSaleItemModel> itemsList;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd9aa43", new Object[]{this});
            return;
        }
        TaoLiveKtHotSaleModel taoLiveKtHotSaleModel = this.lastModel;
        if (!(taoLiveKtHotSaleModel == null || (itemsList = taoLiveKtHotSaleModel.getItemsList()) == null)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TaoLiveKtHotSaleItemModel taoLiveKtHotSaleItemModel : itemsList) {
                Long itemId = taoLiveKtHotSaleItemModel.getItemId();
                if (itemId != null) {
                    j = itemId.longValue();
                } else {
                    j = 0;
                }
                arrayList.add(rxs.INSTANCE.f(taoLiveKtHotSaleItemModel, taoLiveKtHotSaleModel));
                arrayList2.add(String.valueOf(j));
            }
            if (arrayList2.size() > 0) {
                this.lastPullItemIds = (String[]) arrayList2.toArray(new String[0]);
            }
            w1a<? super Map<String, ? extends Object>, ? super TaoLiveKtCommentEntity[], ? super Long, xhv> w1aVar = this.fetchCallback;
            if (w1aVar != null) {
                w1aVar.invoke(taoLiveKtHotSaleModel.getOriginData(), arrayList.toArray(new TaoLiveKtCommentEntity[0]), taoLiveKtHotSaleModel.getDisappearTime());
            }
        }
    }

    public final w1a<Map<String, ? extends Object>, TaoLiveKtCommentEntity[], Long, xhv> getFetchCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1a) ipChange.ipc$dispatch("b86c5b2a", new Object[]{this});
        }
        return this.fetchCallback;
    }

    public final boolean getPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb968eaf", new Object[]{this})).booleanValue();
        }
        return this.paused;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (ckf.b(str, this.hotSaleIntervalTag)) {
            pullMTopHotSaleItems();
        }
    }

    public final void pullMTopHotSaleItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1027e420", new Object[]{this});
        } else if (Companion.a(getBizContext())) {
            delayHotSaleIntervalEvent();
            if (!this.paused) {
                xys.INSTANCE.a(getInputParams(), new b());
            }
        }
    }

    public final void setFetchCallback(w1a<? super Map<String, ? extends Object>, ? super TaoLiveKtCommentEntity[], ? super Long, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b0c868", new Object[]{this, w1aVar});
        } else {
            this.fetchCallback = w1aVar;
        }
    }

    public final void setPaused(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da16cfd", new Object[]{this, new Boolean(z)});
        } else {
            this.paused = z;
        }
    }
}
