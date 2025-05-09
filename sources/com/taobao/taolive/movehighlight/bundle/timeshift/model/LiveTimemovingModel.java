package com.taobao.taolive.movehighlight.bundle.timeshift.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LiveTimemovingModel implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String adgrid;
    public int buyCount;
    public String collectIcon;
    public String collectName;
    public String collectUrl;
    public Object commentsList;
    public String customizedItemRights;
    public String defaultRecommend;
    public LiveItem.Ext extendVal = new LiveItem.Ext();
    public boolean hasSideslip;
    public String isBulk;
    public String isCpc;
    public LiveItem itemCard;
    public JSONObject itemExtData;
    public String itemH5TaokeUrl;
    public String itemId;
    public String itemIndex;
    public String itemPic;
    public String itemPrice;
    public String itemTitle;
    public String itemUrl;
    public String keyPointId;
    public String liveId;
    public JSONObject liveItemStatusData;
    public int pageIndex;
    public JSONObject personalityData;
    public String refpid;
    public RightInfo rightInfo;
    public String shopRecommend;
    public TimeMovingHorListButtonStyleVO timeMovingHorListButtonStyleVO;
    public TimeMovingHorListItemPicVO timeMovingHorListItemPicVO;
    public String timeMovingId;
    public JSONObject timeMovingJsonObject;
    public float timestamps;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class RightInfo implements INetDataObject {
        public String asac;
        public String benefitCode;
        public String channel;
        public String displayAmount;
        public String displayAmountUnit;
        public String displayConditionAmount;
        public String issueEndTime;
        public String issueStartTime;
        public String status;
        public String strategyCode;
        public String type;

        static {
            t2o.a(779092516);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TimeMovingHorListButtonStyleVO implements INetDataObject {
        public String buttonText;
        public String buttonToast;
        public String disableClick;

        static {
            t2o.a(779092517);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TimeMovingHorListItemPicVO implements INetDataObject {
        public String clickToast;
        public String disableClick;
        public String hoverText;

        static {
            t2o.a(779092518);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092515);
        t2o.a(806355930);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof LiveTimemovingModel)) {
            return false;
        }
        LiveTimemovingModel liveTimemovingModel = (LiveTimemovingModel) obj;
        if (!this.itemId.equals(liveTimemovingModel.itemId) || this.itemIndex != liveTimemovingModel.itemIndex) {
            return false;
        }
        return true;
    }
}
