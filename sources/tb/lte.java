package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lte {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23554a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public int f;
    public Animator g;
    public final float h;
    public int i;
    public int j;
    public CharSequence k;
    public boolean l;
    public TextView m;
    public CharSequence n;
    public int o;
    public ColorStateList p;
    public CharSequence q;
    public boolean r;
    public TextView s;
    public int t;
    public ColorStateList u;
    public Typeface v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f23555a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.f23555a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            lte lteVar = lte.this;
            lteVar.i = this.f23555a;
            lteVar.g = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && lteVar.m != null) {
                    lteVar.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public lte(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f23554a = context;
        this.b = textInputLayout;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void A(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.c != null) {
            if (!x(i) || (frameLayout = this.e) == null) {
                this.c.removeView(textView);
            } else {
                int i2 = this.f - 1;
                this.f = i2;
                L(frameLayout, i2);
                this.e.removeView(textView);
            }
            int i3 = this.d - 1;
            this.d = i3;
            L(this.c, i3);
        }
    }

    public final void B(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.i = i2;
        }
    }

    public void C(CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void D(boolean z) {
        if (this.l != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f23554a);
                this.m = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                this.m.setTextAlignment(5);
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                E(this.o);
                F(this.p);
                C(this.n);
                this.m.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.m, 1);
                d(this.m, 0);
            } else {
                t();
                A(this.m, 0);
                this.m = null;
                TextInputLayout textInputLayout = this.b;
                textInputLayout.updateEditTextBackground();
                textInputLayout.updateTextInputBoxState();
            }
            this.l = z;
        }
    }

    public void E(int i) {
        this.o = i;
        TextView textView = this.m;
        if (textView != null) {
            this.b.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    public void F(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void G(int i) {
        this.t = i;
        TextView textView = this.s;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public void H(boolean z) {
        if (this.r != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f23554a);
                this.s = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                this.s.setTextAlignment(5);
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.s.setTypeface(typeface);
                }
                this.s.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.s, 1);
                G(this.t);
                I(this.u);
                d(this.s, 1);
            } else {
                u();
                A(this.s, 1);
                this.s = null;
                TextInputLayout textInputLayout = this.b;
                textInputLayout.updateEditTextBackground();
                textInputLayout.updateTextInputBoxState();
            }
            this.r = z;
        }
    }

    public void I(ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void J(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void K(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            J(this.m, typeface);
            J(this.s, typeface);
        }
    }

    public final void L(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean M(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.b;
        if (!ViewCompat.isLaidOut(textInputLayout) || !textInputLayout.isEnabled() || (this.j == this.i && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public void N(CharSequence charSequence) {
        g();
        this.k = charSequence;
        this.m.setText(charSequence);
        int i = this.i;
        if (i != 1) {
            this.j = 1;
        }
        P(i, this.j, M(this.m, charSequence));
    }

    public void O(CharSequence charSequence) {
        g();
        this.q = charSequence;
        this.s.setText(charSequence);
        int i = this.i;
        if (i != 2) {
            this.j = 2;
        }
        P(i, this.j, M(this.s, charSequence));
    }

    public final void P(int i, int i2, boolean z) {
        if (i != i2) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.g = animatorSet;
                ArrayList arrayList = new ArrayList();
                h(arrayList, this.r, this.s, 2, i, i2);
                h(arrayList, this.l, this.m, 1, i, i2);
                tz0.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i2, l(i), i, l(i2)));
                animatorSet.start();
            } else {
                B(i, i2);
            }
            TextInputLayout textInputLayout = this.b;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateLabelState(z);
            textInputLayout.updateTextInputBoxState();
        }
    }

    public void d(TextView textView, int i) {
        if (this.c == null && this.e == null) {
            Context context = this.f23554a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                e();
            }
        }
        if (x(i)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public void e() {
        if (f()) {
            LinearLayout linearLayout = this.c;
            TextInputLayout textInputLayout = this.b;
            ViewCompat.setPaddingRelative(linearLayout, ViewCompat.getPaddingStart(textInputLayout.getEditText()), 0, ViewCompat.getPaddingEnd(textInputLayout.getEditText()), 0);
        }
    }

    public final boolean f() {
        if (this.c == null || this.b.getEditText() == null) {
            return false;
        }
        return true;
    }

    public void g() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(i(textView, z2));
                if (i3 == i) {
                    list.add(j(textView));
                }
            }
        }
    }

    public final ObjectAnimator i(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(pz0.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    public final ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(pz0.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        return ofFloat;
    }

    public boolean k() {
        return v(this.j);
    }

    public final TextView l(int i) {
        if (i == 1) {
            return this.m;
        }
        if (i != 2) {
            return null;
        }
        return this.s;
    }

    public CharSequence m() {
        return this.n;
    }

    public CharSequence n() {
        return this.k;
    }

    public int o() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence q() {
        return this.q;
    }

    public int r() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public boolean s() {
        return w(this.i);
    }

    public void t() {
        this.k = null;
        g();
        if (this.i == 1) {
            if (!this.r || TextUtils.isEmpty(this.q)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        P(this.i, this.j, M(this.m, null));
    }

    public void u() {
        g();
        int i = this.i;
        if (i == 2) {
            this.j = 0;
        }
        P(i, this.j, M(this.s, null));
    }

    public final boolean v(int i) {
        if (i != 1 || this.m == null || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return true;
    }

    public final boolean w(int i) {
        if (i != 2 || this.s == null || TextUtils.isEmpty(this.q)) {
            return false;
        }
        return true;
    }

    public boolean x(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean y() {
        return this.l;
    }

    public boolean z() {
        return this.r;
    }
}
