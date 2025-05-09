package com.taobao.android.lightvane.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import tb.a07;
import tb.afg;
import tb.ajc;
import tb.ckf;
import tb.fhc;
import tb.ghc;
import tb.jeg;
import tb.njg;
import tb.rb;
import tb.t2o;
import tb.tsq;
import tb.vdg;
import tb.wdg;
import tb.wsq;
import tb.z2k;
import tb.zdg;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b&\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'¨\u0006*"}, d2 = {"Lcom/taobao/android/lightvane/jsbridge/LVBridgeEngine;", "", "Ltb/ajc;", "webview", "<init>", "(Ltb/ajc;)V", "", z2k.d.ATTACHED_RESPONSE_HEADER_REQ_ID, "Ltb/ghc;", "getSuccessCallback", "(Ljava/lang/String;)Ltb/ghc;", "Ltb/fhc;", "getFailCallback", "(Ljava/lang/String;)Ltb/fhc;", "", "success", rb.RESULT_KEY, "getCallbackJs", "(ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "js", "Ltb/xhv;", "valuateJavascriptOnUiThread", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "task", "runOnUiThread", "(Ljava/lang/Runnable;)V", "strings", "formatJsonString", "(Ljava/lang/String;)Ljava/lang/String;", "module", "method", "param", "call", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "version", "()Ljava/lang/String;", "key", "getParameter", "Ltb/ajc;", "Companion", "a", "lightvane_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LVBridgeEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FAILURE_CALLBACK_PREFIX = "javascript:window.__lightvane__&&window.__lightvane__.onFailure&&window.__lightvane__.onFailure";
    private static final String SUCCESS_CALLBACK_PREFIX = "javascript:window.__lightvane__&&window.__lightvane__.onSuccess&&window.__lightvane__.onSuccess";
    private final ajc webview;
    private static final a Companion = new a(null);
    private static final njg sExecutors$delegate = kotlin.a.b(LVBridgeEngine$Companion$sExecutors$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(507510796);
        }

        public a() {
        }

        public static final /* synthetic */ ExecutorService a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("bc9b09e6", new Object[]{aVar});
            }
            return aVar.b();
        }

        public final ExecutorService b() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("1432eb91", new Object[]{this});
            } else {
                njg access$getSExecutors$cp = LVBridgeEngine.access$getSExecutors$cp();
                LVBridgeEngine.access$Companion();
                value = access$getSExecutors$cp.getValue();
            }
            return (ExecutorService) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wdg f8235a;

        public b(wdg wdgVar) {
            this.f8235a = wdgVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                jeg.INSTANCE.a(this.f8235a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements fhc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // tb.fhc
        public void fail(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str2 = "{}";
            } else {
                LVBridgeEngine lVBridgeEngine = LVBridgeEngine.this;
                ckf.d(str);
                str2 = LVBridgeEngine.access$formatJsonString(lVBridgeEngine, str);
            }
            LVBridgeEngine.access$valuateJavascriptOnUiThread(LVBridgeEngine.this, LVBridgeEngine.access$getCallbackJs(LVBridgeEngine.this, false, this.b, str2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements ghc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // tb.ghc
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
                return;
            }
            LVBridgeEngine lVBridgeEngine = LVBridgeEngine.this;
            if (TextUtils.isEmpty(str)) {
                str = "{}";
            } else {
                ckf.d(str);
            }
            LVBridgeEngine.access$valuateJavascriptOnUiThread(LVBridgeEngine.this, LVBridgeEngine.access$getCallbackJs(LVBridgeEngine.this, true, this.b, LVBridgeEngine.access$formatJsonString(lVBridgeEngine, str)));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LVBridgeEngine.access$getWebview$p(LVBridgeEngine.this).evaluateJavascript(this.b);
            }
        }
    }

    static {
        t2o.a(507510795);
    }

    public LVBridgeEngine(ajc ajcVar) {
        ckf.g(ajcVar, "webview");
        this.webview = ajcVar;
    }

    public static final /* synthetic */ a access$Companion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("26111402", new Object[0]);
        }
        return Companion;
    }

    public static final /* synthetic */ String access$formatJsonString(LVBridgeEngine lVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b73f98", new Object[]{lVBridgeEngine, str});
        }
        return lVBridgeEngine.formatJsonString(str);
    }

    public static final /* synthetic */ String access$getCallbackJs(LVBridgeEngine lVBridgeEngine, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c30ef86a", new Object[]{lVBridgeEngine, new Boolean(z), str, str2});
        }
        return lVBridgeEngine.getCallbackJs(z, str, str2);
    }

    public static final /* synthetic */ njg access$getSExecutors$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("3d4a7ec4", new Object[0]);
        }
        return sExecutors$delegate;
    }

    public static final /* synthetic */ ajc access$getWebview$p(LVBridgeEngine lVBridgeEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajc) ipChange.ipc$dispatch("370bca68", new Object[]{lVBridgeEngine});
        }
        return lVBridgeEngine.webview;
    }

    public static final /* synthetic */ void access$valuateJavascriptOnUiThread(LVBridgeEngine lVBridgeEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675d04e0", new Object[]{lVBridgeEngine, str});
        } else {
            lVBridgeEngine.valuateJavascriptOnUiThread(str);
        }
    }

    private final String getCallbackJs(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2794cc63", new Object[]{this, new Boolean(z), str, str2});
        }
        if (z) {
            return "javascript:window.__lightvane__&&window.__lightvane__.onSuccess&&window.__lightvane__.onSuccess('" + str + "','" + str2 + "');";
        }
        return "javascript:window.__lightvane__&&window.__lightvane__.onFailure&&window.__lightvane__.onFailure('" + str + "','" + str2 + "');";
    }

    private final fhc getFailCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fhc) ipChange.ipc$dispatch("b474a8dd", new Object[]{this, str});
        }
        return new c(str);
    }

    private final ghc getSuccessCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghc) ipChange.ipc$dispatch("b8648ea7", new Object[]{this, str});
        }
        return new d(str);
    }

    private final void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
            return;
        }
        try {
            if (ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                View view = this.webview.getView();
                if (view != null) {
                    view.post(runnable);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private final void valuateJavascriptOnUiThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93ee459", new Object[]{this, str});
        } else {
            runOnUiThread(new e(str));
        }
    }

    @JavascriptInterface
    public final void call(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feeb30d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        wdg wdgVar = new wdg(this.webview);
        if (TextUtils.isEmpty(str2)) {
            afg afgVar = new afg();
            afgVar.b("HY_NO_CLASS");
            new vdg(this.webview, "null", "null", null, getFailCallback(str)).b(afgVar);
        } else if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str2)) {
            wdgVar.k(str2);
            wdgVar.j(str3);
            wdgVar.n(this.webview);
            if (TextUtils.isEmpty(str4)) {
                str4 = "{}";
            }
            wdgVar.l(str4);
            wdgVar.m(getSuccessCallback(str));
            wdgVar.i(getFailCallback(str));
            a.a(Companion).submit(new b(wdgVar));
        } else {
            afg afgVar2 = new afg();
            afgVar2.b("HY_NO_HANDLER");
            new vdg(this.webview, "null", "null", null, getFailCallback(str)).b(afgVar2);
        }
    }

    @JavascriptInterface
    public final String getParameter(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("297a0ddc", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        View view = this.webview.getView();
        Context a2 = zdg.a(view != null ? view.getContext() : null);
        if (!(a2 instanceof Activity)) {
            return null;
        }
        Intent intent = ((Activity) a2).getIntent();
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("params") : null;
        if (bundleExtra == null || (obj = bundleExtra.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }

    @JavascriptInterface
    public final String version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb50921", new Object[]{this});
        }
        return "1.0.0";
    }

    private final String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{this, str});
        }
        if (wsq.O(str, "\u2028", false, 2, null)) {
            try {
                str = tsq.E(str, "\u2028", "\\u2028", false, 4, null);
            } catch (Exception unused) {
            }
        }
        if (wsq.O(str, "\u2029", false, 2, null)) {
            try {
                str = tsq.E(str, "\u2029", "\\u2029", false, 4, null);
            } catch (Exception unused2) {
            }
        }
        return tsq.E(tsq.E(str, "\\", "\\\\", false, 4, null), "'", "\\'", false, 4, null);
    }
}
