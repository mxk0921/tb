package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kp9 extends b {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends MaterialShapeDrawable {
        public a(com.google.android.material.shape.a aVar) {
            super(aVar);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public kp9(FloatingActionButton floatingActionButton, ogp ogpVar) {
        super(floatingActionButton, ogpVar);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void B() {
        h0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void D(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            FloatingActionButton floatingActionButton = this.x;
            if (floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(this.h);
                if (floatingActionButton.isPressed()) {
                    floatingActionButton.setTranslationZ(this.j);
                } else if (floatingActionButton.isFocused() || floatingActionButton.isHovered()) {
                    floatingActionButton.setTranslationZ(this.i);
                } else {
                    floatingActionButton.setTranslationZ(0.0f);
                }
            } else {
                floatingActionButton.setElevation(0.0f);
                floatingActionButton.setTranslationZ(0.0f);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void E(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.x;
        if (i == 21) {
            floatingActionButton.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.F, l0(f, f3));
            stateListAnimator.addState(b.G, l0(f, f2));
            stateListAnimator.addState(b.H, l0(f, f2));
            stateListAnimator.addState(b.I, l0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.E);
            stateListAnimator.addState(b.J, animatorSet);
            stateListAnimator.addState(b.K, l0(0.0f, 0.0f));
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (b0()) {
            h0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void X(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(zeo.d(colorStateList));
        } else {
            super.X(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public boolean b0() {
        if (((FloatingActionButton.c) this.y).a() || !d0()) {
            return true;
        }
        return false;
    }

    public mi2 k0(int i, ColorStateList colorStateList) {
        Context context = this.x.getContext();
        mi2 mi2Var = new mi2((com.google.android.material.shape.a) Preconditions.checkNotNull(this.f5094a));
        mi2Var.e(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        mi2Var.d(i);
        mi2Var.c(colorStateList);
        return mi2Var;
    }

    public final Animator l0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.x;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.E);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float m() {
        return this.x.getElevation();
    }

    public MaterialShapeDrawable m0() {
        return new a((com.google.android.material.shape.a) Preconditions.checkNotNull(this.f5094a));
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void r(Rect rect) {
        if (((FloatingActionButton.c) this.y).a()) {
            super.r(rect);
        } else if (!d0()) {
            int sizeDimension = (this.k - this.x.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        MaterialShapeDrawable m0 = m0();
        this.b = m0;
        m0.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.M(this.x.getContext());
        if (i > 0) {
            this.d = k0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.d), (Drawable) Preconditions.checkNotNull(this.b)});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(zeo.d(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void f0() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void z() {
    }
}
