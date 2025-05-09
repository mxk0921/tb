package com.taobao.tao.topmultitab.service.lifecycle;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import tb.b61;
import tb.bqa;
import tb.c21;
import tb.cfc;
import tb.j6d;
import tb.kkc;
import tb.knl;
import tb.ob0;
import tb.ogb;
import tb.p4d;
import tb.rfl;
import tb.t11;
import tb.t2o;
import tb.vwc;
import tb.wcc;
import tb.xaj;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomePageLifecycleServiceImpl implements IHomePageLifecycleService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomePageLifecycleServiceImpl";
    private t11 mActivityLifecycleCallback;
    private b61 mAppLifeCycleRegister;
    private wcc mHomePageContext;
    private rfl mOutLinkRegister;
    private knl mPageLifeCycleRegister;
    private xaj mTabLifeCycleRegister;

    static {
        t2o.a(729810213);
        t2o.a(729810214);
    }

    private IHomeSubTabController getCurrentSubTabController() {
        IHomeControllerService iHomeControllerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("7c3a56ec", new Object[]{this});
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null || (iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class)) == null) {
            return null;
        }
        return iHomeControllerService.getCurrentSubTabController();
    }

    private void registerApmActivityLifecycleCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df84cc4c", new Object[]{this});
            return;
        }
        ob0 ob0Var = new ob0(this);
        this.mActivityLifecycleCallback = ob0Var;
        c21.a(ob0Var, true);
    }

    private void unRegisterApmActivityLifecycleCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9da7205", new Object[]{this});
            return;
        }
        t11 t11Var = this.mActivityLifecycleCallback;
        if (t11Var != null) {
            c21.j(t11Var);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService
    public ogb getAppLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ogb) ipChange.ipc$dispatch("910cf5d4", new Object[]{this});
        }
        return this.mAppLifeCycleRegister;
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService
    public p4d getOutLinkRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p4d) ipChange.ipc$dispatch("24fee8d8", new Object[]{this});
        }
        return this.mOutLinkRegister;
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService
    public j6d getPageLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j6d) ipChange.ipc$dispatch("d2c320f2", new Object[]{this});
        }
        return this.mPageLifeCycleRegister;
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService
    public vwc getTabLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vwc) ipChange.ipc$dispatch("a83d9019", new Object[]{this});
        }
        return this.mTabLifeCycleRegister;
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        bqa.d(TAG, "onActivityResult");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.d(i, i2, intent);
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, tb.lgb
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onAppToBackground");
        b61 b61Var = this.mAppLifeCycleRegister;
        if (b61Var != null) {
            b61Var.d();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onAppToBackground();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, tb.lgb
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onAppToFront");
        b61 b61Var = this.mAppLifeCycleRegister;
        if (b61Var != null) {
            b61Var.e();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onAppToFront();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onCreate");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.e();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onCreate();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onCreateView");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.f();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onDestroy() {
        IHomeViewService iHomeViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onDestroy");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.g();
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomeViewService = (IHomeViewService) wccVar.a(IHomeViewService.class)) != null) {
            bqa.d(TAG, "destroyView");
            iHomeViewService.destroyView();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mTabLifeCycleRegister.c();
        this.mPageLifeCycleRegister.c();
        this.mOutLinkRegister.c();
        this.mAppLifeCycleRegister.c();
        unRegisterApmActivityLifecycleCallback();
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onLazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fcb0aa", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onLazyInit ");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.h();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, tb.q4d
    public void onOutLink(String str, Intent intent, String str2) {
        IHomeControllerService iHomeControllerService;
        IHomeSubTabController homeSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd04721", new Object[]{this, str, intent, str2});
            return;
        }
        bqa.d(TAG, "onOutLink,subTabFlag: " + str);
        rfl rflVar = this.mOutLinkRegister;
        if (rflVar != null) {
            rflVar.d(str, intent, str2);
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class)) != null && (homeSubTabController = iHomeControllerService.getHomeSubTabController(str)) != null) {
            if (str2 == null) {
                str2 = "";
            }
            homeSubTabController.notifyOutLinkParams(intent, str2);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onPause");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.i();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onPause();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onResume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
            return;
        }
        bqa.d(TAG, "onResume,type: " + str);
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.j(str);
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController == null) {
            return;
        }
        if ("coldStart".equals(str)) {
            currentSubTabController.onColdStartResume();
            bqa.d(TAG, "冷启不传给子容器，维持原状");
            return;
        }
        currentSubTabController.onResume();
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onStart");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.k();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onStart();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onStop");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.l();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onStop();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onWillExit");
        knl knlVar = this.mPageLifeCycleRegister;
        if (knlVar != null) {
            knlVar.m();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController != null) {
            currentSubTabController.onWillExit();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService, tb.uwc
    public void selectMultiTab(String str, kkc kkcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4828d0", new Object[]{this, str, kkcVar, new Integer(i)});
            return;
        }
        bqa.d(TAG, "multi tab selectTab: " + str);
        xaj xajVar = this.mTabLifeCycleRegister;
        if (xajVar != null) {
            xajVar.d(str, kkcVar, i);
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
        this.mAppLifeCycleRegister = new b61();
        this.mOutLinkRegister = new rfl();
        this.mPageLifeCycleRegister = new knl();
        this.mTabLifeCycleRegister = new xaj();
        registerApmActivityLifecycleCallback();
    }
}
