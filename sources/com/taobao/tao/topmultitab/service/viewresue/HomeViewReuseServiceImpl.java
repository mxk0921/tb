package com.taobao.tao.topmultitab.service.viewresue;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bqa;
import tb.cfc;
import tb.dvh;
import tb.f0b;
import tb.f4b;
import tb.fve;
import tb.i1d;
import tb.mnm;
import tb.phg;
import tb.r5a;
import tb.t2o;
import tb.vxl;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeViewReuseServiceImpl implements IHomeViewReuseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String STAGE_PRE_CREATE_MULTI_TAB_VIEW = "preCreateMultiTabView";
    private static final String STAGE_PRE_CREATE_ROCKET_VIEW = "preRenderRocketView";
    private static final String STAGE_PRE_CREATE_ROOT_VIEW = "preCreateRootView";
    private static final String STAGE_PRE_CREATE_THEME = "preRenderTheme";
    private static final String TAG = "HomeViewReuseServiceImpl";
    private volatile boolean isCreateHomepageViewInMainTread;
    private volatile boolean isCreateRocketViewInMainTread;
    private View mHomepageView;
    private View mRocketView;
    private IHomeViewService mViewService;
    private int remainingThreads;
    private final long overtimeTimeout = f4b.i("enablePreCreateWaitTimeout", 1000);
    private final Object lock = new Object();
    private final mnm mPreRenderNativeView = new mnm();
    private final AtomicBoolean mIsFirstUsePreRenderView = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IHomeViewService f12863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, IHomeViewService iHomeViewService) {
            super(str);
            this.f12863a = iHomeViewService;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/viewresue/HomeViewReuseServiceImpl$1");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String c = dvh.c(dvh.TASK_PRE_CREATE_NATIVE_VIEW);
                i1d.a();
                bqa.d(HomeViewReuseServiceImpl.TAG, "开始异步首页框架视图");
                phg.k(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_ROOT_VIEW);
                if (HomeViewReuseServiceImpl.access$000(HomeViewReuseServiceImpl.this) == null && !HomeViewReuseServiceImpl.access$100(HomeViewReuseServiceImpl.this)) {
                    fve.e(HomeViewReuseServiceImpl.TAG, "preCreateRootView create mHomepageView");
                    HomeViewReuseServiceImpl homeViewReuseServiceImpl = HomeViewReuseServiceImpl.this;
                    HomeViewReuseServiceImpl.access$002(homeViewReuseServiceImpl, HomeViewReuseServiceImpl.access$200(homeViewReuseServiceImpl).d(this.f12863a));
                }
                phg.j(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_ROOT_VIEW);
                dvh.g(c, true);
            } finally {
                try {
                    bqa.d(HomeViewReuseServiceImpl.TAG, "异步首页框架视图完成");
                } finally {
                }
            }
            bqa.d(HomeViewReuseServiceImpl.TAG, "异步首页框架视图完成");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12864a;
        public final /* synthetic */ IHomeViewService b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, View view, IHomeViewService iHomeViewService) {
            super(str);
            this.f12864a = view;
            this.b = iHomeViewService;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/viewresue/HomeViewReuseServiceImpl$2");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String c = dvh.c(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_MULTI_TAB_VIEW);
                i1d.a();
                bqa.d(HomeViewReuseServiceImpl.TAG, "preCreateMultiTabView补偿");
                phg.k(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_MULTI_TAB_VIEW);
                if (!(this.f12864a == null || this.b == null)) {
                    fve.e(HomeViewReuseServiceImpl.TAG, "preCreateMultiTabView补偿");
                    this.b.preCreateMultiTabView(this.f12864a);
                }
                phg.j(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_MULTI_TAB_VIEW);
                dvh.g(c, true);
            } catch (Throwable th) {
                bqa.b(HomeViewReuseServiceImpl.TAG, "preCreateMultiTabView补偿异常", th);
            }
            bqa.d(HomeViewReuseServiceImpl.TAG, "preCreateMultiTabView补偿异常完成");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/viewresue/HomeViewReuseServiceImpl$3");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bqa.d(HomeViewReuseServiceImpl.TAG, "开始异步创建小火箭视图");
            try {
                String c = dvh.c(dvh.TASK_PRE_CREATE_ROCKET_VIEW);
                phg.k(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_ROCKET_VIEW);
                if (HomeViewReuseServiceImpl.access$400(HomeViewReuseServiceImpl.this) == null && !HomeViewReuseServiceImpl.access$500(HomeViewReuseServiceImpl.this)) {
                    HomeViewReuseServiceImpl homeViewReuseServiceImpl = HomeViewReuseServiceImpl.this;
                    HomeViewReuseServiceImpl.access$402(homeViewReuseServiceImpl, HomeViewReuseServiceImpl.access$200(homeViewReuseServiceImpl).c());
                }
                phg.j(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_ROCKET_VIEW);
                dvh.g(c, true);
            } finally {
                try {
                    bqa.d(HomeViewReuseServiceImpl.TAG, "异步创建小火箭视图完成");
                } finally {
                }
            }
            bqa.d(HomeViewReuseServiceImpl.TAG, "异步创建小火箭视图完成");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/viewresue/HomeViewReuseServiceImpl$4");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bqa.d(HomeViewReuseServiceImpl.TAG, "开始异步创建主题视图");
            try {
                phg.k(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_THEME);
                if (!HomeViewReuseServiceImpl.access$100(HomeViewReuseServiceImpl.this)) {
                    HomeViewReuseServiceImpl.access$200(HomeViewReuseServiceImpl.this).e();
                }
                phg.j(HomeViewReuseServiceImpl.STAGE_PRE_CREATE_THEME);
            } catch (Throwable th) {
                bqa.b(HomeViewReuseServiceImpl.TAG, "异步创建主题视图异常", th);
            }
            bqa.d(HomeViewReuseServiceImpl.TAG, "异步创建主题视图完成");
        }
    }

    static {
        t2o.a(729810400);
        t2o.a(729810405);
    }

    public static /* synthetic */ View access$000(HomeViewReuseServiceImpl homeViewReuseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5fb5bc8b", new Object[]{homeViewReuseServiceImpl});
        }
        return homeViewReuseServiceImpl.mHomepageView;
    }

    public static /* synthetic */ View access$002(HomeViewReuseServiceImpl homeViewReuseServiceImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("386a21ad", new Object[]{homeViewReuseServiceImpl, view});
        }
        homeViewReuseServiceImpl.mHomepageView = view;
        return view;
    }

    public static /* synthetic */ boolean access$100(HomeViewReuseServiceImpl homeViewReuseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7257262c", new Object[]{homeViewReuseServiceImpl})).booleanValue();
        }
        return homeViewReuseServiceImpl.isCreateHomepageViewInMainTread;
    }

    public static /* synthetic */ mnm access$200(HomeViewReuseServiceImpl homeViewReuseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnm) ipChange.ipc$dispatch("5cb1ab92", new Object[]{homeViewReuseServiceImpl});
        }
        return homeViewReuseServiceImpl.mPreRenderNativeView;
    }

    public static /* synthetic */ void access$300(HomeViewReuseServiceImpl homeViewReuseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a459c966", new Object[]{homeViewReuseServiceImpl});
        } else {
            homeViewReuseServiceImpl.onThreadComplete();
        }
    }

    public static /* synthetic */ View access$400(HomeViewReuseServiceImpl homeViewReuseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e1bcdc07", new Object[]{homeViewReuseServiceImpl});
        }
        return homeViewReuseServiceImpl.mRocketView;
    }

    public static /* synthetic */ View access$402(HomeViewReuseServiceImpl homeViewReuseServiceImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1e5c78b1", new Object[]{homeViewReuseServiceImpl, view});
        }
        homeViewReuseServiceImpl.mRocketView = view;
        return view;
    }

    public static /* synthetic */ boolean access$500(HomeViewReuseServiceImpl homeViewReuseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65c6ca8", new Object[]{homeViewReuseServiceImpl})).booleanValue();
        }
        return homeViewReuseServiceImpl.isCreateRocketViewInMainTread;
    }

    private void forceInflateMultiTab(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fc78e2", new Object[]{this, layoutInflater, viewGroup});
        } else {
            this.mHomepageView = layoutInflater.inflate(R.layout.activity_homepage_multitab, viewGroup, false);
        }
    }

    private void inflateHomePageViewByMultiTab(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdafeaad", new Object[]{this, layoutInflater, viewGroup});
            return;
        }
        f0b.i().s(f0b.HOME_LAYOUT);
        if (this.mHomepageView == null) {
            this.mHomepageView = layoutInflater.inflate(R.layout.activity_homepage_multitab, viewGroup, false);
            bqa.d(TAG, "inflate homePageView");
            f0b.i().c(f0b.HOME_LAYOUT);
        }
    }

    private View inflateViewByDefault(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("45d36b3e", new Object[]{this, layoutInflater, viewGroup});
        }
        View view2 = this.mHomepageView;
        if (view2 != null && !(view2.getContext() instanceof Activity)) {
            z = true;
        }
        boolean b2 = f4b.b("enableFixLauncherContext", true);
        fve.e(TAG, "inflateViewByDefault isNotActivityContext:" + z + ",enableFixContext:" + b2);
        if (z) {
            r5a.i("Page_Home", 19999, "inflateViewByDefaultContextException", "");
        }
        if (b2 && z) {
            fve.e(TAG, "inflateViewByDefault HomepageView context error,forceInflateMultiTab ");
            forceInflateMultiTab(layoutInflater, viewGroup);
        }
        if (this.mHomepageView == null) {
            fve.e(TAG, "inflateViewByDefault mHomepageView not exist ");
            inflateHomePageViewByMultiTab(layoutInflater, viewGroup);
        }
        fve.e(TAG, "inflateViewByDefault createInfoView: ");
        phg.m("inflateRoot");
        IHomeViewService iHomeViewService = this.mViewService;
        if (!(iHomeViewService == null || (view = this.mHomepageView) == null)) {
            iHomeViewService.createView(view);
        }
        phg.l("inflateRoot");
        fve.e(TAG, "inflateView createInfoView finish: ");
        return this.mHomepageView;
    }

    private boolean isFirstUsePreRenderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9889f7e8", new Object[]{this})).booleanValue();
        }
        return true ^ (this.mPreRenderNativeView.b() instanceof Activity);
    }

    private void preCreateMultiTabView(View view, IHomeViewService iHomeViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb55a5a0", new Object[]{this, view, iHomeViewService});
        } else {
            new b(STAGE_PRE_CREATE_MULTI_TAB_VIEW, view, iHomeViewService).start();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService
    public View inflateRocketView(Activity activity) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f35f4d9b", new Object[]{this, activity});
        }
        phg.m("inflateRocketViewByPreCreate");
        if (vxl.b().u()) {
            fve.e(TAG, "inflateRocketView 性能优化后的新逻辑");
            view = inflateRocketViewByPreCreate(activity);
        } else {
            fve.e(TAG, "inflateRocketView 性能优化前的老逻辑");
            view = LayoutInflater.from(activity).inflate(R.layout.homepage_tab_tao_button, (ViewGroup) null);
        }
        phg.l("inflateRocketViewByPreCreate");
        return view;
    }

    @Override // com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ad748b30", new Object[]{this, layoutInflater, viewGroup});
        }
        if (vxl.b().u()) {
            fve.e(TAG, "inflateView 性能优化后的新逻辑");
            return inflateViewByPreCreate(layoutInflater, viewGroup);
        }
        fve.e(TAG, "inflateView 性能优化前的老逻辑");
        return inflateViewByDefault(layoutInflater, viewGroup);
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mHomepageView = null;
        this.mRocketView = null;
        bqa.d(TAG, "destroy view");
    }

    @Override // com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService
    public void preCreateRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9b043a", new Object[]{this});
        } else {
            new c(STAGE_PRE_CREATE_ROCKET_VIEW).start();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService
    public void preCreateRootView(IHomeViewService iHomeViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ad8882", new Object[]{this, iHomeViewService});
        } else {
            new a(STAGE_PRE_CREATE_ROOT_VIEW, iHomeViewService).start();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService
    public void preCreateTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839d311", new Object[]{this});
        } else {
            new d(STAGE_PRE_CREATE_THEME).start();
        }
    }

    private View inflateViewByPreCreate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e3b96880", new Object[]{this, layoutInflater, viewGroup});
        }
        bqa.d(TAG, "obtainRootView remainingThreads:" + this.remainingThreads);
        synchronized (this.lock) {
            while (this.remainingThreads > 0) {
                try {
                    this.lock.wait(this.overtimeTimeout);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    fve.e(TAG, "主线程被中断。");
                }
            }
        }
        if (this.mHomepageView != null) {
            bqa.d(TAG, "返回异步创建的首页框架视图");
            if (isFirstUsePreRenderView()) {
                bqa.d(TAG, "替换预创建的context");
                this.mPreRenderNativeView.f(viewGroup.getContext());
            } else {
                bqa.d(TAG, "非经历预创建时机，需要新建信息流");
                IHomeViewService iHomeViewService = this.mViewService;
                if (iHomeViewService != null) {
                    iHomeViewService.createView(this.mHomepageView);
                }
            }
            return this.mHomepageView;
        }
        this.isCreateHomepageViewInMainTread = true;
        this.mPreRenderNativeView.f(viewGroup.getContext());
        bqa.d(TAG, "主线程加载首页框架视图");
        phg.m("UI_Thread_createViewMultiTab");
        phg.m("createRootView");
        fve.e(TAG, "inflateViewByPreCreate create mHomepageView");
        inflateHomePageViewByMultiTab(layoutInflater, viewGroup);
        phg.l("createRootView");
        IHomeViewService iHomeViewService2 = this.mViewService;
        if (iHomeViewService2 != null) {
            iHomeViewService2.createView(this.mHomepageView);
        }
        phg.l("UI_Thread_createViewMultiTab");
        return this.mHomepageView;
    }

    private void onThreadComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab48c4a9", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onThreadComplete remainingThreads:" + this.remainingThreads);
        synchronized (this.lock) {
            try {
                this.remainingThreads--;
                bqa.d(TAG, "remainingThreads : " + this.remainingThreads);
                if (this.remainingThreads <= 0) {
                    bqa.d(TAG, "通知终止线程阻塞 : " + this.remainingThreads);
                    this.lock.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        View view;
        IHomeViewService iHomeViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        phg.k(TAG);
        this.mViewService = (IHomeViewService) wccVar.a(IHomeViewService.class);
        if (vxl.b().J()) {
            preCreateTheme();
            if (!(!vxl.b().C() || (view = this.mHomepageView) == null || (iHomeViewService = this.mViewService) == null)) {
                preCreateMultiTabView(view, iHomeViewService);
            }
        }
        phg.j(TAG);
    }

    @Override // com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService
    public void setAsyncTaskCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117690ec", new Object[]{this, new Integer(i)});
            return;
        }
        if (vxl.b().u()) {
            fve.e(TAG, "setAsyncTaskCount 性能优化后的新逻辑");
            this.remainingThreads = i;
        } else {
            fve.e(TAG, "setAsyncTaskCount 性能优化前的老逻辑");
            this.remainingThreads = 0;
        }
        fve.e(TAG, "remainingThreads ： " + i + "， this.remainingThreads ： " + this.remainingThreads);
    }

    private View inflateRocketViewByPreCreate(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("24e24e63", new Object[]{this, activity});
        }
        bqa.d(TAG, "obtainRocketView remainingThreads:" + this.remainingThreads);
        synchronized (this.lock) {
            while (this.remainingThreads > 0) {
                try {
                    bqa.d(TAG, "主线程加载小火箭阻塞，等待异步加载完成");
                    this.lock.wait(this.overtimeTimeout);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    fve.e(TAG, "主线程被中断。");
                }
            }
        }
        if (vxl.b().z()) {
            View view = this.mRocketView;
            if (view != null && view.getParent() == null && this.mIsFirstUsePreRenderView.get()) {
                this.mIsFirstUsePreRenderView.set(false);
                bqa.d(TAG, "返回异步创建的小火箭");
                return this.mRocketView;
            }
        } else if (this.mRocketView != null && isFirstUsePreRenderView()) {
            bqa.d(TAG, "返回异步创建的小火箭");
            return this.mRocketView;
        }
        bqa.d(TAG, "主线程加载小火箭");
        this.isCreateRocketViewInMainTread = true;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.homepage_tab_tao_button, (ViewGroup) null);
        this.mRocketView = inflate;
        return inflate;
    }
}
