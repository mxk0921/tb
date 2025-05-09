package com.taobao.taolive.sdk.model.common;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fkx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveItem implements INetDataObject, Comparable<LiveItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _itemPos;
    public String asac;
    public String clickSource;
    public String cpsClickPos;
    public Map<String, String> extraUTParams;
    public int goodsIndex;
    public int groupNum;
    public boolean isSpeaking;
    public String isSubscribe;
    public String isTop;
    public JSONObject itemActionData;
    public JSONObject itemConfigInfo;
    public JSONObject itemExtData;
    public String itemH5TaokeUrl;
    public JSONArray itemIcons;
    public long itemId;
    public String itemName;
    public String itemPic;
    public String itemPrice;
    public String itemShortTitle;
    public String itemType;
    public String itemUrl;
    public String liveId;
    public JSONObject liveItemStatusData;
    public JSONObject nativeConfigInfos;
    public String native_buttonStatus;
    public boolean native_canShowVipEntrance;
    public String native_channel;
    public JSONArray native_itemBenefits;
    public boolean native_topItemAnimShow;
    public boolean native_vipTagsShow;
    public JSONObject personalityData;
    public JSONArray picTopLabels;
    public SabItemAtmosphere sabItemAtmosphere;
    public SabItemAtmosphere sabItemAtmospherePreHeat;
    public Ext extendVal = new Ext();
    public boolean itemTimeshift = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
        public String closePopItem;
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
        public boolean isDuplicate;
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
        public String itemSourceType;
        public String itemTabSource;
        private ArrayList<String> itemTagList;
        public String itemTags;
        public String itemType;
        private JSONArray itemTypeJSONArray;
        public String itemUniqueKey;
        public String lastTimepoint;
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
        public String tradeParamsForPcg;
        private JSONObject tradeParamsJSON;
        public String userType;

        static {
            t2o.a(806356229);
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
                return (GroupInfo) ipChange.ipc$dispatch("b7f0b381", new Object[]{this});
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

        public void setBusinessJSON(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ed5435f", new Object[]{this, jSONObject});
            } else {
                this.businessJSON = jSONObject;
            }
        }

        public void setGroupInfoObj(GroupInfo groupInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d88e92a5", new Object[]{this, groupInfo});
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ExtraPlayInfo implements INetDataObject {
        public String mp4Url;

        static {
            t2o.a(806356230);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            t2o.a(806356231);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
                return (LiveItemBenefitType) ipChange.ipc$dispatch("66ae99d6", new Object[]{str});
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/common/LiveItem$LiveItemBenefitType");
        }

        public static LiveItemBenefitType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItemBenefitType) ipChange.ipc$dispatch("cf550eca", new Object[]{str});
            }
            return (LiveItemBenefitType) Enum.valueOf(LiveItemBenefitType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SabItemAtmosphere implements INetDataObject {
        public String atmosphereBgImg;
        public String benefitTitle;
        public String benefitTitleImg;
        public String clickAction;
        public String posterMark;
        public String rightType;
        public String subBenefitTitle;
        public String subRightType;

        static {
            t2o.a(806356233);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SpfPlayVideo implements INetDataObject {
        public ExtraPlayInfo extraPlayInfo;
        public String playInfo;
        public String playMaterialType;
        public String seekTime;
        public List<TimeMovingLabelInfos> timeMovingLabelInfos;
        public String timeMovingUtParams;
        public String videoSource;
        public String videoType;

        static {
            t2o.a(806356234);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class StagePrice implements INetDataObject {
        public int stage;
        public long stageCouponPrice;
        public int stageNum;

        static {
            t2o.a(806356235);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TimeMovingLabelInfos implements INetDataObject, Comparable<TimeMovingLabelInfos> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String labelName;
        public long oppsTime;
        public int tagId;

        static {
            t2o.a(806356236);
            t2o.a(806355930);
        }

        public int compareTo(TimeMovingLabelInfos timeMovingLabelInfos) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5556f611", new Object[]{this, timeMovingLabelInfos})).intValue() : Long.compare(this.oppsTime, timeMovingLabelInfos.oppsTime);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TimeMovingMp4Urls implements INetDataObject {
        public String url;

        static {
            t2o.a(806356237);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TimeMovingPlayInfo implements INetDataObject {
        public Map<String, String> abResultMap;
        public boolean isMounting;
        public boolean isSpeaking;
        public String itemId;
        public String keyPointId;
        public String liveGuideTxt;
        public String playUrl;
        public String sjsdItemId;
        public SpfPlayVideo spfPlayVideo;
        public int spotDuration;
        public String timeMovingId;
        public List<TimeMovingLabelInfos> timeMovingLabelInfos;
        public String timeMovingM3u8Url;
        public List<TimeMovingMp4Urls> timeMovingMp4Urls;
        public String timeMovingPageUrl;
        public String timeMovingType;
        public String timeMovingUIVersion;
        public String videoId;

        static {
            t2o.a(806356238);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356228);
        t2o.a(806355930);
    }

    private void changeValues(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef012ba1", new Object[]{this, jSONObject, str});
        } else if (jSONObject.containsKey(str)) {
            Object obj = jSONObject.get(str);
            if (obj instanceof String) {
                jSONObject.put(str, fkx.a((String) obj));
            }
        }
    }

    public JSONObject parseJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5862d001", new Object[]{this});
        }
        JSONObject jSONObject = (JSONObject) fkx.h(this);
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.containsKey("extendVal")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("extendVal");
            changeValues(jSONObject2, "groupItemTradeParams");
            changeValues(jSONObject2, "canEnjoyDiscounts");
            changeValues(jSONObject2, "groupItemInfos");
            changeValues(jSONObject2, "secKillInfo");
            jSONObject.put("extendVal", (Object) jSONObject2);
        }
        return jSONObject;
    }

    public int compareTo(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8137495", new Object[]{this, liveItem})).intValue() : liveItem.goodsIndex - this.goodsIndex;
    }
}
