package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import tb.f7l;
import tb.hkt;
import tb.u9i;
import tb.xot;
import tb.ykt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BadgeDrawable extends Drawable implements ykt.b {
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    public static final int q = R.style.Widget_MaterialComponents_Badge;
    public static final int r = R.attr.badgeStyle;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f5021a;
    public final ykt c;
    public final float e;
    public final float f;
    public final float g;
    public final SavedState h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public float n;
    public WeakReference<View> o;
    public WeakReference<ViewGroup> p;
    public final Rect d = new Rect();
    public final MaterialShapeDrawable b = new MaterialShapeDrawable();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface BadgeGravity {
    }

    public BadgeDrawable(Context context) {
        this.f5021a = new WeakReference<>(context);
        xot.c(context);
        Resources resources = context.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.g = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        ykt yktVar = new ykt(this);
        this.c = yktVar;
        yktVar.e().setTextAlign(Paint.Align.CENTER);
        this.h = new SavedState(context);
        w(R.style.TextAppearance_MaterialComponents_Badge);
    }

    public static BadgeDrawable c(Context context) {
        return d(context, null, r, q);
    }

    public static BadgeDrawable d(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    public static BadgeDrawable e(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.o(savedState);
        return badgeDrawable;
    }

    public static int n(Context context, TypedArray typedArray, int i) {
        return u9i.a(context, typedArray, i).getDefaultColor();
    }

    public final void A() {
        this.k = ((int) Math.pow(10.0d, i() - 1.0d)) - 1;
    }

    @Override // tb.ykt.b
    public void a() {
        invalidateSelf();
    }

    public final void b(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        SavedState savedState = this.h;
        int i2 = savedState.badgeGravity;
        if (i2 == 8388691 || i2 == 8388693) {
            this.j = rect.bottom - savedState.verticalOffset;
        } else {
            this.j = rect.top + savedState.verticalOffset;
        }
        int j = j();
        float f3 = this.f;
        if (j <= 9) {
            if (!l()) {
                f3 = this.e;
            }
            this.l = f3;
            this.n = f3;
            this.m = f3;
        } else {
            this.l = f3;
            this.n = f3;
            this.m = (this.c.f(g()) / 2.0f) + this.g;
        }
        Resources resources = context.getResources();
        if (l()) {
            i = R.dimen.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = R.dimen.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int i3 = savedState.badgeGravity;
        if (i3 == 8388659 || i3 == 8388691) {
            if (ViewCompat.getLayoutDirection(view) == 0) {
                f = (rect.left - this.m) + dimensionPixelSize + savedState.horizontalOffset;
            } else {
                f = ((rect.right + this.m) - dimensionPixelSize) - savedState.horizontalOffset;
            }
            this.i = f;
            return;
        }
        if (ViewCompat.getLayoutDirection(view) == 0) {
            f2 = ((rect.right + this.m) - dimensionPixelSize) - savedState.horizontalOffset;
        } else {
            f2 = (rect.left - this.m) + dimensionPixelSize + savedState.horizontalOffset;
        }
        this.i = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (l()) {
                f(canvas);
            }
        }
    }

    public final void f(Canvas canvas) {
        Rect rect = new Rect();
        String g = g();
        ykt yktVar = this.c;
        yktVar.e().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.i, this.j + (rect.height() / 2), yktVar.e());
    }

    public final String g() {
        if (j() <= this.k) {
            return Integer.toString(j());
        }
        Context context = this.f5021a.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.k), f7l.PLUS);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.h.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean l = l();
        SavedState savedState = this.h;
        if (!l) {
            return savedState.contentDescriptionNumberless;
        }
        if (savedState.contentDescriptionQuantityStrings <= 0 || (context = this.f5021a.get()) == null) {
            return null;
        }
        if (j() <= this.k) {
            return context.getResources().getQuantityString(savedState.contentDescriptionQuantityStrings, j(), Integer.valueOf(j()));
        }
        return context.getString(savedState.contentDescriptionExceedsMaxBadgeNumberRes, Integer.valueOf(this.k));
    }

    public int i() {
        return this.h.maxCharacterCount;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        if (!l()) {
            return 0;
        }
        return this.h.number;
    }

    public SavedState k() {
        return this.h;
    }

    public boolean l() {
        if (this.h.number != -1) {
            return true;
        }
        return false;
    }

    public final void m(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = xot.h(context, attributeSet, R.styleable.Badge, i, i2, new int[0]);
        t(h.getInt(R.styleable.Badge_maxCharacterCount, 4));
        int i3 = R.styleable.Badge_number;
        if (h.hasValue(i3)) {
            u(h.getInt(i3, 0));
        }
        p(n(context, h, R.styleable.Badge_backgroundColor));
        int i4 = R.styleable.Badge_badgeTextColor;
        if (h.hasValue(i4)) {
            r(n(context, h, i4));
        }
        q(h.getInt(R.styleable.Badge_badgeGravity, TOP_END));
        s(h.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0));
        x(h.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0));
        h.recycle();
    }

    public final void o(SavedState savedState) {
        t(savedState.maxCharacterCount);
        if (savedState.number != -1) {
            u(savedState.number);
        }
        p(savedState.backgroundColor);
        r(savedState.badgeTextColor);
        q(savedState.badgeGravity);
        s(savedState.horizontalOffset);
        x(savedState.verticalOffset);
    }

    @Override // android.graphics.drawable.Drawable, tb.ykt.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i) {
        this.h.backgroundColor = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable.x() != valueOf) {
            materialShapeDrawable.W(valueOf);
            invalidateSelf();
        }
    }

    public void q(int i) {
        ViewGroup viewGroup;
        SavedState savedState = this.h;
        if (savedState.badgeGravity != i) {
            savedState.badgeGravity = i;
            WeakReference<View> weakReference = this.o;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.o.get();
                WeakReference<ViewGroup> weakReference2 = this.p;
                if (weakReference2 != null) {
                    viewGroup = weakReference2.get();
                } else {
                    viewGroup = null;
                }
                y(view, viewGroup);
            }
        }
    }

    public void r(int i) {
        this.h.badgeTextColor = i;
        ykt yktVar = this.c;
        if (yktVar.e().getColor() != i) {
            yktVar.e().setColor(i);
            invalidateSelf();
        }
    }

    public void s(int i) {
        this.h.horizontalOffset = i;
        z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.h.alpha = i;
        this.c.e().setAlpha(i);
        invalidateSelf();
    }

    public void t(int i) {
        SavedState savedState = this.h;
        if (savedState.maxCharacterCount != i) {
            savedState.maxCharacterCount = i;
            A();
            this.c.i(true);
            z();
            invalidateSelf();
        }
    }

    public void u(int i) {
        int max = Math.max(0, i);
        SavedState savedState = this.h;
        if (savedState.number != max) {
            savedState.number = max;
            this.c.i(true);
            z();
            invalidateSelf();
        }
    }

    public final void v(hkt hktVar) {
        Context context;
        ykt yktVar = this.c;
        if (yktVar.d() != hktVar && (context = this.f5021a.get()) != null) {
            yktVar.h(hktVar, context);
            z();
        }
    }

    public final void w(int i) {
        Context context = this.f5021a.get();
        if (context != null) {
            v(new hkt(context, i));
        }
    }

    public void x(int i) {
        this.h.verticalOffset = i;
        z();
    }

    public void y(View view, ViewGroup viewGroup) {
        this.o = new WeakReference<>(view);
        this.p = new WeakReference<>(viewGroup);
        z();
        invalidateSelf();
    }

    public final void z() {
        View view;
        Context context = this.f5021a.get();
        WeakReference<View> weakReference = this.o;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.d;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<ViewGroup> weakReference2 = this.p;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || a.USE_COMPAT_PARENT) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            b(context, rect3, view);
            a.f(rect2, this.i, this.j, this.m, this.n);
            float f = this.l;
            MaterialShapeDrawable materialShapeDrawable = this.b;
            materialShapeDrawable.U(f);
            if (!rect.equals(rect2)) {
                materialShapeDrawable.setBounds(rect2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private int alpha;
        private int backgroundColor;
        private int badgeGravity;
        private int badgeTextColor;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private int horizontalOffset;
        private int maxCharacterCount;
        private int number;
        private int verticalOffset;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.alpha = 255;
            this.number = -1;
            this.badgeTextColor = new hkt(context, R.style.TextAppearance_MaterialComponents_Badge).b.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.contentDescriptionQuantityStrings = R.plurals.mtrl_badge_content_description;
            this.contentDescriptionExceedsMaxBadgeNumberRes = R.string.mtrl_exceed_max_badge_number_content_description;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
            parcel.writeInt(this.horizontalOffset);
            parcel.writeInt(this.verticalOffset);
        }

        public SavedState(Parcel parcel) {
            this.alpha = 255;
            this.number = -1;
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
            this.horizontalOffset = parcel.readInt();
            this.verticalOffset = parcel.readInt();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
