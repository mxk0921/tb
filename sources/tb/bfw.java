package tb;

import android.view.View;
import androidx.core.view.ViewCompat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class bfw {

    /* renamed from: a  reason: collision with root package name */
    public final View f16360a;
    public int b;
    public int c;
    public int d;

    public bfw(View view) {
        this.f16360a = view;
    }

    public void a() {
        int i = this.d;
        View view = this.f16360a;
        ViewCompat.offsetTopAndBottom(view, i - (view.getTop() - this.b));
        ViewCompat.offsetLeftAndRight(view, 0 - (view.getLeft() - this.c));
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public void d() {
        View view = this.f16360a;
        this.b = view.getTop();
        this.c = view.getLeft();
    }

    public boolean e(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
