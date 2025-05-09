package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.shake.IShakeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uww extends vhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809208);
    }

    public uww(z6d z6dVar) {
        super(z6dVar);
    }

    public static /* synthetic */ Object ipc$super(uww uwwVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.p();
            return null;
        } else if (hashCode == 188604040) {
            super.e();
            return null;
        } else if (hashCode == 2133689546) {
            super.d();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/workflow/WakeUpWorkflow");
        }
    }

    @Override // tb.vhq, tb.xz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        sfh.f("WakeUpWorkflow", "onStart");
        super.d();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onStart();
        }
    }

    @Override // tb.vhq, tb.xz
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.e();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onStop();
        }
    }

    @Override // tb.vhq
    public void p() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        sfh.f("WakeUpWorkflow", "onResume");
        super.p();
        ChangeContainerProcess.d().a();
        String c = b3b.c();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onResume("backToHome");
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if ((iHomeControllerService == null || (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) == null || currentSubTabController.isAllowProcessPageBack()) && !h8x.a()) {
            r();
        }
        IShakeService iShakeService = (IShakeService) c4b.i().h(IShakeService.class);
        if (iShakeService != null) {
            iShakeService.startShake();
        }
        if (q()) {
            r5a.t(this.f31731a.k1(), t2b.b().a(c).a());
        }
        r5a.u(this.f31731a.k1(), t2b.b().a(c).b());
    }

    public final boolean q() {
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

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277dc81d", new Object[]{this});
        } else if ("true".equals(f4b.h("homePageBackRequestEnable", "true"))) {
            s();
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae81db7c", new Object[]{this});
        } else if (!f4b.b("enableNotLoggedInNotPageBack", true) || p7p.j()) {
            yyj.e().H(new String[]{yyj.e().f(), yyj.e().k()});
        }
    }
}
