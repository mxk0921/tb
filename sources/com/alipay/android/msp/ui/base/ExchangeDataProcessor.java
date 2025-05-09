package com.alipay.android.msp.ui.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExchangeDataProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject a(boolean z, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("99cb6bb2", new Object[]{new Boolean(z), str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        if (str != null) {
            jSONObject.put("errorMsg", (Object) str);
        }
        if (obj != null) {
            jSONObject.put("data", obj);
        } else {
            jSONObject.put("data", (Object) "{}");
        }
        return jSONObject;
    }

    public static JSONObject b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c5e2dd6b", new Object[]{bundle});
        }
        try {
            MspCacheManager instance = MspCacheManager.getInstance();
            String string = bundle.getString("CACHE_KEY");
            String string2 = bundle.getString("UID");
            if (TextUtils.isEmpty(string)) {
                return a(false, "请求中没有 CACHE_KEY 或者 UID 字段", null);
            }
            JSONObject parseObject = JSON.parseObject(instance.readCache(string, null, true, true));
            if (parseObject == null) {
                return a(false, "该 CACHE_KEY 没有相应的数据", null);
            }
            return a(true, null, parseObject.get(string2));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return a(false, th.getMessage(), null);
        }
    }

    public static JSONObject route(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d69c4d9a", new Object[]{str, bundle});
        }
        if (bundle == null) {
            return a(false, "传入的参数不能为空", null);
        }
        LogUtil.record(2, "ExchangeDataProcessor::route", "request= " + Utils.bundle2string(bundle));
        str.hashCode();
        if (str.equals(MspConstants.BIZ_TYPE.PAY_CODE)) {
            return b(bundle);
        }
        LogUtil.record(8, "ExchangeDataProcessor::route", "unknown bizType: ".concat(str));
        return a(false, "当前 bizType 不存在", null);
    }
}
