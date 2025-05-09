package com.taobao.tao.infoflow.commonsubservice.recbot;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IRecbotService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.commonsubservice.recbot.impl.RecbotMtopListener;
import com.taobao.tao.infoflow.commonsubservice.recbot.impl.RecbotResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.cfc;
import tb.d38;
import tb.fve;
import tb.get;
import tb.hji;
import tb.msc;
import tb.r5a;
import tb.t2o;
import tb.u6h;
import tb.vii;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecbotServiceImpl implements IRecbotService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecbotServiceImpl";
    public String adjustSuccessTip;
    private IContainerDataService containerDataService;
    private int delayHideLoadingTime;
    private transient d38 dxRecbotViewWidget;
    public boolean isRevertOpera;
    private vii loadingView;
    private IMainFeedsViewService mainFeedsViewService;
    private IMainLifecycleService mainLifecycleService;
    private IContainerDataService.c onRequestListener;
    private RecbotMtopListener recbotMtopListener;
    private String recbotSource;
    public String recbotTransmitParams;
    private IContainerDataService.e requestBizParamsCreator;
    private ViewGroup rootView;
    private AtomicBoolean showRecbotViewStatus = new AtomicBoolean(false);
    private volatile boolean isRecbotRequesting = false;
    private msc normalCallback = new d(this);
    private Runnable hideLoadingViewRunnable = new e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (TextUtils.equals(str, "recbotRefresh")) {
                RecbotServiceImpl.access$000(RecbotServiceImpl.this);
                RecbotServiceImpl recbotServiceImpl = RecbotServiceImpl.this;
                recbotServiceImpl.requestUT(recbotServiceImpl.isRevertOpera, true, true);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            } else if (TextUtils.equals(str3, "recbotRefresh")) {
                RecbotServiceImpl recbotServiceImpl = RecbotServiceImpl.this;
                recbotServiceImpl.requestUT(recbotServiceImpl.isRevertOpera, false, true);
                RecbotServiceImpl.this.errorHandle(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            if (!TextUtils.equals(str, "recbotRefresh")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("recbotAfterChat", "true");
            hashMap.put("recbotSource", RecbotServiceImpl.access$100(RecbotServiceImpl.this));
            hashMap.put("recbotTransmitParams", RecbotServiceImpl.this.recbotTransmitParams);
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                RecbotServiceImpl.this.hideRecbotView();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(RecbotServiceImpl recbotServiceImpl) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (RecbotServiceImpl.access$200(RecbotServiceImpl.this) != null) {
                RecbotServiceImpl.access$200(RecbotServiceImpl.this).setCancelRecbotAdjust(true);
            }
            RecbotServiceImpl.this.errorHandle(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12438a;

        public f(String str) {
            this.f12438a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hji.a().b(this.f12438a, RecbotServiceImpl.access$300(RecbotServiceImpl.this));
            if (RecbotServiceImpl.access$400(RecbotServiceImpl.this) != null) {
                RecbotServiceImpl.access$400(RecbotServiceImpl.this).b(RecbotServiceImpl.access$300(RecbotServiceImpl.this));
            }
            RecbotServiceImpl.access$502(RecbotServiceImpl.this, false);
        }
    }

    static {
        t2o.a(729809405);
        t2o.a(488636598);
    }

    public static /* synthetic */ void access$000(RecbotServiceImpl recbotServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5b2908", new Object[]{recbotServiceImpl});
        } else {
            recbotServiceImpl.successHandler();
        }
    }

    public static /* synthetic */ String access$100(RecbotServiceImpl recbotServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("632f8559", new Object[]{recbotServiceImpl});
        }
        return recbotServiceImpl.recbotSource;
    }

    public static /* synthetic */ RecbotMtopListener access$200(RecbotServiceImpl recbotServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecbotMtopListener) ipChange.ipc$dispatch("739d0391", new Object[]{recbotServiceImpl});
        }
        return recbotServiceImpl.recbotMtopListener;
    }

    public static /* synthetic */ msc access$300(RecbotServiceImpl recbotServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (msc) ipChange.ipc$dispatch("64bc44ed", new Object[]{recbotServiceImpl});
        }
        return recbotServiceImpl.normalCallback;
    }

    public static /* synthetic */ vii access$400(RecbotServiceImpl recbotServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vii) ipChange.ipc$dispatch("2400250e", new Object[]{recbotServiceImpl});
        }
        return recbotServiceImpl.loadingView;
    }

    public static /* synthetic */ boolean access$502(RecbotServiceImpl recbotServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c894e97", new Object[]{recbotServiceImpl, new Boolean(z)})).booleanValue();
        }
        recbotServiceImpl.isRecbotRequesting = z;
        return z;
    }

    private IContainerDataService.e createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new b();
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    private void getRootView() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3215a24", new Object[]{this});
        } else if (this.rootView == null && (iMainFeedsViewService = this.mainFeedsViewService) != null && iMainFeedsViewService.getOriginalView() != null && (this.mainFeedsViewService.getOriginalView().getParent() instanceof ViewGroup)) {
            this.rootView = (ViewGroup) this.mainFeedsViewService.getOriginalView().getParent();
        }
    }

    private void hideLoadingDialogAndToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa250143", new Object[]{this, str});
            return;
        }
        get.a().k(this.hideLoadingViewRunnable);
        get.a().h(new f(str));
    }

    private void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
        } else if (this.rootView != null) {
            this.loadingView = vii.a();
            u6h a2 = u6h.a();
            if (this.isRevertOpera) {
                a2.f29179a = "还原中...";
            } else {
                a2.f29179a = "调整中...";
            }
            a2.b = "SHADOW";
            if (this.rootView.getContext() instanceof Activity) {
                this.loadingView.c((Activity) this.rootView.getContext(), a2, this.normalCallback);
            }
        }
    }

    private void successHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f17ece", new Object[]{this});
            return;
        }
        String str = this.adjustSuccessTip;
        if (TextUtils.isEmpty(str)) {
            if (this.isRevertOpera) {
                str = "还原成功";
            } else {
                str = "调整成功";
            }
        }
        hideLoadingDialogAndToast(str);
    }

    public void errorHandle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998b24e1", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (this.isRevertOpera) {
                str = "还原失败，请重试";
            } else {
                str = "抱歉，没找到符合的商品";
            }
        }
        hideLoadingDialogAndToast(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRecbotService
    public void hideRecbotView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5360aae5", new Object[]{this});
        } else if (this.showRecbotViewStatus.get()) {
            this.showRecbotViewStatus.set(false);
            d38 d38Var = this.dxRecbotViewWidget;
            if (d38Var != null) {
                d38Var.k();
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRecbotService
    public boolean isRecbotRequesting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd0bdd5f", new Object[]{this})).booleanValue();
        }
        return this.isRecbotRequesting;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.containerDataService = iContainerDataService;
        if (iContainerDataService != null) {
            IContainerDataService.c createRequestListener = createRequestListener();
            this.onRequestListener = createRequestListener;
            iContainerDataService.addRequestListener(createRequestListener);
            IContainerDataService iContainerDataService2 = this.containerDataService;
            IContainerDataService.e createRequestBizParamsCreator = createRequestBizParamsCreator();
            this.requestBizParamsCreator = createRequestBizParamsCreator;
            iContainerDataService2.addRequestBizParamsCreator(createRequestBizParamsCreator);
            IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
            this.mainLifecycleService = iMainLifecycleService;
            if (iMainLifecycleService != null) {
                this.mainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
                this.dxRecbotViewWidget = new d38(cfcVar);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = this.containerDataService;
        if (iContainerDataService != null) {
            IContainerDataService.c cVar = this.onRequestListener;
            if (cVar != null) {
                iContainerDataService.removeRequestListener(cVar);
            }
            IContainerDataService.e eVar = this.requestBizParamsCreator;
            if (eVar != null) {
                this.containerDataService.removeRequestBizParamsCreator(eVar);
            }
            this.containerDataService = null;
        }
        this.mainLifecycleService = null;
        this.mainFeedsViewService = null;
        this.dxRecbotViewWidget = null;
        this.rootView = null;
        this.loadingView = null;
    }

    public void requestUT(boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c2153f", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z3) {
            str = "infoflow_result";
        } else {
            str = "inferential_model";
        }
        if (z) {
            if (z2) {
                str2 = "RecBot_restore_success";
            } else {
                str2 = "RecBot_restore_fail";
            }
        } else if (z2) {
            str2 = "RecBot_adjust_success";
        } else {
            str2 = "RecBot_adjust_fail";
        }
        r5a.j("Page_Home", 19999, str2, str, null, null);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRecbotService
    public void adjustStart(String str, boolean z, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd555a", new Object[]{this, str, new Boolean(z), str2, new Boolean(z2)});
        } else if (TextUtils.isEmpty(str)) {
            fve.e(TAG, "query is empty");
        } else {
            this.isRevertOpera = z;
            showLoadingView();
            RecbotMtopListener recbotMtopListener = this.recbotMtopListener;
            if (recbotMtopListener != null) {
                recbotMtopListener.setCancelRecbotAdjust(true);
            }
            RemoteBusiness build = RemoteBusiness.build(createRecbotRequest(str, str2, z2), TaoHelper.getTTID());
            build.reqMethod(MethodEnum.POST);
            RecbotMtopListener recbotMtopListener2 = new RecbotMtopListener(this);
            this.recbotMtopListener = recbotMtopListener2;
            build.registerListener((IRemoteListener) recbotMtopListener2).startRequest(RecbotResponse.class);
            this.isRecbotRequesting = true;
            hideRecbotView();
            get a2 = get.a();
            Runnable runnable = this.hideLoadingViewRunnable;
            int i = this.delayHideLoadingTime;
            a2.f(runnable, i <= 0 ? 10000L : i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRecbotService
    public void showRecbotView(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea33106", new Object[]{this, str, jSONObject});
            return;
        }
        getRootView();
        if (this.showRecbotViewStatus.get()) {
            fve.e(TAG, "recbotView showing");
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("sectionBizCode");
            if (!TextUtils.isEmpty(string)) {
                JSONObject recbotSection = getRecbotSection(string);
                if (TextUtils.isEmpty(str)) {
                    fve.e(TAG, "recbotSource is empty");
                    return;
                }
                this.showRecbotViewStatus.set(true);
                if (recbotSection == null || recbotSection.isEmpty()) {
                    fve.e(TAG, "recbotSection is empty");
                    return;
                }
                JSONObject jSONObject3 = recbotSection.getJSONObject("ext");
                if (jSONObject3 != null) {
                    this.delayHideLoadingTime = jSONObject3.getIntValue("delayHideLoadingTime");
                }
                this.recbotSource = str;
                d38 d38Var = this.dxRecbotViewWidget;
                if (d38Var != null) {
                    d38Var.m(Global.getApplication(), new SectionModel(recbotSection), new c());
                }
            }
        }
    }

    private MtopRequest createRecbotRequest(String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("ef1acc08", new Object[]{this, str, str2, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("query", (Object) str);
        jSONObject.put("itemId", (Object) str2);
        if (z) {
            str3 = BizTaskData.MANUAL_TIME;
        } else {
            str3 = "click";
        }
        jSONObject.put("method", (Object) str3);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.setVersion("1.0");
        mtopRequest.setApiName("mtop.taobao.wireless.feeds.recommend.chat");
        return mtopRequest;
    }

    private JSONObject getRecbotSection(String str) {
        IContainerDataModel containerData;
        List totalData;
        BaseSubSectionModel subSection;
        BaseSectionModel overlay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e7d93a9", new Object[]{this, str});
        }
        IContainerDataService iContainerDataService = this.containerDataService;
        if (!(iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (totalData = containerData.getTotalData()) == null || totalData.isEmpty())) {
            int size = totalData.size();
            for (int i = 0; i < size; i++) {
                BaseSectionModel baseSectionModel = (BaseSectionModel) totalData.get(i);
                if (!(baseSectionModel == null || !TextUtils.equals(baseSectionModel.getSectionBizCode(), str) || (subSection = baseSectionModel.getSubSection()) == null || (overlay = subSection.getOverlay()) == null)) {
                    return overlay.getJSONObject("recbotSection");
                }
            }
        }
        return null;
    }
}
