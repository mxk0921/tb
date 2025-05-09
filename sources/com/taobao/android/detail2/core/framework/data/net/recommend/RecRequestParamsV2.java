package com.taobao.android.detail2.core.framework.data.net.recommend;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.ezb;
import tb.oj7;
import tb.r19;
import tb.syj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecRequestParamsV2 implements Serializable, ezb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_EXPOSED_ITEM_COUNT = "exposedItemCount";
    public static final String KEY_HALF_SCREEN_GUIDE_INDEX_LIST = "halfScreenGuideIndexList";
    private static final String KEY_LOW_DEVICE = "lowDevice";
    public static final String SLIDE_MODE_DOWN = "down";
    public static final String SLIDE_MODE_UP = "up";
    private JSONObject mAppendQueryParams;
    private String mAppid;
    private String mCustomNewType;
    private String mCustomPageNum;
    private String mExposedItemCount;
    private String mHalfScreenGuideIndexList;
    private boolean mIsNavRequest;
    private boolean mIsOpenImmediatelyMode;
    private String mItemId;
    private String mNewDetailChannel;
    private String mNewType;
    private String mPageNum;
    private JSONObject mPreloadPassParams;
    private String mSellerId;
    private String mSlideMode;
    private String mApiName = "mtop.relationrecommend.WirelessRecommend.recommend";
    private String mApiVersion = "2.0";
    private String mUnitStrategy = "UNIT_GUIDE";
    private JSONObject mPassParams = new JSONObject();
    private JSONObject mBizParams = new JSONObject();
    private Map<String, String> mNewDetailVisibleSizeInfo = new HashMap();

    static {
        t2o.a(352321828);
        t2o.a(352321807);
    }

    public RecRequestParamsV2 addBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("9c6b9a37", new Object[]{this, jSONObject});
        }
        this.mBizParams.putAll(jSONObject);
        return this;
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.mApiName;
    }

    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return this.mApiVersion;
    }

    public String getData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", this.mAppid);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("itemId", this.mItemId);
        hashMap2.put("newDetailChannel", this.mNewDetailChannel);
        hashMap2.put("newType", this.mNewType);
        if (!TextUtils.isEmpty(this.mCustomNewType)) {
            hashMap2.put("newType", this.mCustomNewType);
        }
        hashMap2.put("sellerId", this.mSellerId);
        hashMap2.put("slideMode", this.mSlideMode);
        hashMap2.put("pageNum", this.mPageNum);
        if (!TextUtils.isEmpty(this.mCustomPageNum)) {
            hashMap2.put("pageNum", this.mCustomPageNum);
        }
        hashMap2.put("isOpenImmediatelyMode", String.valueOf(this.mIsOpenImmediatelyMode));
        if (r19.o()) {
            if (syj.b(this.mPreloadPassParams, null)) {
                hashMap2.put("ndWeexUrlReplace", "v1Performance");
            }
        } else if (r19.F0()) {
            hashMap2.put("ndWeexUrlReplace", "v1Performance");
        }
        hashMap2.put("passParams", JSON.toJSONString(this.mPassParams));
        hashMap2.put("bizParams", JSON.toJSONString(this.mBizParams));
        JSONObject jSONObject = this.mPreloadPassParams;
        if (jSONObject != null) {
            hashMap2.put("preloadPassParams", JSON.toJSONString(jSONObject));
        }
        if (oj7.h()) {
            str = "y";
        } else {
            str = "n";
        }
        hashMap2.put(KEY_LOW_DEVICE, str);
        hashMap2.putAll(this.mNewDetailVisibleSizeInfo);
        hashMap2.put(KEY_HALF_SCREEN_GUIDE_INDEX_LIST, this.mHalfScreenGuideIndexList);
        hashMap2.put(KEY_EXPOSED_ITEM_COUNT, this.mExposedItemCount);
        hashMap2.put("navRequest", String.valueOf(this.mIsNavRequest));
        hashMap.put("params", JSON.toJSONString(hashMap2));
        return JSON.toJSONString(hashMap);
    }

    @Override // tb.ezb
    public MtopRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(getData());
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
        return mtopRequest;
    }

    @Override // tb.ezb
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return this.mUnitStrategy;
    }

    public RecRequestParamsV2 setAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("cb2ddbb1", new Object[]{this, str});
        }
        this.mAppid = str;
        return this;
    }

    public RecRequestParamsV2 setCustomAppendQueryParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("b72857ee", new Object[]{this, jSONObject});
        }
        this.mAppendQueryParams = jSONObject;
        return this;
    }

    public RecRequestParamsV2 setCustomBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("ccaa3089", new Object[]{this, jSONObject});
        }
        this.mBizParams.put("extraRequestParams", (Object) jSONObject);
        return this;
    }

    public RecRequestParamsV2 setCustomNewType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("60b2651e", new Object[]{this, str});
        }
        this.mCustomNewType = str;
        return this;
    }

    public RecRequestParamsV2 setCustomPageNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("a1fdacdb", new Object[]{this, str});
        }
        this.mCustomPageNum = str;
        return this;
    }

    public RecRequestParamsV2 setEntranceCardParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("409baf7", new Object[]{this, obj});
        }
        if (obj == null) {
            return this;
        }
        this.mBizParams.put("entranceCardParams", obj);
        return this;
    }

    public RecRequestParamsV2 setExposedCardSubTypes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("f5da20de", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mBizParams.put("exposedCardSubType", (Object) str);
        }
        return this;
    }

    public RecRequestParamsV2 setExposedComplexIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("1cf63bbd", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mBizParams.put("exposeComplexIds", (Object) str);
        }
        return this;
    }

    public RecRequestParamsV2 setExposedItemCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("b18fd5d5", new Object[]{this, str});
        }
        this.mExposedItemCount = str;
        return this;
    }

    public RecRequestParamsV2 setExposedItemIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("f9042c7e", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mBizParams.put("exposedItemIds", (Object) str);
        }
        return this;
    }

    public RecRequestParamsV2 setHalfScreenGuideIndexList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("32521b6c", new Object[]{this, str});
        }
        this.mHalfScreenGuideIndexList = str;
        return this;
    }

    public RecRequestParamsV2 setIsOpenImmediatelyMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("a37f9588", new Object[]{this, new Boolean(z)});
        }
        this.mIsOpenImmediatelyMode = z;
        return this;
    }

    public RecRequestParamsV2 setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("511b95e7", new Object[]{this, str});
        }
        this.mItemId = str;
        return this;
    }

    public RecRequestParamsV2 setLastUnExposedItemIdsStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("cd3492d2", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mBizParams.put("lastUnExposedItemIds", (Object) str);
        }
        return this;
    }

    public void setMockSpecifyLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d98fcd", new Object[]{this, str});
        } else {
            this.mBizParams.put("specifyLiveId", (Object) str);
        }
    }

    public RecRequestParamsV2 setNavRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("dc5fb2c5", new Object[]{this, new Boolean(z)});
        }
        this.mIsNavRequest = z;
        return this;
    }

    public RecRequestParamsV2 setNewDetailChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("46628e8b", new Object[]{this, str});
        }
        this.mNewDetailChannel = str;
        return this;
    }

    public RecRequestParamsV2 setNewDetailVisibleSizeInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("f73d1692", new Object[]{this, map});
        }
        this.mNewDetailVisibleSizeInfo = map;
        return this;
    }

    public RecRequestParamsV2 setNewType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("79915b8f", new Object[]{this, str});
        }
        this.mNewType = str;
        return this;
    }

    public RecRequestParamsV2 setPageNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("badca34c", new Object[]{this, str});
        }
        this.mPageNum = str;
        return this;
    }

    public RecRequestParamsV2 setPassParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("7c674ab6", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            this.mPassParams = jSONObject;
        }
        return this;
    }

    public RecRequestParamsV2 setPreloadPassParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("3ecdef31", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            this.mPreloadPassParams = jSONObject;
        }
        return this;
    }

    public RecRequestParamsV2 setQueryParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("2a8d18b8", new Object[]{this, map});
        }
        if (this.mAppendQueryParams != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(map);
            jSONObject.putAll(this.mAppendQueryParams);
            this.mBizParams.put("queryParams", (Object) jSONObject);
        } else if (map != null) {
            this.mBizParams.put("queryParams", (Object) map);
        }
        return this;
    }

    public RecRequestParamsV2 setSlideMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("75345689", new Object[]{this, str});
        }
        this.mSlideMode = str;
        return this;
    }
}
