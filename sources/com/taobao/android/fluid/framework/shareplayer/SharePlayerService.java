package com.taobao.android.fluid.framework.shareplayer;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.avplayer.r;
import tb.atb;
import tb.g7m;
import tb.ir9;
import tb.l9f;
import tb.ogi;
import tb.qv4;
import tb.t2o;
import tb.wjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SharePlayerService implements ISharePlayerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "ISharePlayerService";
    private static final String TAG = "SharePlayerService";
    private atb mDWInstance;
    private boolean mEnableInnerSharePlayer;
    private final FluidContext mFluidContext;
    private boolean mSharePlayerViewStateNoPlaying;
    private boolean mStillShareVideo;
    private boolean mHasCreateDWInstance = false;
    private boolean mHasShowInnerSharePlayerPV = false;
    private boolean mEnableSharePlayer = false;
    private final wjp mSharePlayerServiceConfig = new wjp();

    static {
        t2o.a(468714768);
        t2o.a(468714767);
    }

    public SharePlayerService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    private String getCoverKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe2dfd1b", new Object[]{this});
        }
        return this.mFluidContext.getInstanceConfig().getPreCoverKey();
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void clearSharePlayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c617d64", new Object[]{this, str});
            return;
        }
        r i = ogi.e().i(str);
        boolean b = ogi.e().b(str);
        if (i != null && b) {
            g7m.o().g(true, ogi.e().h(str));
            ogi.e().c();
            if (wjp.a()) {
                i.y();
            }
        }
        l9f.f().d(str);
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public wjp getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wjp) ipChange.ipc$dispatch("2ef31fda", new Object[]{this});
        }
        return this.mSharePlayerServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public atb getDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("3f62c678", new Object[]{this});
        }
        return this.mDWInstance;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isEnableInnerSharePlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9bbbde2", new Object[]{this})).booleanValue();
        }
        return this.mEnableInnerSharePlayer;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isEnableSharePlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fb1651e", new Object[]{this})).booleanValue();
        }
        return this.mEnableSharePlayer;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isHasCreateDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d927ff", new Object[]{this})).booleanValue();
        }
        return this.mHasCreateDWInstance;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isHasShowInnerSharePlayerPV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52a808", new Object[]{this})).booleanValue();
        }
        return this.mHasShowInnerSharePlayerPV;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isSharePlayerViewStateNoPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f8ef362", new Object[]{this})).booleanValue();
        }
        return this.mSharePlayerViewStateNoPlaying;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isStillShareVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0a58ca5", new Object[]{this})).booleanValue();
        }
        return this.mStillShareVideo;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
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
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        initSharePlayer();
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        String coverKey = getCoverKey();
        if (!((IQuickOpenService) this.mFluidContext.getService(IQuickOpenService.class)).isTransitionAnimEnd()) {
            clearSharePlayer(coverKey);
        }
        qv4.c().a(coverKey);
        atb atbVar = this.mDWInstance;
        if (atbVar != null) {
            atbVar.destroy();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if ((this.mFluidContext.getContext() instanceof Activity) && ((Activity) this.mFluidContext.getContext()).isFinishing() && !((IQuickOpenService) this.mFluidContext.getService(IQuickOpenService.class)).isTransitionAnimEnd()) {
            clearSharePlayer(getCoverKey());
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setDWInstance(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be96e852", new Object[]{this, atbVar});
        } else {
            this.mDWInstance = atbVar;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setEnableInnerSharePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6df3e7e", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableInnerSharePlayer = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setEnableSharePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5259e632", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableSharePlayer = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setHasCreateDWInstance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3821171", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasCreateDWInstance = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setHasShowInnerSharePlayerPV(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86144888", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasShowInnerSharePlayerPV = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void initSharePlayer() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803a78f7", new Object[]{this});
            return;
        }
        String coverKey = getCoverKey();
        boolean z2 = ogi.e().b(coverKey) || l9f.f().o(coverKey);
        boolean m = ogi.e().m(coverKey);
        if (z2 && m) {
            z = true;
        }
        this.mStillShareVideo = z;
        ((ISharePlayerService) this.mFluidContext.getService(ISharePlayerService.class)).getConfig().e(ogi.e().k(coverKey));
        r i = ogi.e().i(coverKey);
        if (!(i == null || m || i.H() == 1)) {
            ir9.b(TAG, "view续播，播放器state" + i.H());
            this.mSharePlayerViewStateNoPlaying = true;
        }
        setEnableSharePlayer(z2);
    }
}
