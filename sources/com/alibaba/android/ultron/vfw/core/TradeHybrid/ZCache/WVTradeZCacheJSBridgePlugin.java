package com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ae2;
import tb.kpw;
import tb.t2o;
import tb.yxr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WVTradeZCacheJSBridgePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION_PREFETCH = "prefetch";
    private static final Map<String, Integer> bizMap;

    public static /* synthetic */ Object ipc$super(WVTradeZCacheJSBridgePlugin wVTradeZCacheJSBridgePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/core/TradeHybrid/ZCache/WVTradeZCacheJSBridgePlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"prefetch".equals(str) || (num = bizMap.get(JSON.parseObject(str2).getString("bizType"))) == null) {
            return false;
        }
        yxr.b(num.intValue());
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }

    static {
        t2o.a(157286579);
        HashMap hashMap = new HashMap();
        bizMap = hashMap;
        hashMap.put("all", 0);
        hashMap.put("cart", 1);
        hashMap.put("purchase", 2);
        hashMap.put("orderList", 3);
        hashMap.put(ae2.BizKeyOrderDetail, 4);
        hashMap.put(ae2.BizKeyRefund, 5);
        hashMap.put("sku", 6);
        hashMap.put("newbuy", 7);
        hashMap.put(ae2.BizKeyPaysuccess, 8);
        hashMap.put("mytaobao", 9);
        hashMap.put("detail", 10);
        hashMap.put(ae2.BizKeyLivegoods, 11);
        hashMap.put("NewDetail", 12);
        hashMap.put(ae2.BizKeyRefundDetail, 13);
        hashMap.put(ae2.BizKeyPackageList, 14);
        hashMap.put("message", 15);
        hashMap.put(ae2.BizKeyRateList, 16);
        hashMap.put(ae2.BizKeyNavProcessor, 17);
    }
}
