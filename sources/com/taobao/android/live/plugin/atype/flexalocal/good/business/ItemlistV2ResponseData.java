package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemlistV2ResponseData implements INetDataObject {
    public List<AllItems> allItems;
    public List<LiveItem> bizTopItemList;
    public BrandCard brandCard;
    public String certification4ItemList;
    public LiveItem currentSpeakingItem;
    public List<String> exclusiveIcons;
    public List<LiveItem> hotList;
    public List<ItemListv1> itemListv1;
    public ItemSortInfo itemSortInfo;
    public TopCardItem popLayerEntance;
    public boolean queryPersonality;
    public ItemSortInfo recommendItemSortInfo;
    public List<String> starList;
    public String totalNum;
    public boolean useCdn;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class AllItems implements INetDataObject {
        public int groupNum;
        public String itemId;

        static {
            t2o.a(295698876);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class BrandCard implements INetDataObject {
        public String tmall;

        static {
            t2o.a(295698877);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ItemListv1 implements INetDataObject {
        public String explained;
        public String goodsIndex;
        public LiveItem liveItemDO;
        public String scene;
        public String sliceNum;

        static {
            t2o.a(295698878);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TopCardItem implements INetDataObject {
        public boolean fullScreen;
        public String imageUrl;
        public String type;
        public String url;

        static {
            t2o.a(295698879);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295698875);
        t2o.a(806355930);
    }
}
