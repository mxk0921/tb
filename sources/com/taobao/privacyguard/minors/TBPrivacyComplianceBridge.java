package com.taobao.privacyguard.minors;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.vhl;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBPrivacyComplianceBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String METHOD_GET_INFO = "getMinorsInfo";
    private static final String TAG = "TBPrivacyComplianceBridge";

    static {
        t2o.a(757071911);
    }

    private void getInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fabb72", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview == null) {
            vhl.b(TAG, "[getInfo] error: web view is null!");
            nswVar.b("errMsg", "error: web view is null!");
            wVCallBackContext.error(nswVar);
            return;
        }
        Context context = webview.getContext();
        if (context == null) {
            vhl.b(TAG, "[getInfo] error: context is null!");
            nswVar.b("errMsg", "error: context is null!");
            wVCallBackContext.error(nswVar);
            return;
        }
        boolean A = xpr.A(context);
        boolean y = xpr.y(context);
        int s = xpr.s(context);
        nswVar.a("isSystemMinors", Boolean.valueOf(A));
        nswVar.a("isMinors", Boolean.valueOf(y));
        nswVar.a("ageLevel", Integer.valueOf(s));
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(TBPrivacyComplianceBridge tBPrivacyComplianceBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/privacyguard/minors/TBPrivacyComplianceBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, METHOD_GET_INFO)) {
            getInfo(str2, wVCallBackContext);
            return true;
        }
        vhl.b(TAG, "[execute] no such method: " + str);
        return false;
    }
}
