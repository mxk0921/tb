package android.taobao.windvane.extra.jsbridge;

import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.yd1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/DefaultAsyncApiProxy;", "Ltb/yd1;", "Ljava/io/Serializable;", "<init>", "()V", "Ljava/lang/Runnable;", "call", "Ltb/xhv;", "apiCall", "(Ljava/lang/Runnable;)V", "injectAsyncApiEvn", "", "webViewObject", "setUCWebView", "(Ljava/lang/Object;)V", "releaseProxy", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "ucWebView", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "Landroid/os/Handler;", "asyncApiHandler", "Landroid/os/Handler;", "Companion", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DefaultAsyncApiProxy implements yd1, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private static final Handler apiHandler;
    private static final HandlerThread apiThread;
    private Handler asyncApiHandler = apiHandler;
    private WVUCWebView ucWebView;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/DefaultAsyncApiProxy$Companion;", "", "()V", "apiHandler", "Landroid/os/Handler;", "apiThread", "Landroid/os/HandlerThread;", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Companion {
        static {
            t2o.a(989855944);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    @Override // tb.yd1
    public void apiCall(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6143691d", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.asyncApiHandler;
        if (runnable != null) {
            handler.post(runnable);
        }
    }

    @Override // tb.yd1
    public void injectAsyncApiEvn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b5d235", new Object[]{this});
            return;
        }
        Log.e("DefaultAsyncApiProxy", "enable async api");
        WVUCWebView wVUCWebView = this.ucWebView;
        if (wVUCWebView != null) {
            WVUCWebView wVUCWebView2 = this.ucWebView;
            ckf.d(wVUCWebView2);
            wVUCWebView.addJavascriptInterface(new CommonAsyncJSAPIBridge(wVUCWebView2), "__windvane_async__");
        }
    }

    @Override // tb.yd1
    public void releaseProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ce77ae", new Object[]{this});
        }
    }

    @Override // tb.yd1
    public void setUCWebView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3738b76c", new Object[]{this, obj});
        } else if (obj instanceof WVUCWebView) {
            this.ucWebView = (WVUCWebView) obj;
        }
    }

    static {
        t2o.a(989855943);
        t2o.a(989856199);
        HandlerThread handlerThread = new HandlerThread("wvAsyncApiThread");
        handlerThread.start();
        apiThread = handlerThread;
        apiHandler = new Handler(handlerThread.getLooper());
    }
}
