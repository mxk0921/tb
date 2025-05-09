package com.taobao.infoflow.taobao.subservice.biz.smartrtservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartRtService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.cfc;
import tb.fve;
import tb.h93;
import tb.t2o;
import tb.ul4;
import tb.uve;
import tb.w1e;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SmartRtService implements ISmartRtService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SmartRtService";
    private IContainerDataModel<?> mContainerDataModel;
    private cfc mInfoFlowContext;
    private IContainerDataService.a mOnDataProcessListener;
    private String willingScore;

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
                return;
            }
            SmartRtService.access$002(SmartRtService.this, iContainerDataModel);
            if (SmartRtService.access$100(SmartRtService.this, iContainerDataModel)) {
                SmartRtService.access$200(SmartRtService.this);
            }
        }
    }

    static {
        t2o.a(491782693);
        t2o.a(488636607);
    }

    public static /* synthetic */ IContainerDataModel access$002(SmartRtService smartRtService, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("3e6702b8", new Object[]{smartRtService, iContainerDataModel});
        }
        smartRtService.mContainerDataModel = iContainerDataModel;
        return iContainerDataModel;
    }

    public static /* synthetic */ boolean access$100(SmartRtService smartRtService, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f3aa5d0", new Object[]{smartRtService, iContainerDataModel})).booleanValue();
        }
        return smartRtService.isNeedUploadScore(iContainerDataModel);
    }

    public static /* synthetic */ void access$200(SmartRtService smartRtService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec795ee", new Object[]{smartRtService});
        } else {
            smartRtService.willingScoreStatistics();
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

    private void willingScoreStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd5466c", new Object[]{this});
        } else if (this.willingScore != null) {
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_fistpage_request_end", "", "", generateArgs());
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

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartRtService
    public void smartPreloadPredictStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6794143", new Object[]{this});
        } else if (this.mInfoFlowContext != null && ul4.f(this.mContainerDataModel) && this.willingScore != null && !h93.b((IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class))) {
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_second_request_trigger", "", "", generateArgs());
        }
    }

    private String generateArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd846247", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("score", (Object) this.willingScore);
        jSONObject.put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "mainFeedsViewService is null");
            return jSONObject.toString();
        }
        BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(0);
        if (findItemDataByPosition == null) {
            fve.e(TAG, "sectionModel is null");
            return jSONObject.toString();
        }
        JSONObject args = findItemDataByPosition.getArgs();
        if (args == null) {
            fve.e(TAG, "args is null");
            return jSONObject.toString();
        }
        JSONObject jSONObject2 = args.getJSONObject("utLogMapEdge");
        if (jSONObject2 == null) {
            fve.e(TAG, "utLogMapEdge is null");
            return jSONObject.toString();
        }
        jSONObject.put("sessionId", (Object) jSONObject2.getString("sessionId"));
        return jSONObject.toString();
    }

    private boolean isNeedUploadScore(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42628a27", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || !ul4.f(iContainerDataModel) || zza.c() == null) {
            return false;
        }
        JSONObject A = zza.c().A();
        if (A == null) {
            fve.e(TAG, "isOpenRealTimeLog ext == null");
            return false;
        }
        this.willingScore = A.getString("willingness_score");
        cfc cfcVar = this.mInfoFlowContext;
        return (cfcVar == null || h93.b((IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class)) || this.willingScore == null) ? false : true;
    }
}
