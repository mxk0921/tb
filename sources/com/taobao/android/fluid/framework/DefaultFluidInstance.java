package com.taobao.android.fluid.framework;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import tb.h57;
import tb.ir9;
import tb.s0j;
import tb.t2o;
import tb.tq9;
import tb.udp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DefaultFluidInstance implements FluidInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_PREFIX = "FluidInstance@";
    private static final String TAG = "DefaultFluidInstance";
    private final FluidInstanceConfig mFluidInstanceConfig;
    private ILifecycleService mILifecycleService;
    private boolean mIsDestroyed = false;
    private final FluidContext mFluidContext = this;
    private final udp mFluidServiceManager = new udp(this);

    static {
        t2o.a(468713792);
        t2o.a(468713783);
    }

    public DefaultFluidInstance(FluidInstanceConfig fluidInstanceConfig) {
        this.mFluidInstanceConfig = fluidInstanceConfig;
        try {
            createServices();
        } catch (Exception e) {
            FluidException.throwException(this, FluidInstance.INSTANCE_NEW_INSTANCE_ERROR, e);
        }
    }

    private void createServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2a9101", new Object[]{this});
            return;
        }
        ir9.b(TAG, "创建服务开始");
        if (this.mFluidInstanceConfig.getFluidServiceRegistry() == null) {
            this.mFluidInstanceConfig.setFluidServiceRegistry(new h57());
        }
        this.mFluidServiceManager.k(this, this.mFluidInstanceConfig.getFluidServiceRegistry());
        tq9 fluidInstanceAnalysis = ((IAnalysisService) getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.c();
        FluidInstanceAnalysis.Stage stage = FluidInstanceAnalysis.Stage.CREATE_SERVICE;
        fluidInstanceAnalysis.f(stage.name());
        this.mILifecycleService = (ILifecycleService) getService(ILifecycleService.class);
        ((ISceneConfigService) getService(ISceneConfigService.class)).refreshInstanceConfig(this.mFluidInstanceConfig);
        ((ITrackService) getService(ITrackService.class)).setPageStartTime(this.mFluidContext);
        if (this.mFluidContext.getContext() instanceof Activity) {
            FluidContext fluidContext = this.mFluidContext;
            s0j.v(fluidContext, (Activity) fluidContext.getContext());
        }
        this.mFluidServiceManager.e();
        fluidInstanceAnalysis.e(stage.name());
        ir9.b(TAG, "创建服务成功");
    }

    private void destroyServices(udp udpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51f9dbb", new Object[]{this, udpVar});
            return;
        }
        ir9.b(TAG, "销毁服务开始");
        tq9 fluidInstanceAnalysis = ((IAnalysisService) getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        FluidInstanceAnalysis.Stage stage = FluidInstanceAnalysis.Stage.FIST_CARD;
        fluidInstanceAnalysis.f(stage.name());
        udpVar.f();
        fluidInstanceAnalysis.e(stage.name());
        fluidInstanceAnalysis.b("succeed");
        ir9.b(TAG, "销毁服务成功");
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mFluidInstanceConfig.getContext();
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public FluidInstanceConfig getInstanceConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstanceConfig) ipChange.ipc$dispatch("23103fbc", new Object[]{this});
        }
        return this.mFluidInstanceConfig;
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return INSTANCE_PREFIX + hashCode();
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public <T extends FluidService> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((FluidService) ipChange.ipc$dispatch("90661d2b", new Object[]{this, cls}));
        }
        return (T) this.mFluidServiceManager.g(cls);
    }

    @Override // com.taobao.android.fluid.core.FluidInstance
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.mIsDestroyed;
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.mILifecycleService.onCreate();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.mILifecycleService.onPause();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        } else {
            this.mILifecycleService.onRealStart();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        } else {
            this.mILifecycleService.onRealStop();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.mILifecycleService.onResume();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.mILifecycleService.onStart();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.mILifecycleService.onStop();
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (getInstanceConfig() == null) {
            str = "";
        } else {
            str = getInstanceConfig().getBizName();
        }
        return "[" + str + "_" + getInstanceId() + "]";
    }

    public void tryCreateRemoteService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2165abf", new Object[]{this});
            return;
        }
        ir9.b(TAG, "tryCreateRemoteService");
        if (this.mFluidInstanceConfig.getFluidServiceRegistry() == null) {
            this.mFluidInstanceConfig.setFluidServiceRegistry(new h57());
        }
        this.mFluidServiceManager.j(this, this.mFluidInstanceConfig.getFluidServiceRegistry());
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public void updateInstanceConfig(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c880351", new Object[]{this, fluidInstanceConfig});
            return;
        }
        this.mFluidInstanceConfig.append(fluidInstanceConfig);
        ISceneConfigService iSceneConfigService = (ISceneConfigService) getService(ISceneConfigService.class);
        if (iSceneConfigService != null) {
            iSceneConfigService.refreshInstanceConfig(this.mFluidInstanceConfig);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (isDestroyed()) {
            ir9.b(TAG, "实例已销毁，无需重复执行 onDestroy");
        } else {
            this.mILifecycleService.onDestroy();
            destroyServices(this.mFluidServiceManager);
            FluidSDK.removeFluidInstance(this.mFluidInstanceConfig.getBizName());
            this.mIsDestroyed = true;
        }
    }
}
