package tb;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ao8 {

    /* renamed from: a  reason: collision with root package name */
    public final View f15896a;
    public boolean b = false;
    public int c = 0;

    public ao8(zn8 zn8Var) {
        this.f15896a = (View) zn8Var;
    }

    public final void a() {
        View view = this.f15896a;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
        }
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(Bundle bundle) {
        this.b = bundle.getBoolean(mop.KEY_HEADER_EXPANDED, false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(mop.KEY_HEADER_EXPANDED, this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public boolean f(boolean z) {
        if (this.b == z) {
            return false;
        }
        this.b = z;
        a();
        return true;
    }

    public void g(int i) {
        this.c = i;
    }
}
