package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import tb.bfw;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public bfw f5020a;
    public int b = 0;

    public ViewOffsetBehavior() {
    }

    public int a() {
        bfw bfwVar = this.f5020a;
        if (bfwVar != null) {
            return bfwVar.c();
        }
        return 0;
    }

    public int b() {
        return a();
    }

    public void c(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean d(int i) {
        bfw bfwVar = this.f5020a;
        if (bfwVar != null) {
            return bfwVar.e(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        c(coordinatorLayout, v, i);
        if (this.f5020a == null) {
            this.f5020a = new bfw(v);
        }
        this.f5020a.d();
        this.f5020a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.f5020a.e(i2);
        this.b = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
