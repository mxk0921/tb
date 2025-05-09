package com.ali.user.mobile.webview;

import android.content.Context;
import android.os.Bundle;
import com.ali.user.mobile.ui.WebConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TransparentWebViewActivity extends WebViewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean closeIfLoadFailed = false;

    static {
        t2o.a(70254906);
    }

    public static /* synthetic */ Object ipc$super(TransparentWebViewActivity transparentWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -39202941:
                super.onWebViewReceivedError(((Number) objArr[0]).intValue(), (String) objArr[1], (String) objArr[2]);
                return null;
            case 267248023:
                super.init();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/webview/TransparentWebViewActivity");
        }
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_activity_transparent_webview;
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        this.mAPRelativeLayout.setBackgroundColor(0);
        LoginWebView loginWebView = this.mWebView;
        if (loginWebView != null) {
            try {
                loginWebView.setBackgroundColor(0);
                this.mWebView.getBackground().setAlpha(0);
            } catch (Exception e) {
                e.printStackTrace();
                this.mWebView.setBackgroundColor(0);
            }
        }
        try {
            this.closeIfLoadFailed = getIntent().getBooleanExtra(WebConstant.WEB_CLOSE_IF_LOAD_FAILED, false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mProgressBar.setVisibility(0);
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        super.onCreate(bundle);
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity
    public void onWebViewReceivedError(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda9cf83", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        super.onWebViewReceivedError(i, str, str2);
        if (this.closeIfLoadFailed && !this.loadFinishedOnce) {
            finish();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }
}
