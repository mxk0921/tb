package com.taobao.tao.topmultitab.service.shake;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.taobao.R;
import tb.cfc;
import tb.f4b;
import tb.h8x;
import tb.kbq;
import tb.m5a;
import tb.sfh;
import tb.t2o;
import tb.ugp;
import tb.v20;
import tb.vxl;
import tb.wcc;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShakeServiceImpl implements IShakeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShakeManager";
    private wcc mHomePageContext;
    private boolean mIsOnHomePage;
    private IPageLifeCycle mPageLifeCycle;
    private ViewStub viewStub;

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
                return;
            }
            try {
                ugp.b().e();
            } catch (Exception e) {
                sfh.e(ShakeServiceImpl.TAG, "stopShake ShakeHomePageService error ", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/shake/ShakeServiceImpl$2");
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                ShakeServiceImpl.access$002(ShakeServiceImpl.this, false);
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onResume(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
            } else {
                ShakeServiceImpl.access$002(ShakeServiceImpl.this, true);
            }
        }
    }

    static {
        t2o.a(729810356);
        t2o.a(729810355);
    }

    public static /* synthetic */ boolean access$002(ShakeServiceImpl shakeServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cddc7ae0", new Object[]{shakeServiceImpl, new Boolean(z)})).booleanValue();
        }
        shakeServiceImpl.mIsOnHomePage = z;
        return z;
    }

    private IPageLifeCycle createPageLifeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageLifeCycle) ipChange.ipc$dispatch("a79f9533", new Object[]{this});
        }
        return new b();
    }

    private boolean disableForgienShake() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b546ca5", new Object[]{this})).booleanValue();
        }
        if (f4b.b("fixShakeOutLinkError", true)) {
            if (!kbq.e(Globals.getApplication()) || f4b.b("enableForeignShake", false)) {
                return false;
            }
            return true;
        } else if (vxl.j() || f4b.b("enableForeignShake", false)) {
            return false;
        } else {
            return true;
        }
    }

    private int getCurrentSearchContainerHeightPX() {
        IHomeSearchBarService iHomeSearchBarService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d5dc97f", new Object[]{this})).intValue();
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null || (iHomeSearchBarService = (IHomeSearchBarService) wccVar.a(IHomeSearchBarService.class)) == null) {
            return 0;
        }
        return iHomeSearchBarService.getCurrentSearchContainerHeightPX();
    }

    private void registerLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51530c2", new Object[]{this});
        } else if (this.mHomePageContext != null) {
            this.mPageLifeCycle = createPageLifeListener();
            IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) this.mHomePageContext.a(IHomePageLifecycleService.class);
            if (iHomePageLifecycleService != null) {
                iHomePageLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
            }
        }
    }

    private void unRegisterLifeCycleListener() {
        IHomePageLifecycleService iHomePageLifecycleService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ade4a9", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class)) != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        }
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
        } else {
            unRegisterLifeCycleListener();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.shake.IShakeService
    public void startShake() {
        wcc wccVar;
        IHomePageProviderService iHomePageProviderService;
        z6d pageProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80910a4b", new Object[]{this});
        } else if (!disableForgienShake() && !h8x.a() && this.mIsOnHomePage && (wccVar = this.mHomePageContext) != null && (iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class)) != null && (pageProvider = iHomePageProviderService.getPageProvider()) != null) {
            if (this.viewStub == null) {
                ViewStub viewStub = (ViewStub) pageProvider.getRootView().findViewById(R.id.homepage_tip);
                this.viewStub = viewStub;
                if (viewStub != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
                    layoutParams.topMargin = getCurrentSearchContainerHeightPX();
                    this.viewStub.setLayoutParams(layoutParams);
                } else {
                    return;
                }
            }
            try {
                ugp.b().d(this.viewStub);
            } catch (Exception e) {
                sfh.e(TAG, "startShake ShakeHomePageService error ", e);
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.shake.IShakeService
    public void stopShake() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc7daab", new Object[]{this});
        } else if (!disableForgienShake()) {
            m5a.a().e(new a());
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomePageContext = wccVar;
        registerLifeCycleListener();
    }
}
