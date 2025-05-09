package com.taobao.infoflow.taobao.subservice.biz.afterbuy.orderlistprefetchservice;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.Map;
import tb.ael;
import tb.arb;
import tb.cfc;
import tb.cw6;
import tb.ejb;
import tb.f4b;
import tb.fve;
import tb.get;
import tb.j4d;
import tb.mve;
import tb.n2c;
import tb.ndl;
import tb.t2o;
import tb.w1e;
import tb.xn4;
import tb.xue;
import tb.z4a;
import tb.zdl;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OrderListPrefetchServiceImpl implements IOrderListPrefetchService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OrderListPrefetchService";
    private ejb mBizInvoker;
    private IContainerDataService<?> mContainerDataService;
    private n2c mEngineInvoker;
    private cfc mInfoFlowContext;
    private xue mInfoFlowEngine;
    private IContainerDataService.c mOnRequestListener;
    private j4d mOrderPreRequestInvoker;
    private zxd mTabLifeCycleListener;
    private boolean mHasSwitchTab = false;
    private boolean mNeedPrefetchData = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IBizDataModel f10716a;

        public a(IBizDataModel iBizDataModel) {
            this.f10716a = iBizDataModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zdl.e(this.f10716a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements zxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zxd
        public void onPageScrolled(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            }
        }

        @Override // tb.zxd
        public void onPageSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90abdd0", new Object[]{this});
                return;
            }
            OrderListPrefetchServiceImpl.access$002(OrderListPrefetchServiceImpl.this, true);
            OrderListPrefetchServiceImpl.access$102(OrderListPrefetchServiceImpl.this, true);
        }

        @Override // tb.zxd
        public void onPageUnSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (TextUtils.equals(str, "pageEnter")) {
                OrderListPrefetchServiceImpl.access$200(OrderListPrefetchServiceImpl.this);
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
        t2o.a(491782256);
        t2o.a(488636632);
    }

    public static /* synthetic */ boolean access$002(OrderListPrefetchServiceImpl orderListPrefetchServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1790192f", new Object[]{orderListPrefetchServiceImpl, new Boolean(z)})).booleanValue();
        }
        orderListPrefetchServiceImpl.mHasSwitchTab = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(OrderListPrefetchServiceImpl orderListPrefetchServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d339474e", new Object[]{orderListPrefetchServiceImpl, new Boolean(z)})).booleanValue();
        }
        orderListPrefetchServiceImpl.mNeedPrefetchData = z;
        return z;
    }

    public static /* synthetic */ void access$200(OrderListPrefetchServiceImpl orderListPrefetchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb71da49", new Object[]{orderListPrefetchServiceImpl});
        } else {
            orderListPrefetchServiceImpl.checkAndStartPrefetch();
        }
    }

    private void checkAndStartPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c3dc91", new Object[]{this});
        } else if (!isPrefetchDisable()) {
            this.mNeedPrefetchData = false;
            initInfoFlowEngine(xn4.REC_ORDER_LIST);
            j4d j4dVar = this.mOrderPreRequestInvoker;
            if (j4dVar != null) {
                j4dVar.realOrderListPrefetch();
            }
        }
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new c();
    }

    private zxd createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxd) ipChange.ipc$dispatch("34d67fe5", new Object[]{this});
        }
        return new b();
    }

    private void initInfoFlowEngine(arb arbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6a52c3", new Object[]{this, arbVar});
        } else if (arbVar != null) {
            fve.e(TAG, "initInfoFlowEngine");
            xue c2 = new xue.b(arbVar).d(new ndl(arbVar)).c();
            this.mInfoFlowEngine = c2;
            n2c b2 = c2.b();
            this.mEngineInvoker = b2;
            ejb b3 = b2.b();
            this.mBizInvoker = b3;
            this.mOrderPreRequestInvoker = b3.getOrderPreRequestInvoker();
        }
    }

    private boolean isPrefetchDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96b0cf72", new Object[]{this})).booleanValue();
        }
        if (!f4b.b("disable_order_list_prefetch", false) && !Localization.o()) {
            return !this.mNeedPrefetchData;
        }
        return true;
    }

    private void registerRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
            return;
        }
        this.mOnRequestListener = createRequestListener();
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService == null) {
            fve.e(TAG, "IContainerDataService is null");
        } else {
            iContainerDataService.addRequestListener(this.mOnRequestListener);
        }
    }

    private void registerTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a213e9", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            this.mTabLifeCycleListener = createTabLifeCycle();
            iMainLifecycleService.getTabLifeCycleRegister().a(this.mTabLifeCycleListener);
        }
    }

    private void unRegisterRequestListener() {
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService.c cVar = this.mOnRequestListener;
        if (cVar != null && (iContainerDataService = this.mContainerDataService) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    private void unRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913ac7d0", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && this.mTabLifeCycleListener != null) {
            iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycleListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService
    public IBizDataModel getPrefetchDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBizDataModel) ipChange.ipc$dispatch("fe714c36", new Object[]{this});
        }
        return zdl.d();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService
    public boolean hasSwitchTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61a7b752", new Object[]{this})).booleanValue();
        }
        return this.mHasSwitchTab;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        registerTabSelectListener();
        registerRequestListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterTabSelectListener();
        unRegisterRequestListener();
        xue xueVar = this.mInfoFlowEngine;
        if (xueVar != null) {
            xueVar.a();
            this.mInfoFlowEngine = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService
    public void realOrderListPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292a6f2c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IOrderListPrefetchService.NEED_APPEND_BIZ_PARAMS, (Object) "true");
        jSONObject.put("containerId", (Object) z4a.REC_ORDER_LIST.f32522a);
        jSONObject.put("forceRequest", (Object) "true");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_orderlist_prefetch", (Object) "true");
        jSONObject.put("bizParam", (Object) jSONObject2);
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.triggerEvent(ael.GROUP, jSONObject);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService
    public void resetSwitchTabStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682c704b", new Object[]{this});
        } else {
            this.mHasSwitchTab = false;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService
    public void savePrefetchData(IBizDataModel iBizDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6791b8c8", new Object[]{this, iBizDataModel});
            return;
        }
        xue xueVar = this.mInfoFlowEngine;
        if (xueVar != null) {
            xueVar.a();
            this.mInfoFlowEngine = null;
        }
        get.a().e(new a(iBizDataModel));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService
    public void consumePrefetchData(int i, IAddViewCallbackService.a aVar) {
        IBizDataModel c2;
        Map containers;
        AwesomeGetContainerData awesomeGetContainerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76251db", new Object[]{this, new Integer(i), aVar});
        } else if (this.mHasSwitchTab && (c2 = zdl.c()) != null && (containers = c2.getContainers()) != null) {
            if (i > 0 && (awesomeGetContainerData = (AwesomeGetContainerData) containers.remove(z4a.REC_ORDER_LIST.f32522a)) != null) {
                containers.put(z4a.REC_ORDER_LIST_CATAPULT.f32522a, awesomeGetContainerData);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataModel", (Object) c2);
            jSONObject.put("containerId", (Object) this.mInfoFlowContext.getContainerType().getContainerId());
            boolean a2 = mve.a("compensateAfterBuySuccessCallback", false);
            if (aVar != null && a2) {
                aVar.onSuccess();
            }
            IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
            if (iContainerDataService != null) {
                iContainerDataService.triggerEvent("OrderListPrefetchDataConsume", jSONObject);
                if (cw6.b()) {
                    fve.e("yuhuai", "命中预加载数据，containerId:" + this.mInfoFlowContext.getContainerType().getContainerId());
                }
                checkAndStartPrefetch();
                fve.e(TAG, "consumePrefetchData");
            }
        }
    }
}
