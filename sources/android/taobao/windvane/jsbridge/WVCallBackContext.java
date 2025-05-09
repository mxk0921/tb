package android.taobao.windvane.jsbridge;

import android.os.Looper;
import android.taobao.windvane.extra.jsbridge.WVMegaBridgeContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.exception.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import org.json.JSONException;
import org.json.JSONObject;
import tb.jpw;
import tb.lab;
import tb.lcn;
import tb.lqw;
import tb.nsw;
import tb.og8;
import tb.q4c;
import tb.r4c;
import tb.rb;
import tb.t2o;
import tb.trw;
import tb.urb;
import tb.v7t;
import tb.vpw;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVCallBackContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFALT_URL = "UNKNOWN";
    private static final String TAG = "WVCallBackContext";
    public String currentUrlFromAsyncChannel;
    private IJsApiFailedCallBack failedCallBack;
    private String instancename;
    private String mCallBackContextUrl;
    private String methodname;
    private String objectname;
    private IJsApiSucceedCallBack succeedCallBack;
    private String token;
    private IWVWebView webview;
    public WVMegaBridgeContext wvMegaBridgeContext;
    private boolean mNotiNavtive = false;
    private String mAction = null;
    private String pid = "";
    private String uid = "";
    private boolean isUpload = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IWVWebView f1782a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public a(IWVWebView iWVWebView, String str, long j) {
            this.f1782a = iWVWebView;
            this.b = str;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f1782a.evaluateJavascript(this.b);
            v7t.d(WVCallBackContext.TAG, "callback use time=" + (System.currentTimeMillis() - this.c));
        }
    }

    static {
        t2o.a(989856220);
    }

    public WVCallBackContext(IWVWebView iWVWebView) {
        this.webview = iWVWebView;
        safeSetUrl(iWVWebView);
    }

    private static String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{str});
        }
        if (str.contains("\u2028")) {
            try {
                str = str.replace("\u2028", "\\u2028");
            } catch (Exception unused) {
            }
        }
        if (str.contains("\u2029")) {
            try {
                str = str.replace("\u2029", "\\u2029");
            } catch (Exception unused2) {
            }
        }
        return str.replace("\\", "\\\\").replace("'", "\\'");
    }

    private void onCallBack(nsw nswVar, boolean z) {
        IJsApiFailedCallBack iJsApiFailedCallBack;
        IJsApiSucceedCallBack iJsApiSucceedCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aed9553", new Object[]{this, nswVar, new Boolean(z)});
        } else if (nswVar != null) {
            if (z) {
                nswVar.k();
            }
            boolean f = nswVar.f();
            String m = nswVar.m();
            if (z && (iJsApiSucceedCallBack = this.succeedCallBack) != null) {
                if (!f || !(iJsApiSucceedCallBack instanceof r4c)) {
                    iJsApiSucceedCallBack.succeed(m);
                } else {
                    ((r4c) iJsApiSucceedCallBack).b(m);
                }
            }
            if (!z && (iJsApiFailedCallBack = this.failedCallBack) != null) {
                if (!f || !(iJsApiFailedCallBack instanceof q4c)) {
                    iJsApiFailedCallBack.fail(m);
                } else {
                    ((q4c) iJsApiFailedCallBack).a(m);
                }
            }
        }
    }

    private static void onLoggerJSEvent(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee71c7e1", new Object[]{iWVWebView, str, str2});
        } else if (vpw.commonConfig.c1) {
            try {
                String str3 = "";
                if (iWVWebView instanceof urb) {
                    str3 = ((urb) iWVWebView).getCurId();
                }
                lcn.a(RVLLevel.Info, "JS/Event").j("event").m(str3).a("name", str).a("data", new JSONObject(str2)).f();
            } catch (Exception unused) {
                v7t.d(TAG, "JS Event JOSNObject error failed!");
            }
        }
    }

    private static void runOnUiThread(IWVWebView iWVWebView, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da77ba51", new Object[]{iWVWebView, runnable});
        } else if (iWVWebView != null && iWVWebView.getView() != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
                return;
            }
            try {
                iWVWebView._post(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void safeSetUrl(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f98e545", new Object[]{this, iWVWebView});
        } else if (Looper.getMainLooper() == Looper.myLooper() && iWVWebView != null) {
            try {
                this.mCallBackContextUrl = iWVWebView.getUrl();
            } catch (Throwable th) {
                Log.e(TAG, "safeSetUrl: ");
                th.printStackTrace();
            }
        }
    }

    public void commitJsBridgeReturn(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fd954c", new Object[]{this, nswVar});
        } else if (vpw.commonConfig.r0) {
            try {
                String str = "" + this.objectname + "." + this.methodname;
                String str2 = this.instancename;
                String e = nswVar.e(rb.RESULT_KEY, "HY_FAILED_EMPTY");
                String e2 = nswVar.e("msg", "");
                String str3 = "UNKNOWN";
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    IWVWebView iWVWebView = this.webview;
                    if (iWVWebView != null) {
                        str3 = iWVWebView.getUrl();
                    }
                } else {
                    String str4 = this.mCallBackContextUrl;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                if (TextUtils.equals(str, "MtopWVPlugin.send")) {
                    String e3 = nswVar.e("api", "UNKNOWN_MTOP_API");
                    if (trw.getWvJsBridgeMonitorInterface() != null) {
                        trw.getWvJsBridgeMonitorInterface().onMtopJsBridgeReturn(e3, e, e2, str3);
                    }
                } else if (trw.getJsBridgeMonitor() != null) {
                    trw.getJsBridgeMonitor().onJsBridgeReturn(str, str2, e, e2, str3);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void error() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1392128f", new Object[]{this});
        } else {
            error("{}");
        }
    }

    public void fireEvent(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        v7t.a(TAG, "call fireEvent, eventName = [" + str + "], eventParam = [" + str2 + "]");
        lqw.d().g(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, this.mAction, str, str2);
        if (yaa.m) {
            str3 = "(function(d){var n='%s',t='%%s';if(window.WindVane){window.WindVane.fireEvent(n,t,%s);}else{var e=d.createEvent('HTMLEvents');e.initEvent(n,!1,!0);try{e.data=e.param=JSON.parse(t)}catch(i){e.data=e.param={ret:'HY_RESULT_PARSE_ERROR',originValue:t}}d.dispatchEvent(e);}})(window.document)";
        } else {
            str3 = "window.WindVane && window.WindVane.fireEvent('%s', '%%s', %s);";
        }
        onLoggerJSEvent(getWebview(), str, str2);
        callback(this.webview, String.format(str3, str, null), str2);
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.pid;
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.token;
    }

    public String getUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this});
        }
        return this.uid;
    }

    public IWVWebView getWebview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("166e5630", new Object[]{this});
        }
        return this.webview;
    }

    public void onFailure(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5c5b7a", new Object[]{this, nswVar});
        } else {
            onCallBack(nswVar, false);
        }
    }

    public void onSuccess(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43640fe1", new Object[]{this, nswVar});
        } else {
            onCallBack(nswVar, true);
        }
    }

    public void setInstancename(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcd5f33", new Object[]{this, str});
        } else {
            this.instancename = str;
        }
    }

    public void setNeedfireNativeEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511a412e", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mAction = str;
        this.mNotiNavtive = z;
        v7t.d(TAG, "setNeedfireNativeEvent : " + str);
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.token = str;
        }
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            this.uid = str;
        }
    }

    public void setWebview(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5f70e2", new Object[]{this, iWVWebView});
        } else {
            this.webview = iWVWebView;
        }
    }

    public void success() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
        } else {
            success(nsw.RET_SUCCESS);
        }
    }

    public void successAndKeepAlive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            return;
        }
        v7t.i(TAG, "call success and keep alive, msg = " + str);
        IJsApiSucceedCallBack iJsApiSucceedCallBack = this.succeedCallBack;
        if (iJsApiSucceedCallBack == null || !(iJsApiSucceedCallBack instanceof r4c)) {
            IWVWebView iWVWebView = this.webview;
            String str2 = this.token;
            callback(iWVWebView, "javascript:window.WindVane&&window.WindVane.onSuccess('" + str2 + "','%s', true);", str);
            return;
        }
        ((r4c) iJsApiSucceedCallBack).b(str);
    }

    public void error(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5660aa7d", new Object[]{this, nswVar});
        } else if (nswVar != null) {
            error(nswVar.m());
            commitJsBridgeReturn(nswVar);
        }
    }

    public void success(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e095322", new Object[]{this, nswVar});
        } else if (nswVar != null) {
            nswVar.k();
            String m = nswVar.m();
            this.isUpload = true;
            success(m);
            commitJsBridgeReturn(nswVar);
        }
    }

    private static void callback(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e503504", new Object[]{iWVWebView, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (v7t.h() && og8.d() && !TextUtils.isEmpty(str2)) {
            try {
                new JSONObject(str2);
            } catch (JSONException unused) {
                v7t.d(TAG, "return param is not a valid json!\n" + str + "\n" + str2);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        try {
            try {
                runOnUiThread(iWVWebView, new a(iWVWebView, String.format(str, formatJsonString(str2)), currentTimeMillis));
            } catch (Exception e) {
                v7t.n(TAG, e.getMessage());
            }
        } catch (Exception e2) {
            v7t.d(TAG, "callback error. " + e2.getMessage());
        }
    }

    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            return;
        }
        nsw nswVar = new nsw("HY_FAILED");
        nswVar.b(str, str2);
        error(nswVar);
    }

    public void success(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            return;
        }
        v7t.i(TAG, "call method success, msg = " + str);
        IJsApiSucceedCallBack iJsApiSucceedCallBack = this.succeedCallBack;
        if (iJsApiSucceedCallBack != null) {
            iJsApiSucceedCallBack.succeed(str);
            if (!this.isUpload) {
                commitJsBridgeReturn(str);
                return;
            }
            return;
        }
        if (this.mNotiNavtive) {
            String str3 = "UNKNOWN";
            if (Looper.getMainLooper() == Looper.myLooper()) {
                IWVWebView iWVWebView = this.webview;
                if (iWVWebView != null) {
                    str3 = iWVWebView.getUrl();
                }
            } else {
                String str4 = this.mCallBackContextUrl;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            lqw.d().f(ErrorCode.OAUTH_CODE_CANCEL, null, str3, this.mAction, str);
            this.mNotiNavtive = false;
            this.mAction = null;
        }
        try {
            Integer.valueOf(this.token);
            str2 = "javascript:window.WindVane&&window.WindVane.onSuccess(%s,'%%s');";
        } catch (Throwable unused) {
            str2 = "javascript:window.WindVane&&window.WindVane.onSuccess('%s','%%s');";
        }
        callback(this.webview, String.format(str2, this.token), str);
        if (!this.isUpload) {
            commitJsBridgeReturn(str);
        }
    }

    public static void fireEvent(IWVWebView iWVWebView, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b044543", new Object[]{iWVWebView, str, str2});
            return;
        }
        v7t.a(TAG, "call fireEvent ");
        lqw.d().f(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, null, str, str2);
        if (yaa.m) {
            str3 = "(function(d){var n='%s',t='%%s';if(window.WindVane){window.WindVane.fireEvent(n,t,%s);}else{var e=d.createEvent('HTMLEvents');e.initEvent(n,!1,!0);try{e.data=e.param=JSON.parse(t)}catch(i){e.data=e.param={ret:'HY_RESULT_PARSE_ERROR',originValue:t}}d.dispatchEvent(e);}})(window.document)";
        } else {
            str3 = "window.WindVane && window.WindVane.fireEvent('%s', '%%s', %s);";
        }
        onLoggerJSEvent(iWVWebView, str, str2);
        callback(iWVWebView, String.format(str3, str, null), str2);
    }

    public void error(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            return;
        }
        v7t.d(TAG, "call error, ret = [" + str + "]");
        IJsApiFailedCallBack iJsApiFailedCallBack = this.failedCallBack;
        if (iJsApiFailedCallBack != null) {
            iJsApiFailedCallBack.fail(str);
            if (!this.isUpload) {
                commitJsBridgeReturn(str);
                return;
            }
            return;
        }
        if (this.mNotiNavtive) {
            String str3 = "UNKNOWN";
            if (Looper.getMainLooper() == Looper.myLooper()) {
                IWVWebView iWVWebView = this.webview;
                if (iWVWebView != null) {
                    str3 = iWVWebView.getUrl();
                }
            } else {
                String str4 = this.mCallBackContextUrl;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            lqw.d().f(ErrorCode.OAUTH_CODE_FAIL, null, str3, this.mAction, str);
            this.mNotiNavtive = false;
            this.mAction = null;
        }
        try {
            Integer.valueOf(this.token);
            str2 = "javascript:window.WindVane&&window.WindVane.onFailure(%s,'%%s');";
        } catch (Throwable unused) {
            str2 = "javascript:window.WindVane&&window.WindVane.onSuccess('%s','%%s');";
        }
        callback(this.webview, String.format(str2, this.token), str);
        if (!this.isUpload) {
            commitJsBridgeReturn(str);
        }
    }

    public WVCallBackContext(IWVWebView iWVWebView, String str, String str2, String str3) {
        this.webview = iWVWebView;
        this.token = str;
        this.objectname = str2;
        this.methodname = str3;
        safeSetUrl(iWVWebView);
    }

    public void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            fireEvent(str, "{}");
        }
    }

    public void commitJsBridgeReturn(String str) {
        lab labVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a3f8ea", new Object[]{this, str});
        } else if (vpw.commonConfig.r0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = "" + this.objectname + "." + this.methodname;
                String str3 = this.instancename;
                String optString = jSONObject.optString(rb.RESULT_KEY, "HY_FAILED_EMPTY");
                String optString2 = jSONObject.optString("msg", "");
                String str4 = "UNKNOWN";
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    IWVWebView iWVWebView = this.webview;
                    if (iWVWebView != null) {
                        str4 = iWVWebView.getUrl();
                    }
                } else {
                    String str5 = this.mCallBackContextUrl;
                    if (str5 != null) {
                        str4 = str5;
                    }
                }
                if (TextUtils.equals(str2, "MtopWVPlugin.send")) {
                    String optString3 = jSONObject.optString("api", "UNKNOWN_MTOP_API");
                    if (trw.getWvJsBridgeMonitorInterface() != null) {
                        trw.getWvJsBridgeMonitorInterface().onMtopJsBridgeReturn(optString3, optString, optString2, str4);
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("stat");
                    if (optJSONObject != null && optJSONObject.optBoolean("isPrefetch", false) && (labVar = (lab) jpw.c().a(lab.class)) != null) {
                        labVar.e(this.webview.getView(), "H5_Prefetch", Boolean.TRUE);
                    }
                } else if (trw.getJsBridgeMonitor() != null) {
                    trw.getJsBridgeMonitor().onJsBridgeReturn(str2, str3, optString, optString2, str4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public WVCallBackContext(IWVWebView iWVWebView, String str, String str2, String str3, IJsApiSucceedCallBack iJsApiSucceedCallBack, IJsApiFailedCallBack iJsApiFailedCallBack) {
        this.webview = iWVWebView;
        this.token = str;
        this.objectname = str2;
        this.methodname = str3;
        this.failedCallBack = iJsApiFailedCallBack;
        this.succeedCallBack = iJsApiSucceedCallBack;
        safeSetUrl(iWVWebView);
    }
}
