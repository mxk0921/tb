package tb;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView;
import tb.od7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hns extends atw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20771a;
    public View b;
    public final WVUCWebView c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements TTDetailErrorView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView.a
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8acbb51", new Object[]{this, view});
                return;
            }
            q84.f(hns.a(hns.this), new od7.e(od7.e.HIDE_ERROR));
            hns.b(hns.this).reload();
            hns.this.hideErrorPage();
        }
    }

    static {
        t2o.a(912262962);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hns(Context context, WVUCWebView wVUCWebView) {
        super(context, wVUCWebView);
        ckf.h(context, "context");
        ckf.h(wVUCWebView, "webView");
        this.f20771a = context;
        this.c = wVUCWebView;
    }

    public static final /* synthetic */ Context a(hns hnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b1e6cfaa", new Object[]{hnsVar});
        }
        return hnsVar.f20771a;
    }

    public static final /* synthetic */ WVUCWebView b(hns hnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("f30254ef", new Object[]{hnsVar});
        }
        return hnsVar.c;
    }

    public static /* synthetic */ Object ipc$super(hns hnsVar, String str, Object... objArr) {
        if (str.hashCode() == 1246152312) {
            super.loadErrorPage();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/TTDetailBrowserUIModel");
    }

    public final TTDetailErrorView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("e4c46fb7", new Object[]{this});
        }
        TTDetailErrorView tTDetailErrorView = new TTDetailErrorView(this.f20771a);
        tTDetailErrorView.setOnReloadButtonClickListener(new a());
        return tTDetailErrorView;
    }

    @Override // tb.atw
    public void loadErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            return;
        }
        q84.f(this.f20771a, new od7.e(od7.e.SHOW_ERROR));
        tgh.b("DetailHybridWebView", "url load error");
        if (this.b == null && (xpw.a(this.f20771a) instanceof Activity)) {
            TTDetailErrorView c = c();
            this.b = c;
            setErrorView(c);
        }
        super.loadErrorPage();
    }
}
