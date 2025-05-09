package com.taobao.android.lightvane.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.jsbridge.LVBridgeEngine;
import tb.ajc;
import tb.f7l;
import tb.geg;
import tb.i1x;
import tb.ifg;
import tb.k84;
import tb.keg;
import tb.neg;
import tb.t2o;
import tb.ueg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LVWebView extends WebView implements ajc, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LVWebView";
    public ueg entryManager;
    private Handler mainHandler;
    private ifg uiModel;
    private LVWebChromeClient webChromeClient;
    private LVWebViewClient webViewClient;
    private Long nativeCallbackId = 1000L;
    private Long onErrorTime = 0L;
    private boolean evaluateJavascriptSupported = true;

    static {
        t2o.a(507510824);
        t2o.a(507510819);
    }

    public LVWebView(Context context) {
        super(context);
        initInternal();
    }

    private void initInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6745f4", new Object[]{this});
            return;
        }
        this.mainHandler = new Handler(Looper.getMainLooper(), this);
        LVWebViewClient lVWebViewClient = new LVWebViewClient(getContext());
        this.webViewClient = lVWebViewClient;
        setWebViewClient(lVWebViewClient);
        LVWebChromeClient lVWebChromeClient = new LVWebChromeClient(getContext());
        this.webChromeClient = lVWebChromeClient;
        setWebChromeClient(lVWebChromeClient);
        this.uiModel = new ifg(getContext(), this);
        i1x.b(getContext(), this);
        configWebSettings();
        this.entryManager = new ueg(getContext(), this);
        addJavascriptInterface(new LVBridgeEngine(this), "__lightvane__");
        try {
            if (k84.b(getContext())) {
                keg.a(TAG, "enable web contents debug");
                WebView.setWebContentsDebuggingEnabled(true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(LVWebView lVWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1312899459:
                super.evaluateJavascript((String) objArr[0], (ValueCallback) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightvane/webview/LVWebView");
        }
    }

    private void script2NativeCallback(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5868cd3a", new Object[]{this, str, valueCallback});
            return;
        }
        Long valueOf = Long.valueOf(this.nativeCallbackId.longValue() + 1);
        this.nativeCallbackId = valueOf;
        neg.c(String.valueOf(valueOf), valueCallback);
        loadUrl("javascript:console.log('lvNativeCallback/" + valueOf + "/'+function(){var s = " + str + "; return (typeof s === 'object' ? JSON.stringify(s) : typeof s === 'string' ? '\"' + s + '\"' : s);}())");
    }

    public void addJsObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            return;
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            uegVar.a(str, obj);
        }
    }

    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!canGoBack()) {
            return false;
        }
        goBack();
        return true;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            uegVar.d();
        }
        super.destroy();
    }

    @Override // tb.ajc
    public void evaluateJavascript(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
        } else if (str != null) {
            evaluateJavascript(str, null);
        }
    }

    @Override // tb.ajc
    public Object getJsObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            return uegVar.b(str);
        }
        return null;
    }

    public String getUserAgentString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this});
        }
        return getSettings().getUserAgentString();
    }

    @Override // tb.ajc
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            uegVar.c(i, i2, intent);
        }
    }

    public void onMessage(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf50210", new Object[]{this, new Integer(i), obj});
        } else if (this.mainHandler != null) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.mainHandler.sendMessage(obtain);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            uegVar.e();
        }
        super.onPause();
    }

    @Override // android.webkit.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            uegVar.f();
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ueg uegVar = this.entryManager;
        if (uegVar != null) {
            uegVar.g(i, i2, i3, i4);
        }
        try {
            super.onScrollChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            reload();
        }
    }

    public void setUserAgentString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
        } else {
            getSettings().setUserAgentString(str);
        }
    }

    private void configWebSettings() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        String str = geg.b;
        String str2 = geg.c;
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                userAgentString = userAgentString + " AliApp(" + str + "/" + str2 + f7l.BRACKET_END_STR;
            }
            if (!userAgentString.contains("TTID/") && !TextUtils.isEmpty(geg.f19928a)) {
                userAgentString = userAgentString + " TTID/" + geg.f19928a;
            }
        }
        settings.setUserAgentString(userAgentString + geg.DEFAULT_UA);
        settings.setCacheMode(-1);
        int i = Build.VERSION.SDK_INT;
        settings.setDatabaseEnabled(false);
        String str3 = "/data/data/" + getContext().getPackageName() + "/databases";
        settings.setDatabasePath(str3);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(str3);
        settings.setDomStorageEnabled(true);
        if (i < 33) {
            try {
                settings.getClass().getMethod("setAppCacheEnabled", Boolean.TYPE).invoke(settings, Boolean.TRUE);
                Context context = getContext();
                if (!(context == null || context.getCacheDir() == null)) {
                    settings.getClass().getMethod("setAppCachePath", String.class).invoke(settings, context.getCacheDir().getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        settings.setTextZoom(100);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
            return;
        }
        if (str != null && str.length() > 10 && "javascript:".equals(str.substring(0, 11).toLowerCase())) {
            str = str.substring(11);
        }
        if (this.evaluateJavascriptSupported) {
            try {
                super.evaluateJavascript(str, valueCallback);
            } catch (IllegalStateException unused) {
                this.evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            } catch (NoSuchMethodError unused2) {
                this.evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            }
        } else if (valueCallback == null) {
            loadUrl("javascript:" + str);
        } else {
            script2NativeCallback(str, valueCallback);
        }
    }

    public LVWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initInternal();
    }

    public LVWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initInternal();
    }
}
