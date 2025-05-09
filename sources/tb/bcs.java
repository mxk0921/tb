package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.app.page.TMSPageRootView;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.x5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bcs implements x5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f16321a;
    public final ITMSPage b;
    public final ConstraintLayout c;
    public final RelativeLayout d;
    public final y0e e;
    public final TMSPageRootView f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715110);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715109);
        t2o.a(839909511);
    }

    public bcs(Context context, ITMSPage iTMSPage) {
        View contentView;
        ckf.g(context, "mContext");
        ckf.g(iTMSPage, "mPage");
        this.f16321a = context;
        this.b = iTMSPage;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(0);
        this.c = constraintLayout;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.d = relativeLayout;
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        y0e createTitleBar = iContainerViewFactory == null ? null : iContainerViewFactory.createTitleBar(context, iTMSPage);
        this.e = createTitleBar;
        TMSPageRootView tMSPageRootView = new TMSPageRootView(context);
        this.f = tMSPageRootView;
        constraintLayout.addView(relativeLayout, 0, g(iTMSPage));
        relativeLayout.addView(tMSPageRootView, new ViewGroup.LayoutParams(-1, -1));
        if (!(createTitleBar == null || (contentView = createTitleBar.getContentView()) == null)) {
            relativeLayout.addView(contentView);
        }
        View view = iTMSPage.getView();
        if (view != null) {
            tMSPageRootView.addView(view, -1, -1);
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
            return;
        }
        ckf.g(iTMSPage, "page");
        Integer p = qml.p(iTMSPage);
        if (p != null) {
            this.d.setBackgroundColor(p.intValue());
        }
        c(qml.j(iTMSPage));
        y0e y0eVar = this.e;
        if (y0eVar != null) {
            y0eVar.attachPage(iTMSPage);
        }
    }

    @Override // tb.x5d
    public void b(eas easVar) {
        FrameLayout frameLayout;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed81c61", new Object[]{this, easVar});
            return;
        }
        ckf.g(easVar, "error");
        x5d.a.d(this, easVar);
        a3c createErrorWidget = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorWidget(this.b.getInstance());
        if (createErrorWidget == null) {
            TMSLogger.b("TMSPageContainer", "create error page is null");
            return;
        }
        RelativeLayout relativeLayout = this.d;
        int i = R.id.tms_error_widget;
        View findViewById = relativeLayout.findViewById(i);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
        View view2 = createErrorWidget.getView();
        Integer num = null;
        if (view2 instanceof FrameLayout) {
            frameLayout = (FrameLayout) view2;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            dyd dydVar = (dyd) this.b.getExtension(dyd.class);
            if (dydVar == null) {
                view = null;
            } else {
                view = dydVar.h1();
            }
            layoutParams.addRule(12);
            dyd dydVar2 = (dyd) this.b.getExtension(dyd.class);
            if (dydVar2 != null) {
                num = Integer.valueOf(dydVar2.d());
            }
            if (view == null || num == null) {
                layoutParams.bottomMargin = xcs.a(this.f16321a, 90.0f);
            } else {
                layoutParams.bottomMargin = xcs.a(this.f16321a, 8.0f) + num.intValue();
            }
            layoutParams.setMarginStart(xcs.a(this.f16321a, 8.0f));
            layoutParams.setMarginEnd(xcs.a(this.f16321a, 8.0f));
            frameLayout.setId(i);
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
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b9e7cf", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        if (z) {
            TMSPageRootView tMSPageRootView = this.f;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            tMSPageRootView.setLayoutParams(layoutParams);
            y0e y0eVar = this.e;
            if (y0eVar != null) {
                y0eVar.setTranslucent(true);
            }
        } else {
            y0e y0eVar2 = this.e;
            if (y0eVar2 != null) {
                y0eVar2.setTranslucent(false);
            }
            y0e y0eVar3 = this.e;
            if (!(y0eVar3 == null || (contentView = y0eVar3.getContentView()) == null)) {
                int id = contentView.getId();
                TMSPageRootView tMSPageRootView2 = this.f;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(3, id);
                tMSPageRootView2.setLayoutParams(layoutParams2);
            }
        }
        this.c.invalidate();
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
            TMSLogger.b("TMSPageContainer", "create error page is null");
            return;
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
            this.c.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.d = easVar.f18428a;
        errorInfo.e = easVar.b;
        errorInfo.f13498a = true;
        createErrorPage.showErrorInfo(errorInfo, this.b.getInstance(), this.b);
        y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(this.b.getInstance());
        if (createTitleBar != null) {
            ConstraintLayout constraintLayout = this.c;
            View contentView = createTitleBar.getContentView();
            if (contentView != null) {
                contentView.setId(R.id.tms_loading_title_bar);
                view2 = contentView;
            }
            constraintLayout.addView(view2);
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
        int c = xcs.c(this.f16321a);
        int b = xcs.b(this.f16321a);
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
        if (q9s.b0()) {
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, 0);
            layoutParams2.topToTop = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.bottomToBottom = 0;
            layoutParams2.dimensionRatio = str;
            return layoutParams2;
        }
        if ((i * 1.0d) / i2 > d) {
            i3 = -1;
            i4 = 0;
        } else {
            i3 = 0;
        }
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(i4, i3);
        layoutParams3.topToTop = 0;
        layoutParams3.startToStart = 0;
        layoutParams3.endToEnd = 0;
        layoutParams3.bottomToBottom = 0;
        layoutParams3.dimensionRatio = str;
        return layoutParams3;
    }

    @Override // tb.x5d
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        return this.e;
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
        View findViewById = this.c.findViewById(R.id.tms_error_view);
        if (findViewById != null) {
            this.c.removeView(findViewById);
        }
    }

    @Override // tb.x5d
    public void setBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde5aced", new Object[]{this, str});
            return;
        }
        ckf.g(str, "color");
        this.d.setBackgroundColor(Color.parseColor(str));
    }

    @Override // tb.x5d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9170cee", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        this.f.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f.getParent() != null) {
            ViewParent parent2 = this.f.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.f);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        this.d.addView(this.f, 0, new ViewGroup.LayoutParams(-1, -1));
        c(this.g);
    }
}
