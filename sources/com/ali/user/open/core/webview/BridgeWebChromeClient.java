package com.ali.user.open.core.webview;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ali.user.open.core.model.SystemMessageConstants;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BridgeWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = BridgeWebChromeClient.class.getSimpleName();
    private static boolean evaluateJavascriptSupported = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class JavaScriptTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String script;
        public WebView webView;

        static {
            t2o.a(71303272);
        }

        public JavaScriptTask(WebView webView, String str) {
            this.webView = webView;
            this.script = str;
            if (webView != null) {
                try {
                    webView.getSettings().setSavePassword(false);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (BridgeWebChromeClient.access$000()) {
                    try {
                        this.webView.evaluateJavascript(this.script, null);
                        return;
                    } catch (Exception e) {
                        SDKLogger.e("ui", "fail to evaluate the script " + e.getMessage(), e);
                    }
                }
                String str = "javascript:" + this.script;
                WebView webView = this.webView;
                if (webView instanceof MemberWebView) {
                    ((MemberWebView) webView).loadUrl(str);
                } else {
                    webView.loadUrl(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        t2o.a(71303271);
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return evaluateJavascriptSupported;
    }

    public static /* synthetic */ Object ipc$super(BridgeWebChromeClient bridgeWebChromeClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/BridgeWebChromeClient");
    }

    private HavanaBridgeProtocal parseMessage(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HavanaBridgeProtocal) ipChange.ipc$dispatch("ca6d986a", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        int port = parse.getPort();
        String lastPathSegment = parse.getLastPathSegment();
        parse.getQuery();
        int indexOf = str.indexOf("?");
        if (indexOf == -1) {
            str2 = null;
        } else {
            str2 = str.substring(indexOf + 1);
        }
        HavanaBridgeProtocal havanaBridgeProtocal = new HavanaBridgeProtocal();
        havanaBridgeProtocal.methodName = lastPathSegment;
        havanaBridgeProtocal.objName = host;
        havanaBridgeProtocal.param = str2;
        havanaBridgeProtocal.requestId = port;
        return havanaBridgeProtocal;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1269980", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        return false;
    }

    private void handleWindVaneNoHandler(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f066758b", new Object[]{this, webView, str});
            return;
        }
        try {
            int indexOf = str.indexOf(58, 9);
            String substring = str.substring(indexOf + 1, str.indexOf(47, indexOf));
            webView.post(new JavaScriptTask(webView, "window.WindVane&&window.WindVane.onFailure(" + substring + ",'{\"ret\":\"HY_NO_HANDLER\"');"));
        } catch (Exception e) {
            SDKLogger.e("ui", "fail to handler windvane request, the error message is " + e.getMessage(), e);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String str4;
        if (str3 == null) {
            return false;
        }
        String str5 = TAG;
        SDKLogger.d(str5, "onJsPrompt() called with: view = [" + webView + "], url = [" + str + "], message = [" + str2 + "], defaultValue = [" + str3 + "], result = [" + jsPromptResult + "]");
        if (str3.equals("wv_hybrid:")) {
            handleWindVaneNoHandler(webView, str2);
            jsPromptResult.confirm("");
            return true;
        } else if (!TextUtils.equals(str3, "hv_hybrid:") || !(webView instanceof MemberWebView)) {
            return false;
        } else {
            MemberWebView memberWebView = (MemberWebView) webView;
            HavanaBridgeProtocal parseMessage = parseMessage(str2);
            BridgeCallbackContext bridgeCallbackContext = new BridgeCallbackContext();
            bridgeCallbackContext.requestId = parseMessage.requestId;
            bridgeCallbackContext.webView = memberWebView;
            Object bridgeObj = memberWebView.getBridgeObj(parseMessage.objName);
            if (bridgeObj == null) {
                SDKLogger.e(str5, parseMessage.objName + " JS_BRIDGE_MODULE_NOT_FOUND");
                bridgeCallbackContext.onFailure(10000, parseMessage.objName);
                jsPromptResult.confirm("");
                return true;
            }
            try {
                Method method = bridgeObj.getClass().getMethod(parseMessage.methodName, BridgeCallbackContext.class, String.class);
                if (method.isAnnotationPresent(BridgeMethod.class)) {
                    try {
                        if (TextUtils.isEmpty(parseMessage.param)) {
                            str4 = "{}";
                        } else {
                            str4 = parseMessage.param;
                        }
                        method.invoke(bridgeObj, bridgeCallbackContext, str4);
                    } catch (Exception e) {
                        SDKLogger.e(TAG, e.toString());
                        bridgeCallbackContext.onFailure(10010, e.getMessage());
                    }
                } else {
                    SDKLogger.e(str5, parseMessage.objName + "," + parseMessage.methodName + "  JS_BRIDGE_ANNOTATION_NOT_PRESENT");
                    bridgeCallbackContext.onFailure(SystemMessageConstants.JS_BRIDGE_ANNOTATION_NOT_PRESENT, parseMessage.objName);
                }
                jsPromptResult.confirm("");
                return true;
            } catch (NoSuchMethodException e2) {
                String str6 = TAG;
                SDKLogger.e(str6, parseMessage.objName + "," + parseMessage.methodName + "," + e2.toString());
                bridgeCallbackContext.onFailure(SystemMessageConstants.JS_BRIDGE_METHOD_NOT_FOUND, parseMessage.objName);
                jsPromptResult.confirm("");
                return true;
            }
        }
    }
}
