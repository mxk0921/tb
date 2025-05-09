package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.festival.FestivalConfigLoader;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.RequestTypeEnum;
import com.taobao.homepage.view.widgets.HomeSwipeRefreshLayout;
import com.taobao.tao.topmultitab.service.appexit.ITaoAppExitService;
import com.taobao.tao.topmultitab.service.bgcontainer.BGContainerView;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.login.ILoginService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.topmultitab.service.shake.IShakeService;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vhq extends xz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                sfh.f("StartUpWorkflow", "onStop");
            }
        }
    }

    static {
        t2o.a(729809206);
    }

    public vhq(z6d z6dVar) {
        super(z6dVar);
    }

    public static /* synthetic */ Object ipc$super(vhq vhqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 188604040) {
            super.e();
            return null;
        } else if (hashCode == 1264052993) {
            super.c((Intent) objArr[0]);
            return null;
        } else if (hashCode == 2133689546) {
            super.d();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/workflow/StartUpWorkflow");
        }
    }

    @Override // tb.xz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        s2b.c().p();
        super.d();
    }

    public void g(View view, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e171469", new Object[]{this, view, activity});
        } else if (!(view instanceof ViewGroup)) {
            bqa.d("StartUpWorkflow", "rootView 不是ViewGroup");
        } else {
            c4b.i().l();
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
            if (iHomeSearchBarService != null) {
                iHomeSearchBarService.createView((RelativeLayout) view.findViewById(R.id.search_bar_container));
            }
            HomeSwipeRefreshLayout homeSwipeRefreshLayout = (HomeSwipeRefreshLayout) view.findViewById(R.id.home_swipe_refresh);
            homeSwipeRefreshLayout.reCalculateHeight(activity);
            homeSwipeRefreshLayout.disEnableTargetOffsetAndResetH();
            IPullDownService iPullDownService = (IPullDownService) c4b.i().h(IPullDownService.class);
            if (iPullDownService != null) {
                iPullDownService.createView(homeSwipeRefreshLayout, view);
            }
            BGContainerView bGContainerView = (BGContainerView) view.findViewById(R.id.home_bg_container);
            IBGContainerService iBGContainerService = (IBGContainerService) c4b.i().h(IBGContainerService.class);
            if (iBGContainerService != null) {
                iBGContainerService.createView(bGContainerView);
            }
            IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
            if (iHomePageLifecycleService != null) {
                iHomePageLifecycleService.onCreateView();
            }
        }
    }

    public final boolean h() {
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

    public void i(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
        }
    }

    public void j(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        }
    }

    public View k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return null;
    }

    public void o(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else {
            sfh.f("StartUpWorkflow", "onRequestPermissionsResult");
        }
    }

    @Override // tb.xz
    public void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "startUpFlow_onNewIntent", "");
        if (intent != null) {
            f(intent, RequestTypeEnum.URL_START);
            kv6.a(intent);
            vll.c().g(this.f31731a, new wll(intent), false);
            if (this.f31731a.k1() != null) {
                ILoginService iLoginService = (ILoginService) c4b.i().h(ILoginService.class);
                if (iLoginService != null) {
                    iLoginService.handleOnNewIntentBundle(intent);
                }
                this.f31731a.k1().setIntent(intent);
                super.c(intent);
            }
        }
    }

    @Override // tb.xz
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (f4b.b("enableStatisticsOptimize", false)) {
            m5a.a().e(new a());
        } else {
            sfh.f("StartUpWorkflow", "onStop");
        }
        s2b.c().q();
        super.e();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        sfh.f("StartUpWorkflow", "onDestroy");
        uqa.b("【Homepage_PageLifeCycle】", "startUpFlow_onDestroy", "");
        Constants.exitFlag = true;
        s2b.c().g();
        t2b.b().a(b3b.c()).destory();
        s5a.b();
        b3b.g(null);
        try {
            this.f31731a.q1().a().c();
        } catch (Throwable unused) {
        }
        FestivalMgr.i().d();
        iqa.j();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "startUp_onPause", "");
        phg.g("onPause_HomePageLifecycle");
        s2b.c().m();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onPause();
        }
        phg.f("onPause_HomePageLifecycle");
        this.f31731a.q1().c().a().a(false);
        phg.g("onPause_stopShake");
        IShakeService iShakeService = (IShakeService) c4b.i().h(IShakeService.class);
        if (iShakeService != null) {
            iShakeService.stopShake();
        }
        phg.f("onPause_stopShake");
        boolean d = h2b.d();
        if (h()) {
            qul.o(this.f31731a.k1(), d);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        s2b.c().n();
        Activity k1 = this.f31731a.k1();
        if (k1 != null && this.f31731a.q1() != null) {
            this.f31731a.q1().c().a().a(true);
            Coordinator.scheduleIdleTasks();
            qul.j(k1);
            if (h() && !h8x.a()) {
                qul.m(k1);
            }
            qul.e();
            qul.l();
            qul.k();
            qul.g();
            FestivalMgr.i().A();
            Intent intent = k1.getIntent();
            Uri data = intent == null ? null : intent.getData();
            if (data != null && TextUtils.equals("homepage", data.getQueryParameter("target"))) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("isOutpushBacktoHome", "1");
            }
        }
    }

    public void f(Intent intent, RequestTypeEnum requestTypeEnum) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad3d33f", new Object[]{this, intent, requestTypeEnum});
        } else if (intent != null && this.f31731a.k1() != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter(czh.KEY_PREVIEW_PARAM);
            String queryParameter2 = data.getQueryParameter("fontSize");
            if (!TextUtils.isEmpty(queryParameter) && queryParameter.contains("templateMock=")) {
                Intent intent2 = new Intent(this.f31731a.k1(), DXTemplatePreviewActivity.class);
                intent2.putExtra(DXTemplatePreviewActivity.PREVIEW_INFO, queryParameter.substring(queryParameter.indexOf("=") + 1));
                if (!TextUtils.isEmpty(queryParameter2)) {
                    intent2.putExtra("fontSize", queryParameter2);
                }
                this.f31731a.k1().startActivity(intent2);
            } else if (!TextUtils.isEmpty(queryParameter)) {
                os6.m("Preview", czh.KEY_PREVIEW_PARAM, false, queryParameter);
                czj.e(queryParameter);
                FestivalConfigLoader.m().x();
            }
        }
    }

    public boolean m(int i, KeyEvent keyEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        sfh.f("StartUpWorkflow", "onPanelKeyDown");
        if (i != 4) {
            return false;
        }
        if (!this.f31731a.q1().c().c().get()) {
            return true;
        }
        try {
            ITaoAppExitService iTaoAppExitService = (ITaoAppExitService) c4b.i().h(ITaoAppExitService.class);
            if (iTaoAppExitService != null) {
                z = iTaoAppExitService.exitBy2Click();
            }
            this.f31731a.q1().c().b().set(z);
        } catch (Throwable th) {
            bqa.d("StartUpWorkflow", "双击back出现异常：" + th);
        }
        return true;
    }
}
