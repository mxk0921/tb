package com.google.android.material.transition.platform;

import android.animation.ValueAnimator;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MaterialContainerTransform.c f5207a;
    final /* synthetic */ MaterialContainerTransform b;

    public a(MaterialContainerTransform materialContainerTransform, MaterialContainerTransform.c cVar) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5207a.b(valueAnimator.getAnimatedFraction());
    }
}
