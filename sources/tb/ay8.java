package tb;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
class ay8 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f16072a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;

    public ay8(View view, float f, float f2, float f3, float f4) {
        this.f16072a = view;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16072a.setAlpha(weu.b(this.b, this.c, this.d, this.e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
