package com.taobao.infoflow.taobao.subservice.biz.afterbuy.afterbuyprerequestservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyPreRequestService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.cfc;
import tb.eqm;
import tb.fve;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfterBuyPreRequestServiceImpl implements IAfterBuyPreRequestService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String OPTIMIZATION_CONFIG = "optimizationConfig";
    private static final String TAG = "AfterBuyPreRequestServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private cfc mInfoFlowContext;
    private final IContainerDataService.c mOnRequestListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IContainerInnerDataModel<?> base;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
                AfterBuyPreRequestServiceImpl.access$100(AfterBuyPreRequestServiceImpl.this, AfterBuyPreRequestServiceImpl.access$000(AfterBuyPreRequestServiceImpl.this).getContainerType().getContainerId(), base);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }
    }

    static {
        t2o.a(491782246);
        t2o.a(488636628);
    }

    public static /* synthetic */ cfc access$000(AfterBuyPreRequestServiceImpl afterBuyPreRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("fc5c9a17", new Object[]{afterBuyPreRequestServiceImpl});
        }
        return afterBuyPreRequestServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ void access$100(AfterBuyPreRequestServiceImpl afterBuyPreRequestServiceImpl, String str, IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88bcd3f", new Object[]{afterBuyPreRequestServiceImpl, str, iContainerInnerDataModel});
        } else {
            afterBuyPreRequestServiceImpl.updateOptimizationConfig(str, iContainerInnerDataModel);
        }
    }

    private void updateOptimizationConfig(String str, IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b15b56", new Object[]{this, str, iContainerInnerDataModel});
            return;
        }
        JSONObject ext = iContainerInnerDataModel.getExt();
        if (ext == null) {
            fve.e(TAG, "ext is null");
            return;
        }
        JSONObject jSONObject = ext.getJSONObject("optimizationConfig");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        eqm.a(str, jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.mOnRequestListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeRequestListener(this.mOnRequestListener);
        }
    }
}
