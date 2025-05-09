package com.taobao.infoflow.taobao.subservice.biz.resetpagingnumber;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IResetPagingNumberService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.HashMap;
import java.util.Map;
import tb.cfc;
import tb.fve;
import tb.lnn;
import tb.t2o;
import tb.uve;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ResetPagingNumberServiceImpl implements IResetPagingNumberService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ResetPagingNumberServiceImpl";
    private boolean hasClickInfoFlowCard = false;
    private cfc mInfoFlowContext;
    private IDxItemClickService.a mOnDxItemClickListener;
    private IContainerDataService.e mRequestBizParamsCreator;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            if (!ResetPagingNumberServiceImpl.access$000(ResetPagingNumberServiceImpl.this) || !TextUtils.equals(str, "scrollNextPage") || !ResetPagingNumberServiceImpl.access$100(ResetPagingNumberServiceImpl.this)) {
                return null;
            }
            ResetPagingNumberServiceImpl.access$002(ResetPagingNumberServiceImpl.this, false);
            HashMap hashMap = new HashMap();
            hashMap.put("lastPageHasClicked", "true");
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IDxItemClickService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
        public void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
                return;
            }
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ResetPagingNumberServiceImpl.access$200(ResetPagingNumberServiceImpl.this).a(IMainFeedsViewService.class);
            if (iMainFeedsViewService != null) {
                int positionBySectionBizCode = iMainFeedsViewService.getPositionBySectionBizCode(lnn.a(ResetPagingNumberServiceImpl.access$200(ResetPagingNumberServiceImpl.this)));
                int positionBySectionBizCode2 = iMainFeedsViewService.getPositionBySectionBizCode(baseSectionModel.getSectionBizCode());
                if (positionBySectionBizCode2 >= positionBySectionBizCode && positionBySectionBizCode != -1) {
                    ResetPagingNumberServiceImpl.access$002(ResetPagingNumberServiceImpl.this, true);
                }
                if (positionBySectionBizCode == -1) {
                    uve.a("Page_Home", 19999, "PageDivergencyDefaultIndex", "", "", "");
                    ResetPagingNumberServiceImpl resetPagingNumberServiceImpl = ResetPagingNumberServiceImpl.this;
                    if (positionBySectionBizCode2 < 3) {
                        z = false;
                    }
                    ResetPagingNumberServiceImpl.access$002(resetPagingNumberServiceImpl, z);
                }
            }
        }
    }

    static {
        t2o.a(491782631);
        t2o.a(488636599);
    }

    public static /* synthetic */ boolean access$000(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a252ab39", new Object[]{resetPagingNumberServiceImpl})).booleanValue();
        }
        return resetPagingNumberServiceImpl.hasClickInfoFlowCard;
    }

    public static /* synthetic */ boolean access$002(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6906fe01", new Object[]{resetPagingNumberServiceImpl, new Boolean(z)})).booleanValue();
        }
        resetPagingNumberServiceImpl.hasClickInfoFlowCard = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d209df3a", new Object[]{resetPagingNumberServiceImpl})).booleanValue();
        }
        return resetPagingNumberServiceImpl.enableResetPagingNumber();
    }

    public static /* synthetic */ cfc access$200(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("6e2b2aa7", new Object[]{resetPagingNumberServiceImpl});
        }
        return resetPagingNumberServiceImpl.mInfoFlowContext;
    }

    private void addDxCardClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46f059e", new Object[]{this});
        } else if (this.mInfoFlowContext != null) {
            this.mOnDxItemClickListener = createOnDxItemClickListener();
            IDxItemClickService iDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
            if (iDxItemClickService != null) {
                iDxItemClickService.addDxItemClickListener(this.mOnDxItemClickListener);
            }
        }
    }

    private IDxItemClickService.a createOnDxItemClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.a) ipChange.ipc$dispatch("59b16f42", new Object[]{this});
        }
        return new b();
    }

    private IContainerDataService.e createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new a();
    }

    private boolean enableResetPagingNumber() {
        IContainerDataModel containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("144635ac", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null) {
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            fve.e(TAG, "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            return false;
        }
        return ext.getBooleanValue("isConvergenceEnable");
    }

    private void registerRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acd06", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.e createRequestBizParamsCreator = createRequestBizParamsCreator();
            this.mRequestBizParamsCreator = createRequestBizParamsCreator;
            iContainerDataService.addRequestBizParamsCreator(createRequestBizParamsCreator);
        }
    }

    private void removeDxCardClickListener() {
        IDxItemClickService iDxItemClickService;
        IDxItemClickService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548565b", new Object[]{this});
            return;
        }
        cfc cfcVar = this.mInfoFlowContext;
        if (cfcVar != null && (iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class)) != null && (aVar = this.mOnDxItemClickListener) != null) {
            iDxItemClickService.removeDxItemClickListener(aVar);
        }
    }

    private void unRegisterRequestBizParamsCreator() {
        IContainerDataService.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e50b7ad", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (eVar = this.mRequestBizParamsCreator) != null) {
            iContainerDataService.removeRequestBizParamsCreator(eVar);
            this.mRequestBizParamsCreator = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IResetPagingNumberService
    public boolean hasClickInfoFlowCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2429ade5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        addDxCardClickListener();
        registerRequestBizParamsCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        removeDxCardClickListener();
        unRegisterRequestBizParamsCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IResetPagingNumberService
    public void resetStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
        }
    }
}
