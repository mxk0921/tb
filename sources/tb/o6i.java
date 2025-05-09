package tb;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class o6i {
    public static final int[] t = {16842912};
    public static final double u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f25166a;
    public final MaterialShapeDrawable c;
    public final MaterialShapeDrawable d;
    public final int e;
    public final int f;
    public int g;
    public Drawable h;
    public Drawable i;
    public ColorStateList j;
    public ColorStateList k;
    public com.google.android.material.shape.a l;
    public ColorStateList m;
    public Drawable n;
    public LayerDrawable o;
    public MaterialShapeDrawable p;
    public MaterialShapeDrawable q;
    public boolean s;
    public final Rect b = new Rect();
    public boolean r = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends InsetDrawable {
        public a(o6i o6iVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public o6i(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f25166a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.c = materialShapeDrawable;
        materialShapeDrawable.M(materialCardView.getContext());
        materialShapeDrawable.c0(-12303292);
        a.b v = materialShapeDrawable.getShapeAppearanceModel().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        int i3 = R.styleable.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.d = new MaterialShapeDrawable();
        N(v.m());
        Resources resources = materialCardView.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.mtrl_card_checked_icon_margin);
        this.f = resources.getDimensionPixelSize(R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    public boolean A() {
        return this.r;
    }

    public boolean B() {
        return this.s;
    }

    public void C(TypedArray typedArray) {
        Drawable drawable;
        MaterialCardView materialCardView = this.f25166a;
        ColorStateList a2 = u9i.a(materialCardView.getContext(), typedArray, R.styleable.MaterialCardView_strokeColor);
        this.m = a2;
        if (a2 == null) {
            this.m = ColorStateList.valueOf(-1);
        }
        this.g = typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(R.styleable.MaterialCardView_android_checkable, false);
        this.s = z;
        materialCardView.setLongClickable(z);
        this.k = u9i.a(materialCardView.getContext(), typedArray, R.styleable.MaterialCardView_checkedIconTint);
        I(u9i.d(materialCardView.getContext(), typedArray, R.styleable.MaterialCardView_checkedIcon));
        ColorStateList a3 = u9i.a(materialCardView.getContext(), typedArray, R.styleable.MaterialCardView_rippleColor);
        this.j = a3;
        if (a3 == null) {
            this.j = ColorStateList.valueOf(l7i.c(materialCardView, R.attr.colorControlHighlight));
        }
        G(u9i.a(materialCardView.getContext(), typedArray, R.styleable.MaterialCardView_cardForegroundColor));
        Y();
        V();
        Z();
        materialCardView.setBackgroundInternal(z(this.c));
        if (materialCardView.isClickable()) {
            drawable = p();
        } else {
            drawable = this.d;
        }
        this.h = drawable;
        materialCardView.setForeground(z(drawable));
    }

    public void D(int i, int i2) {
        int i3;
        int i4;
        if (this.o != null) {
            int i5 = this.e;
            int i6 = this.f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            MaterialCardView materialCardView = this.f25166a;
            if (materialCardView.getUseCompatPadding()) {
                i8 -= (int) Math.ceil(d() * 2.0f);
                i7 -= (int) Math.ceil(c() * 2.0f);
            }
            if (ViewCompat.getLayoutDirection(materialCardView) == 1) {
                i3 = i7;
                i4 = i5;
            } else {
                i4 = i7;
                i3 = i5;
            }
            this.o.setLayerInset(2, i4, this.e, i3, i8);
        }
    }

    public void E(boolean z) {
        this.r = z;
    }

    public void F(ColorStateList colorStateList) {
        this.c.W(colorStateList);
    }

    public void G(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.W(colorStateList);
    }

    public void H(boolean z) {
        this.s = z;
    }

    public void I(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable wrap = DrawableCompat.wrap(drawable.mutate());
            this.i = wrap;
            DrawableCompat.setTintList(wrap, this.k);
        }
        if (this.o != null) {
            this.o.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, f());
        }
    }

    public void J(ColorStateList colorStateList) {
        this.k = colorStateList;
        Drawable drawable = this.i;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    public void K(float f) {
        N(this.l.w(f));
        this.h.invalidateSelf();
        if (S() || R()) {
            U();
        }
        if (S()) {
            X();
        }
    }

    public void L(float f) {
        this.c.X(f);
        MaterialShapeDrawable materialShapeDrawable = this.d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.X(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.X(f);
        }
    }

    public void M(ColorStateList colorStateList) {
        this.j = colorStateList;
        Y();
    }

    public void N(com.google.android.material.shape.a aVar) {
        this.l = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        materialShapeDrawable.setShapeAppearanceModel(aVar);
        materialShapeDrawable.b0(!materialShapeDrawable.P());
        MaterialShapeDrawable materialShapeDrawable2 = this.d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(aVar);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.q;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(aVar);
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.p;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setShapeAppearanceModel(aVar);
        }
    }

    public void O(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            Z();
        }
    }

    public void P(int i) {
        if (i != this.g) {
            this.g = i;
            Z();
        }
    }

    public void Q(int i, int i2, int i3, int i4) {
        this.b.set(i, i2, i3, i4);
        U();
    }

    public final boolean R() {
        if (!this.f25166a.getPreventCornerOverlap() || e()) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        MaterialCardView materialCardView = this.f25166a;
        if (!materialCardView.getPreventCornerOverlap() || !e() || !materialCardView.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    public void T() {
        Drawable drawable;
        Drawable drawable2 = this.h;
        if (this.f25166a.isClickable()) {
            drawable = p();
        } else {
            drawable = this.d;
        }
        this.h = drawable;
        if (drawable2 != drawable) {
            W(drawable);
        }
    }

    public void U() {
        float f;
        if (R() || S()) {
            f = a();
        } else {
            f = 0.0f;
        }
        int r = (int) (f - r());
        Rect rect = this.b;
        this.f25166a.setAncestorContentPadding(rect.left + r, rect.top + r, rect.right + r, rect.bottom + r);
    }

    public void V() {
        this.c.V(this.f25166a.getCardElevation());
    }

    public final void W(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        MaterialCardView materialCardView = this.f25166a;
        if (i < 23 || !(materialCardView.getForeground() instanceof InsetDrawable)) {
            materialCardView.setForeground(z(drawable));
        } else {
            ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
        }
    }

    public void X() {
        boolean A = A();
        MaterialCardView materialCardView = this.f25166a;
        if (!A) {
            materialCardView.setBackgroundInternal(z(this.c));
        }
        materialCardView.setForeground(z(this.h));
    }

    public final void Y() {
        Drawable drawable;
        if (!zeo.USE_FRAMEWORK_RIPPLE || (drawable = this.n) == null) {
            MaterialShapeDrawable materialShapeDrawable = this.p;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.W(this.j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.j);
    }

    public void Z() {
        this.d.g0(this.g, this.m);
    }

    public final float a() {
        ju4 q = this.l.q();
        MaterialShapeDrawable materialShapeDrawable = this.c;
        return Math.max(Math.max(b(q, materialShapeDrawable.F()), b(this.l.s(), materialShapeDrawable.G())), Math.max(b(this.l.k(), materialShapeDrawable.t()), b(this.l.i(), materialShapeDrawable.s())));
    }

    public final float b(ju4 ju4Var, float f) {
        if (ju4Var instanceof tgo) {
            return (float) ((1.0d - u) * f);
        }
        if (ju4Var instanceof r25) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        float f;
        float maxCardElevation = this.f25166a.getMaxCardElevation();
        if (S()) {
            f = a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    public final float d() {
        float f;
        float maxCardElevation = this.f25166a.getMaxCardElevation() * 1.5f;
        if (S()) {
            f = a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    public final boolean e() {
        return this.c.P();
    }

    public final Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.i;
        if (drawable != null) {
            stateListDrawable.addState(t, drawable);
        }
        return stateListDrawable;
    }

    public final Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable i = i();
        this.p = i;
        i.W(this.j);
        stateListDrawable.addState(new int[]{16842919}, this.p);
        return stateListDrawable;
    }

    public final Drawable h() {
        if (!zeo.USE_FRAMEWORK_RIPPLE) {
            return g();
        }
        this.q = i();
        return new RippleDrawable(this.j, null, this.q);
    }

    public final MaterialShapeDrawable i() {
        return new MaterialShapeDrawable(this.l);
    }

    public void j() {
        Drawable drawable = this.n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public MaterialShapeDrawable k() {
        return this.c;
    }

    public ColorStateList l() {
        return this.c.x();
    }

    public ColorStateList m() {
        return this.d.x();
    }

    public Drawable n() {
        return this.i;
    }

    public ColorStateList o() {
        return this.k;
    }

    public final Drawable p() {
        if (this.n == null) {
            this.n = h();
        }
        if (this.o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, f()});
            this.o = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.o;
    }

    public float q() {
        return this.c.F();
    }

    public final float r() {
        MaterialCardView materialCardView = this.f25166a;
        if (!materialCardView.getPreventCornerOverlap() || !materialCardView.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - u) * materialCardView.getCardViewRadius());
    }

    public float s() {
        return this.c.y();
    }

    public ColorStateList t() {
        return this.j;
    }

    public com.google.android.material.shape.a u() {
        return this.l;
    }

    public int v() {
        ColorStateList colorStateList = this.m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList w() {
        return this.m;
    }

    public int x() {
        return this.g;
    }

    public Rect y() {
        return this.b;
    }

    public final Drawable z(Drawable drawable) {
        int i;
        int i2;
        if (this.f25166a.getUseCompatPadding()) {
            i = (int) Math.ceil(d());
            i2 = (int) Math.ceil(c());
        } else {
            i2 = 0;
            i = 0;
        }
        return new a(this, drawable, i2, i, i2, i);
    }
}
