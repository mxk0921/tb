package com.taobao.android.fluid.framework.quickopen;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.oeu;
import tb.r2e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QuickOpenService implements IQuickOpenService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IQuickOpenService";
    private final String TAG = "QuickOpenService";
    private final FluidContext mFluidContext;
    private boolean mIsInQuickOpenMode;
    private boolean mIsQuickOpenMode;
    public TUrlImageView mLoadingImage;
    private final oeu mTransitionAnimManager;
    private boolean mUsePreSize;

    static {
        t2o.a(468714740);
        t2o.a(468714739);
    }

    public QuickOpenService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mTransitionAnimManager = new oeu(fluidContext);
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void addTransitionAnimListener(r2e r2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb8d566", new Object[]{this, r2eVar});
        } else {
            this.mTransitionAnimManager.addTransitionAnimListener(r2eVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public TUrlImageView getLoadingImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("525dc880", new Object[]{this});
        }
        return this.mLoadingImage;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isInQuickOpenMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbf1b76", new Object[]{this})).booleanValue();
        }
        return this.mIsInQuickOpenMode;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isQuickOpenMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a374bf9b", new Object[]{this})).booleanValue();
        }
        return this.mIsQuickOpenMode;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isTransitionAnimEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3281bcf6", new Object[]{this})).booleanValue();
        }
        return this.mTransitionAnimManager.isTransitionAnimEnd();
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isUsePreSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("146abf92", new Object[]{this})).booleanValue();
        }
        return this.mUsePreSize;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService, tb.r2e
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
        } else {
            this.mTransitionAnimManager.onAnimationEnd();
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService, tb.r2e
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
        } else {
            this.mTransitionAnimManager.onAnimationStart();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void removeTransitionAnimListener(r2e r2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37d70a3", new Object[]{this, r2eVar});
        } else {
            this.mTransitionAnimManager.removeTransitionAnimListener(r2eVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setInQuickOpenMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeee8da", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsInQuickOpenMode = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setLoadingImage(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68d4dee", new Object[]{this, tUrlImageView});
        } else {
            this.mLoadingImage = tUrlImageView;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setQuickOpenMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fd3755", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsQuickOpenMode = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setUsePreSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6560dece", new Object[]{this, new Boolean(z)});
        } else {
            this.mUsePreSize = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void addTransitionAnimListener(r2e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82ebcfb", new Object[]{this, aVar});
        } else {
            this.mTransitionAnimManager.addTransitionAnimListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void removeTransitionAnimListener(r2e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d76cb38", new Object[]{this, aVar});
        } else {
            this.mTransitionAnimManager.removeTransitionAnimListener(aVar);
        }
    }
}
