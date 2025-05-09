package tb;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wcc f22145a;
    public WeakReference<View> b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22146a;

        /* compiled from: Taobao */
        /* renamed from: tb.jps$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class View$OnClickListenerC0957a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public View$OnClickListenerC0957a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    jps.a(jps.this);
                }
            }
        }

        public a(Activity activity) {
            this.f22146a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View b = wbo.a().b(this.f22146a);
            ViewProxy.setOnClickListener(b, new View$OnClickListenerC0957a());
            jps.b(jps.this, new WeakReference(b));
            boolean f0 = com.taobao.tao.navigation.a.f0("homePage", "rocket", b);
            vqa j = vqa.k().i("BottomTabBar").j("initCustomView");
            j.e("更新小火箭按钮是否成功" + f0).a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                jps.a(jps.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22149a;

        public c(View view) {
            this.f22149a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean f0 = com.taobao.tao.navigation.a.f0("homePage", "rocket", this.f22149a);
            vqa j = vqa.k().i("BottomTabBar").j("initCustomView");
            j.e("更新小火箭按钮是否成功" + f0).a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            jps.this.k();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22151a;

        public e(String str) {
            this.f22151a = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            String str = this.f22151a;
            if (str == null || (!str.endsWith("apng") && !this.f22151a.endsWith("gif"))) {
                z = false;
            }
            jps.this.j(drawable, z);
            return false;
        }
    }

    static {
        t2o.a(729810369);
    }

    public jps(wcc wccVar) {
        this.f22145a = wccVar;
    }

    public static /* synthetic */ void a(jps jpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e687b96", new Object[]{jpsVar});
        } else {
            jpsVar.m();
        }
    }

    public static /* synthetic */ WeakReference b(jps jpsVar, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("6faad8f3", new Object[]{jpsVar, weakReference});
        }
        jpsVar.b = weakReference;
        return weakReference;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public final Activity f() {
        IHomePageProviderService iHomePageProviderService;
        z6d pageProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        wcc wccVar = this.f22145a;
        if (wccVar == null || (iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class)) == null || (pageProvider = iHomePageProviderService.getPageProvider()) == null) {
            return null;
        }
        return pageProvider.k1();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879e86d", new Object[]{this});
            return;
        }
        Activity f = f();
        if (f == null) {
            vqa.k().i("BottomTabBar").j("prepareView").e("activity == null").a();
            return;
        }
        View b2 = wbo.a().b(f);
        ViewProxy.setOnClickListener(b2, new b());
        this.b = new WeakReference<>(b2);
        m5a.a().j(new c(b2));
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else if (this.b != null) {
            vqa.k().i("BottomTabBar").j("prepareView").e("已经初始化过了").a();
        } else if (vxl.b().J()) {
            i();
        } else {
            g();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df154762", new Object[]{this});
            return;
        }
        Activity f = f();
        if (f == null) {
            vqa.k().i("BottomTabBar").j("prepareView").e("activity == null").a();
        } else {
            m5a.a().g(new a(f), 100L);
        }
    }

    public void j(Drawable drawable, boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e036ffb", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        WeakReference<View> weakReference = this.b;
        if (weakReference == null) {
            view = null;
        } else {
            view = weakReference.get();
        }
        if (view != null) {
            HImageView hImageView = (HImageView) view.findViewById(R.id.iv_btn_background);
            HImageView hImageView2 = (HImageView) view.findViewById(R.id.iv_image);
            hImageView2.clearAnimation();
            hImageView2.setVisibility(8);
            hImageView.setSkipAutoSize(z);
            hImageView.setImageDrawable(drawable);
        }
    }

    public void k() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6deaab", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.b;
        if (weakReference == null) {
            view = null;
        } else {
            view = weakReference.get();
        }
        if (view != null) {
            HImageView hImageView = (HImageView) view.findViewById(R.id.iv_btn_background);
            ((HImageView) view.findViewById(R.id.iv_image)).setVisibility(0);
            try {
                hImageView.setImageDrawable(view.getContext().getDrawable(R.drawable.homepage_tab_tao_background));
            } catch (Exception e2) {
                y9n.d("Unexpected API call exception.", e2);
            }
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54290ab6", new Object[]{this, str});
            return;
        }
        Activity f = f();
        if (f != null) {
            s0m.B().N0(f).U(p2b.c(str, null), str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, p2b.f(str, "5401")).succListener(new e(str)).failListener(new d()).fetch();
        }
    }

    public final void m() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
        } else if (this.f22145a != null) {
            uqa.b("TopTabBar", "onClickRocket", "点击小火箭");
            IHomeViewService iHomeViewService = (IHomeViewService) this.f22145a.a(IHomeViewService.class);
            if (iHomeViewService == null || !iHomeViewService.isScrolling()) {
                IHomeControllerService iHomeControllerService = (IHomeControllerService) this.f22145a.a(IHomeControllerService.class);
                if (iHomeControllerService != null && (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) != null) {
                    currentSubTabController.onClickRocket();
                    return;
                }
                return;
            }
            uqa.b("TopTabBar", "onClickRocket", "viewpager 滚动中不允许点击小火箭");
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
        } else {
            g();
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a9efb", new Object[]{this, new Boolean(z)});
            return;
        }
        k();
        if (z) {
            d();
        } else {
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b06463", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<View> weakReference = this.b;
        if (weakReference == null) {
            view = null;
        } else {
            view = weakReference.get();
        }
        if (view != null) {
            lle.b((HImageView) view.findViewById(R.id.iv_btn_background), z ? 1 : 0);
            lle.b((HImageView) view.findViewById(R.id.iv_image), z);
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c4f250", new Object[]{this, str});
            return;
        }
        vqa.k().i("BottomTabBar").j("updateTabBarBgImage").e("TabBarActionButtonProvider.updateTabbarFestival").g("tabBarButtonImageUrl", str).a();
        if (!TextUtils.isEmpty(str)) {
            l(str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc745b7", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view != null) {
            HImageView hImageView = (HImageView) view.findViewById(R.id.iv_image);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -(hImageView.getHeight() / 2), 0.0f);
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(300L);
            hImageView.setContentDescription("跳转到猜你喜欢");
            hImageView.startAnimation(translateAnimation);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3081ec66", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.b;
        View view = weakReference == null ? null : weakReference.get();
        if (view != null) {
            HImageView hImageView = (HImageView) view.findViewById(R.id.iv_image);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -(hImageView.getHeight() / 2));
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(300L);
            hImageView.setContentDescription("跳转到首页");
            hImageView.startAnimation(translateAnimation);
        }
    }
}
