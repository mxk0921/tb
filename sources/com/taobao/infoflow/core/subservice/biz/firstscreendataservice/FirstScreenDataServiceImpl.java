package com.taobao.infoflow.core.subservice.biz.firstscreendataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.cfc;
import tb.e83;
import tb.lnn;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FirstScreenDataServiceImpl implements IFirstScreenDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mFirstScreenExt;
    private JSONObject mFirstScreenSplash;
    private cfc mInfoFlowContext;
    private IContainerDataService.a mOnDataProcessListener;
    private int mRecommendFirstCardIndex = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else if (FirstScreenDataServiceImpl.access$000(FirstScreenDataServiceImpl.this, iContainerDataModel)) {
                FirstScreenDataServiceImpl.access$100(FirstScreenDataServiceImpl.this, iContainerDataModel);
                FirstScreenDataServiceImpl.access$200(FirstScreenDataServiceImpl.this, iContainerDataModel);
                FirstScreenDataServiceImpl.access$300(FirstScreenDataServiceImpl.this, iContainerDataModel);
            }
        }
    }

    static {
        t2o.a(486539533);
        t2o.a(488636559);
    }

    public static /* synthetic */ boolean access$000(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("488a177e", new Object[]{firstScreenDataServiceImpl, iContainerDataModel})).booleanValue();
        }
        return firstScreenDataServiceImpl.isFirstScreenRequest(iContainerDataModel);
    }

    public static /* synthetic */ void access$100(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5841c9fb", new Object[]{firstScreenDataServiceImpl, iContainerDataModel});
        } else {
            firstScreenDataServiceImpl.recordFirstScreenBaseExt(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$200(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f97c7c", new Object[]{firstScreenDataServiceImpl, iContainerDataModel});
        } else {
            firstScreenDataServiceImpl.recordFirstScreenBaseTopView(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$300(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b12efd", new Object[]{firstScreenDataServiceImpl, iContainerDataModel});
        } else {
            firstScreenDataServiceImpl.recordRecommendFirstCardIndex(iContainerDataModel);
        }
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.a createDataProcessListener = createDataProcessListener();
            this.mOnDataProcessListener = createDataProcessListener;
            iContainerDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private boolean isFirstScreenRequest(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c9e8e3b", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null || iContainerDataModel.getBase().getPageParams().getPageNum() != 0) {
            return false;
        }
        return true;
    }

    private void recordFirstScreenBaseExt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753952cf", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && iContainerDataModel.getBase() != null && iContainerDataModel.getBase().getExt() != null) {
            this.mFirstScreenExt = iContainerDataModel.getBase().getExt();
        }
    }

    private void recordFirstScreenBaseTopView(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45892836", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && iContainerDataModel.getBase() != null && iContainerDataModel.getBase().getTopViewSplashSection() != null) {
            this.mFirstScreenSplash = iContainerDataModel.getBase().getTopViewSplashSection();
        }
    }

    private void recordRecommendFirstCardIndex(IContainerDataModel<BaseSectionModel> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6f4197", new Object[]{this, iContainerDataModel});
            return;
        }
        String a2 = lnn.a(this.mInfoFlowContext);
        if (iContainerDataModel != null && iContainerDataModel.getBase() != null) {
            this.mRecommendFirstCardIndex = e83.b(a2, iContainerDataModel.getTotalData());
        }
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (aVar = this.mOnDataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService
    public JSONObject getFirstScreenExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("15f29c62", new Object[]{this});
        }
        return this.mFirstScreenExt;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService
    public int getRecStartIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c33ee04", new Object[]{this})).intValue();
        }
        return this.mRecommendFirstCardIndex;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService
    public JSONObject getTopViewSplashData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f850085c", new Object[]{this});
        }
        return this.mFirstScreenSplash;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDataListener();
        }
    }
}
