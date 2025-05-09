package com.taobao.tao.shop.fetcher;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBSRCacheData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Integer> host;
    private Map<String, Integer> promotion;
    private List<MtopTaobaoWirelessShopRouteProcessResponseData> result;
    private Map<String, Integer> sellerId;
    private Map<String, Integer> shopId;
    private Map<String, Integer> userNick;

    static {
        t2o.a(668991531);
    }

    public Map<String, Integer> getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77e1f11a", new Object[]{this});
        }
        return this.host;
    }

    public Map<String, Integer> getPromotion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d62b4b29", new Object[]{this});
        }
        return this.promotion;
    }

    public List<MtopTaobaoWirelessShopRouteProcessResponseData> getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf0beced", new Object[]{this});
        }
        return this.result;
    }

    public Map<String, Integer> getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd8b94ec", new Object[]{this});
        }
        return this.sellerId;
    }

    public Map<String, Integer> getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76074463", new Object[]{this});
        }
        return this.shopId;
    }

    public Map<String, Integer> getUserNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73b52cc0", new Object[]{this});
        }
        return this.userNick;
    }

    public void setHost(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924dbeb4", new Object[]{this, map});
        } else {
            this.host = map;
        }
    }

    public void setPromotion(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e9241d", new Object[]{this, map});
        } else {
            this.promotion = map;
        }
    }

    public void setResult(List<MtopTaobaoWirelessShopRouteProcessResponseData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcea7d17", new Object[]{this, list});
        } else {
            this.result = list;
        }
    }

    public void setSellerId(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c0bb22", new Object[]{this, map});
        } else {
            this.sellerId = map;
        }
    }

    public void setShopId(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6f478b", new Object[]{this, map});
        } else {
            this.shopId = map;
        }
    }

    public void setUserNick(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca1dce", new Object[]{this, map});
        } else {
            this.userNick = map;
        }
    }
}
