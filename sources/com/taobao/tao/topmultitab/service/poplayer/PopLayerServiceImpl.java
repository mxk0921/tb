package com.taobao.tao.topmultitab.service.poplayer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import tb.cfc;
import tb.j6d;
import tb.kng;
import tb.ogb;
import tb.p4d;
import tb.t2o;
import tb.vwc;
import tb.wcc;
import tb.xcc;
import tb.z4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PopLayerServiceImpl implements IPopLayerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ogb mAppLifeCycleRegister;
    private kng mLifeCycleListener;
    private p4d mOutLinkRegister;
    private j6d mPageLifeCycleRegister;
    private z4n mPullDownRefreshListener;
    private IPullDownService mPullDownService;
    private vwc mTabLifeCycleRegister;
    private IHomeViewService mViewService;

    static {
        t2o.a(729810267);
        t2o.a(729810266);
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        z4n z4nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mTabLifeCycleRegister.a(this.mLifeCycleListener);
        this.mPageLifeCycleRegister.b(this.mLifeCycleListener);
        this.mAppLifeCycleRegister.b(this.mLifeCycleListener);
        this.mOutLinkRegister.a(this.mLifeCycleListener);
        IPullDownService iPullDownService = this.mPullDownService;
        if (!(iPullDownService == null || (z4nVar = this.mPullDownRefreshListener) == null)) {
            iPullDownService.removePullRefreshListener(z4nVar);
        }
        IHomeViewService iHomeViewService = this.mViewService;
        if (iHomeViewService != null) {
            iHomeViewService.removeOnPageChangeListener(this.mLifeCycleListener);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mLifeCycleListener = new kng(wccVar);
        this.mPullDownRefreshListener = new z4n(wccVar);
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            this.mAppLifeCycleRegister = iHomePageLifecycleService.getAppLifeCycleRegister();
            this.mPageLifeCycleRegister = iHomePageLifecycleService.getPageLifeCycleRegister();
            this.mTabLifeCycleRegister = iHomePageLifecycleService.getTabLifeCycleRegister();
            this.mOutLinkRegister = iHomePageLifecycleService.getOutLinkRegister();
            this.mPullDownService = (IPullDownService) wccVar.a(IPullDownService.class);
            this.mAppLifeCycleRegister.a(this.mLifeCycleListener);
            this.mPageLifeCycleRegister.a(this.mLifeCycleListener);
            this.mTabLifeCycleRegister.b(this.mLifeCycleListener);
            this.mOutLinkRegister.b(this.mLifeCycleListener);
            IPullDownService iPullDownService = this.mPullDownService;
            if (iPullDownService != null) {
                iPullDownService.addPullRefreshListener(this.mPullDownRefreshListener);
            }
            IHomeViewService iHomeViewService = (IHomeViewService) wccVar.a(IHomeViewService.class);
            this.mViewService = iHomeViewService;
            if (iHomeViewService != null) {
                iHomeViewService.addOnPageChangeListener(this.mLifeCycleListener);
            }
        }
    }
}
