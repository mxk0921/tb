package com.taobao.infoflow.taobao.subservice.biz.jump2banner;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IJumpToBannerService;
import tb.cfc;
import tb.dyf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class JumpToBannerServiceImpl implements IJumpToBannerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private dyf mJumpToBanner;

    static {
        t2o.a(491782403);
        t2o.a(488636570);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        } else {
            this.mJumpToBanner = new dyf(cfcVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        dyf dyfVar = this.mJumpToBanner;
        if (dyfVar != null) {
            dyfVar.j();
        }
    }
}
