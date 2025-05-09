package com.taobao.tao.infoflow.commonsubservice.dataservice;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService;
import com.taobao.infoflow.protocol.subservice.biz.IStickyPopService;
import com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a0i;
import tb.c0i;
import tb.c6d;
import tb.cfc;
import tb.f0b;
import tb.fve;
import tb.ged;
import tb.get;
import tb.imn;
import tb.jee;
import tb.m5a;
import tb.n5a;
import tb.p7p;
import tb.phg;
import tb.q2b;
import tb.qfl;
import tb.r30;
import tb.rue;
import tb.s30;
import tb.sve;
import tb.t2o;
import tb.tfu;
import tb.vxm;
import tb.w1e;
import tb.ys6;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeInfoFlowDataService implements IContainerDataService<AwesomeGetContainerData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_REQUEST_TYPE = "requestType";
    private static final String REQUEST_TYPE_ERROR = "unknown";
    private static final String TAG = "HomeInfoFlowDataService";
    private List<IContainerDataService.a> dataProcessListeners;
    private r30 dataProcessUtils;
    private jee dataServiceWindVaneProvider;
    private cfc infoFlowContext;
    private q2b pageInfoDataModel;
    private String recommendType;
    private List<IContainerDataService.e> requestBizParamsCreators;
    private List<IContainerDataService.f> requestCommonBizParamsCreators;
    private List<IContainerDataService.c> requestListeners;
    private s30 subContainerRequestParams;
    private List<IContainerDataService.d> triggerEventListeners;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12430a;
        public final /* synthetic */ IContainerService b;
        public final /* synthetic */ AwesomeGetContainerData c;
        public final /* synthetic */ UiRefreshActionModel d;

        public a(String str, IContainerService iContainerService, AwesomeGetContainerData awesomeGetContainerData, UiRefreshActionModel uiRefreshActionModel) {
            this.f12430a = str;
            this.b = iContainerService;
            this.c = awesomeGetContainerData;
            this.d = uiRefreshActionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.m("dataService_uiRefresh");
            f0b.i().p(this.f12430a, 1);
            this.b.uiRefresh(this.c, this.d);
            f0b.i().c(this.f12430a);
            phg.l("dataService_uiRefresh");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12431a;
        public final /* synthetic */ IContainerService b;
        public final /* synthetic */ AwesomeGetContainerData c;
        public final /* synthetic */ UiRefreshActionModel d;

        public b(String str, IContainerService iContainerService, AwesomeGetContainerData awesomeGetContainerData, UiRefreshActionModel uiRefreshActionModel) {
            this.f12431a = str;
            this.b = iContainerService;
            this.c = awesomeGetContainerData;
            this.d = uiRefreshActionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.m("dataService_scrollToTop");
            f0b.i().p(this.f12431a, 1);
            this.b.uiRefresh(this.c, this.d);
            f0b.i().c(this.f12431a);
            phg.l("dataService_scrollToTop");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDxItemRenderService.b f12432a;

        public c(HomeInfoFlowDataService homeInfoFlowDataService, IDxItemRenderService.b bVar) {
            this.f12432a = bVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                this.f12432a.onSuccess();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ged f12433a;

        public d(ged gedVar) {
            this.f12433a = gedVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f12433a.i();
            }
        }
    }

    static {
        t2o.a(729809390);
        t2o.a(488636637);
    }

    public HomeInfoFlowDataService(String str) {
        this.recommendType = str;
    }

    private void notifyDataOnProcess(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318de009", new Object[]{this, w1eVar, iContainerDataModel, str});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (!(list == null || list.isEmpty())) {
            phg.m("dataService_notifyDataOnProcess");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.a aVar : list) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                aVar.l(w1eVar, iContainerDataModel);
                fve.k(TAG, "notifyDataOnProcess " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(str, "coldStart")) {
                vxm.b.e().a("DataOnProcess", Long.valueOf(elapsedRealtime3));
            }
            fve.e(TAG, "notifyDataOnProcess 总耗时：" + elapsedRealtime3 + " ms");
            phg.l("dataService_notifyDataOnProcess");
        }
    }

    private void notifyDataProcessFinish(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494381db", new Object[]{this, w1eVar, iContainerDataModel, str});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (!(list == null || list.isEmpty())) {
            phg.m("dataService_notifyDataProcessFinish");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.a aVar : list) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                aVar.m(w1eVar, iContainerDataModel);
                fve.k(TAG, "notifyDataProcessFinish " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(str, "coldStart")) {
                vxm.b.e().a("DataProcessFinish", Long.valueOf(elapsedRealtime3));
            }
            fve.e(TAG, "notifyDataProcessFinish 总耗时：" + elapsedRealtime3 + " ms");
            phg.l("dataService_notifyDataProcessFinish");
        }
    }

    private void notifyDataProcessStart(w1e w1eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe6eafd", new Object[]{this, w1eVar, str});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (!(list == null || list.isEmpty())) {
            phg.m("dataService_notifyDataProcessStart");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.a aVar : list) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                aVar.j(w1eVar);
                fve.k(TAG, "notifyDataProcessStart " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(str, "coldStart")) {
                vxm.b.e().a("DataProcessStart", Long.valueOf(elapsedRealtime3));
            }
            fve.e(TAG, "notifyDataProcessStart 总耗时：" + elapsedRealtime3 + " ms");
            phg.l("dataService_notifyDataProcessStart");
        }
    }

    private void notifyRefreshEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ebc030", new Object[]{this});
            return;
        }
        IHostService iHostService = (IHostService) this.infoFlowContext.a(IHostService.class);
        if (iHostService == null) {
            fve.e(TAG, "service == null");
            return;
        }
        ged k = iHostService.getInvokeCallback().k();
        if (k == null) {
            fve.e(TAG, "pullDownRefreshCallback == null");
        } else {
            m5a.a().i(new d(k));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca5d8d", new Object[]{this, aVar});
            return;
        }
        if (this.dataProcessListeners == null) {
            this.dataProcessListeners = new CopyOnWriteArrayList();
        }
        this.dataProcessListeners.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addMTopPreRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7aa018", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestBizParamsCreator(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3333bc", new Object[]{this, eVar});
            return;
        }
        if (this.requestBizParamsCreators == null) {
            this.requestBizParamsCreators = new CopyOnWriteArrayList();
        }
        this.requestBizParamsCreators.add(eVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestCommonBizParamsCreator(IContainerDataService.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756ab426", new Object[]{this, fVar});
            return;
        }
        if (this.requestCommonBizParamsCreators == null) {
            this.requestCommonBizParamsCreators = new CopyOnWriteArrayList();
        }
        this.requestCommonBizParamsCreators.add(fVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestListener(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8184fd39", new Object[]{this, cVar});
            return;
        }
        if (this.requestListeners == null) {
            this.requestListeners = new CopyOnWriteArrayList();
        }
        this.requestListeners.add(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addTriggerEventListener(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6398cc13", new Object[]{this, dVar});
            return;
        }
        if (this.triggerEventListeners == null) {
            this.triggerEventListeners = new CopyOnWriteArrayList();
        }
        this.triggerEventListeners.add(dVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject});
        }
        return new SectionModel(jSONObject);
    }

    public void customDataProcess(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2100b", new Object[]{this, imnVar, jSONObject});
            return;
        }
        w1e c2 = n5a.c(jSONObject);
        String string = jSONObject.getString(KEY_REQUEST_TYPE);
        notifyDataProcessStart(c2, string);
        this.dataProcessUtils.e(imnVar, jSONObject);
        notifyDataOnProcess(c2, imnVar.u(this.infoFlowContext.getContainerType().getContainerId()), string);
        notifyRefreshEnd();
    }

    public void downloadTemplate(List<SectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d87026", new Object[]{this, list, bVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.infoFlowContext.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            phg.m("dataService_downloadTemplate");
            iDxItemRenderService.downloadTemplate(list, new c(this, bVar));
            phg.l("dataService_downloadTemplate");
        }
    }

    public jee getDataServiceWindVaneProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jee) ipChange.ipc$dispatch("b322e93", new Object[]{this});
        }
        return this.dataServiceWindVaneProvider;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public c6d getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c6d) ipChange.ipc$dispatch("dba2751", new Object[]{this});
        }
        return this.pageInfoDataModel;
    }

    public Map<String, String> getRequestCommonBizParams(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7301f469", new Object[]{this, jSONObject});
        }
        HashMap hashMap = null;
        if (jSONObject == null || (string = jSONObject.getString(KEY_REQUEST_TYPE)) == null) {
            return null;
        }
        phg.m("dataService_getRequestCommonBizParams");
        w1e c2 = n5a.c(jSONObject);
        if (c2 == null) {
            c2 = new sve(string + SystemClock.uptimeMillis());
            n5a.a(jSONObject, c2);
        }
        List<IContainerDataService.f> list = this.requestCommonBizParamsCreators;
        if (list != null && list.size() > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.f fVar : this.requestCommonBizParamsCreators) {
                if (fVar != null) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    Map<String, String> a2 = fVar.a(c2, string);
                    if (a2 != null) {
                        hashMap.putAll(a2);
                    }
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(string, "coldStart")) {
                vxm.b.e().a("SubCommonBizParams", Long.valueOf(elapsedRealtime2));
            }
        }
        phg.l("dataService_getRequestCommonBizParams");
        return hashMap;
    }

    public AwesomeGetContainerParams getRequestParams(imn imnVar, JSONObject jSONObject) {
        AwesomeGetContainerParams c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("d30472a6", new Object[]{this, imnVar, jSONObject});
        }
        if (this.subContainerRequestParams.g(imnVar, jSONObject) || (c2 = this.subContainerRequestParams.c(imnVar, jSONObject)) == null) {
            return null;
        }
        phg.m("dataService_getRequestParams");
        w1e c3 = n5a.c(jSONObject);
        if (c3 == null) {
            c3 = new sve(c2.requestType + SystemClock.uptimeMillis());
            n5a.a(jSONObject, c3);
        }
        Map<String, String> createBizParams = createBizParams(c2.requestType, c3);
        JSONObject jSONObject2 = c2.bizParams;
        if (!(jSONObject2 == null || createBizParams == null)) {
            jSONObject2.putAll(createBizParams);
        }
        phg.l("dataService_getRequestParams");
        return c2;
    }

    public String getScrollPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ba2da6d", new Object[]{this});
        }
        IStickyPopService iStickyPopService = (IStickyPopService) this.infoFlowContext.a(IStickyPopService.class);
        if (iStickyPopService == null) {
            return "";
        }
        return iStickyPopService.getScrollPosition();
    }

    public void notifyFeedsForceExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e79812d", new Object[]{this});
            return;
        }
        phg.m("dataService_notifyFeedsForceExposure");
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.forceExposure();
        }
        phg.l("dataService_notifyFeedsForceExposure");
    }

    public void notifyRequestFailure(JSONObject jSONObject, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        w1e c2 = n5a.c(jSONObject);
        List<IContainerDataService.c> list = this.requestListeners;
        if (!(list == null || list.isEmpty())) {
            if (jSONObject == null) {
                str3 = "unknown";
            } else {
                str3 = jSONObject.getString(KEY_REQUEST_TYPE);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.c cVar : list) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cVar.b(c2, str, str2, str3);
                fve.k(TAG, "notifyRequestFailure " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
            }
            fve.k(TAG, "notifyRequestFailure 总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
    }

    public void notifyRequestStart(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        w1e c2 = n5a.c(jSONObject);
        List<IContainerDataService.c> list = this.requestListeners;
        if (!(list == null || list.isEmpty())) {
            phg.m("dataService_notifyRequestStart");
            if (jSONObject == null) {
                str = "unknown";
            } else {
                str = jSONObject.getString(KEY_REQUEST_TYPE);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.c cVar : list) {
                cVar.c(c2, str);
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(str, "coldStart")) {
                vxm.b.e().a("RequestStart", Long.valueOf(elapsedRealtime2));
            }
            phg.l("dataService_notifyRequestStart");
        }
    }

    public void notifyRequestSuccess(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2228dc8", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        w1e c2 = n5a.c(jSONObject);
        List<IContainerDataService.c> list = this.requestListeners;
        if (!(list == null || list.isEmpty())) {
            if (jSONObject == null) {
                str = "unknown";
            } else {
                str = jSONObject.getString(KEY_REQUEST_TYPE);
            }
            if (!(c2 == null || c2.a() == null)) {
                c2.a().put("isStreamRequest", (Object) Boolean.valueOf(p7p.q(str)));
                c2.a().put("isOpenSecondRefreshOpt", (Object) Boolean.valueOf(p7p.k()));
            }
            phg.m("dataService_notifyRequestSuccess");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.c cVar : list) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cVar.a(c2, awesomeGetContainerData, str);
                fve.k(TAG, "notifyRequestSuccess " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(str, "coldStart")) {
                vxm.b.e().a("RequestSuccess", Long.valueOf(elapsedRealtime3));
            }
            fve.k(TAG, "notifyRequestSuccess 总耗时：" + elapsedRealtime3 + " ms");
            phg.l("dataService_notifyRequestSuccess");
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        fve.e(TAG, "onCreateService");
        this.infoFlowContext = cfcVar;
        String containerId = cfcVar.getContainerType().getContainerId();
        this.pageInfoDataModel = new q2b();
        this.subContainerRequestParams = new c0i(containerId);
        this.dataProcessUtils = new a0i(containerId);
        this.dataServiceWindVaneProvider = new ys6(cfcVar);
        rue.b(this.recommendType, this);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        fve.e(TAG, "onDestroyService");
        List<IContainerDataService.c> list = this.requestListeners;
        if (list != null) {
            list.clear();
            this.requestListeners = null;
        }
        List<IContainerDataService.a> list2 = this.dataProcessListeners;
        if (list2 != null) {
            list2.clear();
            this.dataProcessListeners = null;
        }
        List<IContainerDataService.e> list3 = this.requestBizParamsCreators;
        if (list3 != null) {
            list3.clear();
            this.requestBizParamsCreators = null;
        }
        rue.c(this.recommendType);
    }

    public void preLoadTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b489a7", new Object[]{this});
            return;
        }
        IThemeService iThemeService = (IThemeService) this.infoFlowContext.a(IThemeService.class);
        if (iThemeService != null) {
            iThemeService.preCreateTheme();
        }
    }

    public void preRenderItem(Context context, SectionModel sectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34ba7", new Object[]{this, context, sectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        IItemRenderService iItemRenderService = (IItemRenderService) this.infoFlowContext.a(IItemRenderService.class);
        if (iItemRenderService != null) {
            iItemRenderService.getItemRenderPresenter(this.infoFlowContext).preRender(context, sectionModel, z, i);
        }
        IPrefetchImageService iPrefetchImageService = (IPrefetchImageService) this.infoFlowContext.a(IPrefetchImageService.class);
        if (iPrefetchImageService != null) {
            iPrefetchImageService.prefetchImage(sectionModel, z, i);
        }
    }

    public void processUiRefresh(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e5acc7", new Object[]{this, imnVar, jSONObject});
            return;
        }
        w1e c2 = n5a.c(jSONObject);
        IContainerService iContainerService = (IContainerService) this.infoFlowContext.a(IContainerService.class);
        if (iContainerService == null) {
            fve.e(TAG, "containerService is null");
            return;
        }
        UiRefreshActionModel uiRefreshActionModel = (UiRefreshActionModel) JSON.toJavaObject(jSONObject, UiRefreshActionModel.class);
        String string = jSONObject.getString("containerId");
        if (TextUtils.isEmpty(string)) {
            string = this.infoFlowContext.getContainerType().getContainerId();
        }
        AwesomeGetContainerData u = imnVar.u(string);
        uiRefreshActionModel.containerModel = u;
        String str = "HomeInfoFlow_uiRefresh_" + jSONObject.getString(KEY_REQUEST_TYPE);
        if (!TextUtils.equals("scrollToTop", uiRefreshActionModel.getUiOperationType())) {
            get.a().h(new a(str, iContainerService, u, uiRefreshActionModel));
            notifyDataProcessFinish(c2, u, uiRefreshActionModel.requestType);
        } else if (qfl.a(this.infoFlowContext, c2)) {
            get.a().h(new b(str, iContainerService, u, uiRefreshActionModel));
        }
    }

    public void registerFirstPageUrls(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72a6c94", new Object[]{this, iContainerInnerDataModel});
            return;
        }
        ImageMonitorService imageMonitorService = (ImageMonitorService) this.infoFlowContext.a(ImageMonitorService.class);
        if (imageMonitorService != null) {
            imageMonitorService.registerFirstPageUrls(iContainerInnerDataModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52179d30", new Object[]{this, aVar});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeMTopPreRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c2ae55", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestBizParamsCreator(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5feced1f", new Object[]{this, eVar});
            return;
        }
        List<IContainerDataService.e> list = this.requestBizParamsCreators;
        if (list != null) {
            list.remove(eVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestCommonBizParamsCreator(IContainerDataService.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8027109", new Object[]{this, fVar});
            return;
        }
        List<IContainerDataService.f> list = this.requestCommonBizParamsCreators;
        if (list != null) {
            list.remove(fVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestListener(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f18fdc", new Object[]{this, cVar});
            return;
        }
        List<IContainerDataService.c> list = this.requestListeners;
        if (list != null) {
            list.remove(cVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeTriggerEventListener(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f94aef6", new Object[]{this, dVar});
            return;
        }
        List<IContainerDataService.d> list = this.triggerEventListeners;
        if (list != null) {
            list.remove(dVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5f4481", new Object[]{this, str, jSONObject})).booleanValue();
        }
        List<IContainerDataService.d> list = this.triggerEventListeners;
        if (list != null && list.size() > 0) {
            for (IContainerDataService.d dVar : list) {
                dVar.a(str, jSONObject);
            }
        }
        return tfu.b(str, jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public AwesomeGetContainerData getContainerData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("247ef536", new Object[]{this});
        }
        imn c2 = zza.c();
        if (c2 == null) {
            return null;
        }
        return c2.u(this.infoFlowContext.getContainerType().getContainerId());
    }

    public boolean isAnimeConfigValidate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3c6397", new Object[]{this, str})).booleanValue();
        }
        IIconBackGuideAnimeService iIconBackGuideAnimeService = (IIconBackGuideAnimeService) this.infoFlowContext.a(IIconBackGuideAnimeService.class);
        if (iIconBackGuideAnimeService == null) {
            return false;
        }
        return iIconBackGuideAnimeService.isAnimeConfigValidate(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc738467", new Object[]{this, str, jSONObject, w1eVar})).booleanValue() : triggerEvent(str, n5a.a(jSONObject, w1eVar));
    }

    private Map<String, String> createBizParams(String str, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af2bc7c7", new Object[]{this, str, w1eVar});
        }
        List<IContainerDataService.e> list = this.requestBizParamsCreators;
        if (list == null || list.isEmpty()) {
            fve.e(TAG, "bizParamsCreators is empty");
            return null;
        }
        HashMap hashMap = new HashMap(2);
        phg.m("dataService_createBizParams");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.e eVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Map<String, String> a2 = eVar.a(w1eVar, str);
            fve.k(TAG, "createBizParams " + eVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
            if (a2 != null) {
                hashMap.putAll(a2);
            }
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(str, "coldStart")) {
            vxm.b.e().a("SubBizParams", Long.valueOf(elapsedRealtime3));
        }
        fve.e(TAG, "createBizParams 总耗时：" + elapsedRealtime3 + " ms");
        phg.l("dataService_createBizParams");
        return hashMap;
    }
}
