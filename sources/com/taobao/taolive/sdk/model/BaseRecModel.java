package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.util.ArrayList;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseRecModel implements INetDataObject, IRecyclerModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String accountId;
    public String actionUrl;
    public String algoExtendInfo;
    public String anchorId;
    public Map<String, Object> clientReturnMap;
    public String contentType;
    public boolean edgePcdn;
    public String extendMap;
    public String feedType;
    public boolean h265;
    public String imageUrl;
    public Map<String, String> initParams;
    public boolean isFirst;
    public String liveId;
    public ArrayList<QualitySelectItem> liveUrlList;
    public TaoLiveKtSwitchModel mTaoLiveKtSwitchModel;
    public String mediaConfig;
    public String mediaSourceType;
    public Map<String, Object> originData;
    public boolean rateAdapte;
    public long supportPreLoad = 1;
    public LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
    public String trackInfo;
    public String updownPromptText;
    public String updownRecommendDesc;
    public long viewCount;
    public boolean visit;
    public long watchTime;
    public Map<String, Object> whiteUserDataMap;

    static {
        t2o.a(806356157);
        t2o.a(806355930);
        t2o.a(806356052);
    }

    @Override // com.taobao.taolive.sdk.controller.IRecyclerModel
    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        return this.liveId + "";
    }

    public int getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
        }
        return ContentType.Live.ordinal();
    }
}
