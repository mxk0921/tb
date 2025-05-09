package com.taobao.themis.container.splash;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.eas;
import tb.p8s;
import tb.xhv;
import tb.y0e;
import tb.y2c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TinyAppSplashView$onLaunchError$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ eas $error;
    public final /* synthetic */ TinyAppSplashView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppSplashView$onLaunchError$1(TinyAppSplashView tinyAppSplashView, eas easVar) {
        super(0);
        this.this$0 = tinyAppSplashView;
        this.$error = easVar;
    }

    public static /* synthetic */ Object ipc$super(TinyAppSplashView$onLaunchError$1 tinyAppSplashView$onLaunchError$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/TinyAppSplashView$onLaunchError$1");
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
        ISplashView.Status status = ISplashView.Status.ERROR;
        if (e != status) {
            TinyAppSplashView.f(this.this$0, status);
            TinyAppSplashView.d(this.this$0).removeAllViews();
            TinyAppSplashView.d(this.this$0).setVisibility(0);
            y2c createErrorPage = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorPage(TinyAppSplashView.c(this.this$0));
            if (createErrorPage == null) {
                TMSLogger.b("DefaultSplashView", "create error page is null");
                return;
            }
            View view = createErrorPage.getView();
            View view2 = null;
            FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            if (frameLayout != null) {
                TinyAppSplashView tinyAppSplashView = this.this$0;
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setId(R.id.tms_error_view);
                TinyAppSplashView.d(tinyAppSplashView).addView(frameLayout);
            }
            ErrorInfo errorInfo = new ErrorInfo();
            eas easVar = this.$error;
            errorInfo.d = easVar.f18428a;
            errorInfo.e = easVar.b;
            if (!TextUtils.isEmpty(easVar.c)) {
                errorInfo.b = easVar.c;
            }
            if (!TextUtils.isEmpty(easVar.d)) {
                errorInfo.c = easVar.d;
            }
            createErrorPage.showErrorInfo(errorInfo, TinyAppSplashView.c(this.this$0), null);
            ViewGroup d = TinyAppSplashView.d(this.this$0);
            int i = R.id.tms_loading_title_bar;
            if (d.findViewById(i) == null) {
                y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(TinyAppSplashView.c(this.this$0));
                if (createTitleBar == null) {
                    TMSLogger.b("DefaultSplashView", "create title bar is null");
                    return;
                }
                ViewGroup d2 = TinyAppSplashView.d(this.this$0);
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
