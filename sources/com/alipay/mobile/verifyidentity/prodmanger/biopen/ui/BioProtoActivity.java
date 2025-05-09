package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import tb.acq;
import tb.h1p;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioProtoActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WebView N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;

    public static /* synthetic */ String access$000(BioProtoActivity bioProtoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36a1abe2", new Object[]{bioProtoActivity});
        }
        return bioProtoActivity.R;
    }

    public static /* synthetic */ void access$100(BioProtoActivity bioProtoActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720b8ec9", new Object[]{bioProtoActivity, str});
        } else {
            bioProtoActivity.a(str);
        }
    }

    public static /* synthetic */ String access$200(BioProtoActivity bioProtoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7a53ba0", new Object[]{bioProtoActivity});
        }
        return bioProtoActivity.O;
    }

    public static /* synthetic */ Object ipc$super(BioProtoActivity bioProtoActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioProtoActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && (str.contains(h1p.HTTPS_PREFIX) || str.contains(h1p.HTTP_PREFIX))) {
            VerifyLogCat.i("BioProtoActivity", "标题含有http url，不显示");
            str = "";
        }
        TitleBarAdapter titleBarAdapter = new TitleBarAdapter();
        titleBarAdapter.a(this, str, false);
        titleBarAdapter.f4342a = new TitleBarAdapter.OnLeftButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioProtoActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnLeftButtonClickListener
            public final void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BioProtoActivity.this.finish();
                }
            }
        };
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.bio_proto_webview);
        this.N = (WebView) findViewById(R.id.finger_agree_web);
        if (!(getIntent() == null || (extras = getIntent().getExtras()) == null)) {
            this.O = extras.getString(upx.PRODUCT_ID);
            this.Q = extras.getString("protoUrl");
            this.R = extras.getString("bicListUrl");
            this.S = extras.getString("protocol_url");
        }
        WebView webView = this.N;
        if (!VIUtils.isInExport()) {
            VerifyLogCat.i("BioProtoActivity", "非输出，不处理");
        } else {
            try {
                Method method = webView.getClass().getMethod("removeJavascriptInterface", String.class);
                if (method != null) {
                    method.invoke(webView, "searchBoxJavaBridge_");
                    method.invoke(webView, "accessibility");
                    method.invoke(webView, "accessibilityTraversal");
                }
            } catch (Throwable unused) {
            }
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setSavePassword(false);
            settings.setSupportZoom(false);
            settings.setBuiltInZoomControls(false);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        if (!TextUtils.isEmpty(this.R)) {
            this.P = this.R;
        } else if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.O)) {
            a(getString(R.string.finger_proto));
            this.P = "https://d.alipay.com/agreement/zw.htm";
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.O)) {
            a(getString(R.string.face_proto));
            this.P = "https://render.alipay.com/p/f/fd-jgvlcrr0/index.html";
        } else if (CommonConstant.FACELOGIN.equalsIgnoreCase(this.O)) {
            this.P = this.Q;
        } else if (CommonConstant.FACE_PAY.equalsIgnoreCase(this.O)) {
            this.P = this.S;
        }
        this.N.setWebViewClient(new WebViewClient() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioProtoActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1835642644) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioProtoActivity$1");
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView2, str});
                    return;
                }
                super.onPageFinished(webView2, str);
                String title = webView2.getTitle();
                if (!TextUtils.isEmpty(title)) {
                    if (!TextUtils.isEmpty(BioProtoActivity.access$000(BioProtoActivity.this))) {
                        BioProtoActivity.access$100(BioProtoActivity.this, title);
                    }
                    if (CommonConstant.FACELOGIN.equalsIgnoreCase(BioProtoActivity.access$200(BioProtoActivity.this))) {
                        BioProtoActivity.access$100(BioProtoActivity.this, title);
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView2, str})).booleanValue();
                }
                return true;
            }
        });
        this.N.loadUrl(this.P);
    }
}
