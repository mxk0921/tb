package com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.cfc;
import tb.ect;
import tb.fve;
import tb.get;
import tb.h6d;
import tb.t2o;
import tb.w1e;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GlobalSceneUtPassServiceImpl implements IGlobalSceneUtPassService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GlobalSceneUtPassServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private IMainLifecycleService mMainLifecycleService;
    private IContainerDataService.a mOnDataProcessListener;
    private h6d mPageLifeCycle;
    private zxd mTabLifeCycle;
    private ect mTapGlobalSceneUtController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSubItemModel f10651a;

        public a(BaseSubItemModel baseSubItemModel) {
            this.f10651a = baseSubItemModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).b(this.f10651a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h6d
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            }
        }

        @Override // tb.h6d
        public void onColdStartResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onNewIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            }
        }

        @Override // tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).c();
            }
        }

        @Override // tb.h6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onWillExit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements zxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
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
            } else {
                GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).c();
            }
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
    public class d implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
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
            } else {
                GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).f();
            }
        }
    }

    static {
        t2o.a(486539535);
        t2o.a(488636566);
    }

    public static /* synthetic */ ect access$000(GlobalSceneUtPassServiceImpl globalSceneUtPassServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ect) ipChange.ipc$dispatch("415f9841", new Object[]{globalSceneUtPassServiceImpl});
        }
        return globalSceneUtPassServiceImpl.mTapGlobalSceneUtController;
    }

    private IContainerDataService.a createOnDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("443b5741", new Object[]{this});
        }
        return new d();
    }

    private h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new b();
    }

    private zxd createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxd) ipChange.ipc$dispatch("34d67fe5", new Object[]{this});
        }
        return new c();
    }

    private void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
        } else if (this.mMainLifecycleService == null || this.mContainerDataService == null) {
            fve.e(TAG, "initListener mMainLifecycleService || mContainerDataService is null");
        } else {
            this.mPageLifeCycle = createPageLifeCycle();
            this.mMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
            this.mTabLifeCycle = createTabLifeCycle();
            this.mMainLifecycleService.getTabLifeCycleRegister().a(this.mTabLifeCycle);
            IContainerDataService.a createOnDataProcessListener = createOnDataProcessListener();
            this.mOnDataProcessListener = createOnDataProcessListener;
            this.mContainerDataService.addDataProcessListener(createOnDataProcessListener);
        }
    }

    private void unRegisterListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761571b7", new Object[]{this});
            return;
        }
        if (this.mPageLifeCycle != null) {
            this.mMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
            this.mPageLifeCycle = null;
        }
        if (this.mTabLifeCycle != null) {
            this.mMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycle);
            this.mTabLifeCycle = null;
        }
        IContainerDataService.a aVar = this.mOnDataProcessListener;
        if (aVar != null) {
            this.mContainerDataService.removeDataProcessListener(aVar);
            this.mOnDataProcessListener = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService
    public void onClick(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80a0c6", new Object[]{this, baseSubItemModel});
        } else {
            get.a().i(new a(baseSubItemModel));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mTapGlobalSceneUtController = new ect(cfcVar);
        this.mMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.mContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        registerListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterListener();
        }
    }
}
