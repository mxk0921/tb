package com.uc.webview.internal.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.uc.webview.export.GeolocationPermissions;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IOpenFileChooser;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class h extends i implements IOpenFileChooser {
    private WeakHashMap<PermissionRequest, WeakReference<c>> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements WebChromeClient.CustomViewCallback {
        private WebChromeClient.CustomViewCallback b;

        public a(WebChromeClient.CustomViewCallback customViewCallback) {
            this.b = customViewCallback;
        }

        @Override // com.uc.webview.export.WebChromeClient.CustomViewCallback
        public final void onCustomViewHidden() {
            WebChromeClient.CustomViewCallback customViewCallback = this.b;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements GeolocationPermissions.Callback {
        private GeolocationPermissions.Callback b;

        public b(GeolocationPermissions.Callback callback) {
            this.b = callback;
        }

        @Override // com.uc.webview.export.GeolocationPermissions.Callback
        public final void invoke(String str, boolean z, boolean z2) {
            GeolocationPermissions.Callback callback = this.b;
            if (callback != null) {
                callback.invoke(str, z, z2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends com.uc.webview.export.PermissionRequest {

        /* renamed from: a  reason: collision with root package name */
        PermissionRequest f14355a;

        public c(PermissionRequest permissionRequest) {
            this.f14355a = permissionRequest;
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final void deny() {
            this.f14355a.deny();
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final Uri getOrigin() {
            return this.f14355a.getOrigin();
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final String[] getResources() {
            return this.f14355a.getResources();
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final void grant(String[] strArr) {
            this.f14355a.grant(strArr);
        }
    }

    public h(WebView webView, com.uc.webview.export.WebChromeClient webChromeClient) {
        this.f14356a = webView;
        this.b = webChromeClient;
    }

    private void a(final ValueCallback<Uri> valueCallback, final String str, final String str2) {
        if (!this.b.onShowFileChooser(this.f14356a, new ValueCallback<Uri[]>() { // from class: com.uc.webview.internal.android.h.2
            @Override // android.webkit.ValueCallback
            public final /* bridge */ /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                Uri uri;
                Uri[] uriArr2 = uriArr;
                ValueCallback valueCallback2 = valueCallback;
                if (uriArr2 == null) {
                    uri = null;
                } else {
                    uri = uriArr2[0];
                }
                valueCallback2.onReceiveValue(uri);
            }
        }, new WebChromeClient.FileChooserParams() { // from class: com.uc.webview.internal.android.h.3
            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final Intent createIntent() {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setTypeAndNormalize(getAcceptTypes()[0]);
                return intent;
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final String[] getAcceptTypes() {
                String str3;
                if (TextUtils.isEmpty(str)) {
                    str3 = "*/*";
                } else {
                    str3 = str;
                }
                return new String[]{str3};
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final String getFilenameHint() {
                return "";
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final int getMode() {
                return 0;
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final CharSequence getTitle() {
                return "";
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final boolean isCaptureEnabled() {
                if (!TextUtils.isEmpty(str2)) {
                    return true;
                }
                return false;
            }
        })) {
            this.b.openFileChooser(valueCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return this.b.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return this.b.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        this.b.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        this.b.onCloseWindow(this.f14356a);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.b.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        com.uc.webview.export.WebView webView2 = this.f14356a;
        Objects.requireNonNull(webView2);
        WebView.WebViewTransport webViewTransport2 = new WebView.WebViewTransport();
        Message obtain = Message.obtain(new Handler(Looper.getMainLooper()) { // from class: com.uc.webview.internal.android.h.1
            @Override // android.os.Handler
            public final void handleMessage(Message message2) {
            }
        });
        obtain.obj = webViewTransport2;
        e.a(true);
        boolean onCreateWindow = this.b.onCreateWindow(this.f14356a, z, z2, obtain);
        e.a(false);
        if (webViewTransport2.getWebView() == null) {
            webViewTransport.setWebView(null);
        } else {
            webViewTransport.setWebView((android.webkit.WebView) webViewTransport2.getWebView().getCoreView());
        }
        if (webViewTransport.getWebView() != null) {
            message.sendToTarget();
        }
        return onCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        this.b.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.b.onGeolocationPermissionsShowPrompt(str, new b(callback));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.b.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsAlert(this.f14356a, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsBeforeUnload(this.f14356a, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsConfirm(this.f14356a, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.b.onJsPrompt(this.f14356a, str, str2, str3, new d(jsPromptResult));
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (this.b == null) {
            permissionRequest.deny();
            return;
        }
        if (this.c == null) {
            this.c = new WeakHashMap<>();
        }
        c cVar = new c(permissionRequest);
        this.c.put(permissionRequest, new WeakReference<>(cVar));
        this.b.onPermissionRequest(cVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        WeakHashMap<PermissionRequest, WeakReference<c>> weakHashMap;
        WeakReference<c> weakReference;
        c cVar;
        if (this.b != null && (weakHashMap = this.c) != null && (weakReference = weakHashMap.get(permissionRequest)) != null && (cVar = weakReference.get()) != null) {
            this.b.onPermissionRequestCanceled(cVar);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        this.b.onProgressChanged(this.f14356a, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(android.webkit.WebView webView, Bitmap bitmap) {
        this.b.onReceivedIcon(this.f14356a, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(android.webkit.WebView webView, String str) {
        this.b.onReceivedTitle(this.f14356a, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(android.webkit.WebView webView, String str, boolean z) {
        this.b.onReceivedTouchIconUrl(this.f14356a, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(android.webkit.WebView webView) {
        this.b.onRequestFocus(this.f14356a);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.b.onShowCustomView(view, new a(customViewCallback));
    }

    @Override // com.uc.webview.internal.interfaces.IOpenFileChooser
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        a(valueCallback, str, str2);
    }

    @Override // com.uc.webview.internal.interfaces.IOpenFileChooser
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        a(valueCallback, str, null);
    }

    @Override // com.uc.webview.internal.interfaces.IOpenFileChooser
    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        a(valueCallback, null, null);
    }
}
