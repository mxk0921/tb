package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qro implements ajw {

    /* renamed from: a  reason: collision with root package name */
    public float f26898a;
    public boolean b;

    public qro() {
        this(true);
    }

    public static Animator c(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f, f2));
    }

    @Override // tb.ajw
    public Animator a(ViewGroup viewGroup, View view) {
        if (!this.b) {
            return null;
        }
        return c(view, 1.0f, 1.1f);
    }

    @Override // tb.ajw
    public Animator b(ViewGroup viewGroup, View view) {
        return c(view, this.f26898a, 1.0f);
    }

    public void d(float f) {
        this.f26898a = f;
    }

    public void e(boolean z) {
        this.b = z;
    }

    public qro(boolean z) {
        this.f26898a = 0.8f;
        this.b = true;
    }
}
