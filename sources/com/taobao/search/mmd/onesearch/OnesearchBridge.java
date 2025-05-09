package com.taobao.search.mmd.onesearch;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ckf;
import tb.ipw;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class OnesearchBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792536);
    }

    public static /* synthetic */ Object ipc$super(OnesearchBridge onesearchBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/onesearch/OnesearchBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ckf.g(str, "action");
        ckf.g(str2, "params");
        ckf.g(wVCallBackContext, "callback");
        IWVWebView webview = wVCallBackContext.getWebview();
        ipw ipwVar = null;
        SearchWidgetUCWebView searchWidgetUCWebView = webview instanceof SearchWidgetUCWebView ? (SearchWidgetUCWebView) webview : null;
        if (searchWidgetUCWebView == null) {
            wVCallBackContext.error("仅支持在搜索webView中调用");
            return false;
        }
        Object tag = searchWidgetUCWebView.getTag(R.id.tbsearch_webview_action_performer);
        if (tag instanceof ipw) {
            ipwVar = (ipw) tag;
        }
        if (ipwVar == null) {
            wVCallBackContext.error("无法获取action performer");
            return false;
        }
        ipwVar.a1(str, str2, wVCallBackContext);
        return false;
    }
}
