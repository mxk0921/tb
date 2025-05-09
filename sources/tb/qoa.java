package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.DWPenetrateFrameLayout;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.taolivecontainer.TBLiveWebView;
import com.taobao.themis.external.embed.TMSEmbed;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;
import tb.bce;
import tb.pu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qoa extends pu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_LAUNCH_OPTIMIZATION = "codeLaunchOptimization";
    public static final String y = qoa.class.getSimpleName();
    public final ukr m;
    public nkr n;
    public TBLiveH5Container o;
    public zmr p;
    public AliUrlImageView q;
    public khf r;
    public final bce s;
    public int u;
    public long v;
    public boolean t = false;
    public final Runnable w = new g();
    public final TMSEmbed.a x = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bce.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bce.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99bb3950", new Object[]{this});
            } else {
                onUCCorePrepared();
            }
        }

        @Override // tb.bce.a
        public void onUCCorePrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
                return;
            }
            if (qoa.M(qoa.this) != null) {
                qoa.O(qoa.this).post(qoa.N(qoa.this));
            }
            qoa.this.t = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -799572052) {
                super.d();
                return null;
            } else if (hashCode == 2123836685) {
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/H5Container$3");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            qoa qoaVar = qoa.this;
            qoa.y(qoaVar, qoa.x(qoaVar));
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            super.l(str, str2);
            qoa.A(qoa.this, str, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            v2s.o().A().c(qoa.v(), "TBLiveWVPlugin.event.closeInteractiveComponent");
            qoa.this.S("TBLiveWVPlugin.event.closeInteractiveComponent", "");
            qoa.z(qoa.this).setVisibility(8);
            View view2 = qoa.this.getView();
            if (view2 instanceof DWPenetrateFrameLayout) {
                ((DWPenetrateFrameLayout) view2).setHasShowingComponent(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TBLiveH5Container tBLiveH5Container;
            zmr zmrVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            jbu.a(qoa.v(), "onUCCorePrepared start");
            if (qoa.w(qoa.this) != null) {
                if (tws.z()) {
                    qoa.this.V();
                    if (!TextUtils.isEmpty(qoa.this.g) && (zmrVar = qoa.this.p) != null && !h5m.a(zmrVar.b(), qoa.this.g)) {
                        qoa qoaVar = qoa.this;
                        qoaVar.o(qoaVar.g);
                    }
                } else {
                    qoa.this.W();
                    if (iw0.j(qoa.H(qoa.this))) {
                        qoa qoaVar2 = qoa.this;
                        if (qoaVar2.o != null) {
                            Context J = qoa.J(qoaVar2);
                            b1u.b(J, "WebView " + qoa.this.o.getCurrentViewCoreType());
                        }
                    }
                    if (!TextUtils.isEmpty(qoa.this.g) && (tBLiveH5Container = qoa.this.o) != null && !h5m.a(tBLiveH5Container.getUrl(), qoa.this.g)) {
                        qoa qoaVar3 = qoa.this;
                        qoaVar3.o(qoaVar3.g);
                    }
                }
                String v = qoa.v();
                jbu.a(v, "onUCCorePrepared " + (System.currentTimeMillis() - currentTimeMillis) + " " + (System.currentTimeMillis() - qoa.K(qoa.this)));
            }
            if (qoa.L(qoa.this) != null) {
                qoa.L(qoa.this).release();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699878);
        }

        public i(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/H5Container$WVWebViewClient");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            } else {
                qoa.y(qoa.this, webView);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            } else {
                qoa.A(qoa.this, String.valueOf(i), str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            if (sslError != null) {
                str = sslError.toString();
            } else {
                str = "";
            }
            qoa.A(qoa.this, "SslError", str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class j implements zdb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699876);
            t2o.a(1027604493);
        }

        @Override // tb.zdb
        public String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("86036ea6", new Object[]{this, str, str2, str3});
            }
            return v2s.o().p().b(str, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class k implements z1e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ukr f26852a;

        static {
            t2o.a(295699877);
            t2o.a(1027604494);
        }

        public k(ukr ukrVar) {
            this.f26852a = ukrVar;
        }

        @Override // tb.z1e
        public void a(String str, String str2, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10db17d0", new Object[]{this, str, str2, hashMap});
            } else {
                jbu.f(this.f26852a, str, str2, hashMap);
            }
        }

        @Override // tb.z1e
        public void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("686d1575", new Object[]{this, str, str2, str3});
                return;
            }
            y7t.a(str + "_" + str2, str3);
        }

        @Override // tb.z1e
        public void c(String str, String str2, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f19d48be", new Object[]{this, str, str2, hashMap});
            } else {
                jbu.c(this.f26852a, str, str2, hashMap);
            }
        }
    }

    static {
        t2o.a(295699871);
    }

    public qoa(Context context, ukr ukrVar, ViewGroup viewGroup, bce bceVar, Map<String, String> map) {
        super(context, viewGroup, map, "openWebViewLayer", false);
        this.m = ukrVar;
        this.s = bceVar;
        Y();
    }

    public static /* synthetic */ void A(qoa qoaVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30782670", new Object[]{qoaVar, str, str2});
        } else {
            qoaVar.B(str, str2);
        }
    }

    public static /* synthetic */ Context H(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c210990d", new Object[]{qoaVar});
        }
        return qoaVar.e;
    }

    public static /* synthetic */ Context J(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("dbbfddce", new Object[]{qoaVar});
        }
        return qoaVar.e;
    }

    public static /* synthetic */ long K(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b96d588b", new Object[]{qoaVar})).longValue();
        }
        return qoaVar.v;
    }

    public static /* synthetic */ bce L(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bce) ipChange.ipc$dispatch("3b1bc138", new Object[]{qoaVar});
        }
        return qoaVar.s;
    }

    public static /* synthetic */ ViewGroup M(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("923945dc", new Object[]{qoaVar});
        }
        return qoaVar.f26301a;
    }

    public static /* synthetic */ Runnable N(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f540d37a", new Object[]{qoaVar});
        }
        return qoaVar.w;
    }

    public static /* synthetic */ ViewGroup O(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1802841a", new Object[]{qoaVar});
        }
        return qoaVar.f26301a;
    }

    public static /* synthetic */ Object ipc$super(qoa qoaVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.m();
                return null;
            case -1504501726:
                super.i();
                return null;
            case -982140627:
                super.h(((Boolean) objArr[0]).booleanValue());
                return null;
            case 797441118:
                super.j();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/H5Container");
        }
    }

    public static /* synthetic */ String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return y;
    }

    public static /* synthetic */ Context w(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a861544c", new Object[]{qoaVar});
        }
        return qoaVar.e;
    }

    public static /* synthetic */ View x(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff292e04", new Object[]{qoaVar});
        }
        return qoaVar.b;
    }

    public static /* synthetic */ void y(qoa qoaVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17de1ef", new Object[]{qoaVar, view});
        } else {
            qoaVar.C(view);
        }
    }

    public static /* synthetic */ AliUrlImageView z(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("1bbd81a6", new Object[]{qoaVar});
        }
        return qoaVar.q;
    }

    public final void B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c36df30", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> m = igq.n().m();
        m.put("sceneType", yj4.MODULE_H5_CONTAINER);
        m.put("url", this.g);
        igq.n().c("liveroomH5Render", JSON.toJSONString(m), str2, str);
        pu.b bVar = this.d;
        if (bVar != null) {
            bVar.a(String.valueOf(str), str2);
        }
    }

    public final void C(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4045ec05", new Object[]{this, view});
            return;
        }
        Map<String, String> m = igq.n().m();
        m.put("sceneType", yj4.MODULE_H5_CONTAINER);
        m.put("url", this.g);
        igq.n().e("liveroomH5Render", JSON.toJSONString(m));
        pu.b bVar = this.d;
        if (bVar != null) {
            bVar.renderSuccess(view);
        }
        khf khfVar = this.r;
        if (khfVar != null) {
            khfVar.e();
        }
        String str = y;
        jbu.a(str, "initWebView onPageFinished " + (System.currentTimeMillis() - this.v));
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9177a561", new Object[]{this});
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.destroy();
            this.o = null;
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            zmrVar.destroy();
            this.p = null;
        }
        nkr nkrVar = this.n;
        if (nkrVar != null) {
            nkrVar.a();
            this.n = null;
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437fffb6", new Object[]{this});
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null && (tBLiveH5Container.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.o.getParent()).removeView(this.o);
        }
        TBLiveH5Container tBLiveH5Container2 = this.o;
        if (tBLiveH5Container2 != null) {
            tBLiveH5Container2.destroy();
            this.o = null;
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            if (zmrVar.a() != null && (this.p.a().getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.p.a().getParent()).removeView(this.p.a());
            }
            this.p.destroy();
            this.p = null;
        }
        nkr nkrVar = this.n;
        if (nkrVar != null) {
            nkrVar.a();
            this.n = null;
        }
    }

    public void S(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains("TBLiveWeex")) {
            str = str.replace("TBLiveWeex", IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN);
        }
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            WVStandardEventCenter.postNotificationToJS(tBLiveH5Container, str, str2);
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            zmrVar.g(str, str2);
        }
        String str3 = y;
        jbu.a(str3, "onMessageReceived:" + str + " eventData:" + str2);
    }

    public void T(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains("TBLiveWeex")) {
            str = str.replace("TBLiveWeex", IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN);
        }
        String i2 = fkx.i(map);
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            WVStandardEventCenter.postNotificationToJS(tBLiveH5Container, str, i2);
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            zmrVar.g(str, i2);
        }
        String str2 = y;
        jbu.a(str2, "fireEvent:" + str + " eventData:" + i2);
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8795deb2", new Object[]{this});
            return;
        }
        this.n = new nkr(this.e, "LiveRoomAlive", new k(this.m), new j(), null);
        jbu.a(y, "Themis container start");
        this.n.j();
        zmr g2 = this.n.g();
        this.p = g2;
        g2.f(this.x);
        this.n.u(this);
        if (iw0.i()) {
            b1u.b(this.e, "直播间Themis命中");
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76fc42", new Object[]{this});
            return;
        }
        String str = y;
        jbu.a(str, "initThemisView start ");
        this.t = false;
        U();
        khf khfVar = this.r;
        if (khfVar != null) {
            khfVar.c();
        }
        e(this.p.a());
        jbu.a(str, "initThemisView end ");
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
        } else if (tws.z()) {
            V();
        } else {
            String str = y;
            jbu.a(str, "initWebView start " + System.currentTimeMillis());
            this.t = false;
            TBLiveWebView X = X();
            khf khfVar = this.r;
            if (khfVar != null) {
                khfVar.c();
            }
            X.setWebViewClient(new i(this.e));
            X.setVisibility(8);
            X.setFocusable(false);
            X.setImportantForAccessibility(2);
            X.setContentDescription("");
            e(X);
            jbu.a(str, "initWebView end " + X.getCurrentViewCoreType());
        }
    }

    public TBLiveWebView X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveWebView) ipChange.ipc$dispatch("89e444de", new Object[]{this});
        }
        nkr nkrVar = new nkr(this.e, "LiveRoomAlive", new k(this.m), new j(), null);
        this.n = nkrVar;
        nkrVar.i();
        this.o = this.n.f();
        this.n.u(this);
        return this.o;
    }

    public void Z(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8814c736", new Object[]{this, new Integer(i2)});
        } else {
            this.u = i2;
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36e439b", new Object[]{this});
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.setVisibility(0);
        }
        zmr zmrVar = this.p;
        if (zmrVar != null && zmrVar.a() != null) {
            this.p.a().setVisibility(0);
        }
    }

    @Override // tb.pu
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a93d30", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.pu
    public void h(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c575b92d", new Object[]{this, new Boolean(z)});
            return;
        }
        super.h(z);
        TBLiveH5Container tBLiveH5Container = this.o;
        String str2 = "TBLiveWVPlugin.Event.container.hide";
        if (tBLiveH5Container != null) {
            if (z) {
                str = "TBLiveWVPlugin.Event.container.show";
            } else {
                str = str2;
            }
            WVStandardEventCenter.postNotificationToJS(tBLiveH5Container, str, null);
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            if (z) {
                str2 = "TBLiveWVPlugin.Event.container.show";
            }
            zmrVar.g(str2, "");
        }
    }

    @Override // tb.pu
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f26301a;
        if (viewGroup != null) {
            viewGroup.removeCallbacks(this.w);
        }
        super.i();
        Q();
        this.r = null;
        bce bceVar = this.s;
        if (bceVar != null) {
            bceVar.release();
        }
        this.d = null;
        this.r = null;
    }

    @Override // tb.pu
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.j();
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.onPause();
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            zmrVar.e();
        }
    }

    @Override // tb.pu
    public void l() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218c49b3", new Object[]{this});
            return;
        }
        String str = y;
        jbu.a(str, "H5Container: render timeout---" + this.g);
        if (this.t && (viewGroup = this.f26301a) != null) {
            viewGroup.post(this.w);
        }
        pu.b bVar = this.d;
        if (bVar != null) {
            bVar.a("renderTimeout", "renderTimeout");
        }
    }

    @Override // tb.pu
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.m();
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.onResume();
        }
        zmr zmrVar = this.p;
        if (zmrVar != null) {
            zmrVar.onResume();
        }
    }

    @Override // tb.pu
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75501eb3", new Object[]{this, str});
        } else if (this.n != null) {
            khf khfVar = this.r;
            if (khfVar != null) {
                khfVar.g();
            }
            String str2 = y;
            jbu.a(str2, "WebViewBuilder: render---" + str);
            if (tws.z()) {
                nkr nkrVar = this.n;
                if (this.k) {
                    str = h5m.b(str, CODE_LAUNCH_OPTIMIZATION, "true");
                }
                nkrVar.l(str);
                return;
            }
            nkr nkrVar2 = this.n;
            if (this.k) {
                str = h5m.b(str, CODE_LAUNCH_OPTIMIZATION, "true");
            }
            nkrVar2.k(str);
        }
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
            return;
        }
        this.v = System.currentTimeMillis();
        if (this.s == null || WVCore.getInstance().isUCSupport()) {
            W();
        } else {
            bce bceVar = this.s;
            if (bceVar != null) {
                this.t = true;
                bceVar.release();
                this.s.a(this.e, new a());
            } else {
                W();
            }
        }
        String str = y;
        jbu.a(str, "onCreateView " + (System.currentTimeMillis() - this.v));
    }

    public void b0(boolean z, String str, float f, float f2, float f3) {
        int h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a69ff72", new Object[]{this, new Boolean(z), str, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        v2s.o().A().c(y, "showInteractiveCloseBtn " + z + " " + str + " " + f + " " + f2 + " " + f3);
        if (!z || this.f26301a == null) {
            AliUrlImageView aliUrlImageView = this.q;
            if (aliUrlImageView != null) {
                aliUrlImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.q == null) {
            AliUrlImageView aliUrlImageView2 = new AliUrlImageView(this.e);
            this.q = aliUrlImageView2;
            aliUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f26301a.addView(this.q);
        }
        if (TextUtils.isEmpty(str)) {
            this.q.setImageDrawable(this.e.getResources().getDrawable(R.drawable.taolive_interactive_close_flexalocal));
        } else {
            this.q.setImageUrl(str);
        }
        this.q.setOnClickListener(new c());
        int min = Math.min(iw0.h(this.e), iw0.e(this.e));
        int a2 = f > 0.0f ? (int) ((min * f) / 750.0f) : iw0.a(this.e, 39.0f);
        float f4 = min;
        int i2 = (int) ((f2 * f4) / 750.0f);
        int i3 = (int) (((f4 * f3) + this.u) / 750.0f);
        ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
        if (layoutParams == null) {
            new ViewGroup.LayoutParams(a2, a2);
        }
        layoutParams.width = a2;
        layoutParams.height = a2;
        this.q.setX((h - a2) - i2);
        this.q.setY(i3);
        this.q.setLayoutParams(layoutParams);
        this.q.setVisibility(0);
    }

    @Override // tb.pu
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            return;
        }
        String str = y;
        jbu.a(str, "onRenderSuccess " + (System.currentTimeMillis() - this.v));
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.setVisibility(0);
        }
        zmr zmrVar = this.p;
        if (!(zmrVar == null || zmrVar.a() == null)) {
            this.p.a().setVisibility(0);
        }
        khf khfVar = this.r;
        if (khfVar != null) {
            khfVar.d();
        }
    }

    public qoa(Context context, ukr ukrVar, ViewGroup viewGroup, bce bceVar, String str, khf khfVar, boolean z) {
        super(context, viewGroup, new HashMap(), str, z);
        this.m = ukrVar;
        this.s = bceVar;
        this.r = khfVar;
        Y();
        khf khfVar2 = this.r;
        if (khfVar2 != null) {
            khfVar2.i();
        }
    }
}
