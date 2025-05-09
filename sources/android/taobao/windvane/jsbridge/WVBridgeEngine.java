package android.taobao.windvane.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import tb.icn;
import tb.lcn;
import tb.nsw;
import tb.q4c;
import tb.r4c;
import tb.rb;
import tb.spw;
import tb.t2o;
import tb.urb;
import tb.usw;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVBridgeEngine implements Serializable, urb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FAILURE_CALLBACK_PREFIX = "javascript:window.__windvane__&&window.__windvane__.onFailure&&window.__windvane__.onFailure";
    private static final String SUCCESS_CALLBACK_PREFIX = "javascript:window.__windvane__&&window.__windvane__.onSuccess&&window.__windvane__.onSuccess";
    public static String WINDVANE_CORE_JS = "(function(f){try{if(f.__windvane__.nativeCall&&!f.__windvane__.call){var h=f.__windvane__||(f.__windvane__={});var c=\"wvapi:\"+(Math.floor(Math.random()*(1<<16))),a=0,b={},g=function(j){if(j&&typeof j==\"string\"){try{return JSON.parse(j)}catch(i){return{ret:\"HY_RESULT_PARSE_ERROR\"}}}else{return j||{}}};h.call=function(i,m,l,e,k){if(typeof l!=\"function\"){l=null}if(typeof e!=\"function\"){e=null}var j=c+(a++);b[j]={s:l,f:e,};if(k>0){b[j].t=setTimeout(function(){h.onFailure(j,{ret:\"HY_TIMEOUT\"});console.log('{\"WVReport.HY_TIMEOUT\":\"'+k+'\",\"name\":\"'+i+'\",\"param\":\"'+m+'\",\"url\":\"'+location.href+'\"}');},k);}if(!m){m={}}if(typeof m!=\"string\"){m=JSON.stringify(m)}f.__windvane__.nativeCall(i,m,j,location.href)};h.find=function(i,j){var e=b[i]||{};if(e.t){clearTimeout(e.t);delete e.t}if(!j){delete b[i]}return e};h.onSuccess=function(j,e,k){var i=h.find(j,k).s;if(i){i(g(e))}};h.onFailure=function(j,e){var i=h.find(j,false).f;if(i){i(g(e))}}}}catch(d){}})(window);" + MegaBridgeJS.c();
    private static ExecutorService sExecutors;
    private IWVWebView mWebview;
    private String pid;
    private String uid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1776a;
        public final /* synthetic */ String b;
        public final /* synthetic */ spw c;

        public a(String str, String str2, spw spwVar) {
            this.f1776a = str;
            this.b = str2;
            this.c = spwVar;
        }

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            } else {
                a(str, true);
            }
        }

        public final void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d138a1e1", new Object[]{this, str, new Boolean(z)});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "{}";
            }
            String access$000 = WVBridgeEngine.access$000(WVBridgeEngine.this, str);
            if (vpw.commonConfig.c1) {
                WVBridgeEngine.access$100(WVBridgeEngine.this, this.f1776a, this.b, this.c, access$000);
            }
            WVBridgeEngine.access$300(WVBridgeEngine.this, WVBridgeEngine.access$200(WVBridgeEngine.this, true, this.b, access$000, z));
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            } else {
                a(str, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements q4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ spw f1777a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(spw spwVar, String str, String str2) {
            this.f1777a = spwVar;
            this.b = str;
            this.c = str2;
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
            } else {
                b(str, false);
            }
        }

        @Override // tb.q4c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4004bc0", new Object[]{this, str});
            } else {
                b(str, true);
            }
        }

        public final void b(String str, boolean z) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16a9d185", new Object[]{this, str, new Boolean(z)});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "{}";
            }
            String access$000 = WVBridgeEngine.access$000(WVBridgeEngine.this, str);
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.c1) {
                try {
                    JSONObject jSONObject2 = new JSONObject(access$000);
                    String string = jSONObject2.getString(rb.RESULT_KEY);
                    if (string.startsWith("HY_") || string.startsWith("WX_")) {
                        string = string.substring(3);
                    }
                    icn m = lcn.a(RVLLevel.Info, "Bridge").k("callback", this.f1777a.b()).m(this.f1777a.a());
                    m.a("name", this.b).i(string, "").a("status", string);
                    if (wpwVar.d1 && (jSONObject = jSONObject2.getJSONObject("info")) != null) {
                        m.a("info", jSONObject);
                    }
                    if (lcn.e().value >= RVLLevel.Debug.value) {
                        m.a("result", jSONObject2.getJSONObject("data"));
                    }
                    m.f();
                } catch (Exception unused) {
                    v7t.d("WVBridgeEngine", " log fail because of JOSNObject error");
                }
            }
            WVBridgeEngine.access$300(WVBridgeEngine.this, WVBridgeEngine.access$200(WVBridgeEngine.this, false, this.c, access$000, z));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IWVWebView f1778a;
        public final /* synthetic */ spw b;

        public c(IWVWebView iWVWebView, spw spwVar) {
            this.f1778a = iWVWebView;
            this.b = spwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVJsBridge.g().e(this.b, this.f1778a.getUrl());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ spw f1779a;
        public final /* synthetic */ String b;

        public d(spw spwVar, String str) {
            this.f1779a = spwVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVJsBridge.g().e(this.f1779a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ spw f1780a;

        public e(spw spwVar) {
            this.f1780a = spwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVJsBridge.a(this.f1780a, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1781a;

        public f(String str) {
            this.f1781a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVBridgeEngine.access$400(WVBridgeEngine.this).evaluateJavascript(this.f1781a);
            }
        }
    }

    static {
        t2o.a(989856213);
        t2o.a(989856196);
    }

    public WVBridgeEngine(IWVWebView iWVWebView) {
        this.mWebview = null;
        this.pid = "";
        this.uid = "";
        if (!vpw.commonConfig.P) {
            WINDVANE_CORE_JS = "(function(f){try{if(f.__windvane__.nativeCall&&!f.__windvane__.call){var h=f.__windvane__||(f.__windvane__={});var c=\"wvapi:\"+(Math.floor(Math.random()*(1<<16))),a=0,b={},g=function(j){if(j&&typeof j==\"string\"){try{return JSON.parse(j)}catch(i){return{ret:\"HY_RESULT_PARSE_ERROR\"}}}else{return j||{}}};h.call=function(i,m,l,e,k){if(typeof l!=\"function\"){l=null}if(typeof e!=\"function\"){e=null}var j=c+(a++);b[j]={s:l,f:e,};if(k>0){b[j].t=setTimeout(function(){h.onFailure(j,{ret:\"HY_TIMEOUT\"})},k)}if(!m){m={}}if(typeof m!=\"string\"){m=JSON.stringify(m)}f.__windvane__.nativeCall(i,m,j,location.href)};h.find=function(i,j){var e=b[i]||{};if(e.t){clearTimeout(e.t);delete e.t}if(!j){delete b[i]}return e};h.onSuccess=function(j,e,k){var i=h.find(j,k).s;if(i){i(g(e))}};h.onFailure=function(j,e){var i=h.find(j,false).f;if(i){i(g(e))}}}}catch(d){}})(window);" + MegaBridgeJS.c();
        }
        this.mWebview = iWVWebView;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw("WVBridgeEngine"));
        sExecutors = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ String access$000(WVBridgeEngine wVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93698f6f", new Object[]{wVBridgeEngine, str});
        }
        return wVBridgeEngine.formatJsonString(str);
    }

    public static /* synthetic */ void access$100(WVBridgeEngine wVBridgeEngine, String str, String str2, spw spwVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cab8fbb", new Object[]{wVBridgeEngine, str, str2, spwVar, str3});
        } else {
            wVBridgeEngine.onSuccessLogger(str, str2, spwVar, str3);
        }
    }

    public static /* synthetic */ String access$200(WVBridgeEngine wVBridgeEngine, boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6cc758f", new Object[]{wVBridgeEngine, new Boolean(z), str, str2, new Boolean(z2)});
        }
        return wVBridgeEngine.getCallbackJs(z, str, str2, z2);
    }

    public static /* synthetic */ void access$300(WVBridgeEngine wVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34effcae", new Object[]{wVBridgeEngine, str});
        } else {
            wVBridgeEngine.valuateJavascriptOnUiThread(str);
        }
    }

    public static /* synthetic */ IWVWebView access$400(WVBridgeEngine wVBridgeEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("95608097", new Object[]{wVBridgeEngine});
        }
        return wVBridgeEngine.mWebview;
    }

    private String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{this, str});
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

    private String getCallbackJs(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e42e4e9", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2)});
        }
        if (z) {
            return "javascript:window.__windvane__&&window.__windvane__.onSuccess&&window.__windvane__.onSuccess('" + str + "','" + str2 + "'," + z2 + ");";
        }
        return "javascript:window.__windvane__&&window.__windvane__.onFailure&&window.__windvane__.onFailure('" + str + "','" + str2 + "'," + z2 + ");";
    }

    private void onSuccessLogger(String str, String str2, spw spwVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89fd0070", new Object[]{this, str, str2, spwVar, str3});
            return;
        }
        try {
            lcn.a(RVLLevel.Info, "Bridge").k("callback", spwVar.b()).m(spwVar.a()).a("name", str).a("status", "SUCCESS").f();
        } catch (Exception unused) {
            v7t.d("WVBridgeEngine", " callback success JOSNObject error");
        }
    }

    private void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
            return;
        }
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                IWVWebView iWVWebView = this.mWebview;
                if (iWVWebView != null) {
                    iWVWebView.getView().post(runnable);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void valuateJavascriptOnUiThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93ee459", new Object[]{this, str});
        } else {
            runOnUiThread(new f(str));
        }
    }

    @Override // tb.urb
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return "NewBridge_" + this.uid;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this});
        }
        return this.pid;
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
            return;
        }
        this.uid = "" + urb.id.addAndGet(1);
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb50921", new Object[]{this});
        }
        v7t.d("WVJSPlugin", "WVJSPlugin __windvane__ version 8.5.0");
        return yaa.VERSION;
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String windVaneCoreJs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0071a87", new Object[]{this});
        }
        if (vpw.commonConfig.C) {
            return "";
        }
        return WINDVANE_CORE_JS;
    }

    public static boolean needVerification(spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40efcb53", new Object[]{spwVar})).booleanValue();
        }
        return !vpw.commonConfig.p1 || spwVar == null || !"powermsg".equals(spwVar.d) || !"sendMessageByStream".equals(spwVar.e);
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public void nativeCall(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748b0144", new Object[]{this, str, str2, str3, str4});
            return;
        }
        spw spwVar = new spw();
        String[] split = str.split("\\.");
        if (split == null || split.length != 2) {
            nsw nswVar = new nsw();
            nswVar.j("HY_NO_HANDLER");
            new WVCallBackContext(this.mWebview, str3, "", "", null, null).error(nswVar);
            return;
        }
        spwVar.d = split[0];
        spwVar.e = split[1];
        spwVar.f28213a = this.mWebview;
        spwVar.g = str3;
        spwVar.f = str2;
        if (TextUtils.isEmpty(str2)) {
            spwVar.f = "{}";
        }
        v7t.i("WVJsBridge", "new bridge, reqId=[" + str3 + "]");
        if (vpw.commonConfig.c1) {
            IWVWebView iWVWebView = this.mWebview;
            if (iWVWebView instanceof urb) {
                String curId = ((urb) iWVWebView).getCurId();
                spwVar.c(curId);
                try {
                    lcn.a(RVLLevel.Info, "Bridge").k("invoke", spwVar.b()).m(curId).a("name", str).a("params", new JSONObject(str2)).f();
                } catch (Exception unused) {
                    v7t.d("WVBridgeEngine", " invoke JOSNObject error");
                }
            }
        }
        spwVar.i = new a(str, str3, spwVar);
        spwVar.h = new b(spwVar, str, str3);
        if (!needVerification(spwVar)) {
            spwVar.l = false;
            sExecutors.submit(new e(spwVar));
        } else if (vpw.commonConfig.X0) {
            IWVWebView iWVWebView2 = this.mWebview;
            if (iWVWebView2 != null) {
                new Handler(Looper.getMainLooper()).post(new c(iWVWebView2, spwVar));
            }
        } else {
            sExecutors.submit(new d(spwVar, str4));
        }
    }

    public WVBridgeEngine(IWVWebView iWVWebView, urb urbVar) {
        this(iWVWebView);
        this.pid = urbVar.getCurId();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw("WVBridgeEngine"));
        sExecutors = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
