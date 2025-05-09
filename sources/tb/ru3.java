package tb;

import android.app.Application;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ru3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class a implements add {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wum f27611a;

        public a(wum wumVar) {
            this.f27611a = wumVar;
        }

        @Override // tb.add
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            this.f27611a.d(true);
            lcn.f(RVLLevel.Info, "Themis/Performance/Prerender", "preRendering webview is ready");
        }
    }

    static {
        t2o.a(989856364);
        t2o.a(989856368);
    }

    public void a(xum xumVar, g1a<? super wum, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64360b07", new Object[]{this, xumVar, g1aVar});
            return;
        }
        ckf.g(xumVar, "params");
        ckf.g(g1aVar, "callback");
        if (xumVar.e().length() != 0 && xumVar.b() == 1) {
            WVCore instance = WVCore.getInstance();
            ckf.f(instance, "WVCore.getInstance()");
            if (!instance.isUCSupport()) {
                lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "preRendering webview is not support");
                g1aVar.invoke(null);
                return;
            }
            Application application = yaa.n;
            if (application == null) {
                g1aVar.invoke(null);
                lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "context is null");
                return;
            }
            WVUCWebView wVUCWebView = new WVUCWebView(new MutableContextWrapper(application));
            wum wumVar = new wum(wVUCWebView, xumVar, false);
            ace webViewContext = wVUCWebView.getWebViewContext();
            webViewContext.setIsClientPrerender(true);
            webViewContext.addPrerenderSuccessEventListener(new a(wumVar));
            g1aVar.invoke(wumVar);
            Resources resources = application.getResources();
            ckf.f(resources, "context.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            ckf.f(displayMetrics, "context.resources.displayMetrics");
            View view = wVUCWebView.getView();
            ckf.f(view, "webview.view");
            view.setTop(0);
            view.setBottom(displayMetrics.heightPixels);
            view.setLeft(0);
            view.setRight(displayMetrics.widthPixels);
            view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
            wVUCWebView.injectJsEarly("javascript:window.__tms_prerender__=true;");
            wVUCWebView.loadUrl(xumVar.e());
            return;
        }
        g1aVar.invoke(null);
    }
}
