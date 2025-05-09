package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.transition.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class by8 implements ajw {

    /* renamed from: a  reason: collision with root package name */
    public float f16711a = 1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f16712a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;

        public a(View view, float f, float f2, float f3, float f4) {
            this.f16712a = view;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f16712a.setAlpha(b.k(this.b, this.c, this.d, this.e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    public static Animator c(View view, float f, float f2, float f3, float f4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f, f2, f3, f4));
        return ofFloat;
    }

    @Override // tb.ajw
    public Animator a(ViewGroup viewGroup, View view) {
        return c(view, 1.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // tb.ajw
    public Animator b(ViewGroup viewGroup, View view) {
        return c(view, 0.0f, 1.0f, 0.0f, this.f16711a);
    }

    public void d(float f) {
        this.f16711a = f;
    }
}
