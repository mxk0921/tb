package com.taobao.infoflow.taobao.subservice.framework.hostservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import tb.cfc;
import tb.jgc;
import tb.lza;
import tb.r2b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomePageHostService implements IHostService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final r2b mCallBack;

    static {
        t2o.a(491782809);
        t2o.a(488636649);
    }

    public HomePageHostService(lza lzaVar) {
        this.mCallBack = new r2b(lzaVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IHostService
    public jgc getInvokeCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgc) ipChange.ipc$dispatch("6c07c9fb", new Object[]{this});
        }
        return this.mCallBack;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }
}
