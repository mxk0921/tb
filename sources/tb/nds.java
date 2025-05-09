package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.x5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nds implements x5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f24665a;
    public final ITMSPage b;
    public final ConstraintLayout c;
    public final RelativeLayout d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715122);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715121);
        t2o.a(839909511);
    }

    public nds(Context context, ITMSPage iTMSPage) {
        View h1;
        ckf.g(context, "mContext");
        ckf.g(iTMSPage, "mPage");
        this.f24665a = context;
        this.b = iTMSPage;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(0);
        this.c = constraintLayout;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.d = relativeLayout;
        constraintLayout.addView(relativeLayout, 0, g(iTMSPage));
        dyd dydVar = (dyd) iTMSPage.getExtension(dyd.class);
        View view = null;
        if (!(dydVar == null || (h1 = dydVar.h1()) == null)) {
            h1.setId(R.id.tms_tab_bar);
            view = h1;
        }
        if (view != null) {
            relativeLayout.setClipChildren(false);
            relativeLayout.setClipToPadding(false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            xhv xhvVar = xhv.INSTANCE;
            relativeLayout.addView(view, layoutParams);
        }
    }

    @Override // tb.x5d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9834f51", new Object[]{this});
            return;
        }
        x5d.a.b(this);
        View findViewById = this.d.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
    }

    @Override // tb.x5d
    public void attachPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
        } else {
            ckf.g(iTMSPage, "page");
        }
    }

    @Override // tb.x5d
    public void b(eas easVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed81c61", new Object[]{this, easVar});
            return;
        }
        ckf.g(easVar, "error");
        x5d.a.d(this, easVar);
        a3c createErrorWidget = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorWidget(this.b.getInstance());
        if (createErrorWidget == null) {
            TMSLogger.b("TMSTabPageContainer", "create error page is null");
            return;
        }
        View view = createErrorWidget.getView();
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = xcs.a(this.f24665a, 90.0f);
            layoutParams.setMarginStart(xcs.a(this.f24665a, 8.0f));
            layoutParams.setMarginEnd(xcs.a(this.f24665a, 8.0f));
            frameLayout.setId(R.id.tms_error_widget);
            frameLayout.setLayoutParams(layoutParams);
            this.d.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.d = easVar.f18428a;
        errorInfo.e = easVar.b;
        createErrorWidget.showErrorInfo(errorInfo, this.b.getInstance(), this.b);
    }

    @Override // tb.x5d
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b9e7cf", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.x5d
    public void e(eas easVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6292a20", new Object[]{this, easVar});
            return;
        }
        ckf.g(easVar, "error");
        x5d.a.c(this, easVar);
        y2c createErrorPage = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorPage(this.b.getInstance());
        if (createErrorPage == null) {
            TMSLogger.b("TMSTabPageContainer", "create error page is null");
            return;
        }
        View findViewById = this.d.findViewById(R.id.tms_tab_content_view);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
        View view = createErrorPage.getView();
        View view2 = null;
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(R.id.tms_error_view);
            this.d.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.d = easVar.f18428a;
        errorInfo.e = easVar.b;
        errorInfo.f13498a = true;
        createErrorPage.showErrorInfo(errorInfo, this.b.getInstance(), this.b);
        y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(this.b.getInstance());
        if (createTitleBar != null) {
            RelativeLayout relativeLayout = this.d;
            View contentView = createTitleBar.getContentView();
            if (contentView != null) {
                contentView.setId(R.id.tms_loading_title_bar);
                view2 = contentView;
            }
            relativeLayout.addView(view2);
        }
    }

    public final boolean f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e78869", new Object[]{this, iTMSPage})).booleanValue();
        }
        if (!qml.y(iTMSPage) || !q9s.A()) {
            return false;
        }
        return true;
    }

    public final ViewGroup.LayoutParams g(ITMSPage iTMSPage) {
        int i;
        double d;
        String str;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("3b3f148d", new Object[]{this, iTMSPage});
        }
        int i4 = -1;
        if (!f(iTMSPage)) {
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
            layoutParams.topToTop = 0;
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.bottomToBottom = 0;
            return layoutParams;
        }
        int c = xcs.c(this.f24665a);
        int b = xcs.b(this.f24665a);
        if (qml.o(iTMSPage) == Window.Orientation.LANDSCAPE) {
            i = Math.max(c, b);
            i2 = Math.min(c, b);
            str = cbw.VALUE_SIXTEEN_NINE_RATIO;
            d = 1.7777777777777777d;
        } else {
            i = Math.min(c, b);
            i2 = Math.max(c, b);
            str = "9:16";
            d = 0.5625d;
        }
        if ((i * 1.0d) / i2 > d) {
            i3 = -1;
            i4 = 0;
        } else {
            i3 = 0;
        }
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(i4, i3);
        layoutParams2.topToTop = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.dimensionRatio = str;
        return layoutParams2;
    }

    @Override // tb.x5d
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        return null;
    }

    @Override // tb.x5d
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.x5d
    public void hideErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b100b2", new Object[]{this});
            return;
        }
        x5d.a.a(this);
        View findViewById = this.d.findViewById(R.id.tms_error_view);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
    }

    @Override // tb.x5d
    public void setBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde5aced", new Object[]{this, str});
        } else {
            ckf.g(str, "color");
        }
    }

    @Override // tb.x5d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9170cee", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        RelativeLayout relativeLayout = this.d;
        int i = R.id.tms_tab_content_view;
        View findViewById = relativeLayout.findViewById(i);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
        RelativeLayout relativeLayout2 = this.d;
        view.setId(i);
        relativeLayout2.addView(view, 0, new RelativeLayout.LayoutParams(-1, -1));
    }
}
