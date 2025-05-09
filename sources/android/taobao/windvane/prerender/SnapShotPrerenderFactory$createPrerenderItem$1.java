package android.taobao.windvane.prerender;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.uc.webview.export.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.lcn;
import tb.wum;
import tb.xhv;
import tb.xum;
import tb.yaa;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "html", "Ltb/xhv;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SnapShotPrerenderFactory$createPrerenderItem$1 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a $callback;
    public final /* synthetic */ xum $params;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: android.taobao.windvane.prerender.SnapShotPrerenderFactory$createPrerenderItem$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String $html;

        /* compiled from: Taobao */
        /* renamed from: android.taobao.windvane.prerender.SnapShotPrerenderFactory$createPrerenderItem$1$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class a extends WVUCWebViewClient {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ wum c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wum wumVar, Application application, Context context) {
                super(context);
                this.c = wumVar;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/prerender/SnapShotPrerenderFactory$createPrerenderItem$1$1$webviewClient$1");
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "Themis/Performance/Prerender", "preRendered webview is ready, url: " + SnapShotPrerenderFactory$createPrerenderItem$1.this.$params.e());
                this.c.d(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$html = str;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/prerender/SnapShotPrerenderFactory$createPrerenderItem$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            Application application = yaa.n;
            if (application == null) {
                SnapShotPrerenderFactory$createPrerenderItem$1.this.$callback.invoke(null);
                lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "context is null");
                return;
            }
            WVUCWebView wVUCWebView = new WVUCWebView(new MutableContextWrapper(application));
            wum wumVar = new wum(wVUCWebView, SnapShotPrerenderFactory$createPrerenderItem$1.this.$params, false);
            wVUCWebView.setWebViewClient(new a(wumVar, application, application));
            wVUCWebView.loadDataWithBaseURL(SnapShotPrerenderFactory$createPrerenderItem$1.this.$params.e(), this.$html, "text/html", "UTF-8", null);
            SnapShotPrerenderFactory$createPrerenderItem$1.this.$callback.invoke(wumVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapShotPrerenderFactory$createPrerenderItem$1(g1a g1aVar, xum xumVar) {
        super(1);
        this.$callback = g1aVar;
        this.$params = xumVar;
    }

    public static /* synthetic */ Object ipc$super(SnapShotPrerenderFactory$createPrerenderItem$1 snapShotPrerenderFactory$createPrerenderItem$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/prerender/SnapShotPrerenderFactory$createPrerenderItem$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            this.$callback.invoke(null);
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "Themis/Performance/Prerender", "readValidSnapshotAsync complete, htmlEmpty: " + TextUtils.isEmpty(str) + ", url: " + this.$params.e());
        } else {
            CommonExtKt.o(new AnonymousClass1(str));
        }
    }
}
