package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
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
public final class mds implements x5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f23980a;
    public final ITMSPage b;
    public final RelativeLayout c;
    public final y0e d;
    public final TMSPageRootView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715120);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715119);
        t2o.a(839909511);
    }

    public mds(Context context, ITMSPage iTMSPage) {
        ckf.g(context, "mContext");
        ckf.g(iTMSPage, "mPage");
        this.f23980a = context;
        this.b = iTMSPage;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.c = relativeLayout;
        this.e = new TMSPageRootView(context);
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        y0e createTitleBar = iContainerViewFactory == null ? null : iContainerViewFactory.createTitleBar(context, iTMSPage);
        this.d = createTitleBar;
        if (createTitleBar != null) {
            relativeLayout.addView(createTitleBar.getContentView());
        }
        View view = iTMSPage.getView();
        if (view != null) {
            d(view);
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
        View findViewById = this.e.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.e.removeView(findViewById);
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
            this.c.setBackgroundColor(p.intValue());
        }
        c(qml.j(iTMSPage));
        y0e y0eVar = this.d;
        if (y0eVar != null) {
            y0eVar.attachPage(iTMSPage);
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
            TMSLogger.b("TMSTabItemPageContainer", "create error page is null");
            return;
        }
        TMSPageRootView tMSPageRootView = this.e;
        int i = R.id.tms_error_widget;
        View findViewById = tMSPageRootView.findViewById(i);
        if (findViewById != null) {
            this.e.removeView(findViewById);
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
            layoutParams.bottomMargin = xcs.a(this.f23980a, 90.0f);
            layoutParams.setMarginStart(xcs.a(this.f23980a, 8.0f));
            layoutParams.setMarginEnd(xcs.a(this.f23980a, 8.0f));
            frameLayout.setId(i);
            frameLayout.setLayoutParams(layoutParams);
            this.e.addView(frameLayout);
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
        if (z) {
            TMSPageRootView tMSPageRootView = this.e;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            tMSPageRootView.setLayoutParams(layoutParams);
            y0e y0eVar = this.d;
            if (y0eVar != null) {
                y0eVar.setTranslucent(true);
            }
        } else {
            y0e y0eVar2 = this.d;
            if (y0eVar2 != null) {
                y0eVar2.setTranslucent(false);
            }
            y0e y0eVar3 = this.d;
            if (!(y0eVar3 == null || (contentView = y0eVar3.getContentView()) == null)) {
                int id = contentView.getId();
                TMSPageRootView tMSPageRootView2 = this.e;
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
            TMSLogger.b("TMSTabItemPageContainer", "create error page is null");
            return;
        }
        View findViewById = this.e.findViewById(R.id.tms_tab_content_view);
        if (findViewById != null) {
            this.e.removeView(findViewById);
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
            this.e.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.d = easVar.f18428a;
        errorInfo.e = easVar.b;
        errorInfo.f13498a = true;
        createErrorPage.showErrorInfo(errorInfo, this.b.getInstance(), this.b);
        y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(this.b.getInstance());
        if (createTitleBar != null) {
            TMSPageRootView tMSPageRootView = this.e;
            View contentView = createTitleBar.getContentView();
            if (contentView != null) {
                contentView.setId(R.id.tms_loading_title_bar);
                view2 = contentView;
            }
            tMSPageRootView.addView(view2);
        }
    }

    @Override // tb.x5d
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        return this.d;
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
        View findViewById = this.e.findViewById(R.id.tms_error_view);
        if (findViewById != null) {
            this.e.removeView(findViewById);
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
        this.c.setBackgroundColor(Color.parseColor(str));
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        dyd x = qml.x(this.b);
        lxd tabBar = x == null ? null : x.getTabBar();
        this.b.getPageParams().e().m();
        Window m = this.b.getPageParams().e().m();
        if ((m == null ? false : ckf.b(m.n(), Boolean.TRUE)) && tabBar != null && tabBar.u()) {
            int a2 = xcs.a(this.f23980a, tabBar.getHeight());
            layoutParams.bottomMargin = a2;
            TMSLogger.f("TMSTabPageContainer", ckf.p("tabBarSafeArea: true , bottomMargin: ", Integer.valueOf(a2)));
        }
        this.e.addView(view, layoutParams);
        if (this.e.getParent() != null) {
            ViewParent parent2 = this.e.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.e);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        this.c.addView(this.e, 0, new RelativeLayout.LayoutParams(-1, -1));
    }
}
