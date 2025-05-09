package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.INextPageOptimizeService;
import tb.cfc;
import tb.osm;
import tb.p2k;
import tb.t2o;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NextPageOptimizeServiceImpl implements INextPageOptimizeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private p2k mNextPagePreLoader;
    private osm mPreloadScheduleBridge;

    static {
        t2o.a(491782413);
        t2o.a(488636575);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mNextPagePreLoader = new p2k(cfcVar);
        if (TextUtils.equals(cfcVar.getContainerType().getPage(), z4a.NEW_FACE_CHILD.e())) {
            this.mPreloadScheduleBridge = new osm(cfcVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        p2k p2kVar = this.mNextPagePreLoader;
        if (p2kVar != null) {
            p2kVar.s();
        }
        osm osmVar = this.mPreloadScheduleBridge;
        if (osmVar != null) {
            osmVar.destroy();
        }
    }
}
