package com.taobao.android.opencart.broadcast;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c9x;
import tb.fsw;
import tb.hav;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBCartWVService extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADD_CART_NOTIFY = "addCartNotify";
    private static final String CART_JSBRIDGE_NAME = "TBCartWVService";
    private static final String KEY_ADD_CART_NOTIFY_PARAMS = "params";
    private static AtomicBoolean sRegisterAtomicBoolean = new AtomicBoolean();

    public static /* synthetic */ Object ipc$super(TBCartWVService tBCartWVService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/broadcast/TBCartWVService");
    }

    public static void registerPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39467d3d", new Object[0]);
        } else if (!sRegisterAtomicBoolean.getAndSet(true)) {
            fsw.i(CART_JSBRIDGE_NAME, TBCartWVService.class, true);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!ACTION_ADD_CART_NOTIFY.equals(str) || this.mContext == null) {
            return false;
        }
        hav.g(c9x.CART_BIZ_NAME, CART_JSBRIDGE_NAME, "#cartRefreshData");
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.putExtra("params", str2);
        intent.putExtra("cartWVAddCartNotify", true);
        intent.putExtra("cartBroadcastFrom", CART_JSBRIDGE_NAME);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
