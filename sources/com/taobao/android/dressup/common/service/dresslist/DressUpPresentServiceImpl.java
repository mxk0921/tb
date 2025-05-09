package com.taobao.android.dressup.common.service.dresslist;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.android.dressup.base.infoflow.IDressUpPresentService;
import com.taobao.android.dressup.common.service.dresslist.DressUpPresentServiceImpl;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cfc;
import tb.fnm;
import tb.fve;
import tb.h69;
import tb.h6c;
import tb.t2o;
import tb.w1e;
import tb.xn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DressUpPresentServiceImpl implements IDressUpPresentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DressUpPresentServiceImpl";
    private IContainerService<?> mContainerService;
    private IDxItemClickService mDxItemClickService;
    private h6c.c<ViewGroup> mFeedsScrollListener;
    private IDressUpHostService mHostService;
    private cfc mInfoFlowContext;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private IDxItemClickService.a mOnDxItemClickListener;
    private IContainerDataService.e mRequestBizParamsCreator;
    private IContainerDataService.c mRequestListener;
    private IContainerService.a mUiRefreshListener;
    private boolean infoFlowHasBeenRequest = false;
    private boolean hostNeedRefresh = false;
    private String mTrendId = null;
    private JSONObject mPageParams = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IContainerInnerDataModel<?> base;
            IPageDataModel pageParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (pageParams = base.getPageParams()) != null) {
                DressUpPresentServiceImpl.access$002(DressUpPresentServiceImpl.this, true);
                if (pageParams.getPageNum() == 0) {
                    DressUpPresentServiceImpl.access$100(DressUpPresentServiceImpl.this, base);
                }
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
                return;
            }
            DressUpPresentServiceImpl.access$002(DressUpPresentServiceImpl.this, true);
            if (DressUpPresentServiceImpl.access$200(DressUpPresentServiceImpl.this)) {
                DressUpPresentServiceImpl.access$300(DressUpPresentServiceImpl.this);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            } else {
                DressUpPresentServiceImpl.access$002(DressUpPresentServiceImpl.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            } else if (DressUpPresentServiceImpl.access$400(DressUpPresentServiceImpl.this) != null) {
                DressUpPresentServiceImpl.access$400(DressUpPresentServiceImpl.this).removeSkeletonImage();
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (DressUpPresentServiceImpl.access$400(DressUpPresentServiceImpl.this) != null) {
                DressUpPresentServiceImpl.access$400(DressUpPresentServiceImpl.this).onScrollStateChanged(viewGroup, i);
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else if (DressUpPresentServiceImpl.access$400(DressUpPresentServiceImpl.this) != null) {
                DressUpPresentServiceImpl.access$400(DressUpPresentServiceImpl.this).onScrolled(viewGroup, i, i2);
            }
        }
    }

    static {
        t2o.a(918552701);
        t2o.a(918552605);
    }

    public static /* synthetic */ boolean access$002(DressUpPresentServiceImpl dressUpPresentServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d40354", new Object[]{dressUpPresentServiceImpl, new Boolean(z)})).booleanValue();
        }
        dressUpPresentServiceImpl.infoFlowHasBeenRequest = z;
        return z;
    }

    public static /* synthetic */ void access$100(DressUpPresentServiceImpl dressUpPresentServiceImpl, IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f70a8f2", new Object[]{dressUpPresentServiceImpl, iContainerInnerDataModel});
        } else {
            dressUpPresentServiceImpl.recordPageParams(iContainerInnerDataModel);
        }
    }

    public static /* synthetic */ boolean access$200(DressUpPresentServiceImpl dressUpPresentServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73c67888", new Object[]{dressUpPresentServiceImpl})).booleanValue();
        }
        return dressUpPresentServiceImpl.hostNeedRefresh;
    }

    public static /* synthetic */ void access$300(DressUpPresentServiceImpl dressUpPresentServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b967bb23", new Object[]{dressUpPresentServiceImpl});
        } else {
            dressUpPresentServiceImpl.doRealRefresh();
        }
    }

    public static /* synthetic */ IDressUpHostService access$400(DressUpPresentServiceImpl dressUpPresentServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDressUpHostService) ipChange.ipc$dispatch("b7a81244", new Object[]{dressUpPresentServiceImpl});
        }
        return dressUpPresentServiceImpl.mHostService;
    }

    private IDxItemClickService.a createDXItemClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.a) ipChange.ipc$dispatch("605e3401", new Object[]{this});
        }
        return new IDxItemClickService.a() { // from class: tb.u5z
            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
            public final void click(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
                DressUpPresentServiceImpl.this.lambda$createDXItemClickListener$1(baseSectionModel, baseSubItemModel, view);
            }
        };
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new c();
    }

    private IContainerDataService.e createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new IContainerDataService.e() { // from class: tb.s5z
            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
            public final Map a(w1e w1eVar, String str) {
                Map lambda$createRequestBizParamsCreator$0;
                lambda$createRequestBizParamsCreator$0 = DressUpPresentServiceImpl.this.lambda$createRequestBizParamsCreator$0(w1eVar, str);
                return lambda$createRequestBizParamsCreator$0;
            }
        };
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    private IContainerService.a createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("c4ddacd6", new Object[]{this});
        }
        return new b();
    }

    private void doRealRefresh() {
        IContainerInnerDataModel base;
        List sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a09559", new Object[]{this});
        } else if (this.mHostService != null) {
            ArrayList arrayList = new ArrayList(this.mHostService.getHostDataSet());
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
            if (iMainFeedsViewService != null) {
                IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
                if (!(iContainerDataService == null || iContainerDataService.getContainerData() == null || (base = iContainerDataService.getContainerData().getBase()) == null || (sections = base.getSections()) == null)) {
                    arrayList.addAll(sections);
                }
                iMainFeedsViewService.uiRefresh(arrayList, new h69(false, false, false));
            }
        }
    }

    public static boolean isSingleDressUpDetail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bf9b106", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, xn4.REC_OUTFIT_TREND.f31484a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createDXItemClickListener$1(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c6cea4", new Object[]{this, baseSectionModel, baseSubItemModel, view});
        } else if (enableTransTargetParams(baseSectionModel)) {
            JSONObject findFirstTargetParams = findFirstTargetParams(baseSectionModel);
            IDressUpHostService iDressUpHostService = this.mHostService;
            if (iDressUpHostService != null) {
                iDressUpHostService.onDressUpInfoFlowCardClicked(findFirstTargetParams, view);
            }
        }
    }

    private void recordPageParams(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4955cba", new Object[]{this, iContainerInnerDataModel});
            return;
        }
        JSONObject ext = iContainerInnerDataModel.getExt();
        if (ext != null && (jSONObject = ext.getJSONObject("pageMaterial")) != null) {
            this.mTrendId = jSONObject.getString("trendId");
        }
    }

    private void registerCardClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4312d8d0", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
        this.mDxItemClickService = iDxItemClickService;
        if (iDxItemClickService != null) {
            IDxItemClickService.a createDXItemClickListener = createDXItemClickListener();
            this.mOnDxItemClickListener = createDXItemClickListener;
            this.mDxItemClickService.addDxItemClickListener(createDXItemClickListener);
        }
    }

    private void registerDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff3b0c8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.c createRequestListener = createRequestListener();
            this.mRequestListener = createRequestListener;
            iContainerDataService.addRequestListener(createRequestListener);
        }
    }

    private void registerFeedsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b860d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "registerFeedsListener mMainFeedsViewService is null");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
        this.mFeedsScrollListener = createFeedsScrollListener;
        lifeCycleRegister.h(createFeedsScrollListener);
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

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        IContainerService.a createUiRefreshListener = createUiRefreshListener();
        this.mUiRefreshListener = createUiRefreshListener;
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null) {
            iContainerService.addUiRefreshListener(createUiRefreshListener);
        }
    }

    private void unRegisterCardClickListener() {
        IDxItemClickService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ab8cb7", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService != null && (aVar = this.mOnDxItemClickListener) != null) {
            iDxItemClickService.removeDxItemClickListener(aVar);
        }
    }

    private void unRegisterDataListener() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (cVar = this.mRequestListener) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    private void unRegisterOnScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10935563", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "unRegisterOnScrollListener mMainFeedsViewService is null");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        h6c.c<ViewGroup> cVar = this.mFeedsScrollListener;
        if (cVar != null) {
            lifeCycleRegister.v(cVar);
            this.mFeedsScrollListener = null;
        }
    }

    private void unRegisterRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e50b7ad", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.e eVar = this.mRequestBizParamsCreator;
            if (eVar != null) {
                iContainerDataService.removeRequestBizParamsCreator(eVar);
            }
            this.mRequestBizParamsCreator = null;
        }
    }

    private void unRegisterUiRefreshListener() {
        IContainerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null && (aVar = this.mUiRefreshListener) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpPresentService
    public double calculateCardExposeRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705b0b9", new Object[]{this, new Integer(i)})).doubleValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return -1.0d;
        }
        return iMainFeedsViewService.getViewExposureRatio(i);
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpPresentService
    public void notifyDataSetChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2a746c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!z) {
            doRealRefresh();
        } else if (!this.infoFlowHasBeenRequest) {
            this.hostNeedRefresh = true;
        } else {
            doRealRefresh();
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
        this.mMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        this.mHostService = (IDressUpHostService) this.mInfoFlowContext.a(IDressUpHostService.class);
        registerDataListener();
        registerFeedsListener();
        registerCardClickListener();
        registerUiRefreshListener();
        if (isSingleDressUpDetail(this.mInfoFlowContext.getContainerType().getContainerId())) {
            registerRequestBizParamsCreator();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataListener();
        unRegisterOnScrollListener();
        unRegisterCardClickListener();
        unRegisterUiRefreshListener();
        if (isSingleDressUpDetail(this.mInfoFlowContext.getContainerType().getContainerId())) {
            unRegisterRequestBizParamsCreator();
        }
    }

    private JSONObject findFirstTargetParams(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel item;
        BaseSubItemModel baseItemModel;
        JSONObject ext;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a3e57fd", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || (item = baseSectionModel.getItem()) == null || (baseItemModel = item.getBaseItemModel(0)) == null || (ext = baseItemModel.getExt()) == null) {
            return null;
        }
        String string = ext.getString(fnm.KEY_TARGET_PARAMS);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(string);
        } catch (Exception e) {
            fve.c(TAG, "findFirstTargetParams 解析异常", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("simpleDeliverData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$createRequestBizParamsCreator$0(w1e w1eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e34f35c3", new Object[]{this, w1eVar, str});
        }
        if (!isSingleDressUpDetail(this.mInfoFlowContext.getContainerType().getContainerId())) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        String str2 = this.mTrendId;
        if (str2 != null) {
            hashMap.put("trendId", str2);
        }
        JSONObject jSONObject = this.mPageParams;
        if (jSONObject != null) {
            hashMap.put("pageParams", jSONObject.toJSONString());
        }
        return hashMap;
    }

    private boolean enableTransTargetParams(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel item;
        BaseSubItemModel baseItemModel;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("565aac4f", new Object[]{this, baseSectionModel})).booleanValue();
        }
        return (baseSectionModel == null || (item = baseSectionModel.getItem()) == null || (baseItemModel = item.getBaseItemModel(0)) == null || (ext = baseItemModel.getExt()) == null || !TextUtils.equals(ext.getString("targetType"), "dressup") || TextUtils.equals(ext.getString(fnm.KEY_DISABLE_PARSE_DELIVER), "true")) ? false : true;
    }
}
