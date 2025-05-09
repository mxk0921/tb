package com.taobao.infoflow.core.subservice.framework.mainlifecycleservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.ars;
import tb.ayd;
import tb.c61;
import tb.cfc;
import tb.fve;
import tb.l6d;
import tb.mnl;
import tb.pgb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MainLifecycleServiceImpl implements IMainLifecycleService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FramewrkServiceImpl";
    private c61 mAppLifeCycleRegister;
    private cfc mInfoFlowContext;
    private mnl mPageLifeCycleRegister;
    private ars mTabLifeCycleRegister;
    private boolean isSelect = true;
    private boolean isResume = true;

    static {
        t2o.a(486539717);
        t2o.a(488636651);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public pgb getAppLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgb) ipChange.ipc$dispatch("a743df91", new Object[]{this});
        }
        return this.mAppLifeCycleRegister;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public l6d getPageLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6d) ipChange.ipc$dispatch("8657cc9d", new Object[]{this});
        }
        return this.mPageLifeCycleRegister;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public ayd getTabLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayd) ipChange.ipc$dispatch("dde25e85", new Object[]{this});
        }
        return this.mTabLifeCycleRegister;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public boolean isSelect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ea4d851", new Object[]{this})).booleanValue();
        }
        return this.isSelect;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        if (!this.isSelect || !this.isResume) {
            return false;
        }
        return true;
    }

    @Override // tb.h6d
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        fve.e(TAG, "onActivityResult");
        this.mPageLifeCycleRegister.c(i, i2, intent);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.mgb
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        fve.e(TAG, "onAppToBackground");
        this.mAppLifeCycleRegister.c();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.mgb
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        fve.e(TAG, "onAppToFront");
        this.mAppLifeCycleRegister.d();
    }

    @Override // tb.h6d
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        fve.e(TAG, "onColdStartResume");
        this.mPageLifeCycleRegister.d();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mPageLifeCycleRegister = new mnl();
        this.mTabLifeCycleRegister = new ars();
        this.mAppLifeCycleRegister = new c61();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fve.e(TAG, "onDestroy");
        this.mPageLifeCycleRegister.e();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        fve.e(TAG, "onDestroyView");
        this.mPageLifeCycleRegister.f();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        fve.e(TAG, "onNewIntent");
        this.mPageLifeCycleRegister.g(intent);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.zxd
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        fve.e(TAG, "onPageScrolled v : " + f + ", positionOffsetPixels : " + i);
        this.mTabLifeCycleRegister.c(f, i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        fve.e(TAG, "onRestart");
        this.mPageLifeCycleRegister.i();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        fve.e(TAG, "onStart");
        this.mPageLifeCycleRegister.k();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        fve.e(TAG, "onStop");
        this.mPageLifeCycleRegister.l();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        fve.e(TAG, "onWillExit");
        this.mPageLifeCycleRegister.m();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        fve.e(TAG, "onPageSelected");
        this.isSelect = true;
        this.mTabLifeCycleRegister.d();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.zxd
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        fve.e(TAG, "onPageUnSelected");
        this.isSelect = false;
        this.mTabLifeCycleRegister.e();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        fve.e(TAG, "onPause");
        this.isResume = false;
        this.mPageLifeCycleRegister.h();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService, tb.h6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        fve.e(TAG, "onResume");
        this.isResume = true;
        this.mPageLifeCycleRegister.j();
    }
}
