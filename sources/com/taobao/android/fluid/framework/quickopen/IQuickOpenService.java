package com.taobao.android.fluid.framework.quickopen;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.r2e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IQuickOpenService extends FluidService, r2e {
    /* synthetic */ void addTransitionAnimListener(r2e.a aVar);

    /* synthetic */ void addTransitionAnimListener(r2e r2eVar);

    TUrlImageView getLoadingImage();

    boolean isInQuickOpenMode();

    boolean isQuickOpenMode();

    /* synthetic */ boolean isTransitionAnimEnd();

    boolean isUsePreSize();

    @Override // tb.r2e
    /* synthetic */ void onAnimationEnd();

    @Override // tb.r2e
    /* synthetic */ void onAnimationStart();

    /* synthetic */ void removeTransitionAnimListener(r2e.a aVar);

    /* synthetic */ void removeTransitionAnimListener(r2e r2eVar);

    void setInQuickOpenMode(boolean z);

    void setLoadingImage(TUrlImageView tUrlImageView);

    void setQuickOpenMode(boolean z);

    void setUsePreSize(boolean z);
}
