package com.taobao.themis.container.splash;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.p8s;
import tb.qmc;
import tb.r8s;
import tb.xhv;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TinyAppSplashView$showLoading$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TinyAppSplashView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppSplashView$showLoading$1(TinyAppSplashView tinyAppSplashView) {
        super(0);
        this.this$0 = tinyAppSplashView;
    }

    public static /* synthetic */ Object ipc$super(TinyAppSplashView$showLoading$1 tinyAppSplashView$showLoading$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/TinyAppSplashView$showLoading$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ISplashView.Status e = TinyAppSplashView.e(this.this$0);
        ISplashView.Status status = ISplashView.Status.LOADING;
        if (e.compareTo(status) <= 0) {
            TinyAppSplashView.d(this.this$0).removeAllViews();
            qmc createLoadingPage = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createLoadingPage(TinyAppSplashView.c(this.this$0));
            if (createLoadingPage == null) {
                TMSLogger.b("DefaultSplashView", "create loading page is null");
                return;
            }
            TinyAppSplashView.f(this.this$0, status);
            TinyAppSplashView.d(this.this$0).setVisibility(0);
            ViewGroup d = TinyAppSplashView.d(this.this$0);
            ViewGroup viewGroup = (ViewGroup) createLoadingPage;
            viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.setId(R.id.tms_loading_view);
            d.addView(viewGroup);
            TinyAppSplashView tinyAppSplashView = this.this$0;
            String f = r8s.f(TinyAppSplashView.c(tinyAppSplashView));
            String str = "";
            if (f == null) {
                f = str;
            }
            createLoadingPage.setAppName(f);
            String e2 = r8s.e(TinyAppSplashView.c(tinyAppSplashView));
            if (e2 == null) {
                e2 = str;
            }
            createLoadingPage.setLogo(e2);
            String l = r8s.l(TinyAppSplashView.c(tinyAppSplashView));
            if (l != null) {
                str = l;
            }
            createLoadingPage.setDeveloper(str);
            ViewGroup d2 = TinyAppSplashView.d(this.this$0);
            int i = R.id.tms_loading_title_bar;
            if (d2.findViewById(i) == null) {
                y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(TinyAppSplashView.c(this.this$0));
                if (createTitleBar == null) {
                    TMSLogger.b("DefaultSplashView", "create title bar is null");
                    return;
                }
                ViewGroup d3 = TinyAppSplashView.d(this.this$0);
                View contentView = createTitleBar.getContentView();
                if (contentView == null) {
                    contentView = null;
                } else {
                    contentView.setId(i);
                }
                d3.addView(contentView);
            }
        }
    }
}
