package com.uc.webview.export;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.b;
import com.uc.webview.base.io.c;
import com.uc.webview.base.task.d;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.base.timing.a;
import com.uc.webview.export.extension.Sdk2CoreHost;
import com.uc.webview.export.extension.StorageUtils;
import com.uc.webview.export.extension.UCExtension;
import com.uc.webview.internal.android.WebViewAndroid;
import com.uc.webview.internal.e;
import com.uc.webview.internal.f;
import com.uc.webview.internal.interfaces.IPlatformPort;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.uc.webview.internal.interfaces.IWebViewOverride;
import com.uc.webview.internal.setup.l;
import com.uc.webview.internal.setup.o;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebView extends FrameLayout implements IWebViewOverride {
    public static final int CORE_TYPE_ANDROID = 2;
    public static final int CORE_TYPE_INVALID = 0;
    public static final int CORE_TYPE_U3 = 1;
    public static final int CORE_TYPE_U4 = 3;
    public static final int CREATE_FLAG_FORCE_USING_SYSTEM = 2;
    public static final int CREATE_FLAG_QUICK = 1;
    @Deprecated
    public static final int CREATE_FLAG_USE_BACKUP_RENDER = 1024;
    @Deprecated
    public static final int CREATE_FLAG_USE_BACKUP_RENDER_IF_READY = 2048;
    @Deprecated
    public static final int CREATE_FLAG_USE_ISOLATE_RENDER = 4096;
    public static final int DEFAULT_CORE_TYPE = 1;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";
    private static final String TAG = "WebView";
    private static final int UPLOAD_SAMPLING_RATE = 1;
    private static boolean sIsFirstU4Created;
    private static Boolean sIsSupportWebViewCoreDraw;
    private static final Random sRandom = new Random();
    private int mCoreType;
    private boolean mDestroied;
    private RuntimeException mDestroyException;
    private boolean mIsDraw;
    private WebSettings mSettings;
    private f mStatusMonitor;
    private UCExtension mUCExtension;
    protected IWebView mWebView;
    private final Looper mWebViewThread;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface FindListener {
        void onFindResultReceived(int i, int i2, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class HitTestResult {
        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;
        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        private IWebView.IHitTestResult mHitTestResult;

        public String getExtra() {
            return this.mHitTestResult.getExtra();
        }

        public int getType() {
            return this.mHitTestResult.getType();
        }

        public IWebView.IHitTestResult innerResult() {
            return this.mHitTestResult;
        }

        public HitTestResult() {
        }

        private HitTestResult(IWebView.IHitTestResult iHitTestResult) {
            this.mHitTestResult = iHitTestResult;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class VisualStateCallback {
        public abstract void onComplete(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class WebViewTransport {
        private WebView mWebview;

        public WebViewTransport() {
        }

        public synchronized WebView getWebView() {
            return this.mWebview;
        }

        public synchronized void setWebView(WebView webView) {
            this.mWebview = webView;
        }
    }

    public WebView(Context context) throws RuntimeException {
        this(context, null, 16842885, false, false, false);
    }

    public static <T extends WebView> void asyncNew(final Class<T> cls, final Class<?>[] clsArr, final Object[] objArr, final ValueCallback<Pair<T, Throwable>> valueCallback) {
        d.a("asyncNew", new Runnable() { // from class: com.uc.webview.export.WebView.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    final Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
                    declaredConstructor.setAccessible(true);
                    Handler handler = new Handler(Looper.getMainLooper());
                    Runnable runnable = new Runnable() { // from class: com.uc.webview.export.WebView.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                valueCallback.onReceiveValue(new Pair((WebView) declaredConstructor.newInstance(objArr), null));
                            } catch (Throwable th) {
                                valueCallback.onReceiveValue(new Pair(null, th));
                            }
                        }
                    };
                    if (o.b().f() && WebView.getCoreType() == 0) {
                        throw new RuntimeException("coreType is not valid. init maybe failed.");
                    }
                    handler.postAtFrontOfQueue(runnable);
                } catch (Throwable th) {
                    valueCallback.onReceiveValue(new Pair(null, th));
                }
            }
        });
    }

    @Deprecated
    private static int calcRenderStrategy(int i) {
        int i2;
        if ((i & 2048) == 2048) {
            i2 = 3;
        } else if ((i & 1024) == 1024) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if ((i & 4096) == 4096) {
            return i2 | 256;
        }
        return i2;
    }

    private void checkIfDestroyed() {
        if (this.mWebView != null) {
            return;
        }
        if (this.mDestroyException != null) {
            throw new IllegalStateException("WebView had destroyed,forbid it's interfaces to be called.", this.mDestroyException);
        }
        throw new IllegalStateException("WebView had destroyed,forbid it's interfaces to be called.");
    }

    public static void clearClientCertPreferences(Runnable runnable) {
        if (getCoreType() == 2) {
            try {
                android.webkit.WebView.clearClientCertPreferences(runnable);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Sdk2CoreHost.impl().clearClientCertPreferences(runnable);
        }
    }

    public static int createAdditionFlags(boolean z, boolean z2, int i) {
        int i2 = z ? 2 : 0;
        if (z2) {
            i2 |= 1;
        }
        return i2 | i;
    }

    @Deprecated
    private Map<String, Object> createAdditionalParams(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("renderProcStrategy", Integer.valueOf(calcRenderStrategy(i)));
        return hashMap;
    }

    private static void dumpChildTree(View view, String str) {
        Log.e(TAG, str + view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            try {
                int childCount = viewGroup.getChildCount();
                Log.e(TAG, str + " [child count " + childCount + "]");
                for (int i = 0; i < childCount; i++) {
                    dumpChildTree(viewGroup.getChildAt(i), "  ".concat(String.valueOf(str)));
                }
            } catch (Throwable th) {
                Log.e(TAG, str + "exception " + th);
            }
        }
    }

    public static void enableSlowWholeDocumentDraw() {
        String str;
        if (e.e()) {
            str = "android.webkit.WebView";
        } else {
            str = "com.uc.aosp.android.webkit.WebView";
        }
        com.uc.webview.base.f.a(str, "enableSlowWholeDocumentDraw");
    }

    public static int getCoreType() {
        return e.a();
    }

    private void printStackTraceIfInDraw() {
        if (this.mIsDraw) {
            new RuntimeException("add or remove view in export.WebView.draw").printStackTrace();
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z) {
        if (getCoreType() == 2) {
            try {
                android.webkit.WebView.setWebContentsDebuggingEnabled(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Sdk2CoreHost.impl().setWebContentsDebuggingEnabled(z);
        }
    }

    private void updateContext(Context context) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.updateContext(context);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        checkIfDestroyed();
        this.mWebView.addJavascriptInterface(obj, str);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        printStackTraceIfInDraw();
        super.addView(view, layoutParams);
    }

    public boolean canGoBack() {
        checkIfDestroyed();
        return this.mWebView.canGoBack();
    }

    public boolean canGoBackOrForward(int i) {
        checkIfDestroyed();
        return this.mWebView.canGoBackOrForward(i);
    }

    public boolean canGoForward() {
        checkIfDestroyed();
        return this.mWebView.canGoForward();
    }

    @Deprecated
    public boolean canZoomIn() {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            return iWebView.canZoomIn();
        }
        return false;
    }

    @Deprecated
    public boolean canZoomOut() {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            return iWebView.canZoomOut();
        }
        return false;
    }

    @Deprecated
    public Picture capturePicture() {
        checkIfDestroyed();
        return this.mWebView.capturePicture();
    }

    public void clearCache(boolean z) {
        checkIfDestroyed();
        this.mWebView.clearCache(z);
    }

    public void clearFormData() {
        checkIfDestroyed();
        this.mWebView.clearFormData();
    }

    public void clearHistory() {
        checkIfDestroyed();
        this.mWebView.clearHistory();
    }

    public void clearMatches() {
        checkIfDestroyed();
        this.mWebView.clearMatches();
    }

    public void clearSslPreferences() {
        checkIfDestroyed();
        this.mWebView.clearSslPreferences();
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
    }

    public WebBackForwardList copyBackForwardList() {
        checkIfDestroyed();
        return this.mWebView.copyBackForwardListInner();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreComputeScroll() {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superComputeScroll();
        }
    }

    public void coreDestroy() {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superDestroy();
        }
    }

    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            return iWebView.superDispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void coreDraw(Canvas canvas) {
        IWebView iWebView;
        if (sIsSupportWebViewCoreDraw == Boolean.FALSE && (iWebView = this.mWebView) != null) {
            iWebView.superDraw(canvas);
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnConfigurationChanged(Configuration configuration) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superOnConfigurationChanged(configuration);
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreOnInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        }
    }

    public boolean coreOnInterceptTouchEvent(MotionEvent motionEvent) {
        UCExtension uCExtension;
        try {
            uCExtension = this.mUCExtension;
        } catch (Throwable th) {
            com.uc.webview.base.Log.d(TAG, "coreOnInterceptTouchEvent failed", th);
        }
        if (uCExtension != null) {
            return ((Boolean) uCExtension.impl().invoke(IWebViewExtension.IExtenderID.WEBVIEW_ON_INTERCEPT_TOUCH_EVENT, new Object[]{motionEvent})).booleanValue();
        }
        IWebView iWebView = this.mWebView;
        if (iWebView instanceof WebViewAndroid) {
            return ((WebViewAndroid) iWebView).onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void coreOnOverScrolled(int i, int i2, boolean z, boolean z2) {
        try {
            UCExtension uCExtension = this.mUCExtension;
            if (uCExtension != null) {
                uCExtension.impl().invoke(IWebViewExtension.IExtenderID.WEBVIEW_ON_OVER_SCROLLED, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2)});
                return;
            }
            IWebView iWebView = this.mWebView;
            if (iWebView instanceof WebViewAndroid) {
                ((WebViewAndroid) iWebView).superOnOverScrolled(i, i2, z, z2);
            }
        } catch (Throwable th) {
            com.uc.webview.base.Log.d(TAG, "coreOnOverScrolled failed", th);
        }
    }

    public void coreOnScrollChanged(int i, int i2, int i3, int i4) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superOnScrollChanged(i, i2, i3, i4);
        }
    }

    public boolean coreOnTouchEvent(MotionEvent motionEvent) {
        UCExtension uCExtension;
        try {
            uCExtension = this.mUCExtension;
        } catch (Throwable th) {
            com.uc.webview.base.Log.d(TAG, "coreOnTouchEvent failed", th);
        }
        if (uCExtension != null) {
            return ((Boolean) uCExtension.impl().invoke(IWebViewExtension.IExtenderID.WEBVIEW_ON_TOUCH_EVENT, new Object[]{motionEvent})).booleanValue();
        }
        IWebView iWebView = this.mWebView;
        if (iWebView instanceof WebViewAndroid) {
            return ((WebViewAndroid) iWebView).onTouchEvent(motionEvent);
        }
        return false;
    }

    public void coreOnVisibilityChanged(View view, int i) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superOnVisibilityChanged(view, i);
        }
    }

    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            return iWebView.superOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean corePerformAccessibilityAction(int i, Bundle bundle) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            return iWebView.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreRequestLayout() {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superRequestLayout();
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreSetVisibility(int i) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.superSetVisibility(i);
        }
    }

    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        UCExtension uCExtension;
        if (!e.f() || (uCExtension = this.mUCExtension) == null) {
            return null;
        }
        return uCExtension.impl().createPrintDocumentAdapter(str);
    }

    public WebMessagePort[] createWebMessageChannel() {
        checkIfDestroyed();
        Object createWebMessageChannelInner = this.mWebView.createWebMessageChannelInner();
        if (createWebMessageChannelInner instanceof WebMessagePort[]) {
            return (WebMessagePort[]) createWebMessageChannelInner;
        }
        return null;
    }

    public void destroy() {
        AtomicInteger atomicInteger;
        synchronized (this) {
            try {
                if (this.mDestroied) {
                    Log.e(TAG, "Webview.destroy again", new RuntimeException("Webview.destroy() already called."));
                    return;
                }
                this.mDestroied = true;
                this.mDestroyException = new RuntimeException("This is the stack of destroying WebView, isAttachedToWindow:".concat(String.valueOf(isAttachedToWindow())));
                f fVar = this.mStatusMonitor;
                IWebView iWebView = this.mWebView;
                com.uc.webview.base.Log.d("WebViewStatusMonitor", "onDestroy webview: " + f.a(iWebView));
                if (fVar.c) {
                    atomicInteger = f.b;
                } else {
                    atomicInteger = f.f14373a;
                }
                atomicInteger.decrementAndGet();
                f.b();
                this.mStatusMonitor = null;
                this.mWebView.destroy();
                this.mWebView = null;
                this.mSettings = null;
                this.mUCExtension = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        checkIfDestroyed();
        return this.mWebView.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void documentHasImages(Message message) {
        checkIfDestroyed();
        this.mWebView.documentHasImages(message);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isDestroied()) {
            try {
                if (sIsSupportWebViewCoreDraw == Boolean.TRUE) {
                    coreDraw(canvas);
                }
                this.mIsDraw = true;
                super.draw(canvas);
                this.mIsDraw = false;
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        checkIfDestroyed();
        this.mWebView.evaluateJavascript(str, valueCallback);
    }

    public void findAllAsync(String str) {
        checkIfDestroyed();
        this.mWebView.findAllAsync(str);
    }

    public void findNext(boolean z) {
        checkIfDestroyed();
        this.mWebView.findNext(z);
    }

    public void flingScroll(int i, int i2) {
        checkIfDestroyed();
        this.mWebView.flingScroll(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return WebView.class.getName();
    }

    public SslCertificate getCertificate() {
        checkIfDestroyed();
        return this.mWebView.getCertificate();
    }

    public int getContentHeight() {
        checkIfDestroyed();
        return this.mWebView.getContentHeight();
    }

    public View getCoreView() {
        checkIfDestroyed();
        return this.mWebView.getView();
    }

    public int getCurrentViewCoreType() {
        return this.mCoreType;
    }

    public Bitmap getFavicon() {
        checkIfDestroyed();
        return this.mWebView.getFavicon();
    }

    public HitTestResult getHitTestResult() {
        checkIfDestroyed();
        if (this.mWebView.getHitTestResultInner() != null) {
            return new HitTestResult(this.mWebView.getHitTestResultInner());
        }
        return null;
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        checkIfDestroyed();
        return this.mWebView.getHttpAuthUsernamePassword(str, str2);
    }

    public String getOriginalUrl() {
        checkIfDestroyed();
        return this.mWebView.getOriginalUrl();
    }

    public int getProgress() {
        checkIfDestroyed();
        return this.mWebView.getProgress();
    }

    @Deprecated
    public float getScale() {
        checkIfDestroyed();
        return this.mWebView.getScale();
    }

    public WebSettings getSettings() {
        checkIfDestroyed();
        return this.mSettings;
    }

    public String getTitle() {
        checkIfDestroyed();
        return this.mWebView.getTitle();
    }

    public UCExtension getUCExtension() {
        return this.mUCExtension;
    }

    public String getUrl() {
        checkIfDestroyed();
        checkThread();
        return this.mWebView.getUrl();
    }

    public void goBack() {
        checkIfDestroyed();
        this.mWebView.goBack();
    }

    public void goBackOrForward(int i) {
        checkIfDestroyed();
        this.mWebView.goBackOrForward(i);
    }

    public void goForward() {
        checkIfDestroyed();
        this.mWebView.goForward();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void invokeZoomPicker() {
        checkIfDestroyed();
        this.mWebView.invokeZoomPicker();
    }

    public boolean isDestroied() {
        if (this.mDestroied || this.mWebView == null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isHorizontalScrollBarEnabled() {
        checkIfDestroyed();
        return this.mWebView.isHorizontalScrollBarEnabled();
    }

    public boolean isPrivateBrowsingEnabled() {
        return false;
    }

    @Override // android.view.View
    public boolean isVerticalScrollBarEnabled() {
        checkIfDestroyed();
        return this.mWebView.isVerticalScrollBarEnabled();
    }

    public void loadData(String str, String str2, String str3) {
        TraceEvent scoped = TraceEvent.scoped("export.WebView.loadData");
        try {
            checkIfDestroyed();
            this.mWebView.loadData(str, str2, str3);
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        TraceEvent scoped = TraceEvent.scoped("export.WebView.loadDataWithBaseURL");
        try {
            checkIfDestroyed();
            this.mWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void loadUrl(String str) {
        TraceEvent scoped = TraceEvent.scoped("export.WebView.loadUrl");
        try {
            checkIfDestroyed();
            checkThread();
            this.mWebView.loadUrl(str);
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mStatusMonitor != null) {
            f.b(this.mWebView);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            return iWebView.onCreateInputConnection(editorInfo);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        invalidate();
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mStatusMonitor != null) {
            f.c(this.mWebView);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent == null || (motionEvent.getSource() & 8194) != 8194) {
            return onInterceptTouchEvent;
        }
        return false;
    }

    public void onPause() {
        checkIfDestroyed();
        this.mWebView.onPause();
    }

    public void onResume() {
        checkIfDestroyed();
        this.mWebView.onResume();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IPlatformPort a2;
        super.onSizeChanged(i, i2, i3, i4);
        f fVar = this.mStatusMonitor;
        if (fVar != null) {
            IWebView iWebView = this.mWebView;
            if (fVar.d != i || fVar.e != i2) {
                com.uc.webview.base.Log.d("WebViewStatusMonitor", "onSizeChanged webview: " + f.a(iWebView));
                fVar.d = i;
                fVar.e = i2;
                if (fVar.c && (a2 = f.a()) != null) {
                    a2.onWindowSizeChanged();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.mStatusMonitor != null) {
            f.a(this.mWebView, i);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public boolean pageDown(boolean z) {
        checkIfDestroyed();
        return this.mWebView.pageDown(z);
    }

    public boolean pageUp(boolean z) {
        checkIfDestroyed();
        return this.mWebView.pageUp(z);
    }

    public void pauseTimers() {
        checkIfDestroyed();
        this.mWebView.pauseTimers();
    }

    public void postUrl(String str, byte[] bArr) {
        checkIfDestroyed();
        this.mWebView.postUrl(str, bArr);
    }

    public void postVisualStateCallback(long j, VisualStateCallback visualStateCallback) {
        this.mWebView.postVisualStateCallback(j, visualStateCallback);
    }

    public void postWebMessage(WebMessage webMessage, Uri uri) {
        checkIfDestroyed();
        this.mWebView.postWebMessageInner(webMessage, uri);
    }

    public void reload() {
        checkIfDestroyed();
        this.mWebView.reload();
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        printStackTraceIfInDraw();
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        printStackTraceIfInDraw();
        super.removeAllViewsInLayout();
    }

    public void removeJavascriptInterface(String str) {
        checkIfDestroyed();
        try {
            this.mWebView.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        printStackTraceIfInDraw();
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        printStackTraceIfInDraw();
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        printStackTraceIfInDraw();
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        printStackTraceIfInDraw();
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        printStackTraceIfInDraw();
        super.removeViewsInLayout(i, i2);
    }

    public void requestFocusNodeHref(Message message) {
        checkIfDestroyed();
        this.mWebView.requestFocusNodeHref(message);
    }

    public void requestImageRef(Message message) {
        checkIfDestroyed();
        this.mWebView.requestImageRef(message);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        checkIfDestroyed();
        return this.mWebView.restoreStateInner(bundle);
    }

    public void resumeTimers() {
        checkIfDestroyed();
        this.mWebView.resumeTimers();
    }

    public WebBackForwardList saveState(Bundle bundle) {
        checkIfDestroyed();
        return this.mWebView.saveStateInner(bundle);
    }

    public void saveWebArchive(String str) {
        checkIfDestroyed();
        this.mWebView.saveWebArchive(str);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.setBackgroundColor(i);
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        checkIfDestroyed();
        this.mWebView.setDownloadListener(downloadListener);
    }

    public void setFindListener(FindListener findListener) {
        checkIfDestroyed();
        this.mWebView.setFindListener(findListener);
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z) {
        checkIfDestroyed();
        this.mWebView.setHorizontalScrollBarEnabled(z);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        checkIfDestroyed();
        this.mWebView.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public void setInitialScale(int i) {
        checkIfDestroyed();
        this.mWebView.setInitialScale(i);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (getCoreView() != null && layoutParams.height < 0) {
            getCoreView().setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
        }
    }

    public void setNetworkAvailable(boolean z) {
        checkIfDestroyed();
        this.mWebView.setNetworkAvailable(z);
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        checkIfDestroyed();
        if (onKeyListener != null) {
            this.mWebView.setOnKeyListener(new View.OnKeyListener(onKeyListener) { // from class: com.uc.webview.export.WebView.3

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnKeyListener f14302a;
                private View.OnKeyListener c;

                {
                    this.f14302a = onKeyListener;
                    this.c = onKeyListener;
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (this.c == null) {
                        return false;
                    }
                    if (GlobalSettings.getBoolValue(101)) {
                        return this.c.onKey(WebView.this, i, keyEvent);
                    }
                    return this.c.onKey(view, i, keyEvent);
                }
            });
        } else {
            this.mWebView.setOnKeyListener(null);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        checkIfDestroyed();
        if (onLongClickListener != null) {
            this.mWebView.setOnLongClickListener(new View.OnLongClickListener(onLongClickListener) { // from class: com.uc.webview.export.WebView.1

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnLongClickListener f14300a;
                private View.OnLongClickListener c;

                {
                    this.f14300a = onLongClickListener;
                    this.c = onLongClickListener;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    if (this.c == null) {
                        return false;
                    }
                    if (GlobalSettings.getBoolValue(101)) {
                        return this.c.onLongClick(WebView.this);
                    }
                    return this.c.onLongClick(view);
                }
            });
        } else {
            this.mWebView.setOnLongClickListener(null);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        checkIfDestroyed();
        if (onTouchListener != null) {
            this.mWebView.setOnTouchListener(new View.OnTouchListener(onTouchListener) { // from class: com.uc.webview.export.WebView.2

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnTouchListener f14301a;
                private View.OnTouchListener c;

                {
                    this.f14301a = onTouchListener;
                    this.c = onTouchListener;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (this.c == null) {
                        return false;
                    }
                    if (GlobalSettings.getBoolValue(101)) {
                        return this.c.onTouch(WebView.this, motionEvent);
                    }
                    return this.c.onTouch(view, motionEvent);
                }
            });
        } else {
            this.mWebView.setOnTouchListener(null);
        }
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.setOverScrollMode(i);
        }
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i) {
        IWebView iWebView = this.mWebView;
        if (iWebView != null) {
            iWebView.setScrollBarStyle(i);
        }
        super.setScrollBarStyle(i);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        checkIfDestroyed();
        this.mWebView.setVerticalScrollBarEnabled(z);
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        checkIfDestroyed();
        this.mWebView.setVerticalScrollbarOverlay(z);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        checkIfDestroyed();
        this.mWebView.setWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        checkIfDestroyed();
        this.mWebView.setWebViewClient(webViewClient);
    }

    public void stopLoading() {
        checkIfDestroyed();
        this.mWebView.stopLoading();
    }

    public boolean zoomIn() {
        checkIfDestroyed();
        return this.mWebView.zoomIn();
    }

    public boolean zoomOut() {
        checkIfDestroyed();
        return this.mWebView.zoomOut();
    }

    public WebView(Context context, boolean z) throws RuntimeException {
        this(context, null, 16842885, false, z, false);
    }

    public static int createAdditionFlags(boolean z, boolean z2) {
        return createAdditionFlags(z, z2, 0);
    }

    public WebView(Context context, int i) {
        this(context, null, 16842885, false, i);
    }

    private void checkThread() {
        if (GlobalSettings.getBoolValue(82) && this.mWebViewThread != null && Looper.myLooper() != this.mWebViewThread && sRandom.nextInt(100) <= 0) {
            final Throwable th = new Throwable("WebView Method was called on invalid thread");
            d.a("wvcit", new Runnable() { // from class: com.uc.webview.export.WebView.5
                @Override // java.lang.Runnable
                public final void run() {
                    b.a aVar = new b.a("ucbsinit", th);
                    aVar.f14262a = false;
                    b.a(aVar);
                }
            }, 2000L);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        printStackTraceIfInDraw();
        super.addView(view, i);
    }

    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        checkIfDestroyed();
        this.mWebView.saveWebArchive(str, z, valueCallback);
    }

    public void zoomBy(float f) {
        checkIfDestroyed();
        double d = f;
        if (d < 0.01d) {
            throw new IllegalArgumentException("zoomFactor must be greater than 0.01.");
        } else if (d > 100.0d) {
            throw new IllegalArgumentException("zoomFactor must be less than 100.");
        } else if (getCurrentViewCoreType() == 2) {
            try {
                com.uc.webview.base.f.b(getCoreView(), "zoomBy", new Class[]{Float.TYPE}, new Object[]{Float.valueOf(f)});
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.mWebView.zoomBy(f);
        }
    }

    public WebView(Context context, AttributeSet attributeSet) throws RuntimeException {
        this(context, attributeSet, 16842885, false, false, false);
    }

    public WebView(Context context, AttributeSet attributeSet, boolean z) throws RuntimeException {
        this(context, attributeSet, 16842885, false, z, false);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        printStackTraceIfInDraw();
        super.addView(view, i, layoutParams);
    }

    public void loadHtmlData(String str, String str2) {
        if (str2 != null && str != null && !str2.isEmpty() && !str.isEmpty()) {
            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(str.getBytes()));
            HashMap hashMap = new HashMap();
            hashMap.put(str2, webResourceResponse);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(TBImageFlowMonitor.TTL_ERROR_MAX_AGE, "3600");
            hashMap2.put("isMainRes", "1");
            hashMap2.put("ignoreQuery", "2");
            hashMap2.put("useOnce", "1");
            StorageUtils.precacheResources(hashMap, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ignoreWebviewCache", "1");
            loadUrl(str2, hashMap3);
        }
    }

    public WebView(Context context, AttributeSet attributeSet, int i) throws RuntimeException {
        this(context, attributeSet, i, false, false, false);
    }

    public WebView(Context context, AttributeSet attributeSet, boolean z, int i) throws RuntimeException {
        this(context, attributeSet, i, false, z, false);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        printStackTraceIfInDraw();
        super.addView(view);
    }

    public void loadUrl(String str, Map<String, String> map) {
        TraceEvent scoped = TraceEvent.scoped("export.WebView.loadUrlWithHeaders");
        try {
            checkIfDestroyed();
            this.mWebView.loadUrl(str, map);
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public WebView(Context context, AttributeSet attributeSet, int i, boolean z) throws RuntimeException {
        this(context, attributeSet, i, false, false, false);
    }

    private WebView(Context context, AttributeSet attributeSet, int i, boolean z, boolean z2, boolean z3) throws RuntimeException {
        this(context, attributeSet, i, z, createAdditionFlags(z2, z3));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        printStackTraceIfInDraw();
        super.addView(view, i, i2);
    }

    private WebView(Context context, AttributeSet attributeSet, int i, boolean z, int i2) throws RuntimeException {
        super(context, attributeSet, i);
        a.c cVar;
        boolean z2 = false;
        this.mDestroied = false;
        this.mWebViewThread = Looper.myLooper();
        this.mDestroyException = null;
        this.mIsDraw = false;
        TraceEvent scoped = TraceEvent.scoped("export.WebView.<init>");
        try {
            if (!sIsFirstU4Created) {
                com.uc.webview.base.Log.rInfo("startup", "FIRST_EXPORT_WEBVIEW start");
                cVar = new a.c().a();
            } else {
                cVar = null;
            }
            boolean z3 = (i2 & 2) != 0;
            boolean z4 = (i2 & 1) != 0;
            Map<String, Object> createAdditionalParams = createAdditionalParams(i2);
            createAdditionalParams.put("createFlags", Integer.valueOf(i2));
            if (context != null) {
                e.b a2 = e.a(context, this, attributeSet, z3, z4, createAdditionalParams);
                this.mWebView = a2.b;
                this.mSettings = a2.d;
                this.mStatusMonitor = a2.c;
                UCExtension uCExtension = a2.e;
                this.mUCExtension = uCExtension;
                this.mCoreType = a2.f14372a;
                if (sIsSupportWebViewCoreDraw == null) {
                    if (uCExtension != null) {
                        Boolean bool = (Boolean) uCExtension.impl().invoke(3, null);
                        sIsSupportWebViewCoreDraw = bool;
                        if (bool == null) {
                            sIsSupportWebViewCoreDraw = Boolean.FALSE;
                        }
                    } else {
                        sIsSupportWebViewCoreDraw = Boolean.TRUE;
                    }
                }
                if (attributeSet == null) {
                    addView(this.mWebView.getView(), new FrameLayout.LayoutParams(-1, -1));
                } else {
                    addView(this.mWebView.getView());
                }
                UCExtension uCExtension2 = this.mUCExtension;
                if (uCExtension2 != null) {
                    uCExtension2.impl().placeRenderView(this);
                    this.mUCExtension.getUCSettings().setExportWebViewHashCode(hashCode());
                }
                if (!EnvInfo.b()) {
                    setWillNotDraw(false);
                }
                f fVar = this.mStatusMonitor;
                IWebView iWebView = this.mWebView;
                com.uc.webview.base.Log.d("WebViewStatusMonitor", "onCreate webview: " + f.a(iWebView));
                (fVar.c ? f.b : f.f14373a).incrementAndGet();
                f.b();
                if (fVar.c) {
                    final f.a aVar = f.f;
                    if (!aVar.f14374a.getAndSet(true)) {
                        com.uc.webview.base.Log.d("WebViewStatusMonitor", "onFirstCreateU4WebViewFinished");
                        d.a("fU4Wv", new Runnable() { // from class: com.uc.webview.internal.f.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                o b = o.b();
                                if (b.f14486a.a(16384, "FIRST_U4WV", false)) {
                                    com.uc.webview.internal.stats.b.a(false);
                                }
                                try {
                                    l g = b.g();
                                    c u = g != null ? g.u() : null;
                                    if (u != null) {
                                        u.a();
                                    }
                                } catch (Throwable th) {
                                    com.uc.webview.base.Log.d("WebViewStatusMonitor", "markFirstU4WvFin failed", th);
                                }
                            }
                        });
                    }
                }
                if (!sIsFirstU4Created) {
                    z2 = 3 == this.mCoreType ? true : z2;
                    if (z2) {
                        sIsFirstU4Created = true;
                        if (cVar != null) {
                            a.a(cVar.b());
                        }
                    }
                    StringBuilder sb = new StringBuilder("FIRST_EXPORT_WEBVIEW finish ");
                    sb.append(z2 ? "u4" : "sys");
                    com.uc.webview.base.Log.rInfo("startup", sb.toString());
                }
                if (scoped != null) {
                    scoped.close();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid context argument");
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
