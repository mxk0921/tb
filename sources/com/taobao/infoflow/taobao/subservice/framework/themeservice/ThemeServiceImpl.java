package com.taobao.infoflow.taobao.subservice.framework.themeservice;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.TbGlobalThemeSubscriber;
import tb.ayd;
import tb.cfc;
import tb.get;
import tb.iqb;
import tb.kpt;
import tb.s9c;
import tb.t2o;
import tb.w1e;
import tb.xm4;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ThemeServiceImpl implements IThemeService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCreateContainerFinish;
    private IContainerDataService.a mDataProcessListener;
    public cfc mInfoFlowContext;
    private volatile boolean mIsPreLoading;
    private IFoldDeviceAndPadService.a mScreenChangeListener;
    private zxd mTabLifeCycle;
    private TbGlobalThemeSubscriber mTbGlobalThemeSubscriber;
    private kpt mThemeWaiter;
    private final TbGlobalThemeSubscriber.a mThemeListener = new d();
    private final xm4 containerLifecycleRegister = new xm4();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9fda5947", new Object[]{this});
            }
            return ThemeServiceImpl.this.getGlobalThemeConfig();
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
                } else if (!ThemeServiceImpl.access$200(ThemeServiceImpl.this)) {
                    ThemeServiceImpl.access$000(ThemeServiceImpl.this).b();
                }
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
        public void l(w1e w1eVar, IContainerDataModel iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else if (ThemeServiceImpl.access$000(ThemeServiceImpl.this) != null && ThemeServiceImpl.access$100(ThemeServiceImpl.this)) {
                get.a().h(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements zxd {
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
                } else {
                    ThemeServiceImpl.access$000(ThemeServiceImpl.this).b();
                }
            }
        }

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
            } else if (ThemeServiceImpl.access$300(ThemeServiceImpl.this) != ThemeServiceImpl.access$000(ThemeServiceImpl.this).a()) {
                get.a().h(new a());
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
    public class d implements TbGlobalThemeSubscriber.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.TbGlobalThemeSubscriber.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44c644bd", new Object[]{this});
            } else if (ThemeServiceImpl.access$000(ThemeServiceImpl.this) != null) {
                ThemeServiceImpl.access$000(ThemeServiceImpl.this).h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements IFoldDeviceAndPadService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService.a
        public void onScreenChanged(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a86b3b90", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (ThemeServiceImpl.access$000(ThemeServiceImpl.this) != null) {
                ThemeServiceImpl.access$000(ThemeServiceImpl.this).j();
            }
        }
    }

    static {
        t2o.a(491782825);
        t2o.a(488636652);
    }

    public static /* synthetic */ kpt access$000(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kpt) ipChange.ipc$dispatch("680f3aa1", new Object[]{themeServiceImpl});
        }
        return themeServiceImpl.mThemeWaiter;
    }

    public static /* synthetic */ boolean access$100(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca4b05a8", new Object[]{themeServiceImpl})).booleanValue();
        }
        return themeServiceImpl.isCreateContainerFinish;
    }

    public static /* synthetic */ boolean access$200(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fec4847", new Object[]{themeServiceImpl})).booleanValue();
        }
        return themeServiceImpl.mIsPreLoading;
    }

    public static /* synthetic */ int access$300(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("558d8ad5", new Object[]{themeServiceImpl})).intValue();
        }
        return themeServiceImpl.getMainContainerContainerBgViewId();
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
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

    private int getMainContainerContainerBgViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d882c6e", new Object[]{this})).intValue();
        }
        IHostService iHostService = (IHostService) this.mInfoFlowContext.a(IHostService.class);
        if (iHostService == null) {
            return -1;
        }
        return iHostService.getInvokeCallback().g().getCurrentBgViewId();
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.a createDataProcessListener = createDataProcessListener();
            this.mDataProcessListener = createDataProcessListener;
            iContainerDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private void initRegisterScreenChangeListener() {
        IFoldDeviceAndPadService iFoldDeviceAndPadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9986b8a", new Object[]{this});
            return;
        }
        cfc cfcVar = this.mInfoFlowContext;
        if (cfcVar != null && (iFoldDeviceAndPadService = (IFoldDeviceAndPadService) cfcVar.a(IFoldDeviceAndPadService.class)) != null) {
            e eVar = new e();
            this.mScreenChangeListener = eVar;
            iFoldDeviceAndPadService.addOnScreenChangeListener(eVar);
        }
    }

    private void initRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc94f8b9", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            ayd tabLifeCycleRegister = iMainLifecycleService.getTabLifeCycleRegister();
            zxd createTabLifeCycle = createTabLifeCycle();
            this.mTabLifeCycle = createTabLifeCycle;
            tabLifeCycleRegister.a(createTabLifeCycle);
        }
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (aVar = this.mDataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    private void unRegisterScreenChangeListener() {
        IFoldDeviceAndPadService iFoldDeviceAndPadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f6b113", new Object[]{this});
            return;
        }
        cfc cfcVar = this.mInfoFlowContext;
        if (cfcVar != null && this.mScreenChangeListener != null && (iFoldDeviceAndPadService = (IFoldDeviceAndPadService) cfcVar.a(IFoldDeviceAndPadService.class)) != null) {
            iFoldDeviceAndPadService.removeOnScreenChangeListener(this.mScreenChangeListener);
        }
    }

    private void unRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913ac7d0", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycle);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        TbGlobalThemeSubscriber tbGlobalThemeSubscriber = this.mTbGlobalThemeSubscriber;
        if (tbGlobalThemeSubscriber != null) {
            tbGlobalThemeSubscriber.c();
            this.mTbGlobalThemeSubscriber = null;
        }
        this.mThemeWaiter.e();
    }

    public JSONObject getGlobalThemeConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba4e74b9", new Object[]{this});
        }
        IHostService iHostService = (IHostService) this.mInfoFlowContext.a(IHostService.class);
        if (iHostService == null) {
            return null;
        }
        return iHostService.getInvokeCallback().g().v();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mThemeWaiter = new kpt(cfcVar);
        initRegisterDataListener();
        initRegisterTabSelectListener();
        initRegisterScreenChangeListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mThemeWaiter.d();
        this.containerLifecycleRegister.b();
        unRegisterDataListener();
        unRegisterTabSelectListener();
        unRegisterScreenChangeListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        kpt kptVar = this.mThemeWaiter;
        if (kptVar != null) {
            kptVar.g();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void preCreateTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839d311", new Object[]{this});
            return;
        }
        this.mIsPreLoading = true;
        kpt kptVar = this.mThemeWaiter;
        if (kptVar != null) {
            kptVar.b();
        }
        this.mIsPreLoading = false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.f(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setEnableCreateGlobalTheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e32816", new Object[]{this, str});
            return;
        }
        kpt kptVar = this.mThemeWaiter;
        if (kptVar != null) {
            kptVar.f(str, new a());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setGlobalThemeVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a748e3f", new Object[]{this, new Boolean(z)});
            return;
        }
        kpt kptVar = this.mThemeWaiter;
        if (kptVar != null) {
            kptVar.i(z);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService, tb.iqb
    public FrameLayout createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        this.containerLifecycleRegister.c(context);
        FrameLayout c2 = this.mThemeWaiter.c(context);
        this.containerLifecycleRegister.d();
        TbGlobalThemeSubscriber tbGlobalThemeSubscriber = this.mTbGlobalThemeSubscriber;
        if (tbGlobalThemeSubscriber != null) {
            tbGlobalThemeSubscriber.c();
        }
        this.mTbGlobalThemeSubscriber = new TbGlobalThemeSubscriber(this.mThemeListener);
        if (!this.mIsPreLoading) {
            this.mThemeWaiter.b();
        }
        this.isCreateContainerFinish = true;
        return c2;
    }
}
