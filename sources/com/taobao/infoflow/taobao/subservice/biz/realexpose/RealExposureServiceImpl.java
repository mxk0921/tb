package com.taobao.infoflow.taobao.subservice.biz.realexpose;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IRealExposureService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.c6o;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.h6c;
import tb.mve;
import tb.sjn;
import tb.t2o;
import tb.tjn;
import tb.ulp;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RealExposureServiceImpl implements IRealExposureService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RealExposureServiceImpl";
    private h6c.c feedsScrollListener;
    private IContainerDataService<?> mContainerDataService;
    private cfc mInfoFlowContext;
    private IContainerDataService.c mOnRequestListener;
    private IContainerDataService.e mRequestBizParamsCreator;
    private tjn mTrigger;
    private boolean mEnableZeroPageExposedOpt = false;
    private boolean lastEnableZeroPageOpt = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            } else if (i == 0 && RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) != null && RealExposureServiceImpl.access$100(RealExposureServiceImpl.this) != null) {
                RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).a(RealExposureServiceImpl.access$100(RealExposureServiceImpl.this));
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) != null && RealExposureServiceImpl.access$100(RealExposureServiceImpl.this) != null) {
                    RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).a(RealExposureServiceImpl.access$100(RealExposureServiceImpl.this));
                }
            }
        }

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
                return;
            }
            if (c6o.a(iContainerDataModel) && RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) != null) {
                RealExposureServiceImpl.access$200(RealExposureServiceImpl.this, iContainerDataModel);
            }
            if (TextUtils.equals(str, "aiRefresh")) {
                get.a().g(new a(), 100L);
            }
            if (RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) != null && w1eVar != null) {
                RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).b(w1eVar.b());
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            } else if (RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) != null && w1eVar != null) {
                RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).c(w1eVar.b());
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            Map<String, String> map;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            boolean b = ulp.c(Globals.getApplication()).b("enableZeroPageExposeOpt", false);
            if ((!RealExposureServiceImpl.access$300(RealExposureServiceImpl.this) && !b) || RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) == null) {
                return null;
            }
            if (c6o.d(str)) {
                map = RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).e(RealExposureServiceImpl.access$300(RealExposureServiceImpl.this), null, w1eVar);
            } else if (c6o.b(str) && !mve.a("disableUploadUnExposedInColdStart", false)) {
                String a2 = sjn.a();
                if (TextUtils.isEmpty(a2)) {
                    return null;
                }
                tjn access$000 = RealExposureServiceImpl.access$000(RealExposureServiceImpl.this);
                if (!RealExposureServiceImpl.access$300(RealExposureServiceImpl.this) && !b) {
                    z = false;
                }
                map = access$000.e(z, a2, w1eVar);
            } else if (c6o.e(str)) {
                map = RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).f(RealExposureServiceImpl.access$300(RealExposureServiceImpl.this), null, w1eVar);
            } else {
                map = new HashMap<>();
            }
            if (RealExposureServiceImpl.access$000(RealExposureServiceImpl.this) != null) {
                String i = RealExposureServiceImpl.access$000(RealExposureServiceImpl.this).i();
                if (!TextUtils.isEmpty(i)) {
                    map.put("failExposedXExposedIds", i.toString());
                }
            }
            return map;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (RealExposureServiceImpl.access$400(RealExposureServiceImpl.this) != RealExposureServiceImpl.access$300(RealExposureServiceImpl.this)) {
                ulp.c(Globals.getApplication()).f("enableZeroPageExposeOpt", RealExposureServiceImpl.access$300(RealExposureServiceImpl.this));
                RealExposureServiceImpl realExposureServiceImpl = RealExposureServiceImpl.this;
                RealExposureServiceImpl.access$402(realExposureServiceImpl, RealExposureServiceImpl.access$300(realExposureServiceImpl));
            }
        }
    }

    static {
        t2o.a(491782622);
        t2o.a(488636597);
    }

    public static /* synthetic */ tjn access$000(RealExposureServiceImpl realExposureServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tjn) ipChange.ipc$dispatch("2224cf63", new Object[]{realExposureServiceImpl});
        }
        return realExposureServiceImpl.mTrigger;
    }

    public static /* synthetic */ cfc access$100(RealExposureServiceImpl realExposureServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("747c4abf", new Object[]{realExposureServiceImpl});
        }
        return realExposureServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ void access$200(RealExposureServiceImpl realExposureServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992f406b", new Object[]{realExposureServiceImpl, iContainerDataModel});
        } else {
            realExposureServiceImpl.refreshExperimentConfig(iContainerDataModel);
        }
    }

    public static /* synthetic */ boolean access$300(RealExposureServiceImpl realExposureServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d38f855", new Object[]{realExposureServiceImpl})).booleanValue();
        }
        return realExposureServiceImpl.mEnableZeroPageExposedOpt;
    }

    public static /* synthetic */ boolean access$400(RealExposureServiceImpl realExposureServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52565d6", new Object[]{realExposureServiceImpl})).booleanValue();
        }
        return realExposureServiceImpl.lastEnableZeroPageOpt;
    }

    public static /* synthetic */ boolean access$402(RealExposureServiceImpl realExposureServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f86c404", new Object[]{realExposureServiceImpl, new Boolean(z)})).booleanValue();
        }
        realExposureServiceImpl.lastEnableZeroPageOpt = z;
        return z;
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new a();
    }

    private IContainerDataService.e createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new c();
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new b();
    }

    private void refreshExperimentConfig(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6abc47a", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            JSONObject ext = base.getExt();
            if (ext == null) {
                fve.e(TAG, "ext == null");
                return;
            }
            this.mEnableZeroPageExposedOpt = ext.getBooleanValue("enablezeroPageExposedOpt");
            get.a().e(new d());
        }
    }

    private void registerRequestBizParamsCreator() {
        IContainerDataService iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acd06", new Object[]{this});
            return;
        }
        cfc cfcVar = this.mInfoFlowContext;
        if (cfcVar != null && (iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class)) != null) {
            IContainerDataService.e createRequestBizParamsCreator = createRequestBizParamsCreator();
            this.mRequestBizParamsCreator = createRequestBizParamsCreator;
            iContainerDataService.addRequestBizParamsCreator(createRequestBizParamsCreator);
        }
    }

    private void registerRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
        } else if (this.mInfoFlowContext != null) {
            this.mOnRequestListener = createRequestListener();
            IContainerDataService<?> iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
            this.mContainerDataService = iContainerDataService;
            if (iContainerDataService == null) {
                fve.e(TAG, "IContainerDataService is null");
            } else {
                iContainerDataService.addRequestListener(this.mOnRequestListener);
            }
        }
    }

    private void registerScrollListener() {
        cfc cfcVar;
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener == null && (cfcVar = this.mInfoFlowContext) != null && (iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class)) != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
            this.feedsScrollListener = createFeedsScrollListener;
            lifeCycleRegister.h(createFeedsScrollListener);
        }
    }

    private void unRegisterRequestBizParamsCreator() {
        IContainerDataService iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e50b7ad", new Object[]{this});
            return;
        }
        cfc cfcVar = this.mInfoFlowContext;
        if (cfcVar != null && (iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class)) != null) {
            IContainerDataService.e eVar = this.mRequestBizParamsCreator;
            if (eVar != null) {
                iContainerDataService.removeRequestBizParamsCreator(eVar);
            }
            this.mRequestBizParamsCreator = null;
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

    private void unRegisterScrollListener() {
        cfc cfcVar;
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener != null && (cfcVar = this.mInfoFlowContext) != null && (iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class)) != null) {
            iMainFeedsViewService.getLifeCycleRegister().v(this.feedsScrollListener);
            this.feedsScrollListener = null;
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
        if (this.mTrigger == null) {
            this.mTrigger = new tjn(this.mInfoFlowContext);
        }
        registerScrollListener();
        registerRequestListener();
        registerRequestBizParamsCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterRequestListener();
        unRegisterScrollListener();
        unRegisterRequestBizParamsCreator();
        this.mInfoFlowContext = null;
    }
}
