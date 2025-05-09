package com.taobao.tao.topmultitab.service.festival;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import tb.cfc;
import tb.m6c;
import tb.q69;
import tb.t2o;
import tb.v20;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FestivalServiceImpl implements IFestivalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAtHomepage;
    private IHomeControllerService mControllerService;
    private q69 mFestivalChangeRegister;
    private IHomePageLifecycleService mHomePageLifecycleService;
    private boolean mNeedCompensate;
    private IPageLifeCycle mPageLifeCycle;
    private IHomePageProviderService mPageProviderService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/festival/FestivalServiceImpl$1");
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                FestivalServiceImpl.access$002(FestivalServiceImpl.this, false);
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onResume(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
                return;
            }
            FestivalServiceImpl.access$002(FestivalServiceImpl.this, true);
            if (FestivalServiceImpl.access$100(FestivalServiceImpl.this)) {
                FestivalServiceImpl.this.onFestivalChanged();
                FestivalServiceImpl.access$102(FestivalServiceImpl.this, false);
            }
        }
    }

    static {
        t2o.a(729810195);
        t2o.a(729810199);
    }

    public static /* synthetic */ boolean access$002(FestivalServiceImpl festivalServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a5e40ee", new Object[]{festivalServiceImpl, new Boolean(z)})).booleanValue();
        }
        festivalServiceImpl.isAtHomepage = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(FestivalServiceImpl festivalServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfd74acf", new Object[]{festivalServiceImpl})).booleanValue();
        }
        return festivalServiceImpl.mNeedCompensate;
    }

    public static /* synthetic */ boolean access$102(FestivalServiceImpl festivalServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a27ef", new Object[]{festivalServiceImpl, new Boolean(z)})).booleanValue();
        }
        festivalServiceImpl.mNeedCompensate = z;
        return z;
    }

    private IPageLifeCycle createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageLifeCycle) ipChange.ipc$dispatch("da6084ef", new Object[]{this});
        }
        return new a();
    }

    private void registerPageLifeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26969449", new Object[]{this});
        } else if (this.mHomePageLifecycleService != null) {
            this.mPageLifeCycle = createPageLifeCycle();
            this.mHomePageLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
    }

    private void unRegisterPageLifeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb44782", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.mHomePageLifecycleService;
        if (iHomePageLifecycleService != null && this.mPageLifeCycle != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.festival.IFestivalService
    public m6c getFestivalChangeRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m6c) ipChange.ipc$dispatch("f40e4ce4", new Object[]{this});
        }
        return this.mFestivalChangeRegister;
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
        this.mFestivalChangeRegister.c();
        unRegisterPageLifeListener();
    }

    @Override // com.taobao.tao.topmultitab.service.festival.IFestivalService, tb.l6c
    public void onFestivalChanged() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12b9844", new Object[]{this});
        } else if (!this.isAtHomepage) {
            this.mNeedCompensate = true;
        } else {
            q69 q69Var = this.mFestivalChangeRegister;
            if (q69Var != null) {
                q69Var.d();
            }
            IHomeControllerService iHomeControllerService = this.mControllerService;
            if (iHomeControllerService != null && (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) != null) {
                currentSubTabController.onFestivalRefresh();
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mFestivalChangeRegister = new q69();
        this.mControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        this.mHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
        this.mPageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        registerPageLifeListener();
    }
}
