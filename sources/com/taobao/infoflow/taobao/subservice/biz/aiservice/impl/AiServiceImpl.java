package com.taobao.infoflow.taobao.subservice.biz.aiservice.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import java.util.List;
import tb.cfc;
import tb.ri0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AiServiceImpl implements IAiService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IAiService.a mAiConfig;
    private ri0 mAiProviderAdapter;

    static {
        t2o.a(491782284);
        t2o.a(488636533);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService
    public void clearAiCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bf17fe", new Object[]{this, str});
            return;
        }
        ri0 ri0Var = this.mAiProviderAdapter;
        if (ri0Var != null) {
            ri0Var.h(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService
    public List<BaseSectionModel<?>> getAiCacheCards(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b6d6d37", new Object[]{this, str});
        }
        ri0 ri0Var = this.mAiProviderAdapter;
        if (ri0Var != null) {
            return ri0Var.m(str);
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        ri0 ri0Var = new ri0(cfcVar);
        this.mAiProviderAdapter = ri0Var;
        IAiService.a aVar = this.mAiConfig;
        if (aVar != null) {
            ri0Var.o(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mAiProviderAdapter.l();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService
    public void setConfig(IAiService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8ff50b", new Object[]{this, aVar});
            return;
        }
        ri0 ri0Var = this.mAiProviderAdapter;
        if (ri0Var == null) {
            this.mAiConfig = aVar;
        } else {
            ri0Var.o(aVar);
        }
    }
}
