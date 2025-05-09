package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model.OutLinkWithReqModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wyo implements o4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f31018a;
    public Map<String, String> b;
    public w1e c;
    public IContainerDataService.a d;
    public IContainerDataService.c e;
    public IContainerDataService.e f;
    public boolean g = true;
    public boolean h = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
            if (!TextUtils.equals(str, Constant.KEY_PAGEBACK) && !TextUtils.equals(str, "coldStart")) {
                return null;
            }
            wyo.b(wyo.this, w1eVar);
            Map<String, String> c = wyo.c(wyo.this);
            wyo.d(wyo.this, null);
            wyo.e(wyo.this);
            if (c != null && !wyo.this.s()) {
                String str2 = c.get("up_nids");
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "infoflow_outlink_request", str2, str, null);
                if (!TextUtils.isEmpty(str2)) {
                    JSONObject a2 = w1eVar.a();
                    if (a2 == null) {
                        a2 = new JSONObject();
                    }
                    a2.put("outLinkRestoreRequest", (Object) str2);
                }
            }
            return c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IContainerDataModel f31021a;

            public a(IContainerDataModel iContainerDataModel) {
                this.f31021a = iContainerDataModel;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    wyo.g(wyo.this, this.f31021a);
                }
            }
        }

        static {
            t2o.a(486539570);
            t2o.a(488636639);
        }

        public c() {
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
            wyo.this.g = f4b.b("enableOutLinkBugfix", true);
            if (wyo.f(wyo.this, w1eVar)) {
                get.a().h(new a(iContainerDataModel));
            } else if (wyo.h(wyo.this, iContainerDataModel)) {
                wyo wyoVar = wyo.this;
                if (!wyoVar.g) {
                    wyo.i(wyoVar);
                }
            }
        }

        public /* synthetic */ c(wyo wyoVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(486539567);
        t2o.a(486539561);
    }

    public wyo(cfc cfcVar) {
        this.f31018a = cfcVar;
        p();
    }

    public static /* synthetic */ w1e b(wyo wyoVar, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1e) ipChange.ipc$dispatch("3add3c90", new Object[]{wyoVar, w1eVar});
        }
        wyoVar.c = w1eVar;
        return w1eVar;
    }

    public static /* synthetic */ Map c(wyo wyoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9a50e854", new Object[]{wyoVar});
        }
        return wyoVar.b;
    }

    public static /* synthetic */ Map d(wyo wyoVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c2231b9", new Object[]{wyoVar, map});
        }
        wyoVar.b = map;
        return map;
    }

    public static /* synthetic */ void e(wyo wyoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a900b60", new Object[]{wyoVar});
        } else {
            wyoVar.u();
        }
    }

    public static /* synthetic */ boolean f(wyo wyoVar, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb96e03", new Object[]{wyoVar, w1eVar})).booleanValue();
        }
        return wyoVar.t(w1eVar);
    }

    public static /* synthetic */ void g(wyo wyoVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ec9a99", new Object[]{wyoVar, iContainerDataModel});
        } else {
            wyoVar.v(iContainerDataModel);
        }
    }

    public static /* synthetic */ boolean h(wyo wyoVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("220044fc", new Object[]{wyoVar, iContainerDataModel})).booleanValue();
        }
        return wyoVar.q(iContainerDataModel);
    }

    public static /* synthetic */ void i(wyo wyoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ae9764", new Object[]{wyoVar});
        } else {
            wyoVar.x();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a057cc6", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ScrollToItemWithRequest", "abandonData dataService is null");
            return;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("ScrollToItemWithRequest", "containerData is null");
            return;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            fve.e("ScrollToItemWithRequest", "baseData is null");
        } else {
            base.abandonData("outPushPlanId");
        }
    }

    @Override // tb.o4d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        y();
        if (this.f != null) {
            u();
        }
    }

    @Override // tb.o4d
    public w1e getScrolledToItemTraceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1e) ipChange.ipc$dispatch("80d15e7a", new Object[]{this});
        }
        return this.c;
    }

    public final void j(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3333bc", new Object[]{this, eVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ScrollToItemWithRequest", "addRequestBizParamsCreator dataService is null");
        } else {
            iContainerDataService.addRequestBizParamsCreator(eVar);
        }
    }

    public final IContainerDataService.a k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new c(this, null);
    }

    public final IContainerDataService.e l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new b();
    }

    public final IContainerDataService.c m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a(this);
    }

    public final Map<String, String> o(String str, Intent intent) {
        OutLinkWithReqModel outLinkWithReqModel;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5daa59b5", new Object[]{this, str, intent});
        }
        try {
            outLinkWithReqModel = (OutLinkWithReqModel) JSON.parseObject(str, OutLinkWithReqModel.class);
        } catch (Exception e) {
            fve.e("ScrollToItemWithRequest", "外链数据模型解析出错: " + e);
            outLinkWithReqModel = null;
        }
        if (outLinkWithReqModel == null) {
            return null;
        }
        Map<String, String> bizParams = outLinkWithReqModel.getBizParams();
        if (!(intent == null || intent.getData() == null || (queryParameter = intent.getData().getQueryParameter("mediafrom")) == null)) {
            bizParams.put("mediafrom", queryParameter);
        }
        return bizParams;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ScrollToItemWithRequest", "数据服务为空");
            return;
        }
        IContainerDataService.a k = k();
        this.d = k;
        iContainerDataService.addDataProcessListener(k);
        IContainerDataService.c m = m();
        this.e = m;
        iContainerDataService.addRequestListener(m);
    }

    public final boolean q(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a1be04", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (this.b == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null || iContainerDataModel.getBase().getPageParams().getPageNum() != 0) {
            return false;
        }
        return true;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d96a47b6", new Object[]{this})).booleanValue();
        }
        boolean z = this.h;
        this.h = false;
        return z;
    }

    public final boolean t(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2024ac", new Object[]{this, w1eVar})).booleanValue();
        }
        w1e w1eVar2 = this.c;
        if (w1eVar2 == null || w1eVar == null || !w1eVar2.b().equals(w1eVar.b())) {
            return false;
        }
        return true;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6addde85", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ScrollToItemWithRequest", "removeRequestBizParamsCreator dataService is null");
            return;
        }
        iContainerDataService.removeRequestBizParamsCreator(this.f);
        this.f = null;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1707f3bb", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ScrollToItemWithRequest", "onPullRefresh dataService == null");
            return;
        }
        iContainerDataService.triggerEvent("ColdStart", null, new sve("ColdStart" + SystemClock.uptimeMillis()));
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1887d3", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ScrollToItemWithRequest", "onPullRefresh dataService == null");
            return;
        }
        a();
        iContainerDataService.triggerEvent("PageBack", null, new sve("PageBack" + SystemClock.uptimeMillis()));
    }

    public final void y() {
        IContainerDataService.c cVar;
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31018a.a(IContainerDataService.class);
        if (!(iContainerDataService == null || (aVar = this.d) == null)) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
        if (iContainerDataService != null && (cVar = this.e) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(wyo wyoVar) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
                return;
            }
            JSONObject a2 = w1eVar.a();
            if (a2 != null && !TextUtils.isEmpty(a2.getString("outLinkRestoreRequest"))) {
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "infoflow_outlink_response_error", str3, null, null);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(tb.w1e r11, com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel<?> r12, java.lang.String r13) {
            /*
                r10 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = tb.wyo.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x001b
                java.lang.String r3 = "b7da8ef0"
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r10
                r4[r0] = r11
                r11 = 2
                r4[r11] = r12
                r11 = 3
                r4[r11] = r13
                r2.ipc$dispatch(r3, r4)
                return
            L_0x001b:
                if (r12 != 0) goto L_0x001e
                return
            L_0x001e:
                com.alibaba.fastjson.JSONObject r11 = r11.a()
                if (r11 != 0) goto L_0x0025
                return
            L_0x0025:
                java.lang.String r2 = "outLinkRestoreRequest"
                java.lang.String r11 = r11.getString(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r11)
                if (r2 == 0) goto L_0x0033
                return
            L_0x0033:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r12 = r12.getBase()
                if (r12 == 0) goto L_0x0042
                java.util.List r2 = r12.getSections()
            L_0x0042:
                if (r2 != 0) goto L_0x0045
                return
            L_0x0045:
                int r12 = r2.size()
                r3 = 0
                r4 = r3
            L_0x004b:
                r5 = -1
                if (r1 >= r12) goto L_0x0078
                java.lang.Object r6 = r2.get(r1)
                boolean r7 = r6 instanceof com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
                if (r7 != 0) goto L_0x0057
                goto L_0x0076
            L_0x0057:
                r4 = r6
                com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel r4 = (com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel) r4
                com.alibaba.fastjson.JSONObject r6 = r4.getExt()
                if (r6 != 0) goto L_0x0061
                goto L_0x0076
            L_0x0061:
                java.lang.String r7 = "x_exposed"
                java.lang.String r6 = r6.getString(r7)
                boolean r7 = android.text.TextUtils.isEmpty(r6)
                if (r7 == 0) goto L_0x006f
                goto L_0x0076
            L_0x006f:
                boolean r6 = r6.contains(r11)
                if (r6 == 0) goto L_0x0076
                goto L_0x0079
            L_0x0076:
                int r1 = r1 + r0
                goto L_0x004b
            L_0x0078:
                r1 = -1
            L_0x0079:
                if (r1 != r5) goto L_0x0099
                if (r4 == 0) goto L_0x0099
                java.lang.String r12 = tb.wsn.c(r4)
                boolean r0 = android.text.TextUtils.isEmpty(r12)
                if (r0 != 0) goto L_0x0099
                com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
                r0.<init>()
                java.lang.String r2 = "pvid"
                r0.put(r2, r12)
                java.lang.String r12 = "upNids"
                r0.put(r12, r11)
                goto L_0x009a
            L_0x0099:
                r0 = r3
            L_0x009a:
                if (r0 == 0) goto L_0x00a0
                java.lang.String r3 = r0.toString()
            L_0x00a0:
                r9 = r3
                java.lang.String r6 = "infoflow_outlink_response"
                java.lang.String r7 = java.lang.String.valueOf(r1)
                java.lang.String r4 = "Page_Home"
                r5 = 19998(0x4e1e, float:2.8023E-41)
                r8 = r13
                tb.uve.a(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.wyo.a.a(tb.w1e, com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel, java.lang.String):void");
        }
    }

    public final int n(IContainerDataModel iContainerDataModel, IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2aa4bd0b", new Object[]{this, iContainerDataModel, iMainFeedsViewService})).intValue();
        }
        if (iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getExt() == null) {
            fve.e("ScrollToItemWithRequest", "base数据为空或者 ext数据为空");
            return 0;
        }
        JSONObject jSONObject = iContainerDataModel.getBase().getExt().getJSONObject("anchor");
        if (jSONObject != null) {
            return iMainFeedsViewService.getPositionBySectionBizCode(jSONObject.getString("outputLink"));
        }
        fve.e("ScrollToItemWithRequest", "锚点信息为空");
        return 0;
    }

    public final boolean r(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ab4b002", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            fve.e("ScrollToItemWithRequest", "intent为空");
            return false;
        }
        Uri data = intent.getData();
        if (data == null) {
            fve.e("ScrollToItemWithRequest", "intent携带的参数为空");
            return false;
        }
        try {
            return Boolean.parseBoolean(data.getQueryParameter("forceRefresh"));
        } catch (Exception unused) {
            fve.e("ScrollToItemWithRequest", "解析 forceRefresh失败");
            return false;
        }
    }

    public final void v(IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad69f99", new Object[]{this, iContainerDataModel});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f31018a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            fve.e("ScrollToItemWithRequest", "feeds服务为空");
            return;
        }
        int n = n(iContainerDataModel, iMainFeedsViewService);
        fve.e("ScrollToItemWithRequest", "anchorPosition：" + n);
        if (n != 0) {
            iMainFeedsViewService.scrollToPositionWithOffset(n, 0);
        }
        tfl.b(tfl.OUT_LINK_PROCESS_END, tfl.SCROLL_TO_RECOMMEND_WITH_REQUEST);
    }

    @Override // tb.o4d
    public void onOutLinkTrigger(String str, Intent intent) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
            return;
        }
        tfl.b(tfl.OUT_LINK_PROCESS_START, tfl.SCROLL_TO_RECOMMEND_WITH_REQUEST);
        if (!r(intent)) {
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "Page_HomePage_PageControl_perform_onRefresh_NewFace", "no forceRefresh", null, str);
            fve.e("ScrollToItemWithRequest", "非强制刷新");
            return;
        }
        Map<String, String> o = o(str, intent);
        this.b = o;
        if (o == null) {
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "Page_HomePage_PageControl_perform_onRefresh_NewFace", "outLink Params is null", null, null);
            fve.e("ScrollToItemWithRequest", "BizParam为空");
            return;
        }
        String str3 = o.get("forceRecallParams");
        boolean a2 = mve.a("disableOutLinkPreviewDelay", false);
        if (str3 != null && !a2) {
            this.h = true;
        }
        if (this.f == null) {
            fve.e("ScrollToItemWithRequest", "bizParamsCreator为空，创建RequestBizParamsCreator");
            IContainerDataService.e l = l();
            this.f = l;
            j(l);
        }
        a();
        boolean b2 = f4b.b("enableOutLinkBugfix", true);
        this.g = b2;
        if (this.b == null || !b2) {
            str2 = "undefined";
        } else if (bve.h) {
            bve.h = false;
            w();
            str2 = "ColdStart";
        } else {
            x();
            str2 = "PageBack";
        }
        uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "Page_HomePage_PageControl_perform_NewFace", "onOutLinkTriggerFinish", str2, str);
    }
}
