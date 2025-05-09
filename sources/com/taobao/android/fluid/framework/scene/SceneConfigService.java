package com.taobao.android.fluid.framework.scene;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.HashMap;
import java.util.Map;
import tb.ato;
import tb.enc;
import tb.iep;
import tb.ir9;
import tb.mca;
import tb.nto;
import tb.nwv;
import tb.pep;
import tb.rch;
import tb.t2o;
import tb.wfc;
import tb.zod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SceneConfigService implements ISceneConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SceneConfigService";
    private IDataService mDataService;
    private final FluidContext mFluidContext;
    private mca mGlobalState;
    private boolean mIsItemRecognizeShowing;
    private enc mLockListListener;
    private final ato mSceneConfigListenerManager;
    private final nto mSceneParamsManager;
    private final rch mSlidePageLockConfigure = new rch();

    static {
        t2o.a(468714752);
        t2o.a(468714751);
    }

    public SceneConfigService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        ato atoVar = new ato(fluidContext);
        this.mSceneConfigListenerManager = atoVar;
        this.mSceneParamsManager = new nto(atoVar);
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void addInstanceConfigChangedListener(wfc wfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f907f64f", new Object[]{this, wfcVar});
        } else {
            this.mSceneConfigListenerManager.c(wfcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void addSessionParamsChangedListener(zod zodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94481887", new Object[]{this, zodVar});
        } else {
            this.mSceneConfigListenerManager.d(zodVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public mca getGlobalState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mca) ipChange.ipc$dispatch("8853b5c6", new Object[]{this});
        }
        return this.mGlobalState;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public enc getLockListListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enc) ipChange.ipc$dispatch("d46bed18", new Object[]{this});
        }
        return this.mLockListListener;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public iep getSessionExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iep) ipChange.ipc$dispatch("d4815cc2", new Object[]{this});
        }
        if (this.mSceneParamsManager.a() != null) {
            return this.mSceneParamsManager.a().b();
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public pep getSessionParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pep) ipChange.ipc$dispatch("674b746", new Object[]{this});
        }
        return this.mSceneParamsManager.a();
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public rch getSlidePageLockConfigure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rch) ipChange.ipc$dispatch("d1697b12", new Object[]{this});
        }
        return this.mSlidePageLockConfigure;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public boolean isItemRecognizeShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3742f5f", new Object[]{this})).booleanValue();
        }
        return this.mIsItemRecognizeShowing;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void mergeTab3ExtParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae3286d", new Object[]{this, map});
        } else {
            this.mSceneParamsManager.e(this.mFluidContext, map);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        this.mSlidePageLockConfigure.a(true, false);
        this.mGlobalState = new mca();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void refreshInstanceConfig(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad4b47f", new Object[]{this, fluidInstanceConfig});
        } else {
            this.mSceneParamsManager.j(this.mFluidContext, fluidInstanceConfig);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void refreshSessionParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e1b1dd", new Object[]{this, map});
        } else {
            this.mSceneParamsManager.k(map);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void removeInstanceConfigChangedListener(wfc wfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecc918c", new Object[]{this, wfcVar});
        } else {
            this.mSceneConfigListenerManager.e(wfcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void removeSessionParamsChangedListener(zod zodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48045f04", new Object[]{this, zodVar});
        } else {
            this.mSceneConfigListenerManager.f(zodVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void setItemRecognizeShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158dcea1", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsItemRecognizeShowing = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void setLockListListener(enc encVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76435842", new Object[]{this, encVar});
        } else {
            this.mLockListListener = encVar;
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void updateGlobalParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b87046c", new Object[]{this, map});
            return;
        }
        ir9.b(TAG, "updateGlobalParams " + map);
        pep sessionParams = getSessionParams();
        HashMap<String, String> c = nwv.c(map);
        if (sessionParams != null) {
            sessionParams.f(c);
        }
    }
}
