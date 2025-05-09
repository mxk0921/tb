package com.taobao.infoflow.core.subservice.biz.experiencecheck;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.UserExperienceCheck;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.cfc;
import tb.fve;
import tb.g93;
import tb.jrv;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserExperienceCheckServiceImpl implements IUserExperienceCheckService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HOME_GLOBAL_AB_TEST = "homeGlobalABTest";
    private String TAG = "UserExperienceCheckServiceImpl";
    private g93 mCardTitleDisplayCollector;
    private IContainerDataService<?> mContainerDataService;
    private UserExperienceCheck mExperienceCheck;
    private cfc mInfoFlowContext;
    private IContainerDataService.c mOnRequestListener;
    private jrv mUserExperienceConfig;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else {
                UserExperienceCheckServiceImpl.access$000(UserExperienceCheckServiceImpl.this, iContainerDataModel);
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
        t2o.a(486539519);
        t2o.a(488636613);
    }

    public static /* synthetic */ void access$000(UserExperienceCheckServiceImpl userExperienceCheckServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e211bee", new Object[]{userExperienceCheckServiceImpl, iContainerDataModel});
        } else {
            userExperienceCheckServiceImpl.getExperimentConfig(iContainerDataModel);
        }
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    private void getExperimentConfig(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb8509f", new Object[]{this, iContainerDataModel});
            return;
        }
        JSONObject homeGlobalAbTest = getHomeGlobalAbTest(iContainerDataModel);
        if (homeGlobalAbTest == null) {
            fve.e(this.TAG, "updateNdLowFeatureList homeGlobalAbTest == null");
            return;
        }
        jrv jrvVar = this.mUserExperienceConfig;
        if (jrvVar != null) {
            jrvVar.d(homeGlobalAbTest);
        }
    }

    private JSONObject getHomeGlobalAbTest(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91e03649", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            fve.e(this.TAG, "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e(this.TAG, "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return ext.getJSONObject(HOME_GLOBAL_AB_TEST);
        }
        fve.e(this.TAG, "ext == null");
        return null;
    }

    private void registerRequestListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b88f99", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService == null) {
            fve.e(this.TAG, "registerRequestListener mContainerDataService is null");
            return;
        }
        IContainerDataService.c createRequestListener = createRequestListener();
        this.mOnRequestListener = createRequestListener;
        this.mContainerDataService.addRequestListener(createRequestListener);
    }

    private void unRegisterRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null) {
            fve.e(this.TAG, "unRegisterRequestListener mContainerDataService is null");
            return;
        }
        IContainerDataService.c cVar = this.mOnRequestListener;
        if (cVar != null) {
            iContainerDataService.removeRequestListener(cVar);
            this.mOnRequestListener = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        if (this.mExperienceCheck == null) {
            this.mExperienceCheck = new UserExperienceCheck(cfcVar);
        }
        if (this.mUserExperienceConfig == null) {
            this.mUserExperienceConfig = new jrv();
        }
        this.mExperienceCheck.i(this.mUserExperienceConfig);
        registerRequestListener(cfcVar);
        this.mCardTitleDisplayCollector = new g93(cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        UserExperienceCheck userExperienceCheck = this.mExperienceCheck;
        if (userExperienceCheck != null) {
            userExperienceCheck.f();
        }
        unRegisterRequestListener();
        this.mCardTitleDisplayCollector.g();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService
    public void saveGoodsInfo(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f2e776", new Object[]{this, baseSectionModel});
            return;
        }
        UserExperienceCheck userExperienceCheck = this.mExperienceCheck;
        if (userExperienceCheck != null) {
            userExperienceCheck.h(baseSectionModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService
    public void startExperienceCheckTask(BaseSectionModel<?> baseSectionModel, IUserExperienceCheckService.CheckOccasion checkOccasion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc3533a", new Object[]{this, baseSectionModel, checkOccasion});
            return;
        }
        UserExperienceCheck userExperienceCheck = this.mExperienceCheck;
        if (userExperienceCheck != null) {
            userExperienceCheck.h(baseSectionModel);
            this.mExperienceCheck.j(baseSectionModel, checkOccasion);
        }
    }
}
