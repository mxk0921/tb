package com.taobao.tao.homepage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.homepage.utils.HomeOptimizeUtils;
import com.taobao.prefork.ViewFactory;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.linklog.RecommendLinkLogAdapter;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmainfragment.SuppportBaseFragment;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.welcome.HostController;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b3b;
import tb.b7b;
import tb.bqa;
import tb.c21;
import tb.c3b;
import tb.c4b;
import tb.c5b;
import tb.ddv;
import tb.dvh;
import tb.e7n;
import tb.eza;
import tb.f0b;
import tb.f4b;
import tb.fct;
import tb.fdv;
import tb.fza;
import tb.gdv;
import tb.get;
import tb.h5b;
import tb.i2b;
import tb.j5b;
import tb.jdv;
import tb.k5b;
import tb.lq6;
import tb.mxl;
import tb.p2b;
import tb.phg;
import tb.r5a;
import tb.s2b;
import tb.s38;
import tb.sfh;
import tb.t2b;
import tb.t2o;
import tb.tud;
import tb.uqa;
import tb.uww;
import tb.v11;
import tb.vdm;
import tb.vhq;
import tb.vqa;
import tb.vxl;
import tb.vy3;
import tb.wyh;
import tb.x9u;
import tb.yet;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomepageFragment extends SuppportBaseFragment implements z6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean l;
    public static v11 m;
    public t2b f;
    public vhq g;
    public vhq h;
    public j5b j;
    public static final AtomicBoolean k = new AtomicBoolean(false);
    public static int n = -1;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long i = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mxl.h(HomepageFragment.this.k1());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements tud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements HomeOptimizeUtils.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12422a;

            public a(b bVar, int i) {
                this.f12422a = i;
            }

            @Override // com.taobao.homepage.utils.HomeOptimizeUtils.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("39174778", new Object[]{this});
                    return;
                }
                TBFragmentTabHost fragmentTabHost = TBMainHost.b().getFragmentTabHost();
                if (fragmentTabHost != null) {
                    fragmentTabHost.setCurrentTab(this.f12422a);
                }
            }
        }

        public b() {
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58630377", new Object[]{this})).booleanValue();
            }
            return LauncherRuntime.h();
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baa5ae10", new Object[]{this, new Integer(i)});
            } else {
                HomeOptimizeUtils.a(HomepageFragment.this.k1(), new a(this, i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wyh.b("Page_Home", null, null, HomepageFragment.this, new String[0]);
            }
        }
    }

    static {
        t2o.a(729809268);
        t2o.a(729809204);
    }

    public HomepageFragment() {
        AtomicBoolean atomicBoolean = k;
        if (!atomicBoolean.get()) {
            dvh.e(dvh.STAGE_APP_LAUNCH_TASKS, true);
            dvh.a(dvh.STAGE_PAGE_INIT);
            f0b.i().c("homeFragmentBefore");
            f0b.i().l("launcherTotal");
            f0b.i().p("homeFragmentInit", 1);
            f0b.i().p("homeTotal", 1);
        }
        fza.a();
        if (!atomicBoolean.get()) {
            dvh.e(dvh.STAGE_PAGE_INIT, true);
            dvh.a("page_on_create");
        }
    }

    public static /* synthetic */ Object ipc$super(HomepageFragment homepageFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -872444662:
                super.onViewStateRestored((Bundle) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/HomepageFragment");
        }
    }

    public static boolean u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6544892", new Object[0])).booleanValue();
        }
        return k.get();
    }

    @Override // tb.z6d
    public void V1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9a75a2", new Object[]{this, view});
        } else {
            this.mRootView = view;
        }
    }

    @Override // tb.z6d
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.mRootView;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return r5a.f27121a;
    }

    @Override // tb.z6d
    public vhq i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vhq) ipChange.ipc$dispatch("822d615e", new Object[]{this});
        }
        return this.g;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.z6d
    public Activity k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("4891e268", new Object[]{this});
        }
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        p2("onActivityResult").a();
        super.onActivityResult(i, i2, intent);
        this.g.b(i, i2, intent);
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        p2("onLowMemory").a();
        ViewFactory.f().d();
    }

    @Override // com.taobao.tao.TBBaseFragment, androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        p2("onRequestPermissionsResult").a();
        this.g.o(i, strArr, iArr);
    }

    @Override // com.taobao.tao.TBBaseFragment, androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbff8d0a", new Object[]{this, bundle});
        } else {
            super.onViewStateRestored(bundle);
        }
    }

    public final vqa p2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("83705c06", new Object[]{this, str});
        }
        vqa j = vqa.k().i("【Homepage_PageLifeCycle】").j(str);
        try {
            vqa e = j.e("Fragment实例：" + this);
            e.e("Activity实例：" + k1());
        } catch (Throwable th) {
            bqa.c("createLifeCycleLog", th, "获取实例异常");
        }
        return j;
    }

    @Override // tb.z6d
    public t2b q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2b) ipChange.ipc$dispatch("6204cf98", new Object[]{this});
        }
        return this.f;
    }

    public long r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42753258", new Object[]{this})).longValue();
        }
        return this.i;
    }

    public final boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb30a61", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.isAtRecommendTab();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        vqa p2 = p2("onActivityCreated");
        this.g.i(bundle);
        Activity k1 = k1();
        int hashCode = k1 != null ? k1.hashCode() : -1;
        View rootView = getRootView();
        int hashCode2 = rootView != null ? rootView.hashCode() : -1;
        uqa.b("【Homepage_PageLifeCycle】", "onActivityCreated", "activityHashCode: " + hashCode + " rootViewHashCode: " + hashCode2);
        int i = n;
        if (!(hashCode == i || i == -1)) {
            ddv.b(fdv.F_PAGE_RENDER, "homepage", "1.0", null, null, "onActivityCreated", "rootViewHashCode: " + hashCode2 + "activityHashCode: " + hashCode);
        }
        n = hashCode;
        if (vxl.h(k1())) {
            setViewChangeWhenVisiableChange(true);
            p2.g("开关enablePerformanceOptimization", "true").g("开关home_openMiniPreload", "true");
        }
        p2.a();
        TBFragmentTabHost fragmentTabHost = TBMainHost.b().getFragmentTabHost();
        if (fragmentTabHost != null) {
            fragmentTabHost.setTBLauncherTaskNotPreparedCallback(new b());
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        f0b.i().s(f0b.HOME_CREATE);
        p2("onCreate").a();
        f0b.i().p("homeFragmentOnCreate", 1);
        mxl.m(getActivity());
        h5b.e().d().l1(getActivity());
        phg.g(phg.OnCreate);
        gdv gdvVar = gdv.LIFECYCLE;
        jdv.d(gdvVar, "onCreate", "");
        jdv.e(gdvVar);
        this.i = SystemClock.elapsedRealtime();
        x9u.u("onCreate", true);
        lq6.a().g("homepage", b3b.c());
        eza.b().d(k1());
        super.onCreate(bundle);
        if (f4b.b("compensateRegisterOverSeaController", true)) {
            IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
            if (iHomeControllerService != null) {
                iHomeControllerService.initOverseaTabController();
            }
            bqa.d("HomePageFragment", "补偿注册海外controller");
        }
        this.f = new t2b(this);
        vy3 vy3Var = new vy3(this);
        this.g = vy3Var;
        this.h = vy3Var;
        x9u.r("onCreate");
        jdv.b(gdvVar, "onCreate", "");
        vdm.b("PageTaoHome", null);
        v11 v11Var = m;
        if (v11Var != null) {
            c21.l(v11Var);
        }
        c5b c5bVar = new c5b(this);
        m = c5bVar;
        c21.d(c5bVar);
        if (f4b.b("enableHomePageImageLoadMonitor", true)) {
            j5b j5bVar = new j5b(this);
            this.j = j5bVar;
            c21.e(j5bVar);
        }
        phg.f(phg.OnCreate);
        c3b.m(getActivity());
        s2b.c().e(getActivity());
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onCreate();
        }
        com.taobao.runtimepermission.a.b(new k5b());
        f0b.i().c("homeFragmentOnCreate");
        f0b.i().f(f0b.HOME_CREATE);
        dvh.e("page_on_create", true);
        if (bundle != null) {
            dvh.n("recovery_from_saved_instance", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        dvh.d();
        e7n.b();
        f0b.i().p("homeFragmentOnDestroy", 1);
        vhq vhqVar = this.g;
        if (vhqVar != null) {
            vhqVar.l();
        }
        super.onDestroy();
        View view = this.mRootView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mRootView);
            }
            l = true;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onDestroy();
        }
        ViewFactory.f().e();
        vdm.c("PageTaoHome");
        j5b j5bVar = this.j;
        if (j5bVar != null) {
            j5bVar.b();
            c21.m(this.j);
        }
        f0b.i().c("homeFragmentOnDestroy");
        c4b.i().e(this);
        p2("onDestroy").a();
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        p2("onNewIntent").a();
        f0b.i().p("homeFragmentOnNewIntent", 1);
        vhq vhqVar = this.g;
        if (vhqVar == null || this.mRootView == null) {
            f0b.i().c("homeFragmentOnNewIntent");
            return;
        }
        try {
            vhqVar.c(intent);
        } catch (Exception unused) {
            sfh.f("HomePageFragment", "startUpWorkflow.onNewIntent wrong");
        }
        f0b.i().c("homeFragmentOnNewIntent");
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        sfh.d("HomePageFragment", "onPanelKeyDown");
        return this.g.m(i, keyEvent);
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        f0b.i().s(f0b.HOME_START);
        if (!vxl.h(k1()) || shouldDoOnStart()) {
            f0b.i().p("homeFragmentOnStart", 1);
            gdv gdvVar = gdv.LIFECYCLE;
            jdv.d(gdvVar, "onStart", "");
            super.onStart();
            this.g.d();
            jdv.b(gdvVar, "onStart", "");
            f0b.i().c("homeFragmentOnStart");
            p2("onStart").a();
            f0b.i().f(f0b.HOME_START);
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "HomePageFragmentOnStart", "开关home_openMiniPreload:true; shouldDoOnStart:false,不执行onStart生命周期");
        super.onStart();
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        vqa p2 = p2("onStop");
        if (!vxl.h(k1()) || shouldDoOnStop()) {
            f0b.i().p("homeFragmentOnStop", 1);
            jdv.d(gdv.LIFECYCLE, "onStop", "");
            x9u.x();
            super.onStop();
            this.g.e();
            try {
                LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent(i2b.ACTION_ACTIVITY_STOP));
            } catch (Throwable unused) {
            }
            jdv.b(gdv.LIFECYCLE, "onStop", "");
            f0b.i().c("homeFragmentOnStop");
            p2.a();
            return;
        }
        p2.e("home_openMiniPreload开关打开,shouldDoOnStop == false").a();
        super.onStop();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        c4b.i().d();
        c4b.i().c(this);
        p2("onAttach").a();
        f0b.i().f(f0b.HOME_NAVI);
        f0b.i().s(f0b.HOME_VISIBLE_ONLY);
        k.compareAndSet(false, true);
        if (this.e.compareAndSet(false, true)) {
            if (!(getActivity() == null || getActivity().getIntent() == null)) {
                z = getActivity().getIntent().getBooleanExtra(HostController.KEY_EXTRA_BROADCAST_MODE, false);
            }
            if (z) {
                yet.a(new a());
            }
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        dvh.a(dvh.STAGE_PAGE_ON_CREATE_VIEW);
        f0b.i().p("homeFragmentOnCreateView", 1);
        f0b.i().s(f0b.HOME_CREATE_VIEW);
        vqa p2 = p2("onCreateView");
        phg.g(phg.OnCreaeView);
        s38.e();
        gdv gdvVar = gdv.LIFECYCLE;
        jdv.d(gdvVar, "onCreateView", "");
        View view = this.mRootView;
        if (view == null || l) {
            l = false;
            View k2 = this.h.k(layoutInflater, viewGroup, bundle);
            ViewParent parent = k2 == null ? null : k2.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                viewGroup2.endViewTransition(k2);
                viewGroup2.removeView(k2);
            }
            jdv.b(gdvVar, "onCreateView", "");
            phg.f(phg.OnCreaeView);
            p2.g("mRootView", "null").a();
            f0b.i().c("homeFragmentOnCreateView");
            return k2;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) parent2;
            viewGroup3.endViewTransition(this.mRootView);
            viewGroup3.removeView(this.mRootView);
            p2.e("清除动画并且移除mRootView");
        }
        jdv.b(gdvVar, "onCreateView", "");
        phg.f(phg.OnCreaeView);
        p2.a();
        f0b.i().c("homeFragmentOnCreateView");
        f0b.i().f(f0b.HOME_CREATE_VIEW);
        return this.mRootView;
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        dvh.n("on_pause", String.valueOf(System.currentTimeMillis()));
        phg.g("honPause");
        vqa p2 = p2("onPause");
        if (!vxl.h(k1()) || shouldDoOnPause()) {
            p2b.n(true);
            c3b.n(false);
            f0b.i().p("homeFragmentOnPause", 1);
            gdv gdvVar = gdv.LIFECYCLE;
            jdv.d(gdvVar, "onPause", "");
            if (s2()) {
                get.a().e(new c());
            }
            x9u.K("Page_Home", "track_center_action", "page_hidden_count");
            super.onPause();
            this.g.n();
            if (this.f.c().b().compareAndSet(true, false)) {
                if (!(this.g instanceof b7b)) {
                    this.g = new b7b(this);
                }
                f0b.i().c("homeFragmentOnPause");
                p2.e("热启动触发了onPause方法").a();
                phg.f("honPause");
            } else if (this.g instanceof uww) {
                f0b.i().c("homeFragmentOnPause");
                p2.e("前后台工作流触发的onPause方法").a();
                phg.f("honPause");
            } else {
                this.g = new uww(this);
                jdv.b(gdvVar, "onPause", "");
                f0b.i().c("homeFragmentOnPause");
                f0b.i().l("homeFirstTouch");
                f0b.i().l("homeLeavePage");
                p2.a();
                phg.f("honPause");
            }
        } else {
            p2.e("home_openMiniPreload开关打开，shouldDoOnPause() = false").a();
            super.onPause();
            phg.f("honPause");
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SuppportBaseFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        f0b.i().s(f0b.HOME_RESUME);
        vqa p2 = p2("onResume");
        if (!vxl.h(k1()) || shouldDoOnResume()) {
            fct.b("Page_Home");
            c3b.n(true);
            f0b.i().p("homeFragmentOnResume", 1);
            gdv gdvVar = gdv.LIFECYCLE;
            jdv.d(gdvVar, "onResume", "");
            if (s2()) {
                wyh.a("Page_Home", null, this, new String[0]);
            }
            x9u.u("onResume", true);
            RecommendLinkLogAdapter.checkEnableUmbrella2();
            sfh.b();
            super.onResume();
            this.g.p();
            r5a.i("Page_Home", 19999, "pageEnter", "");
            x9u.r("onResume");
            jdv.b(gdvVar, "onResume", "");
            jdv.c(gdvVar);
            p2b.n(false);
            p2.a();
            f0b.i().c("homeFragmentOnResume");
            f0b.i().c("homeFragmentInit");
            f0b.i().f(f0b.HOME_RESUME);
            return;
        }
        p2.e("不执行生命周期.").e("开关home_openMiniPreload:true").e("开关shouldDoOnResume:false").a();
        super.onResume();
    }
}
