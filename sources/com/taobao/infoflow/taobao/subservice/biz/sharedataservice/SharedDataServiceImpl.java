package com.taobao.infoflow.taobao.subservice.biz.sharedataservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISharedDataService;
import tb.ajp;
import tb.cfc;
import tb.t2o;
import tb.yip;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SharedDataServiceImpl implements ISharedDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private yip mShareDataJsNativeFeatureRegister;
    private ajp mShareDataSource;

    static {
        t2o.a(491782658);
        t2o.a(488636604);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mShareDataJsNativeFeatureRegister = new yip(cfcVar);
        ajp ajpVar = new ajp(cfcVar);
        this.mShareDataSource = ajpVar;
        this.mShareDataJsNativeFeatureRegister.b(ajpVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mShareDataJsNativeFeatureRegister.c();
        this.mShareDataSource.d();
    }
}
