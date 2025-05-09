package tb;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m6i {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f23811a;
    public a b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;

    public m6i(MaterialButton materialButton, a aVar) {
        this.f23811a = materialButton;
        this.b = aVar;
    }

    public final void A(a aVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(aVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(aVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(aVar);
        }
    }

    public void B(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i2 - this.d, i - this.f);
        }
    }

    public final void C() {
        int i;
        MaterialShapeDrawable d = d();
        MaterialShapeDrawable l = l();
        if (d != null) {
            d.g0(this.h, this.k);
            if (l != null) {
                float f = this.h;
                if (this.n) {
                    i = l7i.c(this.f23811a, R.attr.colorSurface);
                } else {
                    i = 0;
                }
                l.f0(f, i);
            }
        }
    }

    public final InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        int i;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.b);
        MaterialButton materialButton = this.f23811a;
        materialShapeDrawable.M(materialButton.getContext());
        DrawableCompat.setTintList(materialShapeDrawable, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            DrawableCompat.setTintMode(materialShapeDrawable, mode);
        }
        materialShapeDrawable.g0(this.h, this.k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.b);
        materialShapeDrawable2.setTint(0);
        float f = this.h;
        if (this.n) {
            i = l7i.c(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        materialShapeDrawable2.f0(f, i);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.b);
        this.m = materialShapeDrawable3;
        DrawableCompat.setTint(materialShapeDrawable3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(zeo.d(this.l), D(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.m);
        this.r = rippleDrawable;
        return rippleDrawable;
    }

    public int b() {
        return this.g;
    }

    public uhp c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (uhp) this.r.getDrawable(2);
        }
        return (uhp) this.r.getDrawable(1);
    }

    public MaterialShapeDrawable d() {
        return e(false);
    }

    public final MaterialShapeDrawable e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public ColorStateList f() {
        return this.l;
    }

    public a g() {
        return this.b;
    }

    public ColorStateList h() {
        return this.k;
    }

    public int i() {
        return this.h;
    }

    public ColorStateList j() {
        return this.j;
    }

    public PorterDuff.Mode k() {
        return this.i;
    }

    public final MaterialShapeDrawable l() {
        return e(true);
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.q;
    }

    public void o(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        int i = R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.g = dimensionPixelSize;
            u(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.i = ogw.i(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        MaterialButton materialButton = this.f23811a;
        this.j = u9i.a(materialButton.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.k = u9i.a(materialButton.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.l = u9i.a(materialButton.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        int paddingStart = ViewCompat.getPaddingStart(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            q();
        } else {
            materialButton.setInternalBackground(a());
            MaterialShapeDrawable d = d();
            if (d != null) {
                d.V(dimensionPixelSize2);
            }
        }
        ViewCompat.setPaddingRelative(materialButton, paddingStart + this.c, paddingTop + this.e, paddingEnd + this.d, paddingBottom + this.f);
    }

    public void p(int i) {
        if (d() != null) {
            d().setTint(i);
        }
    }

    public void q() {
        this.o = true;
        ColorStateList colorStateList = this.j;
        MaterialButton materialButton = this.f23811a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(this.i);
    }

    public void r(boolean z) {
        this.q = z;
    }

    public void s(int i) {
        if (!this.p || this.g != i) {
            this.g = i;
            this.p = true;
            u(this.b.w(i));
        }
    }

    public void t(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            MaterialButton materialButton = this.f23811a;
            if (materialButton.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) materialButton.getBackground()).setColor(zeo.d(colorStateList));
            }
        }
    }

    public void u(a aVar) {
        this.b = aVar;
        A(aVar);
    }

    public void v(boolean z) {
        this.n = z;
        C();
    }

    public void w(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    public void x(int i) {
        if (this.h != i) {
            this.h = i;
            C();
        }
    }

    public void y(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (d() != null) {
                DrawableCompat.setTintList(d(), this.j);
            }
        }
    }

    public void z(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (d() != null && this.i != null) {
                DrawableCompat.setTintMode(d(), this.i);
            }
        }
    }
}
