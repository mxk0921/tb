package com.taobao.android.fluid.framework.back;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import tb.ir9;
import tb.ln1;
import tb.on1;
import tb.pn1;
import tb.qn1;
import tb.t2o;
import tb.vrp;
import tb.yhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BackEventService implements IBackEventService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BackEventService";
    private final ln1 mBackEventManager;
    private on1 mBackInterceptHelper;
    private qn1 mBackKeyEventDetector;
    private final FluidContext mFluidContext;
    private IHostPageInterfaceService mHostPageInterfaceService;
    private ILifecycleService mLifecycleService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements pn1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pn1
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11b3de27", new Object[]{this});
            } else if (BackEventService.access$000(BackEventService.this) != null) {
                ir9.b(BackEventService.TAG, "滑动拦截 sendBackClickMsg");
                BackEventService.access$000(BackEventService.this).d(BackEventService.access$100(BackEventService.this), "swipe");
            }
        }

        @Override // tb.pn1
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1707d191", new Object[]{this})).booleanValue();
            }
            if (BackEventService.access$000(BackEventService.this) == null) {
                return false;
            }
            boolean c = BackEventService.access$000(BackEventService.this).c("swipe");
            ir9.b(BackEventService.TAG, "滑动拦截判断 enableInterceptBack=" + c);
            return c;
        }
    }

    static {
        t2o.a(468713872);
        t2o.a(468713874);
    }

    public BackEventService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mBackEventManager = new ln1(fluidContext);
    }

    public static /* synthetic */ on1 access$000(BackEventService backEventService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (on1) ipChange.ipc$dispatch("5ada8391", new Object[]{backEventService});
        }
        return backEventService.mBackInterceptHelper;
    }

    public static /* synthetic */ FluidContext access$100(BackEventService backEventService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("7fcd282", new Object[]{backEventService});
        }
        return backEventService.mFluidContext;
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void acceptEnableInterceptBackMsg(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456886b1", new Object[]{this, vrpVar});
            return;
        }
        on1 on1Var = this.mBackInterceptHelper;
        if (on1Var != null) {
            on1Var.a(vrpVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void addBackEventListener(yhb yhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c3d791", new Object[]{this, yhbVar});
        } else {
            this.mBackEventManager.addBackEventListener(yhbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public qn1 getBackKeyEventDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qn1) ipChange.ipc$dispatch("3e8006f4", new Object[]{this});
        }
        return this.mBackKeyEventDetector;
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void handleExitFullPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76841cb", new Object[]{this});
        } else if (this.mHostPageInterfaceService.getPageInterface() != null) {
            this.mHostPageInterfaceService.getPageInterface().onBackButtonClick();
        } else if (this.mFluidContext.getContext() instanceof Activity) {
            ((Activity) this.mFluidContext.getContext()).finish();
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.yhb
    public void onBackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
        } else {
            this.mBackEventManager.onBackClick();
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mHostPageInterfaceService = (IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class);
        this.mLifecycleService.addPageLifecycleListener(this);
        this.mBackInterceptHelper = new on1();
        this.mBackKeyEventDetector = new qn1();
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mBackKeyEventDetector.b();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void removeBackEventListener(yhb yhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e8c4e", new Object[]{this, yhbVar});
        } else {
            this.mBackEventManager.removeBackEventListener(yhbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void setBackInterceptListener(GestureLayout gestureLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29ec833", new Object[]{this, gestureLayout});
        } else {
            gestureLayout.setBackInterceptListener(new a());
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public boolean tryToInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404f5de", new Object[]{this})).booleanValue();
        }
        on1 on1Var = this.mBackInterceptHelper;
        if (on1Var == null || !on1Var.c("click")) {
            return false;
        }
        ir9.b(TAG, "点击/系统返回拦截 sendBackClickMsg");
        this.mBackInterceptHelper.d(this.mFluidContext, "click");
        return true;
    }
}
