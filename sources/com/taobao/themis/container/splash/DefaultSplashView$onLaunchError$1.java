package com.taobao.themis.container.splash;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.eas;
import tb.p8s;
import tb.wsq;
import tb.xhv;
import tb.y0e;
import tb.y2c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultSplashView$onLaunchError$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ eas $error;
    public final /* synthetic */ DefaultSplashView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSplashView$onLaunchError$1(DefaultSplashView defaultSplashView, eas easVar) {
        super(0);
        this.this$0 = defaultSplashView;
        this.$error = easVar;
    }

    public static /* synthetic */ Object ipc$super(DefaultSplashView$onLaunchError$1 defaultSplashView$onLaunchError$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/DefaultSplashView$onLaunchError$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ISplashView.Status e = DefaultSplashView.e(this.this$0);
        ISplashView.Status status = ISplashView.Status.ERROR;
        if (e != status) {
            DefaultSplashView.f(this.this$0, status);
            DefaultSplashView.d(this.this$0).removeAllViews();
            DefaultSplashView.d(this.this$0).setVisibility(0);
            y2c createErrorPage = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorPage(DefaultSplashView.c(this.this$0));
            if (createErrorPage == null) {
                TMSLogger.b("DefaultSplashView", "create error page is null");
                return;
            }
            View view = createErrorPage.getView();
            View view2 = null;
            FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            if (frameLayout != null) {
                DefaultSplashView defaultSplashView = this.this$0;
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setId(R.id.tms_error_view);
                DefaultSplashView.d(defaultSplashView).addView(frameLayout);
            }
            ErrorInfo errorInfo = new ErrorInfo();
            eas easVar = this.$error;
            errorInfo.d = easVar.f18428a;
            errorInfo.e = easVar.b;
            String str = easVar.c;
            if (str != null && !wsq.a0(str)) {
                errorInfo.b = easVar.c;
            }
            String str2 = easVar.d;
            if (str2 != null && !wsq.a0(str2)) {
                errorInfo.c = easVar.d;
            }
            createErrorPage.showErrorInfo(errorInfo, DefaultSplashView.c(this.this$0), null);
            ViewGroup d = DefaultSplashView.d(this.this$0);
            int i = R.id.tms_loading_title_bar;
            if (d.findViewById(i) == null) {
                y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(DefaultSplashView.c(this.this$0));
                if (createTitleBar == null) {
                    TMSLogger.b("DefaultSplashView", "create title bar is null");
                    return;
                }
                createTitleBar.setStyle(Window.Theme.DARK);
                ViewGroup d2 = DefaultSplashView.d(this.this$0);
                View contentView = createTitleBar.getContentView();
                if (contentView != null) {
                    contentView.setId(i);
                    view2 = contentView;
                }
                d2.addView(view2);
            }
        }
    }
}
