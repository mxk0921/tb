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
import com.taobao.themis.container.app.page.swiper.TMSViewPager;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.x5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gds implements x5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f19916a;
    public final ITMSPage b;
    public final RelativeLayout c;
    public final FrameLayout d;
    public final y0e e;
    public View f;
    public final TMSViewPager g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715136);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715135);
        t2o.a(839909511);
    }

    public gds(Context context, ITMSPage iTMSPage) {
        View contentView;
        ckf.g(context, "mContext");
        ckf.g(iTMSPage, "mPage");
        this.f19916a = context;
        this.b = iTMSPage;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c = relativeLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.d = frameLayout;
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        y0e createTitleBar = iContainerViewFactory == null ? null : iContainerViewFactory.createTitleBar(context, iTMSPage);
        this.e = createTitleBar;
        TMSViewPager tMSViewPager = new TMSViewPager(context);
        tMSViewPager.setOffscreenPageLimit(1);
        if (!iTMSPage.getPageParams().e().n()) {
            tMSViewPager.setAcceptTouchEvent(false);
        }
        this.g = tMSViewPager;
        frameLayout.addView(tMSViewPager, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
        if (createTitleBar != null && (contentView = createTitleBar.getContentView()) != null) {
            relativeLayout.addView(contentView);
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
        if (ckf.b(iTMSPage, this.b)) {
            Integer p = qml.p(iTMSPage);
            if (p != null) {
                this.c.setBackgroundColor(p.intValue());
            }
            c(qml.j(iTMSPage));
            y0e y0eVar = this.e;
            if (y0eVar != null) {
                y0eVar.attachPage(iTMSPage);
            }
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
            TMSLogger.b("TMSSwiperPageContainer", "create error page is null");
            return;
        }
        View view = createErrorWidget.getView();
        View view2 = null;
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = xcs.a(this.f19916a, 90.0f);
            layoutParams.setMarginStart(xcs.a(this.f19916a, 8.0f));
            layoutParams.setMarginEnd(xcs.a(this.f19916a, 8.0f));
            frameLayout.setId(R.id.tms_error_widget);
            frameLayout.setLayoutParams(layoutParams);
            this.d.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.d = easVar.f18428a;
        errorInfo.e = easVar.b;
        createErrorWidget.showErrorInfo(errorInfo, this.b.getInstance(), this.b);
        y0e createTitleBar = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createTitleBar(this.b.getInstance());
        if (createTitleBar != null) {
            FrameLayout frameLayout2 = this.d;
            View contentView = createTitleBar.getContentView();
            if (contentView != null) {
                contentView.setId(R.id.tms_loading_title_bar);
                view2 = contentView;
            }
            frameLayout2.addView(view2);
        }
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
            FrameLayout frameLayout = this.d;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            frameLayout.setLayoutParams(layoutParams);
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
                FrameLayout frameLayout2 = this.d;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(3, id);
                frameLayout2.setLayoutParams(layoutParams2);
            }
        }
        this.c.invalidate();
    }

    @Override // tb.x5d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9170cee", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        View view2 = this.f;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
        }
        View findViewById = this.d.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
        this.f = view;
        this.g.addView(view);
    }

    @Override // tb.x5d
    public void e(eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6292a20", new Object[]{this, easVar});
        } else {
            x5d.a.c(this, easVar);
        }
    }

    public final TMSViewPager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSViewPager) ipChange.ipc$dispatch("c9103109", new Object[]{this});
        }
        return this.g;
    }

    public final void g(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1a1c4c", new Object[]{this, view, new Integer(i)});
            return;
        }
        ckf.g(view, "view");
        this.d.addView(view, new FrameLayout.LayoutParams(-1, i));
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
        } else {
            x5d.a.a(this);
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
}
