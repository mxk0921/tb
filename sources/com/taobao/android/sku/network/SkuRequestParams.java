package com.taobao.android.sku.network;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.byj;
import tb.j5m;
import tb.r4p;
import tb.t2o;
import tb.tqd;
import tb.yo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuRequestParams implements Serializable, tqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mItemId;
    private String mApiName = "mtop.taobao.detail.getDetail";
    private String mApiVersion = j5m.API_VERSION;
    private String mUnitStrategy = "UNIT_TRADE";
    private String mDetail_V = "3.3.2";
    private Map<String, String> mExParams = new HashMap();

    static {
        t2o.a(442499211);
        t2o.a(442499208);
    }

    public SkuRequestParams(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            this.mItemId = str;
        }
        if (map != null) {
            this.mExParams.putAll(map);
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        Map<String, String> map = this.mExParams;
        if (map != null && !map.isEmpty()) {
            try {
                this.mExParams.put(r4p.KEY_LOC_TYPE, JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString(r4p.KEY_LOC_TYPE));
            } catch (Throwable unused) {
            }
            try {
                this.mExParams.put("pvStr", JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString("pvStr"));
            } catch (Throwable unused2) {
            }
        }
        HashMap hashMap = new HashMap();
        AliConfigInterface b = yo0.b();
        if (b != null && "true".equalsIgnoreCase(b.getConfig(byj.DETAIL_TAOBAO_GROUP_NAME, "sku_enable_v7", "true"))) {
            hashMap.put("supportV7", "true");
        }
        hashMap.put("container_type", "sku");
        hashMap.put("ultron2", "true");
        hashMap.put("detail_v", this.mDetail_V);
        hashMap.put("itemNumId", this.mItemId);
        hashMap.put("exParams", JSON.toJSONString(this.mExParams));
        return JSON.toJSONString(hashMap);
    }

    @Override // tb.tqd
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

    @Override // tb.tqd
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return this.mUnitStrategy;
    }
}
