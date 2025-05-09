package com.taobao.infoflow.taobao.subservice.biz.screenshotservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IScreenShotService;
import tb.cfc;
import tb.kvy;
import tb.lvy;
import tb.t2o;
import tb.zuy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ScreenShotServiceImpl implements IScreenShotService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ScreenShotServiceImpl";
    private cfc mInfoFlowContext;
    private kvy mLifecycleHandler;
    private zuy mRequestListener;
    private lvy mScreenshotTracker;

    static {
        t2o.a(491782636);
        t2o.a(488636603);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mScreenshotTracker = new lvy(this.mInfoFlowContext);
        this.mLifecycleHandler = new kvy(this.mInfoFlowContext, this.mScreenshotTracker);
        this.mRequestListener = new zuy(this.mInfoFlowContext);
        this.mLifecycleHandler.f();
        this.mRequestListener.c();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        kvy kvyVar = this.mLifecycleHandler;
        if (kvyVar != null) {
            kvyVar.g();
        }
        zuy zuyVar = this.mRequestListener;
        if (zuyVar != null) {
            zuyVar.d();
        }
    }
}
