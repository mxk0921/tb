package com.taobao.infoflow.taobao.subservice.biz.afterbuy.requestservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.HashMap;
import java.util.Map;
import tb.cfc;
import tb.cve;
import tb.fve;
import tb.get;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AddViewCallbackServiceImpl implements IAddViewCallbackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AfterBuyHostService";
    private IAddViewCallbackService.a mCallback;
    private IContainerDataService<?> mContainerDataService;
    private IContainerService<?> mContainerService;
    private IContainerDataService.a mOnDataProcessListener;
    private final IContainerDataService.e mRequestBizParamsCreator = new c(this);
    private IContainerService.a mUiRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.infoflow.taobao.subservice.biz.afterbuy.requestservice.AddViewCallbackServiceImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0566a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0566a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                fve.e(AddViewCallbackServiceImpl.TAG, "onSuccess：");
                AddViewCallbackServiceImpl.access$000(AddViewCallbackServiceImpl.this).onSuccess();
            }
        }

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            } else if (cve.c() && AddViewCallbackServiceImpl.access$000(AddViewCallbackServiceImpl.this) != null) {
                get.a().h(new RunnableC0566a());
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.a {
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
                    return;
                }
                fve.e(AddViewCallbackServiceImpl.TAG, "onSuccess：");
                AddViewCallbackServiceImpl.access$000(AddViewCallbackServiceImpl.this).onSuccess();
            }
        }

        public b() {
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
            } else if (!cve.c() && AddViewCallbackServiceImpl.access$000(AddViewCallbackServiceImpl.this) != null) {
                get.a().h(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(AddViewCallbackServiceImpl addViewCallbackServiceImpl) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isNeedSubSelectionData", "true");
            return hashMap;
        }
    }

    static {
        t2o.a(491782268);
        t2o.a(488636623);
    }

    public static /* synthetic */ IAddViewCallbackService.a access$000(AddViewCallbackServiceImpl addViewCallbackServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAddViewCallbackService.a) ipChange.ipc$dispatch("bf7f762f", new Object[]{addViewCallbackServiceImpl});
        }
        return addViewCallbackServiceImpl.mCallback;
    }

    private IContainerDataService.a createOnDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("443b5741", new Object[]{this});
        }
        return new b();
    }

    private IContainerService.a createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("c4ddacd6", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        fve.e(TAG, "onCreateService AfterBuyHostService");
        this.mContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mContainerService = (IContainerService) cfcVar.a(IContainerService.class);
        if (this.mContainerDataService != null) {
            IContainerDataService.a createOnDataProcessListener = createOnDataProcessListener();
            this.mOnDataProcessListener = createOnDataProcessListener;
            this.mContainerDataService.addDataProcessListener(createOnDataProcessListener);
            this.mContainerDataService.addRequestBizParamsCreator(this.mRequestBizParamsCreator);
        }
        IContainerService.a createUiRefreshListener = createUiRefreshListener();
        this.mUiRefreshListener = createUiRefreshListener;
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null) {
            iContainerService.addUiRefreshListener(createUiRefreshListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IContainerService<?> iContainerService;
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService.a aVar = this.mOnDataProcessListener;
        if (!(aVar == null || (iContainerDataService = this.mContainerDataService) == null)) {
            iContainerDataService.removeDataProcessListener(aVar);
            this.mContainerDataService.removeRequestBizParamsCreator(this.mRequestBizParamsCreator);
        }
        IContainerService.a aVar2 = this.mUiRefreshListener;
        if (aVar2 != null && (iContainerService = this.mContainerService) != null) {
            iContainerService.removeUiRefreshListener(aVar2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService
    public void registerDataProcessCallBack(IAddViewCallbackService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be103d4a", new Object[]{this, aVar});
        } else {
            this.mCallback = aVar;
        }
    }
}
