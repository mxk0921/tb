package com.alibaba.android.ultron.engine.logic;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import tb.a8v;
import tb.coc;
import tb.f7l;
import tb.fg9;
import tb.hoh;
import tb.kih;
import tb.q5e;
import tb.qe8;
import tb.sh4;
import tb.t2o;
import tb.wcv;
import tb.yv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWebViewJsEngine implements q5e<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> j = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2257a;
    public WebView b;
    public volatile boolean c;
    public final qe8 e;
    public final a8v.b f;
    public boolean g;
    public final Queue<Runnable> h = new ArrayDeque();
    public final Map<String, Queue<kih<JSONObject>>> i = new HashMap();
    public final Handler d = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class UltronEngineBridge {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286443);
        }

        public UltronEngineBridge() {
        }

        @JavascriptInterface
        public void call(String str, String str2, String str3) {
            coc b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cebb6403", new Object[]{this, str, str2, str3});
            } else if (UltronWebViewJsEngine.k(UltronWebViewJsEngine.this) != null && (b = UltronWebViewJsEngine.k(UltronWebViewJsEngine.this).b(str, str2)) != null) {
                try {
                    b.a(str3);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class UltronEngineJsInterface {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286444);
        }

        public UltronEngineJsInterface() {
        }

        @JavascriptInterface
        public void onJsError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2e02df1", new Object[]{this, str});
                return;
            }
            UltronError ultronError = new UltronError("webview js exception:" + str);
            ultronError.code = "F_ULTRON_ENGINE_10003_JSI";
            ultronError.domain = "client_engine";
            UltronWebViewJsEngine.c(UltronWebViewJsEngine.this, ultronError);
        }

        @JavascriptInterface
        public void onReceiveValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("138ac29e", new Object[]{this, str});
            } else {
                UltronWebViewJsEngine.j(UltronWebViewJsEngine.this, str, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/logic/UltronWebViewJsEngine$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 10000) {
                UltronError ultronError = new UltronError("webview js 执行超时");
                ultronError.code = "F_ULTRON_ENGINE_10005_JSI";
                UltronWebViewJsEngine.c(UltronWebViewJsEngine.this, ultronError);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2262a;
        public final /* synthetic */ List b;
        public final /* synthetic */ kih c;

        public b(String str, List list, kih kihVar) {
            this.f2262a = str;
            this.b = list;
            this.c = kihVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UltronWebViewJsEngine.g(UltronWebViewJsEngine.this, this.f2262a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(157286435);
        t2o.a(157286421);
    }

    public UltronWebViewJsEngine(Context context, com.alibaba.android.ultron.vfw.instance.a aVar, String str, qe8 qe8Var, a8v.b bVar) {
        this.f2257a = context;
        this.e = qe8Var;
        this.f = bVar;
    }

    public static /* synthetic */ void c(UltronWebViewJsEngine ultronWebViewJsEngine, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79f87e7", new Object[]{ultronWebViewJsEngine, ultronError});
        } else {
            ultronWebViewJsEngine.p(ultronError);
        }
    }

    public static /* synthetic */ a8v.b d(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a8v.b) ipChange.ipc$dispatch("8db01540", new Object[]{ultronWebViewJsEngine});
        }
        return ultronWebViewJsEngine.f;
    }

    public static /* synthetic */ boolean e(UltronWebViewJsEngine ultronWebViewJsEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c16da87e", new Object[]{ultronWebViewJsEngine, new Boolean(z)})).booleanValue();
        }
        ultronWebViewJsEngine.g = z;
        return z;
    }

    public static /* synthetic */ void f(UltronWebViewJsEngine ultronWebViewJsEngine, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd78479", new Object[]{ultronWebViewJsEngine, runnable});
        } else {
            ultronWebViewJsEngine.r(runnable);
        }
    }

    public static /* synthetic */ void g(UltronWebViewJsEngine ultronWebViewJsEngine, String str, List list, kih kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257e93cd", new Object[]{ultronWebViewJsEngine, str, list, kihVar});
        } else {
            ultronWebViewJsEngine.m(str, list, kihVar);
        }
    }

    public static /* synthetic */ WebView h(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("78d970a0", new Object[]{ultronWebViewJsEngine});
        }
        return ultronWebViewJsEngine.b;
    }

    public static /* synthetic */ void i(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66904758", new Object[]{ultronWebViewJsEngine});
        } else {
            ultronWebViewJsEngine.l();
        }
    }

    public static /* synthetic */ void j(UltronWebViewJsEngine ultronWebViewJsEngine, String str, kih kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc962a1", new Object[]{ultronWebViewJsEngine, str, kihVar});
        } else {
            ultronWebViewJsEngine.n(str, kihVar);
        }
    }

    public static /* synthetic */ qe8 k(UltronWebViewJsEngine ultronWebViewJsEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qe8) ipChange.ipc$dispatch("6a789dd6", new Object[]{ultronWebViewJsEngine});
        }
        return ultronWebViewJsEngine.e;
    }

    @Override // tb.q5e
    public void b(String str, List<String> list, kih<JSONObject> kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2302181", new Object[]{this, str, list, kihVar});
        } else if (!this.c && str != null) {
            if (this.d.getLooper() == Looper.myLooper()) {
                m(str, list, kihVar);
            } else {
                this.d.post(new b(str, list, kihVar));
            }
        }
    }

    @Override // tb.q5e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        q();
        ((ArrayDeque) this.h).clear();
        WebView webView = this.b;
        if (webView != null) {
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            this.b.clearHistory();
            this.b.destroy();
            this.b = null;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e449dc", new Object[]{this});
        } else {
            this.d.sendMessageDelayed(Message.obtain(this.d, 10000), 8000L);
        }
    }

    public final void m(String str, List<String> list, kih<JSONObject> kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6421dd3b", new Object[]{this, str, list, kihVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f7l.BRACKET_START_STR);
        if (list != null && list.size() > 0) {
            for (String str2 : list) {
                if (str2 == null) {
                    sb.append("\"null\",");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", (Object) str2);
                    String jSONString = jSONObject.toJSONString();
                    String substring = jSONString.substring(9, jSONString.length() - 2);
                    sb.append("\"");
                    sb.append(substring);
                    sb.append("\",");
                }
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append(f7l.BRACKET_END_STR);
        String sb2 = sb.toString();
        Runnable o = o("javascript: " + sb2, str, kihVar);
        if (!this.g) {
            ((ArrayDeque) this.h).offer(o);
        } else {
            r(o);
        }
    }

    public final void n(String str, kih<JSONObject> kihVar) {
        kih kihVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b480c93", new Object[]{this, str, kihVar});
            return;
        }
        q();
        if (!this.c && this.b != null) {
            try {
                if (!TextUtils.isEmpty(str) && !"null".equalsIgnoreCase(str)) {
                    JSONObject parseObject = JSON.parseObject(JSON.parseObject("{\"data\":" + str + "}").getString("data"));
                    if (parseObject != null && !parseObject.isEmpty()) {
                        String string = parseObject.getString("method");
                        JSONObject jSONObject = parseObject.getJSONObject("methodReturn");
                        if (!TextUtils.isEmpty(string) && jSONObject != null && !jSONObject.isEmpty()) {
                            if (kihVar != null) {
                                kihVar.onReceiveValue(jSONObject);
                                return;
                            }
                            Queue queue = (Queue) ((HashMap) this.i).get(string);
                            if (queue != null && (kihVar2 = (kih) queue.poll()) != null) {
                                kihVar2.onReceiveValue(jSONObject);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    UltronError ultronError = new UltronError("webview js return exception: result is not json");
                    ultronError.code = "F_ULTRON_ENGINE_10003_JSI";
                    ultronError.domain = "client_engine";
                    p(ultronError);
                    return;
                }
                UltronError ultronError2 = new UltronError("webview js return exception: result is empty");
                ultronError2.code = "F_ULTRON_ENGINE_10003_JSI";
                ultronError2.domain = "client_engine";
                p(ultronError2);
            } catch (Throwable th) {
                UltronError ultronError3 = new UltronError("webview js return exception:" + th.toString());
                ultronError3.code = "F_ULTRON_ENGINE_10003_JSI";
                ultronError3.domain = "client_engine";
                p(ultronError3);
            }
        }
    }

    public final Runnable o(final String str, final String str2, final kih<JSONObject> kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("3b52d285", new Object[]{this, str, str2, kihVar});
        }
        return new Runnable() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (UltronWebViewJsEngine.h(UltronWebViewJsEngine.this) != null) {
                    UltronWebViewJsEngine.i(UltronWebViewJsEngine.this);
                    UltronWebViewJsEngine.h(UltronWebViewJsEngine.this).evaluateJavascript(str, new ValueCallback<String>() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public void onReceiveValue(String str3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str3});
                                return;
                            }
                            AnonymousClass6 r0 = AnonymousClass6.this;
                            UltronWebViewJsEngine.j(UltronWebViewJsEngine.this, str3, kihVar);
                        }
                    });
                }
            }
        };
    }

    public final void p(UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc93b658", new Object[]{this, ultronError});
            return;
        }
        this.c = true;
        q();
        ((ArrayDeque) this.h).clear();
        wcv wcvVar = new wcv(this, ultronError);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            wcvVar.run();
        } else {
            this.d.post(wcvVar);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1948b8a1", new Object[]{this});
        } else {
            this.d.removeMessages(10000);
        }
    }

    public final void r(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7424b0f2", new Object[]{this, runnable});
            return;
        }
        while (((ArrayDeque) this.h).peek() != null) {
            Runnable runnable2 = (Runnable) ((ArrayDeque) this.h).poll();
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // tb.q5e
    public void a(String str, String str2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a8c22b", new Object[]{this, str, str2});
        } else if (this.b == null) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                UltronError ultronError = new UltronError("webview engine js file or md5 is empty");
                ultronError.code = "F_ULTRON_ENGINE_10006_JSI";
                p(ultronError);
                return;
            }
            HashMap hashMap = (HashMap) j;
            if (hashMap.containsKey(str)) {
                str3 = (String) hashMap.get(str);
            } else {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String path = parse.getPath();
                if (scheme == null || !scheme.startsWith("file") || path == null || !path.contains("android_asset")) {
                    str4 = fg9.d(this.f2257a, str);
                } else {
                    str4 = fg9.b(this.f2257a, path.replace("/android_asset/", ""));
                }
                if (!str2.equals(hoh.a(str4))) {
                    UltronError ultronError2 = new UltronError("webview engine md5 check failed");
                    ultronError2.code = "F_ULTRON_ENGINE_10006_JSI";
                    p(ultronError2);
                    return;
                }
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put(str, str4);
                }
                str3 = str4;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.b = new WebView(this.f2257a);
                if (yv6.b(this.f2257a)) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                WebSettings settings = this.b.getSettings();
                if (settings == null) {
                    UltronError ultronError3 = new UltronError("webview engine webSettings is null");
                    ultronError3.code = "F_ULTRON_ENGINE_10006_JSI";
                    p(ultronError3);
                    return;
                }
                settings.setSupportZoom(false);
                settings.setSavePassword(false);
                settings.setAllowFileAccess(true);
                settings.setUseWideViewPort(false);
                settings.setJavaScriptEnabled(true);
                settings.setDisplayZoomControls(false);
                settings.setBuiltInZoomControls(false);
                settings.setDefaultTextEncodingName("utf-8");
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setCacheMode(2);
                settings.setAllowUniversalAccessFromFileURLs(false);
                settings.setJavaScriptCanOpenWindowsAutomatically(false);
                settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                WebView webView = this.b;
                webView.loadDataWithBaseURL(null, "<!DOCTYPE html>\n<html>\n    <head>\n        <title></title>\n        <meta charset=\"utf-8\">\n        <script type=\"text/javascript\">\n" + str3 + "        </script>\n    </head>\n\n    <body>\n    </body>\n</html>", "text/html", "utf-8", null);
                this.b.addJavascriptInterface(new UltronEngineJsInterface(), "AndroidWebViewEngineInterface");
                this.b.addJavascriptInterface(new UltronEngineBridge(), "nativeBridge");
                try {
                    if (sh4.k()) {
                        this.b.removeJavascriptInterface("searchBoxJavaBridge_");
                        this.b.removeJavascriptInterface("accessibilityTraversal");
                        this.b.removeJavascriptInterface("accessibility");
                    }
                } catch (Exception e) {
                    UnifyLog.e("UltronWebViewJsEngine", "remove jsi failed:" + e.getMessage());
                }
                this.b.setWebViewClient(new WebViewClient() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r5, String str5, Object... objArr) {
                        int hashCode = str5.hashCode();
                        if (hashCode == 756225189) {
                            super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                            return null;
                        } else if (hashCode == 1835642644) {
                            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                            return null;
                        } else {
                            int hashCode2 = str5.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/engine/logic/UltronWebViewJsEngine$3");
                        }
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d69af14", new Object[]{this, webView2, str5});
                            return;
                        }
                        super.onPageFinished(webView2, str5);
                        UltronWebViewJsEngine.e(UltronWebViewJsEngine.this, true);
                        UltronWebViewJsEngine.f(UltronWebViewJsEngine.this, null);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i, String str5, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2d1314a5", new Object[]{this, webView2, new Integer(i), str5, str6});
                            return;
                        }
                        super.onReceivedError(webView2, i, str5, str6);
                        Log.e("UltronWebViewJsEngine", "onReceivedError: errorCode: " + i + " description: " + str5 + " failingUrl: " + str6);
                    }
                });
                this.b.setWebChromeClient(new WebChromeClient() { // from class: com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass4 r10, String str5, Object... objArr) {
                        int hashCode = str5.hashCode();
                        if (hashCode == -808898598) {
                            return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
                        }
                        if (hashCode == -280149427) {
                            super.onConsoleMessage((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                            return null;
                        }
                        int hashCode2 = str5.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/engine/logic/UltronWebViewJsEngine$4");
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onConsoleMessage(String str5, int i, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ef4d424d", new Object[]{this, str5, new Integer(i), str6});
                            return;
                        }
                        super.onConsoleMessage(str5, i, str6);
                        Log.e("UltronWebViewJsEngine", "onConsoleMessage: message: " + str5 + " lineNumber: " + i + " sourceID: " + str6);
                    }

                    @Override // android.webkit.WebChromeClient
                    public boolean onJsPrompt(WebView webView2, String str5, String str6, String str7, JsPromptResult jsPromptResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("cfc92fda", new Object[]{this, webView2, str5, str6, str7, jsPromptResult})).booleanValue();
                        }
                        return super.onJsPrompt(webView2, str5, str6, str7, jsPromptResult);
                    }
                });
            }
        }
    }
}
