package com.taobao.tao.topmultitab.service.hudscreen;

import android.app.Activity;
import android.content.res.Configuration;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.OnWindowChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.hudscreen.IHudScreenService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.b9b;
import tb.bqa;
import tb.cfc;
import tb.f4b;
import tb.h5b;
import tb.imn;
import tb.rvk;
import tb.t2o;
import tb.v20;
import tb.wcc;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HudScreenServiceImpl implements IHudScreenService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HudScreenManager";
    private wcc mHomePageContext;
    private IHomePageLifecycleService mLifecycleService;
    private IPageLifeCycle mPageLifeCycle;
    private IHomePageProviderService mPageProviderService;
    private OnScreenChangedListener mScreenChangedListener;
    private rvk mUiRefreshListener;
    private OnWindowChangedListener mWindowChangeListener;
    private boolean mLastEnableScale = h5b.e().g();
    private final List<IHudScreenService.a> mScreenChangeListener = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1504501726) {
                super.onDestroy();
                return null;
            } else if (hashCode == -1392519801) {
                super.onCreateView();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/topmultitab/service/hudscreen/HudScreenServiceImpl$1");
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onCreateView() {
            z6d pageProvider;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acffd587", new Object[]{this});
                return;
            }
            super.onCreateView();
            if (HudScreenServiceImpl.access$000(HudScreenServiceImpl.this) != null && (pageProvider = HudScreenServiceImpl.access$000(HudScreenServiceImpl.this).getPageProvider()) != null && pageProvider.k1() != null) {
                HudScreenServiceImpl.access$102(HudScreenServiceImpl.this, new C0729a());
                TBAutoSizeConfig.x().e0(pageProvider.k1(), HudScreenServiceImpl.access$100(HudScreenServiceImpl.this));
                bqa.d(HudScreenServiceImpl.TAG, "register window change listener");
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onDestroy() {
            z6d pageProvider;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            super.onDestroy();
            if (HudScreenServiceImpl.access$100(HudScreenServiceImpl.this) != null && HudScreenServiceImpl.access$000(HudScreenServiceImpl.this) != null && (pageProvider = HudScreenServiceImpl.access$000(HudScreenServiceImpl.this).getPageProvider()) != null && pageProvider.k1() != null) {
                TBAutoSizeConfig.x().i0(pageProvider.k1(), HudScreenServiceImpl.access$100(HudScreenServiceImpl.this));
                bqa.d(HudScreenServiceImpl.TAG, "unregister window change listener");
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.topmultitab.service.hudscreen.HudScreenServiceImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0729a implements OnWindowChangedListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0729a() {
            }

            @Override // com.taobao.android.autosize.OnWindowChangedListener
            public void a(OnWindowChangedListener.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6c2a252", new Object[]{this, aVar});
                } else if (aVar != null) {
                    bqa.d(HudScreenServiceImpl.TAG, "onWindowChanged: " + aVar);
                    int i = aVar.f6410a;
                    if ((2 & i) != 0 || (i & 1) != 0) {
                        HudScreenServiceImpl.access$200(HudScreenServiceImpl.this);
                        bqa.d(HudScreenServiceImpl.TAG, "onScreenChanged");
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rvk
        public void a(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
            }
        }

        @Override // tb.rvk
        public void b(imn imnVar, JSONObject jSONObject, String str) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
                return;
            }
            DinamicXEngine d = h5b.e().d();
            DXEngineConfig d2 = d.d();
            boolean b = b9b.b();
            if (b && b9b.f()) {
                z = true;
            }
            d2.b(b, z);
            bqa.d(HudScreenServiceImpl.TAG, "isEnableDesignScale: " + b);
            if (HudScreenServiceImpl.access$300(HudScreenServiceImpl.this) != b) {
                bqa.d(HudScreenServiceImpl.TAG, "hud screen state change");
                DinamicXEngine.H0(true);
                d.k1();
            }
            HudScreenServiceImpl.access$302(HudScreenServiceImpl.this, b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else {
                HudScreenServiceImpl.access$200(HudScreenServiceImpl.this);
            }
        }
    }

    static {
        t2o.a(729810200);
        t2o.a(729810205);
    }

    public static /* synthetic */ IHomePageProviderService access$000(HudScreenServiceImpl hudScreenServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomePageProviderService) ipChange.ipc$dispatch("c174cbcd", new Object[]{hudScreenServiceImpl});
        }
        return hudScreenServiceImpl.mPageProviderService;
    }

    public static /* synthetic */ OnWindowChangedListener access$100(HudScreenServiceImpl hudScreenServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnWindowChangedListener) ipChange.ipc$dispatch("c3ae0217", new Object[]{hudScreenServiceImpl});
        }
        return hudScreenServiceImpl.mWindowChangeListener;
    }

    public static /* synthetic */ OnWindowChangedListener access$102(HudScreenServiceImpl hudScreenServiceImpl, OnWindowChangedListener onWindowChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnWindowChangedListener) ipChange.ipc$dispatch("ccaa0787", new Object[]{hudScreenServiceImpl, onWindowChangedListener});
        }
        hudScreenServiceImpl.mWindowChangeListener = onWindowChangedListener;
        return onWindowChangedListener;
    }

    public static /* synthetic */ void access$200(HudScreenServiceImpl hudScreenServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda96c92", new Object[]{hudScreenServiceImpl});
        } else {
            hudScreenServiceImpl.onScreenChangeInternal();
        }
    }

    public static /* synthetic */ boolean access$300(HudScreenServiceImpl hudScreenServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81a65b5", new Object[]{hudScreenServiceImpl})).booleanValue();
        }
        return hudScreenServiceImpl.mLastEnableScale;
    }

    public static /* synthetic */ boolean access$302(HudScreenServiceImpl hudScreenServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94ad149", new Object[]{hudScreenServiceImpl, new Boolean(z)})).booleanValue();
        }
        hudScreenServiceImpl.mLastEnableScale = z;
        return z;
    }

    private rvk createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new b();
    }

    private boolean enableNewScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a8b3ed8", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableNewScreenChangeListener", true);
    }

    private void notifyScreenChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920c6f2c", new Object[]{this});
            return;
        }
        for (IHudScreenService.a aVar : this.mScreenChangeListener) {
            aVar.a();
        }
    }

    private void onScreenChangeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec41031f", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d(TAG, "onScreenChanged iHomePageContext == null");
            return;
        }
        refreshSearchBar(wccVar);
        if (b9b.e()) {
            bqa.d(TAG, "折叠屏重置二楼enable状态");
            setEnableToSecondFloor(this.mHomePageContext);
        }
        notifyScreenChange();
    }

    private void refreshSearchBar(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bbdec8", new Object[]{this, wccVar});
            return;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) wccVar.a(IHomeSearchBarService.class);
        if (iHomeSearchBarService != null) {
            iHomeSearchBarService.forceRefreshSearchBar();
        }
    }

    private void registerScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c7425a", new Object[]{this});
            return;
        }
        this.mScreenChangedListener = new c();
        TBAutoSizeConfig.x().d0(this.mScreenChangedListener);
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d(TAG, "mHomePageContext == null");
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        if (iHomeDataService == null) {
            bqa.d(TAG, "dataService == null");
            return;
        }
        rvk createUiRefreshListener = createUiRefreshListener();
        this.mUiRefreshListener = createUiRefreshListener;
        iHomeDataService.addOnUiRefreshListener(createUiRefreshListener);
    }

    private void registerWindowChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69704de", new Object[]{this});
        } else if (this.mLifecycleService != null) {
            this.mPageLifeCycle = new a();
            this.mLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
    }

    private void setEnableToSecondFloor(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee01ba10", new Object[]{this, wccVar});
            return;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            bqa.d(TAG, "controllerService == null");
            return;
        }
        IPullDownService iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class);
        IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
        if (iPullDownService != null && currentSubTabController != null) {
            iPullDownService.setEnableToSecondFloor(currentSubTabController.isEnableToSecondFloor());
        }
    }

    private void unRegisterUiRefreshListener() {
        rvk rvkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d(TAG, "unRegister mHomePageContext == null");
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        if (iHomeDataService == null || (rvkVar = this.mUiRefreshListener) == null) {
            bqa.d(TAG, "unRegister dataService == null");
        } else {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.hudscreen.IHudScreenService
    public void addOnScreenChangeListener(IHudScreenService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313f868b", new Object[]{this, aVar});
        } else if (!this.mScreenChangeListener.contains(aVar)) {
            this.mScreenChangeListener.add(aVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        if (this.mScreenChangedListener != null) {
            TBAutoSizeConfig.x().h0(this.mScreenChangedListener);
        }
        unRegisterUiRefreshListener();
        IHomePageLifecycleService iHomePageLifecycleService = this.mLifecycleService;
        if (iHomePageLifecycleService != null && this.mPageLifeCycle != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.hudscreen.IHudScreenService
    public void removeOnScreenChangeListener(IHudScreenService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340e52ee", new Object[]{this, aVar});
        } else {
            this.mScreenChangeListener.remove(aVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
        } else if (b9b.e() || b9b.h()) {
            this.mHomePageContext = wccVar;
            this.mLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
            this.mPageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
            registerUiRefreshListener();
            if (enableNewScreenChangeListener()) {
                registerWindowChangeListener();
            } else {
                registerScreenChangeListener();
            }
        } else {
            bqa.d(TAG, "不是折叠屏或者pad");
        }
    }
}
