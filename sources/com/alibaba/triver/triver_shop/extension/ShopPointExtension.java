package com.alibaba.triver.triver_shop.extension;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.basic.proxy.ILogNetworkPoint;
import com.alibaba.triver.kit.api.proxy.ITriverAppMonitorProxy;
import com.android.alibaba.ip.runtime.IpChange;
import tb.phu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopPointExtension implements ILogNetworkPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SRAGE_PAGE_DATA_COST = "pageDataCost";
    public static final String KEY_STAGE_PAGE_DATA_PREFETCH_HIT = "pageDataPreFetchHit";
    public static final String KEY_STAGE_SHOP_FETCH_COST = "shopFetchCost";
    public static final String KEY_STAGE_SHOP_PREFETCH_HIT = "shopPreFetchHit";
    public static final String SHOP_FETCH_API = "mtop.taobao.wireless.shop.fetch";
    public static final String SHOP_PAGE_DATA_URL = "https://alisitecdn.m.taobao.com/minidata";
    public static final String TAG = "ShopPointExtension";

    static {
        t2o.a(766509306);
    }

    public void onHttpCacheHit(String str, App app, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190cf7f7", new Object[]{this, str, app, new Boolean(z)});
        } else if (z && !TextUtils.isEmpty(str) && SHOP_PAGE_DATA_URL.equals(str)) {
            ((ITriverAppMonitorProxy) RVProxy.get(ITriverAppMonitorProxy.class)).commitTriverPerf(phu.a().c(app).n(app != null ? app.getStartParams() : null).m(KEY_STAGE_PAGE_DATA_PREFETCH_HIT).o(Double.valueOf(1.0d)).a());
        }
    }

    public void onHttpRequestCost(String str, App app, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ade22aa", new Object[]{this, str, app, new Long(j)});
        } else if (!TextUtils.isEmpty(str) && SHOP_PAGE_DATA_URL.equals(str)) {
            ((ITriverAppMonitorProxy) RVProxy.get(ITriverAppMonitorProxy.class)).commitTriverPerf(phu.a().c(app).n(app != null ? app.getStartParams() : null).m(KEY_SRAGE_PAGE_DATA_COST).o(Double.valueOf(1.0d)).a(), j);
        }
    }

    public void onMtopCacheHit(String str, App app, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df170ab7", new Object[]{this, str, app, new Boolean(z)});
        } else if (z && SHOP_FETCH_API.equals(str)) {
            RVLogger.d(TAG, "shop fetch cache hit : " + z);
            ((ITriverAppMonitorProxy) RVProxy.get(ITriverAppMonitorProxy.class)).commitTriverPerf(phu.a().c(app).n(app != null ? app.getStartParams() : null).m(KEY_STAGE_SHOP_PREFETCH_HIT).o(Double.valueOf(1.0d)).a());
        }
    }

    public void onMtopRequestCost(String str, App app, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591a17ea", new Object[]{this, str, app, new Long(j)});
        } else if (SHOP_FETCH_API.equals(str)) {
            RVLogger.d(TAG, "shop fetch cost : " + j);
            ((ITriverAppMonitorProxy) RVProxy.get(ITriverAppMonitorProxy.class)).commitTriverPerf(phu.a().c(app).n(app != null ? app.getStartParams() : null).m(KEY_STAGE_SHOP_FETCH_COST).o(Double.valueOf(1.0d)).a(), j);
        }
    }
}
