package com.taobao.android.order.bundle.search.ui.pojo;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RecommendItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String identify;
    public String itemId;
    public String itemName;
    public String pic;
    public String price;
    public String promotionPrice;
    public String sellCount;
    public String url;

    static {
        t2o.a(713031894);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RecommendItem [itemId=" + this.itemId + ", price=" + this.price + ", promotionPrice=" + this.promotionPrice + ", url=" + this.url + ", pic=" + this.pic + ", sellCount=" + this.sellCount + ", identify=" + this.identify + "]";
    }
}
