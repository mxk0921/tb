package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopZuoPinTabData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int aDayCount;
    private HashMap<String, Integer> aDayShopListCounts = new HashMap<>();
    private long lastUpdateTime;

    static {
        t2o.a(766509553);
    }

    public final int getADayCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1852918", new Object[]{this})).intValue();
        }
        return this.aDayCount;
    }

    public final HashMap<String, Integer> getADayShopListCounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4a357ad3", new Object[]{this});
        }
        return this.aDayShopListCounts;
    }

    public final long getLastUpdateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1977eedd", new Object[]{this})).longValue();
        }
        return this.lastUpdateTime;
    }

    public final void setADayCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2716d68a", new Object[]{this, new Integer(i)});
        } else {
            this.aDayCount = i;
        }
    }

    public final void setADayShopListCounts(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ebeab7", new Object[]{this, hashMap});
            return;
        }
        ckf.g(hashMap, "<set-?>");
        this.aDayShopListCounts = hashMap;
    }

    public final void setLastUpdateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cb246f", new Object[]{this, new Long(j)});
        } else {
            this.lastUpdateTime = j;
        }
    }
}
