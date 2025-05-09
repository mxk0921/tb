package com.alibaba.poplayer.config.model.predeal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.jd0;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PreDealCustomEventParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long dealEndTime;
    private long dealStartTime;
    private long sdkWaitTime;
    private String traceId;
    private Set<String> uriSet = new HashSet();
    private Map<String, PreDealIndexContent> indexMap = new HashMap();
    private JSONObject trackMap = new JSONObject();

    static {
        t2o.a(625999898);
    }

    public long generateSdkWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("549e4c82", new Object[]{this})).longValue();
        }
        long j = this.dealEndTime;
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.sdkWaitTime;
        if (j2 > 0) {
            return (j - j2) / 1000;
        }
        return 0L;
    }

    public String getContentById(String str) {
        PreDealIndexContent preDealIndexContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53a335da", new Object[]{this, str});
        }
        Map<String, PreDealIndexContent> map = this.indexMap;
        if (map == null || (preDealIndexContent = map.get(str)) == null) {
            return "";
        }
        return preDealIndexContent.getContent();
    }

    public Set<String> getIndexIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("dbd70b32", new Object[]{this});
        }
        Map<String, PreDealIndexContent> map = this.indexMap;
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    public Map<String, PreDealIndexContent> getIndexMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee536f1c", new Object[]{this});
        }
        return this.indexMap;
    }

    public long getPreDealCostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47f3dbce", new Object[]{this})).longValue();
        }
        long j = this.dealEndTime;
        long j2 = this.dealStartTime;
        if (j <= j2 || j2 <= 0) {
            return 0L;
        }
        return (j - j2) / 1000;
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.traceId;
    }

    public JSONObject getTrackMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("13b84dae", new Object[]{this});
        }
        return this.trackMap;
    }

    public Set<String> getUriSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("efe08782", new Object[]{this});
        }
        return this.uriSet;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        Set<String> set = this.uriSet;
        if (set == null || set.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean needTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.trackMap;
        if (jSONObject == null || jSONObject.size() <= 0) {
            return false;
        }
        return true;
    }

    public void setDealEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15350e3", new Object[]{this, new Long(j)});
        } else {
            this.dealEndTime = j;
        }
    }

    public void setDealStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e091bc", new Object[]{this, new Long(j)});
        } else {
            this.dealStartTime = j;
        }
    }

    public void setIndexMap(Map<String, PreDealIndexContent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf426f2", new Object[]{this, map});
        } else {
            this.indexMap = map;
        }
    }

    public void setSdkWaitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547be8e3", new Object[]{this, new Long(j)});
        } else {
            this.sdkWaitTime = j;
        }
    }

    public void setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.traceId = str;
        }
    }

    public void setTrackMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e88096", new Object[]{this, jSONObject});
        } else {
            this.trackMap = jSONObject;
        }
    }

    public void setUriSet(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57df3e00", new Object[]{this, set});
        } else {
            this.uriSet = set;
        }
    }

    public void syncModuleByIndexId(String str, OnePopModule onePopModule) {
        PreDealIndexContent preDealIndexContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95ecb67", new Object[]{this, str, onePopModule});
        } else if (this.indexMap != null && jd0.c().a() != null && jd0.c().a().isRecordBucketId() && (preDealIndexContent = this.indexMap.get(str)) != null) {
            try {
                JSONObject parseObject = JSON.parseObject(JSON.parseObject(JSON.parseObject(preDealIndexContent.getContent()).getString("algParams")).getString("algParams"));
                onePopModule.g0 = parseObject.getString("bucketId");
                onePopModule.i0 = parseObject.getString(OConstant.DIMEN_CONFIG_NAME);
            } catch (Throwable th) {
                wdm.h("PreDealCustomBroadcastReceiver.getBucketIdFromPreDealIndexContent.error.", th);
            }
        }
    }
}
