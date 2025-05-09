package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import tb.zn8;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f5186a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f5187a;
        public final /* synthetic */ int b;
        public final /* synthetic */ zn8 c;

        public a(View view, int i, zn8 zn8Var) {
            this.f5187a = view;
            this.b = i;
            this.c = zn8Var;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view = this.f5187a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f5186a == this.b) {
                zn8 zn8Var = this.c;
                expandableBehavior.d((View) zn8Var, view, zn8Var.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public final boolean b(boolean z) {
        if (z) {
            int i = this.f5186a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f5186a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public zn8 c(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (zn8) view2;
            }
        }
        return null;
    }

    public abstract boolean d(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        zn8 zn8Var = (zn8) view2;
        if (!b(zn8Var.isExpanded())) {
            return false;
        }
        if (zn8Var.isExpanded()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f5186a = i;
        d((View) zn8Var, view, zn8Var.isExpanded(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        zn8 c;
        int i2;
        if (ViewCompat.isLaidOut(view) || (c = c(coordinatorLayout, view)) == null || !b(c.isExpanded())) {
            return false;
        }
        if (c.isExpanded()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f5186a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, c));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
