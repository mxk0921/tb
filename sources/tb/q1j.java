package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q1j implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26448a;
    private eid b;
    private boolean c;
    private float d;

    static {
        t2o.a(481297406);
    }

    public q1j(boolean z, eid eidVar) {
        ckf.g(eidVar, f8v.KEY_TARGET_VIEW);
        this.f26448a = z;
        this.b = eidVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        ckf.g(valueAnimator, "animation");
        if (!this.c) {
            this.c = true;
            if (this.f26448a) {
                f = this.b.getImageView().getTranslationX();
            } else {
                f = this.b.getImageView().getTranslationY();
            }
            this.d = f;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f26448a) {
                this.b.setImageTranslationX(this.d + floatValue);
            } else {
                this.b.setImageTranslationY(this.d + floatValue);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }
}
