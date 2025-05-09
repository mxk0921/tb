package com.taobao.tao.homepage;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.m6g;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomePageLBSWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "homepage.HomePageLBSWVPlugin";

    static {
        t2o.a(729809259);
    }

    public static /* synthetic */ Object ipc$super(HomePageLBSWVPlugin homePageLBSWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/HomePageLBSWVPlugin");
    }

    public boolean getCacheValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71324c17", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String a2 = m6g.a(str, null);
        nsw nswVar = new nsw();
        nswVar.b("cacheValue", a2);
        wVCallBackContext.success(nswVar);
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getCache".equals(str)) {
            return getCacheValue(str2, wVCallBackContext);
        }
        if ("updateCache".equals(str)) {
            updateCacheValue(str2, wVCallBackContext);
        }
        return false;
    }

    public boolean updateCacheValue(String str, WVCallBackContext wVCallBackContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17afa60a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    z = m6g.e(parseObject.getString("scene"), parseObject.getString("subScene"), parseObject.getString("value"), "JSBRIDGE");
                }
            } catch (Exception unused) {
                new StringBuilder("update cache exception:").append(str);
            }
        }
        if (z) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error("update cache fail");
        }
        return true;
    }
}
