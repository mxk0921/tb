package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class n5i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f24529a;
    public boolean f;
    public boolean g;
    public vqc m;
    public final Paint b = new Paint(1);
    public final float c = p1p.a(160.0f);
    public final float d = 0.4f;
    public final float e = 0.7f;
    public boolean h = true;
    public final boolean i = o4p.C1("sceneHeaderMaskPerf");
    public boolean j = true;
    public final int k = p1p.a(22.0f);
    public final DecelerateInterpolator l = new DecelerateInterpolator();

    static {
        t2o.a(815793433);
    }

    public n5i(View view) {
        ckf.g(view, "view");
        this.f24529a = view;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3082db93", new Object[]{this});
        } else if (this.h) {
            this.h = false;
            this.b.setAlpha((int) (this.l.getInterpolation(hfn.e((-this.f24529a.getTranslationY()) / this.k, 1.0f)) * 255));
            this.b.setShader(new LinearGradient(0.0f, -this.f24529a.getTranslationY(), 0.0f, (-this.f24529a.getTranslationY()) + this.c, Color.parseColor("#99000000"), 0, Shader.TileMode.CLAMP));
        }
    }

    public final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (c()) {
            a();
            canvas.drawRect(0.0f, -this.f24529a.getTranslationY(), this.f24529a.getMeasuredWidth(), (-this.f24529a.getTranslationY()) + this.c, this.b);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        if (!this.f || !this.g || this.j || !this.i) {
            return false;
        }
        return true;
    }

    public final void d(int i) {
        vqc vqcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3c9bc8", new Object[]{this, new Integer(i)});
            return;
        }
        ViewParent parent = this.f24529a.getParent();
        ckf.e(parent, "null cannot be cast to non-null type android.view.View");
        int measuredHeight = ((View) parent).getMeasuredHeight();
        boolean z = this.f;
        if (i >= this.e * measuredHeight) {
            this.f = true;
        }
        if (z != this.f) {
            this.f24529a.invalidate();
        }
        if (c() && (vqcVar = this.m) != null) {
            vqcVar.a();
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8d89bb", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0fc654", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void g(vqc vqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82ce75e", new Object[]{this, vqcVar});
        } else {
            this.m = vqcVar;
        }
    }

    public final void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db2b29", new Object[]{this, new Float(f)});
            return;
        }
        this.h = true;
        float f2 = this.d;
        if (f > 1.0f - f2) {
            this.f24529a.setAlpha(1.0f);
        } else {
            this.f24529a.setAlpha(f / (1.0f - f2));
        }
        this.f24529a.invalidate();
    }
}
