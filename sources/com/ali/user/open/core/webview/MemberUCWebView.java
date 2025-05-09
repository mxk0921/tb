package com.ali.user.open.core.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.util.AttributeSet;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import tb.t2o;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MemberUCWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = MemberUCWebView.class.getSimpleName();
    private String appCacheDir;
    public boolean firstAlert = true;
    public boolean proceed = false;

    static {
        t2o.a(71303278);
    }

    public MemberUCWebView(Context context) {
        super(context);
        initSettings(context);
    }

    public static /* synthetic */ Object ipc$super(MemberUCWebView memberUCWebView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/MemberUCWebView");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        }
    }

    private void initSettings(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667bacae", new Object[]{this, context});
            return;
        }
        WebSettings settings = getSettings();
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception unused) {
        }
        settings.setSavePassword(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        this.appCacheDir = context.getApplicationContext().getDir("cache", 0).getPath();
        settings.setAllowFileAccess(true);
        if (CommonUtils.isNetworkAvailable(context)) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setBuiltInZoomControls(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebView.setWebContentsDebuggingEnabled(SDKLogger.isDebugEnabled());
        settings.setSaveFormData(false);
        settings.setSupportZoom(false);
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e) {
            e.printStackTrace();
        }
        final IWebViewClient iWebViewClient = (IWebViewClient) context;
        setWebViewClient(new WVUCWebViewClient(context) { // from class: com.ali.user.open.core.webview.MemberUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r6, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1262473342) {
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                } else if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode == 534767588) {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/open/core/webview/MemberUCWebView$1");
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                iWebViewClient.onPageFinished(str);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                    return;
                }
                super.onPageStarted(webView, str, bitmap);
                iWebViewClient.onPageStarted(str);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
                }
                return iWebViewClient.shouldOverrideUrlLoading(str);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                    return;
                }
                MemberUCWebView memberUCWebView = MemberUCWebView.this;
                if (memberUCWebView.firstAlert) {
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.ali.user.open.core.webview.MemberUCWebView.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            sslErrorHandler.proceed();
                            MemberUCWebView.this.proceed = true;
                        }
                    };
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.ali.user.open.core.webview.MemberUCWebView.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            sslErrorHandler.cancel();
                            MemberUCWebView.this.proceed = false;
                        }
                    };
                    if (webView.getContext() instanceof Activity) {
                        DialogHelper.getInstance().alert((Activity) webView.getContext(), "SSL证书错误", "证书错误. 是否继续访问?", wmc.CONFIRM, onClickListener, wmc.CANCEL, onClickListener2);
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
                    builder.setPositiveButton(wmc.CONFIRM, onClickListener);
                    builder.setNeutralButton(wmc.CANCEL, onClickListener2);
                    try {
                        AlertDialog create = builder.create();
                        create.setTitle("SSL证书错误");
                        create.setMessage("证书错误. 是否继续访问?");
                        create.show();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (memberUCWebView.proceed) {
                    sslErrorHandler.proceed();
                } else {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }
            }
        });
        setWebChromeClient(new WVUCWebChromeClient() { // from class: com.ali.user.open.core.webview.MemberUCWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -2015964955) {
                    super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/MemberUCWebView$2");
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                    return;
                }
                super.onReceivedTitle(webView, str);
                iWebViewClient.onReceivedTitle(str);
            }
        });
        setDownloadListener(new UCDownloadListener(context));
    }

    public MemberUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initSettings(context);
    }
}
