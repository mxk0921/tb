package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public int e = 0;
    public int f;

    public HeaderScrollingViewBehavior() {
    }

    public static int k(int i) {
        if (i == 0) {
            return BadgeDrawable.TOP_START;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void c(CoordinatorLayout coordinatorLayout, View view, int i) {
        View e = e(coordinatorLayout.getDependencies(view));
        if (e != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, e.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + e.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            int k = k(layoutParams.gravity);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.d;
            GravityCompat.apply(k, measuredWidth, measuredHeight, rect, rect2, i);
            int f = f(e);
            view.layout(rect2.left, rect2.top - f, rect2.right, rect2.bottom - f);
            this.e = rect2.top - e.getBottom();
            return;
        }
        super.c(coordinatorLayout, view, i);
        this.e = 0;
    }

    public abstract View e(List<View> list);

    public final int f(View view) {
        if (this.f == 0) {
            return 0;
        }
        float g = g(view);
        int i = this.f;
        return MathUtils.clamp((int) (g * i), 0, i);
    }

    public float g(View view) {
        return 1.0f;
    }

    public final int h() {
        return this.f;
    }

    public int i(View view) {
        return view.getMeasuredHeight();
    }

    public final int j() {
        return this.e;
    }

    public final void l(int i) {
        this.f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View e;
        int i5;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (e = e(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(e) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int i7 = (size + i(e)) - e.getMeasuredHeight();
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(i7, i5), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
