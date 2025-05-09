package com.unionpay;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;
import tb.tux;
import tb.wi3;
import tb.xux;
import tb.zux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebViewJavascriptBridge implements Serializable {
    xux _messageHandler;
    Activity mContext;
    WebView mWebView;
    private boolean mAllowScheme = false;
    Map _messageHandlers = new HashMap();
    Map _responseCallbacks = new HashMap();
    long _uniqueId = 0;

    public WebViewJavascriptBridge(Activity activity, WebView webView, xux xuxVar) {
        this.mContext = activity;
        this.mWebView = webView;
        this._messageHandler = xuxVar;
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            this.mWebView.removeJavascriptInterface("accessibility");
            this.mWebView.removeJavascriptInterface("accessibilityTraversal");
            this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mWebView.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.mWebView.setWebViewClient(new ac(this, (byte) 0));
        this.mWebView.setWebChromeClient(new ab(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _callbackJs(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(wi3.ResponseId, str);
        hashMap.put("responseData", str2);
        _dispatchMessage(hashMap);
    }

    private void _dispatchMessage(Map map) {
        String jSONObject = new JSONObject(map).toString();
        new StringBuilder("sending:").append(jSONObject);
        String doubleEscapeString = doubleEscapeString(jSONObject);
        this.mContext.runOnUiThread(new b(this, "javascript:WebViewJavascriptBridge._handleMessageFromJava('" + doubleEscapeString + "');"));
    }

    private void _sendData(String str, zux zuxVar, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        if (zuxVar != null) {
            StringBuilder sb = new StringBuilder("java_cb_");
            long j = this._uniqueId + 1;
            this._uniqueId = j;
            sb.append(j);
            String sb2 = sb.toString();
            this._responseCallbacks.put(sb2, zuxVar);
            hashMap.put("callbackId", sb2);
        }
        if (str2 != null) {
            hashMap.put("handlerName", str2);
        }
        _dispatchMessage(hashMap);
    }

    public static String convertStreamToString(InputStream inputStream) {
        String str = "";
        try {
            Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private String doubleEscapeString(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f");
    }

    private void loadWebViewJavascriptBridgeJs(WebView webView) {
        String convertStreamToString = convertStreamToString(getClass().getResourceAsStream("res/webviewjavascriptbridge.js"));
        webView.loadUrl("javascript:" + convertStreamToString);
    }

    @JavascriptInterface
    public void _handleMessageFromJs(String str, String str2, String str3, String str4, String str5) {
        tux tuxVar;
        xux xuxVar;
        if (str2 != null) {
            ((zux) this._responseCallbacks.get(str2)).a(str3);
            this._responseCallbacks.remove(str2);
            return;
        }
        if (str4 != null) {
            tuxVar = new tux(this, str4);
        } else {
            tuxVar = null;
        }
        if (str5 != null) {
            xuxVar = (xux) this._messageHandlers.get(str5);
            if (xuxVar == null) {
                "WVJB Warning: No handler for ".concat(str5);
                return;
            }
        } else {
            xuxVar = this._messageHandler;
        }
        try {
            this.mContext.runOnUiThread(new a(this, xuxVar, str, tuxVar));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void callHandler(String str) {
        callHandler(str, null, null);
    }

    public void registerHandler(String str, xux xuxVar) {
        this._messageHandlers.put(str, xuxVar);
    }

    public void send(String str) {
        send(str, null);
    }

    public void setAllowScheme(boolean z) {
        this.mAllowScheme = z;
    }

    public void callHandler(String str, String str2) {
        callHandler(str, str2, null);
    }

    public void send(String str, zux zuxVar) {
        _sendData(str, zuxVar, null);
    }

    public void callHandler(String str, String str2, zux zuxVar) {
        _sendData(str2, zuxVar, str);
    }
}
