package com.taobao.tbpoplayer.view.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.WVWindow;
import org.json.JSONObject;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerWVWindowPlugin extends WVWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626543);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWVWindowPlugin popLayerWVWindowPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/jsbridge/PopLayerWVWindowPlugin");
    }

    @Override // com.taobao.browser.jsbridge.WVWindow, android.taobao.windvane.jsbridge.api.WVBase, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (!"openWindow".equals(str)) {
                if ("navTo".equals(str)) {
                }
                return super.execute(str, str2, wVCallBackContext);
            }
            IWVWebView iWVWebView = this.mWebView;
            if (iWVWebView != null && (iWVWebView instanceof View) && (((View) iWVWebView).getParent() instanceof PopLayerBaseView)) {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("url")) {
                    ((PopLayerBaseView) ((View) this.mWebView).getParent()).syncJumpToUrlInfo(jSONObject.getString("url"));
                }
                if (jSONObject.has("userResult")) {
                    ((PopLayerBaseView) ((View) this.mWebView).getParent()).setUserResultInTrack(jSONObject.getString("userResult"), false, null);
                }
            }
            return super.execute(str, str2, wVCallBackContext);
        } catch (Throwable th) {
            wdm.h("PopLayerWVWindowPlugin.executeError.", th);
            wVCallBackContext.error();
            return false;
        }
    }
}
