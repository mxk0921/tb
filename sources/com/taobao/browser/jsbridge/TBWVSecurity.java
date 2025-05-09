package com.taobao.browser.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWVSecurity extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708520);
    }

    public static /* synthetic */ Object ipc$super(TBWVSecurity tBWVSecurity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/TBWVSecurity");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"secureToken".equals(str)) {
            return false;
        }
        secureToken(str2, wVCallBackContext);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[Catch: Exception -> 0x0131, TRY_LEAVE, TryCatch #1 {Exception -> 0x0131, blocks: (B:11:0x0082, B:13:0x008e, B:17:0x00a2, B:19:0x00aa, B:22:0x00c2, B:23:0x00c4, B:26:0x00de, B:28:0x00e4, B:30:0x00ee, B:33:0x0104, B:34:0x0106, B:36:0x011e, B:37:0x0128), top: B:43:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[Catch: Exception -> 0x0131, TRY_LEAVE, TryCatch #1 {Exception -> 0x0131, blocks: (B:11:0x0082, B:13:0x008e, B:17:0x00a2, B:19:0x00aa, B:22:0x00c2, B:23:0x00c4, B:26:0x00de, B:28:0x00e4, B:30:0x00ee, B:33:0x0104, B:34:0x0106, B:36:0x011e, B:37:0x0128), top: B:43:0x0082 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void secureToken(java.lang.String r34, android.taobao.windvane.jsbridge.WVCallBackContext r35) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.jsbridge.TBWVSecurity.secureToken(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}
