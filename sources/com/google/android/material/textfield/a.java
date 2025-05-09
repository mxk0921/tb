package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.material.textfield.TextInputLayout;
import com.taobao.taobao.R;
import tb.ge8;
import tb.pz0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a extends ge8 {
    public final TextWatcher d = new C0258a();
    public final View.OnFocusChangeListener e = new b();
    public final TextInputLayout.e f = new c();
    public final TextInputLayout.f g = new d();
    public AnimatorSet h;
    public ValueAnimator i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            boolean z2;
            if (TextUtils.isEmpty(((EditText) view).getText()) || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            a.this.i(z2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements TextInputLayout.e {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e
        public void a(TextInputLayout textInputLayout) {
            boolean z;
            EditText editText = textInputLayout.getEditText();
            if (!editText.hasFocus() || !a.l(editText.getText())) {
                z = false;
            } else {
                z = true;
            }
            textInputLayout.setEndIconVisible(z);
            textInputLayout.setEndIconCheckable(false);
            a aVar = a.this;
            editText.setOnFocusChangeListener(aVar.e);
            editText.removeTextChangedListener(aVar.d);
            editText.addTextChangedListener(aVar.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements TextInputLayout.f {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                a aVar = a.this;
                editText.removeTextChangedListener(aVar.d);
                if (editText.getOnFocusChangeListener() == aVar.e) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f19927a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f19927a.setEndIconVisible(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f19927a.setEndIconVisible(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.c.setScaleX(floatValue);
            a.this.c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean l(Editable editable) {
        if (editable.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // tb.ge8
    public void a() {
        Drawable drawable = AppCompatResources.getDrawable(this.b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.f19927a;
        textInputLayout.setEndIconDrawable(drawable);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new e());
        textInputLayout.addOnEditTextAttachedListener(this.f);
        textInputLayout.addOnEndIconChangedListener(this.g);
        m();
    }

    @Override // tb.ge8
    public void c(boolean z) {
        if (this.f19927a.getSuffixText() != null) {
            i(z);
        }
    }

    public final void i(boolean z) {
        boolean z2;
        if (this.f19927a.isEndIconVisible() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(pz0.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(pz0.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public final void m() {
        ValueAnimator k = k();
        ValueAnimator j = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(k, j);
        this.h.addListener(new f());
        ValueAnimator j2 = j(1.0f, 0.0f);
        this.i = j2;
        j2.addListener(new g());
    }

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0258a implements TextWatcher {
        public C0258a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a aVar = a.this;
            if (aVar.f19927a.getSuffixText() == null) {
                aVar.i(a.l(editable));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
