package com.taobao.android.detail2.core.framework.data.net.prerequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.ezb;
import tb.r19;
import tb.t2o;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreRequestParams implements Serializable, ezb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REC_APP_ID = "3175";
    private JSONArray mBatchParams;
    private boolean mIsNavRequest;
    private String mNewDetailChannel;
    private String mApiName = "mtop.relationrecommend.WirelessRecommend.recommend";
    private String mApiVersion = "2.0";
    private String mNewType = "ndPreLoad";
    private Map<String, String> mNewDetailVisibleSizeInfo = new HashMap();
    private String mAppId = RecInfoManager.REC_APP_ID;

    static {
        t2o.a(352321821);
        t2o.a(352321807);
    }

    private String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", this.mAppId);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("batchParams", JSON.toJSONString(this.mBatchParams));
        r19.T(z1x.PRE_REQUEST);
        r19.V(z1x.PRE_REQUEST);
        if (r19.F0()) {
            hashMap2.put("ndWeexUrlReplace", "v1Performance");
        }
        hashMap2.put("newType", this.mNewType);
        hashMap2.put("newDetailChannel", this.mNewDetailChannel);
        hashMap2.put("navRequest", String.valueOf(this.mIsNavRequest));
        hashMap2.putAll(this.mNewDetailVisibleSizeInfo);
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
        mtopRequest.setApiName(this.mApiName);
        mtopRequest.setVersion(this.mApiVersion);
        return mtopRequest;
    }

    @Override // tb.ezb
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return "UNIT_GUIDE";
    }

    public PreRequestParams setBatchParams(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("8c8cbcba", new Object[]{this, jSONArray});
        }
        this.mBatchParams = jSONArray;
        return this;
    }

    public PreRequestParams setNavRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("ab486c8", new Object[]{this, new Boolean(z)});
        }
        this.mIsNavRequest = z;
        return this;
    }

    public PreRequestParams setNewDetailChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("1ea41a42", new Object[]{this, str});
        }
        this.mNewDetailChannel = str;
        return this;
    }

    public PreRequestParams setNewDetailVisibleSizeInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("55e4f55b", new Object[]{this, map});
        }
        this.mNewDetailVisibleSizeInfo = map;
        return this;
    }

    public PreRequestParams setNewType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("8ba59cbe", new Object[]{this, str});
        }
        this.mNewType = str;
        return this;
    }

    public PreRequestParams setRecAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestParams) ipChange.ipc$dispatch("7178bdc8", new Object[]{this, str});
        }
        this.mAppId = str;
        return this;
    }
}
