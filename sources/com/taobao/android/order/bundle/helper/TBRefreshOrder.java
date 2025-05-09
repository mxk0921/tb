package com.taobao.android.order.bundle.helper;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gb0;
import tb.kpw;
import tb.mmi;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBRefreshOrder extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031806);
    }

    public static /* synthetic */ Object ipc$super(TBRefreshOrder tBRefreshOrder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/TBRefreshOrder");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"onRefreshOrder".equals(str)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                z = "true".equals(JSON.parseObject(str2).get("isImmediatelyRefresh"));
            }
        } catch (Exception unused) {
        }
        gb0.d(this.mContext, z);
        gb0.c(this.mContext, z);
        Context context = this.mContext;
        if (context != null) {
            new mmi(context, "TBOrderNative", null).d("refresh");
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
