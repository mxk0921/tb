package tb;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.ScrollConflictWebView;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.uc.webview.export.extension.RenderProcessGoneDetail;
import java.util.HashMap;
import java.util.Map;
import tb.ni8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j1x extends Component<ViewGroup, f> implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21707a;
    public boolean b;
    public String c;
    public ViewGroup d;
    public ViewGroup e;
    public WVUCWebView f;
    public final com.taobao.tao.flexbox.layoutmanager.core.b g = new a();
    public final com.taobao.tao.flexbox.layoutmanager.core.b h = new b(this);
    public final com.taobao.tao.flexbox.layoutmanager.core.b i = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends b.b0<ViewGroup, f> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/WebViewComponent$1");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, ViewGroup viewGroup, f fVar, n.f fVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("116bc9b1", new Object[]{this, eVar, viewGroup, fVar, fVar2});
            } else if (viewGroup != null && fVar != null) {
                if (TextUtils.isEmpty(fVar.w0) || TextUtils.equals(j1x.h(j1x.this), fVar.w0)) {
                    tfs.e(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "attr.src is empty or same, " + fVar.w0);
                    return;
                }
                j1x.i(j1x.this, fVar.w0);
                tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "loadUrl url: " + j1x.h(j1x.this));
                j1x.j(j1x.this).loadUrl(j1x.h(j1x.this));
                j1x j1xVar = j1x.this;
                j1x.l(j1xVar, 0, j1x.k(j1xVar), j1x.h(j1x.this), "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends b.b0<ViewGroup, f> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(j1x j1xVar) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/WebViewComponent$2");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, ViewGroup viewGroup, f fVar, n.f fVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("116bc9b1", new Object[]{this, eVar, viewGroup, fVar, fVar2});
            } else if (viewGroup != null && fVar != null) {
                if (fVar.x0) {
                    tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "setBackgroundColor TRANSPARENT");
                    viewGroup.setBackgroundColor(0);
                    return;
                }
                tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "setBackgroundColor WHITE");
                viewGroup.setBackgroundColor(-1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends b.b0<ViewGroup, f> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/WebViewComponent$3");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, ViewGroup viewGroup, f fVar, n.f fVar2) {
            atw atwVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("116bc9b1", new Object[]{this, eVar, viewGroup, fVar, fVar2});
            } else if (viewGroup != null && fVar != null && j1x.j(j1x.this) != null) {
                WVUCWebView j = j1x.j(j1x.this);
                if (fVar.y0) {
                    atwVar = new atw(viewGroup.getContext(), j1x.j(j1x.this));
                } else {
                    atwVar = new e(viewGroup.getContext(), j1x.j(j1x.this));
                }
                j.setWvUIModel(atwVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends atw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f21709a;
        public View b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ni8.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.ni8.c
            public void onRetry() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2145010", new Object[]{this});
                } else if (j1x.j(j1x.this) != null && !TextUtils.isEmpty(j1x.h(j1x.this))) {
                    j1x.j(j1x.this).reload();
                    e.this.hideErrorPage();
                    tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onClick errorView refresh load url: " + j1x.h(j1x.this));
                }
            }
        }

        static {
            t2o.a(502268245);
        }

        public e(Context context, WVUCWebView wVUCWebView) {
            super(context, wVUCWebView);
            this.f21709a = context;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1246152312) {
                super.loadErrorPage();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/WebViewComponent$CustomErrorUIModel");
        }

        public final View createErrorView(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("5c1702c4", new Object[]{this, str});
            }
            return ni8.b(j1x.this.getNode().N(), j1x.h(j1x.this), null, str, ((f) j1x.n(j1x.this)).z0, new a());
        }

        @Override // tb.atw
        public void loadErrorPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            } else {
                loadErrorPage("ANDROID_SYS_NETWORK_ERROR");
            }
        }

        public void loadErrorPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37044242", new Object[]{this, str});
                return;
            }
            if (this.b == null && (xpw.a(this.f21709a) instanceof Activity)) {
                View createErrorView = createErrorView(str);
                this.b = createErrorView;
                setErrorView(createErrorView);
            }
            super.loadErrorPage();
        }
    }

    static {
        t2o.a(502268240);
        t2o.a(503317092);
    }

    public static /* synthetic */ String h(j1x j1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c8c746b", new Object[]{j1xVar});
        }
        return j1xVar.c;
    }

    public static /* synthetic */ String i(j1x j1xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57c6bf23", new Object[]{j1xVar, str});
        }
        j1xVar.c = str;
        return str;
    }

    public static /* synthetic */ Object ipc$super(j1x j1xVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2043760425:
                super.onInitAttrs((com.taobao.tao.flexbox.layoutmanager.core.e) objArr[0], (View) objArr[1], (jfw) objArr[2], (n.f) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/WebViewComponent");
        }
    }

    public static /* synthetic */ WVUCWebView j(j1x j1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("7ca8da43", new Object[]{j1xVar});
        }
        return j1xVar.f;
    }

    public static /* synthetic */ boolean k(j1x j1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("721f097", new Object[]{j1xVar})).booleanValue();
        }
        return j1xVar.b;
    }

    public static /* synthetic */ void l(j1x j1xVar, int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9441b7", new Object[]{j1xVar, new Integer(i), new Boolean(z), str, str2});
        } else {
            j1xVar.t(i, z, str, str2);
        }
    }

    public static /* synthetic */ void m(j1x j1xVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce18e75", new Object[]{j1xVar, str, jSONObject});
        } else {
            j1xVar.w(str, jSONObject);
        }
    }

    public static /* synthetic */ jfw n(j1x j1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("10e310c3", new Object[]{j1xVar});
        }
        return j1xVar.viewParams;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        o();
        this.f21707a = 0;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5272a7c6", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f;
        if (wVUCWebView != null) {
            if (wVUCWebView.getParent() != null) {
                ((ViewGroup) this.f.getParent()).removeView(this.f);
            }
            this.f.destroy();
            this.f = null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onHandleTNodeMessage");
        return false;
    }

    /* renamed from: p */
    public f generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d22f9628", new Object[]{this});
        }
        return new f();
    }

    public final WVUCWebView q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("cb941d9a", new Object[]{this, context});
        }
        ScrollConflictWebView scrollConflictWebView = new ScrollConflictWebView(context);
        scrollConflictWebView.setBackgroundColor(0);
        scrollConflictWebView.setTag(this);
        ygl yglVar = new ygl(context);
        yglVar.a(new d());
        scrollConflictWebView.setWebViewClient(yglVar);
        return scrollConflictWebView;
    }

    /* renamed from: r */
    public void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.e eVar, ViewGroup viewGroup, f fVar, n.f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4873dc2c", new Object[]{this, eVar, viewGroup, fVar, fVar2});
            return;
        }
        super.onInitAttrs(eVar, viewGroup, fVar, fVar2);
        this.h.c(eVar, this.f, fVar, fVar2);
        this.i.c(eVar, this.f, fVar, fVar2);
        this.g.c(eVar, this.f, fVar, fVar2);
    }

    public void s(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261b0311", new Object[]{this, str, map});
            return;
        }
        tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "sendMessage2TNode name: " + str + " args: " + map);
        sendMessage(getNode(), str, null, map, null);
    }

    public final void t(int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50924cb1", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
            return;
        }
        this.f21707a = i;
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        hashMap.put("appear", Boolean.valueOf(z));
        hashMap.put("url", str);
        hashMap.put("error", str2);
        s("onstatechanged", hashMap);
    }

    public final void u(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21dd1e73", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.toJSONString();
        }
        v(str);
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5a10a7", new Object[]{this, str});
        } else if (this.f != null) {
            try {
                tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "sendToWebMessage eventName: onTNodeMessage eventData: " + str);
                WVStandardEventCenter.postNotificationToJS(this.f, "onTNodeMessage", str);
            } catch (Exception e2) {
                tfs.e(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "postNotificationToJS Exception: " + e2.getMessage());
            }
        }
    }

    public final void w(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408f1b29", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("args", (Object) jSONObject);
        u(jSONObject2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ece {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f21708a = false;

        public d() {
        }

        @Override // tb.ece
        public void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("197e2a71", new Object[]{this, renderProcessGoneDetail});
            }
        }

        @Override // tb.ece
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            tfs.e(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "webView onFailed error: " + str);
            j1x j1xVar = j1x.this;
            j1x.l(j1xVar, 3, j1x.k(j1xVar), j1x.h(j1x.this), str);
        }

        @Override // tb.ece
        public void onFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "webView onFinish url: " + str);
            j1x j1xVar = j1x.this;
            j1x.l(j1xVar, 2, j1x.k(j1xVar), str, "");
            if (j1x.k(j1x.this) && !this.f21708a) {
                j1x.m(j1x.this, "onwillappear", null);
                this.f21708a = true;
            }
        }

        @Override // tb.ece
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "webView onStart url: " + str);
            this.f21708a = false;
            j1x j1xVar = j1x.this;
            j1x.l(j1xVar, 1, j1x.k(j1xVar), str, "");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public ViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4783d8d4", new Object[]{this, context});
        }
        tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onCreateView");
        this.d = new FrameLayout(context);
        this.e = new FrameLayout(context);
        WVUCWebView q = q(context);
        this.f = q;
        q.setWvUIModel(new e(context, this.f));
        this.e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        this.d.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
        return this.d;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_HIDE_DEFAULT_ERROR_VIEW = "hideDefaultErrorView";
        public static final String KEY_OPAQUE = "opaque";
        public String w0;
        public boolean x0;
        public boolean y0;
        public String z0;

        static {
            t2o.a(502268247);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/webview/WebViewComponent$WebViewParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
            if (r9.equals("error-page") == false) goto L_0x0044;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                r0 = 3
                r1 = 2
                r2 = 1
                r3 = 0
                com.android.alibaba.ip.runtime.IpChange r4 = tb.j1x.f.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x001b
                java.lang.String r5 = "e7bb1f3f"
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r3] = r7
                r6[r2] = r8
                r6[r1] = r9
                r6[r0] = r10
                r4.ipc$dispatch(r5, r6)
                return
            L_0x001b:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r4 = "parseExtraViewParams key: "
                r8.<init>(r4)
                r8.append(r9)
                java.lang.String r4 = " value: "
                r8.append(r4)
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                java.lang.String r4 = "WebViewComponent"
                tb.tfs.i(r4, r8)
                r9.hashCode()
                java.lang.String r8 = ""
                r4 = -1
                int r5 = r9.hashCode()
                switch(r5) {
                    case -1010695135: goto L_0x0067;
                    case 114148: goto L_0x005b;
                    case 1577082094: goto L_0x004f;
                    case 1589884724: goto L_0x0046;
                    default: goto L_0x0044;
                }
            L_0x0044:
                r0 = -1
                goto L_0x0072
            L_0x0046:
                java.lang.String r1 = "error-page"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0072
                goto L_0x0044
            L_0x004f:
                java.lang.String r0 = "hideDefaultErrorView"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0059
                goto L_0x0044
            L_0x0059:
                r0 = 2
                goto L_0x0072
            L_0x005b:
                java.lang.String r0 = "src"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0065
                goto L_0x0044
            L_0x0065:
                r0 = 1
                goto L_0x0072
            L_0x0067:
                java.lang.String r0 = "opaque"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0071
                goto L_0x0044
            L_0x0071:
                r0 = 0
            L_0x0072:
                switch(r0) {
                    case 0: goto L_0x008b;
                    case 1: goto L_0x0084;
                    case 2: goto L_0x007d;
                    case 3: goto L_0x0076;
                    default: goto L_0x0075;
                }
            L_0x0075:
                goto L_0x0091
            L_0x0076:
                java.lang.String r8 = tb.nwv.I(r10, r8)
                r7.z0 = r8
                goto L_0x0091
            L_0x007d:
                boolean r8 = tb.nwv.o(r10, r3)
                r7.y0 = r8
                goto L_0x0091
            L_0x0084:
                java.lang.String r8 = tb.nwv.I(r10, r8)
                r7.w0 = r8
                goto L_0x0091
            L_0x008b:
                boolean r8 = tb.nwv.o(r10, r2)
                r7.x0 = r8
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.j1x.f.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r6.equals("src") == false) goto L_0x0037;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.j1x.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "d23a2ffb"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = (com.taobao.tao.flexbox.layoutmanager.core.b) r6
            return r6
        L_0x0018:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getAttributeHandler attrName: "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "WebViewComponent"
            tb.tfs.i(r4, r3)
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1010695135: goto L_0x004f;
                case 114148: goto L_0x0045;
                case 1577082094: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            r0 = -1
            goto L_0x005a
        L_0x0039:
            java.lang.String r0 = "hideDefaultErrorView"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x0037
        L_0x0043:
            r0 = 2
            goto L_0x005a
        L_0x0045:
            java.lang.String r1 = "src"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x005a
            goto L_0x0037
        L_0x004f:
            java.lang.String r0 = "opaque"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0059
            goto L_0x0037
        L_0x0059:
            r0 = 0
        L_0x005a:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0065;
                case 2: goto L_0x0062;
                default: goto L_0x005d;
            }
        L_0x005d:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = super.getAttributeHandler(r6)
            return r6
        L_0x0062:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = r5.i
            return r6
        L_0x0065:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = r5.g
            return r6
        L_0x0068:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = r5.h
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j1x.getAttributeHandler(java.lang.String):com.taobao.tao.flexbox.layoutmanager.core.b");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r9.equals("postMessage") == false) goto L_0x004c;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10, com.taobao.tao.flexbox.layoutmanager.ac.d.k r11) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.j1x.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0025
            java.lang.String r5 = "9f789b95"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            r8 = 4
            r6[r8] = r11
            java.lang.Object r8 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0025:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "invoke name: "
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r5 = " params: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "WebViewComponent"
            tb.tfs.i(r5, r4)
            r9.hashCode()
            r4 = -1
            int r5 = r9.hashCode()
            switch(r5) {
                case -1982943011: goto L_0x0070;
                case -1240638001: goto L_0x0064;
                case -934641255: goto L_0x0058;
                case 1490029383: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            r0 = -1
            goto L_0x007b
        L_0x004e:
            java.lang.String r1 = "postMessage"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x007b
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "reload"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x004c
        L_0x0062:
            r0 = 2
            goto L_0x007b
        L_0x0064:
            java.lang.String r0 = "goback"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x004c
        L_0x006e:
            r0 = 1
            goto L_0x007b
        L_0x0070:
            java.lang.String r0 = "goforward"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x007a
            goto L_0x004c
        L_0x007a:
            r0 = 0
        L_0x007b:
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x008c;
                case 2: goto L_0x0084;
                case 3: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            r2 = 0
            goto L_0x009b
        L_0x0080:
            r7.u(r10)
            goto L_0x009b
        L_0x0084:
            android.taobao.windvane.extra.uc.WVUCWebView r0 = r7.f
            if (r0 == 0) goto L_0x009b
            r0.reload()
            goto L_0x009b
        L_0x008c:
            android.taobao.windvane.extra.uc.WVUCWebView r0 = r7.f
            if (r0 == 0) goto L_0x009b
            r0.goBack()
            goto L_0x009b
        L_0x0094:
            android.taobao.windvane.extra.uc.WVUCWebView r0 = r7.f
            if (r0 == 0) goto L_0x009b
            r0.goForward()
        L_0x009b:
            if (r2 != 0) goto L_0x00a1
            boolean r2 = super.invoke(r8, r9, r10, r11)
        L_0x00a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j1x.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        String str = gVar.d;
        tfs.i(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onHandleMessage name: " + str + " args: " + gVar.e);
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -552345454:
                if (str.equals("onwilldisappear")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1228998971:
                if (str.equals("ondestroy")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1729966319:
                if (str.equals("onforcerefresh")) {
                    c2 = 2;
                    break;
                }
                break;
            case 2122668806:
                if (str.equals("onwillappear")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.b = false;
                if (2 == this.f21707a) {
                    w(str, JSON.parseObject(JSON.toJSONString(gVar.e)));
                    break;
                }
                break;
            case 1:
                o();
                break;
            case 2:
                w(str, JSON.parseObject(JSON.toJSONString(gVar.e)));
                break;
            case 3:
                this.b = true;
                int i = this.f21707a;
                if (2 != i) {
                    if (3 == i && this.f != null && !TextUtils.isEmpty(this.c)) {
                        tfs.e(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onHandleMessage  try reload");
                        this.f.loadUrl(this.c);
                        break;
                    }
                } else {
                    w(str, JSON.parseObject(JSON.toJSONString(gVar.e)));
                    break;
                }
                break;
        }
        return false;
    }
}
