package com.taobao.browser.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import tb.atw;
import tb.fm2;
import tb.jrw;
import tb.t2o;
import tb.wmc;
import tb.xpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserUIModel extends atw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private View mErrorView;
    private WVUCWebView mWebView;

    static {
        t2o.a(619708661);
    }

    public BrowserUIModel(Context context, WVUCWebView wVUCWebView) {
        super(context, wVUCWebView);
        this.mContext = context;
        this.mWebView = wVUCWebView;
    }

    public static /* synthetic */ Context access$000(BrowserUIModel browserUIModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("97e088e1", new Object[]{browserUIModel});
        }
        return browserUIModel.mContext;
    }

    public static /* synthetic */ WVUCWebView access$100(BrowserUIModel browserUIModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("c71c718d", new Object[]{browserUIModel});
        }
        return browserUIModel.mWebView;
    }

    public static /* synthetic */ Object ipc$super(BrowserUIModel browserUIModel, String str, Object... objArr) {
        if (str.hashCode() == 1246152312) {
            super.loadErrorPage();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/view/BrowserUIModel");
    }

    @Override // tb.atw
    public void loadErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a46c678", new Object[]{this});
        } else {
            loadErrorPage("ANDROID_SYS_NETWORK_ERROR");
        }
    }

    private View createErrorView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5c1702c4", new Object[]{this, str});
        }
        TBErrorView tBErrorView = new TBErrorView(this.mContext);
        WVUCWebView wVUCWebView = this.mWebView;
        if (!(wVUCWebView == null || wVUCWebView.getWebViewContext() == null || !this.mWebView.getWebViewContext().isHitSnapshot())) {
            str = "FCC_" + str;
        }
        Error newError = Error.Factory.newError(str, "网络错误,请稍后再试");
        final String currentUrl = this.mWebView.getCurrentUrl();
        newError.url = currentUrl;
        tBErrorView.setError(newError);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, jrw.a(wmc.REFRESH), new View.OnClickListener() { // from class: com.taobao.browser.view.BrowserUIModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (fm2.commonConfig.n && !TextUtils.isEmpty(currentUrl) && (BrowserUIModel.access$000(BrowserUIModel.this) instanceof Activity)) {
                    Activity activity = (Activity) BrowserUIModel.access$000(BrowserUIModel.this);
                    if (Nav.from(activity).toUri(Uri.parse(currentUrl))) {
                        activity.finish();
                        return;
                    }
                }
                BrowserUIModel.access$100(BrowserUIModel.this).reload();
                BrowserUIModel.this.hideErrorPage();
            }
        });
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        return tBErrorView;
    }

    public void loadErrorPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37044242", new Object[]{this, str});
            return;
        }
        if (this.mErrorView == null && (xpw.a(this.mContext) instanceof Activity)) {
            View createErrorView = createErrorView(str);
            this.mErrorView = createErrorView;
            setErrorView(createErrorView);
        }
        super.loadErrorPage();
    }
}
