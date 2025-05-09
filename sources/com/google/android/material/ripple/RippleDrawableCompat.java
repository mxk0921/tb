package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import tb.uhp;
import tb.zeo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RippleDrawableCompat extends Drawable implements uhp, TintAwareDrawable {

    /* renamed from: a  reason: collision with root package name */
    public b f5114a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final MaterialShapeDrawable f5115a;
        public boolean b;

        public b(b bVar) {
            this.f5115a = (MaterialShapeDrawable) bVar.f5115a.getConstantState().newDrawable();
            this.b = bVar.b;
        }

        /* renamed from: a */
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public RippleDrawableCompat a() {
        this.f5114a = new b(this.f5114a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f5114a;
        if (bVar.b) {
            bVar.f5115a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5114a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        this.f5114a.f5115a.getClass();
        return -3;
    }

    @Override // tb.uhp
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.f5114a.f5115a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5114a.f5115a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f5114a.f5115a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = zeo.e(iArr);
        b bVar = this.f5114a;
        if (bVar.b == e) {
            return onStateChange;
        }
        bVar.b = e;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5114a.f5115a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5114a.f5115a.setColorFilter(colorFilter);
    }

    @Override // tb.uhp
    public void setShapeAppearanceModel(com.google.android.material.shape.a aVar) {
        this.f5114a.f5115a.setShapeAppearanceModel(aVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        this.f5114a.f5115a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5114a.f5115a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5114a.f5115a.setTintMode(mode);
    }

    public RippleDrawableCompat(b bVar) {
        this.f5114a = bVar;
    }
}
