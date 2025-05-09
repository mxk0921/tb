package com.taobao.android.fluid.framework.hostapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.g3e;
import tb.h3e;
import tb.ir9;
import tb.o6d;
import tb.od0;
import tb.pto;
import tb.t2o;
import tb.y5b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class HostAppService implements IHostAppService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HostAppService";
    private g3e mBottomBarChangeListener;
    private IContainerService mContainerService;
    private int mCurrentTabIndex;
    private final FluidContext mFluidContext;
    private final y5b mHostAppListenersManager;
    private boolean mIsNavigationStatusListenerRegistered;
    private boolean mIsTabBarHide;
    private ILifecycleService mLifecycleService;
    private int mTabIndex;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements g3e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.g3e
        public void r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cacfd02", new Object[]{this, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("onNavigationShowHideStatusChanged 底部状态变化 isHideStatus=");
            sb.append(!z);
            ir9.b(HostAppService.TAG, sb.toString());
            HostAppService.access$002(HostAppService.this, !z);
            HostAppService.access$100(HostAppService.this).F(HostAppService.access$000(HostAppService.this));
            Intent intent = new Intent("GuangguangBottomTabbarHiddenChanged");
            intent.putExtra("hidden", HostAppService.access$000(HostAppService.this));
            intent.putExtra("realHidden", true ^ com.taobao.tao.navigation.a.y());
            LocalBroadcastManager.getInstance(o.J()).sendBroadcast(intent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostapp/HostAppService$2");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            } else {
                HostAppService.access$200(HostAppService.this);
            }
        }

        @Override // tb.o6d.a, tb.o6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else {
                HostAppService.access$300(HostAppService.this);
            }
        }
    }

    static {
        t2o.a(468714382);
        t2o.a(468714385);
    }

    public HostAppService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mHostAppListenersManager = new y5b(fluidContext);
    }

    public static /* synthetic */ boolean access$000(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("822e78d3", new Object[]{hostAppService})).booleanValue();
        }
        return hostAppService.mIsTabBarHide;
    }

    public static /* synthetic */ boolean access$002(HostAppService hostAppService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f2043eb", new Object[]{hostAppService, new Boolean(z)})).booleanValue();
        }
        hostAppService.mIsTabBarHide = z;
        return z;
    }

    public static /* synthetic */ y5b access$100(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y5b) ipChange.ipc$dispatch("985ae414", new Object[]{hostAppService});
        }
        return hostAppService.mHostAppListenersManager;
    }

    public static /* synthetic */ void access$200(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568d890d", new Object[]{hostAppService});
        } else {
            hostAppService.addNavigationShowHideStatusListener();
        }
    }

    public static /* synthetic */ void access$300(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bd112c", new Object[]{hostAppService});
        } else {
            hostAppService.removeNavigationShowHideStatusListener();
        }
    }

    private void observePageLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11a9ee6", new Object[]{this});
        } else {
            this.mLifecycleService.addPageLifecycleListener((o6d.a) new b());
        }
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public void addNavigationShowHideStatusListener(NavigationTabModule.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8694d9c", new Object[]{this, dVar});
        } else {
            this.mHostAppListenersManager.a(dVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public int getCurrentTabIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue();
        }
        return this.mCurrentTabIndex;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public int getTabIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13749ead", new Object[]{this})).intValue();
        }
        return this.mTabIndex;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public boolean isTBMainActivity(Context context) {
        ViewGroup Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526df805", new Object[]{this, context})).booleanValue();
        }
        if ((context instanceof Activity) && (Q = od0.D().f().Q()) != null && Q.getContext() == context) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public boolean isTabBarHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4215ef5", new Object[]{this})).booleanValue();
        }
        return this.mIsTabBarHide;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public boolean isTaoBaoApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f9b619c", new Object[]{this, context})).booleanValue();
        }
        return context.getPackageName().equals("com.taobao.taobao");
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public void removeNavigationShowHideStatusListener(NavigationTabModule.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433d30bf", new Object[]{this, dVar});
        } else {
            this.mHostAppListenersManager.b(dVar);
        }
    }

    private void addNavigationShowHideStatusListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419a8601", new Object[]{this});
        } else if (!this.mIsNavigationStatusListenerRegistered) {
            if (pto.g(this.mFluidContext) && isTBMainActivity(this.mFluidContext.getContext())) {
                this.mIsTabBarHide = !od0.D().f().C();
                ir9.b(TAG, "addNavigationShowHideStatusListener 初始化底部状态 mIsTabBarHide=" + this.mIsTabBarHide);
                h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
                if (tab2ServiceDelegate != null) {
                    this.mBottomBarChangeListener = new a();
                    ir9.b(TAG, "addNavigationShowHideStatusListener 初始化底部状态, 添加底部状态监听...新框架");
                    tab2ServiceDelegate.r(this.mBottomBarChangeListener);
                }
            }
            this.mIsNavigationStatusListenerRegistered = true;
        }
    }

    private void removeNavigationShowHideStatusListener() {
        h3e tab2ServiceDelegate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9211064", new Object[]{this});
        } else if (pto.g(this.mFluidContext) && isTBMainActivity(this.mFluidContext.getContext()) && this.mBottomBarChangeListener != null && (tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate()) != null) {
            ir9.b(TAG, "removeNavigationShowHideStatusListener 移除底部状态监听...新框架");
            tab2ServiceDelegate.t(this.mBottomBarChangeListener);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mIsTabBarHide = true ^ od0.D().f().C();
        ir9.b(TAG, "onCreateService 初始化底部状态 mIsTabBarHide=" + this.mIsTabBarHide);
        this.mTabIndex = 0;
        this.mCurrentTabIndex = 0;
        ILifecycleService iLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mLifecycleService = iLifecycleService;
        if (iLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
        }
        IContainerService iContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        this.mContainerService = iContainerService;
        if (iContainerService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, IContainerService.class);
        }
        observePageLifecycle();
    }
}
