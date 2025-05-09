package com.taobao.live.timemove.video.videoitem.domain.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveItem implements INetDataObject, Comparable<LiveItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _itemPos;
    public String clickSource;
    public int goodsIndex;
    public int groupNum;
    public boolean isSpeaking;
    public String isSubscribe;
    public String itemH5TaokeUrl;
    public long itemId;
    public String itemName;
    public String itemPic;
    public String itemPrice;
    public String itemType;
    public String itemUrl;
    public String liveId;
    public LiveItemPersonalityData personalityData;
    public Ext extendVal = new Ext();
    public boolean itemTimeshift = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Ext implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String adgrid;
        public String anchorId;
        public String atmosphere;
        public JSONArray atmosphereList;
        public String bizType;
        public String bulkEndTime;
        public String bulkPrice;
        public int bulkSize;
        public String business;
        private JSONObject businessJSON;
        public String buyCount;
        public String canEnjoyDiscounts;
        public String categoryLevelLeaf;
        public String categoryLevelLeafName;
        public String categoryLevelOne;
        public String categoryLevelOneName;
        public String commission;
        private JSONObject commissionJSON;
        public String context;
        public String customizedItemRights;
        public String defaultRight;
        public String discountsQuota;
        public boolean enableSKU = true;
        public String exclusivePrice;
        public String goodService;
        public String goodsSubscribeType;
        public String groupInfo;
        private GroupInfo groupInfoObj;
        public String groupItemId;
        public String groupItemInfos;
        public String groupItemShowPrice;
        public String groupItemTitle;
        public String groupItemTradeParams;
        public String isBulk;
        public String isCpc;
        public String isTop;
        public String isYanxuan;
        public String itemBizType;
        public String itemCategoryId;
        public String itemCategoryIdList;
        public List<String> itemCategoryIds;
        public String itemEntrySource;
        public String itemIcon;
        public String itemIconOfficial;
        public String itemIconPromotion;
        public int itemNotInPocket;
        public String itemPick;
        public String itemShopType;
        public String itemTabSource;
        private ArrayList<String> itemTagList;
        public String itemTags;
        public String itemType;
        private JSONArray itemTypeJSONArray;
        public String itemUniqueKey;
        public String liveId;
        public String liveItemBizTags;
        public String liveUserNick;
        public String materialName;
        public String msgUuid;
        public boolean needJumpH5;
        public String needRecovery;
        public String playUrl;
        public String refpid;
        public String rightType;
        public String scene;
        public String secKillInfo;
        public String secKillRecordId;
        public String subTitle;
        public String submissionId;
        public String time;
        public String timeMovingContentId;
        public String timeMovingPlayInfo;
        public String timeMovingStampInfo;
        public String timeMovingTypeInfo;
        public long timeVersion;
        public int timemovingstatus;
        public String timepoint;
        public String trackInfo;
        public JSONObject trackInfoJSON;
        public String tradeParams;
        private JSONObject tradeParamsJSON;
        public String userType;

        static {
            t2o.a(779092207);
            t2o.a(806355930);
        }

        public JSONObject getBusinessJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b367f3c5", new Object[]{this});
            }
            if (this.businessJSON == null && !TextUtils.isEmpty(this.business)) {
                this.businessJSON = JSON.parseObject(this.business);
            }
            return this.businessJSON;
        }

        public JSONObject getCommissionJson() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("f81d090", new Object[]{this});
            }
            if (this.commissionJSON == null && !TextUtils.isEmpty(this.commission)) {
                this.commissionJSON = JSON.parseObject(this.commission);
            }
            return this.commissionJSON;
        }

        public GroupInfo getGroupInfoObj() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GroupInfo) ipChange.ipc$dispatch("ed19b35b", new Object[]{this});
            }
            if (this.groupInfoObj == null && !TextUtils.isEmpty(this.groupInfo)) {
                try {
                    this.groupInfoObj = (GroupInfo) JSON.parseObject(this.groupInfo, GroupInfo.class);
                } catch (Exception unused) {
                }
            }
            return this.groupInfoObj;
        }

        public ArrayList<String> getItemTags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("20105823", new Object[]{this});
            }
            this.itemTagList = new ArrayList<>();
            if (!TextUtils.isEmpty(this.itemTags)) {
                this.itemTagList = (ArrayList) JSON.parseObject(this.itemTags, ArrayList.class);
            }
            return this.itemTagList;
        }

        public JSONArray getItemType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("7b015794", new Object[]{this});
            }
            if (this.itemTypeJSONArray == null && !TextUtils.isEmpty(this.itemType)) {
                this.itemTypeJSONArray = JSON.parseArray(this.itemType);
            }
            return this.itemTypeJSONArray;
        }

        public JSONObject getTrackInfoJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6ceea372", new Object[]{this});
            }
            if (this.trackInfoJSON == null && !TextUtils.isEmpty(this.trackInfo)) {
                try {
                    this.trackInfoJSON = JSON.parseObject(this.trackInfo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this.trackInfoJSON;
        }

        public JSONObject getTradeParamsJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6d0f0363", new Object[]{this});
            }
            if (this.tradeParamsJSON == null && !TextUtils.isEmpty(this.tradeParams)) {
                try {
                    this.tradeParamsJSON = JSON.parseObject(this.tradeParams);
                } catch (Exception unused) {
                }
            }
            return this.tradeParamsJSON;
        }

        public void setGroupInfoObj(GroupInfo groupInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc444c3f", new Object[]{this, groupInfo});
            } else {
                this.groupInfoObj = groupInfo;
            }
        }

        public void setItemTypeArray(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c5828d9", new Object[]{this, jSONArray});
            } else {
                this.itemTypeJSONArray = jSONArray;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class GroupInfo implements INetDataObject {
        public static final int BUYING = 1;
        public static final int END = 2;
        public static final int SELLOUT = 3;
        public long activityBegin;
        public long activityEnd;
        public String activityId;
        public String backUserImg;
        public String channelCode;
        public String salesDesc;
        public int salesQuantity;
        public String shareDesc;
        public String shareIcon;
        public boolean shared;
        public List<StagePrice> stagePriceList;
        public int status;
        public long totalInventory;
        public String uChannel;

        static {
            t2o.a(779092208);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LiveItemBenefit implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String leftValue;
        public String rightValue;
        public String type;

        static {
            t2o.a(779092209);
            t2o.a(806355930);
        }

        public LiveItemBenefitType getBenefitType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItemBenefitType) ipChange.ipc$dispatch("332ad7b", new Object[]{this});
            }
            return LiveItemBenefitType.getLiveItemBenefitType(this.type);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum LiveItemBenefitType {
        NEW_CUSTOMER_BENEFIT(0, "newCustomerBenefit"),
        LIVE_SPECIAL_COUPON(1, "aliveSpecialCoupon");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String desc;
        private int type;

        LiveItemBenefitType(int i, String str) {
            this.type = i;
            this.desc = str;
        }

        public static LiveItemBenefitType getLiveItemBenefitType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItemBenefitType) ipChange.ipc$dispatch("9ccd26b0", new Object[]{str});
            }
            LiveItemBenefitType liveItemBenefitType = LIVE_SPECIAL_COUPON;
            if (TextUtils.isEmpty(str) || liveItemBenefitType.desc.equals(str)) {
                return liveItemBenefitType;
            }
            LiveItemBenefitType liveItemBenefitType2 = NEW_CUSTOMER_BENEFIT;
            if (liveItemBenefitType2.desc.equals(str)) {
                return liveItemBenefitType2;
            }
            return liveItemBenefitType;
        }

        public static /* synthetic */ Object ipc$super(LiveItemBenefitType liveItemBenefitType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/timemove/video/videoitem/domain/model/LiveItem$LiveItemBenefitType");
        }

        public static LiveItemBenefitType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItemBenefitType) ipChange.ipc$dispatch("a2a3c6a4", new Object[]{str});
            }
            return (LiveItemBenefitType) Enum.valueOf(LiveItemBenefitType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LiveItemPersonalityData implements INetDataObject {
        public String goodsSubscribeStatus;
        public ArrayList<LiveItemBenefit> itemBenefits;
        public String itemPriceDesc;
        public String itemStage;
        public String itemStagePrice;
        public String juId;
        public String liveExclusiveCopy;
        public String liveStagesCopy;
        public String promotionPrice;
        public String promotionPriceDesc;
        public String singlePromotionPrice;
        public boolean stage;
        public String timeMovingStatus;

        static {
            t2o.a(779092211);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StagePrice implements INetDataObject {
        public int stage;
        public long stageCouponPrice;
        public int stageNum;

        static {
            t2o.a(779092212);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TimeMovingPlayInfo implements INetDataObject {
        public boolean isMounting;
        public int startSeekTime;
        public String timeMovingId;
        public String timeMovingM3u8Url;
        public String timeMovingPageUrl;

        static {
            t2o.a(779092213);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092206);
        t2o.a(806355930);
    }

    public int compareTo(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e9e39af", new Object[]{this, liveItem})).intValue() : liveItem.goodsIndex - this.goodsIndex;
    }
}
