package com.taobao.infoflow.taobao.subservice.biz.containerflagservice;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IContainerFlagService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.m47;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ContainerFlagServiceImpl implements IContainerFlagService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContainerFlagServiceImpl";
    private boolean isNeedRefresh;
    private IContainerDataService<?> mContainerDataService;
    private IDxItemRenderService mDxItemRenderService;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private IMainLifecycleService mMainLifecycleService;
    private static final String UPDATE_STRATEGY_NEVER = "never";
    private static final String UPDATE_STRATEGY_FIRST_PAGE_REFRESH = "firstPageRefresh";
    private static final String[] UPDATE_STRATEGY_AAR = {UPDATE_STRATEGY_NEVER, UPDATE_STRATEGY_FIRST_PAGE_REFRESH};
    private final Map<String, String> mFlagMap = new ConcurrentHashMap();
    private final IContainerDataService.c mOnRequestListener = new a();
    private m47 mDefaultPageLifeCycle = new b();

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
            } else if (e(iContainerDataModel)) {
                d();
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

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f153b438", new Object[]{this});
                return;
            }
            Iterator it = ContainerFlagServiceImpl.access$000(ContainerFlagServiceImpl.this).entrySet().iterator();
            while (it.hasNext()) {
                if (ContainerFlagServiceImpl.UPDATE_STRATEGY_FIRST_PAGE_REFRESH.equals(((Map.Entry) it.next()).getValue())) {
                    it.remove();
                }
            }
        }

        public final boolean e(IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7c24eee0", new Object[]{this, iContainerDataModel})).booleanValue();
            }
            if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null || iContainerDataModel.getBase().getPageParams().getPageNum() != 0) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/containerflagservice/ContainerFlagServiceImpl$2");
        }

        @Override // tb.m47, tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else if (ContainerFlagServiceImpl.access$100(ContainerFlagServiceImpl.this)) {
                ContainerFlagServiceImpl.access$102(ContainerFlagServiceImpl.this, false);
                ContainerFlagServiceImpl.access$200(ContainerFlagServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ContainerFlagServiceImpl.access$300(ContainerFlagServiceImpl.this) != null) {
                ContainerFlagServiceImpl.access$300(ContainerFlagServiceImpl.this).reset();
            }
            if (ContainerFlagServiceImpl.access$400(ContainerFlagServiceImpl.this) != null) {
                ContainerFlagServiceImpl.access$400(ContainerFlagServiceImpl.this).reloadUi();
            }
        }
    }

    public static /* synthetic */ Map access$000(ContainerFlagServiceImpl containerFlagServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9dd1ca5", new Object[]{containerFlagServiceImpl});
        }
        return containerFlagServiceImpl.mFlagMap;
    }

    public static /* synthetic */ boolean access$100(ContainerFlagServiceImpl containerFlagServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb9ed653", new Object[]{containerFlagServiceImpl})).booleanValue();
        }
        return containerFlagServiceImpl.isNeedRefresh;
    }

    public static /* synthetic */ boolean access$102(ContainerFlagServiceImpl containerFlagServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c926eb", new Object[]{containerFlagServiceImpl, new Boolean(z)})).booleanValue();
        }
        containerFlagServiceImpl.isNeedRefresh = z;
        return z;
    }

    public static /* synthetic */ void access$200(ContainerFlagServiceImpl containerFlagServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc209e2e", new Object[]{containerFlagServiceImpl});
        } else {
            containerFlagServiceImpl.refreshUI();
        }
    }

    public static /* synthetic */ IDxItemRenderService access$300(ContainerFlagServiceImpl containerFlagServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemRenderService) ipChange.ipc$dispatch("1d046f94", new Object[]{containerFlagServiceImpl});
        }
        return containerFlagServiceImpl.mDxItemRenderService;
    }

    public static /* synthetic */ IMainFeedsViewService access$400(ContainerFlagServiceImpl containerFlagServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("353f5c14", new Object[]{containerFlagServiceImpl});
        }
        return containerFlagServiceImpl.mMainFeedsViewService;
    }

    private boolean isValidStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b428b5a", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : UPDATE_STRATEGY_AAR) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    private void refreshUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9717e7b6", new Object[]{this});
        } else {
            get.a().h(new c());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IContainerFlagService
    public String findFlagStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1b4a3d7", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return this.mFlagMap.get(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mDxItemRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        this.mMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.mOnRequestListener);
        }
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().a(this.mDefaultPageLifeCycle);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeRequestListener(this.mOnRequestListener);
        }
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mDefaultPageLifeCycle);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IContainerFlagService
    public void recordFlag(String str, String str2, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba3915c", new Object[]{this, str, str2, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            fve.e(TAG, "key is error, " + str);
        } else if (!isValidStrategy(str2)) {
            fve.e(TAG, "flagUpdateStrategy is error, " + str2);
        } else {
            boolean equals = TextUtils.equals(this.mFlagMap.get(str), str2);
            if (!equals) {
                this.mFlagMap.put(str, str2);
            }
            if (equals || !z) {
                z2 = false;
            }
            this.isNeedRefresh = z2;
        }
    }

    static {
        t2o.a(491782315);
        t2o.a(488636548);
    }
}
