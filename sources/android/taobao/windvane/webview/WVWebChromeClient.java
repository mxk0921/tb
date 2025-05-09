package android.taobao.windvane.webview;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lqw;
import tb.t2o;
import tb.trw;
import tb.urw;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MAX_QUOTA = 20971520;
    private static final String TAG = "WVWebChromeClient";
    public Context mContext;
    public WebChromeClient extraWebChromeClient = null;
    public IWVWebView mWebView = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(989856475);
    }

    public WVWebChromeClient() {
    }

    public static /* synthetic */ Object ipc$super(WVWebChromeClient wVWebChromeClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -634514222) {
            return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
        }
        if (hashCode == 14073824) {
            super.onGeolocationPermissionsShowPrompt((String) objArr[0], (GeolocationPermissions.Callback) objArr[1]);
            return null;
        } else if (hashCode == 384496945) {
            super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/windvane/webview/WVWebChromeClient");
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e57272c", new Object[]{this, str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater});
        } else if (j2 < MAX_QUOTA) {
            quotaUpdater.updateQuota(j2);
        } else {
            quotaUpdater.updateQuota(j);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
        } else {
            super.onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bfe0", new Object[]{this, str, callback});
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
    }

    public WVWebChromeClient(Context context) {
        this.mContext = context;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        if (lqw.d().e(2001).f22859a) {
            return true;
        }
        String message = consoleMessage.message();
        if (!TextUtils.isEmpty(message) && message.startsWith("hybrid://")) {
            v7t.d(TAG, "Call from console.log");
            if (this.mWebView != null) {
                WVJsBridge.g().b(this.mWebView, message);
                return true;
            }
        }
        if (message == null || !message.startsWith("wvNativeCallback")) {
            if (v7t.h()) {
                int i = a.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[consoleMessage.messageLevel().ordinal()];
                if (i == 1) {
                    v7t.p(TAG, "onConsoleMessage: %s at %s: %s", consoleMessage.message(), consoleMessage.sourceId(), String.valueOf(consoleMessage.lineNumber()));
                } else if (i != 2) {
                    v7t.c(TAG, "onConsoleMessage: %s at %s: %s", consoleMessage.message(), consoleMessage.sourceId(), String.valueOf(consoleMessage.lineNumber()));
                } else {
                    v7t.f(TAG, "onConsoleMessage: %s at %s: %s", consoleMessage.message(), consoleMessage.sourceId(), String.valueOf(consoleMessage.lineNumber()));
                    if (trw.getWvJsErrorMonitorInterface() != null) {
                        trw.getWvJsErrorMonitorInterface().onOccurJsError(consoleMessage.sourceId(), consoleMessage.message(), null);
                    }
                }
            }
            WebChromeClient webChromeClient = this.extraWebChromeClient;
            if (webChromeClient != null) {
                return webChromeClient.onConsoleMessage(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }
        String substring = message.substring(message.indexOf("/") + 1);
        int indexOf = substring.indexOf("/");
        String substring2 = substring.substring(0, indexOf);
        String substring3 = substring.substring(indexOf + 1);
        ValueCallback<String> b = urw.b(substring2);
        if (b != null) {
            b.onReceiveValue(substring3);
            urw.a(substring2);
        } else {
            v7t.d(TAG, "NativeCallback failed: " + substring3);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfc92fda", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
        }
        if (v7t.h()) {
            v7t.k(TAG, "onJsPrompt: %s; defaultValue: %s; url: %s", str2, str3, str);
        }
        if ((webView instanceof IWVWebView) && lqw.d().f(2003, (IWVWebView) webView, str, str2, str3, jsPromptResult).f22859a) {
            return true;
        }
        if (str3 == null || !str3.equals("wv_hybrid:")) {
            WebChromeClient webChromeClient = this.extraWebChromeClient;
            if (webChromeClient != null) {
                return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            return false;
        }
        v7t.d(TAG, "Call from console.prompt");
        WVJsBridge.g().b((WVWebView) webView, str2);
        jsPromptResult.confirm("");
        return true;
    }
}
