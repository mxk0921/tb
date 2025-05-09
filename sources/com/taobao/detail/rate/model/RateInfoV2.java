package com.taobao.detail.rate.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.itemrates.entity.RateKeywordV2;
import com.taobao.detail.rate.model.v2.AskInfo;
import com.taobao.detail.rate.model.v2.ItemInfo;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.a07;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 H2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R6\u0010?\u001a\u0016\u0012\u0004\u0012\u000206\u0018\u00010=j\n\u0012\u0004\u0012\u000206\u0018\u0001`>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010.\u001a\u0004\bF\u00100\"\u0004\bG\u00102¨\u0006J"}, d2 = {"Lcom/taobao/detail/rate/model/RateInfoV2;", "Ljava/io/Serializable;", "<init>", "()V", "", "feedId", "Ljava/lang/String;", "getFeedId", "()Ljava/lang/String;", "setFeedId", "(Ljava/lang/String;)V", "itemId", "getItemId", "setItemId", "shopId", "getShopId", "setShopId", "sellerId", "getSellerId", "setSellerId", "", "commentCount", TLogTracker.LEVEL_INFO, "getCommentCount", "()I", "setCommentCount", "(I)V", "invokeSource", "getInvokeSource", "setInvokeSource", "Lcom/taobao/detail/rate/model/v2/ItemInfo;", "itemInfo", "Lcom/taobao/detail/rate/model/v2/ItemInfo;", "getItemInfo", "()Lcom/taobao/detail/rate/model/v2/ItemInfo;", "setItemInfo", "(Lcom/taobao/detail/rate/model/v2/ItemInfo;)V", "Lcom/taobao/detail/rate/model/v2/AskInfo;", "askInfo", "Lcom/taobao/detail/rate/model/v2/AskInfo;", "getAskInfo", "()Lcom/taobao/detail/rate/model/v2/AskInfo;", "setAskInfo", "(Lcom/taobao/detail/rate/model/v2/AskInfo;)V", "Lcom/alibaba/fastjson/JSONObject;", "skuInfo", "Lcom/alibaba/fastjson/JSONObject;", "getSkuInfo", "()Lcom/alibaba/fastjson/JSONObject;", "setSkuInfo", "(Lcom/alibaba/fastjson/JSONObject;)V", "detailRate", "getDetailRate", "setDetailRate", "Lcom/taobao/detail/rate/model/itemrates/entity/RateKeywordV2;", "keyword", "Lcom/taobao/detail/rate/model/itemrates/entity/RateKeywordV2;", "getKeyword", "()Lcom/taobao/detail/rate/model/itemrates/entity/RateKeywordV2;", "setKeyword", "(Lcom/taobao/detail/rate/model/itemrates/entity/RateKeywordV2;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "rateKeywordList", "Ljava/util/ArrayList;", "getRateKeywordList", "()Ljava/util/ArrayList;", "setRateKeywordList", "(Ljava/util/ArrayList;)V", "exParams", "getExParams", "setExParams", "Companion", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RateInfoV2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String KEY_CLICK_TIME_MS = "clickTimeMS";
    public static final String KEY_NAV_TIME_MS = "navTimeMS";
    public static final String KEY_OPEN_MODE = "openMode";
    private AskInfo askInfo;
    private int commentCount;
    private JSONObject detailRate;
    private JSONObject exParams;
    private ItemInfo itemInfo;
    private RateKeywordV2 keyword;
    private JSONObject skuInfo;
    private String feedId = "";
    private String itemId = "";
    private String shopId = "";
    private String sellerId = "";
    private String invokeSource = "";
    private ArrayList<RateKeywordV2> rateKeywordList = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public final AskInfo getAskInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AskInfo) ipChange.ipc$dispatch("de181e0b", new Object[]{this});
        }
        return this.askInfo;
    }

    public final int getCommentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3109e0", new Object[]{this})).intValue();
        }
        return this.commentCount;
    }

    public final JSONObject getDetailRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9478bcee", new Object[]{this});
        }
        return this.detailRate;
    }

    public final JSONObject getExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this});
        }
        return this.exParams;
    }

    public final String getFeedId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1af4e40a", new Object[]{this});
        }
        return this.feedId;
    }

    public final String getInvokeSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2823c170", new Object[]{this});
        }
        return this.invokeSource;
    }

    public final String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.itemId;
    }

    public final ItemInfo getItemInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("39c5319d", new Object[]{this});
        }
        return this.itemInfo;
    }

    public final RateKeywordV2 getKeyword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateKeywordV2) ipChange.ipc$dispatch("dcca4979", new Object[]{this});
        }
        return this.keyword;
    }

    public final ArrayList<RateKeywordV2> getRateKeywordList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("cf1be2d2", new Object[]{this});
        }
        return this.rateKeywordList;
    }

    public final String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.sellerId;
    }

    public final String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.shopId;
    }

    public final JSONObject getSkuInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2509985c", new Object[]{this});
        }
        return this.skuInfo;
    }

    public final void setAskInfo(AskInfo askInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b76f7", new Object[]{this, askInfo});
        } else {
            this.askInfo = askInfo;
        }
    }

    public final void setCommentCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286b32a", new Object[]{this, new Integer(i)});
        } else {
            this.commentCount = i;
        }
    }

    public final void setDetailRate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaa2c56", new Object[]{this, jSONObject});
        } else {
            this.detailRate = jSONObject;
        }
    }

    public final void setExParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a0398e", new Object[]{this, jSONObject});
        } else {
            this.exParams = jSONObject;
        }
    }

    public final void setFeedId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
        } else {
            this.feedId = str;
        }
    }

    public final void setInvokeSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf2e106", new Object[]{this, str});
        } else {
            this.invokeSource = str;
        }
    }

    public final void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId = str;
        }
    }

    public final void setItemInfo(ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a464cb8f", new Object[]{this, itemInfo});
        } else {
            this.itemInfo = itemInfo;
        }
    }

    public final void setKeyword(RateKeywordV2 rateKeywordV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e947fe1", new Object[]{this, rateKeywordV2});
        } else {
            this.keyword = rateKeywordV2;
        }
    }

    public final void setRateKeywordList(ArrayList<RateKeywordV2> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8caabe", new Object[]{this, arrayList});
        } else {
            this.rateKeywordList = arrayList;
        }
    }

    public final void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
        }
    }

    public final void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public final void setSkuInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfac040", new Object[]{this, jSONObject});
        } else {
            this.skuInfo = jSONObject;
        }
    }
}
