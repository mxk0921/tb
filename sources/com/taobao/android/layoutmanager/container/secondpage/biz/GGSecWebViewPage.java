package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.browser.jsbridge.TBNative;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.bod;
import tb.c3a;
import tb.fsw;
import tb.kpw;
import tb.nsw;
import tb.nwv;
import tb.od0;
import tb.slo;
import tb.t2o;
import tb.xe;
import tb.ye;
import tb.yj4;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GGSecWebViewPage extends xe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context b;
    public WVUCWebView c;
    public c e;
    public boolean d = false;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final Runnable g = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class GGWindowInfoPlugin extends WindvanePluginRegister.WVWindowInfoPlugin {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502268071);
        }

        public static /* synthetic */ Object ipc$super(GGWindowInfoPlugin gGWindowInfoPlugin, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecWebViewPage$GGWindowInfoPlugin");
        }

        @Override // com.taobao.android.layoutmanager.setup.WindvanePluginRegister.WVWindowInfoPlugin, tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT.equals(str)) {
                return false;
            }
            nsw nswVar = new nsw();
            nswVar.k();
            nswVar.a("height", Integer.valueOf(getStatusBarHeight(this.mContext)));
            wVCallBackContext.success(nswVar);
            return true;
        }

        private int getStatusBarHeight(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
            }
            try {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    return context.getResources().getDimensionPixelSize(identifier);
                }
                return 0;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class SecPageBackPlugin extends TBNative {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502268073);
        }

        private ye<?> findSecPageWrapper(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ye) ipChange.ipc$dispatch("ebda0446", new Object[]{this, activity});
            }
            if (!(activity instanceof bod)) {
                return null;
            }
            return ((bod) activity).findSecPageWrapper();
        }

        public static /* synthetic */ Object ipc$super(SecPageBackPlugin secPageBackPlugin, String str, Object... objArr) {
            if (str.hashCode() == -1126948911) {
                return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecWebViewPage$SecPageBackPlugin");
        }

        @WindVaneInterface
        public void back(WVCallBackContext wVCallBackContext, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e631bf35", new Object[]{this, wVCallBackContext, str});
                return;
            }
            wVCallBackContext.success();
            ye<?> findSecPageWrapper = findSecPageWrapper((Activity) wVCallBackContext.getWebview().getContext());
            if (findSecPageWrapper != null) {
                findSecPageWrapper.a();
            }
        }

        @Override // com.taobao.browser.jsbridge.TBNative, tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!"nativeBack".equals(str)) {
                return super.execute(str, str2, wVCallBackContext);
            }
            back(wVCallBackContext, str2);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Object obj) {
            super(obj);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecWebViewPage$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GGSecWebViewPage.j(GGSecWebViewPage.this, this.f8196a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!GGSecWebViewPage.k(GGSecWebViewPage.this)) {
                GGSecWebViewPage.l(GGSecWebViewPage.this).postDelayed(this, 100L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public abstract class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Object f8196a;

        static {
            t2o.a(502268072);
        }

        public c(Object obj) {
            this.f8196a = obj;
        }
    }

    static {
        t2o.a(502268067);
    }

    public GGSecWebViewPage() {
        od0.D().d().a("TNode", 19999, "GGSecWebViewPageCreate", null, null, "");
    }

    public static /* synthetic */ Object ipc$super(GGSecWebViewPage gGSecWebViewPage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecWebViewPage");
    }

    public static /* synthetic */ void j(GGSecWebViewPage gGSecWebViewPage, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1afd10", new Object[]{gGSecWebViewPage, obj});
        } else {
            gGSecWebViewPage.m(obj);
        }
    }

    public static /* synthetic */ boolean k(GGSecWebViewPage gGSecWebViewPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d7f8bf9", new Object[]{gGSecWebViewPage})).booleanValue();
        }
        return gGSecWebViewPage.n();
    }

    public static /* synthetic */ Handler l(GGSecWebViewPage gGSecWebViewPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("769a9150", new Object[]{gGSecWebViewPage});
        }
        return gGSecWebViewPage.f;
    }

    @Override // tb.xe
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98b0527", new Object[]{this, obj, str});
        } else if (obj instanceof String) {
            o();
            if (this.d) {
                m(obj);
            } else {
                this.e = new a(obj);
            }
        }
    }

    @Override // tb.xe
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd52081", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.xe
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.b = context;
        return LayoutInflater.from(context).inflate(R.layout.layout_second_page, (ViewGroup) null);
    }

    @Override // tb.xe
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.onPause();
        }
    }

    @Override // tb.xe
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
    }

    @Override // tb.xe
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
            fsw.o(this.c);
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // tb.xe
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.fireEvent("guangguangOnUserReset", new JSONObject().toJSONString());
        }
    }

    @Override // tb.xe
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ac292d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232a369f", new Object[]{this, obj});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse((String) obj);
            for (String str : parse.getQueryParameterNames()) {
                jSONObject.put(str, (Object) parse.getQueryParameter(str));
            }
        } catch (Throwable unused) {
        }
        if (!jSONObject.isEmpty()) {
            String jSONString = jSONObject.toJSONString();
            od0.D().d().a("TNode", 19999, "GGSecWebViewPageUpdate", jSONString, null, "");
            this.c.fireEvent("guangguangOnUserChange", jSONString);
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("822736e1", new Object[]{this})).booleanValue();
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null && !wVUCWebView.isDestroied() && this.c.getProgress() < 100) {
            return false;
        }
        r();
        return true;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1bea898", new Object[]{this});
        } else if (this.c == null) {
            WVUCWebView wVUCWebView = new WVUCWebView(this.b);
            this.c = wVUCWebView;
            wVUCWebView.loadUrl(q());
            fsw.g(this.c, "WVNative", SecPageBackPlugin.class);
            fsw.g(this.c, WindvanePluginRegister.WVWindowInfoPlugin.CLASS_NAME, GGWindowInfoPlugin.class);
            fsw.g(this.c, GGUTPlugin.CLASS_NAME, GGUTPlugin.class);
            this.f.post(this.g);
            ((ViewGroup) i(this.b)).addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        try {
            if (EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.PRE.getValue()) {
                return "market.wapa.taobao.com";
            }
            return "market.m.taobao.com";
        } catch (Throwable unused) {
            return "market.m.taobao.com";
        }
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9947696f", new Object[]{this});
        }
        return new Uri.Builder().scheme("https").authority(p()).path("/app/mtb/personal-homepage/pages/index/index.html").appendQueryParameter("disableNav", slo.VALUE_YES).appendQueryParameter("loadmode", "dynamic").build().toString();
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed24f6e6", new Object[]{this});
            return;
        }
        this.d = true;
        c cVar = this.e;
        if (cVar != null) {
            nwv.A0(cVar, 100L);
            this.e = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class GGUTPlugin extends kpw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_NAME = "track";
        public static final String CLASS_NAME = "WVPageTrackerPlugin";

        static {
            t2o.a(502268070);
        }

        public static /* synthetic */ Object ipc$super(GGUTPlugin gGUTPlugin, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecWebViewPage$GGUTPlugin");
        }

        private Map<String, String> json2Map(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5551f7cc", new Object[]{this, jSONObject});
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return hashMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.kpw
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            Map firstPageProperty;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!"track".equals(str)) {
                return false;
            }
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject == null) {
                wVCallBackContext.error();
                return true;
            }
            String currentUrl = ((WVUCWebView) this.mWebView).getCurrentUrl();
            try {
                JSONArray jSONArray = parseObject.getJSONArray("spm-cnt");
                String string = jSONArray.getString(0);
                String string2 = jSONArray.getString(1);
                parseObject.put("spm-cnt", (Object) (string + "." + string2 + ".0.0"));
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(currentUrl)) {
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.mContext, currentUrl);
                Map<String, String> json2Map = json2Map(parseObject);
                if ((this.mWebView.getContext() instanceof bod) && (firstPageProperty = ((bod) this.mWebView.getContext()).getFirstPageProperty()) != null) {
                    Object z = c3a.a((bod) this.mWebView.getContext()).z();
                    String str3 = firstPageProperty.get("spm-cnt") != null ? firstPageProperty.get("spm-cnt") : null;
                    try {
                        if (z instanceof String) {
                            Uri parse = Uri.parse((String) z);
                            String queryParameter = parse.getQueryParameter("spm");
                            str3 = str3;
                            if (queryParameter != null) {
                                str3 = queryParameter;
                            }
                            String queryParameter2 = parse.getQueryParameter(yj4.PARAM_UT_PARAMS);
                            if (queryParameter2 != null) {
                                JSONObject parseObject2 = JSON.parseObject(Uri.decode(queryParameter2.toString()));
                                Object obj = json2Map.get(z9u.KEY_UTPARAM_URL);
                                if (obj == null) {
                                    obj = new JSONObject();
                                }
                                if (!(obj instanceof Map)) {
                                    obj = JSON.parseObject(obj.toString());
                                }
                                if (parseObject2 != null) {
                                    ((Map) obj).putAll(parseObject2);
                                    json2Map.put(z9u.KEY_UTPARAM_URL, JSON.toJSONString(obj));
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    if (str3 != null) {
                        json2Map.put("spm-url", str3);
                    }
                }
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.mContext, json2Map);
                if (this.mWebView.getContext() instanceof bod) {
                    ((bod) this.mWebView.getContext()).setSecondPageName(currentUrl);
                    ((bod) this.mWebView.getContext()).setSecondPageProperty(json2Map);
                }
                return true;
            }
            wVCallBackContext.error();
            return true;
        }
    }
}
