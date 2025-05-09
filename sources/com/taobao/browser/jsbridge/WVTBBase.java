package com.taobao.browser.jsbridge;

import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.util.NetWorkUtils;
import java.util.HashMap;
import tb.epo;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.usj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVTBBase extends kpw implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVTBBase";
    private Handler handler;

    static {
        t2o.a(619708530);
    }

    public static /* synthetic */ Object ipc$super(WVTBBase wVTBBase, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVTBBase");
    }

    @WindVaneInterface
    public final void getEnvironment(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820c87ab", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        if (this.mWebView instanceof BrowserHybridWebView) {
            nswVar.k();
            nswVar.b("getEnvironment", String.valueOf(((BrowserHybridWebView) this.mWebView).getWebviewMode()));
            wVCallBackContext.success(nswVar);
            return;
        }
        wVCallBackContext.success(nswVar);
    }

    @WindVaneInterface
    public final void getNetworkStatus(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884eca98", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String b = usj.b(this.mContext);
        HashMap hashMap = new HashMap();
        hashMap.put("network", b);
        wVCallBackContext.success(JSON.toJSONString(hashMap));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return true;
    }

    public final void isLowendPhone(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41be7feb", new Object[]{this, wVCallBackContext, str});
        } else if (NetWorkUtils.isLowendPhone()) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler instanceof epo) {
            ((epo) handler).b();
        }
        this.handler = null;
        super.onDestroy();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = BrowserUtil.f10259a;
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b(TAG, str3, str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        if ("getNetworkStatus".equals(str)) {
            getNetworkStatus(wVCallBackContext, str2);
        } else if ("getEnvironment".equals(str)) {
            getEnvironment(wVCallBackContext, str2);
        } else if (!"isLowendPhone".equals(str)) {
            return false;
        } else {
            isLowendPhone(wVCallBackContext, str2);
        }
        return true;
    }
}
