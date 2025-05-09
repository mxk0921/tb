package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.shake.IShakeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b7b extends vhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809203);
    }

    public b7b(z6d z6dVar) {
        super(z6dVar);
    }

    public static /* synthetic */ Object ipc$super(b7b b7bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.p();
            return null;
        } else if (hashCode == 2133689546) {
            super.d();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/workflow/HotStartWorkflow");
        }
    }

    @Override // tb.vhq, tb.xz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "hotStartOnStart", "HotStartWorkflow.onStart;生命周期:onStart");
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
        sfh.f("HotStartWorkflow", "onStop");
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onStop();
        }
    }

    @Override // tb.vhq
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "hotStartOnResume", "HotStartWorkflow.onResume;生命周期onResume");
        super.p();
        try {
            q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        IShakeService iShakeService = (IShakeService) c4b.i().h(IShakeService.class);
        if (iShakeService != null) {
            iShakeService.startShake();
        }
        p78.c(m0b.c(), o78.REFRESH_SOURCE_HOT_START);
        qul.h();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onResume(o78.REFRESH_SOURCE_HOT_START);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b99b101", new Object[]{this});
            return;
        }
        IBGContainerService iBGContainerService = (IBGContainerService) c4b.i().h(IBGContainerService.class);
        if (iBGContainerService != null) {
            iBGContainerService.reset();
        }
        czj.b(null);
    }
}
