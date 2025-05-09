package com.ali.user.open.core.webview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.util.CommonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SystemWebViewProxy implements IWebViewProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MemberWebView mWebView;

    static {
        t2o.a(71303286);
        t2o.a(71303277);
    }

    public SystemWebViewProxy(Context context) {
        try {
            if (ConfigManager.getInstance().handleWebviewDir) {
                CommonUtils.handleWebviewDir(context);
            }
            this.mWebView = new MemberWebView(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void addBridgeObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4583696", new Object[]{this, str, obj});
            return;
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            memberWebView.addBridgeObject(str, obj);
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            return memberWebView.canGoBack();
        }
        return false;
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            memberWebView.destroy();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public ViewParent getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("29bb769f", new Object[]{this});
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            return memberWebView.getParent();
        }
        return null;
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            return memberWebView.getUrl();
        }
        return "";
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public View getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("143738ac", new Object[]{this});
        }
        return this.mWebView;
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
            return;
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            memberWebView.goBack();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        try {
            this.mWebView.loadUrl(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            memberWebView.onResume();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void removeAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816149f8", new Object[]{this});
            return;
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            memberWebView.removeAllViews();
        }
    }

    @Override // com.ali.user.open.core.webview.IWebViewProxy
    public void resumeTimers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb9df62", new Object[]{this});
            return;
        }
        MemberWebView memberWebView = this.mWebView;
        if (memberWebView != null) {
            memberWebView.resumeTimers();
        }
    }

    public SystemWebViewProxy(Context context, String str) {
        try {
            this.mWebView = new MemberWebView(context);
            if (CommonUtils.getDarkModeStatus(KernelContext.getApplicationContext()) && !TextUtils.isEmpty(str)) {
                this.mWebView.setBackgroundColor(Color.parseColor(str));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
