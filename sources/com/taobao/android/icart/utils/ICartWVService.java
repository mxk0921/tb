package com.taobao.android.icart.utils;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.broadcast.CartWVBroadcast;
import com.taobao.android.icart.engine.CartVEngine;
import tb.c9x;
import tb.hav;
import tb.ke3;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ICartWVService extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_BRIDGE_NAME = "ICartWVService";

    static {
        t2o.a(478150900);
    }

    public static /* synthetic */ Object ipc$super(ICartWVService iCartWVService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/utils/ICartWVService");
    }

    public static void register(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fa2113", new Object[]{cartVEngine});
        } else {
            ke3.b(cartVEngine);
        }
    }

    public static void unregister(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f0a49a", new Object[]{cartVEngine});
        } else {
            ke3.c(cartVEngine);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        hav.d(JS_BRIDGE_NAME, "action=" + str + ",params=" + str2);
        if (ke3.a(str, str2, wVCallBackContext)) {
            return true;
        }
        hav.g(c9x.CART_BIZ_NAME, JS_BRIDGE_NAME, ",action=", CartWVBroadcast.ACTION_ICART_WV_SERVICE);
        Intent intent = new Intent(CartWVBroadcast.ACTION_ICART_WV_SERVICE);
        intent.putExtra(CartWVBroadcast.KEY_ICART_WV_SERVICE_ACTION, str);
        intent.putExtra(CartWVBroadcast.KEY_ICART_WV_SERVICE_PARAMS, str2);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        wVCallBackContext.success();
        return true;
    }
}
