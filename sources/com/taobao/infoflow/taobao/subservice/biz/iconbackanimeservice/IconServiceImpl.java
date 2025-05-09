package com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cfc;
import tb.fve;
import tb.o78;
import tb.qct;
import tb.t2o;
import tb.v7d;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IconServiceImpl implements IIconService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IconServiceImpl";
    private int mCurrentPageIndex;
    private IDxItemClickService mDxItemClickService;
    private cfc mInfoFlowContext;
    private int mInitPageIndex;
    private IContainerDataService.c mRequestListener;
    private IDxItemClickService.b mTargetUrlParamsCreator;
    private String sectionBizCode;
    private final Map<String, JSONObject> mPassParams = new HashMap();
    private final Map<String, Long> mPassPopLayerTriggerTimeMap = new HashMap();
    private final Map<String, Long> mEffectiveTimeMap = new HashMap();

    static {
        t2o.a(491782359);
        t2o.a(488636569);
    }

    public static /* synthetic */ int access$000(IconServiceImpl iconServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37f66b16", new Object[]{iconServiceImpl})).intValue();
        }
        return iconServiceImpl.mCurrentPageIndex;
    }

    public static /* synthetic */ int access$002(IconServiceImpl iconServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5219f171", new Object[]{iconServiceImpl, new Integer(i)})).intValue();
        }
        iconServiceImpl.mCurrentPageIndex = i;
        return i;
    }

    public static /* synthetic */ String access$100(IconServiceImpl iconServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee04cbc", new Object[]{iconServiceImpl});
        }
        return iconServiceImpl.sectionBizCode;
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    private void initRegisterDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb9ed", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.c createRequestListener = createRequestListener();
            this.mRequestListener = createRequestListener;
            iContainerDataService.addRequestListener(createRequestListener);
        }
    }

    private void registerTargetUrlParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a1fbd2", new Object[]{this});
            return;
        }
        if (this.mTargetUrlParamsCreator == null) {
            this.mTargetUrlParamsCreator = new qct(this.mInfoFlowContext);
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
        this.mDxItemClickService = iDxItemClickService;
        if (iDxItemClickService != null) {
            iDxItemClickService.addTargetUrlParamsCreator(this.mTargetUrlParamsCreator);
        }
    }

    private void unRegisterDataProcessListener() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (cVar = this.mRequestListener) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    private void unRegisterTargetUrlParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b0a04b", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
        this.mDxItemClickService = iDxItemClickService;
        if (iDxItemClickService != null) {
            iDxItemClickService.removeTargetUrlParamsCreator(this.mTargetUrlParamsCreator);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void clearPopLayerData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bcc788", new Object[]{this, str});
            return;
        }
        if (!this.mPassParams.isEmpty()) {
            fve.e(TAG, "clearPopLayerData");
            this.mPassParams.remove(str);
        }
        if (!this.mEffectiveTimeMap.isEmpty()) {
            this.mEffectiveTimeMap.remove(str);
        }
        if (!this.mPassPopLayerTriggerTimeMap.isEmpty()) {
            this.mPassPopLayerTriggerTimeMap.remove(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public int getCurrentPageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abacbdfa", new Object[]{this})).intValue();
        }
        return this.mCurrentPageIndex;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public int getInitPageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c892e97", new Object[]{this})).intValue();
        }
        return this.mInitPageIndex;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public JSONObject getPopLayerData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab0a4571", new Object[]{this, str});
        }
        return this.mPassParams.get(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        initRegisterDataProcessListener();
        registerTargetUrlParamsCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataProcessListener();
        unRegisterTargetUrlParamsCreator();
        this.mPassParams.clear();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void passPopLayerData(v7d v7dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd876a77", new Object[]{this, v7dVar, str});
            return;
        }
        this.mPassParams.put(str, v7dVar.a());
        this.mEffectiveTimeMap.put(str, Long.valueOf(v7dVar.b()));
        this.mPassPopLayerTriggerTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void setCurrentPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99fe2850", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentPageIndex = i;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void setSectionBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dbfece", new Object[]{this, str});
        } else {
            this.sectionBizCode = str;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void syncInitPageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abedf5ff", new Object[]{this});
        } else {
            this.mInitPageIndex = this.mCurrentPageIndex;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            List<?> sections;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
                return;
            }
            if (TextUtils.equals(str, "pullRefresh") || TextUtils.equals(str, "coldStart") || TextUtils.equals(str, "editionSwitch") || TextUtils.equals(str, LogContext.ENVENT_USERLOGIN) || TextUtils.equals(str, o78.REFRESH_SOURCE_HOT_START)) {
                IconServiceImpl.access$002(IconServiceImpl.this, 0);
            }
            if (!(IconServiceImpl.access$000(IconServiceImpl.this) != 1 || TextUtils.isEmpty(IconServiceImpl.access$100(IconServiceImpl.this)) || iContainerDataModel == null || iContainerDataModel.getDelta() == null || (sections = iContainerDataModel.getDelta().getSections()) == null || sections.isEmpty())) {
                int size = sections.size();
                for (int i = 0; i < size; i++) {
                    BaseSectionModel baseSectionModel = (BaseSectionModel) sections.get(i);
                    if (TextUtils.equals(baseSectionModel.getSectionBizCode(), IconServiceImpl.access$100(IconServiceImpl.this)) && baseSectionModel.getSubSection() != null && baseSectionModel.getSubSection().size() == 1) {
                        IconServiceImpl.access$002(IconServiceImpl.this, 0);
                    }
                }
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public boolean isPassPopLayerDataAvailable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2e3a299", new Object[]{this, str})).booleanValue();
        }
        Long l = this.mEffectiveTimeMap.get(str);
        if (l == null || l.longValue() <= 0) {
            fve.e(TAG, "effectiveTime <=0");
            return true;
        }
        Long l2 = this.mPassPopLayerTriggerTimeMap.get(str);
        if (l2 != null) {
            return System.currentTimeMillis() - l2.longValue() < l.longValue();
        }
        fve.e(TAG, "passPopLayerDataTime == null");
        return false;
    }
}
