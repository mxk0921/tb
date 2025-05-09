package tb;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f28076a;
    public final boolean c;
    public AURARenderComponent e;
    public ViewGroup f;
    public final String g;
    public String b = null;
    public final Map<String, AURARenderComponent> d = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/rax/RaxComponentCreator$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (sin.a(sin.this) != null) {
                sin.a(sin.this).setVisibility(0);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            String b = sin.b(sin.this);
            gxu.a(b, "TAG_RAX_ERROR", "umf-render-rax", z9u.ARG_ERROR_CODE + i + ",failingUrl=" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends WVUCWebChromeClient {
        public b(sin sinVar, Context context) {
            super(context);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements djg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(sin sinVar) {
        }

        @Override // tb.djg
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.djg
        public boolean canScrollVertically() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(81789017);
    }

    public sin(String str, boolean z) {
        this.c = false;
        this.g = str;
        this.c = z;
    }

    public static /* synthetic */ WVUCWebView a(sin sinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("6a4b60c4", new Object[]{sinVar});
        }
        return sinVar.f28076a;
    }

    public static /* synthetic */ String b(sin sinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44f65c6e", new Object[]{sinVar});
        }
        return sinVar.g;
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb13e35", new Object[]{this, str, str2});
        }
        return str + "#" + str2;
    }

    public View d(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer, RaxJSBridgeApiPlugin raxJSBridgeApiPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93883259", new Object[]{this, viewGroup, aURARenderComponentContainer, raxJSBridgeApiPlugin});
        }
        if (this.f28076a == null || !this.c) {
            this.f = viewGroup;
            Context context = viewGroup.getContext();
            f();
            WVUCWebView wVUCWebView = new WVUCWebView(context);
            this.f28076a = wVUCWebView;
            wVUCWebView.setBackgroundColor(-1);
            o(viewGroup);
            this.f28076a.setWebViewClient(new a(context));
            this.f28076a.setWebChromeClient(new b(this, context));
            fsw.k(RaxJSBridgeApiPlugin.UMF_JS_BRIDGE_CLASS_NAME, raxJSBridgeApiPlugin);
            ck.g().c("RaxComponentCreator", "createView", "finish register windvane plugin:UMFJsBridge");
            this.f28076a.setVerticalScrollBarEnabled(false);
            return this.f28076a;
        }
        o(viewGroup);
        return this.f28076a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        f();
        fsw.p(RaxJSBridgeApiPlugin.UMF_JS_BRIDGE_CLASS_NAME);
        ((HashMap) this.d).clear();
        this.e = null;
        this.b = null;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5272a7c6", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f28076a;
        if (wVUCWebView != null) {
            try {
                wVUCWebView.destroy();
            } catch (Throwable th) {
                b4e a2 = dxu.a();
                a2.e("RaxComponentCreator", "destroyWebView#exception=" + th.getMessage());
            }
            this.f28076a = null;
        }
    }

    public final void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8f7829", new Object[]{this, view});
            return;
        }
        RecyclerView h = h(view);
        if (h != null) {
            RecyclerView.LayoutManager layoutManager = h.getLayoutManager();
            if (layoutManager instanceof VirtualLayoutManager) {
                ((VirtualLayoutManager) layoutManager).x0(new c(this));
            }
        }
    }

    public final RecyclerView h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("87a5d15", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return h((View) parent);
        }
        return null;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.b;
    }

    public String j(AURARenderComponent aURARenderComponent) {
        String str;
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
            str = null;
        } else {
            str = aURARenderComponentContainer.containerType + "_" + aURARenderComponentContainer.name + "_" + aURARenderComponentContainer.version;
        }
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            dxu.a().e("RaxComponentCreator", "getItemViewType#failed to get itemViewType from component, use system time instead, component=" + aURARenderComponent);
        }
        return str + System.currentTimeMillis();
    }

    public final String k() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c3b369a", new Object[]{this});
        }
        AURARenderComponent l = l("");
        if (l == null || (jSONObject = l.protocol) == null) {
            return null;
        }
        return jSONObject.toJSONString();
    }

    public AURARenderComponent l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("441d998d", new Object[]{this, str});
        }
        AURARenderComponent aURARenderComponent = (AURARenderComponent) ((HashMap) this.d).get(str);
        if (aURARenderComponent == null) {
            return this.e;
        }
        return aURARenderComponent;
    }

    public final void m(fyc fycVar, tin tinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db648ba5", new Object[]{this, fycVar, tinVar});
        } else if (fycVar != null) {
            fycVar.n(tinVar);
        }
    }

    public final void o(ViewGroup viewGroup) {
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adeeecff", new Object[]{this, viewGroup});
            return;
        }
        int height = viewGroup.getHeight();
        if (height <= 0) {
            if (xh.d(viewGroup.getContext())) {
                d = xh.a(viewGroup.getContext());
            } else {
                d = ai.d();
            }
            height = d;
        }
        this.f28076a.setLayoutParams(new ViewGroup.LayoutParams(-1, height));
    }

    public void n(AURARenderComponent aURARenderComponent, View view, fyc fycVar, tin tinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ded42a4", new Object[]{this, aURARenderComponent, view, fycVar, tinVar});
            return;
        }
        m(fycVar, tinVar);
        this.e = aURARenderComponent;
        if (view instanceof WVUCWebView) {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData == null) {
                dxu.a().e("RaxComponentCreator", "renderView#data is null");
                gxu.a(this.g, "TAG_RAX_ERROR", "umf-render-rax", "renderView#data is null");
                return;
            }
            AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
            if (aURARenderComponentContainer == null) {
                dxu.a().e("RaxComponentCreator", "renderView#container is null");
                gxu.a(this.g, "TAG_RAX_ERROR", "umf-render-rax", "renderView#container is null");
                return;
            }
            String str = aURARenderComponentContainer.url;
            if (TextUtils.isEmpty(str)) {
                dxu.a().e("RaxComponentCreator", "renderView#url is empty");
                gxu.a(this.g, "TAG_RAX_ERROR", "umf-render-rax", "renderView#url is empty");
                return;
            }
            g(this.f);
            WVUCWebView wVUCWebView = (WVUCWebView) view;
            String str2 = aURARenderComponent.key;
            if (TextUtils.isEmpty(str2)) {
                dxu.a().e("RaxComponentCreator", "renderView#componentKey is empty");
                gxu.a(this.g, "TAG_RAX_ERROR", "umf-render-rax", "renderView#componentKey is empty");
                return;
            }
            if (!this.c || !c(str, str2).equals(this.b)) {
                if (!TextUtils.isEmpty(wVUCWebView.getCurrentUrl())) {
                    wVUCWebView.setVisibility(4);
                }
                wVUCWebView.loadUrl(str);
                this.b = c(str, str2);
            } else {
                eex.a(this.f28076a, eex.BRIDGE_EVENT_UPDATE, k());
            }
            ((HashMap) this.d).put(str2, aURARenderComponent);
        }
    }
}
