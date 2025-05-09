package com.taobao.infoflow.taobao.subservice.framework.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import tb.c6d;
import tb.cfc;
import tb.cwe;
import tb.dex;
import tb.dyb;
import tb.fve;
import tb.iyb;
import tb.n5a;
import tb.nfc;
import tb.t2o;
import tb.tm4;
import tb.w1e;
import tb.xn4;
import tb.zml;
import tb.zn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DosaContainerDataService implements IContainerDataService<AwesomeGetContainerData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomDataService";
    private final boolean enableAi;
    private boolean enableSyncLoadGateway;
    private tm4 mContainerProcessProvider;
    private nfc mDataService;
    private final iyb mDosaSourceEnvironmentProvider;
    private cfc mInfoFlowContext;
    private boolean mIsAfterBuy;
    private zml mPageInfoDataModel;
    private e mTrigger;
    private final d mTriggerAgency;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements dyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DosaContainerDataService dosaContainerDataService) {
        }

        @Override // tb.dyb
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("11ef60b8", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.e
        public boolean a(String str, String[] strArr, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("718e97e", new Object[]{this, str, strArr, jSONObject})).booleanValue();
            }
            return DosaContainerDataService.access$600(DosaContainerDataService.this, str, strArr, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public iyb f10828a;
        public final d b;
        public boolean c;
        public boolean d = false;

        static {
            t2o.a(491782780);
        }

        public c(d dVar) {
            this.b = dVar;
        }

        public static /* synthetic */ iyb a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (iyb) ipChange.ipc$dispatch("22a11453", new Object[]{cVar});
            }
            return cVar.f10828a;
        }

        public static /* synthetic */ nfc b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nfc) ipChange.ipc$dispatch("6214e747", new Object[]{cVar});
            }
            cVar.getClass();
            return null;
        }

        public static /* synthetic */ d c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5b53e8ca", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ boolean d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2431d0a5", new Object[]{cVar})).booleanValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ boolean e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7d3d1c26", new Object[]{cVar})).booleanValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ boolean f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d64867a7", new Object[]{cVar})).booleanValue();
            }
            cVar.getClass();
            return false;
        }

        public DosaContainerDataService g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DosaContainerDataService) ipChange.ipc$dispatch("c8fae69f", new Object[]{this});
            }
            return new DosaContainerDataService(this, null);
        }

        public c h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9827ed69", new Object[]{this});
            }
            this.c = true;
            return this;
        }

        public c i(iyb iybVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5e6b8601", new Object[]{this, iybVar});
            }
            this.f10828a = iybVar;
            return this;
        }

        public c j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("c9056146", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        boolean a(e eVar, String str, String[] strArr, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
        boolean a(String str, String[] strArr, JSONObject jSONObject);
    }

    static {
        t2o.a(491782777);
        t2o.a(488636637);
    }

    public /* synthetic */ DosaContainerDataService(c cVar, a aVar) {
        this(cVar);
    }

    public static /* synthetic */ boolean access$600(DosaContainerDataService dosaContainerDataService, String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e345969a", new Object[]{dosaContainerDataService, str, strArr, jSONObject})).booleanValue();
        }
        return dosaContainerDataService.customTriggerEvent(str, strArr, jSONObject);
    }

    private boolean customTriggerEvent(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d1a53d9", new Object[]{this, str, strArr, jSONObject})).booleanValue();
        }
        return this.mDataService.f(str, strArr, jSONObject);
    }

    private xn4 getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xn4) ipChange.ipc$dispatch("edb56690", new Object[]{this});
        }
        if (zn4.b(this.mInfoFlowContext.getContainerType().getContainerId())) {
            return new xn4(this.mInfoFlowContext.getContainerType().getContainerId(), this.mInfoFlowContext.getContainerType().getPage(), this.mInfoFlowContext.getContainerType().a());
        }
        return xn4.c(this.mInfoFlowContext.getContainerType().getContainerId());
    }

    private e getTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("350c2b97", new Object[]{this});
        }
        if (this.mTrigger == null) {
            this.mTrigger = new b();
        }
        return this.mTrigger;
    }

    private void initAi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effd81df", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca5d8d", new Object[]{this, aVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.i(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addMTopPreRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7aa018", new Object[]{this, bVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.j(bVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestBizParamsCreator(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3333bc", new Object[]{this, eVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.k(eVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestCommonBizParamsCreator(IContainerDataService.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756ab426", new Object[]{this, fVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestListener(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8184fd39", new Object[]{this, cVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.l(cVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addTriggerEventListener(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6398cc13", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject});
        }
        return this.mDataService.createBaseSectionModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public c6d getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c6d) ipChange.ipc$dispatch("dba2751", new Object[]{this});
        }
        fve.e(TAG, "getPageInfo");
        return this.mPageInfoDataModel;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        if (this.mDataService == null) {
            if (this.mDosaSourceEnvironmentProvider != null) {
                this.mDataService = new cwe(cfcVar.getContainerType().getPage(), this.mDosaSourceEnvironmentProvider, null, true);
            } else if (this.enableSyncLoadGateway) {
                this.mDataService = new cwe(cfcVar.getContainerType().getPage(), new a(this));
            } else {
                this.mDataService = new cwe(cfcVar.getContainerType().getPage(), this.mIsAfterBuy);
            }
        }
        if (this.enableAi) {
            initAi();
        }
        this.mPageInfoDataModel = new zml(this.mDataService);
        this.mContainerProcessProvider = new tm4(cfcVar);
        this.mDataService.b(getContainerType(), this.mContainerProcessProvider);
        this.mDataService.d(getContainerType(), new dex(cfcVar));
        this.mDataService.e(getContainerType(), this.mContainerProcessProvider);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        fve.e(TAG, "onDestroyService");
        this.mDataService.a(getContainerType(), this.mContainerProcessProvider);
        this.mContainerProcessProvider.m();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52179d30", new Object[]{this, aVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.r(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeMTopPreRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c2ae55", new Object[]{this, bVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.s(bVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestBizParamsCreator(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5feced1f", new Object[]{this, eVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.t(eVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestCommonBizParamsCreator(IContainerDataService.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8027109", new Object[]{this, fVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestListener(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f18fdc", new Object[]{this, cVar});
            return;
        }
        tm4 tm4Var = this.mContainerProcessProvider;
        if (tm4Var != null) {
            tm4Var.u(cVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeTriggerEventListener(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f94aef6", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5f4481", new Object[]{this, str, jSONObject})).booleanValue();
        }
        fve.e(TAG, "triggerEvent , event : " + str);
        String[] strArr = {this.mInfoFlowContext.getContainerType().getContainerId()};
        d dVar = this.mTriggerAgency;
        if (dVar != null) {
            return dVar.a(getTrigger(), str, strArr, jSONObject);
        }
        return this.mDataService.f(str, strArr, jSONObject);
    }

    private DosaContainerDataService(c cVar) {
        this.mIsAfterBuy = false;
        this.mDosaSourceEnvironmentProvider = c.a(cVar);
        this.mDataService = c.b(cVar);
        this.mTriggerAgency = c.c(cVar);
        this.enableAi = c.d(cVar);
        this.mIsAfterBuy = c.e(cVar);
        this.enableSyncLoadGateway = c.f(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public AwesomeGetContainerData getContainerData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("7844a110", new Object[]{this});
        }
        fve.e(TAG, "getContainerData");
        return this.mDataService.c(getContainerType());
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc738467", new Object[]{this, str, jSONObject, w1eVar})).booleanValue() : triggerEvent(str, n5a.a(jSONObject, w1eVar));
    }
}
