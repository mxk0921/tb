package com.taobao.android.fluid.framework.lifecycle;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import tb.ir9;
import tb.o6d;
import tb.od0;
import tb.olk;
import tb.t2o;
import tb.vng;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LifecycleService implements ILifecycleService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LifecycleService";
    private final FluidContext mFluidContext;
    private final olk<o6d> mPageObserverList = new olk<>();
    private int mPageState = -1;
    private final vng mLifecycleServiceConfig = new vng();

    static {
        t2o.a(468714442);
        t2o.a(468714441);
    }

    public LifecycleService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public void addPageLifecycleListener(o6d o6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69781a", new Object[]{this, o6dVar});
        } else if (o6dVar != null) {
            this.mPageObserverList.a(o6dVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public vng getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vng) ipChange.ipc$dispatch("e14d2f7a", new Object[]{this});
        }
        return this.mLifecycleServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public int getPageState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("450b8306", new Object[]{this})).intValue();
        }
        return this.mPageState;
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public boolean isFinish() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5fb8c68", new Object[]{this})).booleanValue();
        }
        if (((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface() == null || !((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface().isFinishing()) {
            z = false;
        } else {
            z = true;
        }
        if (!(this.mFluidContext.getContext() instanceof Activity) || !((Activity) this.mFluidContext.getContext()).isFinishing()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public boolean isNavigationBarVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a835468", new Object[]{this})).booleanValue();
        }
        return od0.D().f().C();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onDestroy 被执行 监听者数量：" + this.mPageObserverList.c());
        this.mPageState = 5;
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onDestroy();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onDestroy", e);
            }
        }
        a.a().d(this.mFluidContext.getContext());
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onPause 被执行 监听者数量：" + this.mPageObserverList.c());
        this.mPageState = 3;
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onPause();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onPause", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onRealStart 被执行 监听者数量：" + this.mPageObserverList.c());
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onRealStart();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onRealStart", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onRealStop 被执行 监听者数量：" + this.mPageObserverList.c());
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onRealStop();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onRealStop", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onResume 被执行 监听者数量：" + this.mPageObserverList.c());
        this.mPageState = 2;
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onResume();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onResume", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onStop 被执行 监听者数量：" + this.mPageObserverList.c());
        this.mPageState = 4;
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onStop();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onStop", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public void removePageLifecycleListener(o6d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4507f2c", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.mPageObserverList.e(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public void addPageLifecycleListener(o6d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53b6baf", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.mPageObserverList.a(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onCreate 被执行, 监听者数量：" + this.mPageObserverList.c() + "; " + this.mFluidContext.getInstanceConfig());
        this.mPageState = 0;
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onCreate();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onCreate", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ir9.b(TAG, "IPageLifecycle.onStart 被执行 监听者数量：" + this.mPageObserverList.c());
        this.mPageState = 1;
        for (o6d o6dVar : this.mPageObserverList.b()) {
            try {
                o6dVar.onStart();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, o6dVar, "onStart", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public void removePageLifecycleListener(o6d o6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef45897", new Object[]{this, o6dVar});
        } else if (o6dVar != null) {
            this.mPageObserverList.e(o6dVar);
        }
    }
}
