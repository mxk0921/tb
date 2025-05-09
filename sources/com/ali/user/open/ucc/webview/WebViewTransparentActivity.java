package com.ali.user.open.ucc.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.CallbackManager;
import com.ali.user.open.core.config.WebViewOption;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.StatusBarService;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.webview.AliUccCustomToolbar;
import com.ali.user.open.core.webview.IWebViewProxy;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WebViewTransparentActivity extends UccWebViewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ucc.webdialog";
    private String page = "page_usercenterbind";

    static {
        t2o.a(76546199);
    }

    public static /* synthetic */ Object ipc$super(WebViewTransparentActivity webViewTransparentActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/ucc/webview/WebViewTransparentActivity");
    }

    private void setWebviewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2853e70", new Object[]{this, new Integer(i)});
            return;
        }
        IWebViewProxy iWebViewProxy = this.memberWebView;
        if (iWebViewProxy != null && iWebViewProxy.getWebView() != null) {
            if (i == 0) {
                this.memberWebView.getWebView().setBackgroundColor(i);
            } else {
                this.memberWebView.getWebView().setBackgroundColor(-1);
            }
            if (this.memberWebView.getWebView().getBackground() != null) {
                this.memberWebView.getWebView().getBackground().setAlpha(i);
            }
        }
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity, com.ali.user.open.core.webview.BaseWebViewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity, com.ali.user.open.core.webview.BaseWebViewActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (AliMemberSDK.getService(StatusBarService.class) == null || ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).getTransparentWebLayout() <= 0) {
            return R.layout.member_sdk_ucc_transparent_layout;
        }
        return ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).getTransparentWebLayout();
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity, com.ali.user.open.core.webview.BaseWebViewActivity
    public void onBackHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922dabd5", new Object[]{this});
        } else if (!this.memberWebView.canGoBack() || (!this.memberWebView.getUrl().contains("authorization-notice") && !this.memberWebView.getUrl().contains("agreement"))) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm", "a2h21.13789771.close.1");
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).sendControl(this.page, "close", "", hashMap);
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", this.mUccParams, new HashMap());
            UccCallback uccCallback = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback != null) {
                if (this.mUccParams == null) {
                    this.mUccParams = new UccParams();
                }
                uccCallback.onFail(this.mUccParams.bindSite, 1403, getResources().getString(R.string.member_sdk_cancel));
                CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            }
            finish();
        } else {
            this.memberWebView.goBack();
        }
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity
    public void hideTitleBar(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9e5dc3", new Object[]{this, uri});
        } else if (uri != null) {
            String queryParameter = uri.getQueryParameter("hideTitleBar");
            if (getSupportActionBar() == null) {
                return;
            }
            if (TextUtils.equals(queryParameter, "true")) {
                getSupportActionBar().hide();
                setWebviewColor(0);
                return;
            }
            getSupportActionBar().show();
            ((AliUccCustomToolbar) findViewById(R.id.ali_user_webview_toolbar)).setVisibility(0);
            setWebviewColor(255);
        }
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity
    public void showTitleBar(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd7dde8", new Object[]{this, uri});
        } else if (uri != null) {
            String queryParameter = uri.getQueryParameter("hideTitleBar");
            if (getSupportActionBar() == null) {
                return;
            }
            if (TextUtils.equals(queryParameter, "true")) {
                getSupportActionBar().hide();
                setWebviewColor(0);
                return;
            }
            getSupportActionBar().show();
            ((AliUccCustomToolbar) findViewById(R.id.ali_user_webview_toolbar)).setVisibility(0);
            setWebviewColor(255);
        }
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public void initViews(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7002b7ef", new Object[]{this, bundle});
            return;
        }
        setContentView(getLayout());
        setActionBar();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        String stringExtra = getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra) && (data = getIntent().getData()) != null) {
            stringExtra = data.getQueryParameter("url");
            this.forceUcWebView = true;
            SDKLogger.e("ucc.webdialog", "read url fomr uri:");
        }
        if (getIntent() != null && TextUtils.equals(WebViewOption.UC.name(), getIntent().getStringExtra("webviewOption"))) {
            this.forceUcWebView = true;
        }
        this.memberWebView = createWebView();
        getResources().getDisplayMetrics();
        ((FrameLayout) findViewById(R.id.ali_user_webview_container)).addView(this.memberWebView.getWebView(), new FrameLayout.LayoutParams(-1, -1));
        setWebviewColor(0);
        SDKLogger.d("ucc.webdialog", "onCreate url=" + stringExtra);
        if (!KernelContext.checkServiceValid() || TextUtils.isEmpty(stringExtra)) {
            finish();
        } else if (!CommonUtils.isNetworkAvailable()) {
            CommonUtils.toast("member_sdk_network_not_available_message");
        } else {
            try {
                this.memberWebView.resumeTimers();
                this.memberWebView.onResume();
            } catch (Exception unused) {
            }
            loadUrl(stringExtra);
        }
    }
}
