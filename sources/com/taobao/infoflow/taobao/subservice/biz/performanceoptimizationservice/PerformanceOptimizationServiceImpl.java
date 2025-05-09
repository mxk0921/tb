package com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPerformanceOptimizationService;
import tb.cfc;
import tb.kue;
import tb.t2o;
import tb.yxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PerformanceOptimizationServiceImpl implements IPerformanceOptimizationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private kue mInfoFlowCacheDataValidator;
    private yxl mPerformanceTraceDetector;

    static {
        t2o.a(491782526);
        t2o.a(488636578);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        yxl yxlVar = new yxl(cfcVar);
        this.mPerformanceTraceDetector = yxlVar;
        yxlVar.a();
        this.mInfoFlowCacheDataValidator = new kue(cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mPerformanceTraceDetector.b();
        this.mInfoFlowCacheDataValidator.d();
    }
}
