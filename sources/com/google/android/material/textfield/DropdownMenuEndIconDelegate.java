package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.google.android.material.textfield.TextInputLayout;
import com.taobao.taobao.R;
import tb.ge8;
import tb.h08;
import tb.l7i;
import tb.pz0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DropdownMenuEndIconDelegate extends ge8 {
    public final TextInputLayout.AccessibilityDelegate f;
    public StateListDrawable l;
    public MaterialShapeDrawable m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;
    public final TextWatcher d = new a();
    public final View.OnFocusChangeListener e = new c();
    public final TextInputLayout.e g = new e();
    public final TextInputLayout.f h = new f();
    public boolean i = false;
    public boolean j = false;
    public long k = Long.MAX_VALUE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropdownMenuEndIconDelegate.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
            dropdownMenuEndIconDelegate.f19927a.setEndIconActivated(z);
            if (!z) {
                dropdownMenuEndIconDelegate.B(false);
                dropdownMenuEndIconDelegate.i = false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends TextInputLayout.AccessibilityDelegate {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DropdownMenuEndIconDelegate.this.f19927a.getEditText().getKeyListener() == null) {
                accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
            }
            if (accessibilityNodeInfoCompat.isShowingHintText()) {
                accessibilityNodeInfoCompat.setHintText(null);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
            AutoCompleteTextView w = dropdownMenuEndIconDelegate.w(dropdownMenuEndIconDelegate.f19927a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && dropdownMenuEndIconDelegate.n.isTouchExplorationEnabled()) {
                dropdownMenuEndIconDelegate.E(w);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements TextInputLayout.e {
        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
            AutoCompleteTextView w = dropdownMenuEndIconDelegate.w(editText);
            dropdownMenuEndIconDelegate.C(w);
            dropdownMenuEndIconDelegate.t(w);
            dropdownMenuEndIconDelegate.D(w);
            w.setThreshold(0);
            w.removeTextChangedListener(dropdownMenuEndIconDelegate.d);
            w.addTextChangedListener(dropdownMenuEndIconDelegate.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(dropdownMenuEndIconDelegate.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements TextInputLayout.f {
        public f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                autoCompleteTextView.removeTextChangedListener(dropdownMenuEndIconDelegate.d);
                if (autoCompleteTextView.getOnFocusChangeListener() == dropdownMenuEndIconDelegate.e) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
            dropdownMenuEndIconDelegate.E((AutoCompleteTextView) dropdownMenuEndIconDelegate.f19927a.getEditText());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f5167a;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.f5167a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                if (dropdownMenuEndIconDelegate.A()) {
                    dropdownMenuEndIconDelegate.i = false;
                }
                dropdownMenuEndIconDelegate.E(this.f5167a);
            }
            return false;
        }
    }

    public DropdownMenuEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f = new d(textInputLayout);
    }

    public final boolean A() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            return true;
        }
        return false;
    }

    public final void B(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }

    public final void C(AutoCompleteTextView autoCompleteTextView) {
        int boxBackgroundMode = this.f19927a.getBoxBackgroundMode();
        if (boxBackgroundMode == 2) {
            autoCompleteTextView.setDropDownBackgroundDrawable(this.m);
        } else if (boxBackgroundMode == 1) {
            autoCompleteTextView.setDropDownBackgroundDrawable(this.l);
        }
    }

    public final void D(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.e);
        autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.8
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public void onDismiss() {
                DropdownMenuEndIconDelegate.this.i = true;
                DropdownMenuEndIconDelegate.this.k = System.currentTimeMillis();
                DropdownMenuEndIconDelegate.this.B(false);
            }
        });
    }

    public final void E(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (A()) {
                this.i = false;
            }
            if (!this.i) {
                B(!this.j);
                if (this.j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.i = false;
        }
    }

    @Override // tb.ge8
    public void a() {
        Context context = this.b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable y = y(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable y2 = y(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = y;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, y);
        this.l.addState(new int[0], y2);
        Drawable drawable = AppCompatResources.getDrawable(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.f19927a;
        textInputLayout.setEndIconDrawable(drawable);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new g());
        textInputLayout.addOnEditTextAttachedListener(this.g);
        textInputLayout.addOnEndIconChangedListener(this.h);
        z();
        ViewCompat.setImportantForAccessibility(this.c, 2);
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // tb.ge8
    public boolean b(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final void t(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            TextInputLayout textInputLayout = this.f19927a;
            int boxBackgroundMode = textInputLayout.getBoxBackgroundMode();
            MaterialShapeDrawable boxBackground = textInputLayout.getBoxBackground();
            int c2 = l7i.c(autoCompleteTextView, R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                v(autoCompleteTextView, c2, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                u(autoCompleteTextView, c2, iArr, boxBackground);
            }
        }
    }

    public final void u(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, MaterialShapeDrawable materialShapeDrawable) {
        int boxBackgroundColor = this.f19927a.getBoxBackgroundColor();
        ViewCompat.setBackground(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, new int[]{l7i.f(i, boxBackgroundColor, 0.1f), boxBackgroundColor}), materialShapeDrawable, materialShapeDrawable));
    }

    public final void v(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, MaterialShapeDrawable materialShapeDrawable) {
        int c2 = l7i.c(autoCompleteTextView, R.attr.colorSurface);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int f2 = l7i.f(i, c2, 0.1f);
        materialShapeDrawable2.W(new ColorStateList(iArr, new int[]{f2, 0}));
        materialShapeDrawable2.setTint(c2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        ViewCompat.setBackground(autoCompleteTextView, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable}));
    }

    public final AutoCompleteTextView w(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final ValueAnimator x(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(pz0.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    public final MaterialShapeDrawable y(float f2, float f3, float f4, int i) {
        a.b a2 = com.google.android.material.shape.a.a();
        a2.D(f2);
        a2.H(f2);
        a2.u(f3);
        a2.y(f3);
        com.google.android.material.shape.a m = a2.m();
        MaterialShapeDrawable m2 = MaterialShapeDrawable.m(this.b, f4);
        m2.setShapeAppearanceModel(m);
        m2.Y(0, i, 0, i);
        return m2;
    }

    public final void z() {
        this.p = x(67, 0.0f, 1.0f);
        ValueAnimator x = x(50, 1.0f, 0.0f);
        this.o = x;
        x.addListener(new h08(this));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements TextWatcher {

        /* compiled from: Taobao */
        /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class RunnableC0257a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f5161a;

            public RunnableC0257a(AutoCompleteTextView autoCompleteTextView) {
                this.f5161a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f5161a.isPopupShowing();
                DropdownMenuEndIconDelegate.this.B(isPopupShowing);
                DropdownMenuEndIconDelegate.this.i = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
            AutoCompleteTextView w = dropdownMenuEndIconDelegate.w(dropdownMenuEndIconDelegate.f19927a.getEditText());
            w.post(new RunnableC0257a(w));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
