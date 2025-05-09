package com.taobao.dai.realtimedebug;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kgh;
import tb.kpw;
import tb.tqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVRealtimeDebugPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVRealtimeDebugPlugin";

    public static /* synthetic */ Object ipc$super(WVRealtimeDebugPlugin wVRealtimeDebugPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/dai/realtimedebug/WVRealtimeDebugPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        kgh.a(TAG, "action=" + str + ", param=" + str2 + ", callback=" + wVCallBackContext);
        boolean d = tqh.d(str, str2);
        if (wVCallBackContext != null) {
            if (d) {
                wVCallBackContext.error();
            } else {
                wVCallBackContext.success();
            }
        }
        return d;
    }
}
