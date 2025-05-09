package com.alipay.android.msp.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.ImageLoadCallback;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.HtmlParse;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ui.ImageLoader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.lang.reflect.Method;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UCWebViewWindow extends LinearLayout implements IWebViewWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private String on;
    private WebView oo;
    private View op;
    private String oq;
    private JSONObject or = null;
    private TextView oj = (TextView) findViewById(R.id.mini_web_title);
    private ProgressBar ok = (ProgressBar) findViewById(R.id.mini_web_progressbar);
    private ImageView ol = (ImageView) findViewById(R.id.mini_web_refresh);
    private ImageView om = (ImageView) findViewById(R.id.mini_web_help);

    public UCWebViewWindow(Context context) {
        super(context);
        this.mContext = context;
        LayoutInflater.from(context).inflate(R.layout.mini_web_view_child, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.title_back_layout);
        this.op = findViewById;
        findViewById.setContentDescription(LanguageHelper.localizedStringForKey("accessibilty_back_button", context.getString(R.string.accessibilty_back_button), new Object[0]));
    }

    public static /* synthetic */ Object ipc$super(UCWebViewWindow uCWebViewWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/web/UCWebViewWindow");
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WebView webView = this.oo;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.oo.removeAllViews();
            if (this.oo.getParent() != null) {
                ((ViewGroup) this.oo.getParent()).removeView(this.oo);
            }
            this.oo.destroy();
            this.oo = null;
            this.mContext = null;
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public JSONObject getBackDlg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fca0e9", new Object[]{this});
        }
        return this.or;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public View getBackView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7ce4092b", new Object[]{this});
        }
        return this.op;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ImageView getFreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("f545e3cc", new Object[]{this});
        }
        return this.ol;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ImageView getHelpView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a4624f6d", new Object[]{this});
        }
        return this.om;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ProgressBar getProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("98fa86b3", new Object[]{this});
        }
        return this.ok;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public TextView getTitleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("91d40de2", new Object[]{this});
        }
        return this.oj;
    }

    public WebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("eec1fcf4", new Object[]{this});
        }
        return this.oo;
    }

    public void init(boolean z, String str, String str2) {
        this.oo = new WebView(this.mContext);
        this.on = str;
        this.oq = str2;
        ((FrameLayout) findViewById(R.id.mini_webView_frame)).addView(this.oo);
        this.oo.getSettings().setUseWideViewPort(true);
        this.oo.getSettings().setJavaScriptEnabled(true);
        this.oo.getSettings().setSavePassword(false);
        this.oo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.oo.setVerticalScrollbarOverlay(true);
        this.oo.getSettings().setAllowFileAccess(false);
        Context context = this.mContext;
        if (context != null && !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_WEBVIEW_TEXT_ZOOM, false, this.mContext)) {
            this.oo.getSettings().setTextZoom(100);
        }
        if (z) {
            WebSettings settings = this.oo.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!TextUtils.isEmpty(userAgentString) && userAgentString.contains(f7l.BRACKET_START_STR)) {
                String substring = userAgentString.substring(0, userAgentString.indexOf(f7l.BRACKET_START_STR));
                settings.setUserAgentString(substring + MspConfig.getInstance().getSdkUserAgent(this.mContext.getApplicationContext()));
                settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            }
        }
        try {
            Method method = this.oo.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
            if (method != null) {
                method.invoke(this.oo.getSettings(), Boolean.TRUE);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        try {
            Method method2 = this.oo.getClass().getMethod("removeJavascriptInterface", new Class[0]);
            if (method2 != null) {
                method2.invoke(this.oo, "searchBoxJavaBridge_");
                method2.invoke(this.oo, "accessibility");
                method2.invoke(this.oo, "accessibilityTraversal");
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        if (TextUtils.equals("help", this.oq)) {
            this.om.setVisibility(0);
            this.ol.setVisibility(8);
        } else if (TextUtils.equals("refresh", this.oq)) {
            this.om.setVisibility(8);
            this.ol.setVisibility(0);
        } else if (TextUtils.equals("none", this.oq)) {
            this.om.setVisibility(8);
            this.ol.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.on)) {
            this.om.setVisibility(0);
            this.ol.setVisibility(8);
        }
        if (this.oo.getUCExtension() != null) {
            LogUtil.d("UCWebViewWindow", "init", "uc web init");
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        WebView webView = this.oo;
        if (webView != null) {
            webView.reload();
        }
    }

    public void setBackAction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b69aaa", new Object[]{this, jSONObject});
        } else {
            this.or = jSONObject;
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void showTip(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bfa920", new Object[]{this, str, str2, onClickListener});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tip_container);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.mContext == null) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ImageLoader.getInstance().loadImage((ImageView) findViewById(R.id.tip_icon), str, ImageLoader.LoadAction.Background, (ImageLoader.ClipsInfo) null, this.mContext, (ImageLoadCallback) null);
        try {
            ((TextView) findViewById(R.id.tip_text)).setText(HtmlParse.parseHtml(this.mContext, str2));
            linearLayout.setOnClickListener(onClickListener);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void showReFreshView(boolean z) {
        ImageView imageView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed484a", new Object[]{this, new Boolean(z)});
        } else if (TextUtils.equals(this.oq, "refresh")) {
            ImageView imageView2 = this.ol;
            if (!z) {
                i = 8;
            }
            imageView2.setVisibility(i);
        } else if (TextUtils.isEmpty(this.oq)) {
            if (!TextUtils.isEmpty(this.on)) {
                imageView = this.ol;
            } else {
                imageView = this.ol;
                if (!z) {
                    imageView = imageView;
                }
                imageView.setVisibility(i);
            }
            i = 8;
            imageView.setVisibility(i);
        }
    }
}
