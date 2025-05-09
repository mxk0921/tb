package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.x5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fds implements x5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f19221a;
    public final Context b;
    public final ITMSPage c;
    public final RelativeLayout d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715115);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715114);
        t2o.a(839909511);
    }

    public fds(ITMSPage iTMSPage, Context context, ITMSPage iTMSPage2) {
        ckf.g(iTMSPage, "mSwiperPage");
        ckf.g(context, "mContext");
        ckf.g(iTMSPage2, "mPage");
        this.f19221a = iTMSPage;
        this.b = context;
        this.c = iTMSPage2;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.d = relativeLayout;
        View view = iTMSPage2.getView();
        if (view != null) {
            relativeLayout.addView(view, -1, -1);
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
        a3c createErrorWidget = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorWidget(this.c.getInstance());
        if (createErrorWidget == null) {
            TMSLogger.b("TMSSwiperItemPageContainer", "create error page is null");
            return;
        }
        RelativeLayout relativeLayout = this.d;
        int i = R.id.tms_error_widget;
        View findViewById = relativeLayout.findViewById(i);
        if (findViewById != null) {
            this.d.removeView(findViewById);
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
            layoutParams.bottomMargin = xcs.a(this.b, 90.0f);
            layoutParams.setMarginStart(xcs.a(this.b, 8.0f));
            layoutParams.setMarginEnd(xcs.a(this.b, 8.0f));
            frameLayout.setId(i);
            frameLayout.setLayoutParams(layoutParams);
            this.d.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.d = easVar.f18428a;
        errorInfo.e = easVar.b;
        createErrorWidget.showErrorInfo(errorInfo, this.c.getInstance(), this.c);
    }

    @Override // tb.x5d
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b9e7cf", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.x5d
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9170cee", new Object[]{this, view});
        } else {
            ckf.g(view, "view");
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
        this.d.removeAllViews();
        y2c createErrorPage = ((ISplashViewFactory) p8s.g(ISplashViewFactory.class)).createErrorPage(this.c.getInstance());
        if (createErrorPage == null) {
            TMSLogger.b("TMSSwiperItemPageContainer", "create error page is null");
            return;
        }
        View view = createErrorPage.getView();
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
        createErrorPage.showErrorInfo(errorInfo, this.c.getInstance(), this.c);
    }

    @Override // tb.x5d
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        tll pageContext = this.f19221a.getPageContext();
        if (pageContext == null) {
            return null;
        }
        return pageContext.getTitleBar();
    }

    @Override // tb.x5d
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.d;
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
}
