package com.taobao.android.dressup.common.service.dresslist;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IHostConfigInvokeService;
import tb.cfc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DressUpConfigInvokeServiceImpl implements IHostConfigInvokeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mHostConfig;

    static {
        t2o.a(918552695);
        t2o.a(488636631);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IHostConfigInvokeService
    public JSONObject getHostConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf7612a7", new Object[]{this});
        }
        if (this.mHostConfig == null) {
            JSONObject jSONObject = new JSONObject();
            this.mHostConfig = jSONObject;
            jSONObject.put(IHostConfigInvokeService.KEY_IMAGE_BIZ_TYPE, (Object) "dressup");
            this.mHostConfig.put(IHostConfigInvokeService.KEY_IMAGE_BIZ_ID, (Object) "dressup");
        }
        return this.mHostConfig;
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
