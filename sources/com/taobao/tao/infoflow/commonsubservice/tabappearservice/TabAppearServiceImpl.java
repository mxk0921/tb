package com.taobao.tao.infoflow.commonsubservice.tabappearservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import tb.c4b;
import tb.cfc;
import tb.f4b;
import tb.t2o;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TabAppearServiceImpl implements ITabAppearService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cfc infoFlowContext;
    private boolean isLeave;
    private zxd tabLifeCycle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements zxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.zxd
        public void onPageScrolled(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            }
        }

        @Override // tb.zxd
        public void onPageUnSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            } else {
                TabAppearServiceImpl.access$002(TabAppearServiceImpl.this, true);
            }
        }

        @Override // tb.zxd
        public void onPageSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90abdd0", new Object[]{this});
                return;
            }
            boolean equals = "true".equals(f4b.h("homeTabAppearRequestEnable", "true"));
            if (TabAppearServiceImpl.access$000(TabAppearServiceImpl.this) && equals && TabAppearServiceImpl.access$100(TabAppearServiceImpl.this)) {
                IContainerDataService iContainerDataService = (IContainerDataService) TabAppearServiceImpl.access$200(TabAppearServiceImpl.this).a(IContainerDataService.class);
                if (iContainerDataService != null) {
                    iContainerDataService.triggerEvent("HomeTabAppear", null);
                }
                TabAppearServiceImpl.access$002(TabAppearServiceImpl.this, false);
            }
        }
    }

    static {
        t2o.a(729809433);
        t2o.a(729809432);
    }

    public static /* synthetic */ boolean access$000(TabAppearServiceImpl tabAppearServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d31437", new Object[]{tabAppearServiceImpl})).booleanValue();
        }
        return tabAppearServiceImpl.isLeave;
    }

    public static /* synthetic */ boolean access$002(TabAppearServiceImpl tabAppearServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d2aa43", new Object[]{tabAppearServiceImpl, new Boolean(z)})).booleanValue();
        }
        tabAppearServiceImpl.isLeave = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(TabAppearServiceImpl tabAppearServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f5a2578", new Object[]{tabAppearServiceImpl})).booleanValue();
        }
        return tabAppearServiceImpl.isSelectedByTopMultiTab();
    }

    public static /* synthetic */ cfc access$200(TabAppearServiceImpl tabAppearServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("87a4e1a5", new Object[]{tabAppearServiceImpl});
        }
        return tabAppearServiceImpl.infoFlowContext;
    }

    private zxd createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxd) ipChange.ipc$dispatch("34d67fe5", new Object[]{this});
        }
        return new a();
    }

    private boolean isSelectedByTopMultiTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b99ef60", new Object[]{this})).booleanValue();
        }
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewService != null) {
            return iHomeViewService.isSelectedByTopMultiTab();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.infoFlowContext = cfcVar;
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            this.tabLifeCycle = createTabLifeCycle();
            iMainLifecycleService.getTabLifeCycleRegister().a(this.tabLifeCycle);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.infoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getTabLifeCycleRegister().b(this.tabLifeCycle);
        }
    }
}
