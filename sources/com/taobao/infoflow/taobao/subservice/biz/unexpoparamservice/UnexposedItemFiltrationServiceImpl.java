package com.taobao.infoflow.taobao.subservice.biz.unexpoparamservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IUnexposedItemFiltrationService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.cfc;
import tb.ofv;
import tb.pfv;
import tb.qfv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UnexposedItemFiltrationServiceImpl implements IUnexposedItemFiltrationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ofv mConfig;
    private qfv mDataProcessor;
    private cfc mInfoFlowContext;
    private pfv mParamCreator;

    static {
        t2o.a(491782725);
        t2o.a(488636612);
    }

    private void registerDataListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22516f59", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            pfv pfvVar = new pfv(this.mInfoFlowContext, this.mConfig);
            this.mParamCreator = pfvVar;
            iContainerDataService.addRequestBizParamsCreator(pfvVar);
            qfv qfvVar = new qfv(this.mConfig);
            this.mDataProcessor = qfvVar;
            iContainerDataService.addDataProcessListener(qfvVar);
        }
    }

    private void unRegisterDataListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b62ec0", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            pfv pfvVar = this.mParamCreator;
            if (pfvVar != null) {
                iContainerDataService.removeRequestBizParamsCreator(pfvVar);
            }
            qfv qfvVar = this.mDataProcessor;
            if (qfvVar != null) {
                iContainerDataService.removeDataProcessListener(qfvVar);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mConfig = new ofv();
        registerDataListeners();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDataListeners();
        }
    }
}
