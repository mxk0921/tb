package com.taobao.android.order.bundle.helper;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.edl;
import tb.gav;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderRequestJSPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031798);
    }

    public static /* synthetic */ Object ipc$super(OrderRequestJSPlugin orderRequestJSPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/OrderRequestJSPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        gav a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str2 == null) {
            return false;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (!"orderListRefresh".equals(str) || (a2 = edl.a()) == null) {
            return false;
        }
        a2.U(parseObject);
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
