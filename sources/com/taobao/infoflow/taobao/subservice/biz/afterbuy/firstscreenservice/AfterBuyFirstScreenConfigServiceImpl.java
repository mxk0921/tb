package com.taobao.infoflow.taobao.subservice.biz.afterbuy.firstscreenservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyFirstScreenConfigService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetPageData;
import tb.cfc;
import tb.oh0;
import tb.t2o;
import tb.uqa;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfterBuyFirstScreenConfigServiceImpl implements IAfterBuyFirstScreenConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FIRST_SCREEN_EFFECT_CONFIG = "firstScreenEffectConfig";
    private static final String FIRST_SCREEN_EFFECT_STAGE = "getColdEffectConfigFromGateway";
    private IContainerDataService<?> mContainerDataService;
    private Boolean mEnableAfterBuyNewFramework;
    private JSONObject mFirstScreenEffectConfig;
    private cfc mInfoFlowContext;
    private IContainerDataService.c mOnRequestListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            JSONObject ext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (iContainerDataModel instanceof AwesomeGetContainerData) {
                AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) iContainerDataModel;
                if (!AfterBuyFirstScreenConfigServiceImpl.access$000(AfterBuyFirstScreenConfigServiceImpl.this, awesomeGetContainerData)) {
                    uqa.b("buyAfterRecommend", "createRequestListener", "不是第一页");
                    return;
                }
                AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl = AfterBuyFirstScreenConfigServiceImpl.this;
                AfterBuyFirstScreenConfigServiceImpl.access$102(afterBuyFirstScreenConfigServiceImpl, AfterBuyFirstScreenConfigServiceImpl.access$200(afterBuyFirstScreenConfigServiceImpl, awesomeGetContainerData));
                IContainerInnerDataModel<SectionModel> base = awesomeGetContainerData.getBase();
                if (base != null && (ext = base.getExt()) != null) {
                    AfterBuyFirstScreenConfigServiceImpl.access$302(AfterBuyFirstScreenConfigServiceImpl.this, Boolean.valueOf(ext.getBooleanValue(oh0.KEY_ENABLE_AFTER_BUY_NEW_FRAMEWORK)));
                    oh0.b(AfterBuyFirstScreenConfigServiceImpl.access$400(AfterBuyFirstScreenConfigServiceImpl.this).getContainerType().getContainerId(), AfterBuyFirstScreenConfigServiceImpl.access$300(AfterBuyFirstScreenConfigServiceImpl.this));
                }
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
        t2o.a(491782254);
        t2o.a(488636626);
    }

    public static /* synthetic */ boolean access$000(AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6d93d59", new Object[]{afterBuyFirstScreenConfigServiceImpl, awesomeGetContainerData})).booleanValue();
        }
        return afterBuyFirstScreenConfigServiceImpl.isFirstPage(awesomeGetContainerData);
    }

    public static /* synthetic */ JSONObject access$102(AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1504c34e", new Object[]{afterBuyFirstScreenConfigServiceImpl, jSONObject});
        }
        afterBuyFirstScreenConfigServiceImpl.mFirstScreenEffectConfig = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject access$200(AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("64d56577", new Object[]{afterBuyFirstScreenConfigServiceImpl, awesomeGetContainerData});
        }
        return afterBuyFirstScreenConfigServiceImpl.parseColdEffectConfig(awesomeGetContainerData);
    }

    public static /* synthetic */ Boolean access$300(AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("dcd50f7f", new Object[]{afterBuyFirstScreenConfigServiceImpl});
        }
        return afterBuyFirstScreenConfigServiceImpl.mEnableAfterBuyNewFramework;
    }

    public static /* synthetic */ Boolean access$302(AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("12170b86", new Object[]{afterBuyFirstScreenConfigServiceImpl, bool});
        }
        afterBuyFirstScreenConfigServiceImpl.mEnableAfterBuyNewFramework = bool;
        return bool;
    }

    public static /* synthetic */ cfc access$400(AfterBuyFirstScreenConfigServiceImpl afterBuyFirstScreenConfigServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("64fe92b3", new Object[]{afterBuyFirstScreenConfigServiceImpl});
        }
        return afterBuyFirstScreenConfigServiceImpl.mInfoFlowContext;
    }

    private IContainerDataService.c createOnRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("7d4f9901", new Object[]{this});
        }
        return new a();
    }

    private JSONObject getFirstScreenConfigFromExt(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("168643ba", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject(FIRST_SCREEN_EFFECT_CONFIG);
        }
        uqa.b("buyAfterRecommend", "getFirstScreenConfigFromExt", "ext == null");
        return null;
    }

    private JSONObject getFirstScreenConfigFromGateway(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f908ad63", new Object[]{this, str});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        IContainerInnerDataModel base = iContainerDataService.getContainerData().getBase();
        if (!(base instanceof AwesomeGetContainerInnerData)) {
            return null;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) base;
        AwesomeGetPageData pageParams = awesomeGetContainerInnerData.getPageParams();
        if (pageParams == null) {
            uqa.b("buyAfterRecommend", FIRST_SCREEN_EFFECT_STAGE, "pageData == null");
            return null;
        } else if (pageParams.getPageNum() == 0) {
            return getFirstScreenConfigFromExt(awesomeGetContainerInnerData.getExt());
        } else {
            uqa.b("buyAfterRecommend", FIRST_SCREEN_EFFECT_STAGE, "不是第一页");
            return null;
        }
    }

    private boolean isFirstPage(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8fe2d36", new Object[]{this, awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData.getPageNum() == 0) {
            return true;
        }
        return false;
    }

    private JSONObject parseColdEffectConfig(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f502a47", new Object[]{this, awesomeGetContainerData});
        }
        return getFirstScreenConfigFromExt(awesomeGetContainerData.getExt());
    }

    private void registerRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService != null) {
            IContainerDataService.c createOnRequestListener = createOnRequestListener();
            this.mOnRequestListener = createOnRequestListener;
            this.mContainerDataService.addRequestListener(createOnRequestListener);
        }
    }

    private void unRegisterRequestListener() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null && (cVar = this.mOnRequestListener) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyFirstScreenConfigService
    public JSONObject getFirstScreenEffectConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4acba4a", new Object[]{this, str});
        }
        JSONObject firstScreenConfigFromGateway = getFirstScreenConfigFromGateway(str);
        if (firstScreenConfigFromGateway != null) {
            return firstScreenConfigFromGateway;
        }
        return this.mFirstScreenEffectConfig;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        registerRequestListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterRequestListener();
        }
    }
}
