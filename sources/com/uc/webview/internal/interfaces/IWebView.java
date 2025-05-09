package com.uc.webview.internal.interfaces;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import com.uc.webview.export.DownloadListener;
import com.uc.webview.export.WebBackForwardList;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebMessage;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWebView {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IHitTestResult {
        String getExtra();

        int getType();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IWebViewTransport {
        IWebView getWebView();

        void setWebView(IWebView iWebView);
    }

    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    boolean canZoomIn();

    boolean canZoomOut();

    @Deprecated
    Picture capturePicture();

    void clearCache(boolean z);

    void clearFormData();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    WebBackForwardList copyBackForwardListInner();

    Object createWebMessageChannelInner();

    void destroy();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    void documentHasImages(Message message);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    void findAllAsync(String str);

    void findNext(boolean z);

    void flingScroll(int i, int i2);

    SslCertificate getCertificate();

    int getContentHeight();

    IWebViewExtension getExtension();

    Bitmap getFavicon();

    IHitTestResult getHitTestResultInner();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    String getOriginalUrl();

    IWebViewOverride getOverrideObject();

    int getProgress();

    float getScale();

    WebSettings getSettingsInner();

    String getTitle();

    String getUrl();

    View getView();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void invokeZoomPicker();

    boolean isHorizontalScrollBarEnabled();

    boolean isVerticalScrollBarEnabled();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    InputConnection onCreateInputConnection(EditorInfo editorInfo);

    void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent);

    void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo);

    void onPause();

    void onResume();

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void pauseTimers();

    boolean performAccessibilityAction(int i, Bundle bundle);

    void postUrl(String str, byte[] bArr);

    void postVisualStateCallback(long j, WebView.VisualStateCallback visualStateCallback);

    void postWebMessageInner(WebMessage webMessage, Uri uri);

    void reload();

    void removeJavascriptInterface(String str);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    WebBackForwardList restoreStateInner(Bundle bundle);

    void resumeTimers();

    WebBackForwardList saveStateInner(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback);

    void setBackgroundColor(int i);

    void setDownloadListener(DownloadListener downloadListener);

    void setFindListener(WebView.FindListener findListener);

    void setHorizontalScrollBarEnabled(boolean z);

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    void setInitialScale(int i);

    void setLayerType(int i, Paint paint);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setNetworkAvailable(boolean z);

    void setOnKeyListener(View.OnKeyListener onKeyListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setOverScrollMode(int i);

    void setOverrideObject(IWebViewOverride iWebViewOverride);

    void setScrollBarStyle(int i);

    void setVerticalScrollBarEnabled(boolean z);

    void setVerticalScrollbarOverlay(boolean z);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    void superComputeScroll();

    void superDestroy();

    boolean superDispatchTouchEvent(MotionEvent motionEvent);

    void superDraw(Canvas canvas);

    void superOnConfigurationChanged(Configuration configuration);

    void superOnScrollChanged(int i, int i2, int i3, int i4);

    void superOnVisibilityChanged(View view, int i);

    boolean superOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    void superRequestLayout();

    void superSetVisibility(int i);

    void updateContext(Context context);

    void zoomBy(float f);

    boolean zoomIn();

    boolean zoomOut();
}
