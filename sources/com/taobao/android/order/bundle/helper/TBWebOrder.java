package com.taobao.android.order.bundle.helper;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWebOrder extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031807);
    }

    public static /* synthetic */ Object ipc$super(TBWebOrder tBWebOrder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/TBWebOrder");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("closeFullWebView".equals(str)) {
            if (this.mContext != null) {
                Intent intent = new Intent();
                intent.setAction("closeFullWebView");
                LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        } else if ("hideCloseIcon".equals(str) && this.mContext != null) {
            Intent intent2 = new Intent();
            intent2.setAction("hideCloseIcon");
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent2);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        return false;
    }
}
