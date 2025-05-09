package com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.k75;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GetCouponRequest implements INetDataObject {
    public String API_NAME = "mtop.taobao.buyerresourcemtopwriteservice.applycoupon";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String VERSION = k75.VIDEOCONFIG_API_VERSION_3;
    public String couponInstanceSource;
    public String querySource;
    public String supplierId;
    public String uuid;

    static {
        t2o.a(295698912);
        t2o.a(806355930);
    }
}
