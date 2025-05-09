package com.taobao.infoflow.taobao.subservice.biz.expofilterservice;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IExposeItemFilterService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import tb.cfc;
import tb.fve;
import tb.t2o;
import tb.w1e;
import tb.wo8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ExposeItemFilterServiceImpl implements IExposeItemFilterService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ExposeItemFilterServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private IContainerService<?> mContainerService;
    private wo8 mExpoFilterManager;
    private cfc mInfoFlowContext;
    private IContainerDataService.c mRequestListener;
    private IContainerService.a mUiRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else {
                ExposeItemFilterServiceImpl.access$000(ExposeItemFilterServiceImpl.this).f(iContainerDataModel, str);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            } else {
                ExposeItemFilterServiceImpl.access$000(ExposeItemFilterServiceImpl.this).g(iUiRefreshActionModel.getContainerModel());
            }
        }
    }

    static {
        t2o.a(491782327);
        t2o.a(488636556);
    }

    public static /* synthetic */ wo8 access$000(ExposeItemFilterServiceImpl exposeItemFilterServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wo8) ipChange.ipc$dispatch("66a1aa14", new Object[]{exposeItemFilterServiceImpl});
        }
        return exposeItemFilterServiceImpl.mExpoFilterManager;
    }

    private void addListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f8b27c", new Object[]{this});
            return;
        }
        this.mContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        this.mContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        this.mExpoFilterManager = new wo8(this.mInfoFlowContext);
        this.mRequestListener = createRequestListener();
        this.mUiRefreshListener = createUiRefreshListener();
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.mRequestListener);
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null) {
            iContainerService.addUiRefreshListener(this.mUiRefreshListener);
        }
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

    @Override // com.taobao.infoflow.protocol.subservice.biz.IExposeItemFilterService
    public void addExposeItem(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f0aec7", new Object[]{this, baseSectionModel});
        } else {
            this.mExpoFilterManager.a(baseSectionModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        fve.b(TAG, "onCreateService:" + cfcVar.getContainerType().getContainerId());
        if (TextUtils.equals(cfcVar.getContainerType().getContainerId(), "newface_home_sub")) {
            this.mInfoFlowContext = cfcVar;
            addListener();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IContainerService.a aVar;
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (!(iContainerDataService == null || (cVar = this.mRequestListener) == null)) {
            iContainerDataService.removeRequestListener(cVar);
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null && (aVar = this.mUiRefreshListener) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
    }
}
