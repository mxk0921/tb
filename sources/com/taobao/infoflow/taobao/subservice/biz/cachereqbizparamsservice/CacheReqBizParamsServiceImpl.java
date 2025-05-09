package com.taobao.infoflow.taobao.subservice.biz.cachereqbizparamsservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;
import tb.ce2;
import tb.cfc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CacheReqBizParamsServiceImpl implements ICacheReqBizParamsService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ce2 mBizParamCacheCenter;

    static {
        t2o.a(491782285);
        t2o.a(488636536);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        } else {
            this.mBizParamCacheCenter = new ce2(cfcVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mBizParamCacheCenter.d();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService
    public String readReqBizParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20ba8059", new Object[]{this, str, str2, str3});
        }
        ce2 ce2Var = this.mBizParamCacheCenter;
        if (ce2Var != null) {
            return ce2Var.f(str, str2, str3);
        }
        return str2;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService
    public void saveReqBizParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b6efa0", new Object[]{this, str, str2, str3});
            return;
        }
        ce2 ce2Var = this.mBizParamCacheCenter;
        if (ce2Var != null) {
            ce2Var.h(str, str2, str3);
        }
    }
}
