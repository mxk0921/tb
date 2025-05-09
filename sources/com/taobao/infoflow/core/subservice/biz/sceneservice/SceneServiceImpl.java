package com.taobao.infoflow.core.subservice.biz.sceneservice;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.cac;
import tb.cfc;
import tb.dm4;
import tb.dzc;
import tb.e7c;
import tb.e8e;
import tb.esj;
import tb.fve;
import tb.gfo;
import tb.gqb;
import tb.hed;
import tb.j4d;
import tb.jdm;
import tb.jlq;
import tb.kqb;
import tb.m4d;
import tb.nvv;
import tb.o1e;
import tb.oj9;
import tb.oqb;
import tb.pca;
import tb.pfl;
import tb.q4u;
import tb.sad;
import tb.sl4;
import tb.ssd;
import tb.t2o;
import tb.u7d;
import tb.uzc;
import tb.vkd;
import tb.vsl;
import tb.wjd;
import tb.y4n;
import tb.ydl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SceneServiceImpl implements ISceneService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SceneService";
    private kqb mContainerDataInvoker;
    private dm4 mContainerInvoker;
    private e7c mFirstScreenConfigInvoker;
    private cac mGlobalThemeInvoker;
    private cfc mInfoFlowContext;
    private IMainLifecycleService mMainLifecycleService;
    private uzc mNetRequestInvoker;
    private j4d mOrderPreRequestInvoker;
    private m4d mOutLinkInvoker;
    private u7d mPassParamsInvoker;
    private sad mPopInvoker;
    private hed mPullDownRefreshInvoker;
    private vkd mRocketInvoker;
    private ssd mStayTimeInvoker;
    private o1e mTopViewInvoker;
    private e8e mUtInvoker;

    static {
        t2o.a(486539578);
        t2o.a(488636602);
    }

    private boolean isReachTop(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92580d31", new Object[]{this, cfcVar})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return true;
        }
        return iMainFeedsViewService.isReachTopEdge();
    }

    private void syncStatusToHost(cfc cfcVar) {
        gqb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2fd949", new Object[]{this, cfcVar});
            return;
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService != null && (b = iHostService.getInvokeCallback().b()) != null) {
            b.t(isReachTop(cfcVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        fve.e("SceneService", "createView");
        IContainerService iContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        if (iContainerService != null) {
            return iContainerService.createContainer(context);
        }
        throw new IllegalArgumentException("SceneService, createView containerService is null");
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public kqb getContainerDataInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqb) ipChange.ipc$dispatch("d883883e", new Object[]{this});
        }
        if (this.mContainerDataInvoker == null) {
            this.mContainerDataInvoker = new sl4(this.mInfoFlowContext);
        }
        return this.mContainerDataInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public oqb getContainerInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqb) ipChange.ipc$dispatch("86aa58aa", new Object[]{this});
        }
        return this.mContainerInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public e7c getFirstScreenConfigInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7c) ipChange.ipc$dispatch("97b1e364", new Object[]{this});
        }
        if (this.mFirstScreenConfigInvoker == null) {
            this.mFirstScreenConfigInvoker = new oj9(this.mInfoFlowContext);
        }
        return this.mFirstScreenConfigInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public cac getGlobalThemeInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cac) ipChange.ipc$dispatch("c06d6134", new Object[]{this});
        }
        if (this.mGlobalThemeInvoker == null) {
            this.mGlobalThemeInvoker = new pca(this.mInfoFlowContext);
        }
        return this.mGlobalThemeInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public dzc getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzc) ipChange.ipc$dispatch("93ccde42", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public uzc getNetRequestInvoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzc) ipChange.ipc$dispatch("de53969c", new Object[]{this});
        }
        if (this.mNetRequestInvoker == null) {
            this.mNetRequestInvoker = new esj(this.mInfoFlowContext);
        }
        return this.mNetRequestInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public j4d getOrderPreRequestInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4d) ipChange.ipc$dispatch("ee00ed9c", new Object[]{this});
        }
        if (this.mOrderPreRequestInvoker == null) {
            this.mOrderPreRequestInvoker = new ydl(this.mInfoFlowContext);
        }
        return this.mOrderPreRequestInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public m4d getOutLinkInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m4d) ipChange.ipc$dispatch("446de138", new Object[]{this});
        }
        if (this.mOutLinkInvoker == null) {
            this.mOutLinkInvoker = new pfl(this.mInfoFlowContext);
        }
        return this.mOutLinkInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public u7d getPassParamsInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7d) ipChange.ipc$dispatch("f9c352fc", new Object[]{this});
        }
        if (this.mPassParamsInvoker == null) {
            this.mPassParamsInvoker = new vsl(this.mInfoFlowContext);
        }
        return this.mPassParamsInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public sad getPopInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sad) ipChange.ipc$dispatch("1f31ddca", new Object[]{this});
        }
        if (this.mPopInvoker == null) {
            this.mPopInvoker = new jdm(this.mInfoFlowContext);
        }
        return this.mPopInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public hed getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hed) ipChange.ipc$dispatch("64e92110", new Object[]{this});
        }
        if (this.mPullDownRefreshInvoker == null) {
            this.mPullDownRefreshInvoker = new y4n(this.mInfoFlowContext);
        }
        return this.mPullDownRefreshInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public wjd getRequestParamsInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wjd) ipChange.ipc$dispatch("4680ac92", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public vkd getRocketInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vkd) ipChange.ipc$dispatch("821d6ece", new Object[]{this});
        }
        if (this.mRocketInvoker == null) {
            this.mRocketInvoker = new gfo(this.mInfoFlowContext);
        }
        return this.mRocketInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public ssd getStayTimeInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssd) ipChange.ipc$dispatch("3a184ce", new Object[]{this});
        }
        if (this.mStayTimeInvoker == null) {
            this.mStayTimeInvoker = new jlq(this.mInfoFlowContext);
        }
        return this.mStayTimeInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public o1e getTopViewInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1e) ipChange.ipc$dispatch("cf762b1c", new Object[]{this});
        }
        if (this.mTopViewInvoker == null) {
            this.mTopViewInvoker = new q4u(this.mInfoFlowContext);
        }
        return this.mTopViewInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public e8e getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8e) ipChange.ipc$dispatch("fb13fc2e", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new nvv(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public JSONObject invoke(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f3213a27", new Object[]{this, str, jSONObject});
        }
        fve.e("SceneService", "invoke, action : " + str);
        return null;
    }

    @Override // tb.h6d
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.mMainLifecycleService.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.mgb
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onAppToBackground");
        this.mMainLifecycleService.onAppToBackground();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.mgb
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onAppToFront");
        this.mMainLifecycleService.onAppToFront();
    }

    @Override // tb.h6d
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onColdStartResume");
        this.mMainLifecycleService.onColdStartResume();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        fve.e("SceneService", "onCreateService");
        this.mInfoFlowContext = cfcVar;
        this.mMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.mContainerInvoker = new dm4(cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onDestroy");
        this.mMainLifecycleService.onDestroy();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            fve.e("SceneService", "onDestroyService");
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onDestroyView");
        this.mMainLifecycleService.onDestroyView();
        IContainerService iContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        if (iContainerService != null) {
            iContainerService.destroyContainer();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        fve.e("SceneService", "onNewIntent");
        this.mMainLifecycleService.onNewIntent(intent);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.zxd
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onPageSelected");
        this.mMainLifecycleService.onPageSelected();
        syncStatusToHost(this.mInfoFlowContext);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.zxd
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onPageUnSelected");
        this.mMainLifecycleService.onPageUnSelected();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onPause");
        this.mMainLifecycleService.onPause();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onRestart");
        this.mMainLifecycleService.onRestart();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onResume");
        this.mMainLifecycleService.onResume();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onStart");
        this.mMainLifecycleService.onStart();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onStop");
        this.mMainLifecycleService.onStop();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        fve.e("SceneService", "onWillExit");
        this.mMainLifecycleService.onWillExit();
    }
}
