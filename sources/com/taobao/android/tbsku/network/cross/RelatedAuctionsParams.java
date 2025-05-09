package com.taobao.android.tbsku.network.cross;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.MtopRequest;
import tb.t2o;
import tb.tqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RelatedAuctionsParams implements Serializable, tqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> itemIds;
    private String mApiName = "mtop.alibaba.detail.open.sku";
    private String mApiVersion = "1.0";
    private String mUnitStrategy = "UNIT_TRADE";

    static {
        t2o.a(785383549);
        t2o.a(442499208);
    }

    public RelatedAuctionsParams(List<String> list) {
        this.itemIds = list;
    }

    public static /* synthetic */ List access$000(RelatedAuctionsParams relatedAuctionsParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bc628cff", new Object[]{relatedAuctionsParams});
        }
        return relatedAuctionsParams.itemIds;
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
        if (this.itemIds == null) {
            this.itemIds = new ArrayList();
        }
        return new JSONObject() { // from class: com.taobao.android.tbsku.network.cross.RelatedAuctionsParams.1
            {
                put("itemIds", (Object) JSON.toJSONString(RelatedAuctionsParams.access$000(RelatedAuctionsParams.this)));
            }
        }.toJSONString();
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
