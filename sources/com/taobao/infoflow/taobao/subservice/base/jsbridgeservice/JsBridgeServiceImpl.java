package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import tb.cfc;
import tb.rvf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class JsBridgeServiceImpl implements IJsBridgeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final rvf mJsNativeFeatureDispatcher = new rvf();

    static {
        t2o.a(491782234);
        t2o.a(488636529);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        } else {
            this.mJsNativeFeatureDispatcher.c(cfcVar.getContainerType().getContainerId());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mJsNativeFeatureDispatcher.b();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService
    public void registerJsNativeFeature(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fcba6d", new Object[]{this, aVar});
        } else {
            this.mJsNativeFeatureDispatcher.d(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService
    public void unRegisterJsNativeFeature(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ac5614", new Object[]{this, aVar});
        } else {
            this.mJsNativeFeatureDispatcher.e(aVar);
        }
    }
}
