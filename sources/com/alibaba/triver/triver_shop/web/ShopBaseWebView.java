package com.alibaba.triver.triver_shop.web;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import kotlin.Result;
import tb.a07;
import tb.aqp;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.jwk;
import tb.kew;
import tb.npp;
import tb.pg1;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopBaseWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String SHOP_BIZ = "shop";
    private boolean apiCallByAsyncBridge;
    private Handler apiHandler;
    private HandlerThread apiThread;
    private b coreOverScrollByCallback;
    private Runnable detectScrollingRunnable;
    private boolean enableCompatInViewPager;
    private long lastScrollYTime;
    private boolean scrolling;
    private g1a<? super MotionEvent, xhv> touchEventProcessor;
    private jwk webViewScrollToTopListener;
    private boolean useShareApiThread = true;
    private final e topDetectedHelper = new e(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510482);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ d1a f3360a;

        public c(d1a d1aVar) {
            this.f3360a = d1aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3360a.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class e implements jwk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f3361a;
        public final /* synthetic */ ShopBaseWebView b;

        static {
            t2o.a(766510481);
            t2o.a(766510479);
        }

        public e(ShopBaseWebView shopBaseWebView) {
            ckf.g(shopBaseWebView, "this$0");
            this.b = shopBaseWebView;
        }

        @Override // tb.jwk.a
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8682cdb2", new Object[]{this})).booleanValue();
            }
            if (this.b.isDestroied()) {
                return true;
            }
            View coreView = this.b.getCoreView();
            if (coreView != null && coreView.getScrollY() <= this.f3361a) {
                return true;
            }
            return false;
        }

        public final void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9264e44", new Object[]{this, new Integer(i)});
            } else {
                this.f3361a = i;
            }
        }
    }

    static {
        t2o.a(766510480);
    }

    public ShopBaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(new MutableContextWrapper(context), attributeSet, i);
        WVUCWebView.setBizCode("shop");
        initBridge();
    }

    private final ViewPager findViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("9fd9ff53", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewPager) {
                return (ViewPager) parent;
            }
        }
        return null;
    }

    private final void initBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdd68c0", new Object[]{this});
        } else if (aqp.Companion.X()) {
            npp.Companion.b("inject shopAsyncBridge");
            addJavascriptInterface(new AsyncJSAPIBridge(this), "ShopAsyncBridge");
        }
    }

    public static /* synthetic */ Object ipc$super(ShopBaseWebView shopBaseWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -1247571552:
                super.reload();
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/web/ShopBaseWebView");
        }
    }

    public static /* synthetic */ void setWebViewScrollToTopListener$default(ShopBaseWebView shopBaseWebView, jwk jwkVar, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974a07c5", new Object[]{shopBaseWebView, jwkVar, new Integer(i), new Integer(i2), obj});
        } else if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            shopBaseWebView.setWebViewScrollToTopListener(jwkVar, i);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewScrollToTopListener");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
        }
        if (getContext() instanceof MutableContextWrapper) {
            Context context = getContext();
            if (context != null) {
                Context baseContext = ((MutableContextWrapper) context).getBaseContext();
                ckf.f(baseContext, "{\n            (getContext() as MutableContextWrapper).baseContext\n        }");
                return baseContext;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.MutableContextWrapper");
        }
        Context context2 = getContext();
        ckf.f(context2, "{\n            getContext()\n        }");
        return context2;
    }

    public final void apiCall(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ede186", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        Handler handler = this.apiHandler;
        if (this.useShareApiThread || handler == null) {
            r54.l(d1aVar);
        } else {
            handler.post(new c(d1aVar));
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        ViewPager findViewPager;
        ViewPager findViewPager2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        g1a<? super MotionEvent, xhv> g1aVar = this.touchEventProcessor;
        if (g1aVar != null) {
            g1aVar.invoke(motionEvent);
        }
        if (this.enableCompatInViewPager) {
            int action = motionEvent.getAction();
            if (action == 0 && (findViewPager2 = findViewPager()) != null) {
                findViewPager2.requestDisallowInterceptTouchEvent(true);
            }
            if ((action == 1 || action == 3) && (findViewPager = findViewPager()) != null) {
                findViewPager.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        jwk jwkVar;
        ViewPager findViewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        b bVar = this.coreOverScrollByCallback;
        if (bVar == null) {
            z2 = false;
        } else {
            z2 = false;
            bVar.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        if (this.enableCompatInViewPager) {
            if (((i3 == 0 && i < 0) || (i3 == i5 && i > 0)) && (findViewPager = findViewPager()) != null) {
                findViewPager.requestDisallowInterceptTouchEvent(z2);
            }
            if (i4 <= 20 && i2 <= 0 && (jwkVar = this.webViewScrollToTopListener) != null) {
                jwkVar.b();
            }
        }
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            if (aqp.Companion.y0()) {
                kew.h(this);
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        super.destroy();
        try {
            Handler handler = this.apiHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.apiHandler = null;
            HandlerThread handlerThread = this.apiThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.apiThread = null;
            obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th3) {
            obj2 = Result.m1108constructorimpl(kotlin.b.a(th3));
        }
        Throwable th4 = Result.m1111exceptionOrNullimpl(obj2);
        if (th4 != null) {
            npp.Companion.c("catching block has error", th4);
        }
    }

    public final void destroyWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5272a7c6", new Object[]{this});
            return;
        }
        removeAllViews();
        destroy();
    }

    public final boolean getApiCallByAsyncBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cdb6a97", new Object[]{this})).booleanValue();
        }
        return this.apiCallByAsyncBridge;
    }

    public final b getCoreOverScrollByCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("86e7d4cc", new Object[]{this});
        }
        return this.coreOverScrollByCallback;
    }

    public final g1a<MotionEvent, xhv> getTouchEventProcessor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("9aeaac54", new Object[]{this});
        }
        return this.touchEventProcessor;
    }

    public final void initRenderSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b65910", new Object[]{this});
            return;
        }
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        if (r54.s()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        setVerticalScrollbarOverlay(true);
        setOverScrollMode(2);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            super.reload();
        }
    }

    public void render(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df87a7", new Object[]{this, str});
            return;
        }
        initRenderSettings();
        loadUrl(str);
    }

    public final void setApiCallByAsyncBridge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885ef315", new Object[]{this, new Boolean(z)});
        } else {
            this.apiCallByAsyncBridge = z;
        }
    }

    public final void setCoreOverScrollByCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1931d4", new Object[]{this, bVar});
        } else {
            this.coreOverScrollByCallback = bVar;
        }
    }

    public final void setEnableCompatInViewPager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31e6cdb", new Object[]{this, new Boolean(z)});
        } else {
            this.enableCompatInViewPager = z;
        }
    }

    public final void setOuterCtx(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488001b3", new Object[]{this, context});
        } else if (getContext() instanceof MutableContextWrapper) {
            Context context2 = getContext();
            if (context2 != null) {
                ((MutableContextWrapper) context2).setBaseContext(context);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.MutableContextWrapper");
        }
    }

    public final void setTouchEventProcessor(g1a<? super MotionEvent, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f19442", new Object[]{this, g1aVar});
        } else {
            this.touchEventProcessor = g1aVar;
        }
    }

    public final void setUseSharedApiThread(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9524213", new Object[]{this, new Boolean(z)});
            return;
        }
        this.useShareApiThread = z;
        if (!z && this.apiHandler == null) {
            HandlerThread handlerThread = new HandlerThread("asyncApi");
            this.apiThread = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = this.apiThread;
            ckf.d(handlerThread2);
            this.apiHandler = new Handler(handlerThread2.getLooper());
        }
    }

    public final void setWebViewScrollToTopListener(jwk jwkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6d5edd", new Object[]{this, jwkVar, new Integer(i)});
            return;
        }
        this.webViewScrollToTopListener = jwkVar;
        if (jwkVar != null && jwkVar.a()) {
            jwkVar.c(this.topDetectedHelper);
            this.topDetectedHelper.b(i);
        }
    }

    public ShopBaseWebView(Context context, AttributeSet attributeSet) {
        super(new MutableContextWrapper(context), attributeSet);
        WVUCWebView.setBizCode("shop");
        initBridge();
    }

    public ShopBaseWebView(Context context) {
        super(new MutableContextWrapper(context));
        WVUCWebView.setBizCode("shop");
        initBridge();
    }
}
