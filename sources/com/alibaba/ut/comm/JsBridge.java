package com.alibaba.ut.comm;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a1v;
import tb.d4r;
import tb.f7l;
import tb.nzu;
import tb.thh;
import tb.tsu;
import tb.xbe;
import tb.zyu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JsBridge";
    private xbe mWebView;

    public JsBridge(Object obj) {
        this.mWebView = null;
        if (obj instanceof WebView) {
            this.mWebView = new d4r((WebView) obj);
        } else if (obj instanceof com.uc.webview.export.WebView) {
            this.mWebView = new tsu((com.uc.webview.export.WebView) obj);
        }
    }

    public static /* synthetic */ String access$000(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48b7a662", new Object[]{str, strArr});
        }
        return buildAplus4UTJSScript(str, strArr);
    }

    public static /* synthetic */ String access$100(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32d46e3", new Object[]{str, strArr});
        }
        return buildJSScript(str, strArr);
    }

    private static String buildJSScript(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("922e1cd4", new Object[]{str, strArr});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f7l.BRACKET_START_STR);
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("'");
                sb.append(strArr[i]);
                sb.append("'");
                if (i < strArr.length - 1) {
                    sb.append(',');
                }
            }
        }
        sb.append(");");
        return sb.toString();
    }

    private void callbackToJs(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643a605", new Object[]{this, str, strArr});
        } else {
            nativeToJs(this.mWebView, str, strArr);
        }
    }

    public static void nativeToJs(xbe xbeVar, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a75e95", new Object[]{xbeVar, str, strArr});
        } else {
            xbeVar.post(new a(str, strArr, xbeVar));
        }
    }

    @JavascriptInterface
    public String UTEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83ac6deb", new Object[]{this});
        }
        xbe xbeVar = this.mWebView;
        if (xbeVar == null) {
            return "default";
        }
        if (xbeVar instanceof d4r) {
            return "webview";
        }
        if (xbeVar instanceof tsu) {
            return "ucwebview";
        }
        return "iwebview";
    }

    @JavascriptInterface
    public String bridgeVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd85894a", new Object[]{this});
        }
        return zyu.SDK_VERSION;
    }

    @JavascriptInterface
    public void onPageShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c4ec32", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3381a;
        public final /* synthetic */ String[] b;
        public final /* synthetic */ xbe c;

        public a(String str, String[] strArr, xbe xbeVar) {
            this.f3381a = str;
            this.b = strArr;
            this.c = xbeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str2 = null;
            try {
                if (this.f3381a.contains("Aplus4UT")) {
                    str = JsBridge.access$000(this.f3381a, this.b);
                } else {
                    str = JsBridge.access$100(this.f3381a, this.b);
                }
                try {
                    thh.h(JsBridge.TAG, "js", str);
                    this.c.evaluateJavascript(str, null);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str;
                    thh.j(JsBridge.TAG, th, "native to js", str2);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static String buildAplus4UTJSScript(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91facf6c", new Object[]{str, strArr});
        }
        thh.d(TAG, "buildAplus4UTJSScript methodName", str);
        StringBuilder sb = new StringBuilder("if (window.Aplus4UT && window.");
        sb.append(str);
        sb.append(") { window.");
        sb.append(str);
        sb.append(f7l.BRACKET_START_STR);
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("'");
                sb.append(strArr[i]);
                sb.append("'");
                if (i < strArr.length - 1) {
                    sb.append(',');
                }
            }
        }
        sb.append(");}");
        return sb.toString();
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public void CALL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2f726f", new Object[]{this, str});
            return;
        }
        thh.k(TAG, "CALL JavascriptInterface", str);
        if (TextUtils.isEmpty(str)) {
            thh.k(TAG, "p is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(FluidException.METHOD_NAME);
            String optString2 = jSONObject.optString("params");
            String optString3 = jSONObject.optString("callback");
            String optString4 = jSONObject.optString("sid");
            String str2 = "0";
            String str3 = "SUCCESS";
            Object obj = null;
            try {
                obj = invokeNativeMethod(this.mWebView.getContext(), null, optString, optString2);
            } catch (Exception e) {
                str2 = "1";
                str3 = e.toString();
                thh.j(TAG, e, new Object[0]);
            }
            if (!TextUtils.isEmpty(optString3)) {
                JSONObject jSONObject2 = new JSONObject();
                if (obj == null) {
                    obj = "";
                }
                jSONObject2.put("result", obj);
                jSONObject2.put("code", str2);
                jSONObject2.put("msg", str3);
                callbackToJs(optString3, new String[]{optString4, jSONObject2.toString()});
            }
        } catch (JSONException e2) {
            thh.j(TAG, e2, new Object[0]);
        }
    }

    public Object invokeNativeMethod(Context context, String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2fc6ed43", new Object[]{this, context, str, str2, str3});
        }
        thh.h(TAG, "invokeNativeMethod", str2);
        if (str2.equalsIgnoreCase(a1v.PAGE_APPEAR)) {
            nzu.j(context, str3);
        } else if (str2.equalsIgnoreCase("pageDisAppear")) {
            nzu.k(context, str3);
        } else if (str2.equalsIgnoreCase(a1v.UPDATE_PAGE_PROPERTIES)) {
            nzu.t(context, str3);
            return Boolean.TRUE;
        } else if (str2.equalsIgnoreCase(a1v.UPDATE_PAGE_UTPARAM)) {
            nzu.v(context, str3);
        } else if (str2.equalsIgnoreCase("updateNextPageUtparam")) {
            nzu.r(str3);
        } else if (str2.equalsIgnoreCase(a1v.UPDATE_NEXT_PAGE_PROPERTIES)) {
            nzu.q(str3);
        } else if (str2.equalsIgnoreCase("getParam")) {
            return nzu.g();
        } else {
            if (str2.equalsIgnoreCase(DeviceInfoJsBridge.ACTION)) {
                return nzu.d();
            }
            if (str2.equalsIgnoreCase("setAplusParams")) {
                nzu.n(context.hashCode() + "", str3);
            } else if (str2.equalsIgnoreCase("getAplusParams")) {
                return nzu.c(context.hashCode() + "");
            } else if (str2.equalsIgnoreCase("removeAplusParams")) {
                nzu.l(context.hashCode() + "");
            } else if (str2.equalsIgnoreCase("utCustomEvent")) {
                nzu.z(str3);
            } else if (str2.equalsIgnoreCase(a1v.GET_PAGE_SPM_URL)) {
                return nzu.f(context);
            } else {
                if (str2.equalsIgnoreCase(a1v.GET_PAGE_SPM_PRE)) {
                    return nzu.e(context);
                }
                if (str2.equalsIgnoreCase("updatePageURL")) {
                    nzu.u(context, str3);
                } else if (str2.equalsIgnoreCase("updatePageName")) {
                    nzu.s(context, str3);
                } else if (str2.equalsIgnoreCase("turnOnRealtimeDebug")) {
                    nzu.p(str3);
                } else if (str2.equalsIgnoreCase("userRegister")) {
                    nzu.y(str3);
                } else if (str2.equalsIgnoreCase("updateUserAccount")) {
                    nzu.x(str3);
                } else if (str2.equalsIgnoreCase("addTPKItem")) {
                    nzu.b(str3);
                } else if (str2.equalsIgnoreCase(a1v.UPDATE_SESSION_PROPERTY)) {
                    nzu.w(str3);
                } else if (str2.equalsIgnoreCase("setGlobalProperty")) {
                    nzu.o(str3);
                } else if (str2.equalsIgnoreCase("setAplus4UT")) {
                    nzu.m(context);
                }
            }
        }
        return null;
    }

    public JsBridge(xbe xbeVar) {
        this.mWebView = xbeVar;
    }
}
