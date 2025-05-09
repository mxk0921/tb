package com.taobao.tab2interact.core.layer.h5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tab2interact.core.data.baseinfo.PageBaseInfo;
import com.taobao.tab2interact.core.data.baseinfo.TabBaseInfo;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.apa;
import tb.bmi;
import tb.cbu;
import tb.ckf;
import tb.j0r;
import tb.jmi;
import tb.s6o;
import tb.t0j;
import tb.t2o;
import tb.t7;
import tb.tx1;
import tb.vaj;
import tb.vff;
import tb.vgh;
import tb.vv1;
import tb.wa;
import tb.wff;
import tb.xff;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class H5InteractLayer extends t7 implements apa.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public apa g;
    public FrameLayout h;
    public H5InteractLayerWebView i;
    public JSONObject j;
    public Boolean k;
    public JSONObject l;
    public BroadcastReceiver n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Boolean r;
    public long t;
    public long u;
    public boolean v;
    public final Handler m = new Handler(Looper.getMainLooper());
    public long s = -1;
    public final List<b> w = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963120);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void e(H5InteractLayerWebView h5InteractLayerWebView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends wa {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/layer/h5/H5InteractLayer$initWebView$1");
        }

        @Override // tb.wa
        public void o(bmi bmiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("524eaf26", new Object[]{this, bmiVar});
                return;
            }
            ckf.g(bmiVar, "message");
            if (!tx1.Companion.a(bmiVar.c())) {
                vgh.c(this, "H5InteractLayer", "发消息给前端，message=" + bmiVar);
                WVStandardEventCenter.postNotificationToJS(H5InteractLayer.E0(H5InteractLayer.this), "GGBizMessage", bmiVar.g());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1262473342:
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                case -332805219:
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                case 534767588:
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                case 1373550412:
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/layer/h5/H5InteractLayer$initWebView$2");
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
            vgh.c(this, "H5InteractLayer", "加载URL完成的回调，url=" + str + "，webView=" + webView);
            if (H5InteractLayer.L0(H5InteractLayer.this) == null) {
                vgh.c(this, "H5InteractLayer", "加载URL完成的回调，加载URL成功");
                t0j.d("H5LoadURL", "url=" + str);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                H5InteractLayer h5InteractLayer = H5InteractLayer.this;
                H5InteractLayer.Q0(h5InteractLayer, str, elapsedRealtime - H5InteractLayer.G0(h5InteractLayer), elapsedRealtime - H5InteractLayer.I0(H5InteractLayer.this), elapsedRealtime - H5InteractLayer.F0(H5InteractLayer.this));
                H5InteractLayer.O0(H5InteractLayer.this, Boolean.TRUE);
                H5InteractLayer.M0(H5InteractLayer.this, true);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            vgh.c(this, "H5InteractLayer", "加载URL开始的回调，url=" + str + "，webView=" + webView);
            if (H5InteractLayer.K0(H5InteractLayer.this)) {
                wff.INSTANCE.b(H5InteractLayer.H0(H5InteractLayer.this), vff.WEB_VIEW_RELOAD_NAME, null, null);
            }
            H5InteractLayer.N0(H5InteractLayer.this, true);
            H5InteractLayer.O0(H5InteractLayer.this, null);
            H5InteractLayer.R0(H5InteractLayer.this);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            vgh.c(this, "H5InteractLayer", "加载URL SSL错误的回调，webView=" + webView + "，sslError=" + sslError);
            StringBuilder sb = new StringBuilder(StatisticRecord.EC_SSL_PAY);
            String str = null;
            sb.append(sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
            String sb2 = sb.toString();
            t0j.b("H5LoadURL", sb2, "SSL错误描述：" + sslError, null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            H5InteractLayer h5InteractLayer = H5InteractLayer.this;
            String valueOf = String.valueOf(sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
            if (sslError != null) {
                str = sslError.toString();
            }
            H5InteractLayer.P0(h5InteractLayer, valueOf, str, null, elapsedRealtime - H5InteractLayer.G0(H5InteractLayer.this), elapsedRealtime - H5InteractLayer.I0(H5InteractLayer.this), elapsedRealtime - H5InteractLayer.F0(H5InteractLayer.this));
            H5InteractLayer.O0(H5InteractLayer.this, Boolean.FALSE);
            H5InteractLayer.M0(H5InteractLayer.this, false);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            vgh.c(this, "H5InteractLayer", "加载URL错误的回调，url=" + str2 + "，webView=" + webView + "，errorCode=" + i + "，errorDescription=" + str);
            StringBuilder sb = new StringBuilder("Error");
            sb.append(i);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("错误描述：");
            sb3.append(str);
            String sb4 = sb3.toString();
            t0j.b("H5LoadURL", sb2, sb4, "url=" + str2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            H5InteractLayer.P0(H5InteractLayer.this, String.valueOf(i), str, str2, elapsedRealtime - H5InteractLayer.G0(H5InteractLayer.this), elapsedRealtime - H5InteractLayer.I0(H5InteractLayer.this), elapsedRealtime - H5InteractLayer.F0(H5InteractLayer.this));
            H5InteractLayer.O0(H5InteractLayer.this, Boolean.FALSE);
            H5InteractLayer.M0(H5InteractLayer.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                H5InteractLayer.this.X0();
            }
        }
    }

    static {
        t2o.a(689963119);
        t2o.a(689963129);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5InteractLayer(Context context, FrameLayout frameLayout, jmi jmiVar, vv1 vv1Var) {
        super(context, frameLayout, jmiVar, vv1Var);
        ckf.g(context, "context");
        ckf.g(frameLayout, "interactHostView");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
    }

    public static final /* synthetic */ H5InteractLayerWebView E0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5InteractLayerWebView) ipChange.ipc$dispatch("83466895", new Object[]{h5InteractLayer});
        }
        return h5InteractLayer.i;
    }

    public static final /* synthetic */ long F0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df16e9d7", new Object[]{h5InteractLayer})).longValue();
        }
        return h5InteractLayer.t;
    }

    public static final /* synthetic */ long G0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfa5cb17", new Object[]{h5InteractLayer})).longValue();
        }
        return h5InteractLayer.u;
    }

    public static final /* synthetic */ jmi H0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmi) ipChange.ipc$dispatch("d4c74a41", new Object[]{h5InteractLayer});
        }
        return h5InteractLayer.t0();
    }

    public static final /* synthetic */ long I0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b18e53dc", new Object[]{h5InteractLayer})).longValue();
        }
        return h5InteractLayer.s;
    }

    public static final /* synthetic */ void J0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ebf69a", new Object[]{h5InteractLayer});
        } else {
            h5InteractLayer.W0();
        }
    }

    public static final /* synthetic */ boolean K0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("581959fe", new Object[]{h5InteractLayer})).booleanValue();
        }
        return h5InteractLayer.q;
    }

    public static final /* synthetic */ Boolean L0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ac482f18", new Object[]{h5InteractLayer});
        }
        return h5InteractLayer.r;
    }

    public static final /* synthetic */ void M0(H5InteractLayer h5InteractLayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3d23c0", new Object[]{h5InteractLayer, new Boolean(z)});
        } else {
            h5InteractLayer.m1(z);
        }
    }

    public static final /* synthetic */ void N0(H5InteractLayer h5InteractLayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f862b0d2", new Object[]{h5InteractLayer, new Boolean(z)});
        } else {
            h5InteractLayer.q = z;
        }
    }

    public static final /* synthetic */ void O0(H5InteractLayer h5InteractLayer, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178c0dca", new Object[]{h5InteractLayer, bool});
        } else {
            h5InteractLayer.r = bool;
        }
    }

    public static final /* synthetic */ void P0(H5InteractLayer h5InteractLayer, String str, String str2, String str3, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a07a79", new Object[]{h5InteractLayer, str, str2, str3, new Long(j), new Long(j2), new Long(j3)});
        } else {
            h5InteractLayer.o1(str, str2, str3, j, j2, j3);
        }
    }

    public static final /* synthetic */ void Q0(H5InteractLayer h5InteractLayer, String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6056f875", new Object[]{h5InteractLayer, str, new Long(j), new Long(j2), new Long(j3)});
        } else {
            h5InteractLayer.p1(str, j, j2, j3);
        }
    }

    public static final /* synthetic */ void R0(H5InteractLayer h5InteractLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57876916", new Object[]{h5InteractLayer});
        } else {
            h5InteractLayer.u1();
        }
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayer h5InteractLayer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.A0();
                return null;
            case -1983604863:
                super.p0();
                return null;
            case -1544323859:
                super.A((String) objArr[0], (String) objArr[1]);
                return null;
            case -1494410735:
                super.z((Map) objArr[0]);
                return null;
            case -1443575324:
                super.x((String) objArr[0]);
                return null;
            case -1209017808:
                super.y((String) objArr[0]);
                return null;
            case -706673279:
                super.v();
                return null;
            case -172691066:
                super.C((String) objArr[0], (String) objArr[1]);
                return null;
            case -22746838:
                super.o0((List) objArr[0]);
                return null;
            case 79699924:
                super.B((String) objArr[0]);
                return null;
            case 662735515:
                return super.G();
            case 952840239:
                super.E((String) objArr[0], (Map) objArr[1]);
                return null;
            case 1335953106:
                super.D((String) objArr[0], (String) objArr[1]);
                return null;
            case 1350033330:
                super.w();
                return null;
            case 1713617801:
                super.C0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/layer/h5/H5InteractLayer");
        }
    }

    @Override // tb.wx1
    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabType");
        super.A(str, str2);
        e1(str, str2);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.A0();
        this.o = true;
        m1(true);
    }

    @Override // tb.wx1
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        super.B(str);
        f1(str);
    }

    @Override // tb.wx1
    public void C(String str, String str2) {
        apa apaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        super.C(str, str2);
        Boolean bool = this.k;
        if (!(bool == null || !ckf.b(bool, Boolean.FALSE) || (apaVar = this.g) == null)) {
            apaVar.g();
        }
        List<String> m = j0r.m();
        if (m != null && m.contains(str)) {
            long j = 0;
            if (this.s < 0) {
                this.s = SystemClock.elapsedRealtime();
            }
            if (this.p) {
                Boolean bool2 = this.r;
                if (bool2 != null && ckf.b(bool2, Boolean.FALSE)) {
                    vgh.c(this, "H5InteractLayer", "Tab开启的时机，重新加载WebView");
                    l1();
                }
            } else {
                JSONObject l = j0r.l();
                Number number = null;
                Object obj = l != null ? l.get(str) : null;
                Handler handler = this.m;
                e eVar = new e();
                if (obj instanceof Number) {
                    number = obj;
                }
                Number number2 = number;
                if (number2 != null) {
                    j = number2.longValue();
                }
                handler.postDelayed(eVar, j);
            }
        }
        g1(str, str2);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        super.C0();
        this.o = false;
        m1(false);
    }

    @Override // tb.wx1
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa106d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        super.D(str, str2);
        h1(str, str2);
    }

    @Override // tb.wx1
    public void E(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cb302f", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(map, "tabURLQuery");
        super.E(str, map);
        i1(str, map);
    }

    @Override // tb.xff
    public JSONObject G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27808a9b", new Object[]{this});
        }
        JSONObject G = super.G();
        Boolean bool = this.k;
        if (bool != null) {
            Boolean bool2 = Boolean.TRUE;
            if (ckf.b(bool, bool2)) {
                G.put((JSONObject) "success", (String) bool2);
                G.put((JSONObject) "data", (String) this.j);
            } else {
                G.put((JSONObject) "success", (String) Boolean.FALSE);
            }
        }
        return G;
    }

    public final void S0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d417504", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "h5InteractLayerEventListener");
        ((ArrayList) this.w).add(bVar);
    }

    public final void T0(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20a45e", new Object[]{this, sb});
            return;
        }
        sb.append("JSON.stringify({pageBaseInfo: window.pageBaseInfo, tabBaseInfo: window.tabBaseInfo});");
        vgh.c(this, "H5InteractLayer", "执行JS，script=" + ((Object) sb));
        H5InteractLayerWebView h5InteractLayerWebView = this.i;
        if (h5InteractLayerWebView != null) {
            h5InteractLayerWebView.evaluateJavascript(sb.toString(), new ValueCallback<String>() { // from class: com.taobao.tab2interact.core.layer.h5.H5InteractLayer$evaluateJavascript$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    vgh.c(this, "H5InteractLayer", "执行JS结果回调，value=" + str);
                }
            });
        }
    }

    public final Map<String, String> U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("51edeef9", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enableTab2GlobalInteract", "true");
        linkedHashMap.put("tab2GlobalInteractVersion", "2.0");
        return linkedHashMap;
    }

    public final Map<String, String> V0(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("afeac2bd", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
        }
        Map<String, String> U0 = U0();
        if (str == null) {
            str = "";
        }
        U0.put("url", str);
        U0.put("costTime", String.valueOf(j));
        U0.put("fromTargetTabStartTime", String.valueOf(j2));
        U0.put("fromInitWebViewStartTime", String.valueOf(j3));
        U0.put("isLoadURLTrackedOnce", String.valueOf(this.v));
        return U0;
    }

    public final void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5041f6", new Object[]{this});
            return;
        }
        vgh.c(this, "H5InteractLayer", "在登录或退出登录的时机处理");
        l1();
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eda9ab0", new Object[]{this});
            return;
        }
        this.u = SystemClock.elapsedRealtime();
        String n = j0r.n();
        vgh.c(this, "H5InteractLayer", "加载URL，url=" + n);
        H5InteractLayerWebView h5InteractLayerWebView = this.i;
        if (h5InteractLayerWebView != null) {
            h5InteractLayerWebView.loadUrl(n);
        }
    }

    public final void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88b7c5f", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String jSONString = JSON.toJSONString(this.l);
        sb.append("window.pageBaseInfo = {state: 'create', extra: " + jSONString + "};");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'create'}});");
        T0(sb);
    }

    public final void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e192d", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};window.pageBaseInfo.state = 'destroy';window.postMessage({name: 'PageStateChange', data: {state: 'destroy'}});");
        T0(sb);
    }

    @Override // tb.apa.b
    public void b(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cccab62", new Object[]{this, jSONObject, new Long(j)});
            return;
        }
        ckf.g(jSONObject, "dataJSONObject");
        vgh.c(this, "H5InteractLayer", "数据请求成功回调，dataJSONObject=" + jSONObject + "，costTime=" + j);
        Boolean bool = Boolean.TRUE;
        this.k = bool;
        r1(j);
        this.j = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "success", (String) bool);
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        wff.INSTANCE.b(t0(), vff.INTERACT_REMOTE_CONFIG_CHANGE_NAME, jSONObject2, null);
    }

    public final void b1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851f5e1f", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};window.pageBaseInfo.state = 'start';");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'start', changeType: '" + str + "'}});");
        T0(sb);
    }

    public final void c1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3c7def", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};window.pageBaseInfo.state = 'stop';");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'stop', changeType: '" + str + "'}});");
        T0(sb);
    }

    public final void d1(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c89df9", new Object[]{this, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String jSONString = JSON.toJSONString(map);
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};");
        sb.append("window.pageBaseInfo.urlQuery = " + jSONString + ';');
        sb.append("window.postMessage({name: 'PageURLQueryChange', data: {urlQuery: " + jSONString + "}});");
        T0(sb);
    }

    public final void e1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a3df07", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("window.tabBaseInfo['" + str + "'] = {type: '" + str2 + "', state: 'create'};");
        StringBuilder sb2 = new StringBuilder("window.postMessage({name: 'TabStateChange', data: {tabId: '");
        sb2.append(str);
        sb2.append("', state: 'create'}});");
        sb.append(sb2.toString());
        T0(sb);
    }

    public final void f1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b06623", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        StringBuilder sb2 = new StringBuilder("window.tabBaseInfo['");
        sb2.append(str);
        sb2.append("'].state = 'destroy';");
        sb.append(sb2.toString());
        sb.append("window.postMessage({name: 'TabStateChange', data: {tabId: '" + str + "', state: 'destroy'}});");
        T0(sb);
    }

    public final void g1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182aba95", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        StringBuilder sb2 = new StringBuilder("window.tabBaseInfo['");
        sb2.append(str);
        sb2.append("'].state = 'start';");
        sb.append(sb2.toString());
        sb.append("window.postMessage({name: 'TabStateChange', data: {tabId: '" + str + "', state: 'start', changeType: '" + str2 + "'}});");
        T0(sb);
    }

    @Override // tb.apa.b
    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f22526", new Object[]{this, new Long(j)});
            return;
        }
        vgh.c(this, "H5InteractLayer", "数据请求失败回调，costTime=" + j);
        Boolean bool = Boolean.FALSE;
        this.k = bool;
        q1(j);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) bool);
        wff.INSTANCE.b(t0(), vff.INTERACT_REMOTE_CONFIG_CHANGE_NAME, jSONObject, null);
    }

    public final void h1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfea900d", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        StringBuilder sb2 = new StringBuilder("window.tabBaseInfo['");
        sb2.append(str);
        sb2.append("'].state = 'stop';");
        sb.append(sb2.toString());
        sb.append("window.postMessage({name: 'TabStateChange', data: {tabId: '" + str + "', state: 'stop', changeType: '" + str2 + "'}});");
        T0(sb);
    }

    public final void i1(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39190d5b", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String jSONString = JSON.toJSONString(map);
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        sb.append("window.tabBaseInfo['" + str + "'].urlQuery = " + jSONString + ';');
        sb.append("window.postMessage({name: 'TabURLQueryChange', data: {tabId: '" + str + "', urlQuery: " + jSONString + "}});");
        T0(sb);
    }

    public final void j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a84371", new Object[]{this});
            return;
        }
        this.n = new BroadcastReceiver() { // from class: com.taobao.tab2interact.core.layer.h5.H5InteractLayer$registerLoginBroadcastReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(H5InteractLayer$registerLoginBroadcastReceiver$1 h5InteractLayer$registerLoginBroadcastReceiver$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/layer/h5/H5InteractLayer$registerLoginBroadcastReceiver$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent != null ? intent.getAction() : null;
                vgh.c(this, "H5InteractLayer", "收到登录广播，action=" + action);
                if (ckf.b(action, LoginAction.NOTIFY_LOGOUT.toString()) || ckf.b(action, LoginAction.NOTIFY_LOGIN_SUCCESS.toString())) {
                    H5InteractLayer.J0(H5InteractLayer.this);
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(s0(), this.n);
    }

    public final void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9acd3b6", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vff.GET_INTERACT_REMOTE_CONFIG_NAME);
        arrayList.add(vff.SET_DELEGATE_H5_AREAS_NAME);
        wff.INSTANCE.a(t0(), arrayList, this);
    }

    public final void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aeadcc7", new Object[]{this});
            return;
        }
        vgh.c(this, "H5InteractLayer", "重新加载WebView");
        if (this.p) {
            vgh.c(this, "H5InteractLayer", "重新加载WebView，WebView已经被初始化");
            H5InteractLayerWebView h5InteractLayerWebView = this.i;
            if (h5InteractLayerWebView != null) {
                h5InteractLayerWebView.reload();
            }
        }
    }

    public final void n1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9798b5a9", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "extra");
        this.l = jSONObject;
    }

    @Override // tb.xff
    public void o0(List<xff.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea4e92a", new Object[]{this, list});
            return;
        }
        ckf.g(list, "areaList");
        super.o0(list);
        H5InteractLayerWebView h5InteractLayerWebView = this.i;
        if (h5InteractLayerWebView != null) {
            h5InteractLayerWebView.setDelegateH5Areas(list);
        }
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.p0();
        H5InteractLayerWebView h5InteractLayerWebView = this.i;
        if (h5InteractLayerWebView != null) {
            h5InteractLayerWebView.destroy();
        }
        this.m.removeCallbacksAndMessages(null);
        if (j0r.b()) {
            s1();
        }
        t1();
    }

    public final void q1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a84dd1", new Object[]{this, new Long(j)});
            return;
        }
        Map<String, String> U0 = U0();
        U0.put("costTime", String.valueOf(j));
        vgh.c(this, "H5InteractLayer", "请求数据失败埋点，properties=" + U0);
        cbu.c("Page_VideoCash_H5RequestDataFail", U0);
    }

    public final void r1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e47cdc9", new Object[]{this, new Long(j)});
            return;
        }
        Map<String, String> U0 = U0();
        U0.put("costTime", String.valueOf(j));
        vgh.c(this, "H5InteractLayer", "请求数据成功埋点，properties=" + U0);
        cbu.c("Page_VideoCash_H5RequestDataSucceed", U0);
    }

    public final void s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9af6bca", new Object[]{this});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(s0(), this.n);
        }
    }

    public final void t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe43e4f", new Object[]{this});
        } else {
            wff.INSTANCE.e(t0(), this);
        }
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public View u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.h;
    }

    public final void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9e747a", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        PageBaseInfo.State d2 = r0().d();
        String jSONString = JSON.toJSONString(r0().e());
        String jSONString2 = JSON.toJSONString(this.l);
        sb.append("window.pageBaseInfo = {state: '" + d2 + "', urlQuery: " + jSONString + ", extra: " + jSONString2 + "};");
        sb.append("window.tabBaseInfo = {};");
        for (String str : r0().f()) {
            String h = r0().h(str);
            TabBaseInfo.State g = r0().g(str);
            String jSONString3 = JSON.toJSONString(r0().i(str));
            sb.append("window.tabBaseInfo['" + str + "'] = {type: '" + h + "', state: '" + g + "', urlQuery: " + jSONString3 + "};");
        }
        T0(sb);
    }

    @Override // tb.wx1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
            return;
        }
        super.v();
        Z0();
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public FrameLayout.LayoutParams v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("9b39d05b", new Object[]{this});
        }
        if (TBDeviceUtils.p(Globals.getApplication()) || TBDeviceUtils.P(Globals.getApplication())) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return new FrameLayout.LayoutParams(-1, s6o.t(s0()));
    }

    @Override // tb.t7, tb.wx1
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
            return;
        }
        super.w();
        a1();
    }

    @Override // tb.t7, tb.wx1
    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
            return;
        }
        ckf.g(str, "changeType");
        super.x(str);
        b1(str);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        k1();
        if (j0r.b()) {
            j1();
        }
        apa apaVar = new apa(this);
        this.g = apaVar;
        apaVar.g();
    }

    @Override // tb.t7, tb.wx1
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7efda30", new Object[]{this, str});
            return;
        }
        ckf.g(str, "changeType");
        super.y(str);
        c1(str);
    }

    @Override // tb.wx1
    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed1a11", new Object[]{this, map});
            return;
        }
        ckf.g(map, "pageURLQuery");
        super.z(map);
        d1(map);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.h = new FrameLayout(s0());
        m1(false);
    }

    public final void m1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62210a18", new Object[]{this, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder("设置H5互动层根View的可见性，当前可见性为");
        FrameLayout frameLayout = this.h;
        sb.append(frameLayout != null ? Integer.valueOf(frameLayout.getVisibility()) : null);
        sb.append("，isVisible=");
        sb.append(z);
        vgh.c(this, "H5InteractLayer", sb.toString());
        if (!z) {
            vgh.c(this, "H5InteractLayer", "设置H5互动层根View的可见性，设置为不可见");
            FrameLayout frameLayout2 = this.h;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        } else if (ckf.b(this.r, Boolean.TRUE) && this.o) {
            vgh.c(this, "H5InteractLayer", "设置H5互动层根View的可见性，设置为可见");
            FrameLayout frameLayout3 = this.h;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
        }
    }

    public final void p1(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3262590f", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        Map<String, String> V0 = V0(str, j, j2, j3);
        vgh.c(this, "H5InteractLayer", "加载URL成功埋点，properties=" + V0);
        cbu.c("Page_VideoCash_H5LoadURLSucceed", V0);
        this.v = true;
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
            return;
        }
        vgh.c(this, "H5InteractLayer", "初始化WebView");
        if (this.p) {
            vgh.c(this, "H5InteractLayer", "初始化WebView，WebView已经被初始化");
            return;
        }
        this.t = SystemClock.elapsedRealtime();
        H5InteractLayerWebView h5InteractLayerWebView = new H5InteractLayerWebView(s0());
        this.i = h5InteractLayerWebView;
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.addView(h5InteractLayerWebView);
        }
        H5InteractLayerWebView h5InteractLayerWebView2 = this.i;
        if (h5InteractLayerWebView2 != null) {
            h5InteractLayerWebView2.setBackgroundColor(0);
            h5InteractLayerWebView2.setTag(R.id.h5_interact_layer_message_center_tag, t0());
            h5InteractLayerWebView2.setTag(R.id.h5_interact_layer_base_info_manager_tag, r0());
            h5InteractLayerWebView2.setTag(R.id.h5_interact_layer_message_observer_tag, new c());
            WebSettings settings = h5InteractLayerWebView2.getSettings();
            ckf.f(settings, "webView.settings");
            settings.setJavaScriptEnabled(true);
            h5InteractLayerWebView2.setWebViewClient(new d(s0()));
            Y0();
            Iterator it = ((ArrayList) this.w).iterator();
            while (it.hasNext()) {
                ((b) it.next()).e(h5InteractLayerWebView2);
            }
            this.p = true;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView");
    }

    public final void o1(String str, String str2, String str3, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f708f63", new Object[]{this, str, str2, str3, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        Map<String, String> V0 = V0(str3, j, j2, j3);
        String str4 = "";
        V0.put("errorCode", str != null ? str : str4);
        if (str2 != null) {
            str4 = str2;
        }
        V0.put("errorMsg", str4);
        vgh.c(this, "H5InteractLayer", "加载URL失败埋点，properties=" + V0);
        cbu.c("Page_VideoCash_H5LoadURLFail", V0);
        this.v = true;
    }
}
