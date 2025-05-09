package com.alipay.security.mobile.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.opa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecCamJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SecCamJSBridge";

    public static /* synthetic */ Object ipc$super(SecCamJSBridge secCamJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/windvane/SecCamJSBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("1001".equals(str)) {
            return opa.k().n(str2, wVCallBackContext);
        }
        if ("1002".equals(str)) {
            return opa.k().j(wVCallBackContext);
        }
        if ("1003".equals(str)) {
            return opa.k().g(wVCallBackContext);
        }
        if ("1004".equals(str)) {
            return opa.k().h(str2, wVCallBackContext);
        }
        return false;
    }
}
