package android.taobao.windvane.jsbridge;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.crw;
import tb.drw;
import tb.erw;
import tb.esw;
import tb.fsw;
import tb.hrw;
import tb.icn;
import tb.irw;
import tb.kpw;
import tb.lcn;
import tb.nsw;
import tb.spw;
import tb.t2o;
import tb.trw;
import tb.urb;
import tb.v7t;
import tb.vpw;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVJsBridge implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CALL_ALIAS = 7;
    public static final int CALL_DESTROY = 8;
    public static final int CALL_EXECUTE = 0;
    public static final int CALL_METHOD = 1;
    public static final int CLOSED = 4;
    public static final int ERROR_EXECUTE = 6;
    public static final int NO_CLASS = 5;
    public static final int NO_METHOD = 2;
    public static final int NO_PERMISSION = 3;
    public static WVJsBridge d;
    public static Handler e;
    public static boolean f = true;
    public static Pattern g = null;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1783a = true;
    public boolean b = false;
    public ArrayList<spw> c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a extends AsyncTask<Void, Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ spw f1785a;
        public final /* synthetic */ String b;

        public a(spw spwVar, String str) {
            this.f1785a = spwVar;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/WVJsBridge$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            WVJsBridge.this.e(this.f1785a, this.b);
            return null;
        }
    }

    static {
        t2o.a(989856227);
    }

    public WVJsBridge() {
        e = new Handler(Looper.getMainLooper(), this);
    }

    public static synchronized WVJsBridge g() {
        synchronized (WVJsBridge.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVJsBridge) ipChange.ipc$dispatch("1f851679", new Object[0]);
            }
            if (d == null) {
                d = new WVJsBridge();
            }
            return d;
        }
    }

    public static void k(int i, spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18b6bf3", new Object[]{new Integer(i), spwVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = spwVar;
        if (Looper.myLooper() == e.getLooper() || (spwVar != null && !spwVar.l)) {
            g().handleMessage(obtain);
        } else {
            e.sendMessage(obtain);
        }
    }

    public void b(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b390fd4", new Object[]{this, iWVWebView, str});
        } else {
            c(iWVWebView, str, null, null, null);
        }
    }

    public void d(IWVWebView iWVWebView, String str, urb urbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567caa82", new Object[]{this, iWVWebView, str, urbVar});
        } else {
            c(iWVWebView, str, null, null, urbVar);
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.f1783a = z;
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1826214c", new Object[]{this});
            return;
        }
        ArrayList<spw> arrayList = this.c;
        if (arrayList != null) {
            Iterator<spw> it = arrayList.iterator();
            while (it.hasNext()) {
                spw next = it.next();
                a(next, "");
                v7t.i("WVJsBridge", "excute TailJSBridge : " + next.d + " : " + next.e);
            }
            this.c.clear();
            this.c = null;
        }
    }

    public final void c(IWVWebView iWVWebView, String str, IJsApiSucceedCallBack iJsApiSucceedCallBack, IJsApiFailedCallBack iJsApiFailedCallBack, urb urbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a47d5", new Object[]{this, iWVWebView, str, iJsApiSucceedCallBack, iJsApiFailedCallBack, urbVar});
            return;
        }
        v7t.i("WVJsBridge", "callMethod: url=" + str);
        if (!this.b) {
            v7t.n("WVJsBridge", "jsbridge is not init.");
            return;
        }
        final spw h = h(str);
        if (h == null) {
            v7t.n("WVJsBridge", "url format error and call canceled. url=" + str);
            return;
        }
        h.f28213a = iWVWebView;
        if (urbVar != null) {
            h.j = urbVar.getCurId();
        }
        h.d();
        if (iJsApiSucceedCallBack != null) {
            h.i = iJsApiSucceedCallBack;
        }
        if (iJsApiFailedCallBack != null) {
            h.h = iJsApiFailedCallBack;
        }
        final String url = h.f28213a.getUrl();
        if (f) {
            try {
                JSON.parse(h.f);
            } catch (Throwable th) {
                if (trw.getJsBridgeMonitor() != null) {
                    erw jsBridgeMonitor = trw.getJsBridgeMonitor();
                    String message = th.getMessage();
                    String str2 = h.f;
                    jsBridgeMonitor.commitParamParseError(url, message, str2, h.d + "." + h.e);
                }
                String str3 = h.g;
                iWVWebView.evaluateJavascript("javascript:window.WindVane&&window.WindVane.getParam(" + str3 + ");", new ValueCallback<String>() { // from class: android.taobao.windvane.jsbridge.WVJsBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* renamed from: android.taobao.windvane.jsbridge.WVJsBridge$1$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
                    public class a extends AsyncTask<Void, Integer, Void> {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public a() {
                        }

                        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/WVJsBridge$1$1");
                        }

                        /* renamed from: a */
                        public Void doInBackground(Void... voidArr) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
                            }
                            AnonymousClass1 r5 = AnonymousClass1.this;
                            WVJsBridge.this.e(h, url);
                            return null;
                        }
                    }

                    public void onReceiveValue(String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str4});
                            return;
                        }
                        if (str4.startsWith("\"")) {
                            str4 = JSON.parse(str4).toString();
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            h.f = str4;
                        }
                        new a().execute(new Void[0]);
                    }
                });
                return;
            }
        }
        new a(h, url).execute(new Void[0]);
    }

    public void e(spw spwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac5c167", new Object[]{this, spwVar, str});
            return;
        }
        v7t.i("WVJsBridge", "callMethod-obj:" + spwVar.d + " method:" + spwVar.e + " param:" + spwVar.f + " sid:" + spwVar.g);
        if (!this.f1783a || spwVar.f28213a == null) {
            try {
                if (g == null) {
                    g = Pattern.compile(vpw.commonConfig.k0);
                }
                Matcher matcher = g.matcher(str);
                if (matcher != null && matcher.matches()) {
                    v7t.d("WVJsBridge", spwVar.d + " always allow jsapi permission " + str);
                }
                v7t.d("WVJsBridge", "jsbridge is closed.");
                k(4, spwVar);
                return;
            } catch (Throwable th) {
                v7t.d("WVJsBridge", "jsbridge is closed. e：" + th);
                k(4, spwVar);
                return;
            }
        }
        if (vpw.commonConfig.l1) {
            hrw c = hrw.c();
            if (c.b(spwVar.f28213a)) {
                if (c.a(str, spwVar.d, spwVar.e, spwVar.f)) {
                    a(spwVar, str);
                    return;
                } else {
                    k(3, spwVar);
                    return;
                }
            }
        } else if (irw.c() != null && !irw.c().isEmpty()) {
            for (drw drwVar : irw.c()) {
                if (drwVar.b(spwVar.f28213a)) {
                    if (((hrw) drwVar).a(str, spwVar.d, spwVar.e, spwVar.f)) {
                        a(spwVar, str);
                        return;
                    } else {
                        k(3, spwVar);
                        return;
                    }
                }
            }
        }
        if (irw.a() != null && !irw.a().isEmpty()) {
            for (crw crwVar : irw.a()) {
                if (!crwVar.a(str, spwVar.d, spwVar.e, spwVar.f)) {
                    v7t.n("WVJsBridge", "preprocessor call fail, callMethod cancel.");
                    icn i = lcn.a(RVLLevel.Warn, "Bridge").k("apiAuthCheck", spwVar.getCurId()).m(spwVar.a()).i("3", "NO PERMISSION With Preprocessor.apiAuthCheck, processor is ".concat(crwVar.getClass().getName()));
                    i.a(spwVar.d + "#" + spwVar.e, spwVar.f).f();
                    k(3, spwVar);
                    return;
                }
            }
        }
        if (irw.b() != null && !irw.b().isEmpty()) {
            for (android.taobao.windvane.jsbridge.a aVar : irw.b()) {
                if (aVar.a(str, spwVar, new b())) {
                    v7t.n("WVJsBridge", "enter  WVAsyncAuthCheck preprocessor  ");
                    icn i2 = lcn.a(RVLLevel.Warn, "Bridge").k("AsyncApiAuthCheck", spwVar.getCurId()).m(spwVar.a()).i("3", "Preprocessor.AsyncapiAuthCheck success and then return, processor is ".concat(aVar.getClass().getName()));
                    i2.a(spwVar.d + "#" + spwVar.e, spwVar.f).f();
                    return;
                }
            }
        }
        a(spwVar, str);
    }

    public final spw h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spw) ipChange.ipc$dispatch("fadf5a23", new Object[]{this, str});
        }
        if (str != null && str.startsWith("hybrid://")) {
            try {
                spw spwVar = new spw();
                int indexOf = str.indexOf(58, 9);
                spwVar.d = str.substring(9, indexOf);
                int indexOf2 = str.indexOf(47, indexOf);
                spwVar.g = str.substring(indexOf + 1, indexOf2);
                int indexOf3 = str.indexOf(63, indexOf2);
                if (indexOf3 > 0) {
                    spwVar.e = str.substring(indexOf2 + 1, indexOf3);
                    spwVar.f = str.substring(indexOf3 + 1);
                } else {
                    spwVar.e = str.substring(indexOf2 + 1);
                }
                if (spwVar.d.length() > 0 && spwVar.g.length() > 0) {
                    if (spwVar.e.length() > 0) {
                        return spwVar;
                    }
                }
            } catch (StringIndexOutOfBoundsException unused) {
            }
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        spw spwVar = (spw) message.obj;
        if (spwVar == null) {
            v7t.d("WVJsBridge", "CallMethodContext is null, and do nothing.");
            return false;
        }
        WVCallBackContext wVCallBackContext = new WVCallBackContext(spwVar.f28213a, spwVar.g, spwVar.d, spwVar.e, spwVar.i, spwVar.h);
        Object obj = spwVar.b;
        if (obj != null) {
            wVCallBackContext.setInstancename(obj.getClass().getName());
        }
        wVCallBackContext.setPid(spwVar.j);
        String str = "{}";
        String str2 = "";
        switch (message.what) {
            case 0:
                Object obj2 = spwVar.b;
                v7t.d("WVJsBridge", "call method=[" + spwVar.d + "." + spwVar.e + "]. class=" + spwVar.b);
                kpw kpwVar = (kpw) obj2;
                String str3 = spwVar.e;
                if (!TextUtils.isEmpty(spwVar.f)) {
                    str = spwVar.f;
                }
                if (!kpwVar.executeSafe(str3, str, wVCallBackContext)) {
                    v7t.d("WVJsBridge", "WVApiPlugin execute failed.object:" + spwVar.d + ", method: " + spwVar.e);
                    k(6, spwVar);
                } else {
                    try {
                        ConcurrentHashMap<String, Integer> concurrentHashMap = IWVWebView.JsbridgeHis;
                        int i = 1;
                        String str4 = spwVar.d + "." + spwVar.e;
                        if (concurrentHashMap.containsKey(str4)) {
                            i = Integer.valueOf(concurrentHashMap.get(str4).intValue() + 1);
                        }
                        concurrentHashMap.put(str4, i);
                    } catch (Exception unused) {
                    }
                }
                if (vpw.commonConfig.F2) {
                    IWVWebView iWVWebView = spwVar.f28213a;
                    if (iWVWebView instanceof WVUCWebView) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("module", (Object) spwVar.d);
                            jSONObject.put("method", (Object) spwVar.e);
                            String cachedUrl = ((WVUCWebView) iWVWebView).getCachedUrl();
                            if (cachedUrl != null) {
                                jSONObject.put("url", (Object) cachedUrl);
                            }
                            jSONObject.put("isThemis", (Object) Boolean.valueOf(((WVUCWebView) iWVWebView).getWebViewContext().isThemis()));
                            y71.commitSuccess("BridgeInvoke", jSONObject);
                        } catch (Exception unused2) {
                        }
                    }
                }
                return true;
            case 1:
                Object obj3 = spwVar.b;
                try {
                    Method method = spwVar.c;
                    if (!TextUtils.isEmpty(spwVar.f)) {
                        str = spwVar.f;
                    }
                    method.invoke(obj3, wVCallBackContext, str);
                } catch (Exception e2) {
                    v7t.d("WVJsBridge", "call method " + spwVar.c + " exception. " + e2.getMessage());
                }
                return true;
            case 2:
                nsw nswVar = new nsw();
                nswVar.j("HY_NO_HANDLER");
                StringBuilder sb = new StringBuilder("No Method Error: method=[");
                sb.append(spwVar.d);
                sb.append(".");
                sb.append(spwVar.e);
                sb.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb.append(str2);
                sb.append("]");
                nswVar.b("msg", sb.toString());
                wVCallBackContext.error(nswVar);
                return true;
            case 3:
                nsw nswVar2 = new nsw();
                nswVar2.j("HY_NO_PERMISSION");
                StringBuilder sb2 = new StringBuilder("method=[");
                sb2.append(spwVar.d);
                sb2.append(".");
                sb2.append(spwVar.e);
                sb2.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb2.append(str2);
                sb2.append("]");
                nswVar2.b("msg", sb2.toString());
                wVCallBackContext.error(nswVar2);
                return true;
            case 4:
                nsw nswVar3 = new nsw();
                nswVar3.j("HY_CLOSED");
                StringBuilder sb3 = new StringBuilder("method=[");
                sb3.append(spwVar.d);
                sb3.append(".");
                sb3.append(spwVar.e);
                sb3.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb3.append(str2);
                sb3.append("]");
                nswVar3.b("msg", sb3.toString());
                wVCallBackContext.error(nswVar3);
                return true;
            case 5:
                nsw nswVar4 = new nsw();
                nswVar4.j("HY_NO_HANDLER");
                StringBuilder sb4 = new StringBuilder("No Class Error: method=[");
                sb4.append(spwVar.d);
                sb4.append(".");
                sb4.append(spwVar.e);
                sb4.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb4.append(str2);
                sb4.append("]");
                nswVar4.b("msg", sb4.toString());
                wVCallBackContext.error(nswVar4);
                return true;
            case 6:
                nsw nswVar5 = new nsw();
                nswVar5.j("HY_ERROR_EXECUTE");
                StringBuilder sb5 = new StringBuilder("Execute error:method=[");
                sb5.append(spwVar.d);
                sb5.append(".");
                sb5.append(spwVar.e);
                sb5.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb5.append(str2);
                sb5.append("]");
                nswVar5.b("msg", sb5.toString());
                wVCallBackContext.error(nswVar5);
                return true;
            case 7:
                nsw nswVar6 = new nsw();
                nswVar6.j("CALL_ALIAS");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                nswVar6.b("msg", str2);
                nswVar6.k();
                wVCallBackContext.commitJsBridgeReturn(nswVar6);
                return true;
            case 8:
                nsw nswVar7 = new nsw();
                nswVar7.j("HY_FAILED");
                StringBuilder sb6 = new StringBuilder("Null Context Error:");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb6.append(str2);
                nswVar7.b("msg", sb6.toString());
                wVCallBackContext.error(nswVar7);
                return true;
            default:
                return false;
        }
    }

    public synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
        }
    }

    public void f(esw eswVar, spw spwVar, IJsApiFailedCallBack iJsApiFailedCallBack, IJsApiSucceedCallBack iJsApiSucceedCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ded842e", new Object[]{this, eswVar, spwVar, iJsApiFailedCallBack, iJsApiSucceedCallBack});
        } else if (spwVar != null) {
            spwVar.h = iJsApiFailedCallBack;
            spwVar.i = iJsApiSucceedCallBack;
            if (TextUtils.isEmpty(spwVar.f)) {
                spwVar.f = "{}";
            }
            v7t.i("WVJsBridge", "before call object=[" + spwVar.d + "].");
            String str = spwVar.d;
            if (str == null || eswVar == null) {
                v7t.i("WVJsBridge", "before call param is null");
                return;
            }
            Object b = eswVar.b(str);
            spwVar.b = b;
            if (b instanceof kpw) {
                k(0, spwVar);
            } else {
                k(2, spwVar);
            }
        }
    }

    public static void a(spw spwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4875da43", new Object[]{spwVar, str});
            return;
        }
        Map<String, String> c = fsw.c(spwVar.d, spwVar.e);
        if (c != null) {
            if (v7t.h()) {
                v7t.i("WVJsBridge", "call method through alias name. newObject: " + c.get("name") + " newMethod: " + c.get("method"));
            }
            spwVar.d = c.get("name");
            spwVar.e = c.get("method");
            k(7, spwVar);
        }
        Object jsObject = spwVar.f28213a.getJsObject(spwVar.d);
        if (jsObject == null) {
            v7t.d("WVJsBridge", "callMethod: Plugin " + spwVar.d + " didn't found, you should call WVPluginManager.registerPlugin first.");
            k(5, spwVar);
        } else if (jsObject instanceof kpw) {
            spwVar.b = jsObject;
            k(0, spwVar);
        } else if (jsObject instanceof String) {
            v7t.d("WVJsBridge", "cannot call method for context is null");
            k(8, spwVar);
        } else {
            try {
                if (spwVar.e != null) {
                    Method method = jsObject.getClass().getMethod(spwVar.e, Object.class, String.class);
                    if (method.isAnnotationPresent(WindVaneInterface.class)) {
                        spwVar.b = jsObject;
                        spwVar.c = method;
                        k(1, spwVar);
                        return;
                    }
                    v7t.n("WVJsBridge", "callMethod: Method " + spwVar.e + " didn't has @WindVaneInterface annotation, obj=" + spwVar.d);
                }
            } catch (NoSuchMethodException unused) {
                v7t.d("WVJsBridge", "callMethod: Method " + spwVar.e + " didn't found. It must has two parameter, Object.class and String.class, obj=" + spwVar.d);
            }
        }
    }
}
