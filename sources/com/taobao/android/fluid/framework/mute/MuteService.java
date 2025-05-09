package com.taobao.android.fluid.framework.mute;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.helper.a;
import tb.jfj;
import tb.lfj;
import tb.t2o;
import tb.xxc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MuteService implements IMuteService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IMuteService";
    private final FluidContext mFluidContext;
    private jfj mMuteImpl;
    public boolean fadInForFirstTime = false;
    private boolean mIsMuteABTestForSettings = true;
    private final lfj mMuteFlagChangedManager = new lfj();

    static {
        t2o.a(468714561);
        t2o.a(468714560);
    }

    public MuteService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void addMuteFlagChangedListener(xxc xxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3070590", new Object[]{this, xxcVar});
        } else {
            this.mMuteFlagChangedManager.addMuteFlagChangedListener(xxcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public jfj getMuteImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfj) ipChange.ipc$dispatch("ca5a32a9", new Object[]{this});
        }
        return this.mMuteImpl;
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public boolean isFadInForFirstTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79fd0083", new Object[]{this})).booleanValue();
        }
        return this.fadInForFirstTime;
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public boolean isMuteABTestForSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3edc0f41", new Object[]{this})).booleanValue();
        }
        return this.mIsMuteABTestForSettings;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        } else {
            new a(this.mFluidContext);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService, tb.xxc
    public void onMuteFlagChanged(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea737bd", new Object[]{this, fluidContext, str, str2});
        } else {
            this.mMuteFlagChangedManager.onMuteFlagChanged(fluidContext, str, str2);
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void removeMuteFlagChangedListener(xxc xxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b995eb33", new Object[]{this, xxcVar});
        } else {
            this.mMuteFlagChangedManager.removeMuteFlagChangedListener(xxcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void setFadInForFirstTime(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8181b76d", new Object[]{this, new Boolean(z)});
        } else {
            this.fadInForFirstTime = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void setMuteABTestForSettings(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a197246f", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsMuteABTestForSettings = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void setMuteImpl(jfj jfjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac73541", new Object[]{this, jfjVar});
        } else {
            this.mMuteImpl = jfjVar;
        }
    }
}
